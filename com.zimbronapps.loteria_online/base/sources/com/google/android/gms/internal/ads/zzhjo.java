package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhjo extends zzhaz {
    private final zzhlb zza;

    public zzhjo(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        zze(zzhlbVar, zzhbtVar);
        this.zza = zzhlbVar;
    }

    private static void zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        int i = zzhjm.zzb[zzhlbVar.zzc().ordinal()];
    }

    public final zzhbp zza() {
        zzhlb zzhlbVar = this.zza;
        return new zzhjn(zzhlbVar.zzg(), zzhlbVar.zzd(), null);
    }

    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhlb zzc(zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhlb zzhlbVar = this.zza;
        zze(zzhlbVar, zzhbtVar);
        return zzhlbVar;
    }

    public final zzhye zzd() throws GeneralSecurityException {
        zzhlb zzhlbVar = this.zza;
        if (zzhlbVar.zzd().equals(zzhqy.zzd)) {
            return zzhye.zza(new byte[0]);
        }
        if (zzhlbVar.zzd().equals(zzhqy.zzb)) {
            return zzhkh.zzb(zzhlbVar.zze().intValue());
        }
        if (zzhlbVar.zzd().equals(zzhqy.zzc) || zzhlbVar.zzd().equals(zzhqy.zze)) {
            return zzhkh.zza(zzhlbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
