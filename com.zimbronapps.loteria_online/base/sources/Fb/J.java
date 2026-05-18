package fb;

import cb.B0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class j {

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Ga.e eVar2) {
            super(2, eVar2);
            this.b = eVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.b, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return ((a) create(o, eVar)).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                e eVar = this.b;
                this.a = 1;
                if (g.i(eVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final Object a(e eVar, Ga.e eVar2) {
        Object collect = eVar.collect(gb.r.a, eVar2);
        return collect == Ha.c.f() ? collect : Ca.I.a;
    }

    public static final Object b(e eVar, Qa.p pVar, Ga.e eVar2) {
        Object i = g.i(g.d(g.A(eVar, pVar), 0, null, 2, null), eVar2);
        return i == Ha.c.f() ? i : Ca.I.a;
    }

    public static final Object c(f fVar, e eVar, Ga.e eVar2) {
        g.q(fVar);
        Object collect = eVar.collect(fVar, eVar2);
        return collect == Ha.c.f() ? collect : Ca.I.a;
    }

    public static final B0 d(e eVar, cb.O o) {
        return cb.i.d(o, null, null, new a(eVar, null), 3, null);
    }
}
