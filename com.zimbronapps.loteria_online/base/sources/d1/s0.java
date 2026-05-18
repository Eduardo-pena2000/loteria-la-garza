package d1;

import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s0 {
    public final i1.u a = new i1.u();
    public final w.z b = new w.z(16);

    public static /* synthetic */ Ca.I a(s0 s0Var, q0 q0Var, t0 t0Var) {
        return c(s0Var, q0Var, t0Var);
    }

    public static final Ca.I c(s0 s0Var, q0 q0Var, t0 t0Var) {
        synchronized (s0Var.a) {
            try {
                if (t0Var.i()) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Ca.I.a;
    }

    public final h2 b(q0 q0Var, Qa.l lVar) {
        synchronized (this.a) {
            t0 t0Var = (t0) this.b.get(q0Var);
            if (t0Var != null) {
                if (t0Var.i()) {
                    return t0Var;
                }
            }
            try {
                t0 t0Var2 = (t0) lVar.invoke(new r0(this, q0Var));
                synchronized (this.a) {
                    try {
                        if (this.b.get(q0Var) == null && t0Var2.i()) {
                            this.b.put(q0Var, t0Var2);
                        }
                        Ca.I i = Ca.I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return t0Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
