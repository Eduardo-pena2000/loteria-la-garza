package com.applovin.shadow.okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class serverProviderClass;

    public static final class AlpnProvider implements InvocationHandler {
        private final List protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List list) {
            t.g(list, "protocols");
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            t.g(obj, "proxy");
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
                this.unsupported = true;
                return null;
            }
            if (t.c(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((t.c(name, "selectProtocol") || t.c(name, "select")) && t.c(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    t.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            t.e(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.protocols.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!t.c(name, "protocolSelected") && !t.c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            t.e(obj4, "null cannot be cast to non-null type kotlin.String");
            this.selected = (String) obj4;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                t.f(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, (ClassLoader) null);
                Class cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, (ClassLoader) null);
                Class cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                t.f(method, "putMethod");
                t.f(method2, "getMethod");
                t.f(method3, "removeMethod");
                t.f(cls3, "clientProviderClass");
                t.f(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        t.g(method, "putMethod");
        t.g(method2, "getMethod");
        t.g(method3, "removeMethod");
        t.g(cls, "clientProviderClass");
        t.g(cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List list) {
        t.g(sSLSocket, "sslSocket");
        t.g(list, "protocols");
        try {
            this.putMethod.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list)))});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        t.g(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
            t.e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
