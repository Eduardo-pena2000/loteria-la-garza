package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Challenge {
    public final String a;
    public final Map b;

    public Challenge(String scheme, Map authParams) {
        String lowerCase;
        t.g(scheme, "scheme");
        t.g(authParams, "authParams");
        this.a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                t.f(US, "US");
                lowerCase = str.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.f(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.b = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                t.f(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        t.f(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return (String) this.b.get("realm");
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (t.c(challenge.a, this.a) && t.c(challenge.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.a + " authParams=" + this.b;
    }
}
