package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion d = new Companion(null);
    public final X509TrustManager b;
    public final X509TrustManagerExtensions c;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final AndroidCertificateChainCleaner a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            t.g(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private Companion() {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        t.g(trustManager, "trustManager");
        t.g(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.b = trustManager;
        this.c = x509TrustManagerExtensions;
    }

    public List a(List chain, String hostname) {
        t.g(chain, "chain");
        t.g(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List checkServerTrusted = this.c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            t.f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).b == this.b;
    }

    public int hashCode() {
        return System.identityHashCode(this.b);
    }
}
