package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion i = new Companion(null);
    public final Method d;
    public final Method e;
    public final Method f;
    public final Class g;
    public final Class h;

    public static final class AlpnProvider implements InvocationHandler {
        public final List a;
        public boolean b;
        public String c;

        public AlpnProvider(List protocols) {
            t.g(protocols, "protocols");
            this.a = protocols;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        public Object invoke(Object proxy, Method method, Object[] objArr) {
            t.g(proxy, "proxy");
            t.g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class returnType = method.getReturnType();
            if (t.c(name, "supports") && t.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (t.c(name, "unsupported") && t.c(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            if (t.c(name, "protocols") && objArr.length == 0) {
                return this.a;
            }
            if ((t.c(name, "selectProtocol") || t.c(name, "select")) && t.c(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            Object obj2 = list.get(i);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (this.a.contains(str)) {
                                this.c = str;
                                return str;
                            }
                            if (i == size) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    String str2 = (String) this.a.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!t.c(name, "protocolSelected") && !t.c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.c = (String) obj3;
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Platform a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                t.f(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class cls2 = Class.forName(t.o("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, (ClassLoader) null);
                Class clientProviderClass = Class.forName(t.o("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, (ClassLoader) null);
                Class serverProviderClass = Class.forName(t.o("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, (ClassLoader) null);
                Method putMethod = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method getMethod = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method removeMethod = cls.getMethod("remove", new Class[]{SSLSocket.class});
                t.f(putMethod, "putMethod");
                t.f(getMethod, "getMethod");
                t.f(removeMethod, "removeMethod");
                t.f(clientProviderClass, "clientProviderClass");
                t.f(serverProviderClass, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        t.g(putMethod, "putMethod");
        t.g(getMethod, "getMethod");
        t.g(removeMethod, "removeMethod");
        t.g(clientProviderClass, "clientProviderClass");
        t.g(serverProviderClass, "serverProviderClass");
        this.d = putMethod;
        this.e = getMethod;
        this.f = removeMethod;
        this.g = clientProviderClass;
        this.h = serverProviderClass;
    }

    public void b(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            this.f.invoke((Object) null, new Object[]{sslSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        try {
            this.d.invoke((Object) null, new Object[]{sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.g, this.h}, new AlpnProvider(Platform.a.b(protocols)))});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke((Object) null, new Object[]{sslSocket}));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.b() && alpnProvider.a() == null) {
                Platform.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.b()) {
                return null;
            }
            return alpnProvider.a();
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
