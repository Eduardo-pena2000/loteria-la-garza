package C;

import A.U;
import A.W;
import Ca.I;
import cb.O;
import cb.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements m {
    public final Qa.l a;
    public final k b = new b();
    public final W c = new W();

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ U c;
        public final /* synthetic */ Qa.p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U u, Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.c = u;
            this.d = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return g.this.new a(this.c, this.d, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                W c = g.c(g.this);
                k b = g.b(g.this);
                U u = this.c;
                Qa.p pVar = this.d;
                this.a = 1;
                if (c.d(b, u, pVar, this) == f) {
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

    public static final class b implements k {
        public b() {
        }

        public void a(float f) {
            g.this.d().invoke(Float.valueOf(f));
        }
    }

    public g(Qa.l lVar) {
        this.a = lVar;
    }

    public static final /* synthetic */ k b(g gVar) {
        return gVar.b;
    }

    public static final /* synthetic */ W c(g gVar) {
        return gVar.c;
    }

    public Object a(U u, Qa.p pVar, Ga.e eVar) {
        Object e = P.e(new a(u, pVar, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public final Qa.l d() {
        return this.a;
    }
}
