package com.applovin.shadow.okhttp3;

import Ca.e;
import Ca.l;
import Ca.m;
import Da.D;
import Da.v;
import Da.w;
import com.applovin.shadow.okhttp3.internal.Util;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List localCertificates;
    private final l peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final List toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : v.n();
        }

        @e
        public final Handshake -deprecated_get(SSLSession sSLSession) throws IOException {
            t.g(sSLSession, "sslSession");
            return get(sSLSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List n;
            t.g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (t.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : t.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (t.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
            try {
                n = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                n = v.n();
            }
            return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(n));
        }

        private Companion() {
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, List list2) {
            t.g(tlsVersion, "tlsVersion");
            t.g(cipherSuite, "cipherSuite");
            t.g(list, "peerCertificates");
            t.g(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ Qa.a $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.a aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        public final List invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return v.n();
            }
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, Qa.a aVar) {
        t.g(tlsVersion, "tlsVersion");
        t.g(cipherSuite, "cipherSuite");
        t.g(list, "localCertificates");
        t.g(aVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = m.b(new 2(aVar));
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, List list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        t.f(type, "type");
        return type;
    }

    @e
    public final CipherSuite -deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @e
    public final List -deprecated_localCertificates() {
        return this.localCertificates;
    }

    @e
    public final Principal -deprecated_localPrincipal() {
        return localPrincipal();
    }

    @e
    public final List -deprecated_peerCertificates() {
        return peerCertificates();
    }

    @e
    public final Principal -deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @e
    public final TlsVersion -deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && t.c(handshake.cipherSuite, this.cipherSuite) && t.c(handshake.peerCertificates(), peerCertificates()) && t.c(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object h0 = D.h0(this.localCertificates);
        X509Certificate x509Certificate = h0 instanceof X509Certificate ? (X509Certificate) h0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object h0 = D.h0(peerCertificates());
        X509Certificate x509Certificate = h0 instanceof X509Certificate ? (X509Certificate) h0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(w.y(peerCertificates, 10));
        Iterator it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(w.y(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }
}
