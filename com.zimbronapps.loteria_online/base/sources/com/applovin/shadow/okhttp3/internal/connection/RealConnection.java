package com.applovin.shadow.okhttp3.internal.connection;

import Da.w;
import Qa.a;
import Za.B;
import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.CertificatePinner;
import com.applovin.shadow.okhttp3.CipherSuite;
import com.applovin.shadow.okhttp3.Connection;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.Handshake;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http1.Http1ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.applovin.shadow.okhttp3.internal.http2.ErrorCode;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Http2ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okhttp3.internal.http2.StreamResetException;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okhttp3.internal.tls.OkHostnameVerifier;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Timeout;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            t.g(realConnectionPool, "connectionPool");
            t.g(route, "route");
            t.g(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            RealConnection.access$setSocket$p(realConnection, socket);
            realConnection.setIdleAtNs$okhttp(j);
            return realConnection;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements a {
        final /* synthetic */ Address $address;
        final /* synthetic */ CertificatePinner $certificatePinner;
        final /* synthetic */ Handshake $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.$certificatePinner = certificatePinner;
            this.$unverifiedHandshake = handshake;
            this.$address = address;
        }

        public final List invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
            t.d(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
        }
    }

    public static final class 2 extends u implements a {
        public 2() {
            super(0);
        }

        public final List invoke() {
            Handshake access$getHandshake$p = RealConnection.access$getHandshake$p(RealConnection.this);
            t.d(access$getHandshake$p);
            List<X509Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
            ArrayList arrayList = new ArrayList(w.y(peerCertificates, 10));
            for (X509Certificate x509Certificate : peerCertificates) {
                t.e(x509Certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add(x509Certificate);
            }
            return arrayList;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        t.g(realConnectionPool, "connectionPool");
        t.g(route, "route");
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public static final /* synthetic */ Handshake access$getHandshake$p(RealConnection realConnection) {
        return realConnection.handshake;
    }

    public static final /* synthetic */ void access$setSocket$p(RealConnection realConnection, Socket socket) {
        realConnection.socket = socket;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List peerCertificates = handshake.peerCertificates();
        if (peerCertificates.isEmpty()) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
        String host = httpUrl.host();
        Object obj = peerCertificates.get(0);
        t.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return okHostnameVerifier.verify(host, (X509Certificate) obj);
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = address.socketFactory().createSocket();
            t.d(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        createSocket.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(createSocket, this.route.socketAddress(), i);
            try {
                this.source = Okio.buffer(Okio.source(createSocket));
                this.sink = Okio.buffer(Okio.sink(createSocket));
            } catch (NullPointerException e) {
                if (t.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        SSLSocket sSLSocket;
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        try {
            t.d(sslSocketFactory);
            SSLSocket createSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            t.e(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket);
            if (configureSecureSocket.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.Companion;
            t.f(session, "sslSocketSession");
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            t.d(hostnameVerifier);
            if (hostnameVerifier.verify(address.url().host(), session)) {
                CertificatePinner certificatePinner = address.certificatePinner();
                t.d(certificatePinner);
                this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new 1(certificatePinner, handshake, address));
                certificatePinner.check$okhttp(address.url().host(), new 2());
                r2 = configureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket) : null;
                this.socket = sSLSocket;
                this.source = Okio.buffer(Okio.source((Socket) sSLSocket));
                this.sink = Okio.buffer(Okio.sink((Socket) sSLSocket));
                this.protocol = r2 != null ? Protocol.Companion.get(r2) : Protocol.HTTP_1_1;
                Platform.Companion.get().afterHandshake(sSLSocket);
                return;
            }
            List peerCertificates = handshake.peerCertificates();
            if (peerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Object obj = peerCertificates.get(0);
            t.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(Za.u.l("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", (String) null, 1, (Object) null));
        } catch (Throwable th2) {
            th = th2;
            r2 = sSLSocket;
            if (r2 != null) {
                Platform.Companion.get().afterHandshake(r2);
            }
            if (r2 != null) {
                Util.closeQuietly((Socket) r2);
            }
            throw th;
        }
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i4 = 0; i4 < 21; i4++) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.source;
            t.d(bufferedSource);
            BufferedSink bufferedSink = this.sink;
            t.d(bufferedSink);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i, timeUnit);
            bufferedSink.timeout().timeout(i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            t.d(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + build.code());
            }
            Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
            if (authenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (B.z("close", Response.header$default(build, "Connection", null, 2, null), true)) {
                return authenticate;
            }
            request = authenticate;
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", "okhttp/4.12.0").build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate == null ? build : authenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i);
                return;
            }
            return;
        }
        List protocols = this.route.address().protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!protocols.contains(protocol)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = protocol;
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Route route = (Route) it.next();
            Proxy.Type type = route.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.proxy().type() == type2 && t.c(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket = this.socket;
        t.d(socket);
        BufferedSource bufferedSource = this.source;
        t.d(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        t.d(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (t.c(httpUrl.host(), url.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        t.d(handshake);
        return certificateSupportHost(httpUrl, handshake);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, com.applovin.shadow.okhttp3.Call r22, com.applovin.shadow.okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, com.applovin.shadow.okhttp3.Call, com.applovin.shadow.okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        t.g(okHttpClient, "client");
        t.g(route, "failedRoute");
        t.g(iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List list) {
        t.g(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (t.c(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            t.d(certificatePinner);
            String host = address.url().host();
            Handshake handshake = handshake();
            t.d(handshake);
            certificatePinner.check(host, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z) {
        long j;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        t.d(socket);
        Socket socket2 = this.socket;
        t.d(socket2);
        BufferedSource bufferedSource = this.source;
        t.d(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.idleAtNs;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        t.g(okHttpClient, "client");
        t.g(realInterceptorChain, "chain");
        Socket socket = this.socket;
        t.d(socket);
        BufferedSource bufferedSource = this.source;
        t.d(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        t.d(bufferedSink);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        Timeout timeout = bufferedSource.timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSink.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
        t.g(exchange, "exchange");
        Socket socket = this.socket;
        t.d(socket);
        BufferedSource bufferedSource = this.source;
        t.d(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        t.d(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealConnection$newWebSocketStreams$1(bufferedSource, bufferedSink, exchange);
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        t.g(http2Connection, "connection");
        t.g(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    public void onStream(Http2Stream http2Stream) throws IOException {
        t.g(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    public Protocol protocol() {
        Protocol protocol = this.protocol;
        t.d(protocol);
        return protocol;
    }

    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public Socket socket() {
        Socket socket = this.socket;
        t.d(socket);
        return socket;
    }

    public String toString() {
        CipherSuite cipherSuite;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (cipherSuite = handshake.cipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb.append(cipherSuite);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        try {
            t.g(realCall, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
