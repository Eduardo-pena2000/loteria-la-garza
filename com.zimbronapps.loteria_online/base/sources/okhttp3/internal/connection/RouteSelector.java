package okhttp3.internal.connection;

import Da.A;
import Da.u;
import Da.v;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RouteSelector {
    public static final Companion i = new Companion(null);
    public final Address a;
    public final RouteDatabase b;
    public final Call c;
    public final EventListener d;
    public List e;
    public int f;
    public List g;
    public final List h;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            t.g(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                t.f(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            t.f(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private Companion() {
        }
    }

    public static final class Selection {
        public final List a;
        public int b;

        public Selection(List routes) {
            t.g(routes, "routes");
            this.a = routes;
        }

        public final List a() {
            return this.a;
        }

        public final boolean b() {
            return this.b < this.a.size();
        }

        public final Route c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return (Route) list.get(i);
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        t.g(address, "address");
        t.g(routeDatabase, "routeDatabase");
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        this.a = address;
        this.b = routeDatabase;
        this.c = call;
        this.d = eventListener;
        this.e = v.n();
        this.g = v.n();
        this.h = new ArrayList();
        f(address.l(), address.g());
    }

    public static final List g(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return u.e(proxy);
        }
        URI q = httpUrl.q();
        if (q.getHost() == null) {
            return Util.w(Proxy.NO_PROXY);
        }
        List proxiesOrNull = routeSelector.a.i().select(q);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return Util.w(Proxy.NO_PROXY);
        }
        t.f(proxiesOrNull, "proxiesOrNull");
        return Util.V(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.h.isEmpty();
    }

    public final boolean b() {
        return this.f < this.e.size();
    }

    public final Selection c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d = d();
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.a, d, (InetSocketAddress) it.next());
                if (this.b.c(route)) {
                    this.h.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            A.D(arrayList, this.h);
            this.h.clear();
        }
        return new Selection(arrayList);
    }

    public final Proxy d() {
        if (b()) {
            List list = this.e;
            int i2 = this.f;
            this.f = i2 + 1;
            Proxy proxy = (Proxy) list.get(i2);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.l().h() + "; exhausted proxy configurations: " + this.e);
    }

    public final void e(Proxy proxy) {
        String h;
        int l;
        List lookup;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            h = this.a.l().h();
            l = this.a.l().l();
        } else {
            InetSocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(t.o("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            Companion companion = i;
            t.f(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = proxyAddress;
            h = companion.a(inetSocketAddress);
            l = inetSocketAddress.getPort();
        }
        if (1 > l || l >= 65536) {
            throw new SocketException("No route to " + h + ':' + l + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(h, l));
            return;
        }
        if (Util.i(h)) {
            lookup = u.e(InetAddress.getByName(h));
        } else {
            this.d.n(this.c, h);
            lookup = this.a.c().lookup(h);
            if (lookup.isEmpty()) {
                throw new UnknownHostException(this.a.c() + " returned no addresses for " + h);
            }
            this.d.m(this.c, h, lookup);
        }
        Iterator it = lookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), l));
        }
    }

    public final void f(HttpUrl httpUrl, Proxy proxy) {
        this.d.p(this.c, httpUrl);
        List g = g(proxy, httpUrl, this);
        this.e = g;
        this.f = 0;
        this.d.o(this.c, httpUrl, g);
    }
}
