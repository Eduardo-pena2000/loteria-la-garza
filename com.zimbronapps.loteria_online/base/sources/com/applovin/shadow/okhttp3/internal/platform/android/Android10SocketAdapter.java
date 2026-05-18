package com.applovin.shadow.okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.os.Build;
import com.applovin.shadow.okhttp3.internal.SuppressSignatureCheck;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@SuppressSignatureCheck
@SuppressLint({"NewApi"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Android10SocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion(null);

    @SuppressSignatureCheck
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SocketAdapter buildIfSupported() {
            if (isSupported()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        public final boolean isSupported() {
            return Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
        }

        private Companion() {
        }
    }

    @SuppressLint({"NewApi"})
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        try {
            a.a(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            com.applovin.shadow.okhttp3.internal.platform.b.a(sSLParameters, (String[]) Platform.Companion.alpnProtocolNames(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @SuppressLint({"NewApi"})
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        String a = com.applovin.shadow.okhttp3.internal.platform.a.a(sSLSocket);
        if (a == null ? true : t.c(a, "")) {
            return null;
        }
        return a;
    }

    public boolean isSupported() {
        return Companion.isSupported();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return b.a(sSLSocket);
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
