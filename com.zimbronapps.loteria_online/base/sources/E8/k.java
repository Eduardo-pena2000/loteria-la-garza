package E8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k implements D8.b {
    public final Ba.a a;
    public final Ba.a b;

    public k(Ba.a aVar, Ba.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static k a(Ba.a aVar, Ba.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((o) this.a.get(), (o) this.b.get());
    }
}
