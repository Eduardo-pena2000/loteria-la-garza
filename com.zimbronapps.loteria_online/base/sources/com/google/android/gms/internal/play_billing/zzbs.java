package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbs extends zzbt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbt zzc;

    public zzbs(zzbt zzbtVar, int i, int i2) {
        Objects.requireNonNull(zzbtVar);
        this.zzc = zzbtVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzbg.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzh(i, i2);
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzbt zzh(int i, int i2) {
        zzbg.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzh(i + i3, i2 + i3);
    }
}
