package O0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z0 {
    public int a;
    public androidx.compose.ui.layout.v[] b = new androidx.compose.ui.layout.v[32];
    public float[] c = new float[32];
    public byte[] d = new byte[32];
    public w.Q e = w.f0.b();
    public final w.Q f = w.f0.b();

    public final void a() {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = null;
            this.c[i2] = Float.NaN;
            this.d[i2] = 0;
        }
        this.a = 0;
    }

    public final boolean b(androidx.compose.ui.layout.v vVar) {
        return Da.r.O(this.b, vVar);
    }

    public final float c(androidx.compose.ui.layout.v vVar, float f) {
        int g0 = Da.r.g0(this.b, vVar);
        return g0 < 0 ? f : this.c[g0];
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r21, O0.T r22, w.P r23) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.z0.d(boolean, O0.T, w.P):void");
    }

    public final void e(androidx.compose.ui.layout.v vVar, float f) {
        int g0 = Da.r.g0(this.b, vVar);
        if (g0 >= 0) {
            float[] fArr = this.c;
            if (fArr[g0] != f) {
                fArr[g0] = f;
                this.d[g0] = 1;
                return;
            } else {
                byte[] bArr = this.d;
                if (bArr[g0] == 2) {
                    bArr[g0] = 0;
                    return;
                }
                return;
            }
        }
        int i = this.a;
        androidx.compose.ui.layout.v[] vVarArr = this.b;
        if (i == vVarArr.length) {
            int i2 = i * 2;
            Object[] copyOf = Arrays.copyOf(vVarArr, i2);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.b = (androidx.compose.ui.layout.v[]) copyOf;
            float[] copyOf2 = Arrays.copyOf(this.c, i2);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.c = copyOf2;
            byte[] copyOf3 = Arrays.copyOf(this.d, i2);
            kotlin.jvm.internal.t.f(copyOf3, "copyOf(...)");
            this.d = copyOf3;
        }
        this.b[i] = vVar;
        this.d[i] = 3;
        this.c[i] = f;
        this.a++;
    }
}
