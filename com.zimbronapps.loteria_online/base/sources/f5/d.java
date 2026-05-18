package F5;

import G5.x;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;
    public final Ba.a e;

    public d(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public static d a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, A5.e eVar, x xVar, H5.d dVar, I5.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.a.get(), (A5.e) this.b.get(), (x) this.c.get(), (H5.d) this.d.get(), (I5.b) this.e.get());
    }
}
