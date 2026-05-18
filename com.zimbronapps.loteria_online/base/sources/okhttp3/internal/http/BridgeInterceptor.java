package okhttp3.internal.http;

import Da.v;
import Za.B;
import java.util.List;
import kotlin.jvm.internal.t;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import xb.q;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BridgeInterceptor implements Interceptor {
    public final CookieJar a;

    public BridgeInterceptor(CookieJar cookieJar) {
        t.g(cookieJar, "cookieJar");
        this.a = cookieJar;
    }

    public Response a(Interceptor.Chain chain) {
        ResponseBody a;
        t.g(chain, "chain");
        Request request = chain.request();
        Request.Builder i = request.i();
        RequestBody a2 = request.a();
        if (a2 != null) {
            MediaType b = a2.b();
            if (b != null) {
                i.f("Content-Type", b.toString());
            }
            long a3 = a2.a();
            if (a3 != -1) {
                i.f("Content-Length", String.valueOf(a3));
                i.i("Transfer-Encoding");
            } else {
                i.f("Transfer-Encoding", "chunked");
                i.i("Content-Length");
            }
        }
        boolean z = false;
        if (request.d("Host") == null) {
            i.f("Host", Util.U(request.j(), false, 1, null));
        }
        if (request.d("Connection") == null) {
            i.f("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            i.f("Accept-Encoding", "gzip");
            z = true;
        }
        List a4 = this.a.a(request.j());
        if (!a4.isEmpty()) {
            i.f("Cookie", b(a4));
        }
        if (request.d("User-Agent") == null) {
            i.f("User-Agent", "okhttp/4.11.0");
        }
        Response a5 = chain.a(i.b());
        HttpHeaders.f(this.a, request.j(), a5.r());
        Response.Builder s = a5.v().s(request);
        if (z && B.z("gzip", Response.o(a5, "Content-Encoding", null, 2, null), true) && HttpHeaders.b(a5) && (a = a5.a()) != null) {
            q qVar = new q(a.d());
            s.l(a5.r().f().h("Content-Encoding").h("Content-Length").e());
            s.b(new RealResponseBody(Response.o(a5, "Content-Type", null, 2, null), -1L, x.d(qVar)));
        }
        return s.c();
    }

    public final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.x();
            }
            Cookie cookie = (Cookie) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(cookie.i());
            sb.append('=');
            sb.append(cookie.n());
            i = i2;
        }
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
