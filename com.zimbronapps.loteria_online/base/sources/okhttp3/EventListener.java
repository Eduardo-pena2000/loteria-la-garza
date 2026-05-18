package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class EventListener {
    public static final Companion a = new Companion(null);
    public static final EventListener b = new EventListener$Companion$NONE$1();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener a(Call call);
    }

    public void A(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void B(Call call, Handshake handshake) {
        t.g(call, "call");
    }

    public void C(Call call) {
        t.g(call, "call");
    }

    public void a(Call call, Response cachedResponse) {
        t.g(call, "call");
        t.g(cachedResponse, "cachedResponse");
    }

    public void b(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void c(Call call) {
        t.g(call, "call");
    }

    public void d(Call call) {
        t.g(call, "call");
    }

    public void e(Call call, IOException ioe) {
        t.g(call, "call");
        t.g(ioe, "ioe");
    }

    public void f(Call call) {
        t.g(call, "call");
    }

    public void g(Call call) {
        t.g(call, "call");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
        t.g(ioe, "ioe");
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        t.g(call, "call");
        t.g(inetSocketAddress, "inetSocketAddress");
        t.g(proxy, "proxy");
    }

    public void k(Call call, Connection connection) {
        t.g(call, "call");
        t.g(connection, "connection");
    }

    public void l(Call call, Connection connection) {
        t.g(call, "call");
        t.g(connection, "connection");
    }

    public void m(Call call, String domainName, List inetAddressList) {
        t.g(call, "call");
        t.g(domainName, "domainName");
        t.g(inetAddressList, "inetAddressList");
    }

    public void n(Call call, String domainName) {
        t.g(call, "call");
        t.g(domainName, "domainName");
    }

    public void o(Call call, HttpUrl url, List proxies) {
        t.g(call, "call");
        t.g(url, "url");
        t.g(proxies, "proxies");
    }

    public void p(Call call, HttpUrl url) {
        t.g(call, "call");
        t.g(url, "url");
    }

    public void q(Call call, long j) {
        t.g(call, "call");
    }

    public void r(Call call) {
        t.g(call, "call");
    }

    public void s(Call call, IOException ioe) {
        t.g(call, "call");
        t.g(ioe, "ioe");
    }

    public void t(Call call, Request request) {
        t.g(call, "call");
        t.g(request, "request");
    }

    public void u(Call call) {
        t.g(call, "call");
    }

    public void v(Call call, long j) {
        t.g(call, "call");
    }

    public void w(Call call) {
        t.g(call, "call");
    }

    public void x(Call call, IOException ioe) {
        t.g(call, "call");
        t.g(ioe, "ioe");
    }

    public void y(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
    }

    public void z(Call call) {
        t.g(call, "call");
    }
}
