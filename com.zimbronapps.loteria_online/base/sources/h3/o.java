package h3;

import M2.q;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends a {
    public final int o;
    public final q p;
    public long q;
    public boolean r;

    public o(R2.f fVar, R2.j jVar, q qVar, int i, Object obj, long j, long j2, long j3, int i2, q qVar2) {
        super(fVar, jVar, qVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = qVar2;
    }

    public void b() {
        c j = j();
        j.b(0L);
        O e = j.e(0, this.o);
        e.b(this.p);
        try {
            long g = this.i.g(this.b.e(this.q));
            if (g != -1) {
                g += this.q;
            }
            o3.i iVar = new o3.i(this.i, this.q, g);
            for (int i = 0; i != -1; i = e.c(iVar, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            e.a(this.g, 1, (int) this.q, 0, null);
            R2.i.a(this.i);
            this.r = true;
        } catch (Throwable th) {
            R2.i.a(this.i);
            throw th;
        }
    }

    public boolean h() {
        return this.r;
    }

    public void c() {
    }
}
