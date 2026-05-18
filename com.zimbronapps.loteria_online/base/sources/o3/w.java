package o3;

import java.util.Arrays;
import java.util.List;
import o3.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w {

    public static final class a {
        public y a;

        public a(y yVar) {
            this.a = yVar;
        }
    }

    public static boolean a(q qVar) {
        P2.z zVar = new P2.z(4);
        qVar.p(zVar.e(), 0, 4);
        return zVar.I() == 1716281667;
    }

    public static int b(q qVar) {
        qVar.f();
        P2.z zVar = new P2.z(2);
        qVar.p(zVar.e(), 0, 2);
        int M = zVar.M();
        if ((M >> 2) == 16382) {
            qVar.f();
            return M;
        }
        qVar.f();
        throw M2.z.a("First frame does not start with sync code.", null);
    }

    public static M2.x c(q qVar, boolean z) {
        M2.x a2 = new D().a(qVar, z ? null : C3.h.b);
        if (a2 == null || a2.j() == 0) {
            return null;
        }
        return a2;
    }

    public static M2.x d(q qVar, boolean z) {
        qVar.f();
        long i = qVar.i();
        M2.x c = c(qVar, z);
        qVar.m((int) (qVar.i() - i));
        return c;
    }

    public static boolean e(q qVar, a aVar) {
        qVar.f();
        P2.y yVar = new P2.y(new byte[4]);
        qVar.p(yVar.a, 0, 4);
        boolean g = yVar.g();
        int h = yVar.h(7);
        int h2 = yVar.h(24) + 4;
        if (h == 0) {
            aVar.a = h(qVar);
        } else {
            y yVar2 = aVar.a;
            if (yVar2 == null) {
                throw new IllegalArgumentException();
            }
            if (h == 3) {
                aVar.a = yVar2.b(g(qVar, h2));
            } else if (h == 4) {
                aVar.a = yVar2.c(j(qVar, h2));
            } else if (h == 6) {
                P2.z zVar = new P2.z(h2);
                qVar.readFully(zVar.e(), 0, h2);
                zVar.U(4);
                aVar.a = yVar2.a(t7.r.t(A3.a.b(zVar)));
            } else {
                qVar.m(h2);
            }
        }
        return g;
    }

    public static y.a f(P2.z zVar) {
        zVar.U(1);
        int J = zVar.J();
        long f = zVar.f() + J;
        int i = J / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = zVar.z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = zVar.z();
            zVar.U(2);
            i2++;
        }
        zVar.U((int) (f - zVar.f()));
        return new y.a(jArr, jArr2);
    }

    public static y.a g(q qVar, int i) {
        P2.z zVar = new P2.z(i);
        qVar.readFully(zVar.e(), 0, i);
        return f(zVar);
    }

    public static y h(q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(q qVar) {
        P2.z zVar = new P2.z(4);
        qVar.readFully(zVar.e(), 0, 4);
        if (zVar.I() != 1716281667) {
            throw M2.z.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(q qVar, int i) {
        P2.z zVar = new P2.z(i);
        qVar.readFully(zVar.e(), 0, i);
        zVar.U(4);
        return Arrays.asList(S.k(zVar, false, false).b);
    }
}
