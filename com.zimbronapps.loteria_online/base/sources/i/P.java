package I;

import b0.X;
import b0.Y;
import b0.b0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public final k0.g a;
    public final Qa.a b;
    public final Map c = new LinkedHashMap();

    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public Qa.p d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ p a;
            public final /* synthetic */ a b;

            public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                public final /* synthetic */ a a;

                public static final class a implements X {
                    public final /* synthetic */ a a;

                    public a(a aVar) {
                        this.a = aVar;
                    }

                    public void dispose() {
                        a.b(this.a, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(a aVar) {
                    super(1);
                    this.a = aVar;
                }

                public final X invoke(Y y) {
                    return new a(this.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, a aVar) {
                super(2);
                this.a = pVar;
                this.b = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((b0.m) obj, ((Number) obj2).intValue());
                return Ca.I.a;
            }

            public final void invoke(b0.m mVar, int i) {
                if ((i & 3) == 2 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:92)");
                }
                r rVar = (r) this.a.d().invoke();
                int f = this.b.f();
                if ((f >= rVar.c() || !kotlin.jvm.internal.t.c(rVar.d(f), this.b.g())) && (f = rVar.b(this.b.g())) != -1) {
                    a.a(this.b, f);
                }
                int i2 = f;
                boolean z = i2 != -1;
                p pVar = this.a;
                a aVar = this.b;
                mVar.K(207, Boolean.valueOf(z));
                boolean a2 = mVar.a(z);
                mVar.V(-869707859);
                if (z) {
                    mVar.V(-2120139493);
                    q.b(rVar, U.a(p.a(pVar)), i2, U.a(aVar.g()), mVar, 0);
                    mVar.P();
                } else {
                    mVar.h(a2);
                }
                mVar.P();
                mVar.A();
                Object g = this.b.g();
                boolean E = mVar.E(this.b);
                a aVar2 = this.b;
                Object C = mVar.C();
                if (E || C == b0.m.a.a()) {
                    C = new a(aVar2);
                    mVar.t(C);
                }
                b0.a(g, (Qa.l) C, mVar, 0);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }

        public static final /* synthetic */ void a(a aVar, int i) {
            aVar.c = i;
        }

        public static final /* synthetic */ void b(a aVar, Qa.p pVar) {
            aVar.d = pVar;
        }

        public final Qa.p c() {
            return j0.i.b(1403994769, true, new a(p.this, this));
        }

        public final Qa.p d() {
            Qa.p pVar = this.d;
            if (pVar != null) {
                return pVar;
            }
            Qa.p c = c();
            this.d = c;
            return c;
        }

        public final Object e() {
            return this.b;
        }

        public final int f() {
            return this.c;
        }

        public final Object g() {
            return this.a;
        }
    }

    public p(k0.g gVar, Qa.a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    public static final /* synthetic */ k0.g a(p pVar) {
        return pVar.a;
    }

    public final Qa.p b(int i, Object obj, Object obj2) {
        a aVar = (a) this.c.get(obj);
        if (aVar != null && aVar.f() == i && kotlin.jvm.internal.t.c(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i, obj, obj2);
        this.c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        r rVar = (r) this.b.invoke();
        int b = rVar.b(obj);
        if (b != -1) {
            return rVar.e(b);
        }
        return null;
    }

    public final Qa.a d() {
        return this.b;
    }
}
