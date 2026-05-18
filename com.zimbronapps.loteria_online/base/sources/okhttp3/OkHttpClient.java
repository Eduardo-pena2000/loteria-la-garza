package okhttp3;

import Da.A;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion E = new Companion(null);
    public static final List F = Util.w(Protocol.f, Protocol.d);
    public static final List G = Util.w(ConnectionSpec.i, ConnectionSpec.k);
    public final int A;
    public final int B;
    public final long C;
    public final RouteDatabase D;
    public final Dispatcher a;
    public final ConnectionPool b;
    public final List c;
    public final List d;
    public final EventListener.Factory e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Cache k;
    public final Dns l;
    public final Proxy m;
    public final ProxySelector n;
    public final Authenticator o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List s;
    public final List t;
    public final HostnameVerifier u;
    public final CertificatePinner v;
    public final CertificateChainCleaner w;
    public final int x;
    public final int y;
    public final int z;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List a() {
            return OkHttpClient.b();
        }

        public final List b() {
            return OkHttpClient.c();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector y;
        t.g(builder, "builder");
        this.a = builder.l();
        this.b = builder.i();
        this.c = Util.V(builder.r());
        this.d = Util.V(builder.t());
        this.e = builder.n();
        this.f = builder.A();
        this.g = builder.c();
        this.h = builder.o();
        this.i = builder.p();
        this.j = builder.k();
        this.k = builder.d();
        this.l = builder.m();
        this.m = builder.w();
        if (builder.w() != null) {
            y = NullProxySelector.a;
        } else {
            y = builder.y();
            y = y == null ? ProxySelector.getDefault() : y;
            if (y == null) {
                y = NullProxySelector.a;
            }
        }
        this.n = y;
        this.o = builder.x();
        this.p = builder.C();
        List j = builder.j();
        this.s = j;
        this.t = builder.v();
        this.u = builder.q();
        this.x = builder.e();
        this.y = builder.h();
        this.z = builder.z();
        this.A = builder.E();
        this.B = builder.u();
        this.C = builder.s();
        RouteDatabase B = builder.B();
        this.D = B == null ? new RouteDatabase() : B;
        if (j == null || !j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f()) {
                    if (builder.D() != null) {
                        this.q = builder.D();
                        CertificateChainCleaner f = builder.f();
                        t.d(f);
                        this.w = f;
                        X509TrustManager F2 = builder.F();
                        t.d(F2);
                        this.r = F2;
                        CertificatePinner g = builder.g();
                        t.d(f);
                        this.v = g.e(f);
                    } else {
                        Platform.Companion companion = Platform.a;
                        X509TrustManager p = companion.g().p();
                        this.r = p;
                        Platform g2 = companion.g();
                        t.d(p);
                        this.q = g2.o(p);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.a;
                        t.d(p);
                        CertificateChainCleaner a = companion2.a(p);
                        this.w = a;
                        CertificatePinner g3 = builder.g();
                        t.d(a);
                        this.v = g3.e(a);
                    }
                }
            }
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = CertificatePinner.d;
        } else {
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = CertificatePinner.d;
        }
        H();
    }

    public static final /* synthetic */ List b() {
        return G;
    }

    public static final /* synthetic */ List c() {
        return F;
    }

    public static final /* synthetic */ SSLSocketFactory d(OkHttpClient okHttpClient) {
        return okHttpClient.q;
    }

    public final Proxy A() {
        return this.m;
    }

    public final Authenticator B() {
        return this.o;
    }

    public final ProxySelector C() {
        return this.n;
    }

    public final int D() {
        return this.z;
    }

    public final boolean E() {
        return this.f;
    }

    public final SocketFactory F() {
        return this.p;
    }

    public final SSLSocketFactory G() {
        SSLSocketFactory sSLSocketFactory = this.q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void H() {
        if (this.c.contains((Object) null)) {
            throw new IllegalStateException(t.o("Null interceptor: ", u()).toString());
        }
        if (this.d.contains((Object) null)) {
            throw new IllegalStateException(t.o("Null network interceptor: ", w()).toString());
        }
        List list = this.s;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f()) {
                    if (this.q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!t.c(this.v, CertificatePinner.d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int I() {
        return this.A;
    }

    public final X509TrustManager J() {
        return this.r;
    }

    public Call a(Request request) {
        t.g(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final Authenticator e() {
        return this.g;
    }

    public final Cache f() {
        return this.k;
    }

    public final int g() {
        return this.x;
    }

    public final CertificateChainCleaner h() {
        return this.w;
    }

    public final CertificatePinner i() {
        return this.v;
    }

    public final int j() {
        return this.y;
    }

    public final ConnectionPool k() {
        return this.b;
    }

    public final List l() {
        return this.s;
    }

    public final CookieJar m() {
        return this.j;
    }

    public final Dispatcher n() {
        return this.a;
    }

    public final Dns o() {
        return this.l;
    }

    public final EventListener.Factory p() {
        return this.e;
    }

    public final boolean q() {
        return this.h;
    }

    public final boolean r() {
        return this.i;
    }

    public final RouteDatabase s() {
        return this.D;
    }

    public final HostnameVerifier t() {
        return this.u;
    }

    public final List u() {
        return this.c;
    }

    public final long v() {
        return this.C;
    }

    public final List w() {
        return this.d;
    }

    public Builder x() {
        return new Builder(this);
    }

    public final int y() {
        return this.B;
    }

    public final List z() {
        return this.t;
    }

    public static final class Builder {
        public int A;
        public int B;
        public long C;
        public RouteDatabase D;
        public Dispatcher a;
        public ConnectionPool b;
        public final List c;
        public final List d;
        public EventListener.Factory e;
        public boolean f;
        public Authenticator g;
        public boolean h;
        public boolean i;
        public CookieJar j;
        public Cache k;
        public Dns l;
        public Proxy m;
        public ProxySelector n;
        public Authenticator o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public CertificatePinner v;
        public CertificateChainCleaner w;
        public int x;
        public int y;
        public int z;

        public Builder() {
            this.a = new Dispatcher();
            this.b = new ConnectionPool();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = Util.g(EventListener.b);
            this.f = true;
            Authenticator authenticator = Authenticator.b;
            this.g = authenticator;
            this.h = true;
            this.i = true;
            this.j = CookieJar.b;
            this.l = Dns.b;
            this.o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            t.f(socketFactory, "getDefault()");
            this.p = socketFactory;
            Companion companion = OkHttpClient.E;
            this.s = companion.a();
            this.t = companion.b();
            this.u = OkHostnameVerifier.a;
            this.v = CertificatePinner.d;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 1024L;
        }

        public final boolean A() {
            return this.f;
        }

        public final RouteDatabase B() {
            return this.D;
        }

        public final SocketFactory C() {
            return this.p;
        }

        public final SSLSocketFactory D() {
            return this.q;
        }

        public final int E() {
            return this.A;
        }

        public final X509TrustManager F() {
            return this.r;
        }

        public final Builder G(long j, TimeUnit unit) {
            t.g(unit, "unit");
            I(Util.k("timeout", j, unit));
            return this;
        }

        public final void H(int i) {
            this.y = i;
        }

        public final void I(int i) {
            this.z = i;
        }

        public final void J(int i) {
            this.A = i;
        }

        public final Builder K(long j, TimeUnit unit) {
            t.g(unit, "unit");
            J(Util.k("timeout", j, unit));
            return this;
        }

        public final OkHttpClient a() {
            return new OkHttpClient(this);
        }

        public final Builder b(long j, TimeUnit unit) {
            t.g(unit, "unit");
            H(Util.k("timeout", j, unit));
            return this;
        }

        public final Authenticator c() {
            return this.g;
        }

        public final Cache d() {
            return this.k;
        }

        public final int e() {
            return this.x;
        }

        public final CertificateChainCleaner f() {
            return this.w;
        }

        public final CertificatePinner g() {
            return this.v;
        }

        public final int h() {
            return this.y;
        }

        public final ConnectionPool i() {
            return this.b;
        }

        public final List j() {
            return this.s;
        }

        public final CookieJar k() {
            return this.j;
        }

        public final Dispatcher l() {
            return this.a;
        }

        public final Dns m() {
            return this.l;
        }

        public final EventListener.Factory n() {
            return this.e;
        }

        public final boolean o() {
            return this.h;
        }

        public final boolean p() {
            return this.i;
        }

        public final HostnameVerifier q() {
            return this.u;
        }

        public final List r() {
            return this.c;
        }

        public final long s() {
            return this.C;
        }

        public final List t() {
            return this.d;
        }

        public final int u() {
            return this.B;
        }

        public final List v() {
            return this.t;
        }

        public final Proxy w() {
            return this.m;
        }

        public final Authenticator x() {
            return this.o;
        }

        public final ProxySelector y() {
            return this.n;
        }

        public final int z() {
            return this.z;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            t.g(okHttpClient, "okHttpClient");
            this.a = okHttpClient.n();
            this.b = okHttpClient.k();
            A.D(this.c, okHttpClient.u());
            A.D(this.d, okHttpClient.w());
            this.e = okHttpClient.p();
            this.f = okHttpClient.E();
            this.g = okHttpClient.e();
            this.h = okHttpClient.q();
            this.i = okHttpClient.r();
            this.j = okHttpClient.m();
            this.k = okHttpClient.f();
            this.l = okHttpClient.o();
            this.m = okHttpClient.A();
            this.n = okHttpClient.C();
            this.o = okHttpClient.B();
            this.p = okHttpClient.F();
            this.q = OkHttpClient.d(okHttpClient);
            this.r = okHttpClient.J();
            this.s = okHttpClient.l();
            this.t = okHttpClient.z();
            this.u = okHttpClient.t();
            this.v = okHttpClient.i();
            this.w = okHttpClient.h();
            this.x = okHttpClient.g();
            this.y = okHttpClient.j();
            this.z = okHttpClient.D();
            this.A = okHttpClient.I();
            this.B = okHttpClient.y();
            this.C = okHttpClient.v();
            this.D = okHttpClient.s();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
