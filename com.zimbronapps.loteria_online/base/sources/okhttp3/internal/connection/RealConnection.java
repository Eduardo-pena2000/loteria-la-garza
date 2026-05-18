package okhttp3.internal.connection;

import Za.B;
import Za.u;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import xb.M;
import xb.f;
import xb.g;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion t = new Companion(null);
    public final RealConnectionPool c;
    public final Route d;
    public Socket e;
    public Socket f;
    public Handshake g;
    public Protocol h;
    public Http2Connection i;
    public g j;
    public f k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final List r;
    public long s;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            a = iArr;
        }
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        t.g(connectionPool, "connectionPool");
        t.g(route, "route");
        this.c = connectionPool;
        this.d = route;
        this.q = 1;
        this.r = new ArrayList();
        this.s = Long.MAX_VALUE;
    }

    public static final /* synthetic */ Handshake c(RealConnection realConnection) {
        return realConnection.g;
    }

    public Route A() {
        return this.d;
    }

    public final boolean B(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Route route = (Route) it.next();
            Proxy.Type type = route.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.d.b().type() == type2 && t.c(this.d.d(), route.d())) {
                return true;
            }
        }
        return false;
    }

    public final void C(long j) {
        this.s = j;
    }

    public final void D(boolean z) {
        this.l = z;
    }

    public Socket E() {
        Socket socket = this.f;
        t.d(socket);
        return socket;
    }

    public final void F(int i) {
        Socket socket = this.f;
        t.d(socket);
        g gVar = this.j;
        t.d(gVar);
        f fVar = this.k;
        t.d(fVar);
        socket.setSoTimeout(0);
        Http2Connection a = new Http2Connection.Builder(true, TaskRunner.i).s(socket, this.d.a().l().h(), gVar, fVar).k(this).l(i).a();
        this.i = a;
        this.q = Http2Connection.C.a().d();
        Http2Connection.q0(a, false, null, 3, null);
    }

    public final boolean G(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl l = this.d.a().l();
        if (httpUrl.l() != l.l()) {
            return false;
        }
        if (t.c(httpUrl.h(), l.h())) {
            return true;
        }
        if (this.m || (handshake = this.g) == null) {
            return false;
        }
        t.d(handshake);
        return e(httpUrl, handshake);
    }

    public final synchronized void H(RealCall call, IOException iOException) {
        try {
            t.g(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).a == ErrorCode.j) {
                    int i = this.p + 1;
                    this.p = i;
                    if (i > 1) {
                        this.l = true;
                        this.n++;
                    }
                } else if (((StreamResetException) iOException).a != ErrorCode.k || !call.isCanceled()) {
                    this.l = true;
                    this.n++;
                }
            } else if (!v() || (iOException instanceof ConnectionShutdownException)) {
                this.l = true;
                if (this.o == 0) {
                    if (iOException != null) {
                        g(call.j(), this.d, iOException);
                    }
                    this.n++;
                }
            }
        } finally {
        }
    }

    public synchronized void a(Http2Connection connection, Settings settings) {
        t.g(connection, "connection");
        t.g(settings, "settings");
        this.q = settings.d();
    }

    public void b(Http2Stream stream) {
        t.g(stream, "stream");
        stream.d(ErrorCode.j, null);
    }

    public final void d() {
        Socket socket = this.e;
        if (socket == null) {
            return;
        }
        Util.n(socket);
    }

    public final boolean e(HttpUrl httpUrl, Handshake handshake) {
        List d = handshake.d();
        return !d.isEmpty() && OkHostnameVerifier.a.e(httpUrl.h(), (X509Certificate) d.get(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.f(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void g(OkHttpClient client, Route failedRoute, IOException failure) {
        t.g(client, "client");
        t.g(failedRoute, "failedRoute");
        t.g(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            Address a = failedRoute.a();
            a.i().connectFailed(a.l().q(), failedRoute.b().address(), failure);
        }
        client.s().b(failedRoute);
    }

    public final void h(int i, int i2, Call call, EventListener eventListener) {
        Socket createSocket;
        Proxy b = this.d.b();
        Address a = this.d.a();
        Proxy.Type type = b.type();
        int i3 = type == null ? -1 : WhenMappings.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = a.j().createSocket();
            t.d(createSocket);
        } else {
            createSocket = new Socket(b);
        }
        this.e = createSocket;
        eventListener.j(call, this.d.d(), b);
        createSocket.setSoTimeout(i2);
        try {
            Platform.a.g().f(createSocket, this.d.d(), i);
            try {
                this.j = x.d(x.l(createSocket));
                this.k = x.c(x.h(createSocket));
            } catch (NullPointerException e) {
                if (t.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(t.o("Failed to connect to ", this.d.d()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(ConnectionSpecSelector connectionSpecSelector) {
        Address a = this.d.a();
        SSLSocketFactory k = a.k();
        try {
            t.d(k);
            SSLSocket createSocket = k.createSocket(this.e, a.l().h(), a.l().l(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket = createSocket;
            try {
                ConnectionSpec a2 = connectionSpecSelector.a(sSLSocket);
                if (a2.h()) {
                    Platform.a.g().e(sSLSocket, a.l().h(), a.f());
                }
                sSLSocket.startHandshake();
                SSLSession sslSocketSession = sSLSocket.getSession();
                Handshake.Companion companion = Handshake.e;
                t.f(sslSocketSession, "sslSocketSession");
                Handshake a3 = companion.a(sslSocketSession);
                HostnameVerifier e = a.e();
                t.d(e);
                if (e.verify(a.l().h(), sslSocketSession)) {
                    CertificatePinner a4 = a.a();
                    t.d(a4);
                    this.g = new Handshake(a3.e(), a3.a(), a3.c(), new RealConnection$connectTls$1(a4, a3, a));
                    a4.b(a.l().h(), new RealConnection$connectTls$2(this));
                    r2 = a2.h() ? Platform.a.g().h(sSLSocket) : null;
                    this.f = sSLSocket;
                    this.j = x.d(x.l(sSLSocket));
                    this.k = x.c(x.h(sSLSocket));
                    this.h = r2 != null ? Protocol.b.a(r2) : Protocol.HTTP_1_1;
                    Platform.a.g().b(sSLSocket);
                    return;
                }
                List d = a3.d();
                if (d.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + a.l().h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) d.get(0);
                throw new SSLPeerUnverifiedException(u.l("\n              |Hostname " + a.l().h() + " not verified:\n              |    certificate: " + CertificatePinner.c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                r2 = sSLSocket;
                if (r2 != null) {
                    Platform.a.g().b(r2);
                }
                if (r2 != null) {
                    Util.n(r2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void j(int i, int i2, int i3, Call call, EventListener eventListener) {
        Request l = l();
        HttpUrl j = l.j();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            h(i, i2, call, eventListener);
            l = k(i2, i3, l, j);
            if (l == null) {
                return;
            }
            Socket socket = this.e;
            if (socket != null) {
                Util.n(socket);
            }
            this.e = null;
            this.k = null;
            this.j = null;
            eventListener.h(call, this.d.d(), this.d.b(), null);
        }
    }

    public final Request k(int i, int i2, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.T(httpUrl, true) + " HTTP/1.1";
        while (true) {
            g gVar = this.j;
            t.d(gVar);
            f fVar = this.k;
            t.d(fVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().g(i, timeUnit);
            fVar.timeout().g(i2, timeUnit);
            http1ExchangeCodec.w(request.f(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            t.d(readResponseHeaders);
            Response c = readResponseHeaders.s(request).c();
            http1ExchangeCodec.v(c);
            int f = c.f();
            if (f == 200) {
                if (gVar.getBuffer().exhausted() && fVar.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (f != 407) {
                throw new IOException(t.o("Unexpected response code for CONNECT: ", Integer.valueOf(c.f())));
            }
            Request a = this.d.a().h().a(this.d, c);
            if (a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (B.z("close", Response.o(c, "Connection", null, 2, null), true)) {
                return a;
            }
            request = a;
        }
    }

    public final Request l() {
        Request b = new Request.Builder().q(this.d.a().l()).h("CONNECT", null).f("Host", Util.T(this.d.a().l(), true)).f("Proxy-Connection", "Keep-Alive").f("User-Agent", "okhttp/4.11.0").b();
        Request a = this.d.a().h().a(this.d, new Response.Builder().s(b).q(Protocol.HTTP_1_1).g(407).n("Preemptive Authenticate").b(Util.c).t(-1L).r(-1L).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a == null ? b : a;
    }

    public final void m(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) {
        if (this.d.a().k() != null) {
            eventListener.C(call);
            i(connectionSpecSelector);
            eventListener.B(call, this.g);
            if (this.h == Protocol.HTTP_2) {
                F(i);
                return;
            }
            return;
        }
        List f = this.d.a().f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!f.contains(protocol)) {
            this.f = this.e;
            this.h = Protocol.HTTP_1_1;
        } else {
            this.f = this.e;
            this.h = protocol;
            F(i);
        }
    }

    public final List n() {
        return this.r;
    }

    public final long o() {
        return this.s;
    }

    public final boolean p() {
        return this.l;
    }

    public final int q() {
        return this.n;
    }

    public Handshake r() {
        return this.g;
    }

    public final synchronized void s() {
        this.o++;
    }

    public final boolean t(Address address, List list) {
        t.g(address, "address");
        if (Util.h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.r.size() >= this.q || this.l || !this.d.a().d(address)) {
            return false;
        }
        if (t.c(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.i == null || list == null || !B(list) || address.e() != OkHostnameVerifier.a || !G(address.l())) {
            return false;
        }
        try {
            CertificatePinner a = address.a();
            t.d(a);
            String h = address.l().h();
            Handshake r = r();
            t.d(r);
            a.a(h, r.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        String a;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.d.a().l().h());
        sb.append(':');
        sb.append(this.d.a().l().l());
        sb.append(", proxy=");
        sb.append(this.d.b());
        sb.append(" hostAddress=");
        sb.append(this.d.d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.g;
        String str = "none";
        if (handshake != null && (a = handshake.a()) != null) {
            str = a;
        }
        sb.append(str);
        sb.append(" protocol=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z) {
        long o;
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.e;
        t.d(socket);
        Socket socket2 = this.f;
        t.d(socket2);
        g gVar = this.j;
        t.d(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.i;
        if (http2Connection != null) {
            return http2Connection.X(nanoTime);
        }
        synchronized (this) {
            o = nanoTime - o();
        }
        if (o < 10000000000L || !z) {
            return true;
        }
        return Util.G(socket2, gVar);
    }

    public final boolean v() {
        return this.i != null;
    }

    public final ExchangeCodec w(OkHttpClient client, RealInterceptorChain chain) {
        t.g(client, "client");
        t.g(chain, "chain");
        Socket socket = this.f;
        t.d(socket);
        g gVar = this.j;
        t.d(gVar);
        f fVar = this.k;
        t.d(fVar);
        Http2Connection http2Connection = this.i;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.j());
        M timeout = gVar.timeout();
        long g = chain.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(g, timeUnit);
        fVar.timeout().g(chain.i(), timeUnit);
        return new Http1ExchangeCodec(client, this, gVar, fVar);
    }

    public final RealWebSocket.Streams x(Exchange exchange) {
        t.g(exchange, "exchange");
        Socket socket = this.f;
        t.d(socket);
        g gVar = this.j;
        t.d(gVar);
        f fVar = this.k;
        t.d(fVar);
        socket.setSoTimeout(0);
        z();
        return new RealConnection$newWebSocketStreams$1(gVar, fVar, exchange);
    }

    public final synchronized void y() {
        this.m = true;
    }

    public final synchronized void z() {
        this.l = true;
    }
}
