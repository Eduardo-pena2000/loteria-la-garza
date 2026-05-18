package com.applovin.shadow.okhttp3.internal.platform.android;

import com.applovin.shadow.okhttp3.internal.platform.BouncyCastlePlatform;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion(null);
    private static final DeferredSocketAdapter.Factory factory = new BouncyCastleSocketAdapter$Companion$factory$1();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final DeferredSocketAdapter.Factory getFactory() {
            return BouncyCastleSocketAdapter.access$getFactory$cp();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ DeferredSocketAdapter.Factory access$getFactory$cp() {
        return factory;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    public boolean isSupported() {
        return BouncyCastlePlatform.Companion.isSupported();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return false;
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
