package P0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a1 {
    public static final b0.b1 a = b0.H.j(a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final k0 a() {
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    public static final class b extends Ia.d {
        public /* synthetic */ Object a;
        public int b;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return a1.b(null, null, this);
        }
    }

    public static final class c extends Ia.d {
        public /* synthetic */ Object a;
        public int b;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return a1.a(null, null, null, this);
        }
    }

    public static final /* synthetic */ Object a(O0.p0 p0Var, k0 k0Var, Qa.p pVar, Ga.e eVar) {
        return c(p0Var, k0Var, pVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(P0.Z0 r4, Qa.p r5, Ga.e r6) {
        /*
            boolean r0 = r6 instanceof P0.a1.b
            if (r0 == 0) goto L13
            r0 = r6
            P0.a1$b r0 = (P0.a1.b) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            P0.a1$b r0 = new P0.a1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            Ca.t.b(r6)
            goto L5d
        L31:
            Ca.t.b(r6)
            androidx.compose.ui.e$c r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L63
            O0.p0 r6 = O0.k.o(r4)
            O0.J r4 = O0.k.n(r4)
            b0.I r4 = r4.Q()
            b0.b1 r2 = P0.a1.a
            java.lang.Object r4 = r4.a(r2)
            android.support.v4.media.session.b.a(r4)
            r0.b = r3
            r4 = 0
            java.lang.Object r4 = c(r6, r4, r5, r0)
            if (r4 != r1) goto L5d
            return r1
        L5d:
            Ca.i r4 = new Ca.i
            r4.<init>()
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.a1.b(P0.Z0, Qa.p, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(O0.p0 r3, P0.k0 r4, Qa.p r5, Ga.e r6) {
        /*
            boolean r4 = r6 instanceof P0.a1.c
            if (r4 == 0) goto L13
            r4 = r6
            P0.a1$c r4 = (P0.a1.c) r4
            int r0 = r4.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.b = r0
            goto L18
        L13:
            P0.a1$c r4 = new P0.a1$c
            r4.<init>(r6)
        L18:
            java.lang.Object r6 = r4.a
            java.lang.Object r0 = Ha.c.f()
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            r3 = 2
            if (r1 == r3) goto L30
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L30:
            Ca.t.b(r6)
            Ca.i r3 = new Ca.i
            r3.<init>()
            throw r3
        L39:
            Ca.t.b(r6)
            goto L49
        L3d:
            Ca.t.b(r6)
            r4.b = r2
            java.lang.Object r3 = r3.s(r5, r4)
            if (r3 != r0) goto L49
            return r0
        L49:
            Ca.i r3 = new Ca.i
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.a1.c(O0.p0, P0.k0, Qa.p, Ga.e):java.lang.Object");
    }
}
