package com.applovin.shadow.okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void cacheMiss(Call call) {
        t.g(call, "call");
    }

    public void callEnd(Call call) {
        t.g(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        t.g(call, "call");
        t.g(iOException, "ioe");
    }

    public void callStart(Call call) {
        t.g(call, "call");
    }

    public void canceled(Call call) {
        t.g(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
        t.g(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        t.g(call, "call");
        t.g(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        t.g(call, "call");
        t.g(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List list) {
        t.g(call, "call");
        t.g(str, "domainName");
        t.g(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        t.g(call, "call");
        t.g(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List list) {
        t.g(call, "call");
        t.g(httpUrl, "url");
        t.g(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        t.g(call, "call");
        t.g(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        t.g(call, "call");
    }

    public void requestBodyStart(Call call) {
        t.g(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        t.g(call, "call");
        t.g(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        t.g(call, "call");
        t.g(request, "request");
    }

    public void requestHeadersStart(Call call) {
        t.g(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        t.g(call, "call");
    }

    public void responseBodyStart(Call call) {
        t.g(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        t.g(call, "call");
        t.g(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void responseHeadersStart(Call call) {
        t.g(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        t.g(call, "call");
    }

    public void secureConnectStart(Call call) {
        t.g(call, "call");
    }
}
