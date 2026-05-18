package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import xb.J;
import xb.L;
import xb.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final Companion g = new Companion(null);
    public static final List h = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List i = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final RealConnection a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List a(Request request) {
            t.g(request, "request");
            Headers f = request.f();
            ArrayList arrayList = new ArrayList(f.size() + 4);
            arrayList.add(new Header(Header.g, request.h()));
            arrayList.add(new Header(Header.h, RequestLine.a.c(request.j())));
            String d = request.d("Host");
            if (d != null) {
                arrayList.add(new Header(Header.j, d));
            }
            arrayList.add(new Header(Header.i, request.j().p()));
            int size = f.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String e = f.e(i);
                Locale US = Locale.US;
                t.f(US, "US");
                String lowerCase = e.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.e().contains(lowerCase) || (t.c(lowerCase, "te") && t.c(f.h(i), "trailers"))) {
                    arrayList.add(new Header(lowerCase, f.h(i)));
                }
                i = i2;
            }
            return arrayList;
        }

        public final Response.Builder b(Headers headerBlock, Protocol protocol) {
            t.g(headerBlock, "headerBlock");
            t.g(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String e = headerBlock.e(i);
                String h = headerBlock.h(i);
                if (t.c(e, ":status")) {
                    statusLine = StatusLine.d.a(t.o("HTTP/1.1 ", h));
                } else if (!Http2ExchangeCodec.f().contains(e)) {
                    builder.c(e, h);
                }
                i = i2;
            }
            if (statusLine != null) {
                return new Response.Builder().q(protocol).g(statusLine.b).n(statusLine.c).l(builder.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        t.g(client, "client");
        t.g(connection, "connection");
        t.g(chain, "chain");
        t.g(http2Connection, "http2Connection");
        this.a = connection;
        this.b = chain;
        this.c = http2Connection;
        List z = client.z();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = z.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    public static final /* synthetic */ List e() {
        return h;
    }

    public static final /* synthetic */ List f() {
        return i;
    }

    public L a(Response response) {
        t.g(response, "response");
        Http2Stream http2Stream = this.d;
        t.d(http2Stream);
        return http2Stream.p();
    }

    public long b(Response response) {
        t.g(response, "response");
        if (HttpHeaders.b(response)) {
            return Util.v(response);
        }
        return 0L;
    }

    public J c(Request request, long j) {
        t.g(request, "request");
        Http2Stream http2Stream = this.d;
        t.d(http2Stream);
        return http2Stream.n();
    }

    public void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream == null) {
            return;
        }
        http2Stream.f(ErrorCode.CANCEL);
    }

    public void d(Request request) {
        t.g(request, "request");
        if (this.d != null) {
            return;
        }
        this.d = this.c.Z(g.a(request), request.a() != null);
        if (this.f) {
            Http2Stream http2Stream = this.d;
            t.d(http2Stream);
            http2Stream.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.d;
        t.d(http2Stream2);
        M v = http2Stream2.v();
        long g2 = this.b.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v.g(g2, timeUnit);
        Http2Stream http2Stream3 = this.d;
        t.d(http2Stream3);
        http2Stream3.G().g(this.b.i(), timeUnit);
    }

    public void finishRequest() {
        Http2Stream http2Stream = this.d;
        t.d(http2Stream);
        http2Stream.n().close();
    }

    public void flushRequest() {
        this.c.flush();
    }

    public RealConnection getConnection() {
        return this.a;
    }

    public Response.Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream = this.d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder b = g.b(http2Stream.E(), this.e);
        if (z && b.h() == 100) {
            return null;
        }
        return b;
    }
}
