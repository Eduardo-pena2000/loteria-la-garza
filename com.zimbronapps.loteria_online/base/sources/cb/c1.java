package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c1 {

    public static final class a extends Ia.d {
        public long a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return c1.d(0L, null, this);
        }
    }

    public static final a1 a(long j, Y y, B0 b0) {
        return new a1("Timed out waiting for " + j + " ms", b0);
    }

    public static final Object b(b1 b1Var, Qa.p pVar) {
        E0.j(b1Var, Z.c(b1Var.d.getContext()).v(b1Var.e, b1Var, b1Var.getContext()));
        return ib.b.c(b1Var, b1Var, pVar);
    }

    public static final Object c(long j, Qa.p pVar, Ga.e eVar) {
        if (j <= 0) {
            throw new a1("Timed out immediately");
        }
        Object b = b(new b1(j, eVar), pVar);
        if (b == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r7, Qa.p r9, Ga.e r10) {
        /*
            boolean r0 = r10 instanceof cb.c1.a
            if (r0 == 0) goto L13
            r0 = r10
            cb.c1$a r0 = (cb.c1.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cb.c1$a r0 = new cb.c1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.c
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.b
            Qa.p r8 = (Qa.p) r8
            Ca.t.b(r10)     // Catch: cb.a1 -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            Ca.t.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            r0.b = r9     // Catch: cb.a1 -> L68
            r0.c = r10     // Catch: cb.a1 -> L68
            r0.a = r7     // Catch: cb.a1 -> L68
            r0.e = r4     // Catch: cb.a1 -> L68
            cb.b1 r2 = new cb.b1     // Catch: cb.a1 -> L68
            r2.<init>(r7, r0)     // Catch: cb.a1 -> L68
            r10.a = r2     // Catch: cb.a1 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: cb.a1 -> L68
            java.lang.Object r8 = Ha.c.f()     // Catch: cb.a1 -> L68
            if (r7 != r8) goto L6b
            Ia.h.c(r0)     // Catch: cb.a1 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            cb.B0 r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.c1.d(long, Qa.p, Ga.e):java.lang.Object");
    }

    public static final Object e(long j, Qa.p pVar, Ga.e eVar) {
        return d(Z.d(j), pVar, eVar);
    }
}
