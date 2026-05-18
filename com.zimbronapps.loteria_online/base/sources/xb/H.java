package xb;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h implements Serializable, Comparable {
    public static final a d = new a(null);
    public static final h e = new h(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ h g(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = b.c();
            }
            return aVar.f(bArr, i, i2);
        }

        public final h a(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            byte[] a = xb.a.a(str);
            if (a != null) {
                return new h(a);
            }
            return null;
        }

        public final h b(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((yb.b.b(str.charAt(i2)) << 4) + yb.b.b(str.charAt(i2 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            kotlin.jvm.internal.t.g(str, "<this>");
            kotlin.jvm.internal.t.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h d(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            h hVar = new h(P.a(str));
            hVar.A(str);
            return hVar;
        }

        public final h e(byte... data) {
            kotlin.jvm.internal.t.g(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
            return new h(copyOf);
        }

        public final h f(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "<this>");
            int f = b.f(bArr, i2);
            b.b(bArr.length, i, f);
            return new h(Da.p.q(bArr, i, f + i));
        }

        public a() {
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.t.g(data, "data");
        this.a = data;
    }

    public static /* synthetic */ h F(h hVar, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = b.c();
        }
        return hVar.E(i, i2);
    }

    public static final h c(String str) {
        return d.b(str);
    }

    public static /* synthetic */ int p(h hVar, h hVar2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return hVar.n(hVar2, i);
    }

    public static /* synthetic */ int u(h hVar, h hVar2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = b.c();
        }
        return hVar.s(hVar2, i);
    }

    public static final h w(byte... bArr) {
        return d.e(bArr);
    }

    public final void A(String str) {
        this.c = str;
    }

    public final h B() {
        return d("SHA-1");
    }

    public final h C() {
        return d("SHA-256");
    }

    public final boolean D(h prefix) {
        kotlin.jvm.internal.t.g(prefix, "prefix");
        return x(0, prefix, 0, prefix.size());
    }

    public h E(int i, int i2) {
        int e2 = b.e(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (e2 <= g().length) {
            if (e2 - i >= 0) {
                return (i == 0 && e2 == g().length) ? this : new h(Da.p.q(g(), i, e2));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + g().length + ')').toString());
    }

    public h G() {
        for (int i = 0; i < g().length; i++) {
            byte b = g()[i];
            if (b >= 65 && b <= 90) {
                byte[] g = g();
                byte[] copyOf = Arrays.copyOf(g, g.length);
                kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new h(copyOf);
            }
        }
        return this;
    }

    public String H() {
        String k = k();
        if (k != null) {
            return k;
        }
        String c = P.c(q());
        A(c);
        return c;
    }

    public void I(e buffer, int i, int i2) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        yb.b.d(this, buffer, i, i2);
    }

    public String a() {
        return xb.a.c(g(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(xb.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.t.g(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.h.compareTo(xb.h):int");
    }

    public h d(String algorithm) {
        kotlin.jvm.internal.t.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.a, 0, size());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.t.f(digestBytes, "digestBytes");
        return new h(digestBytes);
    }

    public final boolean e(h suffix) {
        kotlin.jvm.internal.t.g(suffix, "suffix");
        return x(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.size() == g().length && hVar.y(0, g(), 0, g().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte f(int i) {
        return r(i);
    }

    public final byte[] g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    public int hashCode() {
        int h = h();
        if (h != 0) {
            return h;
        }
        int hashCode = Arrays.hashCode(g());
        z(hashCode);
        return hashCode;
    }

    public int i() {
        return g().length;
    }

    public final String k() {
        return this.c;
    }

    public String l() {
        char[] cArr = new char[g().length * 2];
        int i = 0;
        for (byte b : g()) {
            int i2 = i + 1;
            cArr[i] = yb.b.f()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = yb.b.f()[b & 15];
        }
        return Za.B.t(cArr);
    }

    public final int n(h other, int i) {
        kotlin.jvm.internal.t.g(other, "other");
        return o(other.q(), i);
    }

    public int o(byte[] other, int i) {
        kotlin.jvm.internal.t.g(other, "other");
        int length = g().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!b.a(g(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] q() {
        return g();
    }

    public byte r(int i) {
        return g()[i];
    }

    public final int s(h other, int i) {
        kotlin.jvm.internal.t.g(other, "other");
        return t(other.q(), i);
    }

    public final int size() {
        return i();
    }

    public int t(byte[] other, int i) {
        kotlin.jvm.internal.t.g(other, "other");
        for (int min = Math.min(b.e(this, i), g().length - other.length); -1 < min; min--) {
            if (b.a(g(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        if (g().length == 0) {
            str = "[size=0]";
        } else {
            int a2 = yb.b.a(g(), 64);
            if (a2 != -1) {
                String H = H();
                String substring = H.substring(0, a2);
                kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String H2 = Za.B.H(Za.B.H(Za.B.H(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (a2 >= H.length()) {
                    return "[text=" + H2 + ']';
                }
                return "[size=" + g().length + " text=" + H2 + "…]";
            }
            if (g().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(g().length);
                sb.append(" hex=");
                int e2 = b.e(this, 64);
                if (e2 <= g().length) {
                    if (e2 < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb.append((e2 == g().length ? this : new h(Da.p.q(g(), 0, e2))).l());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + g().length + ')').toString());
            }
            str = "[hex=" + l() + ']';
        }
        return str;
    }

    public final h v() {
        return d("MD5");
    }

    public boolean x(int i, h other, int i2, int i3) {
        kotlin.jvm.internal.t.g(other, "other");
        return other.y(i2, g(), i, i3);
    }

    public boolean y(int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.t.g(other, "other");
        return i >= 0 && i <= g().length - i3 && i2 >= 0 && i2 <= other.length - i3 && b.a(g(), i, other, i2, i3);
    }

    public final void z(int i) {
        this.b = i;
    }
}
