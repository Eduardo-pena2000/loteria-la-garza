package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpt extends zzpq {
    private final OutputStream zzg;

    public zzpt(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    public final void zzJ(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    public final void zzK(int i, boolean z) throws IOException {
        zzH(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public final void zzL(byte[] bArr, int i, int i2) throws IOException {
        zzw(i2);
        zzz(bArr, 0, i2);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzz(bArr, 0, i2);
    }

    public final void zzh(int i, zzpm zzpmVar) throws IOException {
        zzw((i << 3) | 2);
        zzi(zzpmVar);
    }

    public final void zzi(zzpm zzpmVar) throws IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    public final void zzj(int i, int i2) throws IOException {
        zzH(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    public final void zzk(int i) throws IOException {
        zzH(4);
        zzd(i);
    }

    public final void zzl(int i, long j) throws IOException {
        zzH(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    public final void zzm(long j) throws IOException {
        zzH(8);
        zze(j);
    }

    public final void zzn(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    public final void zzo(int i) throws IOException {
        if (i >= 0) {
            zzw(i);
        } else {
            zzy(i);
        }
    }

    public final void zzp(zzrq zzrqVar) throws IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    public final void zzq(int i, zzrq zzrqVar) throws IOException {
        zzw(11);
        zzv(2, i);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    public final void zzr(int i, zzpm zzpmVar) throws IOException {
        zzw(11);
        zzv(2, i);
        zzh(3, zzpmVar);
        zzw(12);
    }

    public final void zzs(int i, String str) throws IOException {
        zzw((i << 3) | 2);
        zzt(str);
    }

    public final void zzt(String str) throws IOException {
        int zzb;
        try {
            int length = str.length() * 3;
            int zzC = zzpv.zzC(length);
            int i = zzC + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zza = zzsy.zza(str, bArr, 0, length);
                zzw(zza);
                zzz(bArr, 0, zza);
                return;
            }
            if (i > i2 - this.zzc) {
                zzG();
            }
            int zzC2 = zzpv.zzC(str.length());
            int i3 = this.zzc;
            try {
                if (zzC2 == zzC) {
                    int i4 = i3 + zzC2;
                    this.zzc = i4;
                    int zza2 = zzsy.zza(str, this.zza, i4, i2 - i4);
                    this.zzc = i3;
                    zzb = (zza2 - i3) - zzC2;
                    zzf(zzb);
                    this.zzc = zza2;
                } else {
                    zzb = zzsy.zzb(str);
                    zzf(zzb);
                    this.zzc = zzsy.zza(str, this.zza, this.zzc, zzb);
                }
                this.zzd += zzb;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new zzps(e);
            } catch (zzsx e2) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e2;
            }
        } catch (zzsx e3) {
            zzE(str, e3);
        }
    }

    public final void zzu(int i, int i2) throws IOException {
        zzw((i << 3) | i2);
    }

    public final void zzv(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzf(i2);
    }

    public final void zzw(int i) throws IOException {
        zzH(5);
        zzf(i);
    }

    public final void zzx(int i, long j) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzg(j);
    }

    public final void zzy(long j) throws IOException {
        zzH(10);
        zzg(j);
    }

    public final void zzz(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i4, i5);
        this.zzc = i3;
        this.zzd += i5;
        zzG();
        int i6 = i2 - i5;
        if (i6 <= i3) {
            System.arraycopy(bArr, i5, bArr2, 0, i6);
            this.zzc = i6;
        } else {
            this.zzg.write(bArr, i5, i6);
        }
        this.zzd += i6;
    }
}
