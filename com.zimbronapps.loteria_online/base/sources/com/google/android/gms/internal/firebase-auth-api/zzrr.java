package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzrr implements zzcc {
    private final zzro zza;
    private final zzpl zzb;
    private final zzoo zzc;
    private final zzoo zzd;

    public /* synthetic */ zzrr(zzro zzroVar, zzpl zzplVar, zzoo zzooVar, zzoo zzooVar2, zzrq zzrqVar) {
        this(zzroVar, zzplVar, zzooVar, zzooVar2);
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzro zzroVar : this.zzb.zza(bArr)) {
            try {
                zzroVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzroVar.zzb, bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    private zzrr(zzro zzroVar, zzpl zzplVar, zzoo zzooVar, zzoo zzooVar2) {
        this.zza = zzroVar;
        this.zzb = zzplVar;
        this.zzc = zzooVar;
        this.zzd = zzooVar2;
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        try {
            byte[] zza = this.zza.zza.zza(bArr);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return zza;
        } catch (GeneralSecurityException e) {
            this.zzc.zza();
            throw e;
        }
    }
}
