package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final Companion a = new Companion(null);
    public static final DeferredSocketAdapter.Factory b = new BouncyCastleSocketAdapter$Companion$factory$1();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return BouncyCastleSocketAdapter.a();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ DeferredSocketAdapter.Factory a() {
        return b;
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = Platform.a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    public boolean isSupported() {
        return BouncyCastlePlatform.e.b();
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return false;
    }
}
