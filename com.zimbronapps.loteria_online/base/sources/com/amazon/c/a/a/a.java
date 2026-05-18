package com.amazon.c.a.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    private static final String a = "com.amazon.content.id.";

    public static String a(JarFile jarFile) {
        String a2;
        if (jarFile == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        Enumeration entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry jarEntry = (JarEntry) entries.nextElement();
            if (!jarEntry.isDirectory() && (a2 = a(jarEntry.getName())) != null && a2.length() != 0) {
                return a2;
            }
        }
        return null;
    }

    public static boolean b(JarFile jarFile) throws IOException {
        if (jarFile == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        try {
            e(jarFile);
            return d(jarFile) != null;
        } catch (SecurityException unused) {
            return true;
        }
    }

    private static Certificate c(JarFile jarFile) {
        CodeSigner[] d = d(jarFile);
        if (d != null && d.length > 0) {
            List certificates = d[0].getSignerCertPath().getCertificates();
            if (!certificates.isEmpty()) {
                return (Certificate) certificates.get(0);
            }
        }
        return null;
    }

    private static CodeSigner[] d(JarFile jarFile) {
        Enumeration entries = jarFile.entries();
        CodeSigner[] codeSignerArr = null;
        while (entries.hasMoreElements() && (codeSignerArr = ((JarEntry) entries.nextElement()).getCodeSigners()) == null) {
        }
        return codeSignerArr;
    }

    private static void e(JarFile jarFile) throws IOException {
        Enumeration entries = jarFile.entries();
        byte[] bArr = new byte[8192];
        while (entries.hasMoreElements()) {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = jarFile.getInputStream((JarEntry) entries.nextElement());
                    do {
                    } while (inputStream.read(bArr, 0, 8192) != -1);
                    inputStream.close();
                } catch (Exception e) {
                    throw new b((Throwable) e);
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public static byte[] b(String str) throws IOException, b {
        if (str != null && str.length() != 0) {
            JarFile jarFile = new JarFile(str);
            try {
                e(jarFile);
                X509Certificate c = c(jarFile);
                if (c != null && (c instanceof X509Certificate)) {
                    return c.getSignature();
                }
                return null;
            } catch (SecurityException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("apkFileName cannot be null or empty!");
    }

    public static String a(String str) {
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf("com.amazon.content.id.");
            if (indexOf >= 0 && str.length() > 22) {
                return str.substring(indexOf + 22);
            }
            return null;
        }
        throw new IllegalArgumentException("name cannot be null or empty!");
    }

    public static boolean a(File file) throws IOException {
        ZipFile jarFile;
        ZipFile zipFile = null;
        try {
            jarFile = new JarFile(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean b = b((JarFile) jarFile);
            jarFile.close();
            return b;
        } catch (Throwable th2) {
            th = th2;
            zipFile = jarFile;
            zipFile.close();
            throw th;
        }
    }
}
