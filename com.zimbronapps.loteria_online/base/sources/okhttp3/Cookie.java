package okhttp3;

import Da.v;
import Za.B;
import Za.E;
import Za.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Cookie {
    public static final Companion j = new Companion(null);
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public static final class Builder {
        public long a = 253402300799999L;
        public String b = "/";
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                int i3 = i + 1;
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i = i3;
            }
            return i2;
        }

        public final boolean b(String str, String str2) {
            if (t.c(str, str2)) {
                return true;
            }
            return B.y(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.i(str);
        }

        public final Cookie c(HttpUrl url, String setCookie) {
            t.g(url, "url");
            t.g(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[PHI: r1
          0x00d7: PHI (r1v23 long) = (r1v7 long), (r1v11 long) binds: [B:50:0x00d5, B:83:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie d(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.d(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List e(HttpUrl url, Headers headers) {
            t.g(url, "url");
            t.g(headers, "headers");
            List j = headers.j("Set-Cookie");
            int size = j.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Cookie c = c(url, (String) j.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
                i = i2;
            }
            if (arrayList == null) {
                return v.n();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            t.f(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        public final String f(String str) {
            if (B.y(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String e = HostnamesKt.e(E.B0(str, "."));
            if (e != null) {
                return e;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String str, int i, int i2) {
            int a = a(str, i, i2, false);
            Matcher matcher = Cookie.c().matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (a < i2) {
                int a2 = a(str, a + 1, i2, true);
                matcher.region(a, a2);
                if (i4 == -1 && matcher.usePattern(Cookie.c()).matches()) {
                    String group = matcher.group(1);
                    t.f(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    t.f(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    t.f(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.a()).matches()) {
                    String group4 = matcher.group(1);
                    t.f(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.b()).matches()) {
                    String group5 = matcher.group(1);
                    t.f(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    t.f(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.b().pattern();
                    t.f(pattern, "MONTH_PATTERN.pattern()");
                    i6 = E.f0(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.d()).matches()) {
                    String group6 = matcher.group(1);
                    t.f(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                a = a(str, a2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (i3 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i5 || i5 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i4 < 0 || i4 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i7 < 0 || i7 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i8 < 0 || i8 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new o("-?\\d+").h(str)) {
                    return B.N(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, k kVar) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }

    public static final /* synthetic */ Pattern a() {
        return m;
    }

    public static final /* synthetic */ Pattern b() {
        return l;
    }

    public static final /* synthetic */ Pattern c() {
        return n;
    }

    public static final /* synthetic */ Pattern d() {
        return k;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (t.c(cookie.a, this.a) && t.c(cookie.b, this.b) && cookie.c == this.c && t.c(cookie.d, this.d) && t.c(cookie.e, this.e) && cookie.f == this.f && cookie.g == this.g && cookie.h == this.h && cookie.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.i;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.i);
    }

    public final String i() {
        return this.a;
    }

    public final String j() {
        return this.e;
    }

    public final boolean k() {
        return this.h;
    }

    public final boolean l() {
        return this.f;
    }

    public final String m(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        sb.append('=');
        sb.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.b(new Date(f())));
            }
        }
        if (!g()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(e());
        }
        sb.append("; path=");
        sb.append(j());
        if (l()) {
            sb.append("; secure");
        }
        if (h()) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        t.f(sb2, "toString()");
        return sb2;
    }

    public final String n() {
        return this.b;
    }

    public String toString() {
        return m(false);
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }
}
