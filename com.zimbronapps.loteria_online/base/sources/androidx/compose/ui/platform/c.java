package androidx.compose.ui.platform;

import Z0.T0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends androidx.compose.ui.platform.a {
    public static c f;
    public T0 c;
    public static final a d = new a(null);
    public static final int e = 8;
    public static final l1.i g = l1.i.b;
    public static final l1.i h = l1.i.a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final c a() {
            if (c.g() == null) {
                c.h(new c(null));
            }
            c g = c.g();
            t.e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return g;
        }

        public a() {
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static final /* synthetic */ c g() {
        return f;
    }

    public static final /* synthetic */ void h(c cVar) {
        f = cVar;
    }

    public int[] a(int i) {
        int i2;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            T0 t0 = this.c;
            if (t0 == null) {
                t.v("layoutResult");
                t0 = null;
            }
            i2 = t0.q(0);
        } else {
            T0 t02 = this.c;
            if (t02 == null) {
                t.v("layoutResult");
                t02 = null;
            }
            int q = t02.q(i);
            i2 = i(q, g) == i ? q : q + 1;
        }
        T0 t03 = this.c;
        if (t03 == null) {
            t.v("layoutResult");
            t03 = null;
        }
        if (i2 >= t03.n()) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    public int[] b(int i) {
        int i2;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > d().length()) {
            T0 t0 = this.c;
            if (t0 == null) {
                t.v("layoutResult");
                t0 = null;
            }
            i2 = t0.q(d().length());
        } else {
            T0 t02 = this.c;
            if (t02 == null) {
                t.v("layoutResult");
                t02 = null;
            }
            int q = t02.q(i);
            i2 = i(q, h) + 1 == i ? q : q - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    public final int i(int i, l1.i iVar) {
        T0 t0 = this.c;
        T0 t02 = null;
        if (t0 == null) {
            t.v("layoutResult");
            t0 = null;
        }
        int u = t0.u(i);
        T0 t03 = this.c;
        if (t03 == null) {
            t.v("layoutResult");
            t03 = null;
        }
        if (iVar != t03.y(u)) {
            T0 t04 = this.c;
            if (t04 == null) {
                t.v("layoutResult");
            } else {
                t02 = t04;
            }
            return t02.u(i);
        }
        T0 t05 = this.c;
        if (t05 == null) {
            t.v("layoutResult");
            t05 = null;
        }
        return T0.p(t05, i, false, 2, null) - 1;
    }

    public final void j(String str, T0 t0) {
        f(str);
        this.c = t0;
    }

    public c() {
    }
}
