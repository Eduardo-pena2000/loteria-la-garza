package org.apache.tika.parser.external2;

import Ib.a;
import Wb.c;
import Wb.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.EmptyParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.XHTMLContentHandler;
import org.apache.tika.utils.FileProcessResult;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExternalParser implements Parser, Initializable {
    public static final long DEFAULT_TIMEOUT_MS = 60000;
    public static final String INPUT_FILE_TOKEN = "${INPUT_FILE}";
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT_FILE}";
    private static Pattern INPUT_TOKEN_MATCHER = Pattern.compile("\\$\\{INPUT_FILE}");
    private static Pattern OUTPUT_TOKEN_MATCHER = Pattern.compile("\\$\\{OUTPUT_FILE}");
    private static final c LOG = e.l(ExternalParser.class);
    private Set supportedTypes = new HashSet();
    private List commandLine = new ArrayList();
    private Parser outputParser = EmptyParser.INSTANCE;
    private boolean returnStdout = false;
    private boolean returnStderr = true;
    private long timeoutMs = 60000;
    private int maxStdErr = 10000;
    private int maxStdOut = 10000;

    private void handleOutput(FileProcessResult fileProcessResult, Path path, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, ParseContext parseContext) throws SAXException, TikaException, IOException {
        if (this.outputParser == EmptyParser.INSTANCE) {
            if (path == null) {
                xHTMLContentHandler.characters(fileProcessResult.getStdout());
                return;
            }
            BufferedReader a = a.a(path);
            try {
                for (String readLine = a.readLine(); readLine != null; readLine = a.readLine()) {
                    xHTMLContentHandler.characters(readLine);
                    xHTMLContentHandler.newline();
                }
                a.close();
                return;
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (path != null) {
            InputStream inputStream = TikaInputStream.get(path);
            try {
                this.outputParser.parse(inputStream, new BodyContentHandler((ContentHandler) xHTMLContentHandler), metadata, parseContext);
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
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
        InputStream inputStream2 = TikaInputStream.get(fileProcessResult.getStdout().getBytes(StandardCharsets.UTF_8));
        try {
            this.outputParser.parse(inputStream2, new BodyContentHandler((ContentHandler) xHTMLContentHandler), metadata, parseContext);
            if (inputStream2 != null) {
                inputStream2.close();
            }
        } catch (Throwable th5) {
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        if (this.supportedTypes.size() == 0) {
            throw new TikaConfigException("supportedTypes size must be > 0");
        }
        if (this.commandLine.isEmpty()) {
            throw new TikaConfigException("commandLine is empty?!");
        }
        if (this.outputParser == EmptyParser.INSTANCE) {
            LOG.debug("no parser selected for the output; contents will be written to the content handler");
        }
    }

    public Parser getOutputParser() {
        return this.outputParser;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.supportedTypes;
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.io.InputStream r16, org.xml.sax.ContentHandler r17, org.apache.tika.metadata.Metadata r18, org.apache.tika.parser.ParseContext r19) throws java.io.IOException, org.xml.sax.SAXException, org.apache.tika.exception.TikaException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.external2.ExternalParser.parse(java.io.InputStream, org.xml.sax.ContentHandler, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):void");
    }

    @Field
    public void setCommandLine(List list) {
        this.commandLine = list;
    }

    @Field
    public void setMaxStdErr(int i) {
        this.maxStdErr = i;
    }

    @Field
    public void setMaxStdOut(int i) {
        this.maxStdOut = i;
    }

    @Field
    public void setOutputParser(Parser parser) {
        this.outputParser = parser;
    }

    @Field
    public void setReturnStderr(boolean z) {
        this.returnStderr = z;
    }

    @Field
    public void setReturnStdout(boolean z) {
        this.returnStdout = z;
    }

    @Field
    public void setSupportedTypes(List list) {
        if (this.supportedTypes.size() > 0) {
            throw new IllegalStateException("can't set supportedTypes after initialization");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.supportedTypes.add(MediaType.parse((String) it.next()));
        }
    }

    @Field
    public void setTimeoutMs(long j) {
        this.timeoutMs = j;
    }
}
