package G5;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;

    public w(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static w a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, H5.d dVar, x xVar, I5.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.a.get(), (H5.d) this.b.get(), (x) this.c.get(), (I5.b) this.d.get());
    }
}
