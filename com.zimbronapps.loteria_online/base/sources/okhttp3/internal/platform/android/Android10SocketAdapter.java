package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.os.Build;
import com.applovin.shadow.okhttp3.internal.platform.android.a;
import com.applovin.shadow.okhttp3.internal.platform.b;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;

@SuppressSignatureCheck
@SuppressLint({"NewApi"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Android10SocketAdapter implements SocketAdapter {
    public static final Companion a = new Companion(null);

    @SuppressSignatureCheck
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SocketAdapter a() {
            if (b()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        public final boolean b() {
            return Platform.a.h() && Build.VERSION.SDK_INT >= 29;
        }

        private Companion() {
        }
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        try {
            a.a(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = Platform.a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            b.a(sSLParameters, (String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        String a2 = com.applovin.shadow.okhttp3.internal.platform.a.a(sslSocket);
        if (a2 == null ? true : t.c(a2, "")) {
            return null;
        }
        return a2;
    }

    public boolean isSupported() {
        return a.b();
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return com.applovin.shadow.okhttp3.internal.platform.android.b.a(sslSocket);
    }
}
