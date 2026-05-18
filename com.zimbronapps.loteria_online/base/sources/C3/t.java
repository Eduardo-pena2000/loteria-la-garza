package c3;

import P2.K;
import S2.f;
import T2.W0;
import T2.f0;
import T2.u0;
import U2.x1;
import V2.N;
import V2.X;
import Y2.m;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import c3.F;
import c3.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t extends T2.n {
    public static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public boolean A0;
    public final X B;
    public T2.u B0;
    public M2.q C;
    public T2.o C0;
    public M2.q D;
    public f D0;
    public Y2.m E;
    public long E0;
    public Y2.m F;
    public boolean F0;
    public W0.a G;
    public MediaCrypto H;
    public long I;
    public float J;
    public float K;
    public j L;
    public M2.q M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque Q;
    public d R;
    public m S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public int g0;
    public int h0;
    public ByteBuffer i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final j.b r;
    public int r0;
    public final w s;
    public boolean s0;
    public final boolean t;
    public boolean t0;
    public final float u;
    public boolean u0;
    public final S2.f v;
    public long v0;
    public final S2.f w;
    public long w0;
    public final S2.f x;
    public boolean x0;
    public final h y;
    public boolean y0;
    public final MediaCodec.BufferInfo z;
    public boolean z0;

    public static final class b {
        public static boolean a(j jVar, e eVar) {
            return jVar.h(eVar);
        }
    }

    public static final class c {
        public static void a(j.a aVar, x1 x1Var) {
            LogSessionId a = x1Var.a();
            if (N.a(a, f0.a())) {
                return;
            }
            aVar.b.setString("log-session-id", u.a(a));
        }
    }

    public final class e implements j.c {
        public e() {
        }

        public void a() {
            if (t.p0(t.this) != null) {
                t.p0(t.this).b();
            }
        }

        public void b() {
            if (t.p0(t.this) != null) {
                t.p0(t.this).b();
            }
        }

        public /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    public static final class f {
        public static final f e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final P2.D d = new P2.D();

        public f(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public t(int i, j.b bVar, w wVar, boolean z, float f2) {
        super(i);
        this.r = bVar;
        this.s = (w) P2.a.e(wVar);
        this.t = z;
        this.u = f2;
        this.v = S2.f.s();
        this.w = new S2.f(0);
        this.x = new S2.f(2);
        h hVar = new h();
        this.y = hVar;
        this.z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque();
        this.D0 = f.e;
        hVar.p(0);
        hVar.d.order(ByteOrder.nativeOrder());
        this.B = new X();
        this.P = -1.0f;
        this.T = 0;
        this.p0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.f0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.q0 = 0;
        this.r0 = 0;
        this.C0 = new T2.o();
    }

    public static boolean A0(String str) {
        return K.a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean U1(M2.q qVar) {
        int i = qVar.K;
        return i == 0 || i == 2;
    }

    public static boolean k1(IllegalStateException illegalStateException) {
        if (K.a >= 21 && l1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean l1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static /* synthetic */ W0.a p0(t tVar) {
        return tVar.G;
    }

    public static boolean u0(String str, M2.q qVar) {
        return K.a < 21 && qVar.q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean v0(String str) {
        if (K.a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(K.c)) {
            String str2 = K.b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean w0(String str) {
        int i = K.a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i == 19) {
                String str2 = K.b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean x0(String str) {
        return K.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean y0(m mVar) {
        String str = mVar.a;
        int i = K.a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(K.c) && "AFTS".equals(K.d) && mVar.g);
    }

    public static boolean z0(String str) {
        return K.a == 19 && K.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    public abstract boolean A1(long j, long j2, j jVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, M2.q qVar);

    public l B0(Throwable th, m mVar) {
        return new l(th, mVar);
    }

    public final void B1() {
        this.u0 = true;
        MediaFormat d2 = ((j) P2.a.e(this.L)).d();
        if (this.T != 0 && d2.getInteger("width") == 32 && d2.getInteger("height") == 32) {
            this.c0 = true;
            return;
        }
        if (this.a0) {
            d2.setInteger("channel-count", 1);
        }
        this.N = d2;
        this.O = true;
    }

    public final void C0() {
        this.n0 = false;
        this.y.f();
        this.x.f();
        this.m0 = false;
        this.l0 = false;
        this.B.d();
    }

    public final boolean C1(int i) {
        u0 V = V();
        this.v.f();
        int m0 = m0(V, this.v, i | 4);
        if (m0 == -5) {
            s1(V);
            return true;
        }
        if (m0 != -4 || !this.v.i()) {
            return false;
        }
        this.x0 = true;
        z1();
        return false;
    }

    public final long D(long j, long j2) {
        return U0(this.e0, j, j2);
    }

    public final boolean D0() {
        if (this.s0) {
            this.q0 = 1;
            if (this.V || this.X) {
                this.r0 = 3;
                return false;
            }
            this.r0 = 1;
        }
        return true;
    }

    public final void D1() {
        E1();
        n1();
    }

    public final void E0() {
        if (!this.s0) {
            D1();
        } else {
            this.q0 = 1;
            this.r0 = 3;
        }
    }

    public void E1() {
        try {
            j jVar = this.L;
            if (jVar != null) {
                jVar.release();
                this.C0.b++;
                r1(((m) P2.a.e(this.S)).a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean F0() {
        if (this.s0) {
            this.q0 = 1;
            if (this.V || this.X) {
                this.r0 = 3;
                return false;
            }
            this.r0 = 2;
        } else {
            W1();
        }
        return true;
    }

    public final boolean G0(long j, long j2) {
        boolean z;
        boolean A1;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int m;
        j jVar = (j) P2.a.e(this.L);
        if (!c1()) {
            if (this.Y && this.t0) {
                try {
                    m = jVar.m(this.z);
                } catch (IllegalStateException unused) {
                    z1();
                    if (this.y0) {
                        E1();
                    }
                    return false;
                }
            } else {
                m = jVar.m(this.z);
            }
            if (m < 0) {
                if (m == -2) {
                    B1();
                    return true;
                }
                if (this.d0 && (this.x0 || this.q0 == 2)) {
                    z1();
                }
                return false;
            }
            if (this.c0) {
                this.c0 = false;
                jVar.n(m, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.z;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                z1();
                return false;
            }
            this.h0 = m;
            ByteBuffer o = jVar.o(m);
            this.i0 = o;
            if (o != null) {
                o.position(this.z.offset);
                ByteBuffer byteBuffer2 = this.i0;
                MediaCodec.BufferInfo bufferInfo3 = this.z;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Z) {
                MediaCodec.BufferInfo bufferInfo4 = this.z;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0 && this.v0 != -9223372036854775807L) {
                    bufferInfo4.presentationTimeUs = this.w0;
                }
            }
            this.j0 = this.z.presentationTimeUs < X();
            long j3 = this.w0;
            this.k0 = j3 != -9223372036854775807L && j3 <= this.z.presentationTimeUs;
            X1(this.z.presentationTimeUs);
        }
        if (this.Y && this.t0) {
            try {
                byteBuffer = this.i0;
                i = this.h0;
                bufferInfo = this.z;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                A1 = A1(j, j2, jVar, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.j0, this.k0, (M2.q) P2.a.e(this.D));
            } catch (IllegalStateException unused3) {
                z1();
                if (this.y0) {
                    E1();
                }
                return z;
            }
        } else {
            z = false;
            ByteBuffer byteBuffer3 = this.i0;
            int i2 = this.h0;
            MediaCodec.BufferInfo bufferInfo5 = this.z;
            A1 = A1(j, j2, jVar, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.j0, this.k0, (M2.q) P2.a.e(this.D));
        }
        if (A1) {
            v1(this.z.presentationTimeUs);
            boolean z2 = (this.z.flags & 4) != 0 ? true : z;
            J1();
            if (!z2) {
                return true;
            }
            z1();
        }
        return z;
    }

    public void G1() {
        I1();
        J1();
        this.f0 = -9223372036854775807L;
        this.t0 = false;
        this.s0 = false;
        this.b0 = false;
        this.c0 = false;
        this.j0 = false;
        this.k0 = false;
        this.v0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.q0 = 0;
        this.r0 = 0;
        this.p0 = this.o0 ? 1 : 0;
    }

    public final boolean H0(m mVar, M2.q qVar, Y2.m mVar2, Y2.m mVar3) {
        S2.b e2;
        S2.b e3;
        if (mVar2 == mVar3) {
            return false;
        }
        if (mVar3 != null && mVar2 != null && (e2 = mVar3.e()) != null && (e3 = mVar2.e()) != null && e2.getClass().equals(e3.getClass())) {
            if (!(e2 instanceof Y2.B)) {
                return false;
            }
            if (!mVar3.b().equals(mVar2.b()) || K.a < 23) {
                return true;
            }
            UUID uuid = M2.g.e;
            if (!uuid.equals(mVar2.b()) && !uuid.equals(mVar3.b())) {
                return !mVar.g && mVar3.h((String) P2.a.e(qVar.n));
            }
        }
        return true;
    }

    public void H1() {
        G1();
        this.B0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.d0 = false;
        this.e0 = false;
        this.o0 = false;
        this.p0 = 0;
    }

    public void I(float f2, float f3) {
        this.J = f2;
        this.K = f3;
        V1(this.M);
    }

    public final boolean I0() {
        int i;
        if (this.L == null || (i = this.q0) == 2 || this.x0) {
            return false;
        }
        if (i == 0 && R1()) {
            E0();
        }
        j jVar = (j) P2.a.e(this.L);
        if (this.g0 < 0) {
            int l = jVar.l();
            this.g0 = l;
            if (l < 0) {
                return false;
            }
            this.w.d = jVar.f(l);
            this.w.f();
        }
        if (this.q0 == 1) {
            if (!this.d0) {
                this.t0 = true;
                jVar.a(this.g0, 0, 0, 0L, 4);
                I1();
            }
            this.q0 = 2;
            return false;
        }
        if (this.b0) {
            this.b0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) P2.a.e(this.w.d);
            byte[] bArr = G0;
            byteBuffer.put(bArr);
            jVar.a(this.g0, 0, bArr.length, 0L, 0);
            I1();
            this.s0 = true;
            return true;
        }
        if (this.p0 == 1) {
            for (int i2 = 0; i2 < ((M2.q) P2.a.e(this.M)).q.size(); i2++) {
                ((ByteBuffer) P2.a.e(this.w.d)).put((byte[]) this.M.q.get(i2));
            }
            this.p0 = 2;
        }
        int position = ((ByteBuffer) P2.a.e(this.w.d)).position();
        u0 V = V();
        try {
            int m0 = m0(V, this.w, 0);
            if (m0 == -3) {
                if (k()) {
                    this.w0 = this.v0;
                }
                return false;
            }
            if (m0 == -5) {
                if (this.p0 == 2) {
                    this.w.f();
                    this.p0 = 1;
                }
                s1(V);
                return true;
            }
            if (this.w.i()) {
                this.w0 = this.v0;
                if (this.p0 == 2) {
                    this.w.f();
                    this.p0 = 1;
                }
                this.x0 = true;
                if (!this.s0) {
                    z1();
                    return false;
                }
                try {
                    if (!this.d0) {
                        this.t0 = true;
                        jVar.a(this.g0, 0, 0, 0L, 4);
                        I1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw R(e2, this.C, K.W(e2.getErrorCode()));
                }
            }
            if (!this.s0 && !this.w.l()) {
                this.w.f();
                if (this.p0 == 2) {
                    this.p0 = 1;
                }
                return true;
            }
            boolean r = this.w.r();
            if (r) {
                this.w.c.b(position);
            }
            if (this.U && !r) {
                Q2.d.b((ByteBuffer) P2.a.e(this.w.d));
                if (((ByteBuffer) P2.a.e(this.w.d)).position() == 0) {
                    return true;
                }
                this.U = false;
            }
            long j = this.w.f;
            if (this.z0) {
                if (this.A.isEmpty()) {
                    this.D0.d.a(j, (M2.q) P2.a.e(this.C));
                } else {
                    ((f) this.A.peekLast()).d.a(j, (M2.q) P2.a.e(this.C));
                }
                this.z0 = false;
            }
            this.v0 = Math.max(this.v0, j);
            if (k() || this.w.m()) {
                this.w0 = this.v0;
            }
            this.w.q();
            if (this.w.h()) {
                b1(this.w);
            }
            x1(this.w);
            int O0 = O0(this.w);
            try {
                if (r) {
                    ((j) P2.a.e(jVar)).b(this.g0, 0, this.w.c, j, O0);
                } else {
                    ((j) P2.a.e(jVar)).a(this.g0, 0, ((ByteBuffer) P2.a.e(this.w.d)).limit(), j, O0);
                }
                I1();
                this.s0 = true;
                this.p0 = 0;
                this.C0.c++;
                return true;
            } catch (MediaCodec.CryptoException e3) {
                throw R(e3, this.C, K.W(e3.getErrorCode()));
            }
        } catch (f.a e4) {
            p1(e4);
            C1(0);
            J0();
            return true;
        }
    }

    public final void I1() {
        this.g0 = -1;
        this.w.d = null;
    }

    public final void J0() {
        try {
            ((j) P2.a.h(this.L)).flush();
        } finally {
            G1();
        }
    }

    public final void J1() {
        this.h0 = -1;
        this.i0 = null;
    }

    public final boolean K0() {
        boolean L0 = L0();
        if (L0) {
            n1();
        }
        return L0;
    }

    public final void K1(Y2.m mVar) {
        Y2.m.g(this.E, mVar);
        this.E = mVar;
    }

    public boolean L0() {
        if (this.L == null) {
            return false;
        }
        int i = this.r0;
        if (i == 3 || this.V || ((this.W && !this.u0) || (this.X && this.t0))) {
            E1();
            return true;
        }
        if (i == 2) {
            int i2 = K.a;
            P2.a.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    W1();
                } catch (T2.u e2) {
                    P2.o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    E1();
                    return true;
                }
            }
        }
        J0();
        return false;
    }

    public final void L1(f fVar) {
        this.D0 = fVar;
        long j = fVar.c;
        if (j != -9223372036854775807L) {
            this.F0 = true;
            u1(j);
        }
    }

    public final int M() {
        return 8;
    }

    public final List M0(boolean z) {
        M2.q qVar = (M2.q) P2.a.e(this.C);
        List T0 = T0(this.s, qVar, z);
        if (T0.isEmpty() && z) {
            T0 = T0(this.s, qVar, false);
            if (!T0.isEmpty()) {
                P2.o.h("MediaCodecRenderer", "Drm session requires secure decoder for " + qVar.n + ", but no secure decoder available. Trying to proceed with " + T0 + ".");
            }
        }
        return T0;
    }

    public final void M1() {
        this.A0 = true;
    }

    public final j N0() {
        return this.L;
    }

    public final void N1(T2.u uVar) {
        this.B0 = uVar;
    }

    public int O0(S2.f fVar) {
        return 0;
    }

    public final void O1(Y2.m mVar) {
        Y2.m.g(this.F, mVar);
        this.F = mVar;
    }

    public final m P0() {
        return this.S;
    }

    public final boolean P1(long j) {
        return this.I == -9223372036854775807L || T().b() - j < this.I;
    }

    public boolean Q0() {
        return false;
    }

    public boolean Q1(m mVar) {
        return true;
    }

    public abstract float R0(float f2, M2.q qVar, M2.q[] qVarArr);

    public boolean R1() {
        return false;
    }

    public final MediaFormat S0() {
        return this.N;
    }

    public boolean S1(M2.q qVar) {
        return false;
    }

    public abstract List T0(w wVar, M2.q qVar, boolean z);

    public abstract int T1(w wVar, M2.q qVar);

    public long U0(boolean z, long j, long j2) {
        return super.D(j, j2);
    }

    public long V0() {
        return this.w0;
    }

    public final boolean V1(M2.q qVar) {
        if (K.a >= 23 && this.L != null && this.r0 != 3 && getState() != 0) {
            float R0 = R0(this.K, (M2.q) P2.a.e(qVar), Z());
            float f2 = this.P;
            if (f2 == R0) {
                return true;
            }
            if (R0 == -1.0f) {
                E0();
                return false;
            }
            if (f2 == -1.0f && R0 <= this.u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", R0);
            ((j) P2.a.e(this.L)).c(bundle);
            this.P = R0;
        }
        return true;
    }

    public abstract j.a W0(m mVar, M2.q qVar, MediaCrypto mediaCrypto, float f2);

    public final void W1() {
        S2.b e2 = ((Y2.m) P2.a.e(this.F)).e();
        if (e2 instanceof Y2.B) {
            try {
                ((MediaCrypto) P2.a.e(this.H)).setMediaDrmSession(((Y2.B) e2).b);
            } catch (MediaCryptoException e3) {
                throw R(e3, this.C, 6006);
            }
        }
        K1(this.F);
        this.q0 = 0;
        this.r0 = 0;
    }

    public final long X0() {
        return this.D0.c;
    }

    public final void X1(long j) {
        M2.q qVar = (M2.q) this.D0.d.i(j);
        if (qVar == null && this.F0 && this.N != null) {
            qVar = (M2.q) this.D0.d.h();
        }
        if (qVar != null) {
            this.D = qVar;
        } else if (!this.O || this.D == null) {
            return;
        }
        t1((M2.q) P2.a.e(this.D), this.N);
        this.O = false;
        this.F0 = false;
    }

    public final long Y0() {
        return this.D0.b;
    }

    public float Z0() {
        return this.J;
    }

    public final int a(M2.q qVar) {
        try {
            return T1(this.s, qVar);
        } catch (F.c e2) {
            throw R(e2, qVar, 4002);
        }
    }

    public final W0.a a1() {
        return this.G;
    }

    public boolean b() {
        return this.y0;
    }

    public void b0() {
        this.C = null;
        L1(f.e);
        this.A.clear();
        L0();
    }

    public abstract void b1(S2.f fVar);

    public void c0(boolean z, boolean z2) {
        this.C0 = new T2.o();
    }

    public final boolean c1() {
        return this.h0 >= 0;
    }

    public final boolean d1() {
        if (!this.y.z()) {
            return true;
        }
        long X = X();
        return j1(X, this.y.x()) == j1(X, this.x.f);
    }

    public void e0(long j, boolean z) {
        this.x0 = false;
        this.y0 = false;
        this.A0 = false;
        if (this.l0) {
            this.y.f();
            this.x.f();
            this.m0 = false;
            this.B.d();
        } else {
            K0();
        }
        if (this.D0.d.k() > 0) {
            this.z0 = true;
        }
        this.D0.d.c();
        this.A.clear();
    }

    public final void e1(M2.q qVar) {
        C0();
        String str = qVar.n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.y.A(32);
        } else {
            this.y.A(1);
        }
        this.l0 = true;
    }

    public final void f1(m mVar, MediaCrypto mediaCrypto) {
        M2.q qVar = (M2.q) P2.a.e(this.C);
        String str = mVar.a;
        int i = K.a;
        float R0 = i < 23 ? -1.0f : R0(this.K, qVar, Z());
        float f2 = R0 > this.u ? R0 : -1.0f;
        y1(qVar);
        long b2 = T().b();
        j.a W0 = W0(mVar, qVar, mediaCrypto, f2);
        if (i >= 31) {
            c.a(W0, Y());
        }
        try {
            P2.F.a("createCodec:" + str);
            j a2 = this.r.a(W0);
            this.L = a2;
            this.e0 = i >= 21 && b.a(a2, new e(this, null));
            P2.F.b();
            long b3 = T().b();
            if (!mVar.m(qVar)) {
                P2.o.h("MediaCodecRenderer", K.G("Format exceeds selected codec's capabilities [%s, %s]", M2.q.g(qVar), str));
            }
            this.S = mVar;
            this.P = f2;
            this.M = qVar;
            this.T = t0(str);
            this.U = u0(str, (M2.q) P2.a.e(this.M));
            this.V = z0(str);
            this.W = A0(str);
            this.X = w0(str);
            this.Y = x0(str);
            this.Z = v0(str);
            this.a0 = false;
            this.d0 = y0(mVar) || Q0();
            if (((j) P2.a.e(this.L)).j()) {
                this.o0 = true;
                this.p0 = 1;
                this.b0 = this.T != 0;
            }
            if (getState() == 2) {
                this.f0 = T().b() + 1000;
            }
            this.C0.a++;
            q1(str, W0, b3, b3 - b2);
        } catch (Throwable th) {
            P2.F.b();
            throw th;
        }
    }

    public final boolean g1() {
        P2.a.f(this.H == null);
        Y2.m mVar = this.E;
        S2.b e2 = mVar.e();
        if (Y2.B.d && (e2 instanceof Y2.B)) {
            int state = mVar.getState();
            if (state == 1) {
                m.a aVar = (m.a) P2.a.e(mVar.getError());
                throw R(aVar, this.C, aVar.a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (e2 == null) {
            return mVar.getError() != null;
        }
        if (e2 instanceof Y2.B) {
            Y2.B b2 = (Y2.B) e2;
            try {
                this.H = new MediaCrypto(b2.a, b2.b);
            } catch (MediaCryptoException e3) {
                throw R(e3, this.C, 6006);
            }
        }
        return true;
    }

    public void h(long j, long j2) {
        boolean z = false;
        if (this.A0) {
            this.A0 = false;
            z1();
        }
        T2.u uVar = this.B0;
        if (uVar != null) {
            this.B0 = null;
            throw uVar;
        }
        try {
            if (this.y0) {
                F1();
                return;
            }
            if (this.C != null || C1(2)) {
                n1();
                if (this.l0) {
                    P2.F.a("bypassRender");
                    while (r0(j, j2)) {
                    }
                    P2.F.b();
                } else if (this.L != null) {
                    long b2 = T().b();
                    P2.F.a("drainAndFeed");
                    while (G0(j, j2) && P1(b2)) {
                    }
                    while (I0() && P1(b2)) {
                    }
                    P2.F.b();
                } else {
                    this.C0.d += o0(j);
                    C1(1);
                }
                this.C0.c();
            }
        } catch (IllegalStateException e2) {
            if (!k1(e2)) {
                throw e2;
            }
            p1(e2);
            if (K.a >= 21 && m1(e2)) {
                z = true;
            }
            if (z) {
                E1();
            }
            l B0 = B0(e2, P0());
            throw S(B0, this.C, z, B0.c == 1101 ? 4006 : 4003);
        }
    }

    public void h0() {
        try {
            C0();
            E1();
        } finally {
            O1(null);
        }
    }

    public final boolean h1() {
        return this.l0;
    }

    public final boolean i1(M2.q qVar) {
        return this.F == null && S1(qVar);
    }

    public boolean isReady() {
        return this.C != null && (a0() || c1() || (this.f0 != -9223372036854775807L && T().b() < this.f0));
    }

    public final boolean j1(long j, long j2) {
        M2.q qVar;
        return j2 < j && !((qVar = this.D) != null && Objects.equals(qVar.n, "audio/opus") && o3.H.g(j, j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k0(M2.q[] r13, long r14, long r16, g3.w.b r18) {
        /*
            r12 = this;
            r0 = r12
            c3.t$f r1 = r0.D0
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            c3.t$f r1 = new c3.t$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            goto L65
        L20:
            java.util.ArrayDeque r1 = r0.A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.v0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.E0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            c3.t$f r1 = new c3.t$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            c3.t$f r1 = r0.D0
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.w1()
            goto L65
        L55:
            java.util.ArrayDeque r1 = r0.A
            c3.t$f r9 = new c3.t$f
            long r3 = r0.v0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.t.k0(M2.q[], long, long, g3.w$b):void");
    }

    public final void n1() {
        M2.q qVar;
        if (this.L != null || this.l0 || (qVar = this.C) == null) {
            return;
        }
        if (i1(qVar)) {
            e1(qVar);
            return;
        }
        K1(this.F);
        if (this.E == null || g1()) {
            try {
                Y2.m mVar = this.E;
                o1(this.H, mVar != null && mVar.h((String) P2.a.h(qVar.n)));
            } catch (d e2) {
                throw R(e2, qVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.H;
        if (mediaCrypto == null || this.L != null) {
            return;
        }
        mediaCrypto.release();
        this.H = null;
    }

    public final void o1(MediaCrypto mediaCrypto, boolean z) {
        M2.q qVar = (M2.q) P2.a.e(this.C);
        if (this.Q == null) {
            try {
                List M0 = M0(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Q = arrayDeque;
                if (this.t) {
                    arrayDeque.addAll(M0);
                } else if (!M0.isEmpty()) {
                    this.Q.add((m) M0.get(0));
                }
                this.R = null;
            } catch (F.c e2) {
                throw new d(qVar, (Throwable) e2, z, -49998);
            }
        }
        if (this.Q.isEmpty()) {
            throw new d(qVar, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) P2.a.e(this.Q);
        while (this.L == null) {
            m mVar = (m) P2.a.e((m) arrayDeque2.peekFirst());
            if (!Q1(mVar)) {
                return;
            }
            try {
                f1(mVar, mediaCrypto);
            } catch (Exception e3) {
                P2.o.i("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e3);
                arrayDeque2.removeFirst();
                d dVar = new d(qVar, (Throwable) e3, z, mVar);
                p1(dVar);
                if (this.R == null) {
                    this.R = dVar;
                } else {
                    this.R = d.a(this.R, dVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    public abstract void p1(Exception exc);

    public final void q0() {
        P2.a.f(!this.x0);
        u0 V = V();
        this.x.f();
        do {
            this.x.f();
            int m0 = m0(V, this.x, 0);
            if (m0 == -5) {
                s1(V);
                return;
            }
            if (m0 == -4) {
                if (!this.x.i()) {
                    this.v0 = Math.max(this.v0, this.x.f);
                    if (k() || this.w.m()) {
                        this.w0 = this.v0;
                    }
                    if (this.z0) {
                        M2.q qVar = (M2.q) P2.a.e(this.C);
                        this.D = qVar;
                        if (Objects.equals(qVar.n, "audio/opus") && !this.D.q.isEmpty()) {
                            this.D = ((M2.q) P2.a.e(this.D)).a().V(o3.H.f((byte[]) this.D.q.get(0))).K();
                        }
                        t1(this.D, null);
                        this.z0 = false;
                    }
                    this.x.q();
                    M2.q qVar2 = this.D;
                    if (qVar2 != null && Objects.equals(qVar2.n, "audio/opus")) {
                        if (this.x.h()) {
                            S2.f fVar = this.x;
                            fVar.b = this.D;
                            b1(fVar);
                        }
                        if (o3.H.g(X(), this.x.f)) {
                            this.B.a(this.x, ((M2.q) P2.a.e(this.D)).q);
                        }
                    }
                    if (!d1()) {
                        break;
                    }
                } else {
                    this.x0 = true;
                    this.w0 = this.v0;
                    return;
                }
            } else {
                if (m0 != -3) {
                    throw new IllegalStateException();
                }
                if (k()) {
                    this.w0 = this.v0;
                    return;
                }
                return;
            }
        } while (this.y.u(this.x));
        this.m0 = true;
    }

    public abstract void q1(String str, j.a aVar, long j, long j2);

    public final boolean r0(long j, long j2) {
        boolean z;
        P2.a.f(!this.y0);
        if (this.y.z()) {
            h hVar = this.y;
            if (!A1(j, j2, null, hVar.d, this.h0, 0, hVar.y(), this.y.w(), j1(X(), this.y.x()), this.y.i(), (M2.q) P2.a.e(this.D))) {
                return false;
            }
            v1(this.y.x());
            this.y.f();
            z = false;
        } else {
            z = false;
        }
        if (this.x0) {
            this.y0 = true;
            return z;
        }
        if (this.m0) {
            P2.a.f(this.y.u(this.x));
            this.m0 = z;
        }
        if (this.n0) {
            if (this.y.z()) {
                return true;
            }
            C0();
            this.n0 = z;
            n1();
            if (!this.l0) {
                return z;
            }
        }
        q0();
        if (this.y.z()) {
            this.y.q();
        }
        if (this.y.z() || this.x0 || this.n0) {
            return true;
        }
        return z;
    }

    public abstract void r1(String str);

    public abstract T2.p s0(m mVar, M2.q qVar, M2.q qVar2);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T2.p s1(T2.u0 r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.t.s1(T2.u0):T2.p");
    }

    public final int t0(String str) {
        int i = K.a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = K.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = K.b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void t1(M2.q qVar, MediaFormat mediaFormat);

    public void v(int i, Object obj) {
        if (i == 11) {
            this.G = (W0.a) obj;
        } else {
            super.v(i, obj);
        }
    }

    public void v1(long j) {
        this.E0 = j;
        while (!this.A.isEmpty() && j >= ((f) this.A.peek()).a) {
            L1((f) P2.a.e((f) this.A.poll()));
            w1();
        }
    }

    public final void z1() {
        int i = this.r0;
        if (i == 1) {
            J0();
            return;
        }
        if (i == 2) {
            J0();
            W1();
        } else if (i == 3) {
            D1();
        } else {
            this.y0 = true;
            F1();
        }
    }

    public static class d extends Exception {
        public final String a;
        public final boolean b;
        public final m c;
        public final String d;
        public final d e;

        public d(M2.q qVar, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + qVar, th, qVar.n, z, null, b(i), null);
        }

        public static /* synthetic */ d a(d dVar, d dVar2) {
            return dVar.c(dVar2);
        }

        public static String b(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final d c(d dVar) {
            return new d(getMessage(), getCause(), this.a, this.b, this.c, this.d, dVar);
        }

        public d(M2.q qVar, Throwable th, boolean z, m mVar) {
            this("Decoder init failed: " + mVar.a + ", " + qVar, th, qVar.n, z, mVar, K.a >= 21 ? d(th) : null, null);
        }

        public d(String str, Throwable th, String str2, boolean z, m mVar, String str3, d dVar) {
            super(str, th);
            this.a = str2;
            this.b = z;
            this.c = mVar;
            this.d = str3;
            this.e = dVar;
        }
    }

    public void F1() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void w1() {
    }

    public void u1(long j) {
    }

    public void x1(S2.f fVar) {
    }

    public void y1(M2.q qVar) {
    }
}
