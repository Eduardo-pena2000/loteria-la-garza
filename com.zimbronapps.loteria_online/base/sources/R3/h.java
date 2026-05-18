package R3;

import L3.k;
import P2.K;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements k {
    public final c a;
    public final long[] b;
    public final Map c;
    public final Map d;
    public final Map e;

    public h(c cVar, Map map, Map map2, Map map3) {
        this.a = cVar;
        this.d = map2;
        this.e = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.b = cVar.j();
    }

    public int a(long j) {
        int d = K.d(this.b, j, false, false);
        if (d < this.b.length) {
            return d;
        }
        return -1;
    }

    public List b(long j) {
        return this.a.h(j, this.c, this.d, this.e);
    }

    public long c(int i) {
        return this.b[i];
    }

    public int d() {
        return this.b.length;
    }
}
