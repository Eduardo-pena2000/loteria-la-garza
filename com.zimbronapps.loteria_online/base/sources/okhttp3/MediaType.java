package okhttp3;

import Ka.c;
import Za.B;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MediaType {
    public static final Companion e = new Companion(null);
    public static final Pattern f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final MediaType a(String str) {
            t.g(str, "<this>");
            Matcher matcher = MediaType.b().matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            t.f(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            t.f(US, "US");
            String lowerCase = group.toLowerCase(US);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            t.f(group2, "typeSubtype.group(2)");
            t.f(US, "US");
            String lowerCase2 = group2.toLowerCase(US);
            t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.a().matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    t.f(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (B.N(group4, "'", false, 2, null) && B.y(group4, "'", false, 2, null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        t.f(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final MediaType b(String str) {
            t.g(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, k kVar) {
        this(str, str2, str3, strArr);
    }

    public static final /* synthetic */ Pattern a() {
        return g;
    }

    public static final /* synthetic */ Pattern b() {
        return f;
    }

    public static /* synthetic */ Charset d(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.c(charset);
    }

    public static final MediaType f(String str) {
        return e.b(str);
    }

    public final Charset c(Charset charset) {
        String e2 = e("charset");
        if (e2 == null) {
            return charset;
        }
        try {
            return Charset.forName(e2);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        t.g(name, "name");
        int i = 0;
        int c = c.c(0, this.d.length - 1, 2);
        if (c < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            if (B.z(this.d[i], name, true)) {
                return this.d[i + 1];
            }
            if (i == c) {
                return null;
            }
            i = i2;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && t.c(((MediaType) obj).a, this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }
}
