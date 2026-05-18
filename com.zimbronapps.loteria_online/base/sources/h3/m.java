package h3;

import M2.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m extends e {
    public final long j;

    public m(R2.f fVar, R2.j jVar, q qVar, int i, Object obj, long j, long j2, long j3) {
        super(fVar, jVar, 1, qVar, i, obj, j, j2);
        P2.a.e(qVar);
        this.j = j3;
    }

    public long g() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean h();
}
