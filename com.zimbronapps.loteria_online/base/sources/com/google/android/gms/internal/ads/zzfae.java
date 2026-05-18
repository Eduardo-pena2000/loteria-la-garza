package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfae implements zzfav {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzfae(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("rtb", this.zza);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfc)).booleanValue()) {
            String str = this.zzc;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.zzb;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
