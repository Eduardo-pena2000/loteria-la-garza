package com.applovin.shadow.okhttp3;

import Ca.e;
import Ca.q;
import Ca.x;
import Da.A;
import Da.v;
import Za.B;
import Za.E;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Headers implements Iterable, Ra.a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            t.g(str, "line");
            int e0 = E.e0(str, ':', 0, false, 6, (Object) null);
            if (e0 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String substring = str.substring(0, e0);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = E.j1(substring).toString();
            String substring2 = str.substring(e0 + 1);
            t.f(substring2, "this as java.lang.String).substring(startIndex)");
            add(obj, substring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            t.g(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            t.g(str, "line");
            int e0 = E.e0(str, ':', 1, false, 4, (Object) null);
            if (e0 != -1) {
                String substring = str.substring(0, e0);
                t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(e0 + 1);
                t.f(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                t.f(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            t.g(str, "name");
            t.g(str2, "value");
            Companion.access$checkName(Headers.Companion, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String str) {
            t.g(str, "name");
            int size = this.namesAndValues.size() - 2;
            int c = Ka.c.c(size, 0, -2);
            if (c > size) {
                return null;
            }
            while (!B.z(str, (String) this.namesAndValues.get(size), true)) {
                if (size == c) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.namesAndValues.get(size + 1);
        }

        public final List getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            t.g(str, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (B.z(str, (String) this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            t.g(str, "name");
            t.g(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            t.g(str, "name");
            t.g(instant, "value");
            return set(str, new Date(b.a(instant)));
        }

        public final Builder set(String str, String str2) {
            t.g(str, "name");
            t.g(str2, "value");
            Companion companion = Headers.Companion;
            Companion.access$checkName(companion, str);
            Companion.access$checkValue(companion, str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            t.g(str, "name");
            t.g(str2, "value");
            Companion companion = Headers.Companion;
            Companion.access$checkName(companion, str);
            Companion.access$checkValue(companion, str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, Date date) {
            t.g(str, "name");
            t.g(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            t.g(str, "name");
            t.g(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(E.j1(str2).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            t.g(str, "name");
            t.g(instant, "value");
            add(str, new Date(b.a(instant)));
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ void access$checkName(Companion companion, String str) {
            companion.checkName(str);
        }

        public static final /* synthetic */ void access$checkValue(Companion companion, String str, String str2) {
            companion.checkValue(str, str2);
        }

        public static final /* synthetic */ String access$get(Companion companion, String[] strArr, String str) {
            return companion.get(strArr, str);
        }

        private final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        private final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        private final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c = Ka.c.c(length, 0, -2);
            if (c > length) {
                return null;
            }
            while (!B.z(str, strArr[length], true)) {
                if (length == c) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @e
        public final Headers -deprecated_of(String... strArr) {
            t.g(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            t.g(strArr, "namesAndValues");
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            CharSequence[] charSequenceArr = (String[]) strArr.clone();
            int length = charSequenceArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                CharSequence charSequence = charSequenceArr[i2];
                if (charSequence == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                charSequenceArr[i2] = E.j1(charSequence).toString();
            }
            int c = Ka.c.c(0, charSequenceArr.length - 1, 2);
            if (c >= 0) {
                while (true) {
                    CharSequence charSequence2 = charSequenceArr[i];
                    CharSequence charSequence3 = charSequenceArr[i + 1];
                    checkName(charSequence2);
                    checkValue(charSequence3, charSequence2);
                    if (i == c) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(charSequenceArr, null);
        }

        private Companion() {
        }

        @e
        public final Headers -deprecated_of(Map map) {
            t.g(map, "headers");
            return of(map);
        }

        public final Headers of(Map map) {
            t.g(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String obj = E.j1(str).toString();
                String obj2 = E.j1(str2).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, k kVar) {
        this(strArr);
    }

    public static final Headers of(Map map) {
        return Companion.of(map);
    }

    @e
    public final int -deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        t.g(str, "name");
        return Companion.access$get(Companion, this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        t.g(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        t.g(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return a.a(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public Iterator iterator() {
        int size = size();
        q[] qVarArr = new q[size];
        for (int i = 0; i < size; i++) {
            qVarArr[i] = x.a(name(i), value(i));
        }
        return kotlin.jvm.internal.c.a(qVarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set names() {
        TreeSet treeSet = new TreeSet(B.A(U.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        t.f(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        A.E(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map toMultimap() {
        TreeMap treeMap = new TreeMap(B.A(U.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            t.f(locale, "US");
            String lowerCase = name.toLowerCase(locale);
            t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List values(String str) {
        t.g(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (B.z(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return v.n();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        t.f(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
