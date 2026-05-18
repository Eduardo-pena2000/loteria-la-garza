package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhck implements zzhas {
    private final zzhkr zza;

    public /* synthetic */ zzhck(zzhci zzhciVar, zzhkr zzhkrVar, zzhjs zzhjsVar, zzhjs zzhjsVar2, byte[] bArr) {
        this.zza = zzhkrVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] zza = ((zzhci) it.next()).zza.zza(bArr, bArr2);
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
