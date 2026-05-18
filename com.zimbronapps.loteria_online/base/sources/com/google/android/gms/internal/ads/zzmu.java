package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzmu {
    private final zzjf zza;

    @Deprecated
    public zzmu(Context context, zzmq zzmqVar) {
        this.zza = new zzjf(context, zzmqVar);
    }

    @Deprecated
    public final zzmu zza(zzaaj zzaajVar) {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzaajVar.getClass();
        zzjfVar.zze = new zzjc(zzaajVar);
        return this;
    }

    @Deprecated
    public final zzmu zzb(zzlj zzljVar) {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzljVar.getClass();
        zzjfVar.zzf = new zzjd(zzljVar);
        return this;
    }

    @Deprecated
    public final zzmv zzc() {
        zzjf zzjfVar = this.zza;
        zzgrc.zzi(!zzjfVar.zzw);
        zzjfVar.zzw = true;
        return new zzmv(zzjfVar);
    }
}
