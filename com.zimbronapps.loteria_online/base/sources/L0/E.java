package l0;

import java.util.Map;
import l0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends d {
    public final d s;
    public boolean t;

    public e(long j, p pVar, Qa.l lVar, Qa.l lVar2, d dVar) {
        super(j, pVar, lVar, lVar2);
        this.s = dVar;
        dVar.m(this);
    }

    public m C() {
        if (this.s.D() || this.s.e()) {
            return new m.a(this);
        }
        w.Q E = E();
        long i = i();
        Map s = E != null ? v.s(this.s.i(), this, this.s.f()) : null;
        synchronized (v.O()) {
            try {
                v.D(this);
                if (E == null || E.c() == 0) {
                    b();
                    Ca.I i2 = Ca.I.a;
                } else {
                    m J = J(this.s.i(), E, s, this.s.f());
                    if (!kotlin.jvm.internal.t.c(J, m.b.a)) {
                        return J;
                    }
                    w.Q E2 = this.s.E();
                    if (E2 != null) {
                        E2.j(E);
                    } else {
                        this.s.Q(E);
                        Q(null);
                    }
                }
                if (kotlin.jvm.internal.t.i(this.s.i(), i) < 0) {
                    this.s.B();
                }
                d dVar = this.s;
                dVar.u(dVar.f().j(i).h(F()));
                this.s.K(i);
                this.s.M(y());
                this.s.L(F());
                this.s.N(G());
                Ca.I i3 = Ca.I.a;
                P(true);
                U();
                m0.b.c(this, E);
                return m.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.s.n(this);
    }

    public void d() {
        if (e()) {
            return;
        }
        super.d();
        U();
    }
}
