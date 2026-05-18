package N;

import P0.g1;
import f1.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements v {
    public final g1 a;
    public w b;
    public t0.i c;

    public u(g1 g1Var) {
        this.a = g1Var;
    }

    public void a(int i) {
        s.a aVar = f1.s.b;
        if (f1.s.m(i, aVar.d())) {
            b().a(androidx.compose.ui.focus.c.b.e());
            return;
        }
        if (f1.s.m(i, aVar.f())) {
            b().a(androidx.compose.ui.focus.c.b.f());
            return;
        }
        if (!f1.s.m(i, aVar.b())) {
            if (f1.s.m(i, aVar.c()) ? true : f1.s.m(i, aVar.g()) ? true : f1.s.m(i, aVar.h()) ? true : f1.s.m(i, aVar.a())) {
                return;
            }
            f1.s.m(i, aVar.e());
        } else {
            g1 g1Var = this.a;
            if (g1Var != null) {
                g1Var.a();
            }
        }
    }

    public final t0.i b() {
        t0.i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.t.v("focusManager");
        return null;
    }

    public final w c() {
        w wVar = this.b;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.t.v("keyboardActions");
        return null;
    }

    public final void d(int i) {
        Qa.l lVar;
        s.a aVar = f1.s.b;
        Ca.I i2 = null;
        if (f1.s.m(i, aVar.b())) {
            lVar = c().b();
        } else if (f1.s.m(i, aVar.c())) {
            lVar = c().c();
        } else if (f1.s.m(i, aVar.d())) {
            lVar = c().d();
        } else if (f1.s.m(i, aVar.f())) {
            lVar = c().e();
        } else if (f1.s.m(i, aVar.g())) {
            lVar = c().f();
        } else if (f1.s.m(i, aVar.h())) {
            lVar = c().g();
        } else {
            if (!(f1.s.m(i, aVar.a()) ? true : f1.s.m(i, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(this);
            i2 = Ca.I.a;
        }
        if (i2 == null) {
            a(i);
        }
    }

    public final void e(t0.i iVar) {
        this.c = iVar;
    }

    public final void f(w wVar) {
        this.b = wVar;
    }
}
