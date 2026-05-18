package okhttp3.internal.platform;

import Da.v;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

@SuppressSignatureCheck
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Android10Platform extends Platform {
    public static final Companion e = new Companion(null);
    public static final boolean f;
    public final List d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean b() {
            return Android10Platform.q();
        }

        private Companion() {
        }
    }

    static {
        f = Platform.a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        List s = v.s(Android10SocketAdapter.a.a(), new DeferredSocketAdapter(AndroidSocketAdapter.f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : s) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    public CertificateChainCleaner c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        AndroidCertificateChainCleaner a = AndroidCertificateChainCleaner.d.a(trustManager);
        return a == null ? super.c(trustManager) : a;
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

    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
