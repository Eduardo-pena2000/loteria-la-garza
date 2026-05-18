package org.apache.tika.parser;

import com.applovin.shadow.okio.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.Executor;
import org.apache.tika.exception.ZeroByteFileException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.BodyContentHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParsingReader extends Reader {
    private final ParseContext context;
    private final Metadata metadata;
    private final Parser parser;
    private final Reader reader;
    private final InputStream stream;
    private transient Throwable throwable;
    private final Writer writer;

    public class ParsingTask implements Runnable {
        public /* synthetic */ ParsingTask(ParsingReader parsingReader, e eVar) {
            this();
        }

        public void run() {
            try {
                ParsingReader.d(ParsingReader.this).parse(ParsingReader.f(ParsingReader.this), new BodyContentHandler(ParsingReader.h(ParsingReader.this)), ParsingReader.c(ParsingReader.this), ParsingReader.b(ParsingReader.this));
            } catch (Throwable th) {
                ParsingReader.k(ParsingReader.this, th);
            }
            try {
                ParsingReader.f(ParsingReader.this).close();
            } catch (Throwable th2) {
                if (ParsingReader.g(ParsingReader.this) == null) {
                    ParsingReader.k(ParsingReader.this, th2);
                }
            }
            try {
                ParsingReader.h(ParsingReader.this).close();
            } catch (Throwable th3) {
                if (ParsingReader.g(ParsingReader.this) == null) {
                    ParsingReader.k(ParsingReader.this, th3);
                }
            }
        }

        private ParsingTask() {
        }
    }

    public ParsingReader(InputStream inputStream) throws IOException {
        this(new AutoDetectParser(), inputStream, new Metadata(), new ParseContext());
        this.context.set(Parser.class, this.parser);
    }

    public static /* synthetic */ void a(Metadata metadata, Runnable runnable) {
        lambda$new$0(metadata, runnable);
    }

    public static /* bridge */ /* synthetic */ ParseContext b(ParsingReader parsingReader) {
        return parsingReader.context;
    }

    public static /* bridge */ /* synthetic */ Metadata c(ParsingReader parsingReader) {
        return parsingReader.metadata;
    }

    public static /* bridge */ /* synthetic */ Parser d(ParsingReader parsingReader) {
        return parsingReader.parser;
    }

    public static /* bridge */ /* synthetic */ InputStream f(ParsingReader parsingReader) {
        return parsingReader.stream;
    }

    public static /* bridge */ /* synthetic */ Throwable g(ParsingReader parsingReader) {
        return parsingReader.throwable;
    }

    private static Metadata getMetadata(String str) {
        Metadata metadata = new Metadata();
        if (str != null && str.length() > 0) {
            metadata.set("resourceName", str);
        }
        return metadata;
    }

    public static /* bridge */ /* synthetic */ Writer h(ParsingReader parsingReader) {
        return parsingReader.writer;
    }

    public static /* bridge */ /* synthetic */ void k(ParsingReader parsingReader, Throwable th) {
        parsingReader.throwable = th;
    }

    private static /* synthetic */ void lambda$new$0(Metadata metadata, Runnable runnable) {
        String str;
        String str2 = metadata.get("resourceName");
        if (str2 != null) {
            str = "Apache Tika: " + str2;
        } else {
            str = "Apache Tika";
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        thread.start();
    }

    public void close() throws IOException {
        this.reader.close();
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        IOException iOException = this.throwable;
        if (iOException instanceof ZeroByteFileException) {
            return -1;
        }
        if (iOException instanceof IOException) {
            throw iOException;
        }
        if (iOException == null) {
            return this.reader.read(cArr, i, i2);
        }
        throw new IOException("", this.throwable);
    }

    public ParsingReader(InputStream inputStream, String str) throws IOException {
        this(new AutoDetectParser(), inputStream, getMetadata(str), new ParseContext());
        this.context.set(Parser.class, this.parser);
    }

    public ParsingReader(Path path) throws IOException {
        this(q.a(path, new OpenOption[0]), org.apache.tika.detect.b.a(org.apache.tika.io.f.a(path)));
    }

    public ParsingReader(File file) throws FileNotFoundException, IOException {
        this(new FileInputStream(file), file.getName());
    }

    public ParsingReader(Parser parser, InputStream inputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        this(parser, inputStream, metadata, parseContext, new d(metadata));
    }

    public ParsingReader(Parser parser, InputStream inputStream, Metadata metadata, ParseContext parseContext, Executor executor) throws IOException {
        this.parser = parser;
        PipedReader pipedReader = new PipedReader();
        BufferedReader bufferedReader = new BufferedReader(pipedReader);
        this.reader = bufferedReader;
        try {
            this.writer = new PipedWriter(pipedReader);
            this.stream = inputStream;
            this.metadata = metadata;
            this.context = parseContext;
            executor.execute(new ParsingTask(this, null));
            bufferedReader.mark(1);
            bufferedReader.read();
            bufferedReader.reset();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
