package Q;

import P0.Y0;
import P0.r1;
import Q.q0;
import Z0.T0;
import Z0.W0;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s0 implements Y0 {
    public final View a;
    public final l0 b;
    public N.y e;
    public T.F f;
    public r1 g;
    public Rect l;
    public final p0 m;
    public Qa.l c = c.a;
    public Qa.l d = d.a;
    public f1.U h = new f1.U("", W0.b.a(), (W0) null, 4, (kotlin.jvm.internal.k) null);
    public f1.t i = f1.t.g.a();
    public List j = new ArrayList();
    public final Ca.l k = Ca.m.a(Ca.n.c, new a());

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(s0.this.i(), false);
        }
    }

    public static final class b implements k0 {
        public b() {
        }

        public void a(KeyEvent keyEvent) {
            s0.b(s0.this).sendKeyEvent(keyEvent);
        }

        public void b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            s0.c(s0.this).b(z, z2, z3, z4, z5, z6);
        }

        public void c(int i) {
            s0.f(s0.this).invoke(f1.s.j(i));
        }

        public void d(List list) {
            s0.e(s0.this).invoke(list);
        }

        public void e(u0 u0Var) {
            int size = s0.d(s0.this).size();
            for (int i = 0; i < size; i++) {
                if (kotlin.jvm.internal.t.c(((WeakReference) s0.d(s0.this).get(i)).get(), u0Var)) {
                    s0.d(s0.this).remove(i);
                    return;
                }
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Ca.I.a;
        }

        public final void invoke(List list) {
        }
    }

    public s0(View view, Qa.l lVar, l0 l0Var) {
        this.a = view;
        this.b = l0Var;
        this.m = new p0(lVar, l0Var);
    }

    public static final /* synthetic */ BaseInputConnection b(s0 s0Var) {
        return s0Var.h();
    }

    public static final /* synthetic */ p0 c(s0 s0Var) {
        return s0Var.m;
    }

    public static final /* synthetic */ List d(s0 s0Var) {
        return s0Var.j;
    }

    public static final /* synthetic */ Qa.l e(s0 s0Var) {
        return s0Var.c;
    }

    public static final /* synthetic */ Qa.l f(s0 s0Var) {
        return s0Var.d;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public u0 a(EditorInfo editorInfo) {
        z.c(editorInfo, this.h.l(), this.h.k(), this.i, null, 8, null);
        r0.a(editorInfo);
        u0 u0Var = new u0(this.h, new b(), this.i.b(), this.e, this.f, this.g);
        this.j.add(new WeakReference(u0Var));
        return u0Var;
    }

    public final BaseInputConnection h() {
        return (BaseInputConnection) this.k.getValue();
    }

    public final View i() {
        return this.a;
    }

    public final void j(u0.h hVar) {
        Rect rect;
        this.l = new Rect(Sa.c.d(hVar.i()), Sa.c.d(hVar.l()), Sa.c.d(hVar.j()), Sa.c.d(hVar.e()));
        if (!this.j.isEmpty() || (rect = this.l) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void k() {
        this.b.c();
    }

    public final void l(f1.U u, q0.a aVar, f1.t tVar, Qa.l lVar, Qa.l lVar2) {
        this.h = u;
        this.i = tVar;
        this.c = lVar;
        this.d = lVar2;
        this.e = aVar != null ? aVar.y1() : null;
        this.f = aVar != null ? aVar.T0() : null;
        this.g = aVar != null ? aVar.getViewConfiguration() : null;
    }

    public final void m(f1.U u, f1.U u2) {
        boolean z = (W0.g(this.h.k(), u2.k()) && kotlin.jvm.internal.t.c(this.h.j(), u2.j())) ? false : true;
        this.h = u2;
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            u0 u0Var = (u0) ((WeakReference) this.j.get(i)).get();
            if (u0Var != null) {
                u0Var.g(u2);
            }
        }
        this.m.a();
        if (kotlin.jvm.internal.t.c(u, u2)) {
            if (z) {
                l0 l0Var = this.b;
                int l = W0.l(u2.k());
                int k = W0.k(u2.k());
                W0 j = this.h.j();
                int l2 = j != null ? W0.l(j.r()) : -1;
                W0 j2 = this.h.j();
                l0Var.b(l, k, l2, j2 != null ? W0.k(j2.r()) : -1);
                return;
            }
            return;
        }
        if (u != null && (!kotlin.jvm.internal.t.c(u.l(), u2.l()) || (W0.g(u.k(), u2.k()) && !kotlin.jvm.internal.t.c(u.j(), u2.j())))) {
            k();
            return;
        }
        int size2 = this.j.size();
        for (int i2 = 0; i2 < size2; i2++) {
            u0 u0Var2 = (u0) ((WeakReference) this.j.get(i2)).get();
            if (u0Var2 != null) {
                u0Var2.h(this.h, this.b);
            }
        }
    }

    public final void n(f1.U u, f1.J j, T0 t0, u0.h hVar, u0.h hVar2) {
        this.m.d(u, j, t0, hVar, hVar2);
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((f1.s) obj).p());
            return Ca.I.a;
        }

        public final void a(int i) {
        }
    }
}
