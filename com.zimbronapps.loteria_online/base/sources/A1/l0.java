package a1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;

    public l0(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = textPaint;
        this.e = i3;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = i4;
        this.i = truncateAt;
        this.j = i5;
        this.k = f;
        this.l = f2;
        this.m = i6;
        this.n = z;
        this.o = z2;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        this.t = iArr;
        this.u = iArr2;
        if (!(i >= 0 && i <= i2)) {
            g1.a.a("invalid start value");
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            g1.a.a("invalid end value");
        }
        if (!(i4 >= 0)) {
            g1.a.a("invalid maxLines value");
        }
        if (!(i3 >= 0)) {
            g1.a.a("invalid width value");
        }
        if (!(i5 >= 0)) {
            g1.a.a("invalid ellipsizedWidth value");
        }
        if (f >= 0.0f) {
            return;
        }
        g1.a.a("invalid lineSpacingMultiplier value");
    }

    public final Layout.Alignment a() {
        return this.g;
    }

    public final int b() {
        return this.p;
    }

    public final TextUtils.TruncateAt c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.s;
    }

    public final boolean g() {
        return this.n;
    }

    public final int h() {
        return this.m;
    }

    public final int[] i() {
        return this.t;
    }

    public final int j() {
        return this.q;
    }

    public final int k() {
        return this.r;
    }

    public final float l() {
        return this.l;
    }

    public final float m() {
        return this.k;
    }

    public final int n() {
        return this.h;
    }

    public final TextPaint o() {
        return this.d;
    }

    public final int[] p() {
        return this.u;
    }

    public final int q() {
        return this.b;
    }

    public final CharSequence r() {
        return this.a;
    }

    public final TextDirectionHeuristic s() {
        return this.f;
    }

    public final boolean t() {
        return this.o;
    }

    public final int u() {
        return this.e;
    }
}
