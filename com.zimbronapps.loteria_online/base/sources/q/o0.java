package Q;

import Z0.T0;
import Z0.W0;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, f1.J r20, Z0.T0 r21, u0.h r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            Z0.n r7 = r21.w()
            long r8 = Z0.X0.b(r4, r5)
            r5 = 0
            r7.c(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.b(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            u0.h r8 = new u0.h
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.r(r8)
            float r9 = r8.i()
            float r10 = r8.l()
            boolean r9 = c(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.j()
            float r10 = r8.e()
            boolean r9 = c(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            l1.i r5 = r9.c(r5)
            l1.i r10 = l1.i.b
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.i()
            float r13 = r8.l()
            float r14 = r8.j()
            float r15 = r8.e()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.o0.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, f1.J, Z0.T0, u0.h):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, f1.U u, f1.J j, T0 t0, Matrix matrix, u0.h hVar, u0.h hVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int l = W0.l(u.k());
        builder.setSelectionRange(l, W0.k(u.k()));
        if (z) {
            d(builder, l, j, t0, hVar);
        }
        if (z2) {
            W0 j2 = u.j();
            int l2 = j2 != null ? W0.l(j2.r()) : -1;
            W0 j3 = u.j();
            int k = j3 != null ? W0.k(j3.r()) : -1;
            if (l2 >= 0 && l2 < k) {
                builder.setComposingText(l2, u.l().subSequence(l2, k));
                a(builder, l2, k, j, t0, hVar);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            l.a(builder, hVar2);
        }
        if (i >= 34 && z4) {
            n.a(builder, t0, hVar);
        }
        return builder.build();
    }

    public static final boolean c(u0.h hVar, float f, float f2) {
        float i = hVar.i();
        if (f <= hVar.j() && i <= f) {
            float l = hVar.l();
            if (f2 <= hVar.e() && l <= f2) {
                return true;
            }
        }
        return false;
    }

    public static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i, f1.J j, T0 t0, u0.h hVar) {
        if (i < 0) {
            return builder;
        }
        int b = j.b(i);
        u0.h e = t0.e(b);
        float l = Wa.n.l(e.i(), 0.0f, n1.r.g(t0.B()));
        boolean c = c(hVar, l, e.l());
        boolean c2 = c(hVar, l, e.e());
        boolean z = t0.c(b) == l1.i.b;
        int i2 = (c || c2) ? 1 : 0;
        if (!c || !c2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(l, e.l(), e.e(), e.e(), z ? i2 | 4 : i2);
        return builder;
    }
}
