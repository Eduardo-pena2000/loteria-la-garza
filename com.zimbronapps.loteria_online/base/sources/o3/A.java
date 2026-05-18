package O3;

import L3.e;
import L3.s;
import O2.a;
import P2.K;
import P2.g;
import P2.z;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements s {
    public final z a = new z();
    public final z b = new z();
    public final a c = new a();
    public Inflater d;

    public static final class a {
        public final z a = new z();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public static /* synthetic */ void a(a aVar, z zVar, int i) {
            aVar.g(zVar, i);
        }

        public static /* synthetic */ void b(a aVar, z zVar, int i) {
            aVar.e(zVar, i);
        }

        public static /* synthetic */ void c(a aVar, z zVar, int i) {
            aVar.f(zVar, i);
        }

        public O2.a d() {
            int i;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.g() == 0 || this.a.f() != this.a.g() || !this.c) {
                return null;
            }
            this.a.T(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int G = this.a.G();
                if (G != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.b[G];
                } else {
                    int G2 = this.a.G();
                    if (G2 != 0) {
                        i = ((G2 & 64) == 0 ? G2 & 63 : ((G2 & 63) << 8) | this.a.G()) + i3;
                        Arrays.fill(iArr, i3, i, (G2 & 128) == 0 ? this.b[0] : this.b[this.a.G()]);
                    }
                }
                i3 = i;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).k(this.f / this.d).l(0).h(this.g / this.e, 0).i(0).n(this.h / this.d).g(this.i / this.e).a();
        }

        public final void e(z zVar, int i) {
            int J;
            if (i < 4) {
                return;
            }
            zVar.U(3);
            int i2 = i - 4;
            if ((zVar.G() & 128) != 0) {
                if (i2 < 7 || (J = zVar.J()) < 4) {
                    return;
                }
                this.h = zVar.M();
                this.i = zVar.M();
                this.a.P(J - 4);
                i2 = i - 11;
            }
            int f = this.a.f();
            int g = this.a.g();
            if (f >= g || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, g - f);
            zVar.l(this.a.e(), f, min);
            this.a.T(f + min);
        }

        public final void f(z zVar, int i) {
            if (i < 19) {
                return;
            }
            this.d = zVar.M();
            this.e = zVar.M();
            zVar.U(11);
            this.f = zVar.M();
            this.g = zVar.M();
        }

        public final void g(z zVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            zVar.U(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int G = zVar.G();
                int G2 = zVar.G();
                int G3 = zVar.G();
                int G4 = zVar.G();
                double d = G2;
                double d2 = G3 - 128;
                double d3 = G4 - 128;
                this.b[G] = (K.p((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (zVar.G() << 24) | (K.p((int) ((1.402d * d2) + d), 0, 255) << 16) | K.p((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.P(0);
            this.c = false;
        }
    }

    public static O2.a e(z zVar, a aVar) {
        int g = zVar.g();
        int G = zVar.G();
        int M = zVar.M();
        int f = zVar.f() + M;
        O2.a aVar2 = null;
        if (f > g) {
            zVar.T(g);
            return null;
        }
        if (G != 128) {
            switch (G) {
                case 20:
                    a.a(aVar, zVar, M);
                    break;
                case 21:
                    a.b(aVar, zVar, M);
                    break;
                case 22:
                    a.c(aVar, zVar, M);
                    break;
            }
        } else {
            aVar2 = aVar.d();
            aVar.h();
        }
        zVar.T(f);
        return aVar2;
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, g gVar) {
        this.a.R(bArr, i2 + i);
        this.a.T(i);
        d(this.a);
        this.c.h();
        ArrayList arrayList = new ArrayList();
        while (this.a.a() >= 3) {
            O2.a e = e(this.a, this.c);
            if (e != null) {
                arrayList.add(e);
            }
        }
        gVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }

    public final void d(z zVar) {
        if (zVar.a() <= 0 || zVar.j() != 120) {
            return;
        }
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (K.v0(zVar, this.b, this.d)) {
            zVar.R(this.b.e(), this.b.g());
        }
    }
}
