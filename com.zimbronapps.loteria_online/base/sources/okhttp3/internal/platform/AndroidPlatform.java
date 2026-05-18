package okhttp3.internal.platform;

import Da.v;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidPlatform extends Platform {
    public static final Companion f = new Companion(null);
    public static final boolean g;
    public final List d;
    public final CloseGuard e;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean b() {
            return AndroidPlatform.q();
        }

        private Companion() {
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {
        public final X509TrustManager a;
        public final Method b;

        public CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            t.g(trustManager, "trustManager");
            t.g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.a = trustManager;
            this.b = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return t.c(this.a, customTrustRootIndex.a) && t.c(this.b, customTrustRootIndex.b);
        }

        public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
            t.g(cert, "cert");
            try {
                Object invoke = this.b.invoke(this.a, new Object[]{cert});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (InvocationTargetException unused) {
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            }
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        boolean z = false;
        if (Platform.a.h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        g = z;
    }

    public AndroidPlatform() {
        List s = v.s(StandardAndroidSocketAdapter.Companion.b(StandardAndroidSocketAdapter.j, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : s) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        this.e = CloseGuard.d.a();
    }

    public static final /* synthetic */ boolean q() {
        return g;
    }

    public CertificateChainCleaner c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        AndroidCertificateChainCleaner a = AndroidCertificateChainCleaner.d.a(trustManager);
        return a == null ? super.c(trustManager) : a;
    }

    public TrustRootIndex d(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            method.setAccessible(true);
            t.f(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return;
        }
        socketAdapter.configureTlsExtensions(sslSocket, str, protocols);
    }

    public void f(Socket socket, InetSocketAddress address, int i) {
        t.g(socket, "socket");
        t.g(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    public String h(SSLSocket sslSocket) {
        Object obj;
        t.g(sslSocket, "sslSocket");
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocket(sslSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.getSelectedProtocol(sslSocket);
    }

    public Object i(String closer) {
        t.g(closer, "closer");
        return this.e.a(closer);
    }

    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    public void m(String message, Object obj) {
        t.g(message, "message");
        if (this.e.b(obj)) {
            return;
        }
        Platform.l(this, message, 5, null, 4, null);
    }
}
