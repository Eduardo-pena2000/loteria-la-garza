package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.t;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ExchangeFinder {
    public final RealConnectionPool a;
    public final Address b;
    public final RealCall c;
    public final EventListener d;
    public RouteSelector.Selection e;
    public RouteSelector f;
    public int g;
    public int h;
    public int i;
    public Route j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        t.g(connectionPool, "connectionPool");
        t.g(address, "address");
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        this.a = connectionPool;
        this.b = address;
        this.c = call;
        this.d = eventListener;
    }

    public final ExchangeCodec a(OkHttpClient client, RealInterceptorChain chain) {
        t.g(client, "client");
        t.g(chain, "chain");
        try {
            return c(chain.e(), chain.g(), chain.i(), client.y(), client.E(), !t.c(chain.h().h(), "GET")).w(client, chain);
        } catch (IOException e) {
            h(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            h(e2.c());
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final RealConnection c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            RealConnection b = b(i, i2, i3, i4, z);
            if (b.u(z2)) {
                return b;
            }
            b.z();
            if (this.j == null) {
                RouteSelector.Selection selection = this.e;
                if (selection == null ? true : selection.b()) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f;
                    if (!(routeSelector != null ? routeSelector.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    public final Address d() {
        return this.b;
    }

    public final boolean e() {
        RouteSelector routeSelector;
        if (this.g == 0 && this.h == 0 && this.i == 0) {
            return false;
        }
        if (this.j != null) {
            return true;
        }
        Route f = f();
        if (f != null) {
            this.j = f;
            return true;
        }
        RouteSelector.Selection selection = this.e;
        if ((selection != null && selection.b()) || (routeSelector = this.f) == null) {
            return true;
        }
        return routeSelector.a();
    }

    public final Route f() {
        RealConnection k;
        if (this.g > 1 || this.h > 1 || this.i > 0 || (k = this.c.k()) == null) {
            return null;
        }
        synchronized (k) {
            if (k.q() != 0) {
                return null;
            }
            if (Util.j(k.A().a().l(), d().l())) {
                return k.A();
            }
            return null;
        }
    }

    public final boolean g(HttpUrl url) {
        t.g(url, "url");
        HttpUrl l = this.b.l();
        return url.l() == l.l() && t.c(url.h(), l.h());
    }

    public final void h(IOException e) {
        t.g(e, "e");
        this.j = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).a == ErrorCode.j) {
            this.g++;
        } else if (e instanceof ConnectionShutdownException) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
