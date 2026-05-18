package com.applovin.shadow.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        t.g(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            t.f(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && t.c(((BasicTrustRootIndex) obj).subjectToCaCerts, this.subjectToCaCerts));
    }

    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        t.g(x509Certificate, "cert");
        Iterable iterable = (Set) this.subjectToCaCerts.get(x509Certificate.getIssuerX500Principal());
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
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
