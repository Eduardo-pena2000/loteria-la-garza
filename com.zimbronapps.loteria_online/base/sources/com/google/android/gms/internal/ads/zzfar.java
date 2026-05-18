package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfar implements zzfav {
    private final Bundle zza;

    public zzfar(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzdahVar.zza.putBundle("shared_pref", bundle);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzdahVar.zzb.putBundle("shared_pref", bundle);
    }
}
