package org.apache.tika.parser.external;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.XHTMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import zb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExternalParser implements Parser {
    public static final String INPUT_FILE_TOKEN = "${INPUT}";
    private static final Wb.c LOG = Wb.e.l(ExternalParser.class);
    public static final String OUTPUT_FILE_TOKEN = "${OUTPUT}";
    private static final long serialVersionUID = -1079128990650687037L;
    private final long timeoutMs = 60000;
    private Set supportedTypes = Collections.emptySet();
    private Map metadataPatterns = null;
    private String[] command = {"cat"};
    private LineConsumer ignoredLineConsumer = LineConsumer.NULL;

    public interface LineConsumer extends Serializable {
        public static final LineConsumer NULL = new e();

        private static /* synthetic */ void lambda$static$e2402a94$1(String str) {
        }

        static /* synthetic */ void m(String str) {
            lambda$static$e2402a94$1(str);
        }

        void consume(String str);
    }

    public static /* synthetic */ void a(InputStream inputStream) {
        lambda$ignoreStream$0(inputStream);
    }

    public static /* synthetic */ void b(Process process, InputStream inputStream) {
        lambda$sendInput$1(process, inputStream);
    }

    public static /* synthetic */ void c(ExternalParser externalParser, InputStream inputStream, Metadata metadata) {
        externalParser.lambda$extractMetadata$2(inputStream, metadata);
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private void extractMetadata(InputStream inputStream, Metadata metadata) {
        Thread thread = new Thread(new c(this, inputStream, metadata));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    private void extractOutput(InputStream inputStream, XHTMLContentHandler xHTMLContentHandler) throws SAXException, IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try {
            xHTMLContentHandler.startDocument();
            xHTMLContentHandler.startElement("p");
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    xHTMLContentHandler.endElement("p");
                    xHTMLContentHandler.endDocument();
                    inputStreamReader.close();
                    return;
                }
                xHTMLContentHandler.characters(cArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void ignoreStream(InputStream inputStream) {
        ignoreStream(inputStream, true);
    }

    private /* synthetic */ void lambda$extractMetadata$2(InputStream inputStream, Metadata metadata) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                boolean z = false;
                for (Map.Entry entry : this.metadataPatterns.entrySet()) {
                    Matcher matcher = ((Pattern) entry.getKey()).matcher(readLine);
                    if (matcher.find()) {
                        if (entry.getValue() == null || ((String) entry.getValue()).equals("")) {
                            metadata.add(matcher.group(1), matcher.group(2));
                        } else {
                            metadata.add((String) entry.getValue(), matcher.group(1));
                        }
                        z = true;
                    }
                }
                if (!z) {
                    this.ignoredLineConsumer.consume(readLine);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                g.m(bufferedReader);
                g.k(inputStream);
                throw th;
            }
        }
        g.m(bufferedReader);
        g.k(inputStream);
    }

    private static /* synthetic */ void lambda$ignoreStream$0(InputStream inputStream) {
        try {
            g.n(inputStream, Eb.b.a);
        } catch (IOException unused) {
        } catch (Throwable th) {
            g.k(inputStream);
            throw th;
        }
        g.k(inputStream);
    }

    private static /* synthetic */ void lambda$sendInput$1(Process process, InputStream inputStream) {
        try {
            g.n(inputStream, process.getOutputStream());
        } catch (IOException unused) {
        }
    }

    private void sendInput(Process process, InputStream inputStream) {
        Thread thread = new Thread(new d(process, inputStream));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException unused) {
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public LineConsumer getIgnoredLineConsumer() {
        return this.ignoredLineConsumer;
    }

    public Map getMetadataExtractionPatterns() {
        return this.metadataPatterns;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return getSupportedTypes();
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        XHTMLContentHandler xHTMLContentHandler = new XHTMLContentHandler(contentHandler, metadata);
        TemporaryResources temporaryResources = new TemporaryResources();
        try {
            parse(TikaInputStream.get(inputStream, temporaryResources, metadata), xHTMLContentHandler, metadata, temporaryResources);
        } finally {
            temporaryResources.dispose();
        }
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setIgnoredLineConsumer(LineConsumer lineConsumer) {
        this.ignoredLineConsumer = lineConsumer;
    }

    public void setMetadataExtractionPatterns(Map map) {
        this.metadataPatterns = map;
    }

    public void setSupportedTypes(Set set) {
        this.supportedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean check(java.lang.String[] r8, int... r9) {
        /*
            int r0 = r9.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
            int[] r9 = new int[r1]
            r0 = 127(0x7f, float:1.78E-43)
            r9[r2] = r0
        Lb:
            r0 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Process r0 = r3.exec(r8)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.io.InputStream r3 = r0.getErrorStream()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Thread r3 = ignoreStream(r3, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Thread r4 = ignoreStream(r4, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r3.join()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4.join()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = org.apache.tika.parser.external.a.a(r0, r4, r3)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            if (r3 == 0) goto L66
            int r3 = r0.exitValue()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            Wb.c r4 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.String r5 = "exit value for {}: {}"
            r6 = r8[r2]     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r4.b(r5, r6, r7)     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            int r4 = r9.length     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r5 = r2
        L48:
            if (r5 >= r4) goto L62
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            if (r3 != r6) goto L52
            org.apache.tika.fork.c.a(r0)
            return r2
        L52:
            int r5 = r5 + 1
            goto L48
        L55:
            r8 = move-exception
            goto Lc8
        L58:
            r9 = move-exception
            goto L6c
        L5a:
            r8 = move-exception
            goto La9
        L5c:
            r9 = move-exception
            goto Laa
        L5e:
            r9 = move-exception
            goto Laa
        L60:
            r9 = move-exception
            goto Laa
        L62:
            org.apache.tika.fork.c.a(r0)
            return r1
        L66:
            java.util.concurrent.TimeoutException r9 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
            throw r9     // Catch: java.lang.Throwable -> L55 java.lang.Error -> L58 java.lang.SecurityException -> L5a java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.io.IOException -> L60
        L6c:
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto La8
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "posix_spawn"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L8a
            java.lang.String r1 = r9.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "UNIXProcess"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto La8
        L8a:
            Wb.c r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "(TIKA-1526): exception trying to run: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            r3.append(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r1.v(r8, r9)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto La7
            org.apache.tika.fork.c.a(r0)
        La7:
            return r2
        La8:
            throw r9     // Catch: java.lang.Throwable -> L55
        La9:
            throw r8     // Catch: java.lang.Throwable -> L55
        Laa:
            Wb.c r1 = org.apache.tika.parser.external.ExternalParser.LOG     // Catch: java.lang.Throwable -> L55
            r8 = r8[r2]     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "exception trying to run  "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            r3.append(r8)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r1.v(r8, r9)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto Lc7
            org.apache.tika.fork.c.a(r0)
        Lc7:
            return r2
        Lc8:
            if (r0 == 0) goto Lcd
            org.apache.tika.fork.c.a(r0)
        Lcd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.external.ExternalParser.check(java.lang.String[], int[]):boolean");
    }

    private static Thread ignoreStream(InputStream inputStream, boolean z) {
        Thread thread = new Thread(new b(inputStream));
        thread.start();
        if (z) {
            try {
                thread.join();
            } catch (InterruptedException unused) {
            }
        }
        return thread;
    }

    public Set getSupportedTypes() {
        return this.supportedTypes;
    }

    private void parse(TikaInputStream tikaInputStream, XHTMLContentHandler xHTMLContentHandler, Metadata metadata, TemporaryResources temporaryResources) throws IOException, SAXException, TikaException {
        String[] strArr;
        Process exec;
        Map map = this.metadataPatterns;
        boolean z = (map == null || map.isEmpty()) ? false : true;
        String[] strArr2 = this.command;
        if (strArr2.length == 1) {
            strArr = strArr2[0].split(" ");
        } else {
            String[] strArr3 = new String[strArr2.length];
            System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
            strArr = strArr3;
        }
        Process process = null;
        boolean z2 = true;
        boolean z3 = true;
        File file = null;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("${INPUT}")) {
                strArr[i] = strArr[i].replace("${INPUT}", tikaInputStream.getFile().getPath());
                z2 = false;
            }
            if (strArr[i].contains("${OUTPUT}")) {
                file = temporaryResources.createTemporaryFile();
                strArr[i] = strArr[i].replace("${OUTPUT}", file.getPath());
                z3 = false;
            }
        }
        try {
            if (strArr.length == 1) {
                exec = Runtime.getRuntime().exec(strArr[0]);
            } else {
                exec = Runtime.getRuntime().exec(strArr);
            }
            process = exec;
        } catch (Exception e) {
            LOG.k("problem with process exec", e);
        }
        try {
            if (z2) {
                sendInput(process, tikaInputStream);
            } else {
                process.getOutputStream().close();
            }
            InputStream inputStream = process.getInputStream();
            InputStream errorStream = process.getErrorStream();
            if (z) {
                extractMetadata(errorStream, metadata);
                if (z3) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    extractMetadata(inputStream, metadata);
                }
            } else {
                ignoreStream(errorStream);
                if (z3) {
                    extractOutput(inputStream, xHTMLContentHandler);
                } else {
                    ignoreStream(inputStream);
                }
            }
            try {
                process.waitFor();
            } catch (InterruptedException unused) {
            }
            if (z3) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                extractOutput(fileInputStream, xHTMLContentHandler);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                process.waitFor();
            } catch (InterruptedException unused2) {
            }
            throw th3;
        }
    }
}
