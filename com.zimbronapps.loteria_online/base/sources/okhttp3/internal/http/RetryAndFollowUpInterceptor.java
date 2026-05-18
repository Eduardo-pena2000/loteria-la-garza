package okhttp3.internal.http;

import Za.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion b = new Companion(null);
    public final OkHttpClient a;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        t.g(client, "client");
        this.a = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.v().p(r7.v().b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r0 = r1.n();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0.f() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r0 = r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r8 > 20) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        throw new java.net.ProtocolException(kotlin.jvm.internal.t.o("Too many follow-up requests: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        okhttp3.internal.Util.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r0.m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r1.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response a(okhttp3.Interceptor.Chain r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.t.g(r11, r0)
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.h()
            okhttp3.internal.connection.RealCall r1 = r11.d()
            java.util.List r2 = Da.v.n()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.h(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Lc9
            okhttp3.Response r0 = r11.a(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L93 okhttp3.internal.connection.RouteException -> Lac
            if (r7 == 0) goto L40
            okhttp3.Response$Builder r0 = r0.v()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r6 = r7.v()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r6 = r6.b(r4)     // Catch: java.lang.Throwable -> L42
            okhttp3.Response r6 = r6.c()     // Catch: java.lang.Throwable -> L42
            okhttp3.Response$Builder r0 = r0.p(r6)     // Catch: java.lang.Throwable -> L42
            okhttp3.Response r0 = r0.c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ld1
        L45:
            okhttp3.internal.connection.Exchange r0 = r1.n()     // Catch: java.lang.Throwable -> L42
            okhttp3.Request r6 = r10.c(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.x()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.i(r3)
            return r7
        L5e:
            okhttp3.RequestBody r0 = r6.a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.i(r3)
            return r7
        L6e:
            okhttp3.ResponseBody r0 = r7.a()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L75
            goto L78
        L75:
            okhttp3.internal.Util.m(r0)     // Catch: java.lang.Throwable -> L42
        L78:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L83
            r1.i(r5)
            r0 = r6
            goto L18
        L83:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = kotlin.jvm.internal.t.o(r0, r2)     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L93:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto La7
            java.util.List r2 = Da.D.w0(r2, r6)     // Catch: java.lang.Throwable -> L42
        La1:
            r1.i(r5)
            r6 = r3
            goto L19
        La7:
            java.lang.Throwable r11 = okhttp3.internal.Util.b0(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lac:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lc0
            java.io.IOException r6 = r6.b()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = Da.D.w0(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La1
        Lc0:
            java.io.IOException r11 = r6.b()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = okhttp3.internal.Util.b0(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lc9:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld1:
            r1.i(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.a(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    public final Request b(Response response, String str) {
        String o;
        HttpUrl o2;
        if (!this.a.q() || (o = Response.o(response, "Location", null, 2, null)) == null || (o2 = response.A().j().o(o)) == null) {
            return null;
        }
        if (!t.c(o2.p(), response.A().j().p()) && !this.a.r()) {
            return null;
        }
        Request.Builder i = response.A().i();
        if (HttpMethod.b(str)) {
            int f = response.f();
            HttpMethod httpMethod = HttpMethod.a;
            boolean z = httpMethod.d(str) || f == 308 || f == 307;
            if (!httpMethod.c(str) || f == 308 || f == 307) {
                i.h(str, z ? response.A().a() : null);
            } else {
                i.h("GET", null);
            }
            if (!z) {
                i.i("Transfer-Encoding");
                i.i("Content-Length");
                i.i("Content-Type");
            }
        }
        if (!Util.j(response.A().j(), o2)) {
            i.i("Authorization");
        }
        return i.q(o2).b();
    }

    public final Request c(Response response, Exchange exchange) {
        RealConnection h;
        Route A = (exchange == null || (h = exchange.h()) == null) ? null : h.A();
        int f = response.f();
        String h2 = response.A().h();
        if (f != 307 && f != 308) {
            if (f == 401) {
                return this.a.e().a(A, response);
            }
            if (f == 421) {
                RequestBody a = response.A().a();
                if ((a != null && a.f()) || exchange == null || !exchange.l()) {
                    return null;
                }
                exchange.h().y();
                return response.A();
            }
            if (f == 503) {
                Response x = response.x();
                if ((x == null || x.f() != 503) && g(response, Integer.MAX_VALUE) == 0) {
                    return response.A();
                }
                return null;
            }
            if (f == 407) {
                t.d(A);
                if (A.b().type() == Proxy.Type.HTTP) {
                    return this.a.B().a(A, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (f == 408) {
                if (!this.a.E()) {
                    return null;
                }
                RequestBody a2 = response.A().a();
                if (a2 != null && a2.f()) {
                    return null;
                }
                Response x2 = response.x();
                if ((x2 == null || x2.f() != 408) && g(response, 0) <= 0) {
                    return response.A();
                }
                return null;
            }
            switch (f) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(response, h2);
    }

    public final boolean d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean e(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (this.a.E()) {
            return !(z && f(iOException, request)) && d(iOException, z) && realCall.v();
        }
        return false;
    }

    public final boolean f(IOException iOException, Request request) {
        RequestBody a = request.a();
        return (a != null && a.f()) || (iOException instanceof FileNotFoundException);
    }

    public final int g(Response response, int i) {
        CharSequence o = Response.o(response, "Retry-After", null, 2, null);
        if (o == null) {
            return i;
        }
        if (!new o("\\d+").h(o)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(o);
        t.f(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }
}
