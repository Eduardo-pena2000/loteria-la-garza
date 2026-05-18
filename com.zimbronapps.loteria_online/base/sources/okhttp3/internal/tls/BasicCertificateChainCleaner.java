package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion c = new Companion(null);
    public final TrustRootIndex b;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        t.g(trustRootIndex, "trustRootIndex");
        this.b = trustRootIndex;
    }

    public List a(List chain, String hostname) {
        t.g(chain, "chain");
        t.g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        t.f(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.b.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature == null) {
                Iterator it = arrayDeque.iterator();
                t.f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(t.o("Failed to find a trusted cert that signed ", x509Certificate));
            }
            if (arrayList.size() > 1 || !t.c(x509Certificate, findByIssuerAndSignature)) {
                arrayList.add(findByIssuerAndSignature);
            }
            if (b(findByIssuerAndSignature, findByIssuerAndSignature)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException(t.o("Certificate chain too long: ", arrayList));
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!t.c(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && t.c(((BasicCertificateChainCleaner) obj).b, this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
