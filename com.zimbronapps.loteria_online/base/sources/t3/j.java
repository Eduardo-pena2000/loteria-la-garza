package T3;

import L3.k;
import P2.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements k {
    public final List a;
    public final long[] b;
    public final long[] c;

    public j(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            d dVar = (d) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = dVar.b;
            jArr[i2 + 1] = dVar.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    public static /* synthetic */ int e(d dVar, d dVar2) {
        return f(dVar, dVar2);
    }

    public static /* synthetic */ int f(d dVar, d dVar2) {
        return Long.compare(dVar.b, dVar2.b);
    }

    public int a(long j) {
        int d = K.d(this.c, j, false, false);
        if (d < this.c.length) {
            return d;
        }
        return -1;
    }

    public List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                d dVar = (d) this.a.get(i);
                O2.a aVar = dVar.a;
                if (aVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new i());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((d) arrayList2.get(i3)).a.a().h((-1) - i3, 1).a());
        }
        return arrayList;
    }

    public long c(int i) {
        P2.a.a(i >= 0);
        P2.a.a(i < this.c.length);
        return this.c[i];
    }

    public int d() {
        return this.c.length;
    }
}
