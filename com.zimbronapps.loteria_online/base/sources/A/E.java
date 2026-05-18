package A;

import androidx.compose.ui.e;
import v0.E1;
import v0.i1;
import v0.j1;
import v0.r0;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends e.c implements O0.t, O0.j0 {
    public long a;
    public v0.h0 b;
    public float c;
    public E1 d;
    public long e;
    public n1.t f;
    public i1 g;
    public E1 h;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ kotlin.jvm.internal.O a;
        public final /* synthetic */ e b;
        public final /* synthetic */ x0.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.O o, e eVar, x0.c cVar) {
            super(0);
            this.a = o;
            this.b = eVar;
            this.c = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            this.a.a = this.b.H1().createOutline-Pq9zytI(this.c.e(), this.c.getLayoutDirection(), this.c);
        }
    }

    public /* synthetic */ e(long j, v0.h0 h0Var, float f, E1 e1, kotlin.jvm.internal.k kVar) {
        this(j, h0Var, f, e1);
    }

    public final void E1(x0.c cVar) {
        i1 G1 = G1(cVar);
        if (!r0.s(this.a, r0.b.j())) {
            j1.e(cVar, G1, this.a, 0.0f, null, null, 0, 60, null);
        }
        v0.h0 h0Var = this.b;
        if (h0Var != null) {
            j1.c(cVar, G1, h0Var, this.c, null, null, 0, 56, null);
        }
    }

    public final void F1(x0.c cVar) {
        if (!r0.s(this.a, r0.b.j())) {
            x0.f.s1(cVar, this.a, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        v0.h0 h0Var = this.b;
        if (h0Var != null) {
            x0.f.G0(cVar, h0Var, 0L, 0L, this.c, null, null, 0, 118, null);
        }
    }

    public final i1 G1(x0.c cVar) {
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        if (u0.l.f(cVar.e(), this.e) && cVar.getLayoutDirection() == this.f && kotlin.jvm.internal.t.c(this.h, this.d)) {
            i1 i1Var = this.g;
            kotlin.jvm.internal.t.d(i1Var);
            o.a = i1Var;
        } else {
            O0.k0.a(this, new a(o, this, cVar));
        }
        this.g = (i1) o.a;
        this.e = cVar.e();
        this.f = cVar.getLayoutDirection();
        this.h = this.d;
        Object obj = o.a;
        kotlin.jvm.internal.t.d(obj);
        return (i1) obj;
    }

    public final E1 H1() {
        return this.d;
    }

    public final void I1(v0.h0 h0Var) {
        this.b = h0Var;
    }

    public final void J1(long j) {
        this.a = j;
    }

    public final void d(float f) {
        this.c = f;
    }

    public void draw(x0.c cVar) {
        if (this.d == t1.a()) {
            F1(cVar);
        } else {
            E1(cVar);
        }
        cVar.B1();
    }

    public final void i1(E1 e1) {
        this.d = e1;
    }

    public void q0() {
        this.e = u0.l.b.a();
        this.f = null;
        this.g = null;
        this.h = null;
        O0.u.a(this);
    }

    public e(long j, v0.h0 h0Var, float f, E1 e1) {
        this.a = j;
        this.b = h0Var;
        this.c = f;
        this.d = e1;
        this.e = u0.l.b.a();
    }
}
