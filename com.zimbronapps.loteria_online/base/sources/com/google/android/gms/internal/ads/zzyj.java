package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzyj implements zzyc {
    private final zzyc zza;
    private final long zzb;

    public zzyj(zzyc zzycVar, long j) {
        this.zza = zzycVar;
        this.zzb = j;
    }

    public final zzyc zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zza.zzb();
    }

    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i) {
        int zzd = this.zza.zzd(zzlhVar, zzihVar, i);
        if (zzd != -4) {
            return zzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
