package O0;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public final b a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public b h;
    public final Map i;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public a() {
            super(1);
        }

        public final void a(b bVar) {
            if (bVar.p()) {
                if (bVar.z().g()) {
                    bVar.g0();
                }
                Map b = a.b(bVar.z());
                a aVar = a.this;
                for (Map.Entry entry : b.entrySet()) {
                    a.a(aVar, (M0.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.w0());
                }
                e0 P2 = bVar.w0().P2();
                kotlin.jvm.internal.t.d(P2);
                while (!kotlin.jvm.internal.t.c(P2, a.this.f().w0())) {
                    Iterable<M0.a> keySet = a.this.e(P2).keySet();
                    a aVar2 = a.this;
                    for (M0.a aVar3 : keySet) {
                        a.a(aVar2, aVar3, aVar2.i(P2, aVar3), P2);
                    }
                    P2 = P2.P2();
                    kotlin.jvm.internal.t.d(P2);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b) obj);
            return Ca.I.a;
        }
    }

    public /* synthetic */ a(b bVar, kotlin.jvm.internal.k kVar) {
        this(bVar);
    }

    public static final /* synthetic */ void a(a aVar, M0.a aVar2, int i, e0 e0Var) {
        aVar.c(aVar2, i, e0Var);
    }

    public static final /* synthetic */ Map b(a aVar) {
        return aVar.i;
    }

    public final void c(M0.a aVar, int i, e0 e0Var) {
        float f = i;
        long e = u0.f.e((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        while (true) {
            e = d(e0Var, e);
            e0Var = e0Var.P2();
            kotlin.jvm.internal.t.d(e0Var);
            if (kotlin.jvm.internal.t.c(e0Var, this.a.w0())) {
                break;
            } else if (e(e0Var).containsKey(aVar)) {
                float i2 = i(e0Var, aVar);
                e = u0.f.e((Float.floatToRawIntBits(i2) << 32) | (Float.floatToRawIntBits(i2) & 4294967295L));
            }
        }
        int round = Math.round(aVar instanceof M0.k ? Float.intBitsToFloat((int) (e & 4294967295L)) : Float.intBitsToFloat((int) (e >> 32)));
        Map map = this.i;
        if (map.containsKey(aVar)) {
            round = M0.b.c(aVar, ((Number) Da.S.i(this.i, aVar)).intValue(), round);
        }
        map.put(aVar, Integer.valueOf(round));
    }

    public abstract long d(e0 e0Var, long j);

    public abstract Map e(e0 e0Var);

    public final b f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }

    public final Map h() {
        return this.i;
    }

    public abstract int i(e0 e0Var, M0.a aVar);

    public final boolean j() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean k() {
        o();
        return this.h != null;
    }

    public final boolean l() {
        return this.d;
    }

    public final void m() {
        this.b = true;
        b U = this.a.U();
        if (U == null) {
            return;
        }
        if (this.c) {
            U.I0();
        } else if (this.e || this.d) {
            U.requestLayout();
        }
        if (this.f) {
            this.a.I0();
        }
        if (this.g) {
            this.a.requestLayout();
        }
        U.z().m();
    }

    public final void n() {
        this.i.clear();
        this.a.p0(new a());
        this.i.putAll(e(this.a.w0()));
        this.b = false;
    }

    public final void o() {
        b bVar;
        a z;
        a z2;
        if (j()) {
            bVar = this.a;
        } else {
            b U = this.a.U();
            if (U == null) {
                return;
            }
            bVar = U.z().h;
            if (bVar == null || !bVar.z().j()) {
                b bVar2 = this.h;
                if (bVar2 == null || bVar2.z().j()) {
                    return;
                }
                b U2 = bVar2.U();
                if (U2 != null && (z2 = U2.z()) != null) {
                    z2.o();
                }
                b U3 = bVar2.U();
                bVar = (U3 == null || (z = U3.z()) == null) ? null : z.h;
            }
        }
        this.h = bVar;
    }

    public final void p() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void q(boolean z) {
        this.e = z;
    }

    public final void r(boolean z) {
        this.g = z;
    }

    public final void s(boolean z) {
        this.f = z;
    }

    public final void t(boolean z) {
        this.d = z;
    }

    public final void u(boolean z) {
        this.c = z;
    }

    public a(b bVar) {
        this.a = bVar;
        this.b = true;
        this.i = new HashMap();
    }
}
