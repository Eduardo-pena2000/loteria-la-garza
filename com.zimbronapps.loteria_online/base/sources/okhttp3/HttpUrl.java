package okhttp3;

import Da.w;
import Wa.g;
import Wa.n;
import Za.B;
import Za.E;
import Za.G;
import Za.o;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpUrl {
    public static final Companion k = new Companion(null);
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public static final class Builder {
        public static final Companion i = new Companion(null);
        public String a;
        public String d;
        public final List f;
        public List g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public static final /* synthetic */ int a(Companion companion, String str, int i, int i2) {
                return companion.e(str, i, i2);
            }

            public static final /* synthetic */ int b(Companion companion, String str, int i, int i2) {
                return companion.f(str, i, i2);
            }

            public static final /* synthetic */ int c(Companion companion, String str, int i, int i2) {
                return companion.g(str, i, i2);
            }

            public static final /* synthetic */ int d(Companion companion, String str, int i, int i2) {
                return companion.h(str, i, i2);
            }

            public final int e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.b(HttpUrl.k, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i, int i2) {
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

            public final int g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((t.h(charAt, 97) < 0 || t.h(charAt, 122) > 0) && (t.h(charAt, 65) < 0 || t.h(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && !(('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i3;
                        }
                        return -1;
                    }
                    i3 = i4;
                }
                return -1;
            }

            public final int h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final void A(String str) {
            this.d = str;
        }

        public final void B(int i2) {
            this.e = i2;
        }

        public final void C(String str) {
            this.a = str;
        }

        public final Builder D(String username) {
            t.g(username, "username");
            z(Companion.b(HttpUrl.k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.k;
            String h = Companion.h(companion, this.b, 0, 0, false, 7, null);
            String h2 = Companion.h(companion, this.c, 0, 0, false, 7, null);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int b = b();
            List list = this.f;
            ArrayList arrayList2 = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.h(HttpUrl.k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.g;
            if (list2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(w.y(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 == null ? null : Companion.h(HttpUrl.k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.h;
            return new HttpUrl(str, h, h2, str2, b, arrayList2, arrayList, str4 == null ? null : Companion.h(HttpUrl.k, str4, 0, 0, false, 7, null), toString());
        }

        public final int b() {
            int i2 = this.e;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.k;
            String str = this.a;
            t.d(str);
            return companion.c(str);
        }

        public final Builder c(String str) {
            List list = null;
            if (str != null) {
                Companion companion = HttpUrl.k;
                String b = Companion.b(companion, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b != null) {
                    list = companion.j(b);
                }
            }
            y(list);
            return this;
        }

        public final String d() {
            return this.h;
        }

        public final String e() {
            return this.c;
        }

        public final List f() {
            return this.f;
        }

        public final List g() {
            return this.g;
        }

        public final String h() {
            return this.b;
        }

        public final String i() {
            return this.d;
        }

        public final int j() {
            return this.e;
        }

        public final String k() {
            return this.a;
        }

        public final Builder l(String host) {
            t.g(host, "host");
            String e = HostnamesKt.e(Companion.h(HttpUrl.k, host, 0, 0, false, 7, null));
            if (e == null) {
                throw new IllegalArgumentException(t.o("unexpected host: ", host));
            }
            A(e);
            return this;
        }

        public final boolean m(String str) {
            return t.c(str, ".") || B.z(str, "%2e", true);
        }

        public final boolean n(String str) {
            return t.c(str, "..") || B.z(str, "%2e.", true) || B.z(str, ".%2e", true) || B.z(str, "%2e%2e", true);
        }

        public final Builder o(HttpUrl httpUrl, String str) {
            int q;
            int i2;
            int i3;
            boolean z;
            int i4;
            boolean z2;
            String input = str;
            t.g(input, "input");
            int A = Util.A(input, 0, 0, 3, null);
            int C = Util.C(input, A, 0, 2, null);
            Companion companion = i;
            int c = Companion.c(companion, input, A, C);
            boolean z3 = true;
            char c2 = 65535;
            if (c != -1) {
                if (B.K(input, "https:", A, true)) {
                    this.a = "https";
                    A += 6;
                } else {
                    if (!B.K(input, "http:", A, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, c);
                        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    A += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (str.length() > 6) {
                        input = t.o(G.q1(input, 6), "...");
                    }
                    throw new IllegalArgumentException(t.o("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
                }
                this.a = httpUrl.p();
            }
            int d = Companion.d(companion, input, A, C);
            char c3 = '?';
            char c4 = '#';
            if (d >= 2 || httpUrl == null || !t.c(httpUrl.p(), this.a)) {
                boolean z4 = false;
                boolean z5 = false;
                int i5 = A + d;
                while (true) {
                    q = Util.q(input, "@/\\?#", i5, C);
                    char charAt = q != C ? input.charAt(q) : c2;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            i3 = q;
                            z = z3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.c);
                            sb2.append("%40");
                            i4 = C;
                            sb2.append(Companion.b(HttpUrl.k, str, i5, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.c = sb2.toString();
                        } else {
                            int p = Util.p(input, ':', i5, q);
                            Companion companion2 = HttpUrl.k;
                            z = z3;
                            String b = Companion.b(companion2, str, i5, p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                b = this.b + "%40" + b;
                            }
                            this.b = b;
                            if (p != q) {
                                i3 = q;
                                this.c = Companion.b(companion2, str, p + 1, q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = z;
                            } else {
                                i3 = q;
                                z2 = z4;
                            }
                            z4 = z2;
                            i4 = C;
                            z5 = z;
                        }
                        i5 = i3 + 1;
                        z3 = z;
                        C = i4;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                i2 = C;
                Companion companion3 = i;
                int b2 = Companion.b(companion3, input, i5, q);
                int i6 = b2 + 1;
                if (i6 < q) {
                    this.d = HostnamesKt.e(Companion.h(HttpUrl.k, str, i5, b2, false, 4, null));
                    int a = Companion.a(companion3, input, i6, q);
                    this.e = a;
                    if (a == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = input.substring(i6, q);
                        t.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.k;
                    this.d = HostnamesKt.e(Companion.h(companion4, str, i5, b2, false, 4, null));
                    String str2 = this.a;
                    t.d(str2);
                    this.e = companion4.c(str2);
                }
                if (this.d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = input.substring(i5, b2);
                    t.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                A = q;
            } else {
                this.b = httpUrl.g();
                this.c = httpUrl.c();
                this.d = httpUrl.h();
                this.e = httpUrl.l();
                this.f.clear();
                this.f.addAll(httpUrl.e());
                if (A == C || input.charAt(A) == '#') {
                    c(httpUrl.f());
                }
                i2 = C;
            }
            int i7 = i2;
            int q2 = Util.q(input, "?#", A, i7);
            u(input, A, q2);
            if (q2 < i7 && input.charAt(q2) == '?') {
                int p2 = Util.p(input, '#', q2, i7);
                Companion companion5 = HttpUrl.k;
                this.g = companion5.j(Companion.b(companion5, str, q2 + 1, p2, " \"'<>#", true, false, true, false, null, 208, null));
                q2 = p2;
            }
            if (q2 < i7 && input.charAt(q2) == '#') {
                this.h = Companion.b(HttpUrl.k, str, q2 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder p(String password) {
            t.g(password, "password");
            x(Companion.b(HttpUrl.k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final void q() {
            if (((String) this.f.remove(r0.size() - 1)).length() != 0 || this.f.isEmpty()) {
                this.f.add("");
            } else {
                this.f.set(r0.size() - 1, "");
            }
        }

        public final Builder r(int i2) {
            if (1 > i2 || i2 >= 65536) {
                throw new IllegalArgumentException(t.o("unexpected port: ", Integer.valueOf(i2)).toString());
            }
            B(i2);
            return this;
        }

        public final void s(String str, int i2, int i3, boolean z, boolean z2) {
            String b = Companion.b(HttpUrl.k, str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (m(b)) {
                return;
            }
            if (n(b)) {
                q();
                return;
            }
            if (((CharSequence) this.f.get(r2.size() - 1)).length() == 0) {
                this.f.set(r2.size() - 1, b);
            } else {
                this.f.add(b);
            }
            if (z) {
                this.f.add("");
            }
        }

        public final Builder t() {
            CharSequence i2 = i();
            A(i2 == null ? null : new o("[\"<>^`{|}]").j(i2, ""));
            int size = f().size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                f().set(i4, Companion.b(HttpUrl.k, (String) f().get(i4), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List g = g();
            if (g != null) {
                int size2 = g.size();
                while (i3 < size2) {
                    int i5 = i3 + 1;
                    String str = (String) g.get(i3);
                    g.set(i3, str == null ? null : Companion.b(HttpUrl.k, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i3 = i5;
                }
            }
            String d = d();
            w(d != null ? Companion.b(HttpUrl.k, d, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.k()
                if (r1 == 0) goto L18
                java.lang.String r1 = r6.k()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L1d
            L18:
                java.lang.String r1 = "//"
                r0.append(r1)
            L1d:
                java.lang.String r1 = r6.h()
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L2a
                goto L34
            L2a:
                java.lang.String r1 = r6.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L54
            L34:
                java.lang.String r1 = r6.h()
                r0.append(r1)
                java.lang.String r1 = r6.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L4f
                r0.append(r2)
                java.lang.String r1 = r6.e()
                r0.append(r1)
            L4f:
                r1 = 64
                r0.append(r1)
            L54:
                java.lang.String r1 = r6.i()
                if (r1 == 0) goto L83
                java.lang.String r1 = r6.i()
                kotlin.jvm.internal.t.d(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = Za.E.S(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L7c
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.i()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L83
            L7c:
                java.lang.String r1 = r6.i()
                r0.append(r1)
            L83:
                int r1 = r6.j()
                r3 = -1
                if (r1 != r3) goto L90
                java.lang.String r1 = r6.k()
                if (r1 == 0) goto Laf
            L90:
                int r1 = r6.b()
                java.lang.String r3 = r6.k()
                if (r3 == 0) goto La9
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.k
                java.lang.String r4 = r6.k()
                kotlin.jvm.internal.t.d(r4)
                int r3 = r3.c(r4)
                if (r1 == r3) goto Laf
            La9:
                r0.append(r2)
                r0.append(r1)
            Laf:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.k
                java.util.List r2 = r6.f()
                r1.i(r2, r0)
                java.util.List r2 = r6.g()
                if (r2 == 0) goto Lcd
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.g()
                kotlin.jvm.internal.t.d(r2)
                r1.k(r2, r0)
            Lcd:
                java.lang.String r1 = r6.d()
                if (r1 == 0) goto Ldf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.d()
                r0.append(r1)
            Ldf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.t.f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final void u(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char charAt = str.charAt(i2);
            if (charAt == '/' || charAt == '\\') {
                this.f.clear();
                this.f.add("");
                i2++;
            } else {
                List list = this.f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                while (i4 < i3) {
                    i2 = Util.q(str, "/\\", i4, i3);
                    boolean z = i2 < i3;
                    s(str, i4, i2, z, true);
                    if (z) {
                        i4 = i2 + 1;
                    }
                }
                return;
            }
        }

        public final Builder v(String scheme) {
            t.g(scheme, "scheme");
            if (B.z(scheme, "http", true)) {
                C("http");
            } else {
                if (!B.z(scheme, "https", true)) {
                    throw new IllegalArgumentException(t.o("unexpected scheme: ", scheme));
                }
                C("https");
            }
            return this;
        }

        public final void w(String str) {
            this.h = str;
        }

        public final void x(String str) {
            t.g(str, "<set-?>");
            this.c = str;
        }

        public final void y(List list) {
            this.g = list;
        }

        public final void z(String str) {
            t.g(str, "<set-?>");
            this.b = str;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return companion.a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String h(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.g(str, i, i2, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
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
                boolean r1 = r13.e(r14, r3, r4)
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
                xb.e r12 = new xb.e
                r12.<init>()
                r0 = r15
                r12.X(r14, r15, r3)
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
                r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int c(String scheme) {
            t.g(scheme, "scheme");
            if (t.c(scheme, "http")) {
                return 80;
            }
            return t.c(scheme, "https") ? 443 : -1;
        }

        public final HttpUrl d(String str) {
            t.g(str, "<this>");
            return new Builder().o(null, str).a();
        }

        public final boolean e(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.I(str.charAt(i + 1)) != -1 && Util.I(str.charAt(i3)) != -1;
        }

        public final HttpUrl f(String str) {
            t.g(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i, int i2, boolean z) {
            t.g(str, "<this>");
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    e eVar = new e();
                    eVar.X(str, i, i3);
                    m(eVar, str, i3, i2, z);
                    return eVar.readUtf8();
                }
                i3 = i4;
            }
            String substring = str.substring(i, i2);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List list, StringBuilder out) {
            t.g(list, "<this>");
            t.g(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append((String) list.get(i));
            }
        }

        public final List j(String str) {
            t.g(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int e0 = E.e0(str, '&', i, false, 4, null);
                if (e0 == -1) {
                    e0 = str.length();
                }
                int i2 = e0;
                int e02 = E.e0(str, '=', i, false, 4, null);
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

        public final void k(List list, StringBuilder out) {
            t.g(list, "<this>");
            t.g(out, "out");
            g v = n.v(n.w(0, list.size()), 2);
            int f = v.f();
            int g = v.g();
            int h = v.h();
            if ((h <= 0 || f > g) && (h >= 0 || g > f)) {
                return;
            }
            while (true) {
                int i = f + h;
                String str = (String) list.get(f);
                String str2 = (String) list.get(f + 1);
                if (f > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (f == g) {
                    return;
                } else {
                    f = i;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void l(xb.e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
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
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L6b
                goto L6f
            L67:
                r8 = r14
                goto L6b
            L69:
                r8 = r14
                goto L6f
            L6b:
                r15.Y(r7)
                goto Lb5
            L6f:
                if (r6 != 0) goto L76
                xb.e r6 = new xb.e
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
                r6.V(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.Y(r7)
            L8d:
                boolean r10 = r6.exhausted()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r13 = okhttp3.HttpUrl.a()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.a()
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
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.l(xb.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m(xb.e r6, java.lang.String r7, int r8, int r9, boolean r10) {
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
                int r2 = okhttp3.internal.Util.I(r2)
                char r3 = r7.charAt(r1)
                int r3 = okhttp3.internal.Util.I(r3)
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
                r6.Y(r0)
                int r0 = java.lang.Character.charCount(r0)
                int r8 = r8 + r0
                goto L0
            L48:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.m(xb.e, java.lang.String, int, int, boolean):void");
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i, List pathSegments, List list, String str, String url) {
        t.g(scheme, "scheme");
        t.g(username, "username");
        t.g(password, "password");
        t.g(host, "host");
        t.g(pathSegments, "pathSegments");
        t.g(url, "url");
        this.a = scheme;
        this.b = username;
        this.c = password;
        this.d = host;
        this.e = i;
        this.f = pathSegments;
        this.g = list;
        this.h = str;
        this.i = url;
        this.j = t.c(scheme, "https");
    }

    public static final /* synthetic */ char[] a() {
        return l;
    }

    public final String b() {
        if (this.h == null) {
            return null;
        }
        String substring = this.i.substring(E.e0(this.i, '#', 0, false, 6, null) + 1);
        t.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.c.length() == 0) {
            return "";
        }
        String substring = this.i.substring(E.e0(this.i, ':', this.a.length() + 3, false, 4, null) + 1, E.e0(this.i, '@', 0, false, 6, null));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int e0 = E.e0(this.i, '/', this.a.length() + 3, false, 4, null);
        String str = this.i;
        String substring = this.i.substring(e0, Util.q(str, "?#", e0, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List e() {
        int e0 = E.e0(this.i, '/', this.a.length() + 3, false, 4, null);
        String str = this.i;
        int q = Util.q(str, "?#", e0, str.length());
        ArrayList arrayList = new ArrayList();
        while (e0 < q) {
            int i = e0 + 1;
            int p = Util.p(this.i, '/', i, q);
            String substring = this.i.substring(i, p);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            e0 = p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && t.c(((HttpUrl) obj).i, this.i);
    }

    public final String f() {
        if (this.g == null) {
            return null;
        }
        int e0 = E.e0(this.i, '?', 0, false, 6, null) + 1;
        String str = this.i;
        String substring = this.i.substring(e0, Util.p(str, '#', e0, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String substring = this.i.substring(length, Util.q(str, ":@", length, str.length()));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public final boolean i() {
        return this.j;
    }

    public final Builder j() {
        Builder builder = new Builder();
        builder.C(this.a);
        builder.z(g());
        builder.x(c());
        builder.A(this.d);
        builder.B(this.e != k.c(this.a) ? this.e : -1);
        builder.f().clear();
        builder.f().addAll(e());
        builder.c(f());
        builder.w(b());
        return builder;
    }

    public final Builder k(String link) {
        t.g(link, "link");
        try {
            return new Builder().o(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.e;
    }

    public final String m() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        k.k(this.g, sb);
        return sb.toString();
    }

    public final String n() {
        Builder k2 = k("/...");
        t.d(k2);
        return k2.D("").p("").a().toString();
    }

    public final HttpUrl o(String link) {
        t.g(link, "link");
        Builder k2 = k(link);
        if (k2 == null) {
            return null;
        }
        return k2.a();
    }

    public final String p() {
        return this.a;
    }

    public final URI q() {
        CharSequence builder = j().t().toString();
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

    public final URL r() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.i;
    }
}
