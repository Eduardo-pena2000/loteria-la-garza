package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgca {
    public static String zza(byte[] bArr, boolean z) {
        return zzc(z).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z) throws IllegalArgumentException {
        byte[] zzk = zzc(z).zzk(str);
        if (zzk.length != 0 || str.length() <= 0) {
            return zzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgxa zzc(boolean z) {
        return z ? zzgxa.zzm().zzh() : zzgxa.zzl();
    }
}
