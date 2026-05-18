package x0;

import n1.n;
import n1.r;
import n1.t;
import u0.l;
import u0.m;
import v0.X0;
import v0.b1;
import v0.h0;
import v0.m1;
import v0.n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface f extends n1.d {
    public static final a a9 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final int b = androidx.compose.ui.graphics.c.b.B();
        public static final int c = X0.a.a();

        public final int a() {
            return b;
        }

        public final int b() {
            return c;
        }
    }

    static /* synthetic */ void C1(f fVar, long j, float f, float f2, boolean z, long j2, long j3, float f3, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long c = (i2 & 16) != 0 ? u0.f.b.c() : j2;
        fVar.b1(j, f, f2, z, c, (i2 & 32) != 0 ? fVar.c1(fVar.e(), c) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? j.a : gVar, (i2 & 256) != 0 ? null : dVar, (i2 & 512) != 0 ? a9.a() : i);
    }

    static /* synthetic */ void G0(f fVar, h0 h0Var, long j, long j2, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long c = (i2 & 2) != 0 ? u0.f.b.c() : j;
        fVar.Y0(h0Var, c, (i2 & 4) != 0 ? fVar.c1(fVar.e(), c) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? j.a : gVar, (i2 & 32) != 0 ? null : dVar, (i2 & 64) != 0 ? a9.a() : i);
    }

    static /* synthetic */ void I(f fVar, long j, float f, long j2, float f2, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        fVar.e0(j, (i2 & 2) != 0 ? l.h(fVar.e()) / 2.0f : f, (i2 & 4) != 0 ? fVar.u1() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? j.a : gVar, (i2 & 32) != 0 ? null : dVar, (i2 & 64) != 0 ? a9.a() : i);
    }

    static /* synthetic */ void L(f fVar, long j, long j2, long j3, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fVar.p1(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? k.e.a() : i, (i3 & 32) != 0 ? null : n1Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : dVar, (i3 & 256) != 0 ? a9.a() : i2);
    }

    static /* synthetic */ void Q(f fVar, b1 b1Var, long j, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        fVar.f1(b1Var, (i2 & 2) != 0 ? u0.f.b.c() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? j.a : gVar, (i2 & 16) != 0 ? null : dVar, (i2 & 32) != 0 ? a9.a() : i);
    }

    static /* synthetic */ void d0(f fVar, m1 m1Var, h0 h0Var, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            gVar = j.a;
        }
        g gVar2 = gVar;
        if ((i2 & 16) != 0) {
            dVar = null;
        }
        androidx.compose.ui.graphics.d dVar2 = dVar;
        if ((i2 & 32) != 0) {
            i = a9.a();
        }
        fVar.o1(m1Var, h0Var, f2, gVar2, dVar2, i);
    }

    static /* synthetic */ void k1(f fVar, b1 b1Var, long j, long j2, long j3, long j4, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long b = (i3 & 2) != 0 ? n.b.b() : j;
        long c = (i3 & 4) != 0 ? r.c((b1Var.getHeight() & 4294967295L) | (b1Var.getWidth() << 32)) : j2;
        fVar.z1(b1Var, b, c, (i3 & 8) != 0 ? n.b.b() : j3, (i3 & 16) != 0 ? c : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? j.a : gVar, (i3 & 128) != 0 ? null : dVar, (i3 & 256) != 0 ? a9.a() : i, (i3 & 512) != 0 ? a9.b() : i2);
    }

    static /* synthetic */ void s1(f fVar, long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long c = (i2 & 2) != 0 ? u0.f.b.c() : j2;
        fVar.i0(j, c, (i2 & 4) != 0 ? fVar.c1(fVar.e(), c) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? j.a : gVar, (i2 & 32) != 0 ? null : dVar, (i2 & 64) != 0 ? a9.a() : i);
    }

    static /* synthetic */ void t1(f fVar, h0 h0Var, long j, long j2, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        fVar.l1(h0Var, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? k.e.a() : i, (i3 & 32) != 0 ? null : n1Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : dVar, (i3 & 256) != 0 ? a9.a() : i2);
    }

    static /* synthetic */ void u0(f fVar, h0 h0Var, long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long c = (i2 & 2) != 0 ? u0.f.b.c() : j;
        fVar.k0(h0Var, c, (i2 & 4) != 0 ? fVar.c1(fVar.e(), c) : j2, (i2 & 8) != 0 ? u0.a.a.a() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? j.a : gVar, (i2 & 64) != 0 ? null : dVar, (i2 & 128) != 0 ? a9.a() : i);
    }

    void D1(m1 m1Var, long j, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void Y0(h0 h0Var, long j, long j2, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void b1(long j, float f, float f2, boolean z, long j2, long j3, float f3, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    default long c1(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return l.d((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    default long e() {
        return m1().e();
    }

    void e0(long j, float f, long j2, float f2, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void f1(b1 b1Var, long j, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    t getLayoutDirection();

    void i0(long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void k0(h0 h0Var, long j, long j2, long j3, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void l1(h0 h0Var, long j, long j2, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2);

    d m1();

    void o1(m1 m1Var, h0 h0Var, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i);

    void p1(long j, long j2, long j3, float f, int i, n1 n1Var, float f2, androidx.compose.ui.graphics.d dVar, int i2);

    void r1(long j, long j2, long j3, long j4, g gVar, float f, androidx.compose.ui.graphics.d dVar, int i);

    default long u1() {
        return m.b(m1().e());
    }

    void z1(b1 b1Var, long j, long j2, long j3, long j4, float f, g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2);
}
