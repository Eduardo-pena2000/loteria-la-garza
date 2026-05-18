package com.google.android.gms.internal.ads;

import V5.o0;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfka {
    public zzfka() {
        try {
            zzhbx.zza();
        } catch (GeneralSecurityException e) {
            o0.k("Failed to Configure Aead. ".concat(e.toString()));
            R5.t.l().zzg(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzhbk zzf = zzhbk.zzf(zzhbc.zzb(zzhkc.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhav.zzb(zzf, zzhau.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            o0.k("Failed to generate key".concat(e.toString()));
            R5.t.l().zzg(e, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdxt zzdxtVar) {
        zzhbk zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((zzhas) zzc.zzg(zzhif.zza(), zzhas.class)).zza(bArr, bArr2);
                zzdxtVar.zzc().put("ds", "1");
                return new String(zza, "UTF-8");
            } catch (UnsupportedEncodingException | GeneralSecurityException | UnsupportedOperationException e) {
                o0.k("Failed to decrypt ".concat(e.toString()));
                R5.t.l().zzg(e, "CryptoUtils.decrypt");
                zzdxtVar.zzc().put("dsf", e.toString());
            }
        }
        return null;
    }

    private static final zzhbk zzc(String str) {
        try {
            try {
                return zzhav.zza(zzhat.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            o0.k("Failed to get keysethandle".concat(e.toString()));
            R5.t.l().zzg(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
