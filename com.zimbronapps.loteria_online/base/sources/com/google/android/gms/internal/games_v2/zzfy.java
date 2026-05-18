package com.google.android.gms.internal.games_v2;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfy extends zzfz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfz zzc;

    public zzfy(zzfz zzfzVar, int i, int i2) {
        this.zzc = zzfzVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzfo.zza(i, this.zzb, "index");
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

    public final zzfz zzf(int i, int i2) {
        zzfo.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzf(i + i3, i2 + i3);
    }
}
