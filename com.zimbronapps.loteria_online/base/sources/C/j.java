package C;

import Ca.I;
import I0.L;
import I0.Q;
import P0.r1;
import java.util.List;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final float a;
    public static final float b;
    public static final float c;

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return j.b(null, 0L, this);
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
            return j.c(null, 0L, this);
        }
    }

    public static final class c extends Ia.k implements Qa.p {
        public Object a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ O e;
        public final /* synthetic */ O f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O o, O o2, Ga.e eVar) {
            super(2, eVar);
            this.e = o;
            this.f = o2;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.e, this.f, eVar);
            cVar.d = obj;
            return cVar;
        }

        public final Object invoke(I0.b bVar, Ga.e eVar) {
            return create(bVar, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00cd A[EDGE_INSN: B:67:0x00cd->B:13:0x00cd BREAK  A[LOOP:0: B:7:0x00ba->B:10:0x00ca], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ac -> B:6:0x00af). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: C.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Qa.l lVar) {
            super(3);
            this.a = lVar;
        }

        public final void a(I0.C c, I0.C c2, long j) {
            this.a.invoke(u0.f.d(c2.h()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((I0.C) obj, (I0.C) obj2, ((u0.f) obj3).u());
            return I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Qa.a aVar) {
            super(1);
            this.a = aVar;
        }

        public final void a(I0.C c) {
            this.a.invoke();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I0.C) obj);
            return I.a;
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.a {
        public static final f a = new f();

        public f() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class g extends Ia.k implements Qa.p {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public boolean g;
        public float h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ Qa.a k;
        public final /* synthetic */ N l;
        public final /* synthetic */ q m;
        public final /* synthetic */ Qa.q n;
        public final /* synthetic */ Qa.p o;
        public final /* synthetic */ Qa.a p;
        public final /* synthetic */ Qa.l q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Qa.a aVar, N n, q qVar, Qa.q qVar2, Qa.p pVar, Qa.a aVar2, Qa.l lVar, Ga.e eVar) {
            super(2, eVar);
            this.k = aVar;
            this.l = n;
            this.m = qVar;
            this.n = qVar2;
            this.o = pVar;
            this.p = aVar2;
            this.q = lVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            g gVar = new g(this.k, this.l, this.m, this.n, this.o, this.p, this.q, eVar);
            gVar.j = obj;
            return gVar;
        }

        public final Object invoke(I0.b bVar, Ga.e eVar) {
            return create(bVar, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x0253, code lost:
        
            if (C.j.a(r2.H0(), r0) != false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x0108, code lost:
        
            if (r17 == false) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x02ff, code lost:
        
            if (((r2 != null ? r2 == C.q.a ? u0.f.n(r5) : u0.f.m(r5) : u0.f.k(r5)) == 0.0f) == false) goto L128;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:38:0x02b3, B:51:0x02df], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:90:0x0188, B:92:0x018d], limit reached: 144 */
        /* JADX WARN: Path cross not found for [B:94:0x0194, B:90:0x0188], limit reached: 144 */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x028a  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x017e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0345  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0326  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x027c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0151 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x019a  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v4, types: [I0.s, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0208 -> B:64:0x020b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x027a -> B:9:0x027d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0120 -> B:67:0x0213). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 841
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: C.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public h(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return j.f(null, 0L, null, this);
        }
    }

    static {
        float g2 = n1.h.g((float) 0.125d);
        a = g2;
        float g3 = n1.h.g(18);
        b = g3;
        c = g2 / g3;
    }

    public static final /* synthetic */ boolean a(I0.q qVar, long j) {
        return g(qVar, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (I0.r.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(I0.b r17, long r18, Ga.e r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.j.b(I0.b, long, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(I0.b r9, long r10, Ga.e r12) {
        /*
            boolean r0 = r12 instanceof C.j.b
            if (r0 == 0) goto L13
            r0 = r12
            C.j$b r0 = (C.j.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            C.j$b r0 = new C.j$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.b
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r10 = r0.a
            I0.C r10 = (I0.C) r10
            Ca.t.b(r12)     // Catch: I0.t -> L9b
            goto La4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            Ca.t.b(r12)
            I0.q r12 = r9.H0()
            boolean r12 = g(r12, r10)
            if (r12 == 0) goto L49
            return r4
        L49:
            I0.q r12 = r9.H0()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L56:
            if (r5 >= r2) goto L6d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            I0.C r7 = (I0.C) r7
            long r7 = r7.f()
            boolean r7 = I0.B.d(r7, r10)
            if (r7 == 0) goto L6a
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L56
        L6d:
            r6 = r4
        L6e:
            r10 = r6
            I0.C r10 = (I0.C) r10
            if (r10 != 0) goto L74
            return r4
        L74:
            kotlin.jvm.internal.O r11 = new kotlin.jvm.internal.O
            r11.<init>()
            kotlin.jvm.internal.O r12 = new kotlin.jvm.internal.O
            r12.<init>()
            r12.a = r10
            P0.r1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            C.j$c r2 = new C.j$c     // Catch: I0.t -> L9a
            r2.<init>(r12, r11, r4)     // Catch: I0.t -> L9a
            r0.a = r10     // Catch: I0.t -> L9a
            r0.b = r11     // Catch: I0.t -> L9a
            r0.d = r3     // Catch: I0.t -> L9a
            java.lang.Object r9 = r9.O(r5, r2, r0)     // Catch: I0.t -> L9a
            if (r9 != r1) goto La4
            return r1
        L9a:
            r9 = r11
        L9b:
            java.lang.Object r9 = r9.a
            I0.C r9 = (I0.C) r9
            if (r9 != 0) goto La3
            r4 = r10
            goto La4
        La3:
            r4 = r9
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C.j.c(I0.b, long, Ga.e):java.lang.Object");
    }

    public static final Object d(L l, Qa.l lVar, Qa.a aVar, Qa.a aVar2, Qa.p pVar, Ga.e eVar) {
        Object e2 = e(l, new d(lVar), new e(aVar), aVar2, f.a, null, pVar, eVar);
        return e2 == Ha.c.f() ? e2 : I.a;
    }

    public static final Object e(L l, Qa.q qVar, Qa.l lVar, Qa.a aVar, Qa.a aVar2, q qVar2, Qa.p pVar, Ga.e eVar) {
        Object c2 = o.c(l, new g(aVar2, new N(), qVar2, qVar, pVar, aVar, lVar, null), eVar);
        return c2 == Ha.c.f() ? c2 : I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(I0.b r4, long r5, Qa.l r7, Ga.e r8) {
        /*
            boolean r0 = r8 instanceof C.j.h
            if (r0 == 0) goto L13
            r0 = r8
            C.j$h r0 = (C.j.h) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            C.j$h r0 = new C.j$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.b
            Qa.l r4 = (Qa.l) r4
            java.lang.Object r5 = r0.a
            I0.b r5 = (I0.b) r5
            Ca.t.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Ca.t.b(r8)
        L3e:
            r0.a = r4
            r0.b = r7
            r0.d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            I0.C r8 = (I0.C) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = Ia.b.a(r4)
            return r4
        L55:
            boolean r5 = I0.r.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = Ia.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: C.j.f(I0.b, long, Qa.l, Ga.e):java.lang.Object");
    }

    public static final boolean g(I0.q qVar, long j) {
        Object obj;
        List c2 = qVar.c();
        int size = c2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = c2.get(i);
            if (I0.B.d(((I0.C) obj).f(), j)) {
                break;
            }
            i++;
        }
        I0.C c3 = (I0.C) obj;
        if (c3 != null && c3.i()) {
            z = true;
        }
        return true ^ z;
    }

    public static final float h(r1 r1Var, int i) {
        return Q.g(i, Q.a.b()) ? r1Var.g() * c : r1Var.g();
    }
}
