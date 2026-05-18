package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgfw {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzgfv {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzgca.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new zzgfv();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(zzb2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new zzgfv(e);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw new zzgfv(e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new zzgfv(e);
        } catch (NoSuchPaddingException e4) {
            e = e4;
            throw new zzgfv(e);
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            throw new zzgfv(e);
        } catch (InvalidKeyException e6) {
            e = e6;
            throw new zzgfv(e);
        } catch (BadPaddingException e7) {
            e = e7;
            throw new zzgfv(e);
        }
    }

    public final String zzb(byte[] bArr, String str) throws zzgfv, UnsupportedEncodingException {
        return new String(zza(bArr, str), "UTF-8");
    }
}
