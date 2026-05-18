package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyu implements zzfav {
    public final zzfiq zza;

    public zzeyu(zzfiq zzfiqVar) {
        this.zza = zzfiqVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        zzfiq zzfiqVar = this.zza;
        if (zzfiqVar != null) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzns)).booleanValue()) {
                return;
            }
            Bundle bundle = zzdahVar.zza;
            bundle.putBoolean("render_in_browser", zzfiqVar.zzb());
            bundle.putBoolean("disable_ml", zzfiqVar.zzc());
        }
    }
}
