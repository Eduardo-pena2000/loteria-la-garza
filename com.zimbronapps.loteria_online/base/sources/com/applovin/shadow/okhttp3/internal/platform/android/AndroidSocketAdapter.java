package com.applovin.shadow.okhttp3.internal.platform.android;

import Za.c;
import com.applovin.shadow.okhttp3.internal.platform.AndroidPlatform;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.platform.android.DeferredSocketAdapter;
import com.applovin.shadow.okhttp3.internal.platform.android.SocketAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class sslSocketClass;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ AndroidSocketAdapter access$build(Companion companion, Class cls) {
            return companion.build(cls);
        }

        private final AndroidSocketAdapter build(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !t.c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            t.d(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        public final DeferredSocketAdapter.Factory factory(String str) {
            t.g(str, "packageName");
            return new AndroidSocketAdapter$Companion$factory$1(str);
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.access$getPlayProviderFactory$cp();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class cls) {
        t.g(cls, "sslSocketClass");
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        t.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod("setHostname", new Class[]{String.class});
        this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public static final /* synthetic */ DeferredSocketAdapter.Factory access$getPlayProviderFactory$cp() {
        return playProviderFactory;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        if (matchesSocket(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.setHostname.invoke(sSLSocket, new Object[]{str});
                }
                this.setAlpnProtocols.invoke(sSLSocket, new Object[]{Platform.Companion.concatLengthPrefixed(list)});
            } catch (InvocationTargetException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        if (!matchesSocket(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, c.b);
            }
            return null;
        } catch (InvocationTargetException e) {
            NullPointerException cause = e.getCause();
            if ((cause instanceof NullPointerException) && t.c(cause.getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }
}
