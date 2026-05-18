package z1;

import java.util.HashMap;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f extends y1.e {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public B1.g q0;
    public HashMap r0;
    public HashMap s0;
    public HashMap t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public f(y1.g gVar, g.d dVar) {
        super(gVar, dVar);
        this.u0 = 0;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = 2;
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        if (dVar == g.d.VERTICAL_FLOW) {
            this.K0 = 1;
        }
    }

    public void A0(int i) {
        this.w0 = i;
    }

    public void B0(int i) {
        this.C0 = i;
    }

    public void C0(int i) {
        this.E0 = i;
    }

    public void D0(int i) {
        this.y0 = i;
    }

    public void E0(float f) {
        this.O0 = f;
    }

    public void F0(int i) {
        this.A0 = i;
    }

    public void G0(float f) {
        this.M0 = f;
    }

    public void H0(int i) {
        this.x0 = i;
    }

    public void I0(int i) {
        this.J0 = i;
    }

    public void J0(int i) {
        this.K0 = i;
    }

    public void K0(int i) {
        this.I0 = i;
    }

    public void L0(int i) {
        this.F0 = i;
    }

    public void M0(int i) {
        this.G0 = i;
    }

    public void N0(int i) {
        this.H0 = i;
    }

    public void O0(int i) {
        this.B0 = i;
    }

    public void P0(int i) {
        this.D0 = i;
    }

    public void Q0(int i) {
        this.v0 = i;
    }

    public void R0(int i) {
        this.u0 = i;
    }

    public void apply() {
        u0();
        b(this.q0);
        this.q0.E2(this.K0);
        this.q0.J2(this.u0);
        int i = this.J0;
        if (i != -1) {
            this.q0.D2(i);
        }
        int i2 = this.F0;
        if (i2 != 0) {
            this.q0.M1(i2);
        }
        int i3 = this.H0;
        if (i3 != 0) {
            this.q0.P1(i3);
        }
        int i4 = this.G0;
        if (i4 != 0) {
            this.q0.N1(i4);
        }
        int i5 = this.I0;
        if (i5 != 0) {
            this.q0.K1(i5);
        }
        int i6 = this.E0;
        if (i6 != 0) {
            this.q0.x2(i6);
        }
        int i7 = this.D0;
        if (i7 != 0) {
            this.q0.H2(i7);
        }
        float f = this.i;
        if (f != 0.5f) {
            this.q0.w2(f);
        }
        float f2 = this.N0;
        if (f2 != 0.5f) {
            this.q0.r2(f2);
        }
        float f3 = this.O0;
        if (f3 != 0.5f) {
            this.q0.z2(f3);
        }
        float f4 = this.j;
        if (f4 != 0.5f) {
            this.q0.G2(f4);
        }
        float f5 = this.L0;
        if (f5 != 0.5f) {
            this.q0.t2(f5);
        }
        float f6 = this.M0;
        if (f6 != 0.5f) {
            this.q0.B2(f6);
        }
        int i8 = this.C0;
        if (i8 != 2) {
            this.q0.v2(i8);
        }
        int i9 = this.B0;
        if (i9 != 2) {
            this.q0.F2(i9);
        }
        int i10 = this.v0;
        if (i10 != -1) {
            this.q0.I2(i10);
        }
        int i11 = this.w0;
        if (i11 != -1) {
            this.q0.u2(i11);
        }
        int i12 = this.x0;
        if (i12 != -1) {
            this.q0.C2(i12);
        }
        int i13 = this.y0;
        if (i13 != -1) {
            this.q0.y2(i13);
        }
        int i14 = this.z0;
        if (i14 != -1) {
            this.q0.s2(i14);
        }
        int i15 = this.A0;
        if (i15 != -1) {
            this.q0.A2(i15);
        }
        t0();
    }

    public B1.j u0() {
        if (this.q0 == null) {
            this.q0 = new B1.g();
        }
        return this.q0;
    }

    public void w0(String str, float f, float f2, float f3) {
        super.s0(str);
        if (!Float.isNaN(f)) {
            if (this.r0 == null) {
                this.r0 = new HashMap();
            }
            this.r0.put(str, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            if (this.s0 == null) {
                this.s0 = new HashMap();
            }
            this.s0.put(str, Float.valueOf(f2));
        }
        if (Float.isNaN(f3)) {
            return;
        }
        if (this.t0 == null) {
            this.t0 = new HashMap();
        }
        this.t0.put(str, Float.valueOf(f3));
    }

    public void x0(float f) {
        this.N0 = f;
    }

    public void y0(int i) {
        this.z0 = i;
    }

    public void z0(float f) {
        this.L0 = f;
    }
}
