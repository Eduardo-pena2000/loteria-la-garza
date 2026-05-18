package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b extends c {
    public final Qa.p e;

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return b.this.h(null, this);
        }
    }

    public /* synthetic */ b(Qa.p pVar, Ga.i iVar, int i, eb.a aVar, int i2, kotlin.jvm.internal.k kVar) {
        this(pVar, (i2 & 2) != 0 ? Ga.j.a : iVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? eb.a.a : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(eb.v r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fb.b.a
            if (r0 == 0) goto L13
            r0 = r6
            fb.b$a r0 = (fb.b.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fb.b$a r0 = new fb.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            eb.v r5 = (eb.v) r5
            Ca.t.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Ca.t.b(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.w()
            if (r5 == 0) goto L4c
            Ca.I r5 = Ca.I.a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.b.h(eb.v, Ga.e):java.lang.Object");
    }

    public gb.e i(Ga.i iVar, int i, eb.a aVar) {
        return new b(this.e, iVar, i, aVar);
    }

    public b(Qa.p pVar, Ga.i iVar, int i, eb.a aVar) {
        super(pVar, iVar, i, aVar);
        this.e = pVar;
    }
}
