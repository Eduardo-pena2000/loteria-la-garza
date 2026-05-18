package com.applovin.shadow.okhttp3.internal.platform;

import Da.v;
import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.applovin.shadow.okhttp3.internal.SuppressSignatureCheck;
import com.applovin.shadow.okhttp3.internal.platform.android.Android10SocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import com.applovin.shadow.okhttp3.internal.platform.android.AndroidSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.ConscryptSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@SuppressSignatureCheck
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Android10Platform extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;
    private final List socketAdapters;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean isSupported() {
            return Android10Platform.access$isSupported$cp();
        }

        private Companion() {
        }
    }

    static {
        isSupported = Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        List s = v.s(new SocketAdapter[]{Android10SocketAdapter.Companion.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : s) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
        return isSupported;
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        t.g(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner buildIfSupported = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager);
        return buildIfSupported != null ? buildIfSupported : super.buildCertificateChainCleaner(x509TrustManager);
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        Object obj;
        t.g(sSLSocket, "sslSocket");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public boolean isCleartextTrafficPermitted(String str) {
        t.g(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object obj;
        t.g(sSLSocketFactory, "sslSocketFactory");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sSLSocketFactory);
        }
        return null;
    }
}
