package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjn implements zzbe {
    private final zzpl zza;
    private final zzoo zzb;

    public zzjn(zzjo zzjoVar, zzpl zzplVar, zzoo zzooVar, zzoo zzooVar2) {
        this.zza = zzplVar;
        this.zzb = zzooVar2;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzjo zzjoVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzjoVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzjoVar.zzb, bArr.length);
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
