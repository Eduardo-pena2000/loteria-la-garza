package B8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u implements D8.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;

    public u(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static u a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        return new u(aVar, aVar2, aVar3, aVar4);
    }

    public static l c(B7.g gVar, E8.j jVar, Ga.i iVar, T t) {
        return new l(gVar, jVar, iVar, t);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c((B7.g) this.a.get(), (E8.j) this.b.get(), (Ga.i) this.c.get(), (T) this.d.get());
    }
}
