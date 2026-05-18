package i1;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;
import v0.A1;
import v0.C1;
import v0.F1;
import v0.h0;
import v0.i0;
import v0.j0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final void a(Z0.n nVar, j0 j0Var, h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i) {
        j0Var.s();
        if (nVar.z().size() <= 1) {
            b(nVar, j0Var, h0Var, f, c1, kVar, gVar, i);
        } else if (h0Var instanceof F1) {
            b(nVar, j0Var, h0Var, f, c1, kVar, gVar, i);
        } else {
            if (!(h0Var instanceof A1)) {
                throw new Ca.o();
            }
            List z = nVar.z();
            int size = z.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                Z0.w wVar = (Z0.w) z.get(i2);
                f3 += wVar.e().getHeight();
                f2 = Math.max(f2, wVar.e().getWidth());
            }
            Shader shader = ((A1) h0Var).createShader-uvyYCjk(u0.l.d((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)));
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            List z2 = nVar.z();
            int size2 = z2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Z0.w wVar2 = (Z0.w) z2.get(i3);
                wVar2.e().B(j0Var, i0.a(shader), f, c1, kVar, gVar, i);
                j0Var.d(0.0f, wVar2.e().getHeight());
                matrix.setTranslate(0.0f, -wVar2.e().getHeight());
                shader.setLocalMatrix(matrix);
            }
        }
        j0Var.k();
    }

    public static final void b(Z0.n nVar, j0 j0Var, h0 h0Var, float f, C1 c1, l1.k kVar, x0.g gVar, int i) {
        List z = nVar.z();
        int size = z.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z0.w wVar = (Z0.w) z.get(i2);
            wVar.e().B(j0Var, h0Var, f, c1, kVar, gVar, i);
            j0Var.d(0.0f, wVar.e().getHeight());
        }
    }
}
