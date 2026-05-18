package com.google.android.gms.internal.fido;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdv {
    private static final zzdz zza = new zzds();
    private static final zzdy zzb = new zzdt();
    private final zzdz zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdy zzf = null;

    public /* synthetic */ zzdv(zzdz zzdzVar, zzdu zzduVar) {
        this.zze = zzdzVar;
    }

    public static /* bridge */ /* synthetic */ zzdy zzb(zzdv zzdvVar) {
        return zzdvVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzdz zzc(zzdv zzdvVar) {
        return zzdvVar.zze;
    }

    public static /* bridge */ /* synthetic */ Map zze(zzdv zzdvVar) {
        return zzdvVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzf(zzdv zzdvVar) {
        return zzdvVar.zzc;
    }

    public final zzdv zza(zzdy zzdyVar) {
        this.zzf = zzdyVar;
        return this;
    }

    public final zzea zzd() {
        return new zzdx(this, null);
    }

    public final void zzg(zzdk zzdkVar) {
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            zzdz zzdzVar = zza;
            zzfk.zza(zzdkVar, "key");
            this.zzd.remove(zzdkVar);
            this.zzc.put(zzdkVar, zzdzVar);
            return;
        }
        zzdy zzdyVar = zzb;
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzdkVar);
        this.zzd.put(zzdkVar, zzdyVar);
    }
}
