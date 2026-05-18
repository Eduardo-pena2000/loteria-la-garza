package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzla implements zzbd {
    private final zzpl zza;
    private final zzoo zzb;

    public zzla(zzpl zzplVar, zzoo zzooVar) {
        this.zza = zzplVar;
        this.zzb = zzooVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzlb zzlbVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzlbVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzlbVar.zzb, bArr.length);
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
