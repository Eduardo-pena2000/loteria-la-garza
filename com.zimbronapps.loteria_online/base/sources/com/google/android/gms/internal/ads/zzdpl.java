package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpl implements zzboh {
    private final /* synthetic */ zzdpm zza;
    private final /* synthetic */ zzbmj zzb;

    public /* synthetic */ zzdpl(zzdpm zzdpmVar, zzbmj zzbmjVar) {
        this.zza = zzdpmVar;
        this.zzb = zzbmjVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzdpm zzdpmVar = this.zza;
        try {
            zzdpmVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            int i = o0.b;
            W5.p.c("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbmj zzbmjVar = this.zzb;
        zzdpmVar.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbmjVar == null) {
            int i2 = o0.b;
            W5.p.a("Received unconfirmed click but UnconfirmedClickListener is null.");
        } else {
            try {
                zzbmjVar.zze(str);
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
    }
}
