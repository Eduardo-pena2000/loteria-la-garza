package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ s0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, s0 s0Var) {
            super(1);
            this.a = pVar;
            this.b = s0Var;
        }

        public final void a(z.h hVar) {
            this.a.invoke(hVar.e(), this.b.b().invoke(hVar.g()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int f;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return m0.c(null, null, 0L, null, this);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.O a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ z.d c;
        public final /* synthetic */ q d;
        public final /* synthetic */ k e;
        public final /* synthetic */ float f;
        public final /* synthetic */ Qa.l g;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ k a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(0);
                this.a = kVar;
            }

            public final void invoke() {
                this.a.r(false);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.O o, Object obj, z.d dVar, q qVar, k kVar, float f, Qa.l lVar) {
            super(1);
            this.a = o;
            this.b = obj;
            this.c = dVar;
            this.d = qVar;
            this.e = kVar;
            this.f = f;
            this.g = lVar;
        }

        public final void a(long j) {
            kotlin.jvm.internal.O o = this.a;
            z.h hVar = new z.h(this.b, this.c.e(), this.d, j, this.c.g(), j, true, new a(this.e));
            m0.a(hVar, j, this.f, this.c, this.e, this.g);
            o.a = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Ca.I.a;
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k kVar) {
            super(0);
            this.a = kVar;
        }

        public final void invoke() {
            this.a.r(false);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.O a;
        public final /* synthetic */ float b;
        public final /* synthetic */ z.d c;
        public final /* synthetic */ k d;
        public final /* synthetic */ Qa.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.jvm.internal.O o, float f, z.d dVar, k kVar, Qa.l lVar) {
            super(1);
            this.a = o;
            this.b = f;
            this.c = dVar;
            this.d = kVar;
            this.e = lVar;
        }

        public final void a(long j) {
            Object obj = this.a.a;
            kotlin.jvm.internal.t.d(obj);
            m0.a((z.h) obj, j, this.b, this.c, this.d, this.e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Ca.I.a;
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Qa.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Qa.l lVar) {
            super(1);
            this.a = lVar;
        }

        public final Object a(long j) {
            return this.a.invoke(Long.valueOf(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    public static final /* synthetic */ void a(z.h hVar, long j, float f2, z.d dVar, k kVar, Qa.l lVar) {
        m(hVar, j, f2, dVar, kVar, lVar);
    }

    public static final Object b(float f2, float f3, float f4, z.i iVar, Qa.p pVar, Ga.e eVar) {
        Object d2 = d(u0.b(kotlin.jvm.internal.m.a), Ia.b.c(f2), Ia.b.c(f3), Ia.b.c(f4), iVar, pVar, eVar);
        return d2 == Ha.c.f() ? d2 : Ca.I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(z.k r25, z.d r26, long r27, Qa.l r29, Ga.e r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m0.c(z.k, z.d, long, Qa.l, Ga.e):java.lang.Object");
    }

    public static final Object d(s0 s0Var, Object obj, Object obj2, Object obj3, z.i iVar, Qa.p pVar, Ga.e eVar) {
        q g2;
        if (obj3 == null || (g2 = (q) s0Var.a().invoke(obj3)) == null) {
            g2 = r.g((q) s0Var.a().invoke(obj));
        }
        Object f2 = f(new k(s0Var, obj, g2, 0L, 0L, false, 56, null), new n0(iVar, s0Var, obj, obj2, g2), 0L, new a(pVar, s0Var), eVar, 2, null);
        return f2 == Ha.c.f() ? f2 : Ca.I.a;
    }

    public static /* synthetic */ Object e(float f2, float f3, float f4, z.i iVar, Qa.p pVar, Ga.e eVar, int i2, Object obj) {
        float f5 = (i2 & 4) != 0 ? 0.0f : f4;
        if ((i2 & 8) != 0) {
            iVar = j.h(0.0f, 0.0f, null, 7, null);
        }
        return b(f2, f3, f5, iVar, pVar, eVar);
    }

    public static /* synthetic */ Object f(k kVar, z.d dVar, long j, Qa.l lVar, Ga.e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            lVar = c.a;
        }
        return c(kVar, dVar, j2, lVar, eVar);
    }

    public static final Object g(k kVar, z zVar, boolean z, Qa.l lVar, Ga.e eVar) {
        Object c2 = c(kVar, new y(zVar, kVar.f(), kVar.getValue(), kVar.h()), z ? kVar.e() : Long.MIN_VALUE, lVar, eVar);
        return c2 == Ha.c.f() ? c2 : Ca.I.a;
    }

    public static /* synthetic */ Object h(k kVar, z zVar, boolean z, Qa.l lVar, Ga.e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            lVar = g.a;
        }
        return g(kVar, zVar, z, lVar, eVar);
    }

    public static final Object i(k kVar, Object obj, z.i iVar, boolean z, Qa.l lVar, Ga.e eVar) {
        Object c2 = c(kVar, new n0(iVar, kVar.f(), kVar.getValue(), obj, kVar.h()), z ? kVar.e() : Long.MIN_VALUE, lVar, eVar);
        return c2 == Ha.c.f() ? c2 : Ca.I.a;
    }

    public static /* synthetic */ Object j(k kVar, Object obj, z.i iVar, boolean z, Qa.l lVar, Ga.e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            iVar = j.h(0.0f, 0.0f, null, 7, null);
        }
        z.i iVar2 = iVar;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            lVar = h.a;
        }
        return i(kVar, obj, iVar2, z2, lVar, eVar);
    }

    public static final Object k(z.d dVar, Qa.l lVar, Ga.e eVar) {
        return dVar.a() ? L.a(lVar, eVar) : b0.v0.c(new i(lVar), eVar);
    }

    public static final void l(z.h hVar, long j, long j2, z.d dVar, k kVar, Qa.l lVar) {
        hVar.j(j);
        hVar.l(dVar.f(j2));
        hVar.m(dVar.b(j2));
        if (dVar.c(j2)) {
            hVar.i(hVar.c());
            hVar.k(false);
        }
        o(hVar, kVar);
        lVar.invoke(hVar);
    }

    public static final void m(z.h hVar, long j, float f2, z.d dVar, k kVar, Qa.l lVar) {
        l(hVar, j, f2 == 0.0f ? dVar.d() : (long) ((j - hVar.d()) / f2), dVar, kVar, lVar);
    }

    public static final float n(Ga.i iVar) {
        o0.k kVar = (o0.k) iVar.get(o0.k.U8);
        float h2 = kVar != null ? kVar.h() : 1.0f;
        if (!(h2 >= 0.0f)) {
            a0.b("negative scale factor");
        }
        return h2;
    }

    public static final void o(z.h hVar, k kVar) {
        kVar.s(hVar.e());
        r.f(kVar.h(), hVar.g());
        kVar.o(hVar.b());
        kVar.p(hVar.c());
        kVar.r(hVar.h());
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }

        public final void a(z.h hVar) {
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }

        public final void a(z.h hVar) {
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.l {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return Ca.I.a;
        }

        public final void a(z.h hVar) {
        }
    }
}
