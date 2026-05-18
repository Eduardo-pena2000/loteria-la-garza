package com.applovin.shadow.okhttp3;

import Ca.e;
import Da.D;
import Da.r;
import Da.v;
import Da.w;
import Za.B;
import Za.E;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okio.ByteString;
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
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set pins;

    public static final class Builder {
        private final List pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            t.g(str, "pattern");
            t.g(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(D.Q0(this.pins), null, 2, null);
        }

        public final List getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            t.g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            t.g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            t.f(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            t.g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            t.f(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            t.g(str, "pattern");
            t.g(str2, "pin");
            if ((!B.N(str, "*.", false, 2, (Object) null) || E.f0(str, "*", 1, false, 4, (Object) null) != -1) && ((!B.N(str, "**.", false, 2, (Object) null) || E.f0(str, "*", 2, false, 4, (Object) null) != -1) && E.f0(str, "*", 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.pattern = canonicalHost;
            if (B.N(str2, "sha1/", false, 2, (Object) null)) {
                this.hashAlgorithm = "sha1";
                ByteString.Companion companion = ByteString.Companion;
                String substring = str2.substring(5);
                t.f(substring, "this as java.lang.String).substring(startIndex)");
                ByteString decodeBase64 = companion.decodeBase64(substring);
                if (decodeBase64 != null) {
                    this.hash = decodeBase64;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + str2);
            }
            if (!B.N(str2, "sha256/", false, 2, (Object) null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.Companion;
            String substring2 = str2.substring(7);
            t.f(substring2, "this as java.lang.String).substring(startIndex)");
            ByteString decodeBase642 = companion2.decodeBase64(substring2);
            if (decodeBase642 != null) {
                this.hash = decodeBase642;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return t.c(this.pattern, pin.pattern) && t.c(this.hashAlgorithm, pin.hashAlgorithm) && t.c(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            t.g(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (t.c(str, "sha256")) {
                return t.c(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (t.c(str, "sha1")) {
                return t.c(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            t.g(str, "hostname");
            if (B.N(this.pattern, "**.", false, 2, (Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!B.C(str, str.length() - length, this.pattern, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!B.N(this.pattern, "*.", false, 2, (Object) null)) {
                    return t.c(str, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!B.C(str, str.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) || E.k0(str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        public final List invoke() {
            List<X509Certificate> list;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (list = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                list = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(w.y(list, 10));
            for (X509Certificate x509Certificate : list) {
                t.e(x509Certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add(x509Certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        t.g(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List list) throws SSLPeerUnverifiedException {
        t.g(str, "hostname");
        t.g(list, "peerCertificates");
        check$okhttp(str, new 1(list, str));
    }

    public final void check$okhttp(String str, Qa.a aVar) {
        t.g(str, "hostname");
        t.g(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) aVar.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteString = null;
            ByteString byteString2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (t.c(hashAlgorithm, "sha256")) {
                    if (byteString == null) {
                        byteString = Companion.sha256Hash(x509Certificate);
                    }
                    if (t.c(pin.getHash(), byteString)) {
                        return;
                    }
                } else {
                    if (!t.c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteString2 == null) {
                        byteString2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (t.c(pin.getHash(), byteString2)) {
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
            sb.append(Companion.pin(certificate));
            sb.append(": ");
            sb.append(certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (t.c(certificatePinner.pins, this.pins) && t.c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List findMatchingPins(String str) {
        t.g(str, "hostname");
        Iterable iterable = this.pins;
        ArrayList n = v.n();
        for (Object obj : iterable) {
            if (((Pin) obj).matchesHostname(str)) {
                if (n.isEmpty()) {
                    n = new ArrayList();
                }
                t.e(n, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                V.c(n).add(obj);
            }
        }
        return n;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        t.g(certificateChainCleaner, "certificateChainCleaner");
        return t.c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @e
    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        t.g(str, "hostname");
        t.g(certificateArr, "peerCertificates");
        check(str, r.S0(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, k kVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
