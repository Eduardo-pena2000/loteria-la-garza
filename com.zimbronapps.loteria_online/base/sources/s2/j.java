package s2;

import Ca.I;
import Ca.t;
import Ia.l;
import Qa.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {

    public static final class a extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ p c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, Ga.e eVar) {
            super(2, eVar);
            this.c = pVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Ga.e eVar) {
            return create(fVar, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.c, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.b;
                t.b(obj);
                return cVar;
            }
            t.b(obj);
            c c = ((f) this.b).c();
            p pVar = this.c;
            this.b = c;
            this.a = 1;
            return pVar.invoke(c, this) == f ? f : c;
        }
    }

    public static final Object a(o2.i iVar, p pVar, Ga.e eVar) {
        return iVar.a(new a(pVar, null), eVar);
    }
}
