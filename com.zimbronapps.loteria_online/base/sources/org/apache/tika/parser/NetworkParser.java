package org.apache.tika.parser;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.TaggedContentHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.apache.tika.utils.XMLReaderUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import zb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NetworkParser implements Parser {
    private final Set supportedTypes;
    private final URI uri;

    public class 1 extends FilterOutputStream {
        final /* synthetic */ Socket val$socket;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OutputStream outputStream, Socket socket) {
            super(outputStream);
            this.val$socket = socket;
        }

        public void close() throws IOException {
            this.val$socket.shutdownOutput();
        }
    }

    public static class MetaHandler extends DefaultHandler {
        private final Metadata metadata;

        public MetaHandler(Metadata metadata) {
            this.metadata = metadata;
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if ("http://www.w3.org/1999/xhtml".equals(str) && "meta".equals(str2)) {
                String value = attributes.getValue("", "name");
                String value2 = attributes.getValue("", "content");
                if (value == null || value2 == null) {
                    return;
                }
                this.metadata.add(value, value2);
            }
        }
    }

    public static class ParsingTask implements Runnable {
        private volatile Exception exception = null;
        private final TikaInputStream input;
        private final OutputStream output;

        public ParsingTask(TikaInputStream tikaInputStream, OutputStream outputStream) {
            this.input = tikaInputStream;
            this.output = outputStream;
        }

        public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
            Thread thread = new Thread(this, "Tika network parser");
            thread.start();
            ContentHandler taggedContentHandler = new TaggedContentHandler(contentHandler);
            try {
                try {
                    try {
                        XMLReaderUtils.parseSAX(inputStream, (ContentHandler) new TeeContentHandler(taggedContentHandler, new MetaHandler(metadata)), parseContext);
                        try {
                            thread.join(1000L);
                            if (this.exception == null) {
                                return;
                            }
                            this.input.throwIfCauseOf(this.exception);
                            throw new TikaException("Unexpected network parser error", this.exception);
                        } catch (InterruptedException e) {
                            throw new TikaException("Network parser interrupted", e);
                        }
                    } catch (SAXException e2) {
                        taggedContentHandler.throwIfCauseOf(e2);
                        throw new TikaException("Invalid network parser output", e2);
                    }
                } catch (IOException e3) {
                    throw new TikaException("Unable to read network parser output", e3);
                }
            } catch (Throwable th) {
                try {
                    thread.join(1000L);
                    if (this.exception == null) {
                        throw th;
                    }
                    this.input.throwIfCauseOf(this.exception);
                    throw new TikaException("Unexpected network parser error", this.exception);
                } catch (InterruptedException e4) {
                    throw new TikaException("Network parser interrupted", e4);
                }
            }
        }

        public void run() {
            try {
                try {
                    g.n(this.input, this.output);
                    this.output.close();
                } catch (Throwable th) {
                    this.output.close();
                    throw th;
                }
            } catch (Exception e) {
                this.exception = e;
            }
        }
    }

    public NetworkParser(URI uri, Set set) {
        this.uri = uri;
        this.supportedTypes = set;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.supportedTypes;
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            parse(TikaInputStream.get(inputStream, temporaryResources, metadata), contentHandler, metadata, parseContext);
        } finally {
            temporaryResources.dispose();
        }
    }

    public NetworkParser(URI uri) {
        this(uri, Collections.singleton(MediaType.OCTET_STREAM));
    }

    private void parse(TikaInputStream tikaInputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        if ("telnet".equals(this.uri.getScheme())) {
            Socket socket = new Socket(this.uri.getHost(), this.uri.getPort());
            try {
                new ParsingTask(tikaInputStream, new 1(socket.getOutputStream(), socket)).parse(socket.getInputStream(), contentHandler, metadata, parseContext);
                socket.close();
                return;
            } catch (Throwable th) {
                try {
                    socket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        URLConnection openConnection = this.uri.toURL().openConnection();
        openConnection.setDoOutput(true);
        openConnection.connect();
        InputStream inputStream = openConnection.getInputStream();
        try {
            new ParsingTask(tikaInputStream, openConnection.getOutputStream()).parse(Db.a.a(inputStream), contentHandler, metadata, parseContext);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
