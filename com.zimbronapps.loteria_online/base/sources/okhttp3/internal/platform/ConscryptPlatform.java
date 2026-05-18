package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConscryptPlatform extends Platform {
    public static final Companion e;
    public static final boolean f;
    public final Provider d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        public final ConscryptPlatform b() {
            if (c()) {
                return new ConscryptPlatform(null);
            }
            return null;
        }

        public final boolean c() {
            return ConscryptPlatform.q();
        }

        private Companion() {
        }
    }

    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {
        public static final DisabledHostnameVerifier a = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }
    }

    static {
        Companion companion = new Companion(null);
        e = companion;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (NoClassDefFoundError | ClassNotFoundException unused) {
        }
        f = z;
    }

    public /* synthetic */ ConscryptPlatform(k kVar) {
        this();
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = Platform.a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.h(sslSocket);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.d);
        t.f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SSLSocketFactory o(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        SSLContext n = n();
        n.init((KeyManager[]) null, new TrustManager[]{trustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = n.getSocketFactory();
        t.f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        X509TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        t.d(trustManagers);
        if (trustManagers.length == 1) {
            X509TrustManager x509TrustManager = trustManagers[0];
            if (x509TrustManager instanceof X509TrustManager) {
                if (x509TrustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager2 = x509TrustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager2, DisabledHostnameVerifier.a);
                return x509TrustManager2;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        t.f(arrays, "toString(this)");
        throw new IllegalStateException(t.o("Unexpected default trust managers: ", arrays).toString());
    }

    private ConscryptPlatform() {
        Provider newProvider = Conscrypt.newProvider();
        t.f(newProvider, "newProvider()");
        this.d = newProvider;
    }
}
