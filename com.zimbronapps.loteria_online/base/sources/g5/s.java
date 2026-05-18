package G5;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;
    public final Ba.a e;
    public final Ba.a f;
    public final Ba.a g;
    public final Ba.a h;
    public final Ba.a i;

    public s(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5, Ba.a aVar6, Ba.a aVar7, Ba.a aVar8, Ba.a aVar9) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
        this.h = aVar8;
        this.i = aVar9;
    }

    public static s a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5, Ba.a aVar6, Ba.a aVar7, Ba.a aVar8, Ba.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, A5.e eVar, H5.d dVar, x xVar, Executor executor, I5.b bVar, J5.a aVar, J5.a aVar2, H5.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.a.get(), (A5.e) this.b.get(), (H5.d) this.c.get(), (x) this.d.get(), (Executor) this.e.get(), (I5.b) this.f.get(), (J5.a) this.g.get(), (J5.a) this.h.get(), (H5.c) this.i.get());
    }
}
