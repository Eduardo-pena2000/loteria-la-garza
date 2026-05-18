package a1;

import a1.M;
import android.graphics.RectF;
import android.text.Layout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p0 {
    public static final float a(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    public static final float b(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(a1.M.a r5, android.graphics.RectF r6, int r7, int r8, int r9, float r10, float r11, float[] r12, b1.f r13, Qa.p r14) {
        /*
            boolean r0 = g(r6, r10, r11)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r5.c()
            r2 = 1
            if (r0 != 0) goto L15
            float r0 = r6.right
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L21
        L15:
            boolean r11 = r5.c()
            if (r11 == 0) goto L27
            float r11 = r6.left
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 > 0) goto L27
        L21:
            int r10 = r5.a()
            int r10 = r10 - r2
            goto L5e
        L27:
            int r10 = r5.b()
            int r11 = r5.a()
        L2f:
            int r0 = r11 - r10
            if (r0 <= r2) goto L57
            int r0 = r11 + r10
            int r0 = r0 / 2
            float r3 = a(r0, r7, r12)
            boolean r4 = r5.c()
            if (r4 != 0) goto L47
            float r4 = r6.right
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L53
        L47:
            boolean r4 = r5.c()
            if (r4 == 0) goto L55
            float r4 = r6.left
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L55
        L53:
            r11 = r0
            goto L2f
        L55:
            r10 = r0
            goto L2f
        L57:
            boolean r0 = r5.c()
            if (r0 == 0) goto L5e
            r10 = r11
        L5e:
            int r10 = r10 + r2
            int r10 = r13.b(r10)
            if (r10 != r1) goto L66
            return r1
        L66:
            int r11 = r13.c(r10)
            int r0 = r5.b()
            if (r11 > r0) goto L71
            return r1
        L71:
            int r0 = r5.b()
            int r10 = Wa.n.e(r10, r0)
            int r0 = r5.a()
            int r11 = Wa.n.i(r11, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r8 = (float) r8
            float r9 = (float) r9
            r2 = 0
            r0.<init>(r2, r8, r2, r9)
        L89:
            boolean r8 = r5.c()
            if (r8 == 0) goto L96
            int r8 = r11 + (-1)
            float r8 = a(r8, r7, r12)
            goto L9a
        L96:
            float r8 = a(r10, r7, r12)
        L9a:
            r0.left = r8
            boolean r8 = r5.c()
            if (r8 == 0) goto La7
            float r8 = b(r10, r7, r12)
            goto Lad
        La7:
            int r8 = r11 + (-1)
            float r8 = b(r8, r7, r12)
        Lad:
            r0.right = r8
            java.lang.Object r8 = r14.invoke(r0, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lbc
            return r11
        Lbc:
            int r11 = r13.d(r11)
            if (r11 == r1) goto Ld6
            int r8 = r5.b()
            if (r11 > r8) goto Lc9
            goto Ld6
        Lc9:
            int r8 = r13.b(r11)
            int r9 = r5.b()
            int r10 = Wa.n.e(r8, r9)
            goto L89
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.p0.c(a1.M$a, android.graphics.RectF, int, int, int, float, float, float[], b1.f, Qa.p):int");
    }

    public static final int[] d(o0 o0Var, Layout layout, M m, RectF rectF, int i, Qa.p pVar) {
        int i2;
        int i3;
        b1.f jVar = i == 1 ? new b1.j(o0Var.G(), o0Var.I()) : b1.g.a(o0Var.G(), o0Var.H());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > o0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= o0Var.m()) {
            return null;
        }
        int i4 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < o0Var.w(0)) {
            return null;
        }
        int f = f(o0Var, layout, m, i4, rectF, jVar, pVar, true);
        while (true) {
            i2 = i4;
            i3 = f;
            if (i3 != -1 || i2 >= lineForVertical2) {
                break;
            }
            i4 = i2 + 1;
            f = f(o0Var, layout, m, i4, rectF, jVar, pVar, true);
        }
        if (i3 == -1) {
            return null;
        }
        int f2 = f(o0Var, layout, m, lineForVertical2, rectF, jVar, pVar, false);
        while (f2 == -1 && i2 < lineForVertical2) {
            lineForVertical2--;
            f2 = f(o0Var, layout, m, lineForVertical2, rectF, jVar, pVar, false);
        }
        if (f2 == -1) {
            return null;
        }
        return new int[]{jVar.b(i3 + 1), jVar.c(f2 - 1)};
    }

    public static final int e(M.a aVar, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, b1.f fVar, Qa.p pVar) {
        int b;
        int b2;
        if (!g(rectF, f, f2)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f) && (!aVar.c() || rectF.right < f2)) {
            b = aVar.b();
            int a = aVar.a();
            while (a - b > 1) {
                int i4 = (a + b) / 2;
                float a2 = a(i4, i, fArr);
                if ((aVar.c() || a2 <= rectF.left) && (!aVar.c() || a2 >= rectF.right)) {
                    b = i4;
                } else {
                    a = i4;
                }
            }
            if (aVar.c()) {
                b = a;
            }
        } else {
            b = aVar.b();
        }
        int c = fVar.c(b);
        if (c == -1 || (b2 = fVar.b(c)) >= aVar.a()) {
            return -1;
        }
        int e = Wa.n.e(b2, aVar.b());
        int i5 = Wa.n.i(c, aVar.a());
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = aVar.c() ? a(i5 - 1, i, fArr) : a(e, i, fArr);
            rectF2.right = aVar.c() ? b(e, i, fArr) : b(i5 - 1, i, fArr);
            if (((Boolean) pVar.invoke(rectF2, rectF)).booleanValue()) {
                return e;
            }
            e = fVar.a(e);
            if (e == -1 || e >= aVar.a()) {
                break;
            }
            i5 = Wa.n.i(fVar.c(e), aVar.a());
        }
        return -1;
    }

    public static final int f(o0 o0Var, Layout layout, M m, int i, RectF rectF, b1.f fVar, Qa.p pVar, boolean z) {
        int i2;
        M.a[] aVarArr;
        int i3;
        int c;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        o0Var.b(i, fArr);
        M.a[] d = m.d(i);
        Wa.i X = z ? Da.r.X(d) : Wa.n.s(Da.r.a0(d), 0);
        int f = X.f();
        int g = X.g();
        int h = X.h();
        if ((h <= 0 || f > g) && (h >= 0 || g > f)) {
            return -1;
        }
        int i4 = f;
        while (true) {
            M.a aVar = d[i4];
            float a = aVar.c() ? a(aVar.a() - 1, lineStart, fArr) : a(aVar.b(), lineStart, fArr);
            float b = aVar.c() ? b(aVar.b(), lineStart, fArr) : b(aVar.a() - 1, lineStart, fArr);
            if (z) {
                i2 = i4;
                aVarArr = d;
                i3 = g;
                c = e(aVar, rectF, lineStart, lineTop, lineBottom, a, b, fArr, fVar, pVar);
            } else {
                i2 = i4;
                aVarArr = d;
                i3 = g;
                c = c(aVar, rectF, lineStart, lineTop, lineBottom, a, b, fArr, fVar, pVar);
            }
            if (c >= 0) {
                return c;
            }
            if (i2 == i3) {
                return -1;
            }
            i4 = i2 + h;
            g = i3;
            d = aVarArr;
        }
    }

    public static final boolean g(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
