package gb;

import Ca.I;
import Da.D;
import cb.O;
import cb.P;
import cb.Q;
import cb.T;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e implements p {
    public final Ga.i a;
    public final int b;
    public final eb.a c;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ fb.f c;
        public final /* synthetic */ e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fb.f fVar, e eVar, Ga.e eVar2) {
            super(2, eVar2);
            this.c = fVar;
            this.d = eVar;
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
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                O o = (O) this.b;
                fb.f fVar = this.c;
                eb.x m = this.d.m(o);
                this.a = 1;
                if (fb.g.o(fVar, m, this) == f) {
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

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(eb.v vVar, Ga.e eVar) {
            return ((b) create(vVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                eb.v vVar = (eb.v) this.b;
                e eVar = e.this;
                this.a = 1;
                if (eVar.h(vVar, this) == f) {
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

    public e(Ga.i iVar, int i, eb.a aVar) {
        this.a = iVar;
        this.b = i;
        this.c = aVar;
    }

    public static /* synthetic */ Object g(e eVar, fb.f fVar, Ga.e eVar2) {
        Object e = P.e(new a(fVar, eVar, null), eVar2);
        return e == Ha.c.f() ? e : I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fb.e a(Ga.i r2, int r3, eb.a r4) {
        /*
            r1 = this;
            Ga.i r0 = r1.a
            Ga.i r2 = r2.plus(r0)
            eb.a r0 = eb.a.a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            eb.a r4 = r1.c
        L25:
            Ga.i r0 = r1.a
            boolean r0 = kotlin.jvm.internal.t.c(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.b
            if (r3 != r0) goto L36
            eb.a r0 = r1.c
            if (r4 != r0) goto L36
            return r1
        L36:
            gb.e r2 = r1.i(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e.a(Ga.i, int, eb.a):fb.e");
    }

    public Object collect(fb.f fVar, Ga.e eVar) {
        return g(this, fVar, eVar);
    }

    public String d() {
        return null;
    }

    public abstract Object h(eb.v vVar, Ga.e eVar);

    public abstract e i(Ga.i iVar, int i, eb.a aVar);

    public fb.e j() {
        return null;
    }

    public final Qa.p k() {
        return new b(null);
    }

    public final int l() {
        int i = this.b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public eb.x m(O o) {
        return eb.t.e(o, this.a, l(), this.c, Q.c, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        if (this.a != Ga.j.a) {
            arrayList.add("context=" + this.a);
        }
        if (this.b != -3) {
            arrayList.add("capacity=" + this.b);
        }
        if (this.c != eb.a.a) {
            arrayList.add("onBufferOverflow=" + this.c);
        }
        return T.a(this) + '[' + D.n0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
