package I;

import Ca.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements M0.F {
    public boolean b;
    public Ga.e c;

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.this.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I.b.a
            if (r0 == 0) goto L13
            r0 = r5
            I.b$a r0 = (I.b.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            I.b$a r0 = new I.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.b
            Ga.e r1 = (Ga.e) r1
            java.lang.Object r0 = r0.a
            I.b r0 = (I.b) r0
            Ca.t.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            Ca.t.b(r5)
            boolean r5 = r4.b
            if (r5 != 0) goto L71
            Ga.e r5 = r4.c
            r0.a = r4
            r0.b = r5
            r0.e = r3
            Ga.k r2 = new Ga.k
            Ga.e r3 = Ha.b.c(r0)
            r2.<init>(r3)
            r4.c = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = Ha.c.f()
            if (r2 != r3) goto L60
            Ia.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            Ca.s$a r5 = Ca.s.b
            Ca.I r5 = Ca.I.a
            java.lang.Object r5 = Ca.s.b(r5)
            r1.resumeWith(r5)
        L71:
            Ca.I r5 = Ca.I.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I.b.b(Ga.e):java.lang.Object");
    }

    public void g(M0.p pVar) {
        if (this.b) {
            return;
        }
        this.b = true;
        Ga.e eVar = this.c;
        if (eVar != null) {
            s.a aVar = Ca.s.b;
            eVar.resumeWith(Ca.s.b(Ca.I.a));
        }
        this.c = null;
    }
}
