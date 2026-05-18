package com.google.android.gms.internal.consent_sdk;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdu extends zzdv {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzdv zzc;

    public zzdu(zzdv zzdvVar, int i, int i2) {
        Objects.requireNonNull(zzdvVar);
        this.zzc = zzdvVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzdj.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzf(i, i2);
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzdv zzf(int i, int i2) {
        zzdj.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzf(i + i3, i2 + i3);
    }
}
