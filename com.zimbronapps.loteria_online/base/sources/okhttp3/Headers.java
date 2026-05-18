package okhttp3;

import Ca.q;
import Ca.x;
import Da.A;
import Da.v;
import Ka.c;
import Ra.a;
import Za.B;
import Za.E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Headers implements Iterable, a {
    public static final Companion b = new Companion(null);
    public final String[] a;

    public static final class Builder {
        public final List a = new ArrayList(20);

        public final Builder a(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            Companion companion = Headers.b;
            Companion.a(companion, name);
            Companion.b(companion, value, name);
            c(name, value);
            return this;
        }

        public final Builder b(String line) {
            t.g(line, "line");
            int e0 = E.e0(line, ':', 1, false, 4, null);
            if (e0 != -1) {
                String substring = line.substring(0, e0);
                t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(e0 + 1);
                t.f(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                t.f(substring3, "this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", line);
            }
            return this;
        }

        public final Builder c(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            g().add(name);
            g().add(E.j1(value).toString());
            return this;
        }

        public final Builder d(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            Companion.a(Headers.b, name);
            c(name, value);
            return this;
        }

        public final Headers e() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String f(String name) {
            t.g(name, "name");
            int size = this.a.size() - 2;
            int c = c.c(size, 0, -2);
            if (c > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (B.z(name, (String) this.a.get(size), true)) {
                    return (String) this.a.get(size + 1);
                }
                if (size == c) {
                    return null;
                }
                size = i;
            }
        }

        public final List g() {
            return this.a;
        }

        public final Builder h(String name) {
            t.g(name, "name");
            int i = 0;
            while (i < g().size()) {
                if (B.z(name, (String) g().get(i), true)) {
                    g().remove(i);
                    g().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder i(String name, String value) {
            t.g(name, "name");
            t.g(value, "value");
            Companion companion = Headers.b;
            Companion.a(companion, name);
            Companion.b(companion, value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ void a(Companion companion, String str) {
            companion.d(str);
        }

        public static final /* synthetic */ void b(Companion companion, String str, String str2) {
            companion.e(str, str2);
        }

        public static final /* synthetic */ String c(Companion companion, String[] strArr, String str) {
            return companion.f(strArr, str);
        }

        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
                i = i2;
            }
        }

        public final void e(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    throw new IllegalArgumentException(t.o(Util.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2), Util.H(str2) ? "" : t.o(": ", str)).toString());
                }
                i = i2;
            }
        }

        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c = c.c(length, 0, -2);
            if (c > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (B.z(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == c) {
                    return null;
                }
                length = i;
            }
        }

        public final Headers g(String... namesAndValues) {
            t.g(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            CharSequence[] charSequenceArr = (String[]) namesAndValues.clone();
            int length = charSequenceArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                CharSequence charSequence = charSequenceArr[i2];
                if (charSequence == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                charSequenceArr[i2] = E.j1(charSequence).toString();
                i2 = i3;
            }
            int c = c.c(0, charSequenceArr.length - 1, 2);
            if (c >= 0) {
                while (true) {
                    int i4 = i + 2;
                    CharSequence charSequence2 = charSequenceArr[i];
                    CharSequence charSequence3 = charSequenceArr[i + 1];
                    d(charSequence2);
                    e(charSequence3, charSequence2);
                    if (i == c) {
                        break;
                    }
                    i = i4;
                }
            }
            return new Headers(charSequenceArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Headers(String[] strArr, k kVar) {
        this(strArr);
    }

    public final String a(String name) {
        t.g(name, "name");
        return Companion.c(b, this.a, name);
    }

    public final Date b(String name) {
        t.g(name, "name");
        String a = a(name);
        if (a == null) {
            return null;
        }
        return DatesKt.a(a);
    }

    public final String e(int i) {
        return this.a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.a, ((Headers) obj).a);
    }

    public final Builder f() {
        Builder builder = new Builder();
        A.E(builder.g(), this.a);
        return builder;
    }

    public final Map g() {
        TreeMap treeMap = new TreeMap(B.A(U.a));
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String e = e(i);
            Locale US = Locale.US;
            t.f(US, "US");
            String lowerCase = e.toLowerCase(US);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(h(i));
            i = i2;
        }
        return treeMap;
    }

    public final String h(int i) {
        return this.a[(i * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public Iterator iterator() {
        int size = size();
        q[] qVarArr = new q[size];
        for (int i = 0; i < size; i++) {
            qVarArr[i] = x.a(e(i), h(i));
        }
        return kotlin.jvm.internal.c.a(qVarArr);
    }

    public final List j(String name) {
        t.g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (B.z(name, e(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return v.n();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        t.f(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String e = e(i);
            String h = h(i);
            sb.append(e);
            sb.append(": ");
            if (Util.H(e)) {
                h = "██";
            }
            sb.append(h);
            sb.append("\n");
            i = i2;
        }
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public Headers(String[] strArr) {
        this.a = strArr;
    }
}
