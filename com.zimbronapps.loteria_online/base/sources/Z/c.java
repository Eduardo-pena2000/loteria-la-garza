package z;

import b0.U1;
import b0.h2;
import b0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final h0 a = j.h(0.0f, 0.0f, null, 7, null);
    public static final h0 b = j.h(0.0f, 0.0f, n1.h.d(I0.a(n1.h.b)), 3, null);
    public static final h0 c = j.h(0.0f, 0.0f, u0.l.c(I0.f(u0.l.b)), 3, null);
    public static final h0 d = j.h(0.0f, 0.0f, u0.f.d(I0.e(u0.f.b)), 3, null);
    public static final h0 e = j.h(0.0f, 0.0f, I0.g(u0.h.e), 3, null);
    public static final h0 f = j.h(0.0f, 0.0f, Integer.valueOf(I0.b(kotlin.jvm.internal.s.a)), 3, null);
    public static final h0 g = j.h(0.0f, 0.0f, n1.n.c(I0.c(n1.n.b)), 3, null);
    public static final h0 h = j.h(0.0f, 0.0f, n1.r.b(I0.d(n1.r.b)), 3, null);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ eb.g a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eb.g gVar, Object obj) {
            super(0);
            this.a = gVar;
            this.b = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            this.a.i(this.b);
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ eb.g d;
        public final /* synthetic */ z.a e;
        public final /* synthetic */ h2 f;
        public final /* synthetic */ h2 g;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ z.a c;
            public final /* synthetic */ h2 d;
            public final /* synthetic */ h2 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, z.a aVar, h2 h2Var, h2 h2Var2, Ga.e eVar) {
                super(2, eVar);
                this.b = obj;
                this.c = aVar;
                this.d = h2Var;
                this.e = h2Var2;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, this.d, this.e, eVar);
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    if (!kotlin.jvm.internal.t.c(this.b, this.c.k())) {
                        z.a aVar = this.c;
                        Object obj2 = this.b;
                        i b = c.b(this.d);
                        this.a = 1;
                        if (z.a.f(aVar, obj2, b, null, null, this, 12, null) == f) {
                            return f;
                        }
                    }
                    return Ca.I.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
                Qa.l a = c.a(this.e);
                if (a != null) {
                    a.invoke(this.c.m());
                }
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eb.g gVar, z.a aVar, h2 h2Var, h2 h2Var2, Ga.e eVar) {
            super(2, eVar);
            this.d = gVar;
            this.e = aVar;
            this.f = h2Var;
            this.g = h2Var2;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = new b(this.d, this.e, this.f, this.g, eVar);
            bVar.c = obj;
            return bVar;
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r13.b
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.a
                eb.i r1 = (eb.i) r1
                java.lang.Object r3 = r13.c
                cb.O r3 = (cb.O) r3
                Ca.t.b(r14)
                r4 = r14
                goto L3d
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                Ca.t.b(r14)
                java.lang.Object r1 = r13.c
                cb.O r1 = (cb.O) r1
                eb.g r3 = r13.d
                eb.i r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L30:
                r13.c = r3
                r13.a = r1
                r13.b = r2
                java.lang.Object r4 = r1.b(r13)
                if (r4 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6f
                java.lang.Object r4 = r1.next()
                eb.g r5 = r13.d
                java.lang.Object r5 = r5.m()
                java.lang.Object r5 = eb.k.f(r5)
                if (r5 != 0) goto L57
                r7 = r4
                goto L58
            L57:
                r7 = r5
            L58:
                z.c$b$a r4 = new z.c$b$a
                z.a r8 = r13.e
                b0.h2 r9 = r13.f
                b0.h2 r10 = r13.g
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                cb.i.d(r5, r6, r7, r8, r9, r10)
                goto L30
            L6f:
                Ca.I r0 = Ca.I.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ Qa.l a(h2 h2Var) {
        return f(h2Var);
    }

    public static final /* synthetic */ i b(h2 h2Var) {
        return g(h2Var);
    }

    public static final h2 c(float f2, i iVar, String str, Qa.l lVar, b0.m mVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            iVar = b;
        }
        i iVar2 = iVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        Qa.l lVar2 = lVar;
        if (b0.w.L()) {
            b0.w.U(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i3 = i << 6;
        h2 e2 = e(n1.h.d(f2), u0.d(n1.h.b), iVar2, null, str2, lVar2, mVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (b0.w.L()) {
            b0.w.T();
        }
        return e2;
    }

    public static final h2 d(float f2, i iVar, float f3, String str, Qa.l lVar, b0.m mVar, int i, int i2) {
        i iVar2;
        i iVar3 = (i2 & 2) != 0 ? a : iVar;
        float f4 = (i2 & 4) != 0 ? 0.01f : f3;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        Qa.l lVar2 = (i2 & 16) != 0 ? null : lVar;
        if (b0.w.L()) {
            b0.w.U(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (iVar3 == a) {
            mVar.V(1125598679);
            boolean z = (((i & 896) ^ 384) > 256 && mVar.c(f4)) || (i & 384) == 256;
            Object C = mVar.C();
            if (z || C == b0.m.a.a()) {
                C = j.h(0.0f, 0.0f, Float.valueOf(f4), 3, null);
                mVar.t(C);
            }
            iVar2 = (h0) C;
            mVar.P();
        } else {
            mVar.V(1125708605);
            mVar.P();
            iVar2 = iVar3;
        }
        int i3 = i << 3;
        h2 e2 = e(Float.valueOf(f2), u0.b(kotlin.jvm.internal.m.a), iVar2, Float.valueOf(f4), str2, lVar2, mVar, (i & 14) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return e2;
    }

    public static final h2 e(Object obj, s0 s0Var, i iVar, Object obj2, String str, Qa.l lVar, b0.m mVar, int i, int i2) {
        i iVar2;
        if ((i2 & 4) != 0) {
            Object C = mVar.C();
            if (C == b0.m.a.a()) {
                C = j.h(0.0f, 0.0f, null, 7, null);
                mVar.t(C);
            }
            iVar2 = (h0) C;
        } else {
            iVar2 = iVar;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        Qa.l lVar2 = (i2 & 32) != 0 ? null : lVar;
        if (b0.w.L()) {
            b0.w.U(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object C2 = mVar.C();
        m.a aVar = b0.m.a;
        if (C2 == aVar.a()) {
            C2 = U1.i(null, null, 2, null);
            mVar.t(C2);
        }
        b0.C0 c0 = (b0.C0) C2;
        Object C3 = mVar.C();
        if (C3 == aVar.a()) {
            C3 = new z.a(obj, s0Var, obj3, str2);
            mVar.t(C3);
        }
        z.a aVar2 = (z.a) C3;
        h2 o = U1.o(lVar2, mVar, (i >> 15) & 14);
        if (obj3 != null && (iVar2 instanceof h0)) {
            h0 h0Var = (h0) iVar2;
            if (!kotlin.jvm.internal.t.c(h0Var.h(), obj3)) {
                iVar2 = j.g(h0Var.f(), h0Var.g(), obj3);
            }
        }
        h2 o2 = U1.o(iVar2, mVar, 0);
        Object C4 = mVar.C();
        if (C4 == aVar.a()) {
            C4 = eb.j.b(-1, (eb.a) null, (Qa.l) null, 6, (Object) null);
            mVar.t(C4);
        }
        eb.g gVar = (eb.g) C4;
        boolean E = ((((i & 14) ^ 6) > 4 && mVar.E(obj)) || (i & 6) == 4) | mVar.E(gVar);
        Object C5 = mVar.C();
        if (E || C5 == aVar.a()) {
            C5 = new a(gVar, obj);
            mVar.t(C5);
        }
        b0.b0.g((Qa.a) C5, mVar, 0);
        boolean E2 = mVar.E(gVar) | mVar.E(aVar2) | mVar.U(o2) | mVar.U(o);
        Object C6 = mVar.C();
        if (E2 || C6 == aVar.a()) {
            C6 = new b(gVar, aVar2, o2, o, null);
            mVar.t(C6);
        }
        b0.b0.d(gVar, (Qa.p) C6, mVar, 0);
        h2 h2Var = (h2) c0.getValue();
        if (h2Var == null) {
            h2Var = aVar2.g();
        }
        if (b0.w.L()) {
            b0.w.T();
        }
        return h2Var;
    }

    public static final Qa.l f(h2 h2Var) {
        return (Qa.l) h2Var.getValue();
    }

    public static final i g(h2 h2Var) {
        return (i) h2Var.getValue();
    }
}
