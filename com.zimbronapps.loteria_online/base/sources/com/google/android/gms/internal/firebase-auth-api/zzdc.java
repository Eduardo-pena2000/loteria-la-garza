package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdc implements zzba {
    private final zzcz zza;
    private final zzpl zzb;
    private final zzoo zzc;
    private final zzoo zzd;

    public /* synthetic */ zzdc(zzcz zzczVar, zzpl zzplVar, zzoo zzooVar, zzoo zzooVar2, zzdb zzdbVar) {
        this(zzczVar, zzplVar, zzooVar, zzooVar2);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzcz zzczVar : this.zzb.zza(bArr)) {
            try {
                byte[] zza = zzczVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzczVar.zzb, bArr.length);
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb = this.zza.zza.zzb(bArr, bArr2);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return zzb;
        } catch (GeneralSecurityException e) {
            this.zzc.zza();
            throw e;
        }
    }

    private zzdc(zzcz zzczVar, zzpl zzplVar, zzoo zzooVar, zzoo zzooVar2) {
        this.zza = zzczVar;
        this.zzb = zzplVar;
        this.zzc = zzooVar;
        this.zzd = zzooVar2;
    }
}
