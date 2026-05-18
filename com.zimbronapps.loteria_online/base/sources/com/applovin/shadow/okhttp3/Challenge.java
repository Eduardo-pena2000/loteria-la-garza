package com.applovin.shadow.okhttp3;

import Ca.e;
import Da.S;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Challenge {
    private final Map authParams;
    private final String scheme;

    public Challenge(String str, Map map) {
        String str2;
        t.g(str, "scheme");
        t.g(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                t.f(locale, "US");
                str2 = str3.toLowerCase(locale);
                t.f(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.f(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @e
    public final Map -deprecated_authParams() {
        return this.authParams;
    }

    @e
    public final Charset -deprecated_charset() {
        return charset();
    }

    @e
    public final String -deprecated_realm() {
        return realm();
    }

    @e
    public final String -deprecated_scheme() {
        return this.scheme;
    }

    public final Map authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = (String) this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                t.f(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        t.f(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (t.c(challenge.scheme, this.scheme) && t.c(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public final String realm() {
        return (String) this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        t.g(charset, "charset");
        Map C = S.C(this.authParams);
        String name = charset.name();
        t.f(name, "charset.name()");
        C.put("charset", name);
        return new Challenge(this.scheme, C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        t.g(str, "scheme");
        t.g(str2, "realm");
        Map singletonMap = Collections.singletonMap("realm", str2);
        t.f(singletonMap, "singletonMap(\"realm\", realm)");
        this(str, singletonMap);
    }
}
