package okhttp3.internal.http1;

import Za.B;
import Za.E;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import xb.J;
import xb.L;
import xb.M;
import xb.e;
import xb.f;
import xb.g;
import xb.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion h = new Companion(null);
    public final OkHttpClient a;
    public final RealConnection b;
    public final g c;
    public final f d;
    public int e;
    public final HeadersReader f;
    public Headers g;

    public abstract class AbstractSource implements L {
        public final p a;
        public boolean b;
        public final /* synthetic */ Http1ExchangeCodec c;

        public AbstractSource(Http1ExchangeCodec this$0) {
            t.g(this$0, "this$0");
            this.c = this$0;
            this.a = new p(Http1ExchangeCodec.i(this$0).timeout());
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            try {
                return Http1ExchangeCodec.i(this.c).F(sink, j);
            } catch (IOException e) {
                this.c.getConnection().z();
                b();
                throw e;
            }
        }

        public final boolean a() {
            return this.b;
        }

        public final void b() {
            if (Http1ExchangeCodec.j(this.c) == 6) {
                return;
            }
            if (Http1ExchangeCodec.j(this.c) != 5) {
                throw new IllegalStateException(t.o("state: ", Integer.valueOf(Http1ExchangeCodec.j(this.c))));
            }
            Http1ExchangeCodec.e(this.c, this.a);
            Http1ExchangeCodec.l(this.c, 6);
        }

        public final void c(boolean z) {
            this.b = z;
        }

        public M timeout() {
            return this.a;
        }
    }

    public final class ChunkedSink implements J {
        public final p a;
        public boolean b;
        public final /* synthetic */ Http1ExchangeCodec c;

        public ChunkedSink(Http1ExchangeCodec this$0) {
            t.g(this$0, "this$0");
            this.c = this$0;
            this.a = new p(Http1ExchangeCodec.h(this$0).timeout());
        }

        public synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.h(this.c).writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec.e(this.c, this.a);
            Http1ExchangeCodec.l(this.c, 3);
        }

        public synchronized void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.h(this.c).flush();
        }

        public void j1(e source, long j) {
            t.g(source, "source");
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec.h(this.c).writeHexadecimalUnsignedLong(j);
            Http1ExchangeCodec.h(this.c).writeUtf8("\r\n");
            Http1ExchangeCodec.h(this.c).j1(source, j);
            Http1ExchangeCodec.h(this.c).writeUtf8("\r\n");
        }

        public M timeout() {
            return this.a;
        }
    }

    public final class ChunkedSource extends AbstractSource {
        public final HttpUrl d;
        public long e;
        public boolean f;
        public final /* synthetic */ Http1ExchangeCodec g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec this$0, HttpUrl url) {
            super(this$0);
            t.g(this$0, "this$0");
            t.g(url, "url");
            this.g = this$0;
            this.d = url;
            this.e = -1L;
            this.f = true;
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(t.o("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f) {
                return -1L;
            }
            long j2 = this.e;
            if (j2 == 0 || j2 == -1) {
                d();
                if (!this.f) {
                    return -1L;
                }
            }
            long F = super.F(sink, Math.min(j, this.e));
            if (F != -1) {
                this.e -= F;
                return F;
            }
            this.g.getConnection().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }

        public void close() {
            if (a()) {
                return;
            }
            if (this.f && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.g.getConnection().z();
                b();
            }
            c(true);
        }

        public final void d() {
            if (this.e != -1) {
                Http1ExchangeCodec.i(this.g).readUtf8LineStrict();
            }
            try {
                this.e = Http1ExchangeCodec.i(this.g).readHexadecimalUnsignedLong();
                String obj = E.j1(Http1ExchangeCodec.i(this.g).readUtf8LineStrict()).toString();
                if (this.e < 0 || (obj.length() > 0 && !B.N(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + obj + '\"');
                }
                if (this.e == 0) {
                    this.f = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.g;
                    Http1ExchangeCodec.m(http1ExchangeCodec, Http1ExchangeCodec.g(http1ExchangeCodec).a());
                    OkHttpClient f = Http1ExchangeCodec.f(this.g);
                    t.d(f);
                    CookieJar m = f.m();
                    HttpUrl httpUrl = this.d;
                    Headers k = Http1ExchangeCodec.k(this.g);
                    t.d(k);
                    HttpHeaders.f(m, httpUrl, k);
                    b();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class FixedLengthSource extends AbstractSource {
        public long d;
        public final /* synthetic */ Http1ExchangeCodec e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec this$0, long j) {
            super(this$0);
            t.g(this$0, "this$0");
            this.e = this$0;
            this.d = j;
            if (j == 0) {
                b();
            }
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(t.o("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.d;
            if (j2 == 0) {
                return -1L;
            }
            long F = super.F(sink, Math.min(j2, j));
            if (F == -1) {
                this.e.getConnection().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j3 = this.d - F;
            this.d = j3;
            if (j3 == 0) {
                b();
            }
            return F;
        }

        public void close() {
            if (a()) {
                return;
            }
            if (this.d != 0 && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.e.getConnection().z();
                b();
            }
            c(true);
        }
    }

    public final class KnownLengthSink implements J {
        public final p a;
        public boolean b;
        public final /* synthetic */ Http1ExchangeCodec c;

        public KnownLengthSink(Http1ExchangeCodec this$0) {
            t.g(this$0, "this$0");
            this.c = this$0;
            this.a = new p(Http1ExchangeCodec.h(this$0).timeout());
        }

        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.e(this.c, this.a);
            Http1ExchangeCodec.l(this.c, 3);
        }

        public void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.h(this.c).flush();
        }

        public void j1(e source, long j) {
            t.g(source, "source");
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Util.l(source.A(), 0L, j);
            Http1ExchangeCodec.h(this.c).j1(source, j);
        }

        public M timeout() {
            return this.a;
        }
    }

    public final class UnknownLengthSource extends AbstractSource {
        public boolean d;
        public final /* synthetic */ Http1ExchangeCodec e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec this$0) {
            super(this$0);
            t.g(this$0, "this$0");
            this.e = this$0;
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(t.o("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.d) {
                return -1L;
            }
            long F = super.F(sink, j);
            if (F != -1) {
                return F;
            }
            this.d = true;
            b();
            return -1L;
        }

        public void close() {
            if (a()) {
                return;
            }
            if (!this.d) {
                b();
            }
            c(true);
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, g source, f sink) {
        t.g(connection, "connection");
        t.g(source, "source");
        t.g(sink, "sink");
        this.a = okHttpClient;
        this.b = connection;
        this.c = source;
        this.d = sink;
        this.f = new HeadersReader(source);
    }

    public static final /* synthetic */ void e(Http1ExchangeCodec http1ExchangeCodec, p pVar) {
        http1ExchangeCodec.n(pVar);
    }

    public static final /* synthetic */ OkHttpClient f(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.a;
    }

    public static final /* synthetic */ HeadersReader g(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f;
    }

    public static final /* synthetic */ f h(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.d;
    }

    public static final /* synthetic */ g i(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.c;
    }

    public static final /* synthetic */ int j(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.e;
    }

    public static final /* synthetic */ Headers k(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.g;
    }

    public static final /* synthetic */ void l(Http1ExchangeCodec http1ExchangeCodec, int i) {
        http1ExchangeCodec.e = i;
    }

    public static final /* synthetic */ void m(Http1ExchangeCodec http1ExchangeCodec, Headers headers) {
        http1ExchangeCodec.g = headers;
    }

    public L a(Response response) {
        t.g(response, "response");
        if (!HttpHeaders.b(response)) {
            return s(0L);
        }
        if (p(response)) {
            return r(response.A().j());
        }
        long v = Util.v(response);
        return v != -1 ? s(v) : u();
    }

    public long b(Response response) {
        t.g(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0L;
        }
        if (p(response)) {
            return -1L;
        }
        return Util.v(response);
    }

    public J c(Request request, long j) {
        t.g(request, "request");
        if (request.a() != null && request.a().e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (o(request)) {
            return q();
        }
        if (j != -1) {
            return t();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void cancel() {
        getConnection().d();
    }

    public void d(Request request) {
        t.g(request, "request");
        RequestLine requestLine = RequestLine.a;
        Proxy.Type type = getConnection().A().b().type();
        t.f(type, "connection.route().proxy.type()");
        w(request.f(), requestLine.a(request, type));
    }

    public void finishRequest() {
        this.d.flush();
    }

    public void flushRequest() {
        this.d.flush();
    }

    public RealConnection getConnection() {
        return this.b;
    }

    public final void n(p pVar) {
        M j = pVar.j();
        pVar.k(M.e);
        j.a();
        j.b();
    }

    public final boolean o(Request request) {
        return B.z("chunked", request.d("Transfer-Encoding"), true);
    }

    public final boolean p(Response response) {
        return B.z("chunked", Response.o(response, "Transfer-Encoding", null, 2, null), true);
    }

    public final J q() {
        int i = this.e;
        if (i != 1) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.e = 2;
        return new ChunkedSink(this);
    }

    public final L r(HttpUrl httpUrl) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.e = 5;
        return new ChunkedSource(this, httpUrl);
    }

    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        try {
            StatusLine a = StatusLine.d.a(this.f.b());
            Response.Builder l = new Response.Builder().q(a.a).g(a.b).n(a.c).l(this.f.a());
            if (z && a.b == 100) {
                return null;
            }
            int i2 = a.b;
            if (i2 == 100) {
                this.e = 3;
                return l;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return l;
            }
            this.e = 3;
            return l;
        } catch (EOFException e) {
            throw new IOException(t.o("unexpected end of stream on ", getConnection().A().a().l().n()), e);
        }
    }

    public final L s(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.e = 5;
        return new FixedLengthSource(this, j);
    }

    public final J t() {
        int i = this.e;
        if (i != 1) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.e = 2;
        return new KnownLengthSink(this);
    }

    public final L u() {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.e = 5;
        getConnection().z();
        return new UnknownLengthSource(this);
    }

    public final void v(Response response) {
        t.g(response, "response");
        long v = Util.v(response);
        if (v == -1) {
            return;
        }
        L s = s(v);
        Util.M(s, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        s.close();
    }

    public final void w(Headers headers, String requestLine) {
        t.g(headers, "headers");
        t.g(requestLine, "requestLine");
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException(t.o("state: ", Integer.valueOf(i)).toString());
        }
        this.d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.writeUtf8(headers.e(i2)).writeUtf8(": ").writeUtf8(headers.h(i2)).writeUtf8("\r\n");
        }
        this.d.writeUtf8("\r\n");
        this.e = 1;
    }
}
