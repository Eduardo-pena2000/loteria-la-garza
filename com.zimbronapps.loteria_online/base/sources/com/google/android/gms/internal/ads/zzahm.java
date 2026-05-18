package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzahm {
    protected final zzagh zza;

    public zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public abstract boolean zza(zzer zzerVar) throws zzat;

    public abstract boolean zzb(zzer zzerVar, long j) throws zzat;

    public final boolean zzf(zzer zzerVar, long j) throws zzat {
        return zza(zzerVar) && zzb(zzerVar, j);
    }
}
