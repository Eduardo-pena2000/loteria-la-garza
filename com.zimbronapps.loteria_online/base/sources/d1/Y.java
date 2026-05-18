package d1;

import b0.h2;
import d1.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y implements u.b {
    public final U a;
    public final Z b;
    public final s0 c;
    public final D d;
    public final T e;
    public final Qa.l f;

    public y(U u, Z z, s0 s0Var, D d, T t) {
        this.a = u;
        this.b = z;
        this.c = s0Var;
        this.d = d;
        this.e = t;
        this.f = new w(this);
    }

    public static /* synthetic */ t0 c(y yVar, q0 q0Var, Qa.l lVar) {
        return g(yVar, q0Var, lVar);
    }

    public static /* synthetic */ Object d(y yVar, q0 q0Var) {
        return e(yVar, q0Var);
    }

    public static final Object e(y yVar, q0 q0Var) {
        return yVar.f(q0.b(q0Var, null, null, 0, 0, null, 30, null)).getValue();
    }

    public static final t0 g(y yVar, q0 q0Var, Qa.l lVar) {
        t0 a = yVar.d.a(q0Var, yVar.a, lVar, yVar.f);
        if (a == null && (a = yVar.e.a(q0Var, yVar.a, lVar, yVar.f)) == null) {
            throw new IllegalStateException("Could not load font");
        }
        return a;
    }

    public h2 b(u uVar, L l, int i, int i2) {
        return f(new q0(this.b.d(uVar), this.b.c(l), this.b.a(i), this.b.b(i2), this.a.a(), null));
    }

    public final h2 f(q0 q0Var) {
        return this.c.b(q0Var, new x(this, q0Var));
    }

    public /* synthetic */ y(U u, Z z, s0 s0Var, D d, T t, int i, kotlin.jvm.internal.k kVar) {
        this(u, (i & 2) != 0 ? Z.a.a() : z, (i & 4) != 0 ? z.b() : s0Var, (i & 8) != 0 ? new D(z.a(), null, 2, null) : d, (i & 16) != 0 ? new T() : t);
    }
}
