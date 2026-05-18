package okhttp3.internal.cache;

import Za.B;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import xb.J;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion b = new Companion(null);
    public final Cache a;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ Headers a(Companion companion, Headers headers, Headers headers2) {
            return companion.c(headers, headers2);
        }

        public static final /* synthetic */ Response b(Companion companion, Response response) {
            return companion.f(response);
        }

        public final Headers c(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String e = headers.e(i2);
                String h = headers.h(i2);
                if ((!B.z("Warning", e, true) || !B.N(h, "1", false, 2, null)) && (d(e) || !e(e) || headers2.a(e) == null)) {
                    builder.c(e, h);
                }
                i2 = i3;
            }
            int size2 = headers2.size();
            while (i < size2) {
                int i4 = i + 1;
                String e2 = headers2.e(i);
                if (!d(e2) && e(e2)) {
                    builder.c(e2, headers2.h(i));
                }
                i = i4;
            }
            return builder.e();
        }

        public final boolean d(String str) {
            return B.z("Content-Length", str, true) || B.z("Content-Encoding", str, true) || B.z("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return (B.z("Connection", str, true) || B.z("Keep-Alive", str, true) || B.z("Proxy-Authenticate", str, true) || B.z("Proxy-Authorization", str, true) || B.z("TE", str, true) || B.z("Trailers", str, true) || B.z("Transfer-Encoding", str, true) || B.z("Upgrade", str, true)) ? false : true;
        }

        public final Response f(Response response) {
            return (response == null ? null : response.a()) != null ? response.v().b(null).c() : response;
        }

        private Companion() {
        }
    }

    public CacheInterceptor(Cache cache) {
        this.a = cache;
    }

    public Response a(Interceptor.Chain chain) {
        ResponseBody a;
        ResponseBody a2;
        t.g(chain, "chain");
        Call call = chain.call();
        Cache cache = this.a;
        Response b2 = cache == null ? null : cache.b(chain.request());
        CacheStrategy b3 = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), b2).b();
        Request b4 = b3.b();
        Response a3 = b3.a();
        Cache cache2 = this.a;
        if (cache2 != null) {
            cache2.o(b3);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        EventListener l = realCall != null ? realCall.l() : null;
        if (l == null) {
            l = EventListener.b;
        }
        if (b2 != null && a3 == null && (a2 = b2.a()) != null) {
            Util.m(a2);
        }
        if (b4 == null && a3 == null) {
            Response c = new Response.Builder().s(chain.request()).q(Protocol.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(Util.c).t(-1L).r(System.currentTimeMillis()).c();
            l.A(call, c);
            return c;
        }
        if (b4 == null) {
            t.d(a3);
            Response c2 = a3.v().d(Companion.b(b, a3)).c();
            l.b(call, c2);
            return c2;
        }
        if (a3 != null) {
            l.a(call, a3);
        } else if (this.a != null) {
            l.c(call);
        }
        try {
            Response a4 = chain.a(b4);
            if (a4 == null && b2 != null && a != null) {
            }
            if (a3 != null) {
                if (a4 != null && a4.f() == 304) {
                    Response.Builder v = a3.v();
                    Companion companion = b;
                    Response c3 = v.l(Companion.a(companion, a3.r(), a4.r())).t(a4.B()).r(a4.z()).d(Companion.b(companion, a3)).o(Companion.b(companion, a4)).c();
                    ResponseBody a5 = a4.a();
                    t.d(a5);
                    a5.close();
                    Cache cache3 = this.a;
                    t.d(cache3);
                    cache3.m();
                    this.a.r(a3, c3);
                    l.b(call, c3);
                    return c3;
                }
                ResponseBody a6 = a3.a();
                if (a6 != null) {
                    Util.m(a6);
                }
            }
            t.d(a4);
            Response.Builder v2 = a4.v();
            Companion companion2 = b;
            Response c4 = v2.d(Companion.b(companion2, a3)).o(Companion.b(companion2, a4)).c();
            if (this.a != null) {
                if (HttpHeaders.b(c4) && CacheStrategy.c.a(c4, b4)) {
                    Response b5 = b(this.a.f(c4), c4);
                    if (a3 != null) {
                        l.c(call);
                    }
                    return b5;
                }
                if (HttpMethod.a.a(b4.h())) {
                    try {
                        this.a.g(b4);
                    } catch (IOException unused) {
                    }
                }
            }
            return c4;
        } finally {
            if (b2 != null && (a = b2.a()) != null) {
                Util.m(a);
            }
        }
    }

    public final Response b(CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        J body = cacheRequest.body();
        ResponseBody a = response.a();
        t.d(a);
        CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 cacheInterceptor$cacheWritingResponse$cacheWritingSource$1 = new CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(a.d(), cacheRequest, x.c(body));
        return response.v().b(new RealResponseBody(Response.o(response, "Content-Type", null, 2, null), response.a().b(), x.d(cacheInterceptor$cacheWritingResponse$cacheWritingSource$1))).c();
    }
}
