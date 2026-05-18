package N5;

import L5.E;
import L5.f;
import L5.m;
import L5.z;
import S5.D;
import W5.c;
import W5.p;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a {

    public static abstract class a extends f {
    }

    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return E.a(context).zzh(str);
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(Context context, String str, AdRequest adRequest, a aVar) {
        t.m(context, "Context cannot be null.");
        t.m(str, "adUnitId cannot be null.");
        t.m(adRequest, "AdRequest cannot be null.");
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzd.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                c.b.execute(new b(context, str, adRequest, aVar));
                return;
            }
        }
        new zzbff(context, str, adRequest.a(), aVar).zza();
    }

    @Deprecated
    public static a pollAd(Context context, String str) {
        try {
            zzbex zzi = E.a(context).zzi(str);
            if (zzi != null) {
                return new zzbet(zzi, str);
            }
            p.i("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract z getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(L5.t tVar);

    public abstract void show(Activity activity);
}
