package gb;

import Ca.I;
import cb.O;
import eb.y;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k {

    public static final class a extends Ia.l implements Qa.p {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ fb.e[] g;
        public final /* synthetic */ Qa.a h;
        public final /* synthetic */ Qa.q i;
        public final /* synthetic */ fb.f j;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ fb.e[] b;
            public final /* synthetic */ int c;
            public final /* synthetic */ AtomicInteger d;
            public final /* synthetic */ eb.g e;

            public static final class a implements fb.f {
                public final /* synthetic */ eb.g a;
                public final /* synthetic */ int b;

                public static final class a extends Ia.d {
                    public /* synthetic */ Object a;
                    public int c;

                    public a(Ga.e eVar) {
                        super(eVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(eb.g gVar, int i) {
                    this.a = gVar;
                    this.b = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, Ga.e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof gb.k.a.a.a.a
                        if (r0 == 0) goto L13
                        r0 = r8
                        gb.k$a$a$a$a r0 = (gb.k.a.a.a.a) r0
                        int r1 = r0.c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.c = r1
                        goto L18
                    L13:
                        gb.k$a$a$a$a r0 = new gb.k$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.a
                        java.lang.Object r1 = Ha.c.f()
                        int r2 = r0.c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        Ca.t.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        Ca.t.b(r8)
                        goto L4d
                    L38:
                        Ca.t.b(r8)
                        eb.g r8 = r6.a
                        Da.J r2 = new Da.J
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.c = r4
                        java.lang.Object r7 = r8.e(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.c = r3
                        java.lang.Object r7 = cb.i1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        Ca.I r7 = Ca.I.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: gb.k.a.a.a.emit(java.lang.Object, Ga.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fb.e[] eVarArr, int i, AtomicInteger atomicInteger, eb.g gVar, Ga.e eVar) {
                super(2, eVar);
                this.b = eVarArr;
                this.c = i;
                this.d = atomicInteger;
                this.e = gVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, this.d, this.e, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return ((a) create(o, eVar)).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object f = Ha.c.f();
                int i = this.a;
                try {
                    if (i == 0) {
                        Ca.t.b(obj);
                        fb.e[] eVarArr = this.b;
                        int i2 = this.c;
                        fb.e eVar = eVarArr[i2];
                        a aVar = new a(this.e, i2);
                        this.a = 1;
                        if (eVar.collect(aVar, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        y.a.a(this.e, null, 1, null);
                    }
                    return I.a;
                } finally {
                    if (this.d.decrementAndGet() == 0) {
                        y.a.a(this.e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fb.e[] eVarArr, Qa.a aVar, Qa.q qVar, fb.f fVar, Ga.e eVar) {
            super(2, eVar);
            this.g = eVarArr;
            this.h = aVar;
            this.i = qVar;
            this.j = fVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(this.g, this.h, this.i, this.j, eVar);
            aVar.f = obj;
            return aVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return ((a) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[LOOP:0: B:19:0x00ca->B:37:?, LOOP_START, PHI: r6 r10
          0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:16:0x00c5, B:37:?] A[DONT_GENERATE, DONT_INLINE]
          0x00ca: PHI (r10v8 Da.J) = (r10v7 Da.J), (r10v21 Da.J) binds: [B:16:0x00c5, B:37:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0135 -> B:10:0x0137). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(fb.f fVar, fb.e[] eVarArr, Qa.a aVar, Qa.q qVar, Ga.e eVar) {
        Object a2 = n.a(new a(eVarArr, aVar, qVar, fVar, null), eVar);
        return a2 == Ha.c.f() ? a2 : I.a;
    }
}
