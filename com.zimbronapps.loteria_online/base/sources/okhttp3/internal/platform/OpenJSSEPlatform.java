package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OpenJSSEPlatform extends Platform {
    public static final Companion e;
    public static final boolean f;
    public final Provider d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final OpenJSSEPlatform a() {
            if (b()) {
                return new OpenJSSEPlatform(null);
            }
            return null;
        }

        public final boolean b() {
            return OpenJSSEPlatform.q();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        e = companion;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f = z;
    }

    public /* synthetic */ OpenJSSEPlatform(k kVar) {
        this();
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return super.h(sslSocket);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.d);
        t.f(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.d);
        trustManagerFactory.init((KeyStore) null);
        X509TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        t.d(trustManagers);
        if (trustManagers.length == 1) {
            X509TrustManager x509TrustManager = trustManagers[0];
            if (x509TrustManager instanceof X509TrustManager) {
                if (x509TrustManager != null) {
                    return x509TrustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        t.f(arrays, "toString(this)");
        throw new IllegalStateException(t.o("Unexpected default trust managers: ", arrays).toString());
    }

    private OpenJSSEPlatform() {
        this.d = new OpenJSSE();
    }
}
