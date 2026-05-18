package H0;

import O0.I0;
import O0.J0;
import androidx.compose.ui.e;
import cb.O;
import cb.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.h;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends e.c implements I0, H0.a {
    public H0.a a;
    public H0.b b;
    public c c;
    public final Object d;

    public static final class a extends Ia.d {
        public long a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return c.this.V0(0L, 0L, this);
        }
    }

    public static final class b extends Ia.d {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return c.this.w0(0L, this);
        }
    }

    public static final class c extends u implements Qa.a {
        public c() {
            super(0);
        }

        public final O invoke() {
            return c.E1(c.this);
        }
    }

    public c(H0.a aVar, H0.b bVar) {
        this.a = aVar;
        this.b = bVar == null ? new H0.b() : bVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public static final /* synthetic */ O E1(c cVar) {
        return cVar.F1();
    }

    public Object B() {
        return this.d;
    }

    public final O F1() {
        O h;
        if (h.m) {
            c H1 = H1();
            h = H1 != null ? H1.F1() : null;
            if ((h == null || !P.g(h)) && (h = this.b.h()) == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        } else {
            c H12 = H1();
            if ((H12 == null || (h = H12.F1()) == null) && (h = this.b.h()) == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return h;
    }

    public final H0.a G1() {
        if (isAttached()) {
            return H1();
        }
        return null;
    }

    public final c H1() {
        if (isAttached()) {
            return (c) J0.b(this);
        }
        return null;
    }

    public final void I1() {
        if (this.b.f() == this) {
            this.b.k(null);
        }
    }

    public final void J1(H0.b bVar) {
        I1();
        if (bVar == null) {
            this.b = new H0.b();
        } else if (!t.c(bVar, this.b)) {
            this.b = bVar;
        }
        if (isAttached()) {
            K1();
        }
    }

    public final void K1() {
        this.b.k(this);
        this.b.j(null);
        this.c = null;
        this.b.i(new c());
        this.b.l(getCoroutineScope());
    }

    public final void L1(H0.a aVar, H0.b bVar) {
        this.a = aVar;
        J1(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object V0(long r16, long r18, Ga.e r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof H0.c.a
            if (r2 == 0) goto L16
            r2 = r1
            H0.c$a r2 = (H0.c.a) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.e = r3
            goto L1b
        L16:
            H0.c$a r2 = new H0.c$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.c
            java.lang.Object r9 = Ha.c.f()
            int r3 = r2.e
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L43
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.a
            Ca.t.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.b
            long r5 = r2.a
            Ca.t.b(r1)
            r13 = r3
            r11 = r5
            goto L5e
        L43:
            Ca.t.b(r1)
            H0.a r3 = r0.a
            r11 = r16
            r2.a = r11
            r13 = r18
            r2.b = r13
            r2.e = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.V0(r4, r6, r8)
            if (r1 != r9) goto L5e
            return r9
        L5e:
            n1.y r1 = (n1.y) r1
            long r6 = r1.o()
            boolean r1 = r15.isAttached()
            if (r1 == 0) goto L70
            H0.a r1 = r15.G1()
        L6e:
            r3 = r1
            goto L73
        L70:
            H0.c r1 = r0.c
            goto L6e
        L73:
            if (r3 == 0) goto L94
            long r4 = n1.y.l(r11, r6)
            long r11 = n1.y.k(r13, r6)
            r2.a = r6
            r2.e = r10
            r13 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.V0(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            n1.y r1 = (n1.y) r1
            long r4 = r1.o()
            r6 = r2
            goto L9b
        L94:
            r13 = r6
            n1.y$a r1 = n1.y.b
            long r4 = r1.a()
        L9b:
            long r1 = n1.y.l(r6, r4)
            n1.y r1 = n1.y.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.c.V0(long, long, Ga.e):java.lang.Object");
    }

    public long d1(long j, int i) {
        H0.a G1 = G1();
        long d1 = G1 != null ? G1.d1(j, i) : f.b.c();
        return f.q(d1, this.a.d1(f.p(j, d1), i));
    }

    public void onAttach() {
        K1();
    }

    public void onDetach() {
        c cVar = (c) d.a(this);
        this.c = cVar;
        this.b.j(cVar);
        I1();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w0(long r9, Ga.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof H0.c.b
            if (r0 == 0) goto L13
            r0 = r11
            H0.c$b r0 = (H0.c.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            H0.c$b r0 = new H0.c$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.a
            Ca.t.b(r11)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.a
            Ca.t.b(r11)
            goto L50
        L3c:
            Ca.t.b(r11)
            H0.a r11 = r8.G1()
            if (r11 == 0) goto L5a
            r0.a = r9
            r0.d = r4
            java.lang.Object r11 = r11.w0(r9, r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            n1.y r11 = (n1.y) r11
            long r4 = r11.o()
        L56:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L61
        L5a:
            n1.y$a r11 = n1.y.b
            long r4 = r11.a()
            goto L56
        L61:
            H0.a r11 = r8.a
            long r4 = n1.y.k(r4, r9)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.w0(r4, r0)
            if (r11 != r1) goto L72
            return r1
        L72:
            n1.y r11 = (n1.y) r11
            long r0 = r11.o()
            long r9 = n1.y.l(r9, r0)
            n1.y r9 = n1.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.c.w0(long, Ga.e):java.lang.Object");
    }

    public long x0(long j, long j2, int i) {
        long x0 = this.a.x0(j, j2, i);
        H0.a G1 = G1();
        return f.q(x0, G1 != null ? G1.x0(f.q(j, x0), f.p(j2, x0), i) : f.b.c());
    }
}
