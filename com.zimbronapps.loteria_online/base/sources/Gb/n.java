package gb;

import Ca.I;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class n {

    public static final class a implements fb.e {
        public final /* synthetic */ Qa.q a;

        public a(Qa.q qVar) {
            this.a = qVar;
        }

        public Object collect(fb.f fVar, Ga.e eVar) {
            Object a = n.a(new b(this.a, fVar, null), eVar);
            return a == Ha.c.f() ? a : I.a;
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Qa.q c;
        public final /* synthetic */ fb.f d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.q qVar, fb.f fVar, Ga.e eVar) {
            super(2, eVar);
            this.c = qVar;
            this.d = fVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = new b(this.c, this.d, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return ((b) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                O o = (O) this.b;
                Qa.q qVar = this.c;
                fb.f fVar = this.d;
                this.a = 1;
                if (qVar.invoke(o, fVar, this) == f) {
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

    public static final Object a(Qa.p pVar, Ga.e eVar) {
        m mVar = new m(eVar.getContext(), eVar);
        Object b2 = ib.b.b(mVar, mVar, pVar);
        if (b2 == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return b2;
    }

    public static final fb.e b(Qa.q qVar) {
        return new a(qVar);
    }
}
