package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Address {
    public final Dns a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final Proxy g;
    public final ProxySelector h;
    public final HttpUrl i;
    public final List j;
    public final List k;

    public Address(String uriHost, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        t.g(uriHost, "uriHost");
        t.g(dns, "dns");
        t.g(socketFactory, "socketFactory");
        t.g(proxyAuthenticator, "proxyAuthenticator");
        t.g(protocols, "protocols");
        t.g(connectionSpecs, "connectionSpecs");
        t.g(proxySelector, "proxySelector");
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = proxyAuthenticator;
        this.g = proxy;
        this.h = proxySelector;
        this.i = new HttpUrl.Builder().v(sSLSocketFactory != null ? "https" : "http").l(uriHost).r(i).a();
        this.j = Util.V(protocols);
        this.k = Util.V(connectionSpecs);
    }

    public final CertificatePinner a() {
        return this.e;
    }

    public final List b() {
        return this.k;
    }

    public final Dns c() {
        return this.a;
    }

    public final boolean d(Address that) {
        t.g(that, "that");
        return t.c(this.a, that.a) && t.c(this.f, that.f) && t.c(this.j, that.j) && t.c(this.k, that.k) && t.c(this.h, that.h) && t.c(this.g, that.g) && t.c(this.c, that.c) && t.c(this.d, that.d) && t.c(this.e, that.e) && this.i.l() == that.i.l();
    }

    public final HostnameVerifier e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (t.c(this.i, address.i) && d(address)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        return this.j;
    }

    public final Proxy g() {
        return this.g;
    }

    public final Authenticator h() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.i.hashCode()) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.h.hashCode()) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final ProxySelector i() {
        return this.h;
    }

    public final SocketFactory j() {
        return this.b;
    }

    public final SSLSocketFactory k() {
        return this.c;
    }

    public final HttpUrl l() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.i.h());
        sb.append(':');
        sb.append(this.i.l());
        sb.append(", ");
        Proxy proxy = this.g;
        sb.append(proxy != null ? t.o("proxy=", proxy) : t.o("proxySelector=", this.h));
        sb.append('}');
        return sb.toString();
    }
}
