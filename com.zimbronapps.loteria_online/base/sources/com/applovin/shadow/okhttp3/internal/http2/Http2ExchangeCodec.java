package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http.RequestLine;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    public static final Companion Companion = new Companion(null);
    private static final List HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List http2HeadersList(Request request) {
            t.g(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String header = request.header("Host");
            if (header != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                Locale locale = Locale.US;
                t.f(locale, "US");
                String lowerCase = name.toLowerCase(locale);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp().contains(lowerCase) || (t.c(lowerCase, "te") && t.c(headers.value(i), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
            t.g(headers, "headerBlock");
            t.g(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (t.c(name, ":status")) {
                    statusLine = StatusLine.Companion.parse("HTTP/1.1 " + value);
                } else if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp().contains(name)) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        t.g(okHttpClient, "client");
        t.g(realConnection, "connection");
        t.g(realInterceptorChain, "chain");
        t.g(http2Connection, "http2Connection");
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    public static final /* synthetic */ List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
        return HTTP_2_SKIPPED_REQUEST_HEADERS;
    }

    public static final /* synthetic */ List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
        return HTTP_2_SKIPPED_RESPONSE_HEADERS;
    }

    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    public Sink createRequestBody(Request request, long j) {
        t.g(request, "request");
        Http2Stream http2Stream = this.stream;
        t.d(http2Stream);
        return http2Stream.getSink();
    }

    public void finishRequest() {
        Http2Stream http2Stream = this.stream;
        t.d(http2Stream);
        http2Stream.getSink().close();
    }

    public void flushRequest() {
        this.http2Connection.flush();
    }

    public RealConnection getConnection() {
        return this.connection;
    }

    public Source openResponseBodySource(Response response) {
        t.g(response, "response");
        Http2Stream http2Stream = this.stream;
        t.d(http2Stream);
        return http2Stream.getSource$okhttp();
    }

    public Response.Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder readHttp2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (z && readHttp2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    public long reportedContentLength(Response response) {
        t.g(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        t.d(http2Stream);
        return http2Stream.trailers();
    }

    public void writeRequestHeaders(Request request) {
        t.g(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            t.d(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        t.d(http2Stream2);
        Timeout readTimeout = http2Stream2.readTimeout();
        long readTimeoutMillis$okhttp = this.chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        readTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        t.d(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
    }
}
