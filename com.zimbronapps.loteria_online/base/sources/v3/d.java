package V3;

import P2.K;
import P2.o;
import P2.z;
import android.util.Pair;
import o3.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {

    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(q qVar, z zVar) {
            qVar.p(zVar.e(), 0, 8);
            zVar.T(0);
            return new a(zVar.p(), zVar.w());
        }
    }

    public static boolean a(q qVar) {
        z zVar = new z(8);
        int i = a.a(qVar, zVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        qVar.p(zVar.e(), 0, 4);
        zVar.T(0);
        int p = zVar.p();
        if (p == 1463899717) {
            return true;
        }
        o.c("WavHeaderReader", "Unsupported form type: " + p);
        return false;
    }

    public static c b(q qVar) {
        byte[] bArr;
        z zVar = new z(16);
        a d = d(1718449184, qVar, zVar);
        P2.a.f(d.b >= 16);
        qVar.p(zVar.e(), 0, 16);
        zVar.T(0);
        int y = zVar.y();
        int y2 = zVar.y();
        int x = zVar.x();
        int x2 = zVar.x();
        int y3 = zVar.y();
        int y4 = zVar.y();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            qVar.p(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = K.f;
        }
        qVar.m((int) (qVar.i() - qVar.b()));
        return new c(y, y2, x, x2, y3, y4, bArr);
    }

    public static long c(q qVar) {
        z zVar = new z(8);
        a a2 = a.a(qVar, zVar);
        if (a2.a != 1685272116) {
            qVar.f();
            return -1L;
        }
        qVar.j(8);
        zVar.T(0);
        qVar.p(zVar.e(), 0, 8);
        long u = zVar.u();
        qVar.m(((int) a2.b) + 8);
        return u;
    }

    public static a d(int i, q qVar, z zVar) {
        a a2 = a.a(qVar, zVar);
        while (a2.a != i) {
            o.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.a);
            long j = a2.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw M2.z.d("Chunk is too large (~2GB+) to skip; id: " + a2.a);
            }
            qVar.m((int) j2);
            a2 = a.a(qVar, zVar);
        }
        return a2;
    }

    public static Pair e(q qVar) {
        qVar.f();
        a d = d(1684108385, qVar, new z(8));
        qVar.m(8);
        return Pair.create(Long.valueOf(qVar.b()), Long.valueOf(d.b));
    }
}
