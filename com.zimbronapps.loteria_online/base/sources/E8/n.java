package E8;

import B8.Z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n implements D8.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;

    public n(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static n a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        return new n(aVar, aVar2, aVar3);
    }

    public static m c(Ga.i iVar, Z z, o2.i iVar2) {
        return new m(iVar, z, iVar2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((Ga.i) this.a.get(), (Z) this.b.get(), (o2.i) this.c.get());
    }
}
