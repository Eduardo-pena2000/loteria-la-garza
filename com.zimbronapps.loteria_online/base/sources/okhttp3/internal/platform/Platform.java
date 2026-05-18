package okhttp3.internal.platform;

import Da.w;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Platform {
    public static final Companion a;
    public static volatile Platform b;
    public static final Logger c;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ Platform a(Companion companion) {
            return companion.f();
        }

        public final List b(List protocols) {
            t.g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            t.g(protocols, "protocols");
            e eVar = new e();
            for (String str : b(protocols)) {
                eVar.writeByte(str.length());
                eVar.writeUtf8(str);
            }
            return eVar.readByteArray();
        }

        public final Platform d() {
            AndroidLog.a.b();
            Platform a = Android10Platform.e.a();
            if (a != null) {
                return a;
            }
            Platform a2 = AndroidPlatform.f.a();
            t.d(a2);
            return a2;
        }

        public final Platform e() {
            OpenJSSEPlatform a;
            BouncyCastlePlatform a2;
            ConscryptPlatform b;
            if (j() && (b = ConscryptPlatform.e.b()) != null) {
                return b;
            }
            if (i() && (a2 = BouncyCastlePlatform.e.a()) != null) {
                return a2;
            }
            if (k() && (a = OpenJSSEPlatform.e.a()) != null) {
                return a;
            }
            Jdk9Platform a3 = Jdk9Platform.d.a();
            if (a3 != null) {
                return a3;
            }
            Platform a4 = Jdk8WithJettyBootPlatform.i.a();
            return a4 != null ? a4 : new Platform();
        }

        public final Platform f() {
            return h() ? d() : e();
        }

        public final Platform g() {
            return Platform.a();
        }

        public final boolean h() {
            return t.c("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return t.c("BC", Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return t.c("Conscrypt", Security.getProviders()[0].getName());
        }

        public final boolean k() {
            return t.c("OpenJSSE", Security.getProviders()[0].getName());
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        a = companion;
        b = Companion.a(companion);
        c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final /* synthetic */ Platform a() {
        return b;
    }

    public static /* synthetic */ void l(Platform platform, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform.k(str, i, th);
    }

    public void b(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
    }

    public CertificateChainCleaner c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(d(trustManager));
    }

    public TrustRootIndex d(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        t.f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i) {
        t.g(socket, "socket");
        t.g(address, "address");
        socket.connect(address, i);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        t.g(closer, "closer");
        if (c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return true;
    }

    public void k(String message, int i, Throwable th) {
        t.g(message, "message");
        c.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        t.g(message, "message");
        if (obj == null) {
            message = t.o(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        t.f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SSLSocketFactory o(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        try {
            SSLContext n = n();
            n.init((KeyManager[]) null, new TrustManager[]{trustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = n.getSocketFactory();
            t.f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(t.o("No System TLS: ", e), e);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        t.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
