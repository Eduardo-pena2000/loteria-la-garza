package okhttp3.internal;

import Za.B;
import Za.E;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.t;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HostnamesKt {
    public static final boolean a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (t.h(charAt, 31) <= 0 || t.h(charAt, 127) >= 0 || E.e0(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public static final boolean b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (t.h(charAt, 48) < 0 || t.h(charAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r14 = r11
            r15 = r14
            r13 = 0
        Le:
            r16 = 0
            if (r12 >= r7) goto L97
            if (r13 != r8) goto L15
            return r16
        L15:
            int r5 = r12 + 2
            if (r5 > r7) goto L38
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = Za.B.M(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L38
            if (r14 == r11) goto L2e
            return r16
        L2e:
            int r13 = r13 + 2
            if (r10 != r7) goto L35
            r14 = r13
            goto L97
        L35:
            r15 = r10
            r14 = r13
            goto L67
        L38:
            if (r13 == 0) goto L4a
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = Za.B.M(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4c
            int r12 = r12 + 1
        L4a:
            r15 = r12
            goto L67
        L4c:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = Za.B.M(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L66
            int r0 = r13 + (-2)
            boolean r0 = b(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L63
            return r16
        L63:
            int r13 = r13 + 2
            goto L97
        L66:
            return r16
        L67:
            r12 = r15
            r0 = 0
        L69:
            if (r12 >= r7) goto L7c
            char r1 = r6.charAt(r12)
            int r1 = okhttp3.internal.Util.I(r1)
            if (r1 != r11) goto L76
            goto L7c
        L76:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L69
        L7c:
            int r1 = r12 - r15
            if (r1 == 0) goto L96
            r2 = 4
            if (r1 <= r2) goto L84
            goto L96
        L84:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r13 + 2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto Le
        L96:
            return r16
        L97:
            if (r13 == r8) goto La9
            if (r14 != r11) goto L9c
            return r16
        L9c:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        La9:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String d(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        e eVar = new e();
        while (i2 < bArr.length) {
            if (i2 == i) {
                eVar.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    eVar.writeByte(58);
                }
                eVar.writeHexadecimalUnsignedLong((Util.d(bArr[i2], 255) << 8) | Util.d(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return eVar.readUtf8();
    }

    public static final String e(String str) {
        t.g(str, "<this>");
        if (!E.T(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                t.f(ascii, "toASCII(host)");
                Locale US = Locale.US;
                t.f(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress c = (B.N(str, "[", false, 2, null) && B.y(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (c == null) {
            return null;
        }
        byte[] address = c.getAddress();
        if (address.length == 16) {
            t.f(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return c.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
