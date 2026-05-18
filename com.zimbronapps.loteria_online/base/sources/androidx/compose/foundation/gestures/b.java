package androidx.compose.foundation.gestures;

import C.q;
import Ca.I;
import Ca.t;
import I0.C;
import I0.L;
import I0.V;
import I0.X;
import I0.s;
import O0.h;
import O0.i;
import O0.m;
import O0.v0;
import P0.p0;
import P0.r1;
import Qa.l;
import Qa.p;
import androidx.compose.foundation.gestures.a;
import cb.O;
import cb.P;
import cb.Q;
import eb.g;
import eb.j;
import eb.k;
import kotlin.jvm.internal.u;
import n1.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b extends m implements v0, h {
    public q c;
    public l d;
    public boolean e;
    public E.m f;
    public final l g = new a();
    public g h;
    public E.b i;
    public boolean j;
    public X k;

    public static final class a extends u implements l {
        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C c) {
            return (Boolean) b.this.U1().invoke(c);
        }
    }

    public static final class b extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;

        public static final class a extends Ia.l implements p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b c;
            public final /* synthetic */ L d;
            public final /* synthetic */ Qa.q e;
            public final /* synthetic */ l f;
            public final /* synthetic */ Qa.a g;
            public final /* synthetic */ Qa.a h;
            public final /* synthetic */ p i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, L l, Qa.q qVar, l lVar, Qa.a aVar, Qa.a aVar2, p pVar, Ga.e eVar) {
                super(2, eVar);
                this.c = bVar;
                this.d = l;
                this.e = qVar;
                this.f = lVar;
                this.g = aVar;
                this.h = aVar2;
                this.i = pVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r12.a
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.b
                    cb.O r0 = (cb.O) r0
                    Ca.t.b(r13)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L5d
                L13:
                    r13 = move-exception
                    goto L46
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    Ca.t.b(r13)
                    java.lang.Object r13 = r12.b
                    cb.O r13 = (cb.O) r13
                    androidx.compose.foundation.gestures.b r1 = r12.c     // Catch: java.util.concurrent.CancellationException -> L42
                    C.q r8 = androidx.compose.foundation.gestures.b.L1(r1)     // Catch: java.util.concurrent.CancellationException -> L42
                    I0.L r3 = r12.d     // Catch: java.util.concurrent.CancellationException -> L42
                    Qa.q r4 = r12.e     // Catch: java.util.concurrent.CancellationException -> L42
                    Qa.l r5 = r12.f     // Catch: java.util.concurrent.CancellationException -> L42
                    Qa.a r6 = r12.g     // Catch: java.util.concurrent.CancellationException -> L42
                    Qa.a r7 = r12.h     // Catch: java.util.concurrent.CancellationException -> L42
                    Qa.p r9 = r12.i     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.b = r13     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.a = r2     // Catch: java.util.concurrent.CancellationException -> L42
                    r10 = r12
                    java.lang.Object r13 = C.j.e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L42
                    if (r13 != r0) goto L5d
                    return r0
                L42:
                    r0 = move-exception
                    r11 = r0
                    r0 = r13
                    r13 = r11
                L46:
                    androidx.compose.foundation.gestures.b r1 = r12.c
                    eb.g r1 = androidx.compose.foundation.gestures.b.K1(r1)
                    if (r1 == 0) goto L57
                    androidx.compose.foundation.gestures.a$a r2 = androidx.compose.foundation.gestures.a.a.a
                    java.lang.Object r1 = r1.i(r2)
                    eb.k.b(r1)
                L57:
                    boolean r0 = cb.P.g(r0)
                    if (r0 == 0) goto L60
                L5d:
                    Ca.I r13 = Ca.I.a
                    return r13
                L60:
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class b extends u implements p {
            public final /* synthetic */ J0.d a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(J0.d dVar, b bVar) {
                super(2);
                this.a = dVar;
                this.b = bVar;
            }

            public final void a(C c, long j) {
                J0.e.c(this.a, c);
                g K1 = b.K1(this.b);
                if (K1 != null) {
                    k.b(K1.i(new a.b(j, null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C) obj, ((u0.f) obj2).u());
                return I.a;
            }
        }

        public static final class c extends u implements Qa.a {
            public final /* synthetic */ b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar) {
                super(0);
                this.a = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                g K1 = b.K1(this.a);
                if (K1 != null) {
                    k.b(K1.i(a.a.a));
                }
            }
        }

        public static final class d extends u implements l {
            public final /* synthetic */ J0.d a;
            public final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(J0.d dVar, b bVar) {
                super(1);
                this.a = dVar;
                this.b = bVar;
            }

            public final void a(C c) {
                J0.e.c(this.a, c);
                float f = ((r1) i.a(this.b, p0.r())).f();
                long b = this.a.b(z.a(f, f));
                this.a.e();
                g K1 = b.K1(this.b);
                if (K1 != null) {
                    k.b(K1.i(new a.d(C.l.f(b), null)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C) obj);
                return I.a;
            }
        }

        public static final class e extends u implements Qa.q {
            public final /* synthetic */ b a;
            public final /* synthetic */ J0.d b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b bVar, J0.d dVar) {
                super(3);
                this.a = bVar;
                this.b = dVar;
            }

            public final void a(C c, C c2, long j) {
                if (((Boolean) this.a.U1().invoke(c)).booleanValue()) {
                    if (!b.M1(this.a)) {
                        if (b.K1(this.a) == null) {
                            b.Q1(this.a, j.b(Integer.MAX_VALUE, (eb.a) null, (l) null, 6, (Object) null));
                        }
                        b.R1(this.a);
                    }
                    J0.e.c(this.b, c);
                    long p = u0.f.p(c2.h(), j);
                    g K1 = b.K1(this.a);
                    if (K1 != null) {
                        k.b(K1.i(new a.c(p, null)));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C) obj, (C) obj2, ((u0.f) obj3).u());
                return I.a;
            }
        }

        public static final class f extends u implements Qa.a {
            public final /* synthetic */ b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(b bVar) {
                super(0);
                this.a = bVar;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(!this.a.c2());
            }
        }

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = b.this.new b(eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f2 = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                L l = (L) this.b;
                J0.d dVar = new J0.d();
                a aVar = new a(b.this, l, new e(b.this, dVar), new d(dVar, b.this), new c(b.this), new f(b.this), new b(dVar, b.this), null);
                this.a = 1;
                if (P.e(aVar, this) == f2) {
                    return f2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class c extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return b.N1(b.this, this);
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return b.O1(b.this, null, this);
        }
    }

    public static final class e extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return b.P1(b.this, null, this);
        }
    }

    public static final class f extends Ia.l implements p {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;

        public static final class a extends Ia.l implements p {
            public Object a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ kotlin.jvm.internal.O d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.O o, b bVar, Ga.e eVar) {
                super(2, eVar);
                this.d = o;
                this.e = bVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l lVar, Ga.e eVar) {
                return create(lVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.d, this.e, eVar);
                aVar.c = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:6:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:5:0x0058). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r5.b
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.a
                    kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                    java.lang.Object r3 = r5.c
                    Qa.l r3 = (Qa.l) r3
                    Ca.t.b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    Ca.t.b(r6)
                    java.lang.Object r6 = r5.c
                    Qa.l r6 = (Qa.l) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.O r6 = r5.d
                    java.lang.Object r6 = r6.a
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.d
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.a
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.b
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.a$b r6 = (androidx.compose.foundation.gestures.a.b) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.O r1 = r5.d
                    androidx.compose.foundation.gestures.b r6 = r5.e
                    eb.g r6 = androidx.compose.foundation.gestures.b.K1(r6)
                    if (r6 == 0) goto L5b
                    r5.c = r3
                    r5.a = r1
                    r5.b = r2
                    java.lang.Object r6 = r6.c(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                L5b:
                    r1.a = r4
                    goto L27
                L5e:
                    Ca.I r6 = Ca.I.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public f(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            f fVar = b.this.new f(eVar);
            fVar.d = obj;
            return fVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:42)|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
        
            r1 = r4;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:27:0x00ba, B:29:0x00c0, B:32:0x00d9, B:34:0x00dd), top: B:26:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:27:0x00ba, B:29:0x00c0, B:32:0x00d9, B:34:0x00dd), top: B:26:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:8:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:8:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00db -> B:8:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ea -> B:8:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:7:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(l lVar, boolean z, E.m mVar, q qVar) {
        this.c = qVar;
        this.d = lVar;
        this.e = z;
        this.f = mVar;
    }

    public static final /* synthetic */ g K1(b bVar) {
        return bVar.h;
    }

    public static final /* synthetic */ q L1(b bVar) {
        return bVar.c;
    }

    public static final /* synthetic */ boolean M1(b bVar) {
        return bVar.j;
    }

    public static final /* synthetic */ Object N1(b bVar, Ga.e eVar) {
        return bVar.Z1(eVar);
    }

    public static final /* synthetic */ Object O1(b bVar, a.c cVar, Ga.e eVar) {
        return bVar.a2(cVar, eVar);
    }

    public static final /* synthetic */ Object P1(b bVar, a.d dVar, Ga.e eVar) {
        return bVar.b2(dVar, eVar);
    }

    public static final /* synthetic */ void Q1(b bVar, g gVar) {
        bVar.h = gVar;
    }

    public static final /* synthetic */ void R1(b bVar) {
        bVar.d2();
    }

    public void J0(I0.q qVar, s sVar, long j) {
        if (this.e && this.k == null) {
            this.k = (X) E1(W1());
        }
        X x = this.k;
        if (x != null) {
            x.J0(qVar, sVar, j);
        }
    }

    public final void S1() {
        E.b bVar = this.i;
        if (bVar != null) {
            E.m mVar = this.f;
            if (mVar != null) {
                mVar.a(new E.a(bVar));
            }
            this.i = null;
        }
    }

    public abstract Object T1(p pVar, Ga.e eVar);

    public void U0() {
        X x = this.k;
        if (x != null) {
            x.U0();
        }
    }

    public final l U1() {
        return this.d;
    }

    public final boolean V1() {
        return this.e;
    }

    public final X W1() {
        return V.a(new b(null));
    }

    public abstract void X1(long j);

    public abstract void Y1(long j);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z1(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.b.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.b$c r0 = (androidx.compose.foundation.gestures.b.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$c r0 = new androidx.compose.foundation.gestures.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Ca.t.b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            Ca.t.b(r6)
            E.b r6 = r5.i
            if (r6 == 0) goto L55
            E.m r2 = r5.f
            if (r2 == 0) goto L50
            E.a r4 = new E.a
            r4.<init>(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r2.c(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.i = r6
            goto L56
        L55:
            r0 = r5
        L56:
            n1.y$a r6 = n1.y.b
            long r1 = r6.a()
            r0.Y1(r1)
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.Z1(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a2(androidx.compose.foundation.gestures.a.c r7, Ga.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.c
            E.b r7 = (E.b) r7
            java.lang.Object r1 = r0.b
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Ca.t.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.b
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.a
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            Ca.t.b(r8)
            goto L6a
        L4c:
            Ca.t.b(r8)
            E.b r8 = r6.i
            if (r8 == 0) goto L69
            E.m r2 = r6.f
            if (r2 == 0) goto L69
            E.a r5 = new E.a
            r5.<init>(r8)
            r0.a = r6
            r0.b = r7
            r0.f = r4
            java.lang.Object r8 = r2.c(r5, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r2 = r6
        L6a:
            E.b r8 = new E.b
            r8.<init>()
            E.m r4 = r2.f
            if (r4 == 0) goto L88
            r0.a = r2
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r0 = r4.c(r8, r0)
            if (r0 != r1) goto L82
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.i = r8
            long r7 = r7.a()
            r2.X1(r7)
            Ca.I r7 = Ca.I.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.a2(androidx.compose.foundation.gestures.a$c, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b2(androidx.compose.foundation.gestures.a.d r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.b
            androidx.compose.foundation.gestures.a$d r6 = (androidx.compose.foundation.gestures.a.d) r6
            java.lang.Object r0 = r0.a
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            Ca.t.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            Ca.t.b(r7)
            E.b r7 = r5.i
            if (r7 == 0) goto L5b
            E.m r2 = r5.f
            if (r2 == 0) goto L56
            E.c r4 = new E.c
            r4.<init>(r7)
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r2.c(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.i = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.a()
            r0.Y1(r6)
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.b2(androidx.compose.foundation.gestures.a$d, Ga.e):java.lang.Object");
    }

    public abstract boolean c2();

    public final void d2() {
        this.j = true;
        cb.i.d(getCoroutineScope(), (Ga.i) null, (Q) null, new f(null), 3, (Object) null);
    }

    public final void e2(l lVar, boolean z, E.m mVar, q qVar, boolean z2) {
        X x;
        this.d = lVar;
        boolean z3 = true;
        if (this.e != z) {
            this.e = z;
            if (!z) {
                S1();
                X x2 = this.k;
                if (x2 != null) {
                    H1(x2);
                }
                this.k = null;
            }
            z2 = true;
        }
        if (!kotlin.jvm.internal.t.c(this.f, mVar)) {
            S1();
            this.f = mVar;
        }
        if (this.c != qVar) {
            this.c = qVar;
        } else {
            z3 = z2;
        }
        if (!z3 || (x = this.k) == null) {
            return;
        }
        x.D0();
    }

    public void onDetach() {
        this.j = false;
        S1();
    }
}
