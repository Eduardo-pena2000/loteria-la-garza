package A;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m extends A.a {

    public static final class a extends Ia.l implements Qa.q {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ long c;

        public a(Ga.e eVar) {
            super(3, eVar);
        }

        public final Object a(C.r rVar, long j, Ga.e eVar) {
            a aVar = m.this.new a(eVar);
            aVar.b = rVar;
            aVar.c = j;
            return aVar.invokeSuspend(Ca.I.a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C.r) obj, ((u0.f) obj2).u(), (Ga.e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                C.r rVar = (C.r) this.b;
                long j = this.c;
                if (m.this.W1()) {
                    m mVar = m.this;
                    this.a = 1;
                    if (mVar.Y1(rVar, j, this) == f) {
                        return f;
                    }
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

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public b() {
            super(1);
        }

        public final void a(long j) {
            if (m.this.W1()) {
                m.this.X1().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((u0.f) obj).u());
            return Ca.I.a;
        }
    }

    public /* synthetic */ m(E.m mVar, Q q, boolean z, String str, W0.h hVar, Qa.a aVar, kotlin.jvm.internal.k kVar) {
        this(mVar, q, z, str, hVar, aVar);
    }

    public static /* synthetic */ Object d2(m mVar, I0.L l, Ga.e eVar) {
        Object h = C.B.h(l, mVar.new a(null), mVar.new b(), eVar);
        return h == Ha.c.f() ? h : Ca.I.a;
    }

    public Object R1(I0.L l, Ga.e eVar) {
        return d2(this, l, eVar);
    }

    public final void e2(E.m mVar, Q q, boolean z, String str, W0.h hVar, Qa.a aVar) {
        c2(mVar, q, z, str, hVar, aVar);
    }

    public m(E.m mVar, Q q, boolean z, String str, W0.h hVar, Qa.a aVar) {
        super(mVar, q, z, str, hVar, aVar, null);
    }
}
