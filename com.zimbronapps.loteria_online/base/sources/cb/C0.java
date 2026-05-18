package cb;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c0 {
    public static final void a(b0 b0Var, int i) {
        Ga.e c = b0Var.c();
        boolean z = i == 4;
        if (z || !(c instanceof hb.h) || b(i) != b(b0Var.c)) {
            d(b0Var, c, z);
            return;
        }
        hb.h hVar = (hb.h) c;
        K k = hVar.d;
        Ga.i context = hVar.getContext();
        if (k.z(context)) {
            k.x(context, b0Var);
        } else {
            e(b0Var);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final void d(b0 b0Var, Ga.e eVar, boolean z) {
        Object e;
        Object h = b0Var.h();
        Throwable d = b0Var.d(h);
        if (d != null) {
            s.a aVar = Ca.s.b;
            e = Ca.t.a(d);
        } else {
            s.a aVar2 = Ca.s.b;
            e = b0Var.e(h);
        }
        Object b = Ca.s.b(e);
        if (!z) {
            eVar.resumeWith(b);
            return;
        }
        kotlin.jvm.internal.t.e(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        hb.h hVar = (hb.h) eVar;
        Ga.e eVar2 = hVar.e;
        Object obj = hVar.g;
        Ga.i context = eVar2.getContext();
        Object i = hb.K.i(context, obj);
        e1 m = i != hb.K.a ? I.m(eVar2, context, i) : null;
        try {
            hVar.e.resumeWith(b);
            Ca.I i2 = Ca.I.a;
        } finally {
            if (m == null || m.R0()) {
                hb.K.f(context, i);
            }
        }
    }

    public static final void e(b0 b0Var) {
        k0 b = Y0.a.b();
        if (b.P()) {
            b.L(b0Var);
            return;
        }
        b.N(true);
        try {
            d(b0Var, b0Var.c(), true);
            do {
            } while (b.V());
        } finally {
            try {
            } finally {
            }
        }
    }
}
