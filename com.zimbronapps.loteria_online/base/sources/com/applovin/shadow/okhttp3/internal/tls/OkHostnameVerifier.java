package com.applovin.shadow.okhttp3.internal.tls;

import Da.D;
import Da.v;
import Za.B;
import Za.E;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Utf8;
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

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        t.f(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List getSubjectAltNames(X509Certificate x509Certificate, int i) {
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

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (t.c(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List allSubjectAltNames(X509Certificate x509Certificate) {
        t.g(x509Certificate, "certificate");
        return D.v0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        t.g(str, "host");
        t.g(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        t.g(str, "host");
        t.g(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !B.N(str, ".", false, 2, (Object) null) && !B.y(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !B.N(str2, ".", false, 2, (Object) null) && !B.y(str2, "..", false, 2, (Object) null)) {
            if (!B.y(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!B.y(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!E.T(asciiToLowercase, "*", false, 2, (Object) null)) {
                return t.c(str3, asciiToLowercase);
            }
            if (!B.N(asciiToLowercase, "*.", false, 2, (Object) null) || E.e0(asciiToLowercase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < asciiToLowercase.length() || t.c("*.", asciiToLowercase)) {
                return false;
            }
            String substring = asciiToLowercase.substring(1);
            t.f(substring, "this as java.lang.String).substring(startIndex)");
            if (!B.y(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || E.k0(str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }
}
