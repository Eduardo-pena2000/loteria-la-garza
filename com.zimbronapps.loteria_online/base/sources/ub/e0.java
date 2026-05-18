package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e0 {
    public static final String[] a;
    public static final byte[] b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + e(i >> 12) + e(i >> 8) + e(i >> 4) + e(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        b = bArr;
    }

    public static final byte[] a() {
        return b;
    }

    public static final String[] b() {
        return a;
    }

    public static final void c(StringBuilder sb, String value) {
        kotlin.jvm.internal.t.g(sb, "<this>");
        kotlin.jvm.internal.t.g(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            String[] strArr = a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append(value, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append(value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        if (Za.B.z(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (Za.B.z(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char e(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
