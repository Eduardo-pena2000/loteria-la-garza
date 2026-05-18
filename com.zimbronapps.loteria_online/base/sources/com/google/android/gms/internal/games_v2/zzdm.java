package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdm {
    private final zzaq zza;

    public zzdm(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final Task loadPlayerStats(boolean z) {
        return this.zza.zzb(new zzdk(z));
    }
}
