package gb;

import Ca.I;
import Ga.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g extends e {
    public final fb.e d;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = g.this.new a(eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(fb.f fVar, Ga.e eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fb.f fVar = (fb.f) this.b;
                g gVar = g.this;
                this.a = 1;
                if (gVar.q(fVar, this) == f) {
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

    public g(fb.e eVar, Ga.i iVar, int i, eb.a aVar) {
        super(iVar, i, aVar);
        this.d = eVar;
    }

    public static /* synthetic */ Object n(g gVar, fb.f fVar, Ga.e eVar) {
        if (gVar.b == -3) {
            Ga.i context = eVar.getContext();
            Ga.i j = cb.I.j(context, gVar.a);
            if (kotlin.jvm.internal.t.c(j, context)) {
                Object q = gVar.q(fVar, eVar);
                return q == Ha.c.f() ? q : I.a;
            }
            f.b bVar = Ga.f.D8;
            if (kotlin.jvm.internal.t.c(j.get(bVar), context.get(bVar))) {
                Object p = gVar.p(fVar, j, eVar);
                return p == Ha.c.f() ? p : I.a;
            }
        }
        Object collect = super.collect(fVar, eVar);
        return collect == Ha.c.f() ? collect : I.a;
    }

    public static /* synthetic */ Object o(g gVar, eb.v vVar, Ga.e eVar) {
        Object q = gVar.q(new y(vVar), eVar);
        return q == Ha.c.f() ? q : I.a;
    }

    public Object collect(fb.f fVar, Ga.e eVar) {
        return n(this, fVar, eVar);
    }

    public Object h(eb.v vVar, Ga.e eVar) {
        return o(this, vVar, eVar);
    }

    public final Object p(fb.f fVar, Ga.i iVar, Ga.e eVar) {
        return f.c(iVar, f.a(fVar, eVar.getContext()), null, new a(null), eVar, 4, null);
    }

    public abstract Object q(fb.f fVar, Ga.e eVar);

    public String toString() {
        return this.d + " -> " + super.toString();
    }
}
