package androidx.compose.foundation.gestures;

import A.U;
import C.k;
import C.m;
import C.q;
import Ca.I;
import Ca.t;
import Ia.l;
import Qa.p;
import androidx.compose.foundation.gestures.a;
import cb.O;
import cb.Q;
import cb.i;
import kotlin.jvm.internal.u;
import n1.y;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends androidx.compose.foundation.gestures.b {
    public m l;
    public q m;
    public boolean n;
    public Qa.q o;
    public Qa.q p;
    public boolean q;

    public static final class a extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ p c;
        public final /* synthetic */ c d;

        public static final class a extends u implements Qa.l {
            public final /* synthetic */ k a;
            public final /* synthetic */ c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, c cVar) {
                super(1);
                this.a = kVar;
                this.b = cVar;
            }

            public final void a(a.b bVar) {
                this.a.a(C.l.d(c.j2(this.b, bVar.a()), c.h2(this.b)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, c cVar, Ga.e eVar) {
            super(2, eVar);
            this.c = pVar;
            this.d = cVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Ga.e eVar) {
            return create(kVar, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.c, this.d, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                k kVar = (k) this.b;
                p pVar = this.c;
                a aVar = new a(kVar, this.d);
                this.a = 1;
                if (pVar.invoke(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class b extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Ga.e eVar) {
            super(2, eVar);
            this.d = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = c.this.new b(this.d, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                O o = (O) this.b;
                Qa.q f2 = c.f2(c.this);
                f d = f.d(this.d);
                this.a = 1;
                if (f2.invoke(o, d, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class c extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, Ga.e eVar) {
            super(2, eVar);
            this.d = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = c.this.new c(this.d, eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                O o = (O) this.b;
                Qa.q g2 = c.g2(c.this);
                Float c = Ia.b.c(C.l.e(c.i2(c.this, this.d), c.h2(c.this)));
                this.a = 1;
                if (g2.invoke(o, c, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public c(m mVar, Qa.l lVar, q qVar, boolean z, E.m mVar2, boolean z2, Qa.q qVar2, Qa.q qVar3, boolean z3) {
        super(lVar, z, mVar2, qVar);
        this.l = mVar;
        this.m = qVar;
        this.n = z2;
        this.o = qVar2;
        this.p = qVar3;
        this.q = z3;
    }

    public static final /* synthetic */ Qa.q f2(c cVar) {
        return cVar.o;
    }

    public static final /* synthetic */ Qa.q g2(c cVar) {
        return cVar.p;
    }

    public static final /* synthetic */ q h2(c cVar) {
        return cVar.m;
    }

    public static final /* synthetic */ long i2(c cVar, long j) {
        return cVar.k2(j);
    }

    public static final /* synthetic */ long j2(c cVar, long j) {
        return cVar.l2(j);
    }

    public Object T1(p pVar, Ga.e eVar) {
        Object a2 = this.l.a(U.UserInput, new a(pVar, this, null), eVar);
        return a2 == Ha.c.f() ? a2 : I.a;
    }

    public void X1(long j) {
        if (!isAttached() || kotlin.jvm.internal.t.c(this.o, C.l.b())) {
            return;
        }
        i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new b(j, null), 3, (Object) null);
    }

    public void Y1(long j) {
        if (!isAttached() || kotlin.jvm.internal.t.c(this.p, C.l.c())) {
            return;
        }
        i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new c(j, null), 3, (Object) null);
    }

    public boolean c2() {
        return this.n;
    }

    public final long k2(long j) {
        return y.m(j, this.q ? -1.0f : 1.0f);
    }

    public final long l2(long j) {
        return f.r(j, this.q ? -1.0f : 1.0f);
    }

    public final void m2(m mVar, Qa.l lVar, q qVar, boolean z, E.m mVar2, boolean z2, Qa.q qVar2, Qa.q qVar3, boolean z3) {
        boolean z4;
        boolean z5;
        Qa.q qVar4;
        if (kotlin.jvm.internal.t.c(this.l, mVar)) {
            z4 = false;
        } else {
            this.l = mVar;
            z4 = true;
        }
        if (this.m != qVar) {
            this.m = qVar;
            z4 = true;
        }
        if (this.q != z3) {
            this.q = z3;
            qVar4 = qVar2;
            z5 = true;
        } else {
            z5 = z4;
            qVar4 = qVar2;
        }
        this.o = qVar4;
        this.p = qVar3;
        this.n = z2;
        e2(lVar, z, mVar2, qVar, z5);
    }
}
