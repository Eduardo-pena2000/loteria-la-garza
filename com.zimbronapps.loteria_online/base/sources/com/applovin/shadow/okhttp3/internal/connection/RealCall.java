package com.applovin.shadow.okhttp3.internal.connection;

import Ca.I;
import Ca.g;
import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.Callback;
import com.applovin.shadow.okhttp3.CertificatePinner;
import com.applovin.shadow.okhttp3.Dispatcher;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.AsyncTimeout;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final 1 timeout;
    private boolean timeoutEarlyExit;

    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            t.g(callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(ExecutorService executorService) {
            t.g(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    IOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            t.g(asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher dispatcher;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                RealCall.access$getTimeout$p(realCall).enter();
                try {
                    try {
                        z = true;
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                Platform.Companion.get().log("Callback failure for " + RealCall.access$toLoggableString(realCall), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            dispatcher = realCall.getClient().dispatcher();
                            dispatcher.finished$okhttp(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                g.a(iOException, th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public static final class CallReference extends WeakReference {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            t.g(realCall, "referent");
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public static final class 1 extends AsyncTimeout {
        public 1() {
        }

        public void timedOut() {
            RealCall.this.cancel();
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        t.g(okHttpClient, "client");
        t.g(request, "originalRequest");
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        1 r4 = new 1();
        r4.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r4;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    public static final /* synthetic */ 1 access$getTimeout$p(RealCall realCall) {
        return realCall.timeout;
    }

    public static final /* synthetic */ String access$toLoggableString(RealCall realCall) {
        return realCall.toLoggableString();
    }

    private final IOException callDone(IOException iOException) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = Util.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (releaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException timeoutExit = timeoutExit(iOException);
        if (iOException != null) {
            EventListener eventListener = this.eventListener;
            t.d(timeoutExit);
            eventListener.callFailed(this, timeoutExit);
        } else {
            this.eventListener.callEnd(this);
        }
        return timeoutExit;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final IOException timeoutExit(IOException iOException) {
        if (this.timeoutEarlyExit) {
            return iOException;
        }
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        t.g(realConnection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    public void enqueue(Callback callback) {
        t.g(callback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z) {
        t.g(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            I i = I.a;
        }
        if (z) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
        }
    }

    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            I i = I.a;
        }
        if (z && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.applovin.shadow.okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.applovin.shadow.okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.interceptors()
            Da.A.D(r2, r0)
            com.applovin.shadow.okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new com.applovin.shadow.okhttp3.internal.http.RetryAndFollowUpInterceptor
            com.applovin.shadow.okhttp3.OkHttpClient r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            com.applovin.shadow.okhttp3.internal.http.BridgeInterceptor r0 = new com.applovin.shadow.okhttp3.internal.http.BridgeInterceptor
            com.applovin.shadow.okhttp3.OkHttpClient r1 = r11.client
            com.applovin.shadow.okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            com.applovin.shadow.okhttp3.internal.cache.CacheInterceptor r0 = new com.applovin.shadow.okhttp3.internal.cache.CacheInterceptor
            com.applovin.shadow.okhttp3.OkHttpClient r1 = r11.client
            com.applovin.shadow.okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            com.applovin.shadow.okhttp3.internal.connection.ConnectInterceptor r0 = com.applovin.shadow.okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L46
            com.applovin.shadow.okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.networkInterceptors()
            Da.A.D(r2, r0)
        L46:
            com.applovin.shadow.okhttp3.internal.http.CallServerInterceptor r0 = new com.applovin.shadow.okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain r9 = new com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain
            com.applovin.shadow.okhttp3.Request r5 = r11.originalRequest
            com.applovin.shadow.okhttp3.OkHttpClient r0 = r11.client
            int r6 = r0.connectTimeoutMillis()
            com.applovin.shadow.okhttp3.OkHttpClient r0 = r11.client
            int r7 = r0.readTimeoutMillis()
            com.applovin.shadow.okhttp3.OkHttpClient r0 = r11.client
            int r8 = r0.writeTimeoutMillis()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            com.applovin.shadow.okhttp3.Request r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            com.applovin.shadow.okhttp3.Response r2 = r9.proceed(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.noMoreExchanges$okhttp(r0)
            return r2
        L7f:
            com.applovin.shadow.okhttp3.internal.Util.closeQuietly(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto L9c
        L8c:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.noMoreExchanges$okhttp(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.t.e(r1, r3)     // Catch: java.lang.Throwable -> L98
            throw r1     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L9c:
            if (r1 != 0) goto La1
            r11.noMoreExchanges$okhttp(r0)
        La1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():com.applovin.shadow.okhttp3.Response");
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain realInterceptorChain) {
        t.g(realInterceptorChain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            I i = I.a;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        t.d(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isExecuted() {
        return this.executed.get();
    }

    public final IOException messageDone$okhttp(Exchange exchange, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        t.g(exchange, "exchange");
        if (!t.c(exchange, this.exchange)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.requestBodyOpen) {
                        if (z2 || !this.responseBodyOpen) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.requestBodyOpen = false;
                    }
                    if (z2) {
                        this.responseBodyOpen = false;
                    }
                    boolean z5 = this.requestBodyOpen;
                    boolean z6 = (z5 || this.responseBodyOpen) ? false : true;
                    if (!z5 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                        z3 = true;
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            I i = I.a;
        }
        if (z3) {
            this.exchange = null;
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.incrementSuccessCount$okhttp();
            }
        }
        return z4 ? callDone(iOException) : iOException;
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z = true;
                    }
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        t.d(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List calls = realConnection.getCalls();
        Iterator it = calls.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (t.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        calls.remove(i);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs$okhttp(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        t.d(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.exit();
    }

    public AsyncTimeout timeout() {
        return this.timeout;
    }

    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
