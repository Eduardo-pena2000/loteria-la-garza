package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    public final Factory a;
    public SocketAdapter b;

    public interface Factory {
        SocketAdapter create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        t.g(socketAdapterFactory, "socketAdapterFactory");
        this.a = socketAdapterFactory;
    }

    public final synchronized SocketAdapter a(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.matchesSocket(sSLSocket)) {
                this.b = this.a.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        SocketAdapter a = a(sslSocket);
        if (a == null) {
            return;
        }
        a.configureTlsExtensions(sslSocket, str, protocols);
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        SocketAdapter a = a(sslSocket);
        if (a == null) {
            return null;
        }
        return a.getSelectedProtocol(sslSocket);
    }

    public boolean isSupported() {
        return true;
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return this.a.matchesSocket(sslSocket);
    }
}
