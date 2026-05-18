package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcl {
    private final zzaq zza;

    public zzcl(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final void increment(String str, int i) {
        this.zza.zzb(new zzcg(str, i));
    }

    public final Task load(boolean z) {
        return this.zza.zzb(new zzch(z));
    }

    public final Task loadByIds(boolean z, String... strArr) {
        return this.zza.zzb(new zzcj(z, strArr));
    }
}
