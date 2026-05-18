package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhhj implements zzhas {
    private final zzhas zza;
    private final byte[] zzb;

    private zzhhj(zzhas zzhasVar, byte[] bArr) {
        this.zza = zzhasVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhas zzb(zzhjo zzhjoVar) throws GeneralSecurityException {
        byte[] zzc;
        zzhlb zzc2 = zzhjoVar.zzc(zzhax.zza());
        zzhas zzhasVar = (zzhas) zzhjc.zza().zzc(zzc2.zzg(), zzhas.class).zza(zzc2.zzb());
        zzhqy zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal == 1) {
            zzc = zzhkh.zzb(zzhjoVar.zzb().intValue()).zzc();
        } else if (ordinal == 2) {
            zzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzd)));
            }
            zzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else {
            zzc = zzhkh.zza.zzc();
        }
        return new zzhhj(zzhasVar, zzc);
    }

    public static zzhas zzc(zzhas zzhasVar, zzhye zzhyeVar) {
        return new zzhhj(zzhasVar, zzhyeVar.zzc());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhln.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
