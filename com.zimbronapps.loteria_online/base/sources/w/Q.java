package W;

import Ca.I;
import E.o;
import O0.D;
import androidx.compose.ui.e;
import cb.O;
import cb.Q;
import v0.t0;
import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q extends e.c implements O0.h, O0.t, D {
    public final E.k a;
    public final boolean b;
    public final float c;
    public final t0 d;
    public final Qa.a e;
    public final boolean f;
    public u g;
    public float h;
    public long i;
    public boolean j;
    public final L k;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public static final class a implements fb.f {
            public final /* synthetic */ q a;
            public final /* synthetic */ O b;

            public a(q qVar, O o) {
                this.a = qVar;
                this.b = o;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(E.j jVar, Ga.e eVar) {
                if (!(jVar instanceof E.o)) {
                    q.I1(this.a, jVar, this.b);
                } else if (q.E1(this.a)) {
                    q.H1(this.a, (E.o) jVar);
                } else {
                    q.G1(this.a).k(jVar);
                }
                return I.a;
            }
        }

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = q.this.new a(eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                O o = (O) this.b;
                fb.e b = q.F1(q.this).b();
                a aVar = new a(q.this, o);
                this.a = 1;
                if (b.collect(aVar, this) == f) {
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

    public /* synthetic */ q(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar, kotlin.jvm.internal.k kVar2) {
        this(kVar, z, f, t0Var, aVar);
    }

    public static final /* synthetic */ boolean E1(q qVar) {
        return qVar.j;
    }

    public static final /* synthetic */ E.k F1(q qVar) {
        return qVar.a;
    }

    public static final /* synthetic */ L G1(q qVar) {
        return qVar.k;
    }

    public static final /* synthetic */ void H1(q qVar, E.o oVar) {
        qVar.P1(oVar);
    }

    public static final /* synthetic */ void I1(q qVar, E.j jVar, O o) {
        qVar.R1(jVar, o);
    }

    public void J(long j) {
        this.j = true;
        n1.d j2 = O0.k.j(this);
        this.i = n1.s.d(j);
        this.h = Float.isNaN(this.c) ? i.a(j2, this.b, this.i) : j2.j1(this.c);
        L l = this.k;
        Object[] objArr = l.a;
        int i = l.b;
        for (int i2 = 0; i2 < i; i2++) {
            P1((E.o) objArr[i2]);
        }
        this.k.n();
    }

    public abstract void J1(o.b bVar, long j, float f);

    public abstract void K1(x0.f fVar);

    public final boolean L1() {
        return this.b;
    }

    public final Qa.a M1() {
        return this.e;
    }

    public final long N1() {
        return this.d.a();
    }

    public final long O1() {
        return this.i;
    }

    public final void P1(E.o oVar) {
        if (oVar instanceof o.b) {
            J1((o.b) oVar, this.i, this.h);
        } else if (oVar instanceof o.c) {
            Q1(((o.c) oVar).a());
        } else if (oVar instanceof o.a) {
            Q1(((o.a) oVar).a());
        }
    }

    public abstract void Q1(o.b bVar);

    public final void R1(E.j jVar, O o) {
        u uVar = this.g;
        if (uVar == null) {
            uVar = new u(this.b, this.e);
            O0.u.a(this);
            this.g = uVar;
        }
        uVar.c(jVar, o);
    }

    public void draw(x0.c cVar) {
        cVar.B1();
        u uVar = this.g;
        if (uVar != null) {
            uVar.b(cVar, this.h, N1());
        }
        K1(cVar);
    }

    public final boolean getShouldAutoInvalidate() {
        return this.f;
    }

    public void onAttach() {
        cb.i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new a(null), 3, (Object) null);
    }

    public q(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar) {
        this.a = kVar;
        this.b = z;
        this.c = f;
        this.d = t0Var;
        this.e = aVar;
        this.i = u0.l.b.b();
        this.k = new L(0, 1, null);
    }
}
