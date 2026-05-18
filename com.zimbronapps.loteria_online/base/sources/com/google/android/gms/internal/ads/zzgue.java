package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgue extends zzguf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzguf zzc;

    public zzgue(zzguf zzgufVar, int i, int i2) {
        Objects.requireNonNull(zzgufVar);
        this.zzc = zzgufVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzgrc.zzm(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzh(i, i2);
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final boolean zzf() {
        return true;
    }

    public final zzguf zzh(int i, int i2) {
        zzgrc.zzo(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzh(i + i3, i2 + i3);
    }
}
