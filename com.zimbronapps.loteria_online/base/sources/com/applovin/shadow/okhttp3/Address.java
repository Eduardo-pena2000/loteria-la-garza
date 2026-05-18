package com.applovin.shadow.okhttp3;

import Ca.e;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        t.g(str, "uriHost");
        t.g(dns, "dns");
        t.g(socketFactory, "socketFactory");
        t.g(authenticator, "proxyAuthenticator");
        t.g(list, "protocols");
        t.g(list2, "connectionSpecs");
        t.g(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @e
    public final CertificatePinner -deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @e
    public final List -deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @e
    public final Dns -deprecated_dns() {
        return this.dns;
    }

    @e
    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @e
    public final List -deprecated_protocols() {
        return this.protocols;
    }

    @e
    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    @e
    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @e
    public final ProxySelector -deprecated_proxySelector() {
        return this.proxySelector;
    }

    @e
    public final SocketFactory -deprecated_socketFactory() {
        return this.socketFactory;
    }

    @e
    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @e
    public final HttpUrl -deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (t.c(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        t.g(address, "that");
        return t.c(this.dns, address.dns) && t.c(this.proxyAuthenticator, address.proxyAuthenticator) && t.c(this.protocols, address.protocols) && t.c(this.connectionSpecs, address.connectionSpecs) && t.c(this.proxySelector, address.proxySelector) && t.c(this.proxy, address.proxy) && t.c(this.sslSocketFactory, address.sslSocketFactory) && t.c(this.hostnameVerifier, address.hostnameVerifier) && t.c(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb;
        Proxy proxy;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            proxy = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            proxy = this.proxySelector;
        }
        sb.append(proxy);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }
}
