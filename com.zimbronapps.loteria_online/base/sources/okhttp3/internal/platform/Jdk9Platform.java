package okhttp3.internal.platform;

import Za.A;
import com.applovin.shadow.okhttp3.internal.platform.a;
import com.applovin.shadow.okhttp3.internal.platform.b;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Jdk9Platform extends Platform {
    public static final Companion d = new Companion(null);
    public static final boolean e;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Jdk9Platform a() {
            if (b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean b() {
            return Jdk9Platform.q();
        }

        private Companion() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer p = property == null ? null : A.p(property);
        boolean z = false;
        if (p == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", (Class[]) null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (p.intValue() >= 9) {
            z = true;
        }
        e = z;
    }

    public static final /* synthetic */ boolean q() {
        return e;
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = Platform.a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        b.a(sSLParameters, (String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            String a = a.a(sslSocket);
            if (a == null ? true : t.c(a, "")) {
                return null;
            }
            return a;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
