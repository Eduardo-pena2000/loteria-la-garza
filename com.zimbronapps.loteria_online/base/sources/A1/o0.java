package a1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final O e;
    public final boolean f;
    public b1.i g;
    public final Layout h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final boolean n;
    public final Paint.FontMetricsInt o;
    public final int p;
    public final c1.h[] q;
    public final Rect r;
    public M s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public o0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, O o) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        BoringLayout a;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        this.d = z2;
        this.e = o;
        this.r = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic k = q0.k(i2);
        Layout.Alignment a2 = m0.a.a(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, c1.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics e = o.e();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (e == null || o.i() > f || z5) {
                z3 = true;
                this.n = false;
                z4 = false;
                textDirectionHeuristic = k;
                a = j0.a.a(charSequence, textPaint, ceil, 0, charSequence.length(), k, a2, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.n = true;
                z3 = true;
                a = k.a.a(charSequence, textPaint, ceil, e, a2, z, z2, truncateAt, ceil);
                textDirectionHeuristic = k;
                z4 = false;
            }
            this.h = a;
            Trace.endSection();
            int min = Math.min(a.getLineCount(), i3);
            this.i = min;
            int i9 = min - 1;
            this.f = (min >= i3 && (a.getEllipsisCount(i9) > 0 || a.getLineEnd(i9) != charSequence.length())) ? z3 : z4;
            long f4 = q0.f(this);
            c1.h[] d2 = q0.d(this);
            this.q = d2;
            long c = d2 != null ? q0.c(d2) : q0.g();
            this.j = Math.max(r0.c(f4), r0.c(c));
            this.k = Math.max(r0.b(f4), r0.b(c));
            Paint.FontMetricsInt b = q0.b(this, textPaint, textDirectionHeuristic, d2);
            this.p = b != null ? b.bottom - ((int) s(i9)) : z4;
            this.o = b;
            this.l = c1.d.b(a, i9, null, 2, null);
            this.m = c1.d.d(a, i9, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float B(o0 o0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return o0Var.A(i, z);
    }

    public static /* synthetic */ float E(o0 o0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return o0Var.D(i, z);
    }

    public final float A(int i, boolean z) {
        return j().c(i, true, z) + g(q(i));
    }

    public final int[] C(RectF rectF, int i, Qa.p pVar) {
        return Build.VERSION.SDK_INT >= 34 ? f.a.c(this, rectF, i, pVar) : p0.d(this, this.h, j(), rectF, i, pVar);
    }

    public final float D(int i, boolean z) {
        return j().c(i, false, z) + g(q(i));
    }

    public final void F(int i, int i2, Path path) {
        this.h.getSelectionPath(i, i2, path);
        if (this.j == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.j);
    }

    public final CharSequence G() {
        return this.h.getText();
    }

    public final TextPaint H() {
        return this.a;
    }

    public final b1.i I() {
        b1.i iVar = this.g;
        if (iVar != null) {
            return iVar;
        }
        b1.i iVar2 = new b1.i(this.h.getText(), 0, this.h.getText().length(), this.a.getTextLocale());
        this.g = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.n) {
            k kVar = k.a;
            Layout layout = this.h;
            kotlin.jvm.internal.t.e(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return kVar.b((BoringLayout) layout);
        }
        j0 j0Var = j0.a;
        Layout layout2 = this.h;
        kotlin.jvm.internal.t.e(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return j0Var.c((StaticLayout) layout2, this.d);
    }

    public final boolean K(int i) {
        return this.h.isRtlCharAt(i);
    }

    public final void L(Canvas canvas) {
        if (canvas.getClipBounds(this.r)) {
            int i = this.j;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            n0 e = q0.e();
            e.a(canvas);
            this.h.draw(e);
            int i2 = this.j;
            if (i2 != 0) {
                canvas.translate(0.0f, (-1) * i2);
            }
        }
    }

    public final void a(int i, int i2, float[] fArr, int i3) {
        float d;
        float e;
        int length = G().length();
        if (!(i >= 0)) {
            g1.a.a("startOffset must be > 0");
        }
        if (!(i < length)) {
            g1.a.a("startOffset must be less than text length");
        }
        if (!(i2 > i)) {
            g1.a.a("endOffset must be greater than startOffset");
        }
        if (!(i2 <= length)) {
            g1.a.a("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i3 >= (i2 - i) * 4)) {
            g1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int q = q(i);
        int q2 = q(i2 - 1);
        J j = new J(this);
        if (q > q2) {
            return;
        }
        int i4 = q;
        int i5 = i3;
        while (true) {
            int v = v(i4);
            int p = p(i4);
            int min = Math.min(i2, p);
            float w = w(i4);
            float l = l(i4);
            boolean z = z(i4) == 1;
            for (int max = Math.max(i, v); max < min; max++) {
                boolean K = K(max);
                if (z && !K) {
                    d = j.b(max);
                    e = j.c(max + 1);
                } else if (z && K) {
                    e = j.d(max);
                    d = j.e(max + 1);
                } else if (z || !K) {
                    d = j.d(max);
                    e = j.e(max + 1);
                } else {
                    e = j.b(max);
                    d = j.c(max + 1);
                }
                fArr[i5] = d;
                fArr[i5 + 1] = w;
                fArr[i5 + 2] = e;
                fArr[i5 + 3] = l;
                i5 += 4;
            }
            if (i4 == q2) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void b(int i, float[] fArr) {
        float d;
        float e;
        int v = v(i);
        int p = p(i);
        int i2 = 0;
        if (!(fArr.length >= (p - v) * 2)) {
            g1.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        J j = new J(this);
        boolean z = z(i) == 1;
        while (v < p) {
            boolean K = K(v);
            if (z && !K) {
                d = j.b(v);
                e = j.c(v + 1);
            } else if (z && K) {
                e = j.d(v);
                d = j.e(v + 1);
            } else if (K) {
                e = j.b(v);
                d = j.c(v + 1);
            } else {
                d = j.d(v);
                e = j.e(v + 1);
            }
            fArr[i2] = d;
            fArr[i2 + 1] = e;
            i2 += 2;
            v++;
        }
    }

    public final RectF c(int i) {
        float D;
        float D2;
        float A;
        float A2;
        int q = q(i);
        float w = w(q);
        float l = l(q);
        boolean z = z(q) == 1;
        boolean isRtlCharAt = this.h.isRtlCharAt(i);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                A = D(i, false);
                A2 = D(i + 1, true);
            } else if (isRtlCharAt) {
                A = A(i, false);
                A2 = A(i + 1, true);
            } else {
                D = D(i, false);
                D2 = D(i + 1, true);
            }
            float f = A;
            D = A2;
            D2 = f;
        } else {
            D = A(i, false);
            D2 = A(i + 1, true);
        }
        return new RectF(D, w, D2, l);
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.d;
    }

    public final int f() {
        return (this.f ? this.h.getLineBottom(this.i - 1) : this.h.getHeight()) + this.j + this.k + this.p;
    }

    public final float g(int i) {
        if (i == this.i - 1) {
            return this.l + this.m;
        }
        return 0.0f;
    }

    public final boolean h() {
        return this.c;
    }

    public final Layout i() {
        return this.h;
    }

    public final M j() {
        M m = this.s;
        if (m != null) {
            kotlin.jvm.internal.t.d(m);
            return m;
        }
        M m2 = new M(this.h);
        this.s = m2;
        return m2;
    }

    public final float k(int i) {
        return this.j + ((i != this.i + (-1) || this.o == null) ? this.h.getLineBaseline(i) : w(i) - this.o.ascent);
    }

    public final float l(int i) {
        if (i != this.i - 1 || this.o == null) {
            return this.j + this.h.getLineBottom(i) + (i == this.i + (-1) ? this.k : 0);
        }
        return this.h.getLineBottom(i - 1) + this.o.bottom;
    }

    public final int m() {
        return this.i;
    }

    public final int n(int i) {
        return this.h.getEllipsisCount(i);
    }

    public final int o(int i) {
        return this.h.getEllipsisStart(i);
    }

    public final int p(int i) {
        return (q0.m(this.h, i) && this.b == TextUtils.TruncateAt.END) ? this.h.getText().length() : this.h.getLineEnd(i);
    }

    public final int q(int i) {
        return this.h.getLineForOffset(i);
    }

    public final int r(int i) {
        return this.h.getLineForVertical(i - this.j);
    }

    public final float s(int i) {
        return l(i) - w(i);
    }

    public final float t(int i) {
        return this.h.getLineLeft(i) + (i == this.i + (-1) ? this.l : 0.0f);
    }

    public final float u(int i) {
        return this.h.getLineRight(i) + (i == this.i + (-1) ? this.m : 0.0f);
    }

    public final int v(int i) {
        return this.h.getLineStart(i);
    }

    public final float w(int i) {
        return this.h.getLineTop(i) + (i == 0 ? 0 : this.j);
    }

    public final int x(int i) {
        return (q0.m(this.h, i) && this.b == TextUtils.TruncateAt.END) ? this.h.getLineStart(i) + this.h.getEllipsisStart(i) : j().e(i);
    }

    public final int y(int i, float f) {
        return this.h.getOffsetForHorizontal(i, f + ((-1) * g(i)));
    }

    public final int z(int i) {
        return this.h.getParagraphDirection(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, O o, int i9, kotlin.jvm.internal.k kVar) {
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        this(charSequence, f, textPaint, i10, truncateAt2, i11, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & 262144) != 0 ? new O(charSequence, textPaint, i11) : o);
    }
}
