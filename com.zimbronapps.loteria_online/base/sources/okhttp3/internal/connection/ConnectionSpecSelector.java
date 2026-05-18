package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import okhttp3.ConnectionSpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConnectionSpecSelector {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public ConnectionSpecSelector(List connectionSpecs) {
        t.g(connectionSpecs, "connectionSpecs");
        this.a = connectionSpecs;
    }

    public final ConnectionSpec a(SSLSocket sslSocket) {
        ConnectionSpec connectionSpec;
        t.g(sslSocket, "sslSocket");
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            int i2 = i + 1;
            connectionSpec = (ConnectionSpec) this.a.get(i);
            if (connectionSpec.e(sslSocket)) {
                this.b = i2;
                break;
            }
            i = i2;
        }
        if (connectionSpec != null) {
            this.c = c(sslSocket);
            connectionSpec.c(sslSocket, this.d);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.d);
        sb.append(", modes=");
        sb.append(this.a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        t.d(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        t.f(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e) {
        t.g(e, "e");
        this.d = true;
        return (!this.c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int i = this.b;
        int size = this.a.size();
        while (i < size) {
            int i2 = i + 1;
            if (((ConnectionSpec) this.a.get(i)).e(sSLSocket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
