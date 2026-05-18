package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdui implements zzikg {
    private final zzikp zza;

    private zzdui(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdui zza(zzikp zzikpVar) {
        return new zzdui(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdaw) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
