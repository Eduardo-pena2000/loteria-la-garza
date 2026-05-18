package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziat extends zziaw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zziat(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    public final void zzH(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    public final void zzI(int i, int i2) throws IOException {
        zzs(i << 3);
        zzr(i2);
    }

    public final void zzJ(int i, int i2) throws IOException {
        zzs(i << 3);
        zzs(i2);
    }

    public final void zzK(int i, int i2) throws IOException {
        zzs((i << 3) | 5);
        zzt(i2);
    }

    public final void zzL(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzw(bArr, i, i2);
    }

    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zzh(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzv(j);
    }

    public final void zzi(int i, boolean z) throws IOException {
        zzs(i << 3);
        zzq(z ? (byte) 1 : (byte) 0);
    }

    public final void zzj(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzx(str);
    }

    public final void zzk(int i, zzian zzianVar) throws IOException {
        zzs((i << 3) | 2);
        zzl(zzianVar);
    }

    public final void zzl(zzian zzianVar) throws IOException {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    public final void zzm(byte[] bArr, int i, int i2) throws IOException {
        zzs(i2);
        zzw(bArr, 0, i2);
    }

    public final void zzn(int i, zzidc zzidcVar) throws IOException {
        zzs(11);
        zzJ(2, i);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    public final void zzo(int i, zzian zzianVar) throws IOException {
        zzs(11);
        zzJ(2, i);
        zzk(3, zzianVar);
        zzs(12);
    }

    public final void zzp(zzidc zzidcVar) throws IOException {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    public final void zzq(byte b) throws IOException {
        Throwable th;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e) {
                th = e;
                i = i2;
                throw new zziau(i, this.zzb, 1, th);
            }
        } catch (IndexOutOfBoundsException e2) {
            th = e2;
        }
    }

    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    public final void zzs(int i) throws IOException {
        int i2;
        Throwable th;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    th = e;
                    i3 = i2;
                    throw new zziau(i3, this.zzb, 1, th);
                }
            } catch (IndexOutOfBoundsException e2) {
                th = e2;
                throw new zziau(i3, this.zzb, 1, th);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    public final void zzt(int i) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i2, this.zzb, 4, e);
        }
    }

    public final void zzu(long j) throws IOException {
        int i;
        Throwable th;
        int i2;
        boolean zzE = zziaw.zzE();
        int i3 = this.zzc;
        if (!zzE || this.zzb - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    th = e;
                }
                try {
                    this.zza[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    th = e2;
                    i3 = i2;
                    throw new zziau(i3, this.zzb, 1, th);
                }
            }
            i = i3 + 1;
            try {
                this.zza[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                th = e3;
                i3 = i;
                throw new zziau(i3, this.zzb, 1, th);
            }
        } else {
            while ((j & (-128)) != 0) {
                zziem.zzp(this.zza, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            zziem.zzp(this.zza, i3, (byte) j);
        }
        this.zzc = i;
    }

    public final void zzv(long j) throws IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(i, this.zzb, 8, e);
        }
    }

    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(this.zzc, this.zzb, i2, e);
        }
    }

    public final void zzx(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzA = zziaw.zzA(str.length() * 3);
            int zzA2 = zziaw.zzA(str.length());
            if (zzA2 != zzA) {
                zzs(zzier.zzc(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzier.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + zzA2;
            this.zzc = i3;
            int zzd = zzier.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzs((zzd - i) - zzA2);
            this.zzc = zzd;
        } catch (IndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }

    public final void zzy() {
    }
}
