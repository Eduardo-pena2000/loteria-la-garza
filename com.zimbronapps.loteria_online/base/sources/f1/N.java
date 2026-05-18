package f1;

import Z0.W0;
import Z0.X0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {
    public static final long a(long j, long j2) {
        int j3;
        int l = W0.l(j);
        int k = W0.k(j);
        if (W0.p(j2, j)) {
            if (W0.d(j2, j)) {
                l = W0.l(j2);
                k = l;
            } else {
                if (W0.d(j, j2)) {
                    j3 = W0.j(j2);
                } else if (W0.e(j2, l)) {
                    l = W0.l(j2);
                    j3 = W0.j(j2);
                } else {
                    k = W0.l(j2);
                }
                k -= j3;
            }
        } else if (k > W0.l(j2)) {
            l -= W0.j(j2);
            j3 = W0.j(j2);
            k -= j3;
        }
        return X0.b(l, k);
    }
}
