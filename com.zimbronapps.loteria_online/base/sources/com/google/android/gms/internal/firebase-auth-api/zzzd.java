package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzzd {
    private ECPrivateKey zza;

    public zzzd(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, zzzh zzzhVar) throws GeneralSecurityException {
        byte[] zza = zzyz.zza(bArr, zzzf.zza(this.zza, zzzf.zza(this.zza.getParams(), zzzhVar, bArr)));
        Mac mac = (Mac) zzzj.zzb.zza(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(zza), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr5);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArr5 = mac.doFinal();
            if (bArr5.length + i3 >= i) {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
            i3 += bArr5.length;
            i2++;
        }
    }
}
