package K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements b {
    public final d0.c a = new d0.c(new f[16], 0);

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(u0.h r8, Ga.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof K.c.a
            if (r0 == 0) goto L13
            r0 = r9
            K.c$a r0 = (K.c.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            K.c$a r0 = new K.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.d
            int r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.a
            u0.h r5 = (u0.h) r5
            Ca.t.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            Ca.t.b(r9)
            d0.c r9 = r7.a
            int r2 = r9.m()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.l()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            K.f r5 = (K.f) r5
            r0.a = r9
            r0.b = r4
            r0.c = r2
            r0.d = r8
            r0.g = r3
            java.lang.Object r5 = K.j.a(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            Ca.I r8 = Ca.I.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K.c.a(u0.h, Ga.e):java.lang.Object");
    }

    public final d0.c b() {
        return this.a;
    }
}
