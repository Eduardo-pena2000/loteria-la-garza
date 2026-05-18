package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbl {
    public static final zzcaz zza(Context context, String str, zzbtt zzbttVar) {
        try {
            IBinder zze = ((zzcbd) W5.t.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbk.zza)).zze(N6.b.s1(context), str, zzbttVar, 254715000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcaz ? (zzcaz) queryLocalInterface : new zzcax(zze);
        } catch (W5.s e) {
            e = e;
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e2) {
            e = e2;
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
