package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzazp {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzazp(SecureRandom secureRandom) {
    }

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

    public final String zza(byte[] bArr, byte[] bArr2) throws zzazo {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return zzaya.zza(bArr3, false);
        } catch (BadPaddingException e) {
            throw new zzazo(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzazo(this, e2);
        } catch (NoSuchPaddingException e3) {
            throw new zzazo(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzazo(this, e4);
        } catch (InvalidKeyException e5) {
            throw new zzazo(this, e5);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzazo {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzaya.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new zzazo(this);
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
            throw new zzazo(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzazo(this, e2);
        } catch (IllegalArgumentException e3) {
            throw new zzazo(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new zzazo(this, e4);
        } catch (IllegalBlockSizeException e5) {
            throw new zzazo(this, e5);
        } catch (InvalidKeyException e6) {
            throw new zzazo(this, e6);
        } catch (BadPaddingException e7) {
            throw new zzazo(this, e7);
        }
    }
}
