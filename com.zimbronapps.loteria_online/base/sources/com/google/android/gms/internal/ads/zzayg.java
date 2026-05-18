package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzayg {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzayf(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        zzaxw zzc2 = zzc(bArr, str);
        return zzaya.zza(zzc2 == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzaxx) zzc2.zzbu()).zzaN(), true);
    }

    public static zzaxw zzc(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector zzd2 = zzd(bArr, 255);
        if (zzd2 == null || zzd2.isEmpty()) {
            return null;
        }
        zzaxw zza2 = zzaxx.zza();
        int size = zzd2.size();
        for (int i = 0; i < size; i++) {
            zza2.zza(zzian.zzs(zzh((byte[]) zzd2.get(i), str, false), 0, 256));
        }
        byte[] zze2 = zze(bArr);
        zzian zzianVar = zzian.zza;
        zza2.zzb(zzian.zzs(zze2, 0, zze2.length));
        return zza2;
    }

    public static Vector zzd(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                digest = zzd.digest();
            } finally {
            }
        }
        return digest;
    }

    public static /* synthetic */ void zzf(MessageDigest messageDigest) {
        zzd = messageDigest;
    }

    public static zzaxg zzg(int i) {
        zzawg zzj = zzaxg.zzj();
        zzj.zzl(4096L);
        return (zzaxg) zzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaN();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzayh[] zzayhVarArr = new zzayu().zzcK;
        int length3 = zzayhVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzayhVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaxy(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
