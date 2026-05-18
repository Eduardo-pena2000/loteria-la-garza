package m3;

import M2.N;
import P2.K;
import T2.X0;
import T2.u0;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import c3.F;
import c3.j;
import java.nio.ByteBuffer;
import java.util.List;
import m3.C;
import m3.D;
import m3.d;
import m3.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class k extends c3.t implements o.b {
    public static final int[] o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean p1;
    public static boolean q1;
    public final Context H0;
    public final E I0;
    public final boolean J0;
    public final C.a K0;
    public final int L0;
    public final boolean M0;
    public final o N0;
    public final o.a O0;
    public c P0;
    public boolean Q0;
    public boolean R0;
    public D S0;
    public boolean T0;
    public List U0;
    public Surface V0;
    public m W0;
    public P2.A X0;
    public boolean Y0;
    public int Z0;
    public long a1;
    public int b1;
    public int c1;
    public int d1;
    public long e1;
    public int f1;
    public long g1;
    public N h1;
    public N i1;
    public int j1;
    public boolean k1;
    public int l1;
    public d m1;
    public n n1;

    public static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !l.a(display)) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public final class d implements j.d, Handler.Callback {
        public final Handler a;

        public d(c3.j jVar) {
            Handler B = K.B(this);
            this.a = B;
            jVar.i(this, B);
        }

        public void a(c3.j jVar, long j, long j2) {
            if (K.a >= 30) {
                b(j);
            } else {
                this.a.sendMessageAtFrontOfQueue(Message.obtain(this.a, 0, (int) (j >> 32), (int) j));
            }
        }

        public final void b(long j) {
            k kVar = k.this;
            if (this != kVar.m1 || k.a2(kVar) == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                k.b2(k.this);
                return;
            }
            try {
                k.this.D2(j);
            } catch (T2.u e) {
                k.c2(k.this, e);
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(K.h1(message.arg1, message.arg2));
            return true;
        }
    }

    public k(Context context, j.b bVar, c3.w wVar, long j, boolean z, Handler handler, C c2, int i) {
        this(context, bVar, wVar, j, z, handler, c2, i, 30.0f);
    }

    public static void K2(c3.j jVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        jVar.c(bundle);
    }

    private void U2() {
        c3.j N0 = N0();
        if (N0 != null && K.a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.j1));
            N0.c(bundle);
        }
    }

    public static /* synthetic */ Surface Y1(k kVar) {
        return kVar.V0;
    }

    public static /* synthetic */ void Z1(k kVar) {
        kVar.C2();
    }

    public static /* synthetic */ c3.j a2(k kVar) {
        return kVar.N0();
    }

    public static /* synthetic */ void b2(k kVar) {
        kVar.E2();
    }

    public static /* synthetic */ void c2(k kVar, T2.u uVar) {
        kVar.N1(uVar);
    }

    public static boolean d2() {
        return K.a >= 21;
    }

    public static void f2(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean g2() {
        return "NVIDIA".equals(K.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i2() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k.i2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k2(c3.m r10, M2.q r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.k.k2(c3.m, M2.q):int");
    }

    public static Point l2(c3.m mVar, M2.q qVar) {
        int i = qVar.u;
        int i2 = qVar.t;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : o1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (K.a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b2 = mVar.b(i6, i4);
                float f2 = qVar.v;
                if (b2 != null && mVar.u(b2.x, b2.y, f2)) {
                    return b2;
                }
            } else {
                try {
                    int k = K.k(i4, 16) * 16;
                    int k2 = K.k(i5, 16) * 16;
                    if (k * k2 <= F.P()) {
                        int i7 = z ? k2 : k;
                        if (!z) {
                            k = k2;
                        }
                        return new Point(i7, k);
                    }
                } catch (F.c unused) {
                }
            }
        }
        return null;
    }

    public static List n2(Context context, c3.w wVar, M2.q qVar, boolean z, boolean z2) {
        String str = qVar.n;
        if (str == null) {
            return t7.r.s();
        }
        if (K.a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            List n = F.n(wVar, qVar, z, z2);
            if (!n.isEmpty()) {
                return n;
            }
        }
        return F.v(wVar, qVar, z, z2);
    }

    public static int o2(c3.m mVar, M2.q qVar) {
        if (qVar.o == -1) {
            return k2(mVar, qVar);
        }
        int size = qVar.q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) qVar.q.get(i2)).length;
        }
        return qVar.o + i;
    }

    public static int p2(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    public boolean A1(long j, long j2, c3.j jVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, M2.q qVar) {
        P2.a.e(jVar);
        long X0 = j3 - X0();
        int c2 = this.N0.c(j3, j, j2, Y0(), z2, this.O0);
        if (c2 == 4) {
            return false;
        }
        if (z && !z2) {
            T2(jVar, i, X0);
            return true;
        }
        if (this.V0 == this.W0 && this.S0 == null) {
            if (this.O0.f() >= 30000) {
                return false;
            }
            T2(jVar, i, X0);
            W2(this.O0.f());
            return true;
        }
        D d2 = this.S0;
        if (d2 != null) {
            try {
                d2.h(j, j2);
                long a2 = this.S0.a(j3 + j2(), z2);
                if (a2 == -9223372036854775807L) {
                    return false;
                }
                I2(jVar, i, X0, a2);
                return true;
            } catch (D.b e) {
                throw R(e, e.a, 7001);
            }
        }
        if (c2 == 0) {
            long nanoTime = T().nanoTime();
            B2(X0, nanoTime, qVar);
            I2(jVar, i, X0, nanoTime);
            W2(this.O0.f());
            return true;
        }
        if (c2 == 1) {
            return w2((c3.j) P2.a.h(jVar), i, X0, qVar);
        }
        if (c2 == 2) {
            h2(jVar, i, X0);
            W2(this.O0.f());
            return true;
        }
        if (c2 != 3) {
            if (c2 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(c2));
        }
        T2(jVar, i, X0);
        W2(this.O0.f());
        return true;
    }

    public final void A2() {
        int i;
        c3.j N0;
        if (!this.k1 || (i = K.a) < 23 || (N0 = N0()) == null) {
            return;
        }
        this.m1 = new d(N0);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            N0.c(bundle);
        }
    }

    public boolean B(long j, long j2, long j3, boolean z, boolean z2) {
        return O2(j, j3, z) && r2(j2, z2);
    }

    public c3.l B0(Throwable th, c3.m mVar) {
        return new j(th, mVar, this.V0);
    }

    public final void B2(long j, long j2, M2.q qVar) {
        n nVar = this.n1;
        if (nVar != null) {
            nVar.a(j, j2, qVar, S0());
        }
    }

    public final void C2() {
        this.K0.A(this.V0);
        this.Y0 = true;
    }

    public void D2(long j) {
        X1(j);
        v2(this.h1);
        this.C0.e++;
        t2();
        v1(j);
    }

    public final void E2() {
        M1();
    }

    public void G1() {
        super.G1();
        this.d1 = 0;
    }

    public final void G2() {
        Surface surface = this.V0;
        m mVar = this.W0;
        if (surface == mVar) {
            this.V0 = null;
        }
        if (mVar != null) {
            mVar.release();
            this.W0 = null;
        }
    }

    public void H2(c3.j jVar, int i, long j) {
        P2.F.a("releaseOutputBuffer");
        jVar.n(i, true);
        P2.F.b();
        this.C0.e++;
        this.c1 = 0;
        if (this.S0 == null) {
            v2(this.h1);
            t2();
        }
    }

    public void I(float f, float f2) {
        super.I(f, f2);
        D d2 = this.S0;
        if (d2 != null) {
            d2.q(f);
        } else {
            this.N0.r(f);
        }
    }

    public final void I2(c3.j jVar, int i, long j, long j2) {
        if (K.a >= 21) {
            J2(jVar, i, j, j2);
        } else {
            H2(jVar, i, j);
        }
    }

    public void J2(c3.j jVar, int i, long j, long j2) {
        P2.F.a("releaseOutputBuffer");
        jVar.k(i, j2);
        P2.F.b();
        this.C0.e++;
        this.c1 = 0;
        if (this.S0 == null) {
            v2(this.h1);
            t2();
        }
    }

    public boolean K(long j, long j2, boolean z) {
        return P2(j, j2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L2(Object obj) {
        m mVar = obj instanceof Surface ? (Surface) obj : null;
        if (mVar == null) {
            m mVar2 = this.W0;
            if (mVar2 != null) {
                mVar = mVar2;
            } else {
                c3.m P0 = P0();
                if (P0 != null && S2(P0)) {
                    mVar = m.d(this.H0, P0.g);
                    this.W0 = mVar;
                }
            }
        }
        if (this.V0 == mVar) {
            if (mVar == null || mVar == this.W0) {
                return;
            }
            y2();
            x2();
            return;
        }
        this.V0 = mVar;
        if (this.S0 == null) {
            this.N0.q(mVar);
        }
        this.Y0 = false;
        int state = getState();
        c3.j N0 = N0();
        if (N0 != null && this.S0 == null) {
            if (K.a < 23 || mVar == null || this.Q0) {
                E1();
                n1();
            } else {
                M2(N0, mVar);
            }
        }
        if (mVar == null || mVar == this.W0) {
            this.i1 = null;
            D d2 = this.S0;
            if (d2 != null) {
                d2.r();
            }
        } else {
            y2();
            if (state == 2) {
                this.N0.e(true);
            }
        }
        A2();
    }

    public void M2(c3.j jVar, Surface surface) {
        jVar.g(surface);
    }

    public void N2(List list) {
        this.U0 = list;
        D d2 = this.S0;
        if (d2 != null) {
            d2.f(list);
        }
    }

    public int O0(S2.f fVar) {
        return (K.a < 34 || !this.k1 || fVar.f >= X()) ? 0 : 32;
    }

    public boolean O2(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    public boolean P2(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    public boolean Q0() {
        return this.k1 && K.a < 23;
    }

    public boolean Q1(c3.m mVar) {
        return this.V0 != null || S2(mVar);
    }

    public boolean Q2(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    public float R0(float f, M2.q qVar, M2.q[] qVarArr) {
        float f2 = -1.0f;
        for (M2.q qVar2 : qVarArr) {
            float f3 = qVar2.v;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public boolean R2() {
        return true;
    }

    public final boolean S2(c3.m mVar) {
        return K.a >= 23 && !this.k1 && !e2(mVar.a) && (!mVar.g || m.c(this.H0));
    }

    public List T0(c3.w wVar, M2.q qVar, boolean z) {
        return F.w(n2(this.H0, wVar, qVar, z, this.k1), qVar);
    }

    public int T1(c3.w wVar, M2.q qVar) {
        boolean z;
        int i = 0;
        if (!M2.y.s(qVar.n)) {
            return X0.t(0);
        }
        boolean z2 = qVar.r != null;
        List n2 = n2(this.H0, wVar, qVar, z2, false);
        if (z2 && n2.isEmpty()) {
            n2 = n2(this.H0, wVar, qVar, false, false);
        }
        if (n2.isEmpty()) {
            return X0.t(1);
        }
        if (!c3.t.U1(qVar)) {
            return X0.t(2);
        }
        c3.m mVar = (c3.m) n2.get(0);
        boolean m = mVar.m(qVar);
        if (m) {
            z = true;
        } else {
            for (int i2 = 1; i2 < n2.size(); i2++) {
                c3.m mVar2 = (c3.m) n2.get(i2);
                if (mVar2.m(qVar)) {
                    z = false;
                    m = true;
                    mVar = mVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = m ? 4 : 3;
        int i4 = mVar.p(qVar) ? 16 : 8;
        int i5 = mVar.h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (K.a >= 26 && "video/dolby-vision".equals(qVar.n) && !b.a(this.H0)) {
            i6 = 256;
        }
        if (m) {
            List n22 = n2(this.H0, wVar, qVar, z2, true);
            if (!n22.isEmpty()) {
                c3.m mVar3 = (c3.m) F.w(n22, qVar).get(0);
                if (mVar3.m(qVar) && mVar3.p(qVar)) {
                    i = 32;
                }
            }
        }
        return X0.p(i3, i4, i, i5, i6);
    }

    public void T2(c3.j jVar, int i, long j) {
        P2.F.a("skipVideoBuffer");
        jVar.n(i, false);
        P2.F.b();
        this.C0.f++;
    }

    public void V2(int i, int i2) {
        T2.o oVar = this.C0;
        oVar.h += i;
        int i3 = i + i2;
        oVar.g += i3;
        this.b1 += i3;
        int i4 = this.c1 + i3;
        this.c1 = i4;
        oVar.i = Math.max(i4, oVar.i);
        int i5 = this.L0;
        if (i5 <= 0 || this.b1 < i5) {
            return;
        }
        s2();
    }

    public j.a W0(c3.m mVar, M2.q qVar, MediaCrypto mediaCrypto, float f) {
        m mVar2 = this.W0;
        if (mVar2 != null && mVar2.a != mVar.g) {
            G2();
        }
        String str = mVar.c;
        c m2 = m2(mVar, qVar, Z());
        this.P0 = m2;
        MediaFormat q2 = q2(qVar, str, m2, f, this.M0, this.k1 ? this.l1 : 0);
        if (this.V0 == null) {
            if (!S2(mVar)) {
                throw new IllegalStateException();
            }
            if (this.W0 == null) {
                this.W0 = m.d(this.H0, mVar.g);
            }
            this.V0 = this.W0;
        }
        z2(q2);
        D d2 = this.S0;
        return j.a.b(mVar, q2, qVar, d2 != null ? d2.m() : this.V0, mediaCrypto);
    }

    public void W2(long j) {
        this.C0.a(j);
        this.e1 += j;
        this.f1++;
    }

    public boolean b() {
        D d2;
        return super.b() && ((d2 = this.S0) == null || d2.b());
    }

    public void b0() {
        this.i1 = null;
        D d2 = this.S0;
        if (d2 != null) {
            d2.p();
        } else {
            this.N0.g();
        }
        A2();
        this.Y0 = false;
        this.m1 = null;
        try {
            super.b0();
        } finally {
            this.K0.m(this.C0);
            this.K0.D(N.e);
        }
    }

    public void b1(S2.f fVar) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) P2.a.e(fVar.g);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        K2((c3.j) P2.a.e(N0()), bArr);
                    }
                }
            }
        }
    }

    public void c0(boolean z, boolean z2) {
        super.c0(z, z2);
        boolean z3 = U().b;
        P2.a.f((z3 && this.l1 == 0) ? false : true);
        if (this.k1 != z3) {
            this.k1 = z3;
            E1();
        }
        this.K0.o(this.C0);
        if (!this.T0) {
            if ((this.U0 != null || !this.J0) && this.S0 == null) {
                E e = this.I0;
                if (e == null) {
                    e = new d.b(this.H0, this.N0).f(T()).e();
                }
                this.S0 = e.b();
            }
            this.T0 = true;
        }
        D d2 = this.S0;
        if (d2 == null) {
            this.N0.o(T());
            this.N0.h(z2);
            return;
        }
        d2.w(new a(), x7.f.a());
        n nVar = this.n1;
        if (nVar != null) {
            this.S0.k(nVar);
        }
        if (this.V0 != null && !this.X0.equals(P2.A.c)) {
            this.S0.j(this.V0, this.X0);
        }
        this.S0.q(Z0());
        List list = this.U0;
        if (list != null) {
            this.S0.f(list);
        }
        this.S0.l(z2);
    }

    public void d0() {
        super.d0();
    }

    public void e() {
        D d2 = this.S0;
        if (d2 != null) {
            d2.e();
        } else {
            this.N0.a();
        }
    }

    public void e0(long j, boolean z) {
        D d2 = this.S0;
        if (d2 != null) {
            d2.v(true);
            this.S0.g(X0(), j2());
        }
        super.e0(j, z);
        if (this.S0 == null) {
            this.N0.m();
        }
        if (z) {
            this.N0.e(false);
        }
        A2();
        this.c1 = 0;
    }

    public boolean e2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!p1) {
                    q1 = i2();
                    p1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1;
    }

    public void f0() {
        super.f0();
        D d2 = this.S0;
        if (d2 == null || !this.J0) {
            return;
        }
        d2.release();
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h(long j, long j2) {
        super.h(j, j2);
        D d2 = this.S0;
        if (d2 != null) {
            try {
                d2.h(j, j2);
            } catch (D.b e) {
                throw R(e, e.a, 7001);
            }
        }
    }

    public void h0() {
        try {
            super.h0();
        } finally {
            this.T0 = false;
            if (this.W0 != null) {
                G2();
            }
        }
    }

    public void h2(c3.j jVar, int i, long j) {
        P2.F.a("dropVideoBuffer");
        jVar.n(i, false);
        P2.F.b();
        V2(0, 1);
    }

    public void i0() {
        super.i0();
        this.b1 = 0;
        this.a1 = T().b();
        this.e1 = 0L;
        this.f1 = 0;
        D d2 = this.S0;
        if (d2 != null) {
            d2.n();
        } else {
            this.N0.k();
        }
    }

    public boolean isReady() {
        m mVar;
        D d2;
        boolean z = super.isReady() && ((d2 = this.S0) == null || d2.isReady());
        if (z && (((mVar = this.W0) != null && this.V0 == mVar) || N0() == null || this.k1)) {
            return true;
        }
        return this.N0.d(z);
    }

    public void j0() {
        s2();
        u2();
        D d2 = this.S0;
        if (d2 != null) {
            d2.d();
        } else {
            this.N0.l();
        }
        super.j0();
    }

    public long j2() {
        return 0L;
    }

    public c m2(c3.m mVar, M2.q qVar, M2.q[] qVarArr) {
        int k2;
        int i = qVar.t;
        int i2 = qVar.u;
        int o2 = o2(mVar, qVar);
        if (qVarArr.length == 1) {
            if (o2 != -1 && (k2 = k2(mVar, qVar)) != -1) {
                o2 = Math.min((int) (o2 * 1.5f), k2);
            }
            return new c(i, i2, o2);
        }
        int length = qVarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            M2.q qVar2 = qVarArr[i3];
            if (qVar.A != null && qVar2.A == null) {
                qVar2 = qVar2.a().P(qVar.A).K();
            }
            if (mVar.e(qVar, qVar2).d != 0) {
                int i4 = qVar2.t;
                z |= i4 == -1 || qVar2.u == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, qVar2.u);
                o2 = Math.max(o2, o2(mVar, qVar2));
            }
        }
        if (z) {
            P2.o.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point l2 = l2(mVar, qVar);
            if (l2 != null) {
                i = Math.max(i, l2.x);
                i2 = Math.max(i2, l2.y);
                o2 = Math.max(o2, k2(mVar, qVar.a().v0(i).Y(i2).K()));
                P2.o.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new c(i, i2, o2);
    }

    public void p1(Exception exc) {
        P2.o.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.K0.C(exc);
    }

    public void q1(String str, j.a aVar, long j, long j2) {
        this.K0.k(str, j, j2);
        this.Q0 = e2(str);
        this.R0 = ((c3.m) P2.a.e(P0())).n();
        A2();
    }

    public MediaFormat q2(M2.q qVar, String str, c cVar, float f, boolean z, int i) {
        Pair r;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", qVar.t);
        mediaFormat.setInteger("height", qVar.u);
        P2.r.e(mediaFormat, qVar.q);
        P2.r.c(mediaFormat, "frame-rate", qVar.v);
        P2.r.d(mediaFormat, "rotation-degrees", qVar.w);
        P2.r.b(mediaFormat, qVar.A);
        if ("video/dolby-vision".equals(qVar.n) && (r = F.r(qVar)) != null) {
            P2.r.d(mediaFormat, "profile", ((Integer) r.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.a);
        mediaFormat.setInteger("max-height", cVar.b);
        P2.r.d(mediaFormat, "max-input-size", cVar.c);
        int i2 = K.a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            f2(mediaFormat, i);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.j1));
        }
        return mediaFormat;
    }

    public void r1(String str) {
        this.K0.l(str);
    }

    public boolean r2(long j, boolean z) {
        int o0 = o0(j);
        if (o0 == 0) {
            return false;
        }
        if (z) {
            T2.o oVar = this.C0;
            oVar.d += o0;
            oVar.f += this.d1;
        } else {
            this.C0.j++;
            V2(o0, this.d1);
        }
        K0();
        D d2 = this.S0;
        if (d2 != null) {
            d2.v(false);
        }
        return true;
    }

    public T2.p s0(c3.m mVar, M2.q qVar, M2.q qVar2) {
        T2.p e = mVar.e(qVar, qVar2);
        int i = e.e;
        c cVar = (c) P2.a.e(this.P0);
        if (qVar2.t > cVar.a || qVar2.u > cVar.b) {
            i |= 256;
        }
        if (o2(mVar, qVar2) > cVar.c) {
            i |= 64;
        }
        int i2 = i;
        return new T2.p(mVar.a, qVar, qVar2, i2 != 0 ? 0 : e.d, i2);
    }

    public T2.p s1(u0 u0Var) {
        T2.p s1 = super.s1(u0Var);
        this.K0.p((M2.q) P2.a.e(u0Var.b), s1);
        return s1;
    }

    public final void s2() {
        if (this.b1 > 0) {
            long b2 = T().b();
            this.K0.n(this.b1, b2 - this.a1);
            this.b1 = 0;
            this.a1 = b2;
        }
    }

    public void t1(M2.q qVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        c3.j N0 = N0();
        if (N0 != null) {
            N0.e(this.Z0);
        }
        int i2 = 0;
        if (this.k1) {
            i = qVar.t;
            integer = qVar.u;
        } else {
            P2.a.e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = qVar.x;
        if (d2()) {
            int i3 = qVar.w;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (this.S0 == null) {
            i2 = qVar.w;
        }
        this.h1 = new N(i, integer, i2, f);
        if (this.S0 == null) {
            this.N0.p(qVar.v);
        } else {
            F2();
            this.S0.s(1, qVar.a().v0(i).Y(integer).n0(i2).k0(f).K());
        }
    }

    public final void t2() {
        if (!this.N0.i() || this.V0 == null) {
            return;
        }
        C2();
    }

    public final void u2() {
        int i = this.f1;
        if (i != 0) {
            this.K0.B(this.e1, i);
            this.e1 = 0L;
            this.f1 = 0;
        }
    }

    public void v(int i, Object obj) {
        if (i == 1) {
            L2(obj);
            return;
        }
        if (i == 7) {
            n nVar = (n) P2.a.e(obj);
            this.n1 = nVar;
            D d2 = this.S0;
            if (d2 != null) {
                d2.k(nVar);
                return;
            }
            return;
        }
        if (i == 10) {
            int intValue = ((Integer) P2.a.e(obj)).intValue();
            if (this.l1 != intValue) {
                this.l1 = intValue;
                if (this.k1) {
                    E1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.j1 = ((Integer) P2.a.e(obj)).intValue();
            U2();
            return;
        }
        if (i == 4) {
            this.Z0 = ((Integer) P2.a.e(obj)).intValue();
            c3.j N0 = N0();
            if (N0 != null) {
                N0.e(this.Z0);
                return;
            }
            return;
        }
        if (i == 5) {
            this.N0.n(((Integer) P2.a.e(obj)).intValue());
            return;
        }
        if (i == 13) {
            N2((List) P2.a.e(obj));
            return;
        }
        if (i != 14) {
            super.v(i, obj);
            return;
        }
        P2.A a2 = (P2.A) P2.a.e(obj);
        if (a2.b() == 0 || a2.a() == 0) {
            return;
        }
        this.X0 = a2;
        D d3 = this.S0;
        if (d3 != null) {
            d3.j((Surface) P2.a.h(this.V0), a2);
        }
    }

    public void v1(long j) {
        super.v1(j);
        if (this.k1) {
            return;
        }
        this.d1--;
    }

    public final void v2(N n) {
        if (n.equals(N.e) || n.equals(this.i1)) {
            return;
        }
        this.i1 = n;
        this.K0.D(n);
    }

    public void w1() {
        super.w1();
        D d2 = this.S0;
        if (d2 != null) {
            d2.g(X0(), j2());
        } else {
            this.N0.j();
        }
        A2();
    }

    public final boolean w2(c3.j jVar, int i, long j, M2.q qVar) {
        long g = this.O0.g();
        long f = this.O0.f();
        if (K.a >= 21) {
            if (R2() && g == this.g1) {
                T2(jVar, i, j);
            } else {
                B2(j, g, qVar);
                J2(jVar, i, j, g);
            }
            W2(f);
            this.g1 = g;
            return true;
        }
        if (f >= 30000) {
            return false;
        }
        if (f > 11000) {
            try {
                Thread.sleep((f - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        B2(j, g, qVar);
        H2(jVar, i, j);
        W2(f);
        return true;
    }

    public void x1(S2.f fVar) {
        boolean z = this.k1;
        if (!z) {
            this.d1++;
        }
        if (K.a >= 23 || !z) {
            return;
        }
        D2(fVar.f);
    }

    public final void x2() {
        Surface surface = this.V0;
        if (surface == null || !this.Y0) {
            return;
        }
        this.K0.A(surface);
    }

    public boolean y(long j, long j2) {
        return Q2(j, j2);
    }

    public void y1(M2.q qVar) {
        D d2 = this.S0;
        if (d2 == null || d2.isInitialized()) {
            return;
        }
        try {
            this.S0.t(qVar);
        } catch (D.b e) {
            throw R(e, qVar, 7000);
        }
    }

    public final void y2() {
        N n = this.i1;
        if (n != null) {
            this.K0.D(n);
        }
    }

    public final void z2(MediaFormat mediaFormat) {
        D d2 = this.S0;
        if (d2 == null || d2.i()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    public k(Context context, j.b bVar, c3.w wVar, long j, boolean z, Handler handler, C c2, int i, float f) {
        this(context, bVar, wVar, j, z, handler, c2, i, f, null);
    }

    public k(Context context, j.b bVar, c3.w wVar, long j, boolean z, Handler handler, C c2, int i, float f, E e) {
        super(2, bVar, wVar, z, f);
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        this.L0 = i;
        this.I0 = e;
        this.K0 = new C.a(handler, c2);
        this.J0 = e == null;
        if (e == null) {
            this.N0 = new o(applicationContext, this, j);
        } else {
            this.N0 = e.a();
        }
        this.O0 = new o.a();
        this.M0 = g2();
        this.X0 = P2.A.c;
        this.Z0 = 1;
        this.h1 = N.e;
        this.l1 = 0;
        this.i1 = null;
        this.j1 = -1000;
    }

    public void F2() {
    }

    public class a implements D.a {
        public a() {
        }

        public void b(D d) {
            P2.a.h(k.Y1(k.this));
            k.Z1(k.this);
        }

        public void c(D d) {
            k.this.V2(0, 1);
        }

        public void a(D d, N n) {
        }
    }
}
