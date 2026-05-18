package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class i {

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public boolean d;
        public /* synthetic */ Object e;
        public int f;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return i.a(null, null, false, this);
        }
    }

    public static final /* synthetic */ Object a(f fVar, eb.x xVar, boolean z, Ga.e eVar) {
        return c(fVar, xVar, z, eVar);
    }

    public static final Object b(f fVar, eb.x xVar, Ga.e eVar) {
        Object c = c(fVar, xVar, true, eVar);
        return c == Ha.c.f() ? c : Ca.I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(fb.f r6, eb.x r7, boolean r8, Ga.e r9) {
        /*
            boolean r0 = r9 instanceof fb.i.a
            if (r0 == 0) goto L13
            r0 = r9
            fb.i$a r0 = (fb.i.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            fb.i$a r0 = new fb.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.d
            java.lang.Object r6 = r0.c
            eb.i r6 = (eb.i) r6
            java.lang.Object r7 = r0.b
            eb.x r7 = (eb.x) r7
            java.lang.Object r2 = r0.a
            fb.f r2 = (fb.f) r2
            Ca.t.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.d
            java.lang.Object r6 = r0.c
            eb.i r6 = (eb.i) r6
            java.lang.Object r7 = r0.b
            eb.x r7 = (eb.x) r7
            java.lang.Object r2 = r0.a
            fb.f r2 = (fb.f) r2
            Ca.t.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            Ca.t.b(r9)
            fb.g.q(r6)
            eb.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.a = r6     // Catch: java.lang.Throwable -> L3c
            r0.b = r7     // Catch: java.lang.Throwable -> L3c
            r0.c = r9     // Catch: java.lang.Throwable -> L3c
            r0.d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.a = r2     // Catch: java.lang.Throwable -> L3c
            r0.b = r7     // Catch: java.lang.Throwable -> L3c
            r0.c = r6     // Catch: java.lang.Throwable -> L3c
            r0.d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            eb.n.a(r7, r6)
        L9a:
            Ca.I r6 = Ca.I.a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            eb.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.i.c(fb.f, eb.x, boolean, Ga.e):java.lang.Object");
    }
}
