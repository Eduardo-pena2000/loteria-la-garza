package H0;

import cb.O;
import kotlin.jvm.internal.u;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public H0.c a;
    public H0.c b;
    public Qa.a c = new a();
    public O d;

    public static final class a extends u implements Qa.a {
        public a() {
            super(0);
        }

        public final O invoke() {
            return b.this.h();
        }
    }

    public static final class b extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    public static final class c extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, Ga.e r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof H0.b.b
            if (r0 == 0) goto L14
            r0 = r12
            H0.b$b r0 = (H0.b.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            H0.b$b r0 = new H0.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.a
            java.lang.Object r0 = Ha.c.f()
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            Ca.t.b(r12)
            goto L71
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            Ca.t.b(r12)
            goto L52
        L3a:
            Ca.t.b(r12)
            H0.a r12 = r7.g()
            if (r12 != 0) goto L60
            H0.c r1 = r7.b
            if (r1 == 0) goto L59
            r6.c = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.V0(r2, r4, r6)
            if (r12 != r0) goto L52
            return r0
        L52:
            n1.y r12 = (n1.y) r12
            long r8 = r12.o()
            goto L7e
        L59:
            n1.y$a r8 = n1.y.b
            long r8 = r8.a()
            goto L7e
        L60:
            H0.a r1 = r7.g()
            if (r1 == 0) goto L78
            r6.c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.V0(r2, r4, r6)
            if (r12 != r0) goto L71
            return r0
        L71:
            n1.y r12 = (n1.y) r12
            long r8 = r12.o()
            goto L7e
        L78:
            n1.y$a r8 = n1.y.b
            long r8 = r8.a()
        L7e:
            n1.y r8 = n1.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.b.a(long, long, Ga.e):java.lang.Object");
    }

    public final long b(long j, long j2, int i) {
        H0.a g = g();
        return g != null ? g.x0(j, j2, i) : f.b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, Ga.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof H0.b.c
            if (r0 == 0) goto L13
            r0 = r7
            H0.b$c r0 = (H0.b.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            H0.b$c r0 = new H0.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r7)
            H0.a r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.c = r3
            java.lang.Object r7 = r7.w0(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            n1.y r7 = (n1.y) r7
            long r5 = r7.o()
            goto L50
        L4a:
            n1.y$a r5 = n1.y.b
            long r5 = r5.a()
        L50:
            n1.y r5 = n1.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.b.c(long, Ga.e):java.lang.Object");
    }

    public final long d(long j, int i) {
        H0.a g = g();
        return g != null ? g.d1(j, i) : f.b.c();
    }

    public final O e() {
        O o = (O) this.c.invoke();
        if (o != null) {
            return o;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final H0.c f() {
        return this.a;
    }

    public final H0.a g() {
        H0.c cVar = this.a;
        if (cVar != null) {
            return cVar.H1();
        }
        return null;
    }

    public final O h() {
        return this.d;
    }

    public final void i(Qa.a aVar) {
        this.c = aVar;
    }

    public final void j(H0.c cVar) {
        this.b = cVar;
    }

    public final void k(H0.c cVar) {
        this.a = cVar;
    }

    public final void l(O o) {
        this.d = o;
    }
}
