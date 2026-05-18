package b0;

import Ca.s;
import cb.B0;
import cb.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l0.l;
import l0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o1 extends y {
    public static final a C = new a(null);
    public static final int D = 8;
    public static final fb.z E = fb.P.a(e0.a.c());
    public static final AtomicReference F = new AtomicReference(Boolean.FALSE);
    public w.L A;
    public final c B;
    public long a;
    public final b0.e b;
    public final Object c;
    public cb.B0 d;
    public Throwable e;
    public final List f;
    public List g;
    public w.Q h;
    public final d0.c i;
    public final List j;
    public final List k;
    public final w.P l;
    public final E0 m;
    public final w.P n;
    public final w.P o;
    public List p;
    public Set q;
    public cb.n r;
    public int s;
    public boolean t;
    public b u;
    public boolean v;
    public final fb.z w;
    public final j0.r x;
    public final cb.A y;
    public final Ga.i z;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, c cVar) {
            aVar.c(cVar);
        }

        public static final /* synthetic */ void b(a aVar, c cVar) {
            aVar.d(cVar);
        }

        public final void c(c cVar) {
            e0.g gVar;
            e0.g add;
            do {
                gVar = (e0.g) o1.P().getValue();
                add = gVar.add(cVar);
                if (gVar == add) {
                    return;
                }
            } while (!o1.P().e(gVar, add));
        }

        public final void d(c cVar) {
            e0.g gVar;
            e0.g remove;
            do {
                gVar = (e0.g) o1.P().getValue();
                remove = gVar.remove(cVar);
                if (gVar == remove) {
                    return;
                }
            } while (!o1.P().e(gVar, remove));
        }

        public a() {
        }
    }

    public static final class b {
        public final boolean a;
        public final Throwable b;

        public b(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }

        public Throwable a() {
            return this.b;
        }
    }

    public final class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a = new d("ShutDown", 0);
        public static final d b = new d("ShuttingDown", 1);
        public static final d c = new d("Inactive", 2);
        public static final d d = new d("InactivePendingWork", 3);
        public static final d e = new d("Idle", 4);
        public static final d f = new d("PendingWork", 5);
        public static final /* synthetic */ d[] g;
        public static final /* synthetic */ Ja.a h;

        static {
            d[] a2 = a();
            g = a2;
            h = Ja.b.a(a2);
        }

        public d(String str, int i) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e, f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) g.clone();
        }
    }

    public static final class e extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public e(Ga.e eVar) {
            super(2, eVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Ga.e eVar) {
            return create(dVar, eVar).invokeSuspend(Ca.I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            e eVar2 = new e(eVar);
            eVar2.b = obj;
            return eVar2;
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return Ia.b.a(((d) this.b) == d.a);
        }
    }

    public static final class f extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Qa.q e;
        public final /* synthetic */ t0 f;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Qa.q c;
            public final /* synthetic */ t0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Qa.q qVar, t0 t0Var, Ga.e eVar) {
                super(2, eVar);
                this.c = qVar;
                this.d = t0Var;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    cb.O o = (cb.O) this.b;
                    Qa.q qVar = this.c;
                    t0 t0Var = this.d;
                    this.a = 1;
                    if (qVar.invoke(o, t0Var, this) == f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Qa.q qVar, t0 t0Var, Ga.e eVar) {
            super(2, eVar);
            this.e = qVar;
            this.f = t0Var;
        }

        public static /* synthetic */ Ca.I a(o1 o1Var, Set set, l0.l lVar) {
            return i(o1Var, set, lVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final Ca.I i(b0.o1 r17, java.util.Set r18, l0.l r19) {
            /*
                r0 = r18
                r1 = 1
                java.lang.Object r2 = b0.o1.O(r17)
                monitor-enter(r2)
                fb.z r3 = b0.o1.Q(r17)     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6f
                b0.o1$d r3 = (b0.o1.d) r3     // Catch: java.lang.Throwable -> L6f
                b0.o1$d r4 = b0.o1.d.e     // Catch: java.lang.Throwable -> L6f
                int r3 = r3.compareTo(r4)     // Catch: java.lang.Throwable -> L6f
                if (r3 < 0) goto La8
                w.Q r3 = b0.o1.N(r17)     // Catch: java.lang.Throwable -> L6f
                boolean r4 = r0 instanceof d0.e     // Catch: java.lang.Throwable -> L6f
                if (r4 == 0) goto L7d
                d0.e r0 = (d0.e) r0     // Catch: java.lang.Throwable -> L6f
                w.e0 r0 = r0.a()     // Catch: java.lang.Throwable -> L6f
                java.lang.Object[] r4 = r0.b     // Catch: java.lang.Throwable -> L6f
                long[] r0 = r0.a     // Catch: java.lang.Throwable -> L6f
                int r5 = r0.length     // Catch: java.lang.Throwable -> L6f
                int r5 = r5 + (-2)
                if (r5 < 0) goto La3
                r6 = 0
                r7 = r6
            L33:
                r8 = r0[r7]     // Catch: java.lang.Throwable -> L6f
                long r10 = ~r8     // Catch: java.lang.Throwable -> L6f
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L79
                int r10 = r7 - r5
                int r10 = ~r10     // Catch: java.lang.Throwable -> L6f
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L4d:
                if (r12 >= r10) goto L77
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L74
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r4[r13]     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r13 instanceof l0.V     // Catch: java.lang.Throwable -> L6f
                if (r14 == 0) goto L71
                r14 = r13
                l0.V r14 = (l0.V) r14     // Catch: java.lang.Throwable -> L6f
                int r15 = l0.h.a(r1)     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r14.D(r15)     // Catch: java.lang.Throwable -> L6f
                if (r14 != 0) goto L71
                goto L74
            L6f:
                r0 = move-exception
                goto Lba
            L71:
                r3.h(r13)     // Catch: java.lang.Throwable -> L6f
            L74:
                long r8 = r8 >> r11
                int r12 = r12 + r1
                goto L4d
            L77:
                if (r10 != r11) goto La3
            L79:
                if (r7 == r5) goto La3
                int r7 = r7 + r1
                goto L33
            L7d:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L6f
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            L83:
                boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L6f
                if (r4 == 0) goto La3
                java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r4 instanceof l0.V     // Catch: java.lang.Throwable -> L6f
                if (r5 == 0) goto L9f
                r5 = r4
                l0.V r5 = (l0.V) r5     // Catch: java.lang.Throwable -> L6f
                int r6 = l0.h.a(r1)     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r5.D(r6)     // Catch: java.lang.Throwable -> L6f
                if (r5 != 0) goto L9f
                goto L83
            L9f:
                r3.h(r4)     // Catch: java.lang.Throwable -> L6f
                goto L83
            La3:
                cb.n r0 = b0.o1.D(r17)     // Catch: java.lang.Throwable -> L6f
                goto La9
            La8:
                r0 = 0
            La9:
                monitor-exit(r2)
                if (r0 == 0) goto Lb7
                Ca.s$a r1 = Ca.s.b
                Ca.I r1 = Ca.I.a
                java.lang.Object r1 = Ca.s.b(r1)
                r0.resumeWith(r1)
            Lb7:
                Ca.I r0 = Ca.I.a
                return r0
            Lba:
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.o1.f.i(b0.o1, java.util.Set, l0.l):Ca.I");
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            f fVar = o1.this.new f(this.e, this.f, eVar);
            fVar.c = obj;
            return fVar;
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.o1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class g extends Ia.l implements Qa.q {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public int i;
        public /* synthetic */ Object j;

        public g(Ga.e eVar) {
            super(3, eVar);
        }

        public static /* synthetic */ Ca.I a(o1 o1Var, w.Q q, w.Q q2, List list, List list2, w.Q q3, List list3, w.Q q4, Set set, long j) {
            return n(o1Var, q, q2, list, list2, q3, list3, q4, set, j);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void k(b0.o1 r23, java.util.List r24, java.util.List r25, java.util.List r26, w.Q r27, w.Q r28, w.Q r29, w.Q r30) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.o1.g.k(b0.o1, java.util.List, java.util.List, java.util.List, w.Q, w.Q, w.Q, w.Q):void");
        }

        public static final void l(List list, o1 o1Var) {
            list.clear();
            synchronized (o1.O(o1Var)) {
                try {
                    List J = o1.J(o1Var);
                    int size = J.size();
                    for (int i = 0; i < size; i++) {
                        list.add((y0) J.get(i));
                    }
                    o1.J(o1Var).clear();
                    Ca.I i2 = Ca.I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v21, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [w.e0] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v14, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v17 */
        /* JADX WARN: Type inference failed for: r12v18, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r12v23, types: [int] */
        /* JADX WARN: Type inference failed for: r12v29, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [w.Q, w.e0] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r28v0, types: [w.Q, w.e0] */
        /* JADX WARN: Type inference failed for: r6v15, types: [l0.l] */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v22, types: [w.Q] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final Ca.I n(b0.o1 r26, w.Q r27, w.Q r28, java.util.List r29, java.util.List r30, w.Q r31, java.util.List r32, w.Q r33, java.util.Set r34, long r35) {
            /*
                Method dump skipped, instructions count: 1025
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.o1.g.n(b0.o1, w.Q, w.Q, java.util.List, java.util.List, w.Q, java.util.List, w.Q, java.util.Set, long):Ca.I");
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cb.O o, t0 t0Var, Ga.e eVar) {
            g gVar = o1.this.new g(eVar);
            gVar.j = t0Var;
            return gVar.invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0139 -> B:6:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0151 -> B:7:0x014d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.o1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o1(Ga.i iVar) {
        b0.e eVar = new b0.e(new j1(this));
        this.b = eVar;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new w.Q(0, 1, null);
        this.i = new d0.c(new Q[16], 0);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = d0.b.e(null, 1, null);
        this.m = new E0();
        this.n = w.d0.b();
        this.o = d0.b.e(null, 1, null);
        this.w = fb.P.a(d.c);
        this.x = new j0.r();
        cb.A a2 = cb.E0.a(iVar.get(cb.B0.P8));
        a2.invokeOnCompletion(new k1(this));
        this.y = a2;
        this.z = iVar.plus(eVar).plus(a2);
        this.B = new c();
    }

    public static /* synthetic */ Ca.I A(Q q, w.Q q2, Object obj) {
        return Q0(q, q2, obj);
    }

    public static /* synthetic */ Ca.I B(o1 o1Var, Throwable th) {
        return k0(o1Var, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Ca.I B0(w.Q r13, b0.Q r14) {
        /*
            java.lang.Object[] r0 = r13.b
            long[] r13 = r13.a
            int r1 = r13.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L43
            r2 = 0
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L3e
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L3c
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L38
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.r(r9)
        L38:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L3c:
            if (r6 != r7) goto L43
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto Lb
        L43:
            Ca.I r13 = Ca.I.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o1.B0(w.Q, b0.Q):Ca.I");
    }

    public static final /* synthetic */ Object C(o1 o1Var, Ga.e eVar) {
        return o1Var.e0(eVar);
    }

    public static final /* synthetic */ cb.n D(o1 o1Var) {
        return o1Var.i0();
    }

    public static /* synthetic */ void D0(o1 o1Var, Throwable th, Q q, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            q = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        o1Var.C0(th, q, z);
    }

    public static final /* synthetic */ void E(o1 o1Var) {
        o1Var.j0();
    }

    public static final /* synthetic */ b0.e F(o1 o1Var) {
        return o1Var.b;
    }

    public static final Ca.I F0(Q q, Object obj) {
        q.b(obj);
        return Ca.I.a;
    }

    public static final /* synthetic */ d0.c G(o1 o1Var) {
        return o1Var.i;
    }

    public static final /* synthetic */ boolean H(o1 o1Var) {
        return o1Var.o0();
    }

    public static final /* synthetic */ boolean I(o1 o1Var) {
        return o1Var.r0();
    }

    public static final /* synthetic */ List J(o1 o1Var) {
        return o1Var.k;
    }

    public static final /* synthetic */ c K(o1 o1Var) {
        return o1Var.B;
    }

    public static final /* synthetic */ cb.B0 L(o1 o1Var) {
        return o1Var.d;
    }

    public static final /* synthetic */ boolean M(o1 o1Var) {
        return o1Var.s0();
    }

    public static final /* synthetic */ w.Q N(o1 o1Var) {
        return o1Var.h;
    }

    public static final /* synthetic */ Object O(o1 o1Var) {
        return o1Var.c;
    }

    public static final /* synthetic */ fb.z P() {
        return E;
    }

    public static final /* synthetic */ fb.z Q(o1 o1Var) {
        return o1Var.w;
    }

    public static final Ca.I Q0(Q q, w.Q q2, Object obj) {
        q.r(obj);
        if (q2 != null) {
            q2.h(obj);
        }
        return Ca.I.a;
    }

    public static final /* synthetic */ List R(o1 o1Var) {
        return o1Var.u0();
    }

    public static final /* synthetic */ List S(o1 o1Var) {
        return o1Var.v0();
    }

    public static final /* synthetic */ List T(o1 o1Var, List list, w.Q q) {
        return o1Var.z0(list, q);
    }

    public static final /* synthetic */ Q U(o1 o1Var, Q q, w.Q q2) {
        return o1Var.A0(q, q2);
    }

    public static final /* synthetic */ boolean V(o1 o1Var) {
        return o1Var.H0();
    }

    public static final /* synthetic */ void W(o1 o1Var, Q q) {
        o1Var.I0(q);
    }

    public static final /* synthetic */ void X(o1 o1Var, cb.B0 b0) {
        o1Var.K0(b0);
    }

    public static final /* synthetic */ void Y(o1 o1Var, long j) {
        o1Var.a = j;
    }

    public static final /* synthetic */ void Z(o1 o1Var, Set set) {
        o1Var.q = set;
    }

    public static final /* synthetic */ void a0(o1 o1Var, cb.B0 b0) {
        o1Var.d = b0;
    }

    public static final /* synthetic */ void b0(o1 o1Var, cb.n nVar) {
        o1Var.r = nVar;
    }

    public static final Ca.I f0(o1 o1Var) {
        cb.n i0;
        synchronized (o1Var.c) {
            i0 = o1Var.i0();
            if (((d) o1Var.w.getValue()).compareTo(d.b) <= 0) {
                throw cb.p0.a("Recomposer shutdown; frame clock awaiter will never resume", o1Var.e);
            }
        }
        if (i0 != null) {
            s.a aVar = Ca.s.b;
            i0.resumeWith(Ca.s.b(Ca.I.a));
        }
        return Ca.I.a;
    }

    public static final Ca.I k0(o1 o1Var, Throwable th) {
        cb.n nVar;
        cb.n nVar2;
        CancellationException a2 = cb.p0.a("Recomposer effect job completed", th);
        synchronized (o1Var.c) {
            try {
                cb.B0 b0 = o1Var.d;
                nVar = null;
                if (b0 != null) {
                    o1Var.w.setValue(d.b);
                    if (o1Var.t) {
                        nVar2 = o1Var.r;
                        if (nVar2 != null) {
                        }
                        o1Var.r = null;
                        b0.invokeOnCompletion(new m1(o1Var, th));
                        nVar = nVar2;
                    } else {
                        b0.cancel(a2);
                    }
                    nVar2 = null;
                    o1Var.r = null;
                    b0.invokeOnCompletion(new m1(o1Var, th));
                    nVar = nVar2;
                } else {
                    o1Var.e = a2;
                    o1Var.w.setValue(d.a);
                    Ca.I i = Ca.I.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nVar != null) {
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(Ca.I.a));
        }
        return Ca.I.a;
    }

    public static final Ca.I l0(o1 o1Var, Throwable th, Throwable th2) {
        synchronized (o1Var.c) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        Ca.g.a(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            o1Var.e = th;
            o1Var.w.setValue(d.a);
        }
        return Ca.I.a;
    }

    public static /* synthetic */ Ca.I w(Q q, Object obj) {
        return F0(q, obj);
    }

    public static /* synthetic */ Ca.I x(w.Q q, Q q2) {
        return B0(q, q2);
    }

    public static /* synthetic */ Ca.I y(o1 o1Var, Throwable th, Throwable th2) {
        return l0(o1Var, th, th2);
    }

    public static final void y0(List list, o1 o1Var, Q q) {
        list.clear();
        synchronized (o1Var.c) {
            try {
                Iterator it = o1Var.k.iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    if (kotlin.jvm.internal.t.c(y0Var.b(), q)) {
                        list.add(y0Var);
                        it.remove();
                    }
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Ca.I z(o1 o1Var) {
        return f0(o1Var);
    }

    public final Q A0(Q q, w.Q q2) {
        Set set;
        if (q.p() || q.e() || ((set = this.q) != null && set.contains(q))) {
            return null;
        }
        l0.d n = l0.l.e.n(E0(q), P0(q, q2));
        try {
            l0.l l = n.l();
            if (q2 != null) {
                try {
                    if (q2.e()) {
                        q.k(new n1(q2, q));
                    }
                } catch (Throwable th) {
                    n.s(l);
                    throw th;
                }
            }
            boolean i = q.i();
            n.s(l);
            if (i) {
                return q;
            }
            return null;
        } finally {
            d0(n);
        }
    }

    public final void C0(Throwable th, Q q, boolean z) {
        if (!((Boolean) F.get()).booleanValue() || (th instanceof k)) {
            synchronized (this.c) {
                b bVar = this.u;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.u = new b(false, th);
                Ca.I i = Ca.I.a;
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                j0.y.a("Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.h();
                this.h = new w.Q(0, 1, null);
                this.k.clear();
                d0.b.c(this.l);
                this.n.k();
                this.u = new b(z, th);
                if (q != null) {
                    I0(q);
                }
                i0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Qa.l E0(Q q) {
        return new i1(q);
    }

    public final Object G0(Qa.q qVar, Ga.e eVar) {
        Object g2 = cb.i.g(this.b, new f(qVar, v0.a(eVar.getContext()), null), eVar);
        return g2 == Ha.c.f() ? g2 : Ca.I.a;
    }

    public final boolean H0() {
        boolean q0;
        Da.v.n();
        synchronized (this.c) {
            if (this.h.d()) {
                return q0();
            }
            List v0 = v0();
            Set a2 = d0.f.a(this.h);
            this.h = new w.Q(0, 1, null);
            try {
                int size = v0.size();
                for (int i = 0; i < size; i++) {
                    ((Q) v0.get(i)).n(a2);
                    if (((d) this.w.getValue()).compareTo(d.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (i0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    q0 = q0();
                }
                return q0;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.h.i((Iterable) a2);
                    throw th;
                }
            }
        }
    }

    public final void I0(Q q) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(q)) {
            arrayList.add(q);
        }
        L0(q);
    }

    public final void J0(Q q) {
        w.L l = this.A;
        if (l != null) {
            Object[] objArr = l.a;
            int i = l.b;
            for (int i2 = 0; i2 < i; i2++) {
                android.support.v4.media.session.b.a(objArr[i2]);
                if (q instanceof n0.r) {
                    throw null;
                }
            }
        }
    }

    public final void K0(cb.B0 b0) {
        synchronized (this.c) {
            Throwable th = this.e;
            if (th != null) {
                throw th;
            }
            if (((d) this.w.getValue()).compareTo(d.b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.d = b0;
            i0();
        }
    }

    public final void L0(Q q) {
        if (this.f.remove(q)) {
            this.g = null;
            O0(q);
        }
    }

    public final void M0() {
        cb.n nVar;
        synchronized (this.c) {
            if (this.v) {
                this.v = false;
                nVar = i0();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(Ca.I.a));
        }
    }

    public final Object N0(Ga.e eVar) {
        Object G0 = G0(new g(null), eVar);
        return G0 == Ha.c.f() ? G0 : Ca.I.a;
    }

    public final void O0(Q q) {
        w.L l = this.A;
        if (l != null) {
            Object[] objArr = l.a;
            int i = l.b;
            for (int i2 = 0; i2 < i; i2++) {
                android.support.v4.media.session.b.a(objArr[i2]);
                if (q instanceof n0.r) {
                    throw null;
                }
            }
        }
    }

    public final Qa.l P0(Q q, w.Q q2) {
        return new l1(q, q2);
    }

    public void a(Q q, Qa.p pVar) {
        boolean z;
        boolean p = q.p();
        synchronized (this.c) {
            if (((d) this.w.getValue()).compareTo(d.b) > 0) {
                boolean contains = v0().contains(q);
                z = !contains;
                if (!contains) {
                    c0(q);
                }
            } else {
                z = true;
            }
        }
        try {
            l.a aVar = l0.l.e;
            l0.d n = aVar.n(E0(q), P0(q, null));
            try {
                l0.l l = n.l();
                try {
                    q.u(pVar);
                    Ca.I i = Ca.I.a;
                    if (!p) {
                        aVar.f();
                    }
                    try {
                        x0(q);
                        try {
                            q.o();
                            q.d();
                            if (p) {
                                return;
                            }
                            aVar.f();
                        } catch (Throwable th) {
                            D0(this, th, null, false, 6, null);
                        }
                    } catch (Throwable th2) {
                        C0(th2, q, true);
                    }
                } finally {
                    n.s(l);
                }
            } finally {
                d0(n);
            }
        } catch (Throwable th3) {
            C0(th3, q, true);
            if (z) {
                synchronized (this.c) {
                    L0(q);
                    Ca.I i2 = Ca.I.a;
                }
            }
        }
    }

    public w.e0 b(Q q, C1 c1, Qa.p pVar) {
        try {
            C1 z = q.z(c1);
            try {
                a(q, pVar);
                w.e0 e0Var = (w.Q) this.x.a();
                if (e0Var == null) {
                    e0Var = w.f0.a();
                }
                return e0Var;
            } finally {
                q.z(z);
            }
        } finally {
            this.x.b(null);
        }
    }

    public final void c0(Q q) {
        this.f.add(q);
        this.g = null;
        J0(q);
    }

    public boolean d() {
        return ((Boolean) F.get()).booleanValue();
    }

    public final void d0(l0.d dVar) {
        try {
            if (dVar.C() instanceof m.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            dVar.d();
        }
    }

    public boolean e() {
        return false;
    }

    public final Object e0(Ga.e eVar) {
        Ga.e eVar2;
        if (r0()) {
            return Ca.I.a;
        }
        Ga.e pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        synchronized (O(this)) {
            if (I(this)) {
                eVar2 = pVar;
            } else {
                b0(this, pVar);
                eVar2 = null;
            }
        }
        if (eVar2 != null) {
            s.a aVar = Ca.s.b;
            eVar2.resumeWith(Ca.s.b(Ca.I.a));
        }
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : Ca.I.a;
    }

    public boolean f() {
        return w.B();
    }

    public long g() {
        return 1000;
    }

    public final void g0() {
        synchronized (this.c) {
            try {
                if (((d) this.w.getValue()).compareTo(d.e) >= 0) {
                    this.w.setValue(d.b);
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        B0.a.b(this.y, (CancellationException) null, 1, (Object) null);
    }

    public x h() {
        return null;
    }

    public final void h0() {
        Iterator it = v0().iterator();
        while (it.hasNext()) {
            O0((Q) it.next());
        }
        this.f.clear();
        this.g = Da.v.n();
    }

    public final cb.n i0() {
        d dVar;
        if (((d) this.w.getValue()).compareTo(d.b) <= 0) {
            h0();
            this.h = new w.Q(0, 1, null);
            this.i.h();
            this.j.clear();
            this.k.clear();
            this.p = null;
            cb.n nVar = this.r;
            if (nVar != null) {
                n.a.a(nVar, (Throwable) null, 1, (Object) null);
            }
            this.r = null;
            this.u = null;
            return null;
        }
        if (this.u != null) {
            dVar = d.c;
        } else if (this.d == null) {
            this.h = new w.Q(0, 1, null);
            this.i.h();
            dVar = p0() ? d.d : d.c;
        } else {
            dVar = (this.i.m() == 0 && !this.h.e() && this.j.isEmpty() && this.k.isEmpty() && this.s <= 0 && !p0() && !d0.b.j(this.l)) ? d.e : d.f;
        }
        this.w.setValue(dVar);
        if (dVar != d.f) {
            return null;
        }
        cb.n nVar2 = this.r;
        this.r = null;
        return nVar2;
    }

    public Ga.i j() {
        return this.z;
    }

    public final void j0() {
        int i;
        w.V v;
        synchronized (this.c) {
            try {
                if (d0.b.j(this.l)) {
                    w.V p = d0.b.p(this.l);
                    d0.b.c(this.l);
                    this.m.b();
                    d0.b.c(this.o);
                    w.L l = new w.L(p.d());
                    Object[] objArr = p.a;
                    int i2 = p.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        y0 y0Var = (y0) objArr[i3];
                        l.k(Ca.x.a(y0Var, this.n.e(y0Var)));
                    }
                    this.n.k();
                    v = l;
                } else {
                    v = w.W.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = v.a;
        int i4 = v.b;
        for (i = 0; i < i4; i++) {
            Ca.q qVar = (Ca.q) objArr2[i];
        }
    }

    public void l(y0 y0Var) {
        cb.n i0;
        synchronized (this.c) {
            this.k.add(y0Var);
            i0 = i0();
        }
        if (i0 != null) {
            s.a aVar = Ca.s.b;
            i0.resumeWith(Ca.s.b(Ca.I.a));
        }
    }

    public void m(Q q) {
        cb.n nVar;
        synchronized (this.c) {
            if (this.i.i(q)) {
                nVar = null;
            } else {
                this.i.b(q);
                nVar = i0();
            }
        }
        if (nVar != null) {
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(Ca.I.a));
        }
    }

    public final long m0() {
        return this.a;
    }

    public x0 n(y0 y0Var) {
        x0 x0Var;
        synchronized (this.c) {
            x0Var = (x0) this.n.u(y0Var);
        }
        return x0Var;
    }

    public final fb.N n0() {
        return this.w;
    }

    public w.e0 o(Q q, C1 c1, w.e0 e0Var) {
        try {
            H0();
            q.n(d0.f.a(e0Var));
            C1 z = q.z(c1);
            try {
                Q A0 = A0(q, null);
                if (A0 != null) {
                    x0(q);
                    A0.o();
                    A0.d();
                }
                w.e0 e0Var2 = (w.Q) this.x.a();
                if (e0Var2 == null) {
                    e0Var2 = w.f0.a();
                }
                return e0Var2;
            } finally {
                q.z(z);
            }
        } finally {
            this.x.b(null);
        }
    }

    public final boolean o0() {
        boolean p0;
        synchronized (this.c) {
            p0 = p0();
        }
        return p0;
    }

    public final boolean p0() {
        return !this.v && this.b.n();
    }

    public final boolean q0() {
        return this.i.m() != 0 || p0() || d0.b.j(this.l);
    }

    public void r(f1 f1Var) {
        w.Q q = (w.Q) this.x.a();
        if (q == null) {
            q = w.f0.b();
            this.x.b(q);
        }
        q.h(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r0() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            w.Q r1 = r2.h     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            d0.c r1 = r2.i     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.m()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.p0()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o1.r0():boolean");
    }

    public void s(Q q) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s0() {
        boolean z;
        synchronized (this.c) {
            z = this.t;
        }
        if (z) {
            Iterator it = this.y.getChildren().iterator();
            while (it.hasNext()) {
                if (((cb.B0) it.next()).isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    public final Object t0(Ga.e eVar) {
        Object t = fb.g.t(n0(), new e(null), eVar);
        return t == Ha.c.f() ? t : Ca.I.a;
    }

    public final List u0() {
        List v0;
        synchronized (this.c) {
            v0 = v0();
        }
        return v0;
    }

    public void v(Q q) {
        synchronized (this.c) {
            L0(q);
            this.i.s(q);
            this.j.remove(q);
            Ca.I i = Ca.I.a;
        }
    }

    public final List v0() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        List list2 = this.f;
        List n = list2.isEmpty() ? Da.v.n() : new ArrayList(list2);
        this.g = n;
        return n;
    }

    public final void w0() {
        synchronized (this.c) {
            this.v = true;
            Ca.I i = Ca.I.a;
        }
    }

    public final void x0(Q q) {
        synchronized (this.c) {
            List list = this.k;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (kotlin.jvm.internal.t.c(((y0) list.get(i)).b(), q)) {
                    Ca.I i2 = Ca.I.a;
                    ArrayList arrayList = new ArrayList();
                    y0(arrayList, this, q);
                    while (!arrayList.isEmpty()) {
                        z0(arrayList, null);
                        y0(arrayList, this, q);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:
    
        if (((Ca.q) r10.get(r4)).d() == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0139, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
    
        if (r9 >= r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
    
        r11 = (Ca.q) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        if (r11.d() != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        r11 = (b0.y0) r11.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        if (r11 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016a, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016c, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016d, code lost:
    
        Da.A.D(r16.k, r3);
        r3 = Ca.I.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0183, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
    
        if (((Ca.q) r11).d() == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0195, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0198, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List z0(java.util.List r17, w.Q r18) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o1.z0(java.util.List, w.Q):java.util.List");
    }

    public void p(Set set) {
    }
}
