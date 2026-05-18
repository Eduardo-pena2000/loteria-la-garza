package C;

import A.U;
import A.W;
import Ca.I;
import b0.C0;
import b0.U1;
import cb.O;
import cb.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements y {
    public final Qa.l a;
    public final u b = new b();
    public final W c = new W();
    public final C0 d;
    public final C0 e;
    public final C0 f;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ U c;
        public final /* synthetic */ Qa.p d;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ i c;
            public final /* synthetic */ Qa.p d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, Qa.p pVar, Ga.e eVar) {
                super(2, eVar);
                this.c = iVar;
                this.d = pVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Ga.e eVar) {
                return create(uVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                try {
                    if (i == 0) {
                        Ca.t.b(obj);
                        u uVar = (u) this.b;
                        i.k(this.c).setValue(Ia.b.a(true));
                        Qa.p pVar = this.d;
                        this.a = 1;
                        if (pVar.invoke(uVar, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    i.k(this.c).setValue(Ia.b.a(false));
                    return I.a;
                } catch (Throwable th) {
                    i.k(this.c).setValue(Ia.b.a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U u, Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.c = u;
            this.d = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return i.this.new a(this.c, this.d, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                W g = i.g(i.this);
                u h = i.h(i.this);
                U u = this.c;
                a aVar = new a(i.this, this.d, null);
                this.a = 1;
                if (g.d(h, u, aVar, this) == f) {
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

    public static final class b implements u {
        public b() {
        }

        public float a(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            float floatValue = ((Number) i.this.l().invoke(Float.valueOf(f))).floatValue();
            i.j(i.this).setValue(Boolean.valueOf(floatValue > 0.0f));
            i.i(i.this).setValue(Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    }

    public i(Qa.l lVar) {
        this.a = lVar;
        Boolean bool = Boolean.FALSE;
        this.d = U1.i(bool, null, 2, null);
        this.e = U1.i(bool, null, 2, null);
        this.f = U1.i(bool, null, 2, null);
    }

    public static final /* synthetic */ W g(i iVar) {
        return iVar.c;
    }

    public static final /* synthetic */ u h(i iVar) {
        return iVar.b;
    }

    public static final /* synthetic */ C0 i(i iVar) {
        return iVar.f;
    }

    public static final /* synthetic */ C0 j(i iVar) {
        return iVar.e;
    }

    public static final /* synthetic */ C0 k(i iVar) {
        return iVar.d;
    }

    public boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public Object c(U u, Qa.p pVar, Ga.e eVar) {
        Object e = P.e(new a(u, pVar, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    public final Qa.l l() {
        return this.a;
    }
}
