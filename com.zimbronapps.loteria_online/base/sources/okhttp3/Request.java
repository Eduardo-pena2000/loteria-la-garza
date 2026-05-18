package okhttp3;

import Ca.q;
import Da.S;
import Da.v;
import Za.B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Request {
    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Map e;
    public CacheControl f;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        t.g(url, "url");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(tags, "tags");
        this.a = url;
        this.b = method;
        this.c = headers;
        this.d = requestBody;
        this.e = tags;
    }

    public final RequestBody a() {
        return this.d;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b = CacheControl.n.b(this.c);
        this.f = b;
        return b;
    }

    public final Map c() {
        return this.e;
    }

    public final String d(String name) {
        t.g(name, "name");
        return this.c.a(name);
    }

    public final List e(String name) {
        t.g(name, "name");
        return this.c.j(name);
    }

    public final Headers f() {
        return this.c;
    }

    public final boolean g() {
        return this.a.i();
    }

    public final String h() {
        return this.b;
    }

    public final Builder i() {
        return new Builder(this);
    }

    public final HttpUrl j() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(h());
        sb.append(", url=");
        sb.append(j());
        if (f().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : f()) {
                int i2 = i + 1;
                if (i < 0) {
                    v.x();
                }
                q qVar = (q) obj;
                String str = (String) qVar.a();
                String str2 = (String) qVar.b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!c().isEmpty()) {
            sb.append(", tags=");
            sb.append(c());
        }
        sb.append('}');
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static class Builder {
        public HttpUrl a;
        public String b;
        public Headers.Builder c;
        public RequestBody d;
        public Map e;

        public Builder() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new Headers.Builder();
        }

        public Builder a(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            d().a(name, value);
            return this;
        }

        public Request b() {
            HttpUrl httpUrl = this.a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.b, this.c.e(), this.d, Util.W(this.e));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder c(CacheControl cacheControl) {
            t.g(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? i("Cache-Control") : f("Cache-Control", cacheControl2);
        }

        public final Headers.Builder d() {
            return this.c;
        }

        public final Map e() {
            return this.e;
        }

        public Builder f(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            d().i(name, value);
            return this;
        }

        public Builder g(Headers headers) {
            t.g(headers, "headers");
            k(headers.f());
            return this;
        }

        public Builder h(String method, RequestBody requestBody) {
            t.g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            l(method);
            j(requestBody);
            return this;
        }

        public Builder i(String name) {
            t.g(name, "name");
            d().h(name);
            return this;
        }

        public final void j(RequestBody requestBody) {
            this.d = requestBody;
        }

        public final void k(Headers.Builder builder) {
            t.g(builder, "<set-?>");
            this.c = builder;
        }

        public final void l(String str) {
            t.g(str, "<set-?>");
            this.b = str;
        }

        public final void m(Map map) {
            t.g(map, "<set-?>");
            this.e = map;
        }

        public final void n(HttpUrl httpUrl) {
            this.a = httpUrl;
        }

        public Builder o(Class type, Object obj) {
            t.g(type, "type");
            if (obj == null) {
                e().remove(type);
            } else {
                if (e().isEmpty()) {
                    m(new LinkedHashMap());
                }
                Map e = e();
                Object cast = type.cast(obj);
                t.d(cast);
                e.put(type, cast);
            }
            return this;
        }

        public Builder p(String url) {
            t.g(url, "url");
            if (B.L(url, "ws:", true)) {
                String substring = url.substring(3);
                t.f(substring, "this as java.lang.String).substring(startIndex)");
                url = t.o("http:", substring);
            } else if (B.L(url, "wss:", true)) {
                String substring2 = url.substring(4);
                t.f(substring2, "this as java.lang.String).substring(startIndex)");
                url = t.o("https:", substring2);
            }
            return q(HttpUrl.k.d(url));
        }

        public Builder q(HttpUrl url) {
            t.g(url, "url");
            n(url);
            return this;
        }

        public Builder(Request request) {
            LinkedHashMap C;
            t.g(request, "request");
            this.e = new LinkedHashMap();
            this.a = request.j();
            this.b = request.h();
            this.d = request.a();
            if (request.c().isEmpty()) {
                C = new LinkedHashMap();
            } else {
                C = S.C(request.c());
            }
            this.e = C;
            this.c = request.f().f();
        }
    }
}
