package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.l;
import h7.B;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzau extends B {
    private final l zza;

    public zzau(l lVar) {
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    public final synchronized void zzd(Location location) {
        this.zza.c(new zzat(this, location));
    }
}
