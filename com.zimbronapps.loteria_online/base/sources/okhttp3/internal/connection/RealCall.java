package okhttp3.internal.connection;

import Ca.I;
import Ca.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealCall implements Call {
    public final OkHttpClient a;
    public final Request b;
    public final boolean c;
    public final RealConnectionPool d;
    public final EventListener e;
    public final RealCall$timeout$1 f;
    public final AtomicBoolean g;
    public Object h;
    public ExchangeFinder i;
    public RealConnection j;
    public boolean k;
    public Exchange l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile Exchange q;
    public volatile RealConnection r;

    public final class AsyncCall implements Runnable {
        public final Callback a;
        public volatile AtomicInteger b;
        public final /* synthetic */ RealCall c;

        public AsyncCall(RealCall this$0, Callback responseCallback) {
            t.g(this$0, "this$0");
            t.g(responseCallback, "responseCallback");
            this.c = this$0;
            this.a = responseCallback;
            this.b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            t.g(executorService, "executorService");
            Dispatcher n = this.c.j().n();
            if (Util.h && Thread.holdsLock(n)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + n);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    IOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.c.s(interruptedIOException);
                    this.a.onFailure(this.c, interruptedIOException);
                    this.c.j().n().g(this);
                }
            } catch (Throwable th) {
                this.c.j().n().g(this);
                throw th;
            }
        }

        public final RealCall b() {
            return this.c;
        }

        public final AtomicInteger c() {
            return this.b;
        }

        public final String d() {
            return this.c.o().j().h();
        }

        public final void e(AsyncCall other) {
            t.g(other, "other");
            this.b = other.b;
        }

        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher n;
            String o = t.o("OkHttp ", this.c.t());
            RealCall realCall = this.c;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(o);
            try {
                RealCall.a(realCall).w();
                try {
                    try {
                        z = true;
                        try {
                            this.a.onResponse(realCall, realCall.p());
                            n = realCall.j().n();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                Platform.a.g().k(t.o("Callback failure for ", RealCall.b(realCall)), 4, e);
                            } else {
                                this.a.onFailure(realCall, e);
                            }
                            n = realCall.j().n();
                            n.g(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException(t.o("canceled due to ", th));
                                g.a(iOException, th);
                                this.a.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.j().n().g(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                n.g(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class CallReference extends WeakReference {
        public final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            t.g(referent, "referent");
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    public RealCall(OkHttpClient client, Request originalRequest, boolean z) {
        t.g(client, "client");
        t.g(originalRequest, "originalRequest");
        this.a = client;
        this.b = originalRequest;
        this.c = z;
        this.d = client.k().a();
        this.e = client.p().a(this);
        RealCall$timeout$1 realCall$timeout$1 = new RealCall$timeout$1(this);
        realCall$timeout$1.g(j().g(), TimeUnit.MILLISECONDS);
        this.f = realCall$timeout$1;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public static final /* synthetic */ RealCall$timeout$1 a(RealCall realCall) {
        return realCall.f;
    }

    public static final /* synthetic */ String b(RealCall realCall) {
        return realCall.z();
    }

    public void N0(Callback responseCallback) {
        t.g(responseCallback, "responseCallback");
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        e();
        this.a.n().b(new AsyncCall(this, responseCallback));
    }

    public final void c(RealConnection connection) {
        t.g(connection, "connection");
        if (!Util.h || Thread.holdsLock(connection)) {
            if (this.j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.j = connection;
            connection.n().add(new CallReference(this, this.h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public void cancel() {
        if (this.p) {
            return;
        }
        this.p = true;
        Exchange exchange = this.q;
        if (exchange != null) {
            exchange.b();
        }
        RealConnection realConnection = this.r;
        if (realConnection != null) {
            realConnection.d();
        }
        this.e.g(this);
    }

    public final IOException d(IOException iOException) {
        Socket u;
        boolean z = Util.h;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.j;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                u = u();
            }
            if (this.j == null) {
                if (u != null) {
                    Util.n(u);
                }
                this.e.l(this, realConnection);
            } else if (u != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException y = y(iOException);
        if (iOException != null) {
            EventListener eventListener = this.e;
            t.d(y);
            eventListener.e(this, y);
        } else {
            this.e.d(this);
        }
        return y;
    }

    public final void e() {
        this.h = Platform.a.g().i("response.body().close()");
        this.e.f(this);
    }

    public Response execute() {
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f.w();
        e();
        try {
            this.a.n().c(this);
            return p();
        } finally {
            this.a.n().h(this);
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public RealCall clone() {
        return new RealCall(this.a, this.b, this.c);
    }

    public final Address g(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.i()) {
            sSLSocketFactory = this.a.G();
            hostnameVerifier = this.a.t();
            certificatePinner = this.a.i();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.h(), httpUrl.l(), this.a.o(), this.a.F(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.a.B(), this.a.A(), this.a.z(), this.a.l(), this.a.C());
    }

    public final void h(Request request, boolean z) {
        t.g(request, "request");
        if (this.l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.m) {
                throw new IllegalStateException("Check failed.");
            }
            I i = I.a;
        }
        if (z) {
            this.i = new ExchangeFinder(this.d, g(request.j()), this, this.e);
        }
    }

    public final void i(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released");
            }
            I i = I.a;
        }
        if (z && (exchange = this.q) != null) {
            exchange.d();
        }
        this.l = null;
    }

    public boolean isCanceled() {
        return this.p;
    }

    public final OkHttpClient j() {
        return this.a;
    }

    public final RealConnection k() {
        return this.j;
    }

    public final EventListener l() {
        return this.e;
    }

    public final boolean m() {
        return this.c;
    }

    public final Exchange n() {
        return this.l;
    }

    public final Request o() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response p() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.a
            java.util.List r0 = r0.u()
            Da.A.D(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.a
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.a
            okhttp3.CookieJar r1 = r1.m()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.a
            okhttp3.Cache r1 = r1.f()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.a
            r2.add(r0)
            boolean r0 = r11.c
            if (r0 != 0) goto L46
            okhttp3.OkHttpClient r0 = r11.a
            java.util.List r0 = r0.w()
            Da.A.D(r2, r0)
        L46:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.c
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r11.b
            okhttp3.OkHttpClient r0 = r11.a
            int r6 = r0.j()
            okhttp3.OkHttpClient r0 = r11.a
            int r7 = r0.D()
            okhttp3.OkHttpClient r0 = r11.a
            int r8 = r0.I()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.b     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            okhttp3.Response r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.s(r0)
            return r2
        L7f:
            okhttp3.internal.Util.m(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La2
        L8c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.s(r1)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto La1
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
            goto La2
        La1:
            throw r1     // Catch: java.lang.Throwable -> L9c
        La2:
            if (r1 != 0) goto La7
            r11.s(r0)
        La7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.p():okhttp3.Response");
    }

    public final Exchange q(RealInterceptorChain chain) {
        t.g(chain, "chain");
        synchronized (this) {
            if (!this.o) {
                throw new IllegalStateException("released");
            }
            if (this.n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.m) {
                throw new IllegalStateException("Check failed.");
            }
            I i = I.a;
        }
        ExchangeFinder exchangeFinder = this.i;
        t.d(exchangeFinder);
        Exchange exchange = new Exchange(this, this.e, exchangeFinder, exchangeFinder.a(this.a, chain));
        this.l = exchange;
        this.q = exchange;
        synchronized (this) {
            this.m = true;
            this.n = true;
        }
        if (this.p) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public final IOException r(Exchange exchange, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        t.g(exchange, "exchange");
        if (!t.c(exchange, this.q)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.m) {
                        if (z2 || !this.n) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.m = false;
                    }
                    if (z2) {
                        this.n = false;
                    }
                    boolean z5 = this.m;
                    boolean z6 = (z5 || this.n) ? false : true;
                    if (!z5 && !this.n && !this.o) {
                        z3 = true;
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            I i = I.a;
        }
        if (z3) {
            this.q = null;
            RealConnection realConnection = this.j;
            if (realConnection != null) {
                realConnection.s();
            }
        }
        return z4 ? d(iOException) : iOException;
    }

    public final IOException s(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.o) {
                    this.o = false;
                    if (!this.m && !this.n) {
                        z = true;
                    }
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? d(iOException) : iOException;
    }

    public final String t() {
        return this.b.j().n();
    }

    public final Socket u() {
        RealConnection realConnection = this.j;
        t.d(realConnection);
        if (Util.h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List n = realConnection.n();
        Iterator it = n.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (t.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        n.remove(i);
        this.j = null;
        if (n.isEmpty()) {
            realConnection.C(System.nanoTime());
            if (this.d.c(realConnection)) {
                return realConnection.E();
            }
        }
        return null;
    }

    public final boolean v() {
        ExchangeFinder exchangeFinder = this.i;
        t.d(exchangeFinder);
        return exchangeFinder.e();
    }

    public final void w(RealConnection realConnection) {
        this.r = realConnection;
    }

    public final void x() {
        if (this.k) {
            throw new IllegalStateException("Check failed.");
        }
        this.k = true;
        this.f.x();
    }

    public final IOException y(IOException iOException) {
        if (this.k) {
            return iOException;
        }
        if (!this.f.x()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String z() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(t());
        return sb.toString();
    }
}
