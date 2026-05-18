package U3;

import M2.q;
import U3.K;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements K.c {
    public final int a;
    public final List b;

    public j(int i) {
        this(i, t7.r.s());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public U3.K a(int r5, U3.K.b r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.j.a(int, U3.K$b):U3.K");
    }

    public SparseArray b() {
        return new SparseArray();
    }

    public final F c(K.b bVar) {
        return new F(e(bVar));
    }

    public final M d(K.b bVar) {
        return new M(e(bVar));
    }

    public final List e(K.b bVar) {
        String str;
        int i;
        if (f(32)) {
            return this.b;
        }
        P2.z zVar = new P2.z(bVar.e);
        ArrayList arrayList = this.b;
        while (zVar.a() > 0) {
            int G = zVar.G();
            int f = zVar.f() + zVar.G();
            if (G == 134) {
                arrayList = new ArrayList();
                int G2 = zVar.G() & 31;
                for (int i2 = 0; i2 < G2; i2++) {
                    String D = zVar.D(3);
                    int G3 = zVar.G();
                    boolean z = (G3 & 128) != 0;
                    if (z) {
                        i = G3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte G4 = (byte) zVar.G();
                    zVar.U(1);
                    arrayList.add(new q.b().o0(str).e0(D).L(i).b0(z ? P2.d.b((G4 & 64) != 0) : null).K());
                }
            }
            zVar.T(f);
        }
        return arrayList;
    }

    public final boolean f(int i) {
        return (i & this.a) != 0;
    }

    public j(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
