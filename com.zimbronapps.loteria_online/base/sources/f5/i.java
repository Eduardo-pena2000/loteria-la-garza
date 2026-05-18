package F5;

import G5.x;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;
    public final Ba.a d;

    public i(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static i a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, H5.d dVar, G5.f fVar, J5.a aVar) {
        return (x) B5.d.d(h.a(context, dVar, fVar, aVar));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.a.get(), (H5.d) this.b.get(), (G5.f) this.c.get(), (J5.a) this.d.get());
    }
}
