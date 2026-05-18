package com.applovin.shadow.okhttp3;

import Ca.e;
import Da.v;
import Za.B;
import Za.E;
import Za.o;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
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
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = 253402300799999L;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final Builder domain(String str) {
            t.g(str, "domain");
            return domain(str, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            t.g(str, "domain");
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            t.g(str, "name");
            if (!t.c(E.j1(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = str;
            return this;
        }

        public final Builder path(String str) {
            t.g(str, "path");
            if (!B.N(str, "/", false, 2, (Object) null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = str;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            t.g(str, "value");
            if (!t.c(E.j1(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = str;
            return this;
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ boolean access$domainMatch(Companion companion, String str, String str2) {
            return companion.domainMatch(str, str2);
        }

        public static final /* synthetic */ boolean access$pathMatch(Companion companion, HttpUrl httpUrl, String str) {
            return companion.pathMatch(httpUrl, str);
        }

        private final int dateCharacterOffset(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private final boolean domainMatch(String str, String str2) {
            if (t.c(str, str2)) {
                return true;
            }
            return B.y(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            if (B.y(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(E.B0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i, int i2) {
            int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.access$getTIME_PATTERN$cp().matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (dateCharacterOffset < i2) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i4 == -1 && matcher.usePattern(Cookie.access$getTIME_PATTERN$cp()).matches()) {
                    String group = matcher.group(1);
                    t.f(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    t.f(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    t.f(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(Cookie.access$getDAY_OF_MONTH_PATTERN$cp()).matches()) {
                    String group4 = matcher.group(1);
                    t.f(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(Cookie.access$getMONTH_PATTERN$cp()).matches()) {
                    String group5 = matcher.group(1);
                    t.f(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    t.f(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.access$getMONTH_PATTERN$cp().pattern();
                    t.f(pattern, "MONTH_PATTERN.pattern()");
                    i6 = E.f0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.access$getYEAR_PATTERN$cp()).matches()) {
                    String group6 = matcher.group(1);
                    t.f(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
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
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
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

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new o("-?\\d+").h(str)) {
                    return B.N(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        private final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (t.c(encodedPath, str)) {
                return true;
            }
            return B.N(encodedPath, str, false, 2, (Object) null) && (B.y(str, "/", false, 2, (Object) null) || encodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            t.g(httpUrl, "url");
            t.g(str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[PHI: r1
          0x00d7: PHI (r1v23 long) = (r1v7 long), (r1v11 long) binds: [B:50:0x00d5, B:83:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okhttp3.Cookie parse$okhttp(long r26, com.applovin.shadow.okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.Cookie.Companion.parse$okhttp(long, com.applovin.shadow.okhttp3.HttpUrl, java.lang.String):com.applovin.shadow.okhttp3.Cookie");
        }

        public final List parseAll(HttpUrl httpUrl, Headers headers) {
            t.g(httpUrl, "url");
            t.g(headers, "headers");
            List values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie parse = parse(httpUrl, (String) values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList == null) {
                return v.n();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            t.f(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, k kVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public static final /* synthetic */ Pattern access$getDAY_OF_MONTH_PATTERN$cp() {
        return DAY_OF_MONTH_PATTERN;
    }

    public static final /* synthetic */ Pattern access$getMONTH_PATTERN$cp() {
        return MONTH_PATTERN;
    }

    public static final /* synthetic */ Pattern access$getTIME_PATTERN$cp() {
        return TIME_PATTERN;
    }

    public static final /* synthetic */ Pattern access$getYEAR_PATTERN$cp() {
        return YEAR_PATTERN;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @e
    public final String -deprecated_domain() {
        return this.domain;
    }

    @e
    public final long -deprecated_expiresAt() {
        return this.expiresAt;
    }

    @e
    public final boolean -deprecated_hostOnly() {
        return this.hostOnly;
    }

    @e
    public final boolean -deprecated_httpOnly() {
        return this.httpOnly;
    }

    @e
    public final String -deprecated_name() {
        return this.name;
    }

    @e
    public final String -deprecated_path() {
        return this.path;
    }

    @e
    public final boolean -deprecated_persistent() {
        return this.persistent;
    }

    @e
    public final boolean -deprecated_secure() {
        return this.secure;
    }

    @e
    public final String -deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (t.c(cookie.name, this.name) && t.c(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && t.c(cookie.domain, this.domain) && t.c(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        t.g(httpUrl, "url");
        if ((this.hostOnly ? t.c(httpUrl.host(), this.domain) : Companion.access$domainMatch(Companion, httpUrl.host(), this.domain)) && Companion.access$pathMatch(Companion, httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        t.f(sb2, "toString()");
        return sb2;
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }
}
