package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhbu {
    public static zzhbk zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhql zze = zzhql.zze(zzhay.zza(str).zzb().zzaN(), zzibb.zza());
                    for (zzhqk zzhqkVar : zze.zzb()) {
                        if (zzhqkVar.zzb().zzc() == zzhqb.zza || zzhqkVar.zzb().zzc() == zzhqb.zzb || zzhqkVar.zzb().zzc() == zzhqb.zzc) {
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", new Object[]{zzhqkVar.zzb().zzc().name(), zzhqkVar.zzb().zza()}));
                        }
                    }
                    return zzhbk.zza(zze);
                } catch (zzicg unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzicg unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
