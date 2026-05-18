package c1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements LineHeightSpan {
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public int h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;
    public int k = Integer.MIN_VALUE;
    public int l;
    public int m;

    public h(float f, int i, int i2, boolean z, boolean z2, float f2, boolean z3) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = f2;
        this.g = z3;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        g1.a.c("topRatio should be in [0..1] range or -1");
    }

    public final void a(Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.a);
        int a = ceil - i.a(fontMetricsInt);
        if (this.g && a <= 0) {
            int i = fontMetricsInt.ascent;
            this.i = i;
            int i2 = fontMetricsInt.descent;
            this.j = i2;
            this.h = i;
            this.k = i2;
            this.l = 0;
            this.m = 0;
            return;
        }
        float f = this.f;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int ceil2 = (int) (a <= 0 ? Math.ceil(a * f) : Math.ceil(a * (1.0f - f)));
        int i3 = fontMetricsInt.descent;
        int i4 = ceil2 + i3;
        this.j = i4;
        int i5 = i4 - ceil;
        this.i = i5;
        if (this.d) {
            i5 = fontMetricsInt.ascent;
        }
        this.h = i5;
        if (this.e) {
            i4 = i3;
        }
        this.k = i4;
        this.l = fontMetricsInt.ascent - i5;
        this.m = i4 - i3;
    }

    public final h b(int i, int i2, boolean z) {
        return new h(this.a, i, i2, z, this.e, this.f, this.g);
    }

    public final int c() {
        return this.l;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.b;
        boolean z2 = i2 == this.c;
        if (z && z2 && this.d && this.e) {
            return;
        }
        if (this.h == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.h : this.i;
        fontMetricsInt.descent = z2 ? this.k : this.j;
    }

    public final int d() {
        return this.m;
    }

    public final boolean e() {
        return this.e;
    }
}
