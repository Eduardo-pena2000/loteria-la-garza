package com.google.android.gms.internal.fido;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcb extends zzcc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzccVar, int i, int i2) {
        this.zzc = zzccVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzbm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzg(i, i2);
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

    public final zzcc zzg(int i, int i2) {
        zzbm.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzg(i + i3, i2 + i3);
    }
}
