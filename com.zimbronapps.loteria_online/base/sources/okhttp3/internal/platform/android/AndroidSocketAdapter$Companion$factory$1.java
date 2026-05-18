package okhttp3.internal.platform.android;

import Za.B;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public final /* synthetic */ String a;

    public AndroidSocketAdapter$Companion$factory$1(String str) {
        this.a = str;
    }

    public SocketAdapter create(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return AndroidSocketAdapter.Companion.a(AndroidSocketAdapter.f, sslSocket.getClass());
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        t.f(name, "sslSocket.javaClass.name");
        return B.N(name, t.o(this.a, "."), false, 2, null);
    }
}
