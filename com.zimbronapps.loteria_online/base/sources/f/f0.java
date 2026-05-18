package F;

import T1.A0;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f0 {
    public static boolean A;
    public static final a x = new a(null);
    public static final int y = 8;
    public static final WeakHashMap z = new WeakHashMap();
    public final b a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;
    public final b i;
    public final c0 j;
    public final e0 k;
    public final e0 l;
    public final e0 m;
    public final c0 n;
    public final c0 o;
    public final c0 p;
    public final c0 q;
    public final c0 r;
    public final c0 s;
    public final c0 t;
    public final boolean u;
    public int v;
    public final y w;

    public static final class a {

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ f0 a;
            public final /* synthetic */ View b;

            public static final class a implements b0.X {
                public final /* synthetic */ f0 a;
                public final /* synthetic */ View b;

                public a(f0 f0Var, View view) {
                    this.a = f0Var;
                    this.b = view;
                }

                public void dispose() {
                    this.a.b(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var, View view) {
                super(1);
                this.a = f0Var;
                this.b = view;
            }

            public final b0.X invoke(b0.Y y) {
                this.a.h(this.b);
                return new a(this.a, this.b);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ b a(a aVar, A0 a0, int i, String str) {
            return aVar.e(a0, i, str);
        }

        public static final /* synthetic */ c0 b(a aVar, A0 a0, int i, String str) {
            return aVar.f(a0, i, str);
        }

        public final f0 c(b0.m mVar, int i) {
            if (b0.w.L()) {
                b0.w.U(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) mVar.x(AndroidCompositionLocals_androidKt.k());
            f0 d = d(view);
            boolean E = mVar.E(d) | mVar.E(view);
            Object C = mVar.C();
            if (E || C == b0.m.a.a()) {
                C = new a(d, view);
                mVar.t(C);
            }
            b0.b0.a(d, (Qa.l) C, mVar, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
            return d;
        }

        public final f0 d(View view) {
            f0 f0Var;
            synchronized (f0.a()) {
                try {
                    WeakHashMap a2 = f0.a();
                    Object obj = a2.get(view);
                    if (obj == null) {
                        obj = new f0(null, view, null);
                        a2.put(view, obj);
                    }
                    f0Var = (f0) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f0Var;
        }

        public final b e(A0 a0, int i, String str) {
            b bVar = new b(i, str);
            if (a0 != null) {
                bVar.h(a0, i);
            }
            return bVar;
        }

        public final c0 f(A0 a0, int i, String str) {
            K1.b bVar;
            if (a0 == null || (bVar = a0.g(i)) == null) {
                bVar = K1.b.e;
            }
            return l0.a(bVar, str);
        }

        public a() {
        }
    }

    public /* synthetic */ f0(A0 a0, View view, kotlin.jvm.internal.k kVar) {
        this(a0, view);
    }

    public static final /* synthetic */ WeakHashMap a() {
        return z;
    }

    public static /* synthetic */ void j(f0 f0Var, A0 a0, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        f0Var.i(a0, i);
    }

    public final void b(View view) {
        int i = this.v - 1;
        this.v = i;
        if (i == 0) {
            T1.Z.g0(view, null);
            T1.Z.l0(view, null);
            view.removeOnAttachStateChangeListener(this.w);
        }
    }

    public final boolean c() {
        return this.u;
    }

    public final b d() {
        return this.e;
    }

    public final e0 e() {
        return this.k;
    }

    public final b f() {
        return this.f;
    }

    public final b g() {
        return this.g;
    }

    public final void h(View view) {
        if (this.v == 0) {
            T1.Z.g0(view, this.w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.w);
            T1.Z.l0(view, this.w);
        }
        this.v++;
    }

    public final void i(A0 a0, int i) {
        if (A) {
            WindowInsets w = a0.w();
            kotlin.jvm.internal.t.d(w);
            a0 = A0.x(w);
        }
        this.a.h(a0, i);
        this.c.h(a0, i);
        this.b.h(a0, i);
        this.e.h(a0, i);
        this.f.h(a0, i);
        this.g.h(a0, i);
        this.h.h(a0, i);
        this.i.h(a0, i);
        this.d.h(a0, i);
        if (i == 0) {
            this.n.f(l0.f(a0.g(A0.l.b())));
            this.o.f(l0.f(a0.g(A0.l.g())));
            this.p.f(l0.f(a0.g(A0.l.h())));
            this.q.f(l0.f(a0.g(A0.l.i())));
            this.r.f(l0.f(a0.g(A0.l.k())));
            T1.r e = a0.e();
            if (e != null) {
                this.j.f(l0.f(e.f()));
            }
        }
        l0.l.e.m();
    }

    public final void k(A0 a0) {
        this.t.f(l0.f(a0.f(A0.l.d())));
    }

    public final void l(A0 a0) {
        this.s.f(l0.f(a0.f(A0.l.d())));
    }

    public f0(A0 a0, View view) {
        T1.r e;
        K1.b f;
        a aVar = x;
        this.a = a.a(aVar, a0, A0.l.b(), "captionBar");
        b a2 = a.a(aVar, a0, A0.l.c(), "displayCutout");
        this.b = a2;
        b a3 = a.a(aVar, a0, A0.l.d(), "ime");
        this.c = a3;
        b a4 = a.a(aVar, a0, A0.l.f(), "mandatorySystemGestures");
        this.d = a4;
        this.e = a.a(aVar, a0, A0.l.g(), "navigationBars");
        this.f = a.a(aVar, a0, A0.l.h(), "statusBars");
        b a5 = a.a(aVar, a0, A0.l.i(), "systemBars");
        this.g = a5;
        b a6 = a.a(aVar, a0, A0.l.j(), "systemGestures");
        this.h = a6;
        b a7 = a.a(aVar, a0, A0.l.k(), "tappableElement");
        this.i = a7;
        c0 a8 = l0.a((a0 == null || (e = a0.e()) == null || (f = e.f()) == null) ? K1.b.e : f, "waterfall");
        this.j = a8;
        e0 f2 = g0.f(g0.f(a5, a3), a2);
        this.k = f2;
        e0 f3 = g0.f(g0.f(g0.f(a7, a4), a6), a8);
        this.l = f3;
        this.m = g0.f(f2, f3);
        this.n = a.b(aVar, a0, A0.l.b(), "captionBarIgnoringVisibility");
        this.o = a.b(aVar, a0, A0.l.g(), "navigationBarsIgnoringVisibility");
        this.p = a.b(aVar, a0, A0.l.h(), "statusBarsIgnoringVisibility");
        this.q = a.b(aVar, a0, A0.l.i(), "systemBarsIgnoringVisibility");
        this.r = a.b(aVar, a0, A0.l.k(), "tappableElementIgnoringVisibility");
        this.s = a.b(aVar, a0, A0.l.d(), "imeAnimationTarget");
        this.t = a.b(aVar, a0, A0.l.d(), "imeAnimationSource");
        View parent = view.getParent();
        View view2 = parent instanceof View ? parent : null;
        Object tag = view2 != null ? view2.getTag(o0.l.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : true;
        this.w = new y(this);
    }
}
