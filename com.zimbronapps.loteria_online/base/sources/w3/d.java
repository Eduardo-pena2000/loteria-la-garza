package w3;

import o3.q;
import o3.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends z {
    public final long b;

    public d(q qVar, long j) {
        super(qVar);
        P2.a.a(qVar.b() >= j);
        this.b = j;
    }

    public long a() {
        return super.a() - this.b;
    }

    public long b() {
        return super.b() - this.b;
    }

    public long i() {
        return super.i() - this.b;
    }
}
