package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeqc implements R5.g {
    final /* synthetic */ zzdko zza;

    public zzeqc(zzeqd zzeqdVar, zzdko zzdkoVar) {
        this.zza = zzdkoVar;
        Objects.requireNonNull(zzeqdVar);
    }

    public final void zza(View view) {
    }

    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    public final void zzc() {
        zzdko zzdkoVar = this.zza;
        zzdkoVar.zzd().zza();
        zzdkoVar.zze().zza();
    }
}
