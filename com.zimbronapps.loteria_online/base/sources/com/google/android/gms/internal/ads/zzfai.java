package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfai implements zzfav {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzfai(String str, String str2, String str3, String str4, Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zze(bundle, "gmp_app_id", this.zza);
        zzfjz.zze(bundle, "fbs_aiid", this.zzb);
        zzfjz.zze(bundle, "fbs_aeid", this.zzc);
        zzfjz.zze(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjz.zze(((zzdah) obj).zzb, "fbs_aeid", this.zzc);
    }
}
