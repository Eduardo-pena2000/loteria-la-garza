package okhttp3;

import Ca.l;
import Ca.m;
import Da.v;
import Da.w;
import Qa.a;
import java.io.IOException;
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
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Handshake {
    public static final Companion e = new Companion(null);
    public final TlsVersion a;
    public final CipherSuite b;
    public final List c;
    public final l d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Handshake a(SSLSession sSLSession) {
            List n;
            t.g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (t.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : t.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(t.o("cipherSuite == ", cipherSuite));
            }
            CipherSuite b = CipherSuite.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (t.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion a = TlsVersion.b.a(protocol);
            try {
                n = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                n = v.n();
            }
            return new Handshake(a, b, c(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(n));
        }

        public final Handshake b(TlsVersion tlsVersion, CipherSuite cipherSuite, List peerCertificates, List localCertificates) {
            t.g(tlsVersion, "tlsVersion");
            t.g(cipherSuite, "cipherSuite");
            t.g(peerCertificates, "peerCertificates");
            t.g(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.V(localCertificates), new Handshake$Companion$get$1(Util.V(peerCertificates)));
        }

        public final List c(Certificate[] certificateArr) {
            return certificateArr != null ? Util.w(Arrays.copyOf(certificateArr, certificateArr.length)) : v.n();
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List localCertificates, a peerCertificatesFn) {
        t.g(tlsVersion, "tlsVersion");
        t.g(cipherSuite, "cipherSuite");
        t.g(localCertificates, "localCertificates");
        t.g(peerCertificatesFn, "peerCertificatesFn");
        this.a = tlsVersion;
        this.b = cipherSuite;
        this.c = localCertificates;
        this.d = m.b(new Handshake$peerCertificates$2(peerCertificatesFn));
    }

    public final CipherSuite a() {
        return this.b;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        t.f(type, "type");
        return type;
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return (List) this.d.getValue();
    }

    public final TlsVersion e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.a == this.a && t.c(handshake.b, this.b) && t.c(handshake.d(), d()) && t.c(handshake.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + d().hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        List d = d();
        ArrayList arrayList = new ArrayList(w.y(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(w.y(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
