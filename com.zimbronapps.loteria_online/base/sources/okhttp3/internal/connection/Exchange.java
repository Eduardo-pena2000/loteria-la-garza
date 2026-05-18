package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import xb.J;
import xb.L;
import xb.e;
import xb.n;
import xb.o;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Exchange {
    public final RealCall a;
    public final EventListener b;
    public final ExchangeFinder c;
    public final ExchangeCodec d;
    public boolean e;
    public boolean f;
    public final RealConnection g;

    public final class RequestBodySink extends n {
        public final long b;
        public boolean c;
        public long d;
        public boolean e;
        public final /* synthetic */ Exchange f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange this$0, J delegate, long j) {
            super(delegate);
            t.g(this$0, "this$0");
            t.g(delegate, "delegate");
            this.f = this$0;
            this.b = j;
        }

        private final IOException a(IOException iOException) {
            if (this.c) {
                return iOException;
            }
            this.c = true;
            return this.f.a(this.d, false, true, iOException);
        }

        public void close() {
            if (this.e) {
                return;
            }
            this.e = true;
            long j = this.b;
            if (j != -1 && this.d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        public void j1(e source, long j) {
            t.g(source, "source");
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.b;
            if (j2 == -1 || this.d + j <= j2) {
                try {
                    super.j1(source, j);
                    this.d += j;
                    return;
                } catch (IOException e) {
                    throw a(e);
                }
            }
            throw new ProtocolException("expected " + this.b + " bytes but received " + (this.d + j));
        }
    }

    public final class ResponseBodySource extends o {
        public final long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;
        public final /* synthetic */ Exchange g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange this$0, L delegate, long j) {
            super(delegate);
            t.g(this$0, "this$0");
            t.g(delegate, "delegate");
            this.g = this$0;
            this.b = j;
            this.d = true;
            if (j == 0) {
                b(null);
            }
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            try {
                long F = a().F(sink, j);
                if (this.d) {
                    this.d = false;
                    this.g.i().w(this.g.g());
                }
                if (F == -1) {
                    b(null);
                    return -1L;
                }
                long j2 = this.c + F;
                long j3 = this.b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
                }
                this.c = j2;
                if (j2 == j3) {
                    b(null);
                }
                return F;
            } catch (IOException e) {
                throw b(e);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.e) {
                return iOException;
            }
            this.e = true;
            if (iOException == null && this.d) {
                this.d = false;
                this.g.i().w(this.g.g());
            }
            return this.g.a(this.c, true, false, iOException);
        }

        public void close() {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        t.g(finder, "finder");
        t.g(codec, "codec");
        this.a = call;
        this.b = eventListener;
        this.c = finder;
        this.d = codec;
        this.g = codec.getConnection();
    }

    public final IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.b.s(this.a, iOException);
            } else {
                this.b.q(this.a, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.b.x(this.a, iOException);
            } else {
                this.b.v(this.a, j);
            }
        }
        return this.a.r(this, z2, z, iOException);
    }

    public final void b() {
        this.d.cancel();
    }

    public final J c(Request request, boolean z) {
        t.g(request, "request");
        this.e = z;
        RequestBody a = request.a();
        t.d(a);
        long a2 = a.a();
        this.b.r(this.a);
        return new RequestBodySink(this, this.d.c(request, a2), a2);
    }

    public final void d() {
        this.d.cancel();
        this.a.r(this, true, true, null);
    }

    public final void e() {
        try {
            this.d.finishRequest();
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }

    public final void f() {
        try {
            this.d.flushRequest();
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }

    public final RealCall g() {
        return this.a;
    }

    public final RealConnection h() {
        return this.g;
    }

    public final EventListener i() {
        return this.b;
    }

    public final ExchangeFinder j() {
        return this.c;
    }

    public final boolean k() {
        return this.f;
    }

    public final boolean l() {
        return !t.c(this.c.d().l().h(), this.g.A().a().l().h());
    }

    public final boolean m() {
        return this.e;
    }

    public final RealWebSocket.Streams n() {
        this.a.x();
        return this.d.getConnection().x(this);
    }

    public final void o() {
        this.d.getConnection().z();
    }

    public final void p() {
        this.a.r(this, true, false, null);
    }

    public final ResponseBody q(Response response) {
        t.g(response, "response");
        try {
            String o = Response.o(response, "Content-Type", null, 2, null);
            long b = this.d.b(response);
            return new RealResponseBody(o, b, x.d(new ResponseBodySource(this, this.d.a(response), b)));
        } catch (IOException e) {
            this.b.x(this.a, e);
            u(e);
            throw e;
        }
    }

    public final Response.Builder r(boolean z) {
        try {
            Response.Builder readResponseHeaders = this.d.readResponseHeaders(z);
            if (readResponseHeaders != null) {
                readResponseHeaders.m(this);
            }
            return readResponseHeaders;
        } catch (IOException e) {
            this.b.x(this.a, e);
            u(e);
            throw e;
        }
    }

    public final void s(Response response) {
        t.g(response, "response");
        this.b.y(this.a, response);
    }

    public final void t() {
        this.b.z(this.a);
    }

    public final void u(IOException iOException) {
        this.f = true;
        this.c.h(iOException);
        this.d.getConnection().H(this.a, iOException);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(Request request) {
        t.g(request, "request");
        try {
            this.b.u(this.a);
            this.d.d(request);
            this.b.t(this.a, request);
        } catch (IOException e) {
            this.b.s(this.a, e);
            u(e);
            throw e;
        }
    }
}
