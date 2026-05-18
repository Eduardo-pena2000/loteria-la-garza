package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements b {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV2");
    private static final String b = "kiwi";
    private static final int c = 0;

    @com.amazon.a.a.k.a
    private Application d;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c e;

    private PublicKey b() {
        if (com.amazon.a.a.o.c.a) {
            a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.e.a("DATA_AUTHENTICATION_KEY");
        if (com.amazon.a.a.o.c.a) {
            com.amazon.a.a.o.c cVar = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Key was cached: ");
            sb.append(publicKey != null);
            cVar.a(sb.toString());
        }
        return publicKey;
    }

    private PublicKey c() throws com.amazon.a.a.o.b.a.a {
        if (com.amazon.a.a.o.c.a) {
            a.a("Loading authentication key from apk...");
        }
        CertPath d = d();
        if (!a(d)) {
            throw com.amazon.a.a.o.b.a.a.e();
        }
        d(d);
        return b(d);
    }

    private CertPath d() throws com.amazon.a.a.o.b.a.a {
        JarFile e = e();
        return a(e, a(e));
    }

    private JarFile e() throws com.amazon.a.a.o.b.a.a {
        String packageCodePath = this.d.getPackageCodePath();
        if (com.amazon.a.a.o.c.a) {
            a.a("Opening apk: " + packageCodePath);
        }
        try {
            return new JarFile(packageCodePath, false);
        } catch (IOException e) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e);
        }
    }

    private a f() throws com.amazon.a.a.o.b.a.a {
        try {
            return new a();
        } catch (GeneralSecurityException e) {
            throw com.amazon.a.a.o.b.a.a.b((Throwable) e);
        }
    }

    public PublicKey a() throws com.amazon.a.a.o.b.a.a {
        if (com.amazon.a.a.o.c.a) {
            a.a("Loading data authentication key...");
        }
        PublicKey b2 = b();
        if (b2 != null) {
            return b2;
        }
        PublicKey c2 = c();
        a(c2);
        return c2;
    }

    private void d(CertPath certPath) throws com.amazon.a.a.o.b.a.a {
        if (!f().a(certPath)) {
            throw com.amazon.a.a.o.b.a.a.f();
        }
    }

    private JarEntry a(JarFile jarFile) throws com.amazon.a.a.o.b.a.a {
        if (com.amazon.a.a.o.c.a) {
            a.a("Searching for cert in apk");
        }
        Enumeration entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry jarEntry = (JarEntry) entries.nextElement();
            if (!jarEntry.isDirectory() && jarEntry.getName().equals("kiwi")) {
                return jarEntry;
            }
        }
        throw com.amazon.a.a.o.b.a.a.d();
    }

    private PublicKey b(CertPath certPath) {
        return c(certPath).getPublicKey();
    }

    private X509Certificate c(CertPath certPath) {
        return (X509Certificate) certPath.getCertificates().get(0);
    }

    private CertPath a(JarFile jarFile, JarEntry jarEntry) throws com.amazon.a.a.o.b.a.a {
        try {
            if (com.amazon.a.a.o.c.a) {
                a.a("Extracting cert from entry: " + jarEntry.getName());
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            if (com.amazon.a.a.o.c.a) {
                a.a("Generating certificates from entry input stream");
            }
            return certificateFactory.generateCertPath(a(certificateFactory.generateCertificates(jarFile.getInputStream(jarEntry))));
        } catch (Exception e) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e);
        }
    }

    public List a(Collection collection) {
        return new ArrayList(collection);
    }

    private boolean a(CertPath certPath) {
        if (certPath == null || certPath.getCertificates().size() <= 0) {
            return false;
        }
        X509Certificate x509Certificate = (Certificate) certPath.getCertificates().get(0);
        if (!(x509Certificate instanceof X509Certificate)) {
            return false;
        }
        String name = x509Certificate.getSubjectX500Principal().getName();
        if (com.amazon.a.a.o.c.a) {
            a.a("Kiwi Cert Details: " + name);
        }
        return name.contains("O=Amazon.com\\, Inc.") && name.contains("C=US") && name.contains("ST=Washington") && name.contains("L=Seattle");
    }

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Placing auth key into storage");
        }
        this.e.a("DATA_AUTHENTICATION_KEY", publicKey);
    }
}
