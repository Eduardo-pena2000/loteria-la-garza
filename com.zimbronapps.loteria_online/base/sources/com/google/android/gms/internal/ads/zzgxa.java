package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgxa {
    private static final zzgxa zza = new zzgwx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgxa zzb = new zzgwx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgxa zzc;

    static {
        new zzgwz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgwz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgww("base16()", "0123456789ABCDEF");
    }

    public static zzgxa zzl() {
        return zza;
    }

    public static zzgxa zzm() {
        return zzb;
    }

    public static zzgxa zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy;

    public abstract int zzd(int i);

    public abstract int zzf(int i);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgxa zzh();

    public abstract zzgxa zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzgrc.zzo(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzf = zzf(zzg.length());
            byte[] bArr = new byte[zzf];
            int zzb2 = zzb(bArr, zzg);
            if (zzb2 == zzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[zzb2];
            System.arraycopy(bArr, 0, bArr2, 0, zzb2);
            return bArr2;
        } catch (zzgwy e) {
            throw new IllegalArgumentException(e);
        }
    }
}
