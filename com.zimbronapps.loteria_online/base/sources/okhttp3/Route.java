package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Route {
    public final Address a;
    public final Proxy b;
    public final InetSocketAddress c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        t.g(address, "address");
        t.g(proxy, "proxy");
        t.g(socketAddress, "socketAddress");
        this.a = address;
        this.b = proxy;
        this.c = socketAddress;
    }

    public final Address a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.k() != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (t.c(route.a, this.a) && t.c(route.b, this.b) && t.c(route.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Route{" + this.c + '}';
    }
}
