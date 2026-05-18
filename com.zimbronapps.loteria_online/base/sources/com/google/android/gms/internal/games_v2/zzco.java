package com.google.android.gms.internal.games_v2;

import T6.j;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzco implements j {
    private final zzav zza;
    private final zzaq zzb;

    public zzco(zzav zzavVar, zzaq zzaqVar) {
        this.zza = zzavVar;
        this.zzb = zzaqVar;
    }

    public final Task isAuthenticated() {
        return this.zza.zzc();
    }

    public final Task requestServerSideAccess(String str, boolean z) {
        return this.zzb.zzb(new zzcn(str, z));
    }

    public final Task signIn() {
        return this.zza.zzb();
    }
}
