package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {
    public static final Companion a = new Companion(null);
    public static final DeferredSocketAdapter.Factory b = new ConscryptSocketAdapter$Companion$factory$1();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return ConscryptSocketAdapter.a();
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
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = Platform.a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        if (matchesSocket(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    public boolean isSupported() {
        return ConscryptPlatform.e.c();
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }
}
