package W;

import A.M;
import A.N;
import Ca.I;
import E.o;
import b0.U1;
import b0.b0;
import b0.h2;
import b0.w;
import cb.O;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f implements M {
    public final boolean a;
    public final float b;
    public final h2 c;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ E.k c;
        public final /* synthetic */ o d;

        public static final class a implements fb.f {
            public final /* synthetic */ o a;
            public final /* synthetic */ O b;

            public a(o oVar, O o) {
                this.a = oVar;
                this.b = o;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(E.j jVar, Ga.e eVar) {
                if (jVar instanceof o.b) {
                    this.a.b((o.b) jVar, this.b);
                } else if (jVar instanceof o.c) {
                    this.a.f(((o.c) jVar).a());
                } else if (jVar instanceof o.a) {
                    this.a.f(((o.a) jVar).a());
                } else {
                    this.a.h(jVar, this.b);
                }
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(E.k kVar, o oVar, Ga.e eVar) {
            super(2, eVar);
            this.c = kVar;
            this.d = oVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.c, this.d, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                O o = (O) this.b;
                fb.e b = this.c.b();
                a aVar = new a(this.d, o);
                this.a = 1;
                if (b.collect(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public /* synthetic */ f(boolean z, float f, h2 h2Var, kotlin.jvm.internal.k kVar) {
        this(z, f, h2Var);
    }

    public final N b(E.k kVar, b0.m mVar, int i) {
        long a2;
        mVar.V(988743187);
        if (w.L()) {
            w.U(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        r rVar = (r) mVar.x(s.d());
        if (((r0) this.c.getValue()).A() != r0.b.j()) {
            mVar.V(-303571590);
            mVar.P();
            a2 = ((r0) this.c.getValue()).A();
        } else {
            mVar.V(-303521246);
            a2 = rVar.a(mVar, 0);
            mVar.P();
        }
        h2 o = U1.o(r0.m(a2), mVar, 0);
        h2 o2 = U1.o(rVar.b(mVar, 0), mVar, 0);
        int i2 = i & 14;
        o c = c(kVar, this.a, this.b, o, o2, mVar, i2 | ((i << 12) & 458752));
        boolean E = mVar.E(c) | (((i2 ^ 6) > 4 && mVar.U(kVar)) || (i & 6) == 4);
        Object C = mVar.C();
        if (E || C == b0.m.a.a()) {
            C = new a(kVar, c, null);
            mVar.t(C);
        }
        b0.e(c, kVar, (Qa.p) C, mVar, (i << 3) & 112);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return c;
    }

    public abstract o c(E.k kVar, boolean z, float f, h2 h2Var, h2 h2Var2, b0.m mVar, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && n1.h.i(this.b, fVar.b) && kotlin.jvm.internal.t.c(this.c, fVar.c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.a) * 31) + n1.h.k(this.b)) * 31) + this.c.hashCode();
    }

    public f(boolean z, float f, h2 h2Var) {
        this.a = z;
        this.b = f;
        this.c = h2Var;
    }
}
