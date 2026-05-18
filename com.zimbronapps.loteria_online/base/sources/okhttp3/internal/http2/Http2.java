package okhttp3.internal.http2;

import Za.B;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2 {
    public static final Http2 a = new Http2();
    public static final h b = h.d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] d = new String[64];
    public static final String[] e;

    static {
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            t.f(binaryString, "toBinaryString(it)");
            strArr[i2] = B.G(Util.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = t.o(strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = d;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        int length = d.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = d;
            if (strArr4[i] == null) {
                strArr4[i] = e[i];
            }
            i = i8;
        }
    }

    private Http2() {
    }

    public final String a(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : e[i2];
            }
            if (i != 7 && i != 8) {
                String[] strArr = d;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    t.d(str);
                } else {
                    str = e[i2];
                }
                String str2 = str;
                return (i != 5 || (i2 & 4) == 0) ? (i != 0 || (i2 & 32) == 0) ? str2 : B.H(str2, "PRIORITY", "COMPRESSED", false, 4, null) : B.H(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return e[i2];
    }

    public final String b(int i) {
        String[] strArr = c;
        return i < strArr.length ? strArr[i] : Util.t("0x%02x", Integer.valueOf(i));
    }

    public final String c(boolean z, int i, int i2, int i3, int i4) {
        return Util.t("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b(i3), a(i3, i4));
    }
}
