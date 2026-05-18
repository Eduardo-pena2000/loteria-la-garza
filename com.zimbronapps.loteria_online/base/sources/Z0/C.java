package Z0;

import Z0.N0;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import l1.e;
import l1.f;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final /* synthetic */ CharSequence a(CharSequence charSequence) {
        return j(charSequence);
    }

    public static final /* synthetic */ int b(a1.o0 o0Var, int i) {
        return k(o0Var, i);
    }

    public static final /* synthetic */ boolean c(Y0 y0, boolean z) {
        return l(y0, z);
    }

    public static final /* synthetic */ int d(int i) {
        return m(i);
    }

    public static final /* synthetic */ int e(int i) {
        return n(i);
    }

    public static final /* synthetic */ int f(int i) {
        return o(i);
    }

    public static final /* synthetic */ int g(int i) {
        return p(i);
    }

    public static final /* synthetic */ int h(int i) {
        return q(i);
    }

    public static final /* synthetic */ int i(int i) {
        return r(i);
    }

    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable == null) {
            spannable = new SpannableString(charSequence);
        }
        if (!a1.U.a(spannable, c1.c.class)) {
            j1.d.x(spannable, new c1.c(), spannable.length() - 1, spannable.length() - 1);
        }
        return spannable;
    }

    public static final int k(a1.o0 o0Var, int i) {
        int m = o0Var.m();
        for (int i2 = 0; i2 < m; i2++) {
            if (o0Var.l(i2) > i) {
                return i2;
            }
        }
        return o0Var.m();
    }

    public static final boolean l(Y0 y0, boolean z) {
        if (!z || n1.v.e(y0.s(), n1.w.f(0)) || n1.v.e(y0.s(), n1.v.b.a())) {
            return false;
        }
        int B = y0.B();
        j.a aVar = l1.j.b;
        return (l1.j.k(B, aVar.g()) || l1.j.k(y0.B(), aVar.f()) || l1.j.k(y0.B(), aVar.c())) ? false : true;
    }

    public static final int m(int i) {
        j.a aVar = l1.j.b;
        if (l1.j.k(i, aVar.d())) {
            return 3;
        }
        if (l1.j.k(i, aVar.e())) {
            return 4;
        }
        if (l1.j.k(i, aVar.a())) {
            return 2;
        }
        return (!l1.j.k(i, aVar.f()) && l1.j.k(i, aVar.b())) ? 1 : 0;
    }

    public static final int n(int i) {
        f.b.a aVar = f.b.a;
        if (f.b.e(i, aVar.c())) {
            return 0;
        }
        if (f.b.e(i, aVar.b())) {
            return 1;
        }
        return f.b.e(i, aVar.a()) ? 2 : 0;
    }

    public static final int o(int i) {
        e.a aVar = l1.e.b;
        if (l1.e.g(i, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        l1.e.g(i, aVar.b());
        return 0;
    }

    public static final int p(int i) {
        f.c.a aVar = f.c.a;
        if (f.c.f(i, aVar.a())) {
            return 0;
        }
        if (f.c.f(i, aVar.b())) {
            return 1;
        }
        if (f.c.f(i, aVar.c())) {
            return 2;
        }
        return f.c.f(i, aVar.d()) ? 3 : 0;
    }

    public static final int q(int i) {
        f.d.a aVar = f.d.a;
        return (!f.d.d(i, aVar.a()) && f.d.d(i, aVar.b())) ? 1 : 0;
    }

    public static final int r(int i) {
        N0.a aVar = N0.a;
        return (!N0.d(i, aVar.a()) && N0.d(i, aVar.b())) ? 1 : 0;
    }
}
