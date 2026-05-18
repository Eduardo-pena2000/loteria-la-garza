package com.google.android.gms.internal.firebase-auth-api;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznb implements zzba {
    private static final String zza = "zznb";
    private final zzba zzb;

    public zznb(String str) throws GeneralSecurityException, IOException {
        this.zzb = zzmz.zza(str);
    }

    private static void zza() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return this.zzb.zzb(bArr, bArr2);
        } catch (ProviderException | GeneralSecurityException e) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zzb(bArr, bArr2);
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return this.zzb.zza(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            e = e;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (ProviderException e2) {
            e = e2;
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
            zza();
            return this.zzb.zza(bArr, bArr2);
        } catch (BadPaddingException e3) {
            throw e3;
        }
    }
}
