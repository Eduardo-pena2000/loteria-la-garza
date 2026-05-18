package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzxn implements zzyc {
    final /* synthetic */ zzxq zza;
    private final int zzb;

    public zzxn(zzxq zzxqVar, int i) {
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
        this.zzb = i;
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i) {
        return this.zza.zzs(this.zzb, zzlhVar, zzihVar, i);
    }

    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}
