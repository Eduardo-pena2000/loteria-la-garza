package f6;

import L5.E;
import L5.m;
import L5.u;
import L5.z;
import S5.D;
import W5.p;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbi;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        try {
            return E.a(context).zzf(str);
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(Context context, String str, AdRequest adRequest, d dVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        t.m(adRequest, "AdRequest cannot be null.");
        t.m(dVar, "LoadCallback cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new h(context, str, adRequest, dVar));
                return;
            }
        }
        p.a("Loading on UI thread");
        new zzcbi(context, str).zza(adRequest.a(), dVar);
    }

    @Deprecated
    public static c pollAd(Context context, String str) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        try {
            zzcaz zzg = E.a(context).zzg(str);
            if (zzg != null) {
                return new zzcbi(context, str, zzg);
            }
            p.i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract z getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(L5.t tVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, u uVar);

    public static void load(Context context, String str, M5.a aVar, d dVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "AdUnitId cannot be null.");
        t.m(aVar, "AdManagerAdRequest cannot be null.");
        t.m(dVar, "LoadCallback cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                p.a("Loading on background thread");
                W5.c.b.execute(new g(context, str, aVar, dVar));
                return;
            }
        }
        p.a("Loading on UI thread");
        new zzcbi(context, str).zza(aVar.a(), dVar);
    }
}
