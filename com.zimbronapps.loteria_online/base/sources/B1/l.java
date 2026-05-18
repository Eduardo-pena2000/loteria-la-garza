package B1;

import B1.e;
import C1.b;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l extends j {
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 0;
    public boolean V0 = false;
    public int W0 = 0;
    public int X0 = 0;
    public b.a Y0 = new b.a();
    public b.b Z0 = null;

    public int A1() {
        return this.O0;
    }

    public int B1() {
        return this.T0;
    }

    public int C1() {
        return this.U0;
    }

    public int D1() {
        return this.N0;
    }

    public void F1(e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        while (this.Z0 == null && L() != null) {
            this.Z0 = ((f) L()).N1();
        }
        b.a aVar = this.Y0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.Z0.b(eVar, aVar);
        eVar.n1(this.Y0.e);
        eVar.O0(this.Y0.f);
        eVar.N0(this.Y0.h);
        eVar.D0(this.Y0.g);
    }

    public boolean G1() {
        e eVar = this.a0;
        b.b N1 = eVar != null ? ((f) eVar).N1() : null;
        if (N1 == null) {
            return false;
        }
        for (int i = 0; i < this.M0; i++) {
            e eVar2 = this.L0[i];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u = eVar2.u(0);
                e.b u2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u != bVar || eVar2.w == 1 || u2 != bVar || eVar2.x == 1) {
                    if (u == bVar) {
                        u = e.b.WRAP_CONTENT;
                    }
                    if (u2 == bVar) {
                        u2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.Y0;
                    aVar.a = u;
                    aVar.b = u2;
                    aVar.c = eVar2.Y();
                    this.Y0.d = eVar2.x();
                    N1.b(eVar2, this.Y0);
                    eVar2.n1(this.Y0.e);
                    eVar2.O0(this.Y0.f);
                    eVar2.D0(this.Y0.g);
                }
            }
        }
        return true;
    }

    public boolean H1() {
        return this.V0;
    }

    public void I1(boolean z) {
        this.V0 = z;
    }

    public void J1(int i, int i2) {
        this.W0 = i;
        this.X0 = i2;
    }

    public void K1(int i) {
        this.O0 = i;
    }

    public void L1(int i) {
        this.S0 = i;
    }

    public void M1(int i) {
        this.P0 = i;
        this.T0 = i;
    }

    public void N1(int i) {
        this.Q0 = i;
        this.U0 = i;
    }

    public void O1(int i) {
        this.R0 = i;
        this.T0 = i;
        this.U0 = i;
    }

    public void P1(int i) {
        this.N0 = i;
    }

    public void b(f fVar) {
        w1();
    }

    public void w1() {
        for (int i = 0; i < this.M0; i++) {
            e eVar = this.L0[i];
            if (eVar != null) {
                eVar.X0(true);
            }
        }
    }

    public boolean x1(HashSet hashSet) {
        for (int i = 0; i < this.M0; i++) {
            if (hashSet.contains(this.L0[i])) {
                return true;
            }
        }
        return false;
    }

    public int y1() {
        return this.X0;
    }

    public int z1() {
        return this.W0;
    }

    public void E1(int i, int i2, int i3, int i4) {
    }
}
