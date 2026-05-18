package l0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o {
    public final w.H a;

    public o(long[] jArr) {
        w.H h;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            h = new w.H(copyOf.length);
            h.e(h.b, copyOf);
        } else {
            h = new w.H(0, 1, null);
        }
        this.a = h;
    }

    public final void a(long j) {
        this.a.d(j);
    }

    public final long[] b() {
        w.H h = this.a;
        int i = h.b;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = h.a;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
