package okhttp3;

import Da.D;
import Da.v;
import Qa.a;
import Za.B;
import Za.E;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.tls.CertificateChainCleaner;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CertificatePinner {
    public static final Companion c = new Companion(null);
    public static final CertificatePinner d = new Builder().a();
    public final Set a;
    public final CertificateChainCleaner b;

    public static final class Builder {
        public final List a = new ArrayList();

        public final CertificatePinner a() {
            return new CertificatePinner(D.Q0(this.a), null, 2, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a(Certificate certificate) {
            t.g(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return t.o("sha256/", c((X509Certificate) certificate).a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final h b(X509Certificate x509Certificate) {
            t.g(x509Certificate, "<this>");
            h.a aVar = h.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            t.f(encoded, "publicKey.encoded");
            return h.a.g(aVar, encoded, 0, 0, 3, null).B();
        }

        public final h c(X509Certificate x509Certificate) {
            t.g(x509Certificate, "<this>");
            h.a aVar = h.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            t.f(encoded, "publicKey.encoded");
            return h.a.g(aVar, encoded, 0, 0, 3, null).C();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        public final String a;
        public final String b;
        public final h c;

        public final h a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c(String hostname) {
            t.g(hostname, "hostname");
            if (B.N(this.a, "**.", false, 2, null)) {
                int length = this.a.length() - 3;
                int length2 = hostname.length() - length;
                if (!B.C(hostname, hostname.length() - length, this.a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!B.N(this.a, "*.", false, 2, null)) {
                    return t.c(hostname, this.a);
                }
                int length3 = this.a.length() - 1;
                int length4 = hostname.length() - length3;
                if (!B.C(hostname, hostname.length() - length3, this.a, 1, length3, false, 16, null) || E.k0(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return t.c(this.a, pin.a) && t.c(this.b, pin.b) && t.c(this.c, pin.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return this.b + '/' + this.c.a();
        }
    }

    public CertificatePinner(Set pins, CertificateChainCleaner certificateChainCleaner) {
        t.g(pins, "pins");
        this.a = pins;
        this.b = certificateChainCleaner;
    }

    public final void a(String hostname, List peerCertificates) {
        t.g(hostname, "hostname");
        t.g(peerCertificates, "peerCertificates");
        b(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void b(String hostname, a cleanedPeerCertificatesFn) {
        t.g(hostname, "hostname");
        t.g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> c2 = c(hostname);
        if (c2.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            h hVar = null;
            h hVar2 = null;
            for (Pin pin : c2) {
                String b = pin.b();
                if (t.c(b, "sha256")) {
                    if (hVar == null) {
                        hVar = c.c(x509Certificate);
                    }
                    if (t.c(pin.a(), hVar)) {
                        return;
                    }
                } else {
                    if (!t.c(b, "sha1")) {
                        throw new AssertionError(t.o("unsupported hashAlgorithm: ", pin.b()));
                    }
                    if (hVar2 == null) {
                        hVar2 = c.b(x509Certificate);
                    }
                    if (t.c(pin.a(), hVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (X509Certificate) it.next();
            sb.append("\n    ");
            sb.append(c.a(certificate));
            sb.append(": ");
            sb.append(certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : c2) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public final List c(String hostname) {
        t.g(hostname, "hostname");
        Iterable iterable = this.a;
        ArrayList n = v.n();
        for (Object obj : iterable) {
            if (((Pin) obj).c(hostname)) {
                if (n.isEmpty()) {
                    n = new ArrayList();
                }
                V.c(n).add(obj);
            }
        }
        return n;
    }

    public final CertificateChainCleaner d() {
        return this.b;
    }

    public final CertificatePinner e(CertificateChainCleaner certificateChainCleaner) {
        t.g(certificateChainCleaner, "certificateChainCleaner");
        return t.c(this.b, certificateChainCleaner) ? this : new CertificatePinner(this.a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (t.c(certificatePinner.a, this.a) && t.c(certificatePinner.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, k kVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
