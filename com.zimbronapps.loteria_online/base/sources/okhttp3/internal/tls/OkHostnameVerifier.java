package okhttp3.internal.tls;

import Da.D;
import Da.v;
import Za.B;
import Za.E;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import xb.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public final List a(X509Certificate certificate) {
        t.g(certificate, "certificate");
        return D.v0(c(certificate, 7), c(certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        t.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List c(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return v.n();
            }
            ArrayList arrayList = new ArrayList();
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && t.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return v.n();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) N.b(str, 0, 0, 3, null));
    }

    public final boolean e(String host, X509Certificate certificate) {
        t.g(host, "host");
        t.g(certificate, "certificate");
        return Util.i(host) ? h(host, certificate) : g(host, certificate);
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !B.N(str, ".", false, 2, null) && !B.y(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !B.N(str2, ".", false, 2, null) && !B.y(str2, "..", false, 2, null)) {
            if (!B.y(str, ".", false, 2, null)) {
                str = t.o(str, ".");
            }
            String str3 = str;
            if (!B.y(str2, ".", false, 2, null)) {
                str2 = t.o(str2, ".");
            }
            String b = b(str2);
            if (!E.T(b, "*", false, 2, null)) {
                return t.c(str3, b);
            }
            if (!B.N(b, "*.", false, 2, null) || E.e0(b, '*', 1, false, 4, null) != -1 || str3.length() < b.length() || t.c("*.", b)) {
                return false;
            }
            String substring = b.substring(1);
            t.f(substring, "this as java.lang.String).substring(startIndex)");
            if (!B.y(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || E.k0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String b = b(str);
        List c = c(x509Certificate, 2);
        if (c != null && c.isEmpty()) {
            return false;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (a.f(b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String e = HostnamesKt.e(str);
        List c = c(x509Certificate, 7);
        if (c != null && c.isEmpty()) {
            return false;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (t.c(e, HostnamesKt.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public boolean verify(String host, SSLSession session) {
        t.g(host, "host");
        t.g(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return e(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
