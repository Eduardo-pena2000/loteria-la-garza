package T3;

import L3.s;
import P2.z;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements s {
    public final z a = new z();
    public final b b = new b();

    public static int d(z zVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = zVar.f();
            String r = zVar.r();
            i = r == null ? 0 : "STYLE".equals(r) ? 2 : r.startsWith("NOTE") ? 1 : 3;
        }
        zVar.T(i2);
        return i;
    }

    public static void e(z zVar) {
        while (!TextUtils.isEmpty(zVar.r())) {
        }
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, P2.g gVar) {
        d m;
        this.a.R(bArr, i2 + i);
        this.a.T(i);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.a);
            while (!TextUtils.isEmpty(this.a.r())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int d = d(this.a);
                if (d == 0) {
                    L3.i.c(new j(arrayList2), bVar, gVar);
                    return;
                }
                if (d == 1) {
                    e(this.a);
                } else if (d == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.a.r();
                    arrayList.addAll(this.b.d(this.a));
                } else if (d == 3 && (m = e.m(this.a, arrayList)) != null) {
                    arrayList2.add(m);
                }
            }
        } catch (M2.z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int c() {
        return 1;
    }
}
