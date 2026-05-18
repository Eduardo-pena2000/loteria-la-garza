package com.applovin.shadow.okhttp3.internal.platform;

import Za.A;
import com.applovin.shadow.okhttp3.internal.SuppressSignatureCheck;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isAvailable;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.access$isAvailable$cp();
        }

        private Companion() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer p = property != null ? A.p(property) : null;
        boolean z = false;
        if (p == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", (Class[]) null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (p.intValue() >= 9) {
            z = true;
        }
        isAvailable = z;
    }

    public static final /* synthetic */ boolean access$isAvailable$cp() {
        return isAvailable;
    }

    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        b.a(sSLParameters, (String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        try {
            String a = a.a(sSLSocket);
            if (a == null ? true : t.c(a, "")) {
                return null;
            }
            return a;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        t.g(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
