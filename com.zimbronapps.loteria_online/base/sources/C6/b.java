package c6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b implements zzikg {
    public final zzikp a;
    public final zzikp b;

    public b(zzikp zzikpVar, zzikp zzikpVar2) {
        this.a = zzikpVar;
        this.b = zzikpVar2;
    }

    public static b a(zzikp zzikpVar, zzikp zzikpVar2) {
        return new b(zzikpVar, zzikpVar2);
    }

    public static a c(Context context, W5.a aVar) {
        return new a(context, aVar);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return c((Context) this.a.zzb(), (W5.a) this.b.zzb());
    }
}
