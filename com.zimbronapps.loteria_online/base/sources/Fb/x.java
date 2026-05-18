package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class x {

    public static final class a implements e {
        public final /* synthetic */ e a;
        public final /* synthetic */ e b;
        public final /* synthetic */ Qa.q c;

        public a(e eVar, e eVar2, Qa.q qVar) {
            this.a = eVar;
            this.b = eVar2;
            this.c = qVar;
        }

        public Object collect(f fVar, Ga.e eVar) {
            Object a = gb.k.a(fVar, new e[]{this.a, this.b}, x.a(), new b(this.c, null), eVar);
            return a == Ha.c.f() ? a : Ca.I.a;
        }
    }

    public static final class b extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Qa.q d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.q qVar, Ga.e eVar) {
            super(3, eVar);
            this.d = qVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Object[] objArr, Ga.e eVar) {
            b bVar = new b(this.d, eVar);
            bVar.b = fVar;
            bVar.c = objArr;
            return bVar.invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fVar = (f) this.b;
                Object[] objArr = (Object[]) this.c;
                Qa.q qVar = this.d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.b = fVar;
                this.a = 1;
                obj = qVar.invoke(obj2, obj3, this);
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

    public static final class c implements Qa.a {
        public static final c a = new c();

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ Qa.a a() {
        return c();
    }

    public static final e b(e eVar, e eVar2, Qa.q qVar) {
        return new a(eVar, eVar2, qVar);
    }

    public static final Qa.a c() {
        return c.a;
    }
}
