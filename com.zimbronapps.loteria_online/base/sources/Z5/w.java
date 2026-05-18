package z5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;
    public final Ba.a e;

    public w(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public static w a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(J5.a aVar, J5.a aVar2, F5.e eVar, G5.r rVar, G5.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((J5.a) this.a.get(), (J5.a) this.b.get(), (F5.e) this.c.get(), (G5.r) this.d.get(), (G5.v) this.e.get());
    }
}
