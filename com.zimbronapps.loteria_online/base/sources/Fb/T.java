package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class t {
    public static final int a = hb.E.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final class a extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Qa.p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, Ga.e eVar) {
            super(3, eVar);
            this.d = pVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Object obj, Ga.e eVar) {
            a aVar = new a(this.d, eVar);
            aVar.b = fVar;
            aVar.c = obj;
            return aVar.invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fVar = (f) this.b;
                Object obj2 = this.c;
                Qa.p pVar = this.d;
                this.b = fVar;
                this.a = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                    return Ca.I.a;
                }
                fVar = (f) this.b;
                Ca.t.b(obj);
            }
            this.b = null;
            this.a = 2;
            if (fVar.emit(obj, this) == f) {
                return f;
            }
            return Ca.I.a;
        }
    }

    public static final e a(e eVar, Qa.p pVar) {
        return g.K(eVar, new a(pVar, null));
    }

    public static final e b(e eVar, Qa.q qVar) {
        return new gb.i(qVar, eVar, null, 0, null, 28, null);
    }
}
