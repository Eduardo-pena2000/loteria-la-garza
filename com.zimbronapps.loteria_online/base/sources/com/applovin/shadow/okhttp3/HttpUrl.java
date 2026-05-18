package com.applovin.shadow.okhttp3;

import Ca.e;
import Da.Y;
import Da.v;
import Da.w;
import Wa.g;
import Wa.n;
import Za.B;
import Za.E;
import Za.G;
import Za.o;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import com.applovin.shadow.okio.Buffer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List pathSegments;
    private final int port;
    private final List queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List encodedPathSegments;
        private List encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public static final /* synthetic */ int access$parsePort(Companion companion, String str, int i, int i2) {
                return companion.parsePort(str, i, i2);
            }

            public static final /* synthetic */ int access$portColonOffset(Companion companion, String str, int i, int i2) {
                return companion.portColonOffset(str, i, i2);
            }

            public static final /* synthetic */ int access$schemeDelimiterOffset(Companion companion, String str, int i, int i2) {
                return companion.schemeDelimiterOffset(str, i, i2);
            }

            public static final /* synthetic */ int access$slashCount(Companion companion, String str, int i, int i2) {
                return companion.slashCount(str, i, i2);
            }

            private final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            private final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            private final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((t.h(charAt, 97) < 0 || t.h(charAt, 122) > 0) && (t.h(charAt, 65) < 0 || t.h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            private final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            t.d(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return t.c(str, ".") || B.z(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return t.c(str, "..") || B.z(str, "%2e.", true) || B.z(str, ".%2e", true) || B.z(str, "%2e%2e", true);
        }

        private final void pop() {
            if (((String) this.encodedPathSegments.remove(r0.size() - 1)).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (((CharSequence) this.encodedPathSegments.get(r2.size() - 1)).length() == 0) {
                this.encodedPathSegments.set(r2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List list = this.encodedQueryNamesAndValues;
            t.d(list);
            int size = list.size() - 2;
            int c = Ka.c.c(size, 0, -2);
            if (c > size) {
                return;
            }
            while (true) {
                List list2 = this.encodedQueryNamesAndValues;
                t.d(list2);
                if (t.c(str, list2.get(size))) {
                    List list3 = this.encodedQueryNamesAndValues;
                    t.d(list3);
                    list3.remove(size + 1);
                    List list4 = this.encodedQueryNamesAndValues;
                    t.d(list4);
                    list4.remove(size);
                    List list5 = this.encodedQueryNamesAndValues;
                    t.d(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == c) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                List list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = Util.delimiterOffset(str, "/\\", i3, i2);
                    boolean z = i < i2;
                    push(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            t.g(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            t.g(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            t.g(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list = this.encodedQueryNamesAndValues;
            t.d(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.encodedQueryNamesAndValues;
            t.d(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            t.g(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            t.g(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            t.g(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list = this.encodedQueryNamesAndValues;
            t.d(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.encodedQueryNamesAndValues;
            t.d(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int effectivePort = effectivePort();
            List list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(w.y(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            t.g(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            t.g(str, "encodedPath");
            if (B.N(str, "/", false, 2, (Object) null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okhttp3.HttpUrl.Builder encodedQuery(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                com.applovin.shadow.okhttp3.HttpUrl$Companion r12 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = com.applovin.shadow.okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Builder.encodedQuery(java.lang.String):com.applovin.shadow.okhttp3.HttpUrl$Builder");
        }

        public final Builder encodedUsername(String str) {
            t.g(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            t.g(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            int i;
            int i2;
            boolean z;
            int i3;
            boolean z2;
            String str2 = str;
            t.g(str2, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int access$schemeDelimiterOffset = Companion.access$schemeDelimiterOffset(companion, str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z3 = true;
            char c = 65535;
            if (access$schemeDelimiterOffset != -1) {
                if (B.K(str2, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!B.K(str2, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str2.substring(0, access$schemeDelimiterOffset);
                        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (str.length() > 6) {
                        str2 = G.q1(str2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.scheme = httpUrl.scheme();
            }
            int access$slashCount = Companion.access$slashCount(companion, str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (access$slashCount >= 2 || httpUrl == null || !t.c(httpUrl.scheme(), this.scheme)) {
                boolean z4 = false;
                boolean z5 = false;
                int i4 = indexOfFirstNonAsciiWhitespace$default + access$slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i4, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str2.charAt(delimiterOffset) : c;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            i2 = delimiterOffset;
                            z = z3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int delimiterOffset2 = Util.delimiterOffset(str2, ':', i4, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z = z3;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i4, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = z;
                            } else {
                                i2 = delimiterOffset;
                                z2 = z4;
                            }
                            z4 = z2;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            z5 = z;
                        }
                        i4 = i2 + 1;
                        z3 = z;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int access$portColonOffset = Companion.access$portColonOffset(companion3, str2, i4, delimiterOffset);
                int i5 = access$portColonOffset + 1;
                if (i5 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i4, access$portColonOffset, false, 4, null));
                    int access$parsePort = Companion.access$parsePort(companion3, str2, i5, delimiterOffset);
                    this.port = access$parsePort;
                    if (access$parsePort == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = str2.substring(i5, delimiterOffset);
                        t.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i4, access$portColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    t.d(str3);
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = str2.substring(i4, access$portColonOffset);
                    t.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i6 = i;
            int delimiterOffset3 = Util.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str2, '#', delimiterOffset3, i6);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            t.g(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i) {
            if (1 <= i && i < 65536) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okhttp3.HttpUrl.Builder query(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                com.applovin.shadow.okhttp3.HttpUrl$Companion r12 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                r10 = 219(0xdb, float:3.07E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = com.applovin.shadow.okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.toQueryNamesAndValues$okhttp(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Builder.query(java.lang.String):com.applovin.shadow.okhttp3.HttpUrl$Builder");
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new o("[\"<>^`{|}]").j(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, (String) list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) list2.get(i2);
                    list2.set(i2, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            t.g(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            t.g(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            t.g(str, "scheme");
            if (B.z(str, "http", true)) {
                this.scheme = "http";
            } else {
                if (!B.z(str, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            t.g(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            t.g(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            t.g(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            t.g(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            t.g(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            t.g(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                kotlin.jvm.internal.t.d(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = Za.E.S(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.effectivePort()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                com.applovin.shadow.okhttp3.HttpUrl$Companion r4 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.t.d(r3)
                int r3 = r4.defaultPort(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                com.applovin.shadow.okhttp3.HttpUrl$Companion r1 = com.applovin.shadow.okhttp3.HttpUrl.Companion
                java.util.List r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.t.d(r2)
                r1.toQueryString$okhttp(r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.t.f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            t.g(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(com.applovin.shadow.okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb5
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.writeUtf8(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L4a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L4a
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4e
                if (r23 == 0) goto L4a
                goto L4e
            L4a:
                r8 = r14
                r12 = r19
                goto L6f
            L4e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = Za.E.S(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L69
                if (r7 != r9) goto L67
                if (r20 == 0) goto L69
                if (r21 == 0) goto L67
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L6b
                goto L6f
            L67:
                r8 = r14
                goto L6b
            L69:
                r8 = r14
                goto L6f
            L6b:
                r15.writeUtf8CodePoint(r7)
                goto Lb5
            L6f:
                if (r6 != 0) goto L76
                com.applovin.shadow.okio.Buffer r6 = new com.applovin.shadow.okio.Buffer
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.t.c(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.writeString(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.writeUtf8CodePoint(r7)
            L8d:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r13 = com.applovin.shadow.okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.writeByte(r11)
                char[] r11 = com.applovin.shadow.okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Companion.writeCanonicalized(com.applovin.shadow.okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writePercentDecoded(com.applovin.shadow.okio.Buffer r6, java.lang.String r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
            L0:
                if (r8 >= r9) goto L48
                int r0 = r7.codePointAt(r8)
                r1 = 37
                if (r0 != r1) goto L31
                int r1 = r8 + 2
                if (r1 >= r9) goto L31
                int r2 = r8 + 1
                char r2 = r7.charAt(r2)
                int r2 = com.applovin.shadow.okhttp3.internal.Util.parseHexDigit(r2)
                char r3 = r7.charAt(r1)
                int r3 = com.applovin.shadow.okhttp3.internal.Util.parseHexDigit(r3)
                r4 = -1
                if (r2 == r4) goto L3f
                if (r3 == r4) goto L3f
                int r8 = r2 << 4
                int r8 = r8 + r3
                r6.writeByte(r8)
                int r8 = java.lang.Character.charCount(r0)
                int r8 = r8 + r1
                goto L0
            L31:
                r1 = 43
                if (r0 != r1) goto L3f
                if (r10 == 0) goto L3f
                r0 = 32
                r6.writeByte(r0)
                int r8 = r8 + 1
                goto L0
            L3f:
                r6.writeUtf8CodePoint(r0)
                int r0 = java.lang.Character.charCount(r0)
                int r8 = r8 + r0
                goto L0
            L48:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Companion.writePercentDecoded(com.applovin.shadow.okio.Buffer, java.lang.String, int, int, boolean):void");
        }

        @e
        public final HttpUrl -deprecated_get(String str) {
            t.g(str, "url");
            return get(str);
        }

        @e
        public final HttpUrl -deprecated_parse(String str) {
            t.g(str, "url");
            return parse(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String canonicalize$okhttp(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.t.g(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.t.g(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L71
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L25
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L25
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L27
                if (r21 == 0) goto L25
                goto L27
            L25:
                r11 = r13
                goto L4f
            L27:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = Za.E.S(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L25
                r1 = 37
                if (r0 != r1) goto L41
                if (r18 == 0) goto L25
                if (r19 == 0) goto L41
                r11 = r13
                boolean r1 = r13.isPercentEncoded(r14, r3, r4)
                if (r1 == 0) goto L4f
                goto L42
            L41:
                r11 = r13
            L42:
                r1 = 43
                if (r0 != r1) goto L49
                if (r20 == 0) goto L49
                goto L4f
            L49:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4f:
                com.applovin.shadow.okio.Buffer r12 = new com.applovin.shadow.okio.Buffer
                r12.<init>()
                r0 = r15
                r12.writeUtf8(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.writeCanonicalized(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.readUtf8()
                return r0
            L71:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.t.f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.HttpUrl.Companion.canonicalize$okhttp(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int defaultPort(String str) {
            t.g(str, "scheme");
            if (t.c(str, "http")) {
                return 80;
            }
            return t.c(str, "https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            t.g(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            t.g(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            t.g(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i, i2);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List list, StringBuilder sb) {
            t.g(list, "<this>");
            t.g(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) list.get(i));
            }
        }

        public final List toQueryNamesAndValues$okhttp(String str) {
            t.g(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int e0 = E.e0(str, '&', i, false, 4, (Object) null);
                if (e0 == -1) {
                    e0 = str.length();
                }
                int i2 = e0;
                int e02 = E.e0(str, '=', i, false, 4, (Object) null);
                if (e02 == -1 || e02 > i2) {
                    String substring = str.substring(i, i2);
                    t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, e02);
                    t.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(e02 + 1, i2);
                    t.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List list, StringBuilder sb) {
            t.g(list, "<this>");
            t.g(sb, "out");
            g v = n.v(n.w(0, list.size()), 2);
            int f = v.f();
            int g = v.g();
            int h = v.h();
            if ((h <= 0 || f > g) && (h >= 0 || g > f)) {
                return;
            }
            while (true) {
                String str = (String) list.get(f);
                String str2 = (String) list.get(f + 1);
                if (f > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (f == g) {
                    return;
                } else {
                    f += h;
                }
            }
        }

        private Companion() {
        }

        @e
        public final HttpUrl -deprecated_get(URL url) {
            t.g(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            t.g(url, "<this>");
            String url2 = url.toString();
            t.f(url2, "toString()");
            return parse(url2);
        }

        @e
        public final HttpUrl -deprecated_get(URI uri) {
            t.g(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            t.g(uri, "<this>");
            String uri2 = uri.toString();
            t.f(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6) {
        t.g(str, "scheme");
        t.g(str2, "username");
        t.g(str3, "password");
        t.g(str4, "host");
        t.g(list, "pathSegments");
        t.g(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = t.c(str, "https");
    }

    public static final /* synthetic */ char[] access$getHEX_DIGITS$cp() {
        return HEX_DIGITS;
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @e
    public final String -deprecated_encodedFragment() {
        return encodedFragment();
    }

    @e
    public final String -deprecated_encodedPassword() {
        return encodedPassword();
    }

    @e
    public final String -deprecated_encodedPath() {
        return encodedPath();
    }

    @e
    public final List -deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @e
    public final String -deprecated_encodedQuery() {
        return encodedQuery();
    }

    @e
    public final String -deprecated_encodedUsername() {
        return encodedUsername();
    }

    @e
    public final String -deprecated_fragment() {
        return this.fragment;
    }

    @e
    public final String -deprecated_host() {
        return this.host;
    }

    @e
    public final String -deprecated_password() {
        return this.password;
    }

    @e
    public final List -deprecated_pathSegments() {
        return this.pathSegments;
    }

    @e
    public final int -deprecated_pathSize() {
        return pathSize();
    }

    @e
    public final int -deprecated_port() {
        return this.port;
    }

    @e
    public final String -deprecated_query() {
        return query();
    }

    @e
    public final Set -deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @e
    public final int -deprecated_querySize() {
        return querySize();
    }

    @e
    public final String -deprecated_scheme() {
        return this.scheme;
    }

    @e
    public final URI -deprecated_uri() {
        return uri();
    }

    @e
    public final URL -deprecated_url() {
        return url();
    }

    @e
    public final String -deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(E.e0(this.url, '#', 0, false, 6, (Object) null) + 1);
        t.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String substring = this.url.substring(E.e0(this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1, E.e0(this.url, '@', 0, false, 6, (Object) null));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int e0 = E.e0(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        String substring = this.url.substring(e0, Util.delimiterOffset(str, "?#", e0, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List encodedPathSegments() {
        int e0 = E.e0(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", e0, str.length());
        ArrayList arrayList = new ArrayList();
        while (e0 < delimiterOffset) {
            int i = e0 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, delimiterOffset2);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            e0 = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int e0 = E.e0(this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        String substring = this.url.substring(e0, Util.delimiterOffset(str, '#', e0, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && t.c(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        t.g(str, "name");
        List list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        g v = n.v(n.w(0, list.size()), 2);
        int f = v.f();
        int g = v.g();
        int h = v.h();
        if ((h > 0 && f <= g) || (h < 0 && g <= f)) {
            while (!t.c(str, this.queryNamesAndValues.get(f))) {
                if (f != g) {
                    f += h;
                }
            }
            return (String) this.queryNamesAndValues.get(f + 1);
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        Object obj = list.get(i * 2);
        t.d(obj);
        return (String) obj;
    }

    public final Set queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Y.b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g v = n.v(n.w(0, this.queryNamesAndValues.size()), 2);
        int f = v.f();
        int g = v.g();
        int h = v.h();
        if ((h > 0 && f <= g) || (h < 0 && g <= f)) {
            while (true) {
                Object obj = this.queryNamesAndValues.get(f);
                t.d(obj);
                linkedHashSet.add(obj);
                if (f == g) {
                    break;
                }
                f += h;
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        t.f(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List list = this.queryNamesAndValues;
        if (list != null) {
            return (String) list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List queryParameterValues(String str) {
        t.g(str, "name");
        if (this.queryNamesAndValues == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        g v = n.v(n.w(0, this.queryNamesAndValues.size()), 2);
        int f = v.f();
        int g = v.g();
        int h = v.h();
        if ((h > 0 && f <= g) || (h < 0 && g <= f)) {
            while (true) {
                if (t.c(str, this.queryNamesAndValues.get(f))) {
                    arrayList.add(this.queryNamesAndValues.get(f + 1));
                }
                if (f == g) {
                    break;
                }
                f += h;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        t.f(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        t.d(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        t.g(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").j(builder, ""));
                t.f(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        t.g(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
