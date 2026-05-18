package okhttp3;

import Da.v;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Response implements Closeable {
    public final Request a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final Handshake e;
    public final Headers f;
    public final ResponseBody g;
    public final Response h;
    public final Response i;
    public final Response j;
    public final long k;
    public final long l;
    public final Exchange m;
    public CacheControl n;

    public Response(Request request, Protocol protocol, String message, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        t.g(request, "request");
        t.g(protocol, "protocol");
        t.g(message, "message");
        t.g(headers, "headers");
        this.a = request;
        this.b = protocol;
        this.c = message;
        this.d = i;
        this.e = handshake;
        this.f = headers;
        this.g = responseBody;
        this.h = response;
        this.i = response2;
        this.j = response3;
        this.k = j;
        this.l = j2;
        this.m = exchange;
    }

    public static /* synthetic */ String o(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.m(str, str2);
    }

    public final Request A() {
        return this.a;
    }

    public final long B() {
        return this.k;
    }

    public final ResponseBody a() {
        return this.g;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.n;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl b = CacheControl.n.b(this.f);
        this.n = b;
        return b;
    }

    public final Response c() {
        return this.i;
    }

    public void close() {
        ResponseBody responseBody = this.g;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final List d() {
        String str;
        Headers headers = this.f;
        int i = this.d;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return v.n();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.a(headers, str);
    }

    public final int f() {
        return this.d;
    }

    public final Exchange g() {
        return this.m;
    }

    public final Handshake h() {
        return this.e;
    }

    public final String k(String name) {
        t.g(name, "name");
        return o(this, name, null, 2, null);
    }

    public final String m(String name, String str) {
        t.g(name, "name");
        String a = this.f.a(name);
        return a == null ? str : a;
    }

    public final Headers r() {
        return this.f;
    }

    public final boolean s() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final String t() {
        return this.c;
    }

    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.j() + '}';
    }

    public final Response u() {
        return this.h;
    }

    public final Builder v() {
        return new Builder(this);
    }

    public final Response x() {
        return this.j;
    }

    public final Protocol y() {
        return this.b;
    }

    public final long z() {
        return this.l;
    }

    public static class Builder {
        public Request a;
        public Protocol b;
        public int c;
        public String d;
        public Handshake e;
        public Headers.Builder f;
        public ResponseBody g;
        public Response h;
        public Response i;
        public Response j;
        public long k;
        public long l;
        public Exchange m;

        public Builder() {
            this.c = -1;
            this.f = new Headers.Builder();
        }

        public final void A(Response response) {
            this.h = response;
        }

        public final void B(Response response) {
            this.j = response;
        }

        public final void C(Protocol protocol) {
            this.b = protocol;
        }

        public final void D(long j) {
            this.l = j;
        }

        public final void E(Request request) {
            this.a = request;
        }

        public final void F(long j) {
            this.k = j;
        }

        public Builder a(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            i().a(name, value);
            return this;
        }

        public Builder b(ResponseBody responseBody) {
            u(responseBody);
            return this;
        }

        public Response c() {
            int i = this.c;
            if (i < 0) {
                throw new IllegalStateException(t.o("code < 0: ", Integer.valueOf(h())).toString());
            }
            Request request = this.a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.d;
            if (str != null) {
                return new Response(request, protocol, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder d(Response response) {
            f("cacheResponse", response);
            v(response);
            return this;
        }

        public final void e(Response response) {
            if (response != null && response.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.a() != null) {
                throw new IllegalArgumentException(t.o(str, ".body != null").toString());
            }
            if (response.u() != null) {
                throw new IllegalArgumentException(t.o(str, ".networkResponse != null").toString());
            }
            if (response.c() != null) {
                throw new IllegalArgumentException(t.o(str, ".cacheResponse != null").toString());
            }
            if (response.x() != null) {
                throw new IllegalArgumentException(t.o(str, ".priorResponse != null").toString());
            }
        }

        public Builder g(int i) {
            w(i);
            return this;
        }

        public final int h() {
            return this.c;
        }

        public final Headers.Builder i() {
            return this.f;
        }

        public Builder j(Handshake handshake) {
            x(handshake);
            return this;
        }

        public Builder k(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            i().i(name, value);
            return this;
        }

        public Builder l(Headers headers) {
            t.g(headers, "headers");
            y(headers.f());
            return this;
        }

        public final void m(Exchange deferredTrailers) {
            t.g(deferredTrailers, "deferredTrailers");
            this.m = deferredTrailers;
        }

        public Builder n(String message) {
            t.g(message, "message");
            z(message);
            return this;
        }

        public Builder o(Response response) {
            f("networkResponse", response);
            A(response);
            return this;
        }

        public Builder p(Response response) {
            e(response);
            B(response);
            return this;
        }

        public Builder q(Protocol protocol) {
            t.g(protocol, "protocol");
            C(protocol);
            return this;
        }

        public Builder r(long j) {
            D(j);
            return this;
        }

        public Builder s(Request request) {
            t.g(request, "request");
            E(request);
            return this;
        }

        public Builder t(long j) {
            F(j);
            return this;
        }

        public final void u(ResponseBody responseBody) {
            this.g = responseBody;
        }

        public final void v(Response response) {
            this.i = response;
        }

        public final void w(int i) {
            this.c = i;
        }

        public final void x(Handshake handshake) {
            this.e = handshake;
        }

        public final void y(Headers.Builder builder) {
            t.g(builder, "<set-?>");
            this.f = builder;
        }

        public final void z(String str) {
            this.d = str;
        }

        public Builder(Response response) {
            t.g(response, "response");
            this.c = -1;
            this.a = response.A();
            this.b = response.y();
            this.c = response.f();
            this.d = response.t();
            this.e = response.h();
            this.f = response.r().f();
            this.g = response.a();
            this.h = response.u();
            this.i = response.c();
            this.j = response.x();
            this.k = response.B();
            this.l = response.z();
            this.m = response.g();
        }
    }
}
