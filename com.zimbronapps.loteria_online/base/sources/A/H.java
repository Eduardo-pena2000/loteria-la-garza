package A;

import v0.E1;
import v0.b1;
import v0.i1;
import v0.m1;
import v0.q0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends O0.m {
    public f c;
    public float d;
    public v0.h0 e;
    public E1 f;
    public final s0.e g;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ i1.a a;
        public final /* synthetic */ v0.h0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1.a aVar, v0.h0 h0Var) {
            super(1);
            this.a = aVar;
            this.b = h0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            cVar.B1();
            x0.f.d0(cVar, this.a.b(), this.b, 0.0f, null, null, 0, 60, null);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ u0.h a;
        public final /* synthetic */ kotlin.jvm.internal.O b;
        public final /* synthetic */ long c;
        public final /* synthetic */ androidx.compose.ui.graphics.d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u0.h hVar, kotlin.jvm.internal.O o, long j, androidx.compose.ui.graphics.d dVar) {
            super(1);
            this.a = hVar;
            this.b = o;
            this.c = j;
            this.d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            cVar.B1();
            float i = this.a.i();
            float l = this.a.l();
            kotlin.jvm.internal.O o = this.b;
            long j = this.c;
            androidx.compose.ui.graphics.d dVar = this.d;
            cVar.m1().d().d(i, l);
            try {
                x0.f.k1(cVar, (b1) o.a, 0L, j, 0L, 0L, 0.0f, null, dVar, 0, 0, 890, null);
            } finally {
                cVar.m1().d().d(-i, -l);
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ v0.h0 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ x0.k h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, v0.h0 h0Var, long j, float f, float f2, long j2, long j3, x0.k kVar) {
            super(1);
            this.a = z;
            this.b = h0Var;
            this.c = j;
            this.d = f;
            this.e = f2;
            this.f = j2;
            this.g = j3;
            this.h = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            long j;
            cVar.B1();
            if (this.a) {
                x0.f.u0(cVar, this.b, 0L, 0L, this.c, 0.0f, null, null, 0, 246, null);
                return;
            }
            float d = u0.a.d(this.c);
            float f = this.d;
            if (d >= f) {
                x0.f.u0(cVar, this.b, this.f, this.g, g.d(this.c, f), 0.0f, this.h, null, 0, 208, null);
                return;
            }
            float f2 = this.e;
            float i = u0.l.i(cVar.e()) - this.e;
            float g = u0.l.g(cVar.e()) - this.e;
            int a = q0.a.a();
            v0.h0 h0Var = this.b;
            long j2 = this.c;
            x0.d m1 = cVar.m1();
            long e = m1.e();
            m1.f().s();
            try {
                m1.d().c(f2, f2, i, g, a);
                j = e;
                try {
                    x0.f.u0(cVar, h0Var, 0L, 0L, j2, 0.0f, null, null, 0, 246, null);
                    m1.f().k();
                    m1.g(j);
                } catch (Throwable th) {
                    th = th;
                    m1.f().k();
                    m1.g(j);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = e;
            }
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ m1 a;
        public final /* synthetic */ v0.h0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m1 m1Var, v0.h0 h0Var) {
            super(1);
            this.a = m1Var;
            this.b = h0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            cVar.B1();
            x0.f.d0(cVar, this.a, this.b, 0.0f, null, null, 0, 60, null);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public e() {
            super(1);
        }

        public final s0.k invoke(s0.g gVar) {
            if (gVar.j1(h.this.Q1()) < 0.0f || u0.l.h(gVar.e()) <= 0.0f) {
                return g.b(gVar);
            }
            float f = 2;
            float min = Math.min(n1.h.i(h.this.Q1(), n1.h.b.a()) ? 1.0f : (float) Math.ceil(gVar.j1(h.this.Q1())), (float) Math.ceil(u0.l.h(gVar.e()) / f));
            float f2 = min / f;
            long a = u0.g.a(f2, f2);
            long a2 = u0.m.a(u0.l.i(gVar.e()) - min, u0.l.g(gVar.e()) - min);
            boolean z = f * min > u0.l.h(gVar.e());
            i1 i1Var = h.this.P1().createOutline-Pq9zytI(gVar.e(), gVar.getLayoutDirection(), gVar);
            if (i1Var instanceof i1.a) {
                h hVar = h.this;
                return h.K1(hVar, gVar, hVar.O1(), (i1.a) i1Var, z, min);
            }
            if (i1Var instanceof i1.c) {
                h hVar2 = h.this;
                return h.L1(hVar2, gVar, hVar2.O1(), (i1.c) i1Var, a, a2, z, min);
            }
            if (i1Var instanceof i1.b) {
                return g.c(gVar, h.this.O1(), a, a2, z, min);
            }
            throw new Ca.o();
        }
    }

    public /* synthetic */ h(float f, v0.h0 h0Var, E1 e1, kotlin.jvm.internal.k kVar) {
        this(f, h0Var, e1);
    }

    public static final /* synthetic */ s0.k K1(h hVar, s0.g gVar, v0.h0 h0Var, i1.a aVar, boolean z, float f) {
        return hVar.M1(gVar, h0Var, aVar, z, f);
    }

    public static final /* synthetic */ s0.k L1(h hVar, s0.g gVar, v0.h0 h0Var, i1.c cVar, long j, long j2, boolean z, float f) {
        return hVar.N1(gVar, h0Var, cVar, j, j2, z, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s0.k M1(s0.g r48, v0.h0 r49, v0.i1.a r50, boolean r51, float r52) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.M1(s0.g, v0.h0, v0.i1$a, boolean, float):s0.k");
    }

    public final s0.k N1(s0.g gVar, v0.h0 h0Var, i1.c cVar, long j, long j2, boolean z, float f) {
        if (u0.k.e(cVar.b())) {
            return gVar.p(new c(z, h0Var, cVar.b().h(), f / 2, f, j, j2, new x0.k(f, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.c == null) {
            this.c = new f(null, null, null, null, 15, null);
        }
        f fVar = this.c;
        kotlin.jvm.internal.t.d(fVar);
        return gVar.p(new d(g.a(fVar.g(), cVar.b(), f, z), h0Var));
    }

    public final v0.h0 O1() {
        return this.e;
    }

    public final E1 P1() {
        return this.f;
    }

    public final float Q1() {
        return this.d;
    }

    public final void R1(v0.h0 h0Var) {
        if (kotlin.jvm.internal.t.c(this.e, h0Var)) {
            return;
        }
        this.e = h0Var;
        this.g.L0();
    }

    public final void S1(float f) {
        if (n1.h.i(this.d, f)) {
            return;
        }
        this.d = f;
        this.g.L0();
    }

    public final void i1(E1 e1) {
        if (kotlin.jvm.internal.t.c(this.f, e1)) {
            return;
        }
        this.f = e1;
        this.g.L0();
    }

    public h(float f, v0.h0 h0Var, E1 e1) {
        this.d = f;
        this.e = h0Var;
        this.f = e1;
        this.g = (s0.e) E1(androidx.compose.ui.draw.a.a(new e()));
    }
}
