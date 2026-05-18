package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzwx extends zzaae {
    private final zzbg zza;

    public zzwx(zzaac zzaacVar, zzbg zzbgVar) {
        super(zzaacVar);
        this.zza = zzbgVar;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzwx)) {
            return this.zza.equals(((zzwx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    public final zzbg zza() {
        return this.zza;
    }

    public final zzv zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
