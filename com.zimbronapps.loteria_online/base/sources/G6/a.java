package g6;

import L5.m;
import L5.u;
import L5.z;
import S5.D;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcbt;
import f6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a {
    public static void load(Context context, String str, AdRequest adRequest, b bVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        t.m(adRequest, "AdRequest cannot be null.");
        t.m(bVar, "LoadCallback cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new d(context, str, adRequest, bVar));
                return;
            }
        }
        new zzcbt(context, str).zza(adRequest.a(), bVar);
    }

    public abstract z getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(f6.a aVar);

    public abstract void setOnPaidEventListener(L5.t tVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, u uVar);

    public static void load(Context context, String str, M5.a aVar, b bVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        t.m(aVar, "AdManagerAdRequest cannot be null.");
        t.m(bVar, "LoadCallback cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new c(context, str, aVar, bVar));
                return;
            }
        }
        new zzcbt(context, str).zza(aVar.a(), bVar);
    }
}
