package b3;

import M2.q;
import P2.F;
import T2.X0;
import T2.n;
import T2.u0;
import android.graphics.Bitmap;
import b3.c;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends n {
    public int A;
    public q B;
    public c C;
    public S2.f D;
    public e E;
    public Bitmap F;
    public boolean G;
    public b H;
    public b I;
    public int J;
    public final c.a r;
    public final S2.f s;
    public final ArrayDeque t;
    public boolean u;
    public boolean v;
    public a w;
    public long x;
    public long y;
    public int z;

    public static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public Bitmap b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.c != null;
        }

        public void e(Bitmap bitmap) {
            this.c = bitmap;
        }
    }

    public g(c.a aVar, e eVar) {
        super(4);
        this.r = aVar;
        this.E = t0(eVar);
        this.s = S2.f.s();
        this.w = a.c;
        this.t = new ArrayDeque();
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = 0;
        this.A = 1;
    }

    public static e t0(e eVar) {
        return eVar == null ? e.a : eVar;
    }

    private void y0(long j) {
        this.x = j;
        while (!this.t.isEmpty() && j >= ((a) this.t.peek()).a) {
            this.w = (a) this.t.removeFirst();
        }
    }

    public final void A0() {
        this.D = null;
        this.z = 0;
        this.y = -9223372036854775807L;
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
            this.C = null;
        }
    }

    public final void B0(e eVar) {
        this.E = t0(eVar);
    }

    public final boolean C0() {
        boolean z = getState() == 2;
        int i = this.A;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    public int a(q qVar) {
        return this.r.a(qVar);
    }

    public boolean b() {
        return this.v;
    }

    public void b0() {
        this.B = null;
        this.w = a.c;
        this.t.clear();
        A0();
        this.E.a();
    }

    public void c0(boolean z, boolean z2) {
        this.A = z2 ? 1 : 0;
    }

    public void e0(long j, boolean z) {
        w0(1);
        this.v = false;
        this.u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        c cVar = this.C;
        if (cVar != null) {
            cVar.flush();
        }
        this.t.clear();
    }

    public void f0() {
        A0();
    }

    public String getName() {
        return "ImageRenderer";
    }

    public void h(long j, long j2) {
        if (this.v) {
            return;
        }
        if (this.B == null) {
            u0 V = V();
            this.s.f();
            int m0 = m0(V, this.s, 2);
            if (m0 != -5) {
                if (m0 == -4) {
                    P2.a.f(this.s.i());
                    this.u = true;
                    this.v = true;
                    return;
                }
                return;
            }
            this.B = (q) P2.a.h(V.b);
            u0();
        }
        try {
            F.a("drainAndFeedDecoder");
            while (r0(j, j2)) {
            }
            while (s0(j)) {
            }
            F.b();
        } catch (d e) {
            throw R(e, null, 4003);
        }
    }

    public void h0() {
        A0();
        w0(1);
    }

    public boolean isReady() {
        int i = this.A;
        return i == 3 || (i == 0 && this.G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k0(M2.q[] r5, long r6, long r8, g3.w.b r10) {
        /*
            r4 = this;
            super.k0(r5, r6, r8, r10)
            b3.g$a r5 = r4.w
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque r5 = r4.t
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.y
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.x
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque r5 = r4.t
            b3.g$a r6 = new b3.g$a
            long r0 = r4.y
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            b3.g$a r5 = new b3.g$a
            r5.<init>(r0, r8)
            r4.w = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.g.k0(M2.q[], long, long, g3.w$b):void");
    }

    public final boolean p0(q qVar) {
        int a2 = this.r.a(qVar);
        return a2 == X0.t(4) || a2 == X0.t(3);
    }

    public final Bitmap q0(int i) {
        P2.a.h(this.F);
        int width = this.F.getWidth() / ((q) P2.a.h(this.B)).I;
        int height = this.F.getHeight() / ((q) P2.a.h(this.B)).J;
        int i2 = this.B.I;
        return Bitmap.createBitmap(this.F, (i % i2) * width, (i / i2) * height, width, height);
    }

    public final boolean r0(long j, long j2) {
        if (this.F != null && this.H == null) {
            return false;
        }
        if (this.A == 0 && getState() != 2) {
            return false;
        }
        if (this.F == null) {
            P2.a.h(this.C);
            f a2 = this.C.a();
            if (a2 == null) {
                return false;
            }
            if (((f) P2.a.h(a2)).i()) {
                if (this.z == 3) {
                    A0();
                    P2.a.h(this.B);
                    u0();
                } else {
                    ((f) P2.a.h(a2)).o();
                    if (this.t.isEmpty()) {
                        this.v = true;
                    }
                }
                return false;
            }
            P2.a.i(a2.e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.F = a2.e;
            ((f) P2.a.h(a2)).o();
        }
        if (!this.G || this.F == null || this.H == null) {
            return false;
        }
        P2.a.h(this.B);
        q qVar = this.B;
        int i = qVar.I;
        boolean z = ((i == 1 && qVar.J == 1) || i == -1 || qVar.J == -1) ? false : true;
        if (!this.H.d()) {
            b bVar = this.H;
            bVar.e(z ? q0(bVar.c()) : (Bitmap) P2.a.h(this.F));
        }
        if (!z0(j, j2, (Bitmap) P2.a.h(this.H.b()), this.H.a())) {
            return false;
        }
        y0(((b) P2.a.h(this.H)).a());
        this.A = 3;
        if (!z || ((b) P2.a.h(this.H)).c() == (((q) P2.a.h(this.B)).J * ((q) P2.a.h(this.B)).I) - 1) {
            this.F = null;
        }
        this.H = this.I;
        this.I = null;
        return true;
    }

    public final boolean s0(long j) {
        if (this.G && this.H != null) {
            return false;
        }
        u0 V = V();
        c cVar = this.C;
        if (cVar == null || this.z == 3 || this.u) {
            return false;
        }
        if (this.D == null) {
            S2.f fVar = (S2.f) cVar.e();
            this.D = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.z == 2) {
            P2.a.h(this.D);
            this.D.n(4);
            ((c) P2.a.h(this.C)).f(this.D);
            this.D = null;
            this.z = 3;
            return false;
        }
        int m0 = m0(V, this.D, 0);
        if (m0 == -5) {
            this.B = (q) P2.a.h(V.b);
            this.z = 2;
            return true;
        }
        if (m0 != -4) {
            if (m0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.D.q();
        boolean z = ((ByteBuffer) P2.a.h(this.D.d)).remaining() > 0 || ((S2.f) P2.a.h(this.D)).i();
        if (z) {
            ((c) P2.a.h(this.C)).f((S2.f) P2.a.h(this.D));
            this.J = 0;
        }
        x0(j, (S2.f) P2.a.h(this.D));
        if (((S2.f) P2.a.h(this.D)).i()) {
            this.u = true;
            this.D = null;
            return false;
        }
        this.y = Math.max(this.y, ((S2.f) P2.a.h(this.D)).f);
        if (z) {
            this.D = null;
        } else {
            ((S2.f) P2.a.h(this.D)).f();
        }
        return !this.G;
    }

    public final void u0() {
        if (!p0(this.B)) {
            throw R(new d("Provided decoder factory can't create decoder for format."), this.B, 4005);
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
        }
        this.C = this.r.b();
    }

    public void v(int i, Object obj) {
        if (i != 15) {
            super.v(i, obj);
        } else {
            B0(obj instanceof e ? (e) obj : null);
        }
    }

    public final boolean v0(b bVar) {
        return ((q) P2.a.h(this.B)).I == -1 || this.B.J == -1 || bVar.c() == (((q) P2.a.h(this.B)).J * this.B.I) - 1;
    }

    public final void w0(int i) {
        this.A = Math.min(this.A, i);
    }

    public final void x0(long j, S2.f fVar) {
        boolean z = true;
        if (fVar.i()) {
            this.G = true;
            return;
        }
        b bVar = new b(this.J, fVar.f);
        this.I = bVar;
        this.J++;
        if (!this.G) {
            long a2 = bVar.a();
            boolean z2 = a2 - 30000 <= j && j <= 30000 + a2;
            b bVar2 = this.H;
            boolean z3 = bVar2 != null && bVar2.a() <= j && j < a2;
            boolean v0 = v0((b) P2.a.h(this.I));
            if (!z2 && !z3 && !v0) {
                z = false;
            }
            this.G = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.H = this.I;
        this.I = null;
    }

    public boolean z0(long j, long j2, Bitmap bitmap, long j3) {
        long j4 = j3 - j;
        if (!C0() && j4 >= 30000) {
            return false;
        }
        this.E.b(j3 - this.w.b, bitmap);
        return true;
    }
}
