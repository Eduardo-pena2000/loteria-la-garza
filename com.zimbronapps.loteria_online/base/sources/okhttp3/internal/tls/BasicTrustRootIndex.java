package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    public final Map a;

    public BasicTrustRootIndex(X509Certificate... caCerts) {
        t.g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = caCerts[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            t.f(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && t.c(((BasicTrustRootIndex) obj).a, this.a));
    }

    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        t.g(cert, "cert");
        Iterable iterable = (Set) this.a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
