package okhttp3.internal.http;

import java.util.List;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    public final RealCall a;
    public final List b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(RealCall call, List interceptors, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        t.g(call, "call");
        t.g(interceptors, "interceptors");
        t.g(request, "request");
        this.a = call;
        this.b = interceptors;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static /* synthetic */ RealInterceptorChain c(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        if ((i5 & 2) != 0) {
            exchange = realInterceptorChain.d;
        }
        Exchange exchange2 = exchange;
        if ((i5 & 4) != 0) {
            request = realInterceptorChain.e;
        }
        Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.f;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = realInterceptorChain.g;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.h;
        }
        return realInterceptorChain.b(i, exchange2, request2, i6, i7, i4);
    }

    public Response a(Request request) {
        t.g(request, "request");
        if (this.c >= this.b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        Exchange exchange = this.d;
        if (exchange != null) {
            if (!exchange.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain c = c(this, this.c + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = (Interceptor) this.b.get(this.c);
        Response a = interceptor.a(c);
        if (a == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.d != null && this.c + 1 < this.b.size() && c.i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (a.a() != null) {
            return a;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    public final RealInterceptorChain b(int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        t.g(request, "request");
        return new RealInterceptorChain(this.a, this.b, i, exchange, request, i2, i3, i4);
    }

    public Call call() {
        return this.a;
    }

    public final RealCall d() {
        return this.a;
    }

    public final int e() {
        return this.f;
    }

    public final Exchange f() {
        return this.d;
    }

    public final int g() {
        return this.g;
    }

    public final Request h() {
        return this.e;
    }

    public final int i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public Request request() {
        return this.e;
    }
}
