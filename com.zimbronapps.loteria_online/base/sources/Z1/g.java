package z1;

import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends y1.e {
    public String A0;
    public String B0;
    public String C0;
    public String D0;
    public int E0;
    public A1.b q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public float y0;
    public float z0;

    public g(y1.g gVar, g.d dVar) {
        super(gVar, dVar);
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        if (dVar == g.d.ROW) {
            this.w0 = 1;
        } else if (dVar == g.d.COLUMN) {
            this.x0 = 1;
        }
    }

    public void A0(float f) {
        this.y0 = f;
    }

    public void B0(int i) {
        this.v0 = i;
    }

    public void C0(int i) {
        this.u0 = i;
    }

    public void D0(int i) {
        this.s0 = i;
    }

    public void E0(int i) {
        this.r0 = i;
    }

    public void F0(int i) {
        this.t0 = i;
    }

    public void G0(String str) {
        this.A0 = str;
    }

    public void H0(int i) {
        if (super.v0() == g.d.COLUMN) {
            return;
        }
        this.w0 = i;
    }

    public void I0(String str) {
        this.D0 = str;
    }

    public void J0(String str) {
        this.C0 = str;
    }

    public void K0(float f) {
        this.z0 = f;
    }

    public void apply() {
        u0();
        this.q0.s2(this.v0);
        int i = this.w0;
        if (i != 0) {
            this.q0.u2(i);
        }
        int i2 = this.x0;
        if (i2 != 0) {
            this.q0.p2(i2);
        }
        float f = this.y0;
        if (f != 0.0f) {
            this.q0.r2(f);
        }
        float f2 = this.z0;
        if (f2 != 0.0f) {
            this.q0.x2(f2);
        }
        String str = this.A0;
        if (str != null && !str.isEmpty()) {
            this.q0.t2(this.A0);
        }
        String str2 = this.B0;
        if (str2 != null && !str2.isEmpty()) {
            this.q0.o2(this.B0);
        }
        String str3 = this.C0;
        if (str3 != null && !str3.isEmpty()) {
            this.q0.w2(this.C0);
        }
        String str4 = this.D0;
        if (str4 != null && !str4.isEmpty()) {
            this.q0.v2(this.D0);
        }
        this.q0.q2(this.E0);
        this.q0.O1(this.r0);
        this.q0.L1(this.s0);
        this.q0.P1(this.t0);
        this.q0.K1(this.u0);
        t0();
    }

    public B1.j u0() {
        if (this.q0 == null) {
            this.q0 = new A1.b();
        }
        return this.q0;
    }

    public void w0(String str) {
        this.B0 = str;
    }

    public void x0(int i) {
        if (super.v0() == g.d.ROW) {
            return;
        }
        this.x0 = i;
    }

    public void y0(int i) {
        this.E0 = i;
    }

    public void z0(String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] split = str.split("\\|");
        this.E0 = 0;
        for (String str2 : split) {
            String lowerCase = str2.toLowerCase();
            lowerCase.hashCode();
            if (lowerCase.equals("subgridbycolrow")) {
                this.E0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.E0 |= 2;
            }
        }
    }
}
