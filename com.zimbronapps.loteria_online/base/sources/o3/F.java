package o3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static void a(long j, P2.z zVar, O[] oArr) {
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int c = c(zVar);
            int c2 = c(zVar);
            int f = zVar.f() + c2;
            if (c2 == -1 || c2 > zVar.a()) {
                P2.o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f = zVar.g();
            } else if (c == 4 && c2 >= 8) {
                int G = zVar.G();
                int M = zVar.M();
                int p = M == 49 ? zVar.p() : 0;
                int G2 = zVar.G();
                if (M == 47) {
                    zVar.U(1);
                }
                boolean z = G == 181 && (M == 49 || M == 47) && G2 == 3;
                if (M == 49) {
                    z &= p == 1195456820;
                }
                if (z) {
                    b(j, zVar, oArr);
                }
            }
            zVar.T(f);
        }
    }

    public static void b(long j, P2.z zVar, O[] oArr) {
        int G = zVar.G();
        if ((G & 64) != 0) {
            zVar.U(1);
            int i = (G & 31) * 3;
            int f = zVar.f();
            for (O o : oArr) {
                zVar.T(f);
                o.f(zVar, i);
                P2.a.f(j != -9223372036854775807L);
                o.a(j, 1, i, 0, null);
            }
        }
    }

    public static int c(P2.z zVar) {
        int i = 0;
        while (zVar.a() != 0) {
            int G = zVar.G();
            i += G;
            if (G != 255) {
                return i;
            }
        }
        return -1;
    }
}
