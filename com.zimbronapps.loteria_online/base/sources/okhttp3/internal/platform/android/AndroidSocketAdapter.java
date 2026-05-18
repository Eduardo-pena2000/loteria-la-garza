package okhttp3.internal.platform.android;

import Za.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion f;
    public static final DeferredSocketAdapter.Factory g;
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ AndroidSocketAdapter a(Companion companion, Class cls) {
            return companion.b(cls);
        }

        public final AndroidSocketAdapter b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !t.c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(t.o("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            t.d(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        public final DeferredSocketAdapter.Factory c(String packageName) {
            t.g(packageName, "packageName");
            return new AndroidSocketAdapter$Companion$factory$1(packageName);
        }

        public final DeferredSocketAdapter.Factory d() {
            return AndroidSocketAdapter.a();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f = companion;
        g = companion.c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class sslSocketClass) {
        t.g(sslSocketClass, "sslSocketClass");
        this.a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        t.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.c = sslSocketClass.getMethod("setHostname", new Class[]{String.class});
        this.d = sslSocketClass.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.e = sslSocketClass.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public static final /* synthetic */ DeferredSocketAdapter.Factory a() {
        return g;
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.b.invoke(sslSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.c.invoke(sslSocket, new Object[]{str});
                }
                this.e.invoke(sslSocket, new Object[]{Platform.a.c(protocols)});
            } catch (InvocationTargetException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sslSocket, (Object[]) null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, c.b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            NullPointerException cause = e2.getCause();
            if ((cause instanceof NullPointerException) && t.c(cause.getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    public boolean isSupported() {
        return AndroidPlatform.f.b();
    }

    public boolean matchesSocket(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return this.a.isInstance(sslSocket);
    }
}
