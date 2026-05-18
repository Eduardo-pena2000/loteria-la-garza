package h3;

import M2.q;
import R2.w;
import h3.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends e {
    public final f j;
    public f.b k;
    public long l;
    public volatile boolean m;

    public l(R2.f fVar, R2.j jVar, q qVar, int i, Object obj, f fVar2) {
        super(fVar, jVar, 2, qVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = fVar2;
    }

    public void b() {
        if (this.l == 0) {
            this.j.c(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            R2.j e = this.b.e(this.l);
            w wVar = this.i;
            o3.i iVar = new o3.i(wVar, e.g, wVar.g(e));
            while (!this.m && this.j.a(iVar)) {
                try {
                } finally {
                    this.l = iVar.b() - this.b.g;
                }
            }
        } finally {
            R2.i.a(this.i);
        }
    }

    public void c() {
        this.m = true;
    }

    public void g(f.b bVar) {
        this.k = bVar;
    }
}
