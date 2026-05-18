package J3;

import P2.z;
import o3.q;
import o3.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    public final z k = new z(255);

    public boolean a(q qVar, boolean z) {
        b();
        this.k.P(27);
        if (!s.b(qVar, this.k.e(), 0, 27, z) || this.k.I() != 1332176723) {
            return false;
        }
        int G = this.k.G();
        this.a = G;
        if (G != 0) {
            if (z) {
                return false;
            }
            throw M2.z.d("unsupported bit stream revision");
        }
        this.b = this.k.G();
        this.c = this.k.u();
        this.d = this.k.w();
        this.e = this.k.w();
        this.f = this.k.w();
        int G2 = this.k.G();
        this.g = G2;
        this.h = G2 + 27;
        this.k.P(G2);
        if (!s.b(qVar, this.k.e(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.G();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(q qVar) {
        return d(qVar, -1L);
    }

    public boolean d(q qVar, long j) {
        P2.a.a(qVar.b() == qVar.i());
        this.k.P(4);
        while (true) {
            if ((j == -1 || qVar.b() + 4 < j) && s.b(qVar, this.k.e(), 0, 4, true)) {
                this.k.T(0);
                if (this.k.I() == 1332176723) {
                    qVar.f();
                    return true;
                }
                qVar.m(1);
            }
        }
        do {
            if (j != -1 && qVar.b() >= j) {
                break;
            }
        } while (qVar.c(1) != -1);
        return false;
    }
}
