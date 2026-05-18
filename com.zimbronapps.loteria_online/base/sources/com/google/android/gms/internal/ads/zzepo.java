package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepo implements R5.g {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbd zzb;
    private final zzdbx zzc;
    private final zzdjo zzd;
    private final zzdjg zze;
    private final zzcss zzf;

    public zzepo(zzdbd zzdbdVar, zzdbx zzdbxVar, zzdjo zzdjoVar, zzdjg zzdjgVar, zzcss zzcssVar) {
        this.zzb = zzdbdVar;
        this.zzc = zzdbxVar;
        this.zzd = zzdjoVar;
        this.zze = zzdjgVar;
        this.zzf = zzcssVar;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
