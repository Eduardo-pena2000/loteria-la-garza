package eb;

import Ca.I;
import Ca.s;
import cb.O;
import cb.Q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class t {

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return t.a(null, null, this);
        }
    }

    public static final class b implements Qa.l {
        public final /* synthetic */ cb.n a;

        public b(cb.n nVar) {
            this.a = nVar;
        }

        public final void a(Throwable th) {
            cb.n nVar = this.a;
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(I.a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return I.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(eb.v r4, Qa.a r5, Ga.e r6) {
        /*
            boolean r0 = r6 instanceof eb.t.a
            if (r0 == 0) goto L13
            r0 = r6
            eb.t$a r0 = (eb.t.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eb.t$a r0 = new eb.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.b
            r5 = r4
            Qa.a r5 = (Qa.a) r5
            java.lang.Object r4 = r0.a
            eb.v r4 = (eb.v) r4
            Ca.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            Ca.t.b(r6)
            Ga.i r6 = r0.getContext()
            cb.B0$b r2 = cb.B0.P8
            Ga.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.a = r4     // Catch: java.lang.Throwable -> L32
            r0.b = r5     // Catch: java.lang.Throwable -> L32
            r0.d = r3     // Catch: java.lang.Throwable -> L32
            cb.p r6 = new cb.p     // Catch: java.lang.Throwable -> L32
            Ga.e r2 = Ha.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.E()     // Catch: java.lang.Throwable -> L32
            eb.t$b r2 = new eb.t$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.x(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = Ha.c.f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            Ia.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            Ca.I r4 = Ca.I.a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.t.a(eb.v, Qa.a, Ga.e):java.lang.Object");
    }

    public static final x b(O o, Ga.i iVar, int i, Qa.p pVar) {
        return c(o, iVar, i, eb.a.a, Q.a, null, pVar);
    }

    public static final x c(O o, Ga.i iVar, int i, eb.a aVar, Q q, Qa.l lVar, Qa.p pVar) {
        u uVar = new u(cb.I.k(o, iVar), j.b(i, aVar, null, 4, null));
        if (lVar != null) {
            uVar.invokeOnCompletion(lVar);
        }
        uVar.Q0(q, uVar, pVar);
        return uVar;
    }

    public static /* synthetic */ x d(O o, Ga.i iVar, int i, Qa.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = Ga.j.a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return b(o, iVar, i, pVar);
    }

    public static /* synthetic */ x e(O o, Ga.i iVar, int i, eb.a aVar, Q q, Qa.l lVar, Qa.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = Ga.j.a;
        }
        Ga.i iVar2 = iVar;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            aVar = eb.a.a;
        }
        eb.a aVar2 = aVar;
        if ((i2 & 8) != 0) {
            q = Q.a;
        }
        Q q2 = q;
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        return c(o, iVar2, i3, aVar2, q2, lVar, pVar);
    }
}
