package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import h7.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzar extends x {
    private final l zza;

    public zzar(l lVar) {
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    public final void zzd(LocationResult locationResult) {
        this.zza.c(new zzap(this, locationResult));
    }

    public final void zze(LocationAvailability locationAvailability) {
        this.zza.c(new zzaq(this, locationAvailability));
    }
}
