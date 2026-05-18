package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdjq {
    private final List zza;
    private final zzfqk zzb;
    private final W5.w zzc;
    private boolean zzd;

    public zzdjq(zzfir zzfirVar, zzfqk zzfqkVar) {
        this.zza = zzfirVar.zzp;
        this.zzb = zzfqkVar;
        this.zzc = zzfirVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
