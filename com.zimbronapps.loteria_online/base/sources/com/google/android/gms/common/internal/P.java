package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p {
    public static final k b = new k("LibraryVersion", "");
    public static final p c = new p();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public static p a() {
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "LibraryVersion"
            java.lang.String r1 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.t.g(r9, r1)
            java.lang.String r1 = " version is "
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.util.concurrent.ConcurrentHashMap r3 = r8.a
            boolean r4 = r3.containsKey(r9)
            if (r4 == 0) goto L1a
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r4 = 0
            java.lang.String r5 = "/%s.properties"
            java.lang.Object[] r6 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.Class<com.google.android.gms.common.internal.p> r6 = com.google.android.gms.common.internal.p.class
            java.io.InputStream r5 = r6.getResourceAsStream(r5)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            if (r5 == 0) goto L6c
            r3.load(r5)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r6 = "version"
            java.lang.String r4 = r3.getProperty(r6, r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            com.google.android.gms.common.internal.k r3 = com.google.android.gms.common.internal.p.b     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r6 = r6 + 12
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.append(r9)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.append(r1)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r7.append(r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r3.h(r0, r1)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            goto Lb1
        L66:
            r9 = move-exception
            goto L8b
        L68:
            r1 = move-exception
            r3 = r4
            r4 = r5
            goto L91
        L6c:
            com.google.android.gms.common.internal.k r1 = com.google.android.gms.common.internal.p.b     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r3 = r3 + 43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r6.append(r2)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r6.append(r9)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r1.i(r0, r3)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            goto Lb1
        L8b:
            r4 = r5
            goto Lc7
        L8d:
            r9 = move-exception
            goto Lc7
        L8f:
            r1 = move-exception
            r3 = r4
        L91:
            com.google.android.gms.common.internal.k r5 = com.google.android.gms.common.internal.p.b     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L8d
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L8d
            int r6 = r6 + 43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r7.append(r2)     // Catch: java.lang.Throwable -> L8d
            r7.append(r9)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L8d
            r5.e(r0, r2, r1)     // Catch: java.lang.Throwable -> L8d
            r5 = r4
            r4 = r3
        Lb1:
            if (r5 == 0) goto Lb6
            E6.m.b(r5)
        Lb6:
            if (r4 != 0) goto Lc1
            com.google.android.gms.common.internal.k r1 = com.google.android.gms.common.internal.p.b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r1.b(r0, r2)
            java.lang.String r4 = "UNKNOWN"
        Lc1:
            java.util.concurrent.ConcurrentHashMap r0 = r8.a
            r0.put(r9, r4)
            return r4
        Lc7:
            if (r4 == 0) goto Lcc
            E6.m.b(r4)
        Lcc:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p.b(java.lang.String):java.lang.String");
    }
}
