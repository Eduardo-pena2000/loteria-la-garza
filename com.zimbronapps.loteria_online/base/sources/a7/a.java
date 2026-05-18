package A7;

import java.util.Arrays;
import z7.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a {
    public final byte[] a;

    public a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new a(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    public byte[] c() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "Bytes(" + g.a(this.a) + ")";
    }
}
