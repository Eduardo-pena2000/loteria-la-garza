package M5;

import S5.D;
import android.content.Context;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbrc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c extends X5.a {
    public static void load(Context context, String str, a aVar, d dVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        t.m(aVar, "AdManagerAdRequest cannot be null.");
        t.m(dVar, "LoadCallback cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzi.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new g(context, str, aVar, dVar));
                return;
            }
        }
        new zzbrc(context, str).zza(aVar.a(), dVar);
    }

    public abstract void setAppEventListener(e eVar);
}
