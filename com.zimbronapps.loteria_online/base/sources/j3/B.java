package J3;

import J3.i;
import P2.K;
import P2.z;
import java.util.Arrays;
import o3.J;
import o3.q;
import o3.v;
import o3.w;
import o3.x;
import o3.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends i {
    public y n;
    public a o;

    public static final class a implements g {
        public y a;
        public y.a b;
        public long c = -1;
        public long d = -1;

        public a(y yVar, y.a aVar) {
            this.a = yVar;
            this.b = aVar;
        }

        public long a(q qVar) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        public J b() {
            P2.a.f(this.c != -1);
            return new x(this.a, this.c);
        }

        public void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[K.h(jArr, j, true, true)];
        }

        public void d(long j) {
            this.c = j;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(z zVar) {
        return zVar.a() >= 5 && zVar.G() == 127 && zVar.I() == 1179402563;
    }

    public long f(z zVar) {
        if (o(zVar.e())) {
            return n(zVar);
        }
        return -1L;
    }

    public boolean h(z zVar, long j, i.b bVar) {
        byte[] e = zVar.e();
        y yVar = this.n;
        if (yVar == null) {
            y yVar2 = new y(e, 17);
            this.n = yVar2;
            bVar.a = yVar2.g(Arrays.copyOfRange(e, 9, zVar.g()), null);
            return true;
        }
        if ((e[0] & Byte.MAX_VALUE) == 3) {
            y.a f = w.f(zVar);
            y b = yVar.b(f);
            this.n = b;
            this.o = new a(b, f);
            return true;
        }
        if (!o(e)) {
            return true;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.d(j);
            bVar.b = this.o;
        }
        P2.a.e(bVar.a);
        return false;
    }

    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    public final int n(z zVar) {
        int i = (zVar.e()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            zVar.U(4);
            zVar.N();
        }
        int j = v.j(zVar, i);
        zVar.T(0);
        return j;
    }
}
