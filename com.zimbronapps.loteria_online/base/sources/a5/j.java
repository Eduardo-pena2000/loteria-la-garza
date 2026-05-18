package A5;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements B5.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;

    public j(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static j a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, J5.a aVar, J5.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.a.get(), (J5.a) this.b.get(), (J5.a) this.c.get());
    }
}
