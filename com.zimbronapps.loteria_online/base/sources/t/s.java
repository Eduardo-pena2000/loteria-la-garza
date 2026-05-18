package T;

import I0.Q;
import I0.V;
import P0.r1;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return s.a(null, this);
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return s.c(null, null, null, null, this);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ T.h a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T.h hVar) {
            super(1);
            this.a = hVar;
        }

        public final void a(I0.C c) {
            if (this.a.d(c.h())) {
                c.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I0.C) obj);
            return Ca.I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ T.h a;
        public final /* synthetic */ q b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T.h hVar, q qVar) {
            super(1);
            this.a = hVar;
            this.b = qVar;
        }

        public final void a(I0.C c) {
            if (this.a.a(c.h(), this.b)) {
                c.a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I0.C) obj);
            return Ca.I.a;
        }
    }

    public static final class e extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ T.h c;
        public final /* synthetic */ N.J d;

        public static final class a extends Ia.k implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ T.h c;
            public final /* synthetic */ T.d d;
            public final /* synthetic */ N.J e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(T.h hVar, T.d dVar, N.J j, Ga.e eVar) {
                super(2, eVar);
                this.c = hVar;
                this.d = dVar;
                this.e = j;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, this.e, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invoke(I0.b bVar, Ga.e eVar) {
                return create(bVar, eVar).invokeSuspend(Ca.I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r9.a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r4) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    Ca.t.b(r10)
                    goto L89
                L1e:
                    java.lang.Object r1 = r9.b
                    I0.b r1 = (I0.b) r1
                    Ca.t.b(r10)
                    goto L39
                L26:
                    Ca.t.b(r10)
                    java.lang.Object r10 = r9.b
                    r1 = r10
                    I0.b r1 = (I0.b) r1
                    r9.b = r1
                    r9.a = r4
                    java.lang.Object r10 = T.s.a(r1, r9)
                    if (r10 != r0) goto L39
                    return r0
                L39:
                    I0.q r10 = (I0.q) r10
                    boolean r4 = T.s.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L76
                    int r4 = r10.b()
                    boolean r4 = I0.v.b(r4)
                    if (r4 == 0) goto L76
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L55:
                    if (r7 >= r6) goto L67
                    java.lang.Object r8 = r4.get(r7)
                    I0.C r8 = (I0.C) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L64
                    goto L76
                L64:
                    int r7 = r7 + 1
                    goto L55
                L67:
                    T.h r2 = r9.c
                    T.d r4 = r9.d
                    r9.b = r5
                    r9.a = r3
                    java.lang.Object r10 = T.s.c(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L76:
                    boolean r3 = T.s.g(r10)
                    if (r3 != 0) goto L89
                    N.J r3 = r9.e
                    r9.b = r5
                    r9.a = r2
                    java.lang.Object r10 = T.s.d(r1, r3, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L89:
                    Ca.I r10 = Ca.I.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: T.s.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T.h hVar, N.J j, Ga.e eVar) {
            super(2, eVar);
            this.c = hVar;
            this.d = j;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            e eVar2 = new e(this.c, this.d, eVar);
            eVar2.b = obj;
            return eVar2;
        }

        public final Object invoke(I0.L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                I0.L l = (I0.L) this.b;
                a aVar = new a(this.c, new T.d(l.getViewConfiguration()), this.d, null);
                this.a = 1;
                if (C.o.c(l, aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final class f extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public f(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return s.d(null, null, null, this);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ N.J a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(N.J j) {
            super(1);
            this.a = j;
        }

        public final void a(I0.C c) {
            this.a.e(I0.r.g(c));
            c.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I0.C) obj);
            return Ca.I.a;
        }
    }

    public static final class h extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Qa.l c;

        public static final class a extends Ia.k implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Qa.l c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Qa.l lVar, Ga.e eVar) {
                super(2, eVar);
                this.c = lVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invoke(I0.b bVar, Ga.e eVar) {
                return create(bVar, eVar).invokeSuspend(Ca.I.a);
            }

            /*  JADX ERROR: iliLiI1iLLIL in pass: RegionMakerVisitor
                LI11I1ll1Ii11.iliLiI1iLLIL: Regions count limit reached
                	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
                	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
                */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r4.a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.b
                    I0.b r1 = (I0.b) r1
                    Ca.t.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    Ca.t.b(r5)
                    java.lang.Object r5 = r4.b
                    I0.b r5 = (I0.b) r5
                    r1 = r5
                L23:
                    I0.s r5 = I0.s.a
                    r4.b = r1
                    r4.a = r2
                    java.lang.Object r5 = r1.n0(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    I0.q r5 = (I0.q) r5
                    Qa.l r3 = r4.c
                    boolean r5 = T.s.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = Ia.b.a(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: T.s.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Qa.l lVar, Ga.e eVar) {
            super(2, eVar);
            this.c = lVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            h hVar = new h(this.c, eVar);
            hVar.b = obj;
            return hVar;
        }

        public final Object invoke(I0.L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                I0.L l = (I0.L) this.b;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (l.S0(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return Ca.I.a;
        }
    }

    public static final /* synthetic */ Object a(I0.b bVar, Ga.e eVar) {
        return e(bVar, eVar);
    }

    public static final /* synthetic */ boolean b(r1 r1Var, I0.C c2, I0.C c3) {
        return f(r1Var, c2, c3);
    }

    public static final /* synthetic */ Object c(I0.b bVar, T.h hVar, T.d dVar, I0.q qVar, Ga.e eVar) {
        return h(bVar, hVar, dVar, qVar, eVar);
    }

    public static final /* synthetic */ Object d(I0.b bVar, N.J j, I0.q qVar, Ga.e eVar) {
        return j(bVar, j, qVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(I0.b r7, Ga.e r8) {
        /*
            boolean r0 = r8 instanceof T.s.a
            if (r0 == 0) goto L13
            r0 = r8
            T.s$a r0 = (T.s.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            T.s$a r0 = new T.s$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.a
            I0.b r7 = (I0.b) r7
            Ca.t.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Ca.t.b(r8)
        L38:
            I0.s r8 = I0.s.b
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r7.n0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            I0.q r8 = (I0.q) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            I0.C r6 = (I0.C) r6
            boolean r6 = I0.r.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T.s.e(I0.b, Ga.e):java.lang.Object");
    }

    public static final boolean f(r1 r1Var, I0.C c2, I0.C c3) {
        return u0.f.k(u0.f.p(c2.h(), c3.h())) < C.j.h(r1Var, c2.n());
    }

    public static final boolean g(I0.q qVar) {
        List c2 = qVar.c();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            if (!Q.g(((I0.C) c2.get(i)).n(), Q.a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(I0.b r7, T.h r8, T.d r9, I0.q r10, Ga.e r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.s.h(I0.b, T.h, T.d, I0.q, Ga.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, T.h hVar, N.J j) {
        return V.d(eVar, hVar, j, new e(hVar, j, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:12:0x0031, B:13:0x00a1, B:15:0x00a9, B:17:0x00b8, B:19:0x00c4, B:21:0x00c7, B:24:0x00ca, B:28:0x00ce, B:32:0x004c, B:34:0x0073, B:36:0x0077, B:38:0x0081, B:42:0x0056), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:12:0x0031, B:13:0x00a1, B:15:0x00a9, B:17:0x00b8, B:19:0x00c4, B:21:0x00c7, B:24:0x00ca, B:28:0x00ce, B:32:0x004c, B:34:0x0073, B:36:0x0077, B:38:0x0081, B:42:0x0056), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(I0.b r8, N.J r9, I0.q r10, Ga.e r11) {
        /*
            boolean r0 = r11 instanceof T.s.f
            if (r0 == 0) goto L13
            r0 = r11
            T.s$f r0 = (T.s.f) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            T.s$f r0 = new T.s$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.b
            r9 = r8
            N.J r9 = (N.J) r9
            java.lang.Object r8 = r0.a
            I0.b r8 = (I0.b) r8
            Ca.t.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld4
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.c
            I0.C r8 = (I0.C) r8
            java.lang.Object r9 = r0.b
            N.J r9 = (N.J) r9
            java.lang.Object r10 = r0.a
            I0.b r10 = (I0.b) r10
            Ca.t.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            Ca.t.b(r11)
            java.util.List r10 = r10.c()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = Da.D.f0(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            I0.C r10 = (I0.C) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.f()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.c = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.e = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = C.j.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            return r1
        L73:
            I0.C r11 = (I0.C) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld1
            P0.r1 r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            long r4 = r11.h()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.c(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.f()     // Catch: java.util.concurrent.CancellationException -> L35
            T.s$g r2 = new T.s$g     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L35
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.b = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.e = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = C.j.f(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Lce
            I0.q r8 = r8.H0()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.c()     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb6:
            if (r11 >= r10) goto Lca
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            I0.C r0 = (I0.C) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = I0.r.c(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lc7
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L35
        Lc7:
            int r11 = r11 + 1
            goto Lb6
        Lca:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld1
        Lce:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld1:
            Ca.I r8 = Ca.I.a
            return r8
        Ld4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T.s.j(I0.b, N.J, I0.q, Ga.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e k(androidx.compose.ui.e eVar, Qa.l lVar) {
        return V.c(eVar, 8675309, new h(lVar, null));
    }
}
