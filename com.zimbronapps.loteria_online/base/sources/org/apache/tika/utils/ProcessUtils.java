package org.apache.tika.utils;

import B8.n;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ProcessUtils {
    private static final ConcurrentHashMap PROCESS_MAP = new ConcurrentHashMap();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new i()));
    }

    public static /* synthetic */ void a() {
        lambda$static$0();
    }

    public static String escapeCommandLine(String str) {
        if (str == null) {
            return str;
        }
        if (!str.contains(" ") || !SystemUtils.IS_OS_WINDOWS || str.startsWith("\"") || str.endsWith("\"")) {
            return str;
        }
        return "\"" + str + "\"";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.tika.utils.FileProcessResult execute(java.lang.ProcessBuilder r11, long r12, int r14, int r15) throws java.io.IOException {
        /*
            java.lang.String r0 = "\n"
            r1 = 0
            java.lang.Process r11 = r11.start()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = register(r11)     // Catch: java.lang.Throwable -> L6f
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6f
            org.apache.tika.utils.StreamGobbler r4 = new org.apache.tika.utils.StreamGobbler     // Catch: java.lang.Throwable -> L6f
            java.io.InputStream r5 = r11.getInputStream()     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5, r14)     // Catch: java.lang.Throwable -> L6f
            org.apache.tika.utils.StreamGobbler r14 = new org.apache.tika.utils.StreamGobbler     // Catch: java.lang.Throwable -> L6f
            java.io.InputStream r5 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L6f
            r14.<init>(r5, r15)     // Catch: java.lang.Throwable -> L6f
            java.lang.Thread r15 = new java.lang.Thread     // Catch: java.lang.Throwable -> L6f
            r15.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r15.start()     // Catch: java.lang.Throwable -> L6f
            java.lang.Thread r5 = new java.lang.Thread     // Catch: java.lang.Throwable -> L6f
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L6f
            r5.start()     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            r7 = -1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            boolean r6 = org.apache.tika.parser.external.a.a(r11, r12, r9)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            long r7 = r12 - r2
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L51
            int r2 = r11.exitValue()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            r15.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            r5.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            goto L68
        L4f:
            r12 = move-exception
            goto L74
        L51:
            org.apache.tika.fork.c.a(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            r15.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            r5.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            r12 = 500(0x1f4, double:2.47E-321)
            boolean r12 = org.apache.tika.parser.external.a.a(r11, r12, r9)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L7b
            if (r12 == 0) goto L67
            int r2 = r11.exitValue()     // Catch: java.lang.Throwable -> L4f java.lang.IllegalThreadStateException -> L67 java.lang.InterruptedException -> L7b
            goto L68
        L67:
            r2 = -1
        L68:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6f
            r5.interrupt()     // Catch: java.lang.Throwable -> L6f
            goto L83
        L6f:
            r12 = move-exception
            r10 = r1
            r1 = r11
            r11 = r10
            goto Lc7
        L74:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6f
            r5.interrupt()     // Catch: java.lang.Throwable -> L6f
            throw r12     // Catch: java.lang.Throwable -> L6f
        L7b:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6f
            r5.interrupt()     // Catch: java.lang.Throwable -> L6f
            r2 = -1000(0xfffffffffffffc18, float:NaN)
        L83:
            org.apache.tika.utils.FileProcessResult r12 = new org.apache.tika.utils.FileProcessResult     // Catch: java.lang.Throwable -> L6f
            r12.<init>()     // Catch: java.lang.Throwable -> L6f
            r12.processTimeMillis = r7     // Catch: java.lang.Throwable -> L6f
            long r7 = r14.getStreamLength()     // Catch: java.lang.Throwable -> L6f
            r12.stderrLength = r7     // Catch: java.lang.Throwable -> L6f
            long r7 = r4.getStreamLength()     // Catch: java.lang.Throwable -> L6f
            r12.stdoutLength = r7     // Catch: java.lang.Throwable -> L6f
            r13 = r6 ^ 1
            r12.isTimeout = r13     // Catch: java.lang.Throwable -> L6f
            r12.exitValue = r2     // Catch: java.lang.Throwable -> L6f
            java.util.List r13 = r4.getLines()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = org.apache.tika.utils.StringUtils.joinWith(r0, r13)     // Catch: java.lang.Throwable -> L6f
            r12.stdout = r13     // Catch: java.lang.Throwable -> L6f
            java.util.List r13 = r14.getLines()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = org.apache.tika.utils.StringUtils.joinWith(r0, r13)     // Catch: java.lang.Throwable -> L6f
            r12.stderr = r13     // Catch: java.lang.Throwable -> L6f
            boolean r13 = r4.getIsTruncated()     // Catch: java.lang.Throwable -> L6f
            r12.stdoutTruncated = r13     // Catch: java.lang.Throwable -> L6f
            boolean r13 = r14.getIsTruncated()     // Catch: java.lang.Throwable -> L6f
            r12.stderrTruncated = r13     // Catch: java.lang.Throwable -> L6f
            org.apache.tika.fork.c.a(r11)
            if (r1 == 0) goto Lc4
            release(r1)
        Lc4:
            return r12
        Lc5:
            r12 = move-exception
            r11 = r1
        Lc7:
            if (r1 == 0) goto Lcc
            org.apache.tika.fork.c.a(r1)
        Lcc:
            if (r11 == 0) goto Ld1
            release(r11)
        Ld1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.utils.ProcessUtils.execute(java.lang.ProcessBuilder, long, int, int):org.apache.tika.utils.FileProcessResult");
    }

    private static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new h());
    }

    private static String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    private static Process release(String str) {
        return (Process) PROCESS_MAP.remove(str);
    }

    public static String unescapeCommandLine(String str) {
        return (str.contains(" ") && SystemUtils.IS_OS_WINDOWS && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j, Path path, int i) throws IOException {
        String str;
        boolean z;
        int i2;
        if (!Jb.c.a(f.a(path), new LinkOption[0])) {
            n.a(f.a(path), new FileAttribute[0]);
        }
        g.a(processBuilder, org.apache.tika.fork.b.a(path));
        String str2 = null;
        try {
            String start = processBuilder.start();
            try {
                str2 = register(start);
                long currentTimeMillis = System.currentTimeMillis();
                StreamGobbler streamGobbler = new StreamGobbler(start.getErrorStream(), i);
                Thread thread = new Thread(streamGobbler);
                thread.start();
                long j2 = -1;
                try {
                    z = org.apache.tika.parser.external.a.a(start, j, TimeUnit.MILLISECONDS);
                    try {
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                        if (z) {
                            i2 = start.exitValue();
                            thread.join(1000L);
                        } else {
                            org.apache.tika.fork.c.a(start);
                            thread.join(1000L);
                            i2 = -1;
                        }
                    } catch (InterruptedException unused) {
                        i2 = -1000;
                        FileProcessResult fileProcessResult = new FileProcessResult();
                        fileProcessResult.processTimeMillis = j2;
                        fileProcessResult.stderrLength = streamGobbler.getStreamLength();
                        fileProcessResult.stdoutLength = org.apache.tika.io.e.a(path);
                        fileProcessResult.isTimeout = !z;
                        fileProcessResult.exitValue = i2;
                        fileProcessResult.stdout = "";
                        fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                        fileProcessResult.stdoutTruncated = false;
                        fileProcessResult.stderrTruncated = streamGobbler.getIsTruncated();
                        org.apache.tika.fork.c.a(start);
                        release(str2);
                        return fileProcessResult;
                    }
                } catch (InterruptedException unused2) {
                    z = false;
                }
                FileProcessResult fileProcessResult2 = new FileProcessResult();
                fileProcessResult2.processTimeMillis = j2;
                fileProcessResult2.stderrLength = streamGobbler.getStreamLength();
                fileProcessResult2.stdoutLength = org.apache.tika.io.e.a(path);
                fileProcessResult2.isTimeout = !z;
                fileProcessResult2.exitValue = i2;
                fileProcessResult2.stdout = "";
                fileProcessResult2.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                fileProcessResult2.stdoutTruncated = false;
                fileProcessResult2.stderrTruncated = streamGobbler.getIsTruncated();
                org.apache.tika.fork.c.a(start);
                release(str2);
                return fileProcessResult2;
            } catch (Throwable th) {
                th = th;
                String str3 = str2;
                str2 = start;
                str = str3;
                if (str2 != null) {
                    org.apache.tika.fork.c.a(str2);
                }
                release(str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
    }
}
