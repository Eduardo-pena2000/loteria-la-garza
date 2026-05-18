package o3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {

    public static final class a {
        public long a;
    }

    public static boolean a(P2.z zVar, y yVar, int i) {
        int j = j(zVar, i);
        return j != -1 && j <= yVar.b;
    }

    public static boolean b(P2.z zVar, int i) {
        return zVar.G() == P2.K.y(zVar.e(), i, zVar.f() - 1, 0);
    }

    public static boolean c(P2.z zVar, y yVar, boolean z, a aVar) {
        try {
            long N = zVar.N();
            if (!z) {
                N *= yVar.b;
            }
            aVar.a = N;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(P2.z zVar, y yVar, int i, a aVar) {
        int f = zVar.f();
        long I = zVar.I();
        long j = I >>> 16;
        if (j != i) {
            return false;
        }
        return g((int) ((I >> 4) & 15), yVar) && f((int) ((I >> 1) & 7), yVar) && !(((I & 1) > 1L ? 1 : ((I & 1) == 1L ? 0 : -1)) == 0) && c(zVar, yVar, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(zVar, yVar, (int) ((I >> 12) & 15)) && e(zVar, yVar, (int) ((I >> 8) & 15)) && b(zVar, f);
    }

    public static boolean e(P2.z zVar, y yVar, int i) {
        int i2 = yVar.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == yVar.f;
        }
        if (i == 12) {
            return zVar.G() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int M = zVar.M();
        if (i == 14) {
            M *= 10;
        }
        return M == i2;
    }

    public static boolean f(int i, y yVar) {
        return i == 0 || i == yVar.i;
    }

    public static boolean g(int i, y yVar) {
        return i <= 7 ? i == yVar.g - 1 : i <= 10 && yVar.g == 2;
    }

    public static boolean h(q qVar, y yVar, int i, a aVar) {
        long i2 = qVar.i();
        byte[] bArr = new byte[2];
        qVar.p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            qVar.f();
            qVar.j((int) (i2 - qVar.b()));
            return false;
        }
        P2.z zVar = new P2.z(16);
        System.arraycopy(bArr, 0, zVar.e(), 0, 2);
        zVar.S(s.c(qVar, zVar.e(), 2, 14));
        qVar.f();
        qVar.j((int) (i2 - qVar.b()));
        return d(zVar, yVar, i, aVar);
    }

    public static long i(q qVar, y yVar) {
        qVar.f();
        qVar.j(1);
        byte[] bArr = new byte[1];
        qVar.p(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        qVar.j(2);
        int i = z ? 7 : 6;
        P2.z zVar = new P2.z(i);
        zVar.S(s.c(qVar, zVar.e(), 0, i));
        qVar.f();
        a aVar = new a();
        if (c(zVar, yVar, z, aVar)) {
            return aVar.a;
        }
        throw M2.z.a(null, null);
    }

    public static int j(P2.z zVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zVar.G() + 1;
            case 7:
                return zVar.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
