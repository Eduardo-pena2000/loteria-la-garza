package com.google.android.gms.internal.firebase-auth-api;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzam extends zzah {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzah zzc;

    public zzam(zzah zzahVar, int i, int i2) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzu.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzah zza(int i, int i2) {
        zzu.zza(i, i2, this.zzb);
        zzah zzahVar = this.zzc;
        int i3 = this.zza;
        return (zzah) zzahVar.subList(i + i3, i2 + i3);
    }
}
