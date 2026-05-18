package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnn extends zzhnq {
    private final zzhno zza;
    private final zzhyg zzb;

    private zzhnn(zzhno zzhnoVar, zzhyg zzhygVar) {
        this.zza = zzhnoVar;
        this.zzb = zzhygVar;
    }

    public static zzhnn zzc(zzhno zzhnoVar, zzhyg zzhygVar) throws GeneralSecurityException {
        if (zzhnoVar.zzc() == zzhygVar.zzd()) {
            return new zzhnn(zzhnoVar, zzhygVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    public final Integer zzb() {
        return null;
    }

    public final zzhyg zzd() {
        return this.zzb;
    }
}
