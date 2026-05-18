package gb;

import Ca.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class h extends g {
    public /* synthetic */ h(fb.e eVar, Ga.i iVar, int i, eb.a aVar, int i2, kotlin.jvm.internal.k kVar) {
        this(eVar, (i2 & 2) != 0 ? Ga.j.a : iVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? eb.a.a : aVar);
    }

    public e i(Ga.i iVar, int i, eb.a aVar) {
        return new h(this.d, iVar, i, aVar);
    }

    public fb.e j() {
        return this.d;
    }

    public Object q(fb.f fVar, Ga.e eVar) {
        Object collect = this.d.collect(fVar, eVar);
        return collect == Ha.c.f() ? collect : I.a;
    }

    public h(fb.e eVar, Ga.i iVar, int i, eb.a aVar) {
        super(eVar, iVar, i, aVar);
    }
}
