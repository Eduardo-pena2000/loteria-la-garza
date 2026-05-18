package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    public final void zza(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    public final void zzb(int i, int i2) throws IOException {
        zzr(i << 3);
        zzq(i2);
    }

    public final void zzc(int i, int i2) throws IOException {
        zzr(i << 3);
        zzr(i2);
    }

    public final void zzd(int i, int i2) throws IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    public final void zze(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    public final void zzf(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    public final void zzg(int i, boolean z) throws IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    public final void zzh(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzx(str);
    }

    public final void zzi(int i, zzlh zzlhVar) throws IOException {
        zzr((i << 3) | 2);
        zzj(zzlhVar);
    }

    public final void zzj(zzlh zzlhVar) throws IOException {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    public final void zzk(byte[] bArr, int i, int i2) throws IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    public final void zzl(int i, zznm zznmVar, zznx zznxVar) throws IOException {
        zzr((i << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    public final void zzm(int i, zznm zznmVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    public final void zzn(int i, zzlh zzlhVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzi(3, zzlhVar);
        zzr(12);
    }

    public final void zzo(zznm zznmVar) throws IOException {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    public final void zzp(byte b) throws IOException {
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
                throw new zzll(i, this.zzd, 1, th);
            }
        } catch (IndexOutOfBoundsException e2) {
            th = e2;
        }
    }

    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    public final void zzr(int i) throws IOException {
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
                    throw new zzll(i3, this.zzd, 1, th);
                }
            } catch (IndexOutOfBoundsException e2) {
                th = e2;
                throw new zzll(i3, this.zzd, 1, th);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    public final void zzs(int i) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i2, this.zzd, 4, e);
        }
    }

    public final void zzt(long j) throws IOException {
        int i;
        Throwable th;
        int i2;
        boolean zzH = zzlm.zzH();
        int i3 = this.zze;
        if (!zzH || this.zzd - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    th = e;
                }
                try {
                    this.zzc[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    th = e2;
                    i3 = i2;
                    throw new zzll(i3, this.zzd, 1, th);
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                th = e3;
                i3 = i;
                throw new zzll(i3, this.zzd, 1, th);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzop.zzp(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            zzop.zzp(this.zzc, i3, (byte) j);
        }
        this.zze = i;
    }

    public final void zzu(long j) throws IOException {
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
            throw new zzll(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(this.zze, this.zzd, i2, e);
        }
    }

    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        zzv(bArr, 0, i2);
    }

    public final void zzx(String str) throws IOException {
        int i = this.zze;
        try {
            int zzz = zzlm.zzz(str.length() * 3);
            int zzz2 = zzlm.zzz(str.length());
            if (zzz2 != zzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzos.zzc(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzz2;
            this.zze = i3;
            int zzc = zzos.zzc(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzr((zzc - i) - zzz2);
            this.zze = zzc;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(e);
        } catch (zzor e2) {
            this.zze = i;
            zzF(str, e2);
        }
    }

    public final int zzy() {
        return this.zzd - this.zze;
    }
}
