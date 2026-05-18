package A5;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l implements B5.b {
    public final Ba.a a;
    public final Ba.a b;

    public l(Ba.a aVar, Ba.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static l a(Ba.a aVar, Ba.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.a.get(), this.b.get());
    }
}
