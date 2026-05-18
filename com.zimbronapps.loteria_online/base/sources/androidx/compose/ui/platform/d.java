package androidx.compose.ui.platform;

import W0.t;
import Wa.n;
import Z0.T0;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends androidx.compose.ui.platform.a {
    public static d h;
    public T0 c;
    public t d;
    public Rect e;
    public static final a f = new a(null);
    public static final int g = 8;
    public static final l1.i i = l1.i.b;
    public static final l1.i j = l1.i.a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final d a() {
            if (d.g() == null) {
                d.h(new d(null));
            }
            d g = d.g();
            kotlin.jvm.internal.t.e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return g;
        }

        public a() {
        }
    }

    public /* synthetic */ d(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static final /* synthetic */ d g() {
        return h;
    }

    public static final /* synthetic */ void h(d dVar) {
        h = dVar;
    }

    private final int i(int i2, l1.i iVar) {
        T0 t0 = this.c;
        T0 t02 = null;
        if (t0 == null) {
            kotlin.jvm.internal.t.v("layoutResult");
            t0 = null;
        }
        int u = t0.u(i2);
        T0 t03 = this.c;
        if (t03 == null) {
            kotlin.jvm.internal.t.v("layoutResult");
            t03 = null;
        }
        if (iVar != t03.y(u)) {
            T0 t04 = this.c;
            if (t04 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
            } else {
                t02 = t04;
            }
            return t02.u(i2);
        }
        T0 t05 = this.c;
        if (t05 == null) {
            kotlin.jvm.internal.t.v("layoutResult");
            t05 = null;
        }
        return T0.p(t05, i2, false, 2, null) - 1;
    }

    public int[] a(int i2) {
        int n;
        T0 t0 = null;
        if (d().length() <= 0 || i2 >= d().length()) {
            return null;
        }
        try {
            t tVar = this.d;
            if (tVar == null) {
                kotlin.jvm.internal.t.v("node");
                tVar = null;
            }
            u0.h k = tVar.k();
            int round = Math.round(k.e() - k.l());
            int e = n.e(0, i2);
            T0 t02 = this.c;
            if (t02 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t02 = null;
            }
            int q = t02.q(e);
            T0 t03 = this.c;
            if (t03 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t03 = null;
            }
            float v = t03.v(q) + round;
            T0 t04 = this.c;
            if (t04 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t04 = null;
            }
            T0 t05 = this.c;
            if (t05 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t05 = null;
            }
            if (v < t04.v(t05.n() - 1)) {
                T0 t06 = this.c;
                if (t06 == null) {
                    kotlin.jvm.internal.t.v("layoutResult");
                } else {
                    t0 = t06;
                }
                n = t0.r(v);
            } else {
                T0 t07 = this.c;
                if (t07 == null) {
                    kotlin.jvm.internal.t.v("layoutResult");
                } else {
                    t0 = t07;
                }
                n = t0.n();
            }
            return c(e, i(n - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public int[] b(int i2) {
        int i3;
        T0 t0 = null;
        if (d().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            t tVar = this.d;
            if (tVar == null) {
                kotlin.jvm.internal.t.v("node");
                tVar = null;
            }
            u0.h k = tVar.k();
            int round = Math.round(k.e() - k.l());
            int i4 = n.i(d().length(), i2);
            T0 t02 = this.c;
            if (t02 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t02 = null;
            }
            int q = t02.q(i4);
            T0 t03 = this.c;
            if (t03 == null) {
                kotlin.jvm.internal.t.v("layoutResult");
                t03 = null;
            }
            float v = t03.v(q) - round;
            if (v > 0.0f) {
                T0 t04 = this.c;
                if (t04 == null) {
                    kotlin.jvm.internal.t.v("layoutResult");
                } else {
                    t0 = t04;
                }
                i3 = t0.r(v);
            } else {
                i3 = 0;
            }
            if (i4 == d().length() && i3 < q) {
                i3++;
            }
            return c(i(i3, i), i4);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, T0 t0, t tVar) {
        f(str);
        this.c = t0;
        this.d = tVar;
    }

    public d() {
        this.e = new Rect();
    }
}
