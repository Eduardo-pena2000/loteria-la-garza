package org.apache.tika.fork;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ForkParser implements Parser, Closeable {
    private static final long serialVersionUID = -4962742892274663950L;
    private int currentlyInUse;
    private List java;
    private final ClassLoader loader;

    @Field
    private int maxFilesProcessedPerClient;
    private final Parser parser;
    private final ParserFactoryFactory parserFactoryFactory;
    private final Queue pool;

    @Field
    private int poolSize;

    @Field
    private long serverParseTimeoutMillis;

    @Field
    private long serverPulseMillis;

    @Field
    private long serverWaitTimeoutMillis;
    private final Path tikaBin;

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory) {
        this.pool = new LinkedList();
        this.java = Arrays.asList(new String[]{"java", "-Xmx32m", "-Djava.awt.headless=true"});
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.loader = null;
        this.parser = null;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    private synchronized ForkClient acquireClient() throws IOException, TikaException {
        ForkClient forkClient;
        while (true) {
            try {
                forkClient = (ForkClient) this.pool.poll();
                if (forkClient == null && this.currentlyInUse < this.poolSize) {
                    forkClient = newClient();
                }
                if (forkClient != null && !forkClient.ping()) {
                    forkClient.close();
                    forkClient = null;
                }
                if (forkClient != null) {
                    this.currentlyInUse++;
                } else if (this.currentlyInUse >= this.poolSize) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new TikaException("Interrupted while waiting for a fork parser", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return forkClient;
    }

    private ForkClient newClient() throws IOException, TikaException {
        TimeoutLimits timeoutLimits = new TimeoutLimits(this.serverPulseMillis, this.serverParseTimeoutMillis, this.serverWaitTimeoutMillis);
        ClassLoader classLoader = this.loader;
        if (classLoader == null && this.parser == null && this.tikaBin != null && this.parserFactoryFactory != null) {
            return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.java, timeoutLimits);
        }
        if (classLoader != null && this.parser != null && this.tikaBin == null && this.parserFactoryFactory == null) {
            return new ForkClient(this.loader, this.parser, this.java, timeoutLimits);
        }
        if (classLoader == null || this.parser != null || this.tikaBin == null || this.parserFactoryFactory == null) {
            throw new IllegalStateException("Unexpected combination of state items");
        }
        return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.loader, this.java, timeoutLimits);
    }

    private synchronized void releaseClient(ForkClient forkClient, boolean z) {
        try {
            int i = this.currentlyInUse - 1;
            this.currentlyInUse = i;
            if (i + this.pool.size() >= this.poolSize || !z) {
                forkClient.close();
            } else {
                if (this.maxFilesProcessedPerClient <= 0 || forkClient.getFilesProcessed() < this.maxFilesProcessedPerClient) {
                    this.pool.offer(forkClient);
                } else {
                    forkClient.close();
                }
                notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void close() {
        try {
            Iterator it = this.pool.iterator();
            while (it.hasNext()) {
                ((ForkClient) it.next()).close();
            }
            this.pool.clear();
            this.poolSize = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List getJavaCommandAsList() {
        return Collections.unmodifiableList(this.java);
    }

    public synchronized int getPoolSize() {
        return this.poolSize;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        boolean z = false;
        if (inputStream == null) {
            throw new NullPointerException("null stream");
        }
        ForkClient acquireClient = acquireClient();
        try {
            try {
                if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
                    contentHandler = new TeeContentHandler(contentHandler, new MetadataContentHandler(metadata));
                }
                TikaException call = acquireClient.call("parse", inputStream, contentHandler, metadata, parseContext);
                releaseClient(acquireClient, true);
                if (call instanceof IOException) {
                    throw ((IOException) call);
                }
                if (call instanceof SAXException) {
                    throw ((SAXException) call);
                }
                if (call instanceof TikaException) {
                    throw call;
                }
                if (call != null) {
                    throw new TikaException("Unexpected error in forked server process", call);
                }
            } catch (TikaException e) {
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    releaseClient(acquireClient, z);
                    throw th;
                }
            } catch (IOException e2) {
                throw new TikaException("Failed to communicate with a forked parser process. The process has most likely crashed due to some error like running out of memory. A new process will be started for the next parsing request.", e2);
            }
        } catch (Throwable th2) {
            th = th2;
            releaseClient(acquireClient, z);
            throw th;
        }
    }

    public void setJavaCommand(List list) {
        this.java = new ArrayList(list);
    }

    public void setMaxFilesProcessedPerServer(int i) {
        this.maxFilesProcessedPerClient = i;
    }

    public synchronized void setPoolSize(int i) {
        this.poolSize = i;
    }

    public void setServerParseTimeoutMillis(long j) {
        this.serverParseTimeoutMillis = j;
    }

    public void setServerPulseMillis(long j) {
        this.serverPulseMillis = j;
    }

    public void setServerWaitTimeoutMillis(long j) {
        this.serverWaitTimeoutMillis = j;
    }

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory, ClassLoader classLoader) {
        this.pool = new LinkedList();
        this.java = Arrays.asList(new String[]{"java", "-Xmx32m", "-Djava.awt.headless=true"});
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.parser = null;
        this.loader = classLoader;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    public ForkParser(ClassLoader classLoader, Parser parser) {
        this.pool = new LinkedList();
        this.java = Arrays.asList(new String[]{"java", "-Xmx32m", "-Djava.awt.headless=true"});
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        if (!(parser instanceof ForkParser)) {
            this.tikaBin = null;
            this.parserFactoryFactory = null;
            this.loader = classLoader;
            this.parser = parser;
            return;
        }
        throw new IllegalArgumentException("The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation.");
    }

    public ForkParser(ClassLoader classLoader) {
        this(classLoader, new AutoDetectParser());
    }

    public ForkParser() {
        this(ForkParser.class.getClassLoader());
    }
}
