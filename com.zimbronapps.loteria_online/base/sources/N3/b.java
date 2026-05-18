package n3;

import M2.q;
import P2.K;
import P2.z;
import S2.f;
import T2.X0;
import T2.n;
import g3.w;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends n {
    public final f r;
    public final z s;
    public long t;
    public a u;
    public long v;

    public b() {
        super(6);
        this.r = new f(1);
        this.s = new z();
    }

    public int a(q qVar) {
        return "application/x-camera-motion".equals(qVar.n) ? X0.t(4) : X0.t(0);
    }

    public boolean b() {
        return k();
    }

    public void b0() {
        q0();
    }

    public void e0(long j, boolean z) {
        this.v = Long.MIN_VALUE;
        q0();
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    public void h(long j, long j2) {
        while (!k() && this.v < 100000 + j) {
            this.r.f();
            if (m0(V(), this.r, 0) != -4 || this.r.i()) {
                return;
            }
            long j3 = this.r.f;
            this.v = j3;
            boolean z = j3 < X();
            if (this.u != null && !z) {
                this.r.q();
                float[] p0 = p0((ByteBuffer) K.i(this.r.d));
                if (p0 != null) {
                    ((a) K.i(this.u)).c(this.v - this.t, p0);
                }
            }
        }
    }

    public boolean isReady() {
        return true;
    }

    public void k0(q[] qVarArr, long j, long j2, w.b bVar) {
        this.t = j2;
    }

    public final float[] p0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.s.R(byteBuffer.array(), byteBuffer.limit());
        this.s.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.s.t());
        }
        return fArr;
    }

    public final void q0() {
        a aVar = this.u;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void v(int i, Object obj) {
        if (i == 8) {
            this.u = (a) obj;
        } else {
            super.v(i, obj);
        }
    }
}
