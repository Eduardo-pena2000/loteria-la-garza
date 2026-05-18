package eb;

import Ca.I;
import Ca.s;
import cb.O;
import eb.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class o {

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ y c;
        public final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, Object obj, Ga.e eVar) {
            super(2, eVar);
            this.c = yVar;
            this.d = obj;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.c, this.d, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return ((a) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object b;
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    y yVar = this.c;
                    Object obj2 = this.d;
                    s.a aVar = Ca.s.b;
                    this.a = 1;
                    if (yVar.e(obj2, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                b = Ca.s.b(I.a);
            } catch (Throwable th) {
                s.a aVar2 = Ca.s.b;
                b = Ca.s.b(Ca.t.a(th));
            }
            return k.b(Ca.s.h(b) ? k.b.c(I.a) : k.b.a(Ca.s.e(b)));
        }
    }

    public static final Object a(y yVar, Object obj) {
        Object i = yVar.i(obj);
        if (i instanceof k.c) {
            return ((k) cb.i.f(null, new a(yVar, obj, null), 1, null)).k();
        }
        return k.b.c(I.a);
    }
}
