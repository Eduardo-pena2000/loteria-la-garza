package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzem extends zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzem(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    public final int zza() {
        return this.zzd - this.zze;
    }

    public final void zzb(byte b) throws IOException {
        Throwable th;
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                th = e;
                i = i2;
                throw new zzen(i, this.zzd, 1, th);
            }
        } catch (IndexOutOfBoundsException e2) {
            th = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(this.zze, this.zzd, i2, e);
        }
    }

    public final void zzd(int i, boolean z) throws IOException {
        zzv(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    public final void zze(int i, zzei zzeiVar) throws IOException {
        zzv((i << 3) | 2);
        zzf(zzeiVar);
    }

    public final void zzf(zzei zzeiVar) throws IOException {
        zzv(zzeiVar.zzd());
        zzeiVar.zzg(this);
    }

    public final void zzg(int i, int i2) throws IOException {
        zzv((i << 3) | 5);
        zzh(i2);
    }

    public final void zzh(int i) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i2, this.zzd, 4, e);
        }
    }

    public final void zzi(int i, long j) throws IOException {
        zzv((i << 3) | 1);
        zzj(j);
    }

    public final void zzj(long j) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i, this.zzd, 8, e);
        }
    }

    public final void zzk(int i, int i2) throws IOException {
        zzv(i << 3);
        zzl(i2);
    }

    public final void zzl(int i) throws IOException {
        if (i >= 0) {
            zzv(i);
        } else {
            zzx(i);
        }
    }

    public final void zzm(byte[] bArr, int i, int i2) throws IOException {
        zzc(bArr, 0, i2);
    }

    public final void zzn(int i, zzgl zzglVar, zzgv zzgvVar) throws IOException {
        zzv((i << 3) | 2);
        zzv(((zzds) zzglVar).zze(zzgvVar));
        zzgvVar.zzi(zzglVar, this.zza);
    }

    public final void zzo(zzgl zzglVar) throws IOException {
        zzv(zzglVar.zzj());
        zzglVar.zzL(this);
    }

    public final void zzp(int i, zzgl zzglVar) throws IOException {
        zzv(11);
        zzu(2, i);
        zzv(26);
        zzo(zzglVar);
        zzv(12);
    }

    public final void zzq(int i, zzei zzeiVar) throws IOException {
        zzv(11);
        zzu(2, i);
        zze(3, zzeiVar);
        zzv(12);
    }

    public final void zzr(int i, String str) throws IOException {
        zzv((i << 3) | 2);
        zzs(str);
    }

    public final void zzs(String str) throws IOException {
        int i = this.zze;
        try {
            int zzC = zzep.zzC(str.length() * 3);
            int zzC2 = zzep.zzC(str.length());
            if (zzC2 != zzC) {
                zzv(zzhr.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzhr.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzC2;
            this.zze = i3;
            int zzb = zzhr.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzv((zzb - i) - zzC2);
            this.zze = zzb;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(e);
        } catch (zzhq e2) {
            this.zze = i;
            zzF(str, e2);
        }
    }

    public final void zzt(int i, int i2) throws IOException {
        zzv((i << 3) | i2);
    }

    public final void zzu(int i, int i2) throws IOException {
        zzv(i << 3);
        zzv(i2);
    }

    public final void zzv(int i) throws IOException {
        int i2;
        Throwable th;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    th = e;
                    i3 = i2;
                    throw new zzen(i3, this.zzd, 1, th);
                }
            } catch (IndexOutOfBoundsException e2) {
                th = e2;
                throw new zzen(i3, this.zzd, 1, th);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    public final void zzw(int i, long j) throws IOException {
        zzv(i << 3);
        zzx(j);
    }

    public final void zzx(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i3 = this.zze;
        if (!zzep.zzG() || this.zzd - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.zzc[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    indexOutOfBoundsException = e;
                    throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzho.zzn(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            zzho.zzn(this.zzc, i3, (byte) j);
        }
        this.zze = i;
    }
}
