package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziav extends zzias {
    private final OutputStream zzg;

    public zziav(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzF(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    public final void zzH(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    public final void zzI(int i, int i2) throws IOException {
        zzF(20);
        zzd(i << 3);
        if (i2 >= 0) {
            zzd(i2);
        } else {
            zze(i2);
        }
    }

    public final void zzJ(int i, int i2) throws IOException {
        zzF(20);
        zzd(i << 3);
        zzd(i2);
    }

    public final void zzK(int i, int i2) throws IOException {
        zzF(14);
        zzd((i << 3) | 5);
        zzf(i2);
    }

    public final void zzL(int i, long j) throws IOException {
        zzF(20);
        zzd(i << 3);
        zze(j);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzw(bArr, i, i2);
    }

    public final void zzh(int i, long j) throws IOException {
        zzF(18);
        zzd((i << 3) | 1);
        zzg(j);
    }

    public final void zzi(int i, boolean z) throws IOException {
        zzF(11);
        zzd(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
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
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    public final void zzs(int i) throws IOException {
        zzF(5);
        zzd(i);
    }

    public final void zzt(int i) throws IOException {
        zzF(4);
        zzf(i);
    }

    public final void zzu(long j) throws IOException {
        zzF(10);
        zze(j);
    }

    public final void zzv(long j) throws IOException {
        zzF(8);
        zzg(j);
    }

    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.zzc = i3;
        this.zzd += i5;
        zzG();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    public final void zzx(String str) throws IOException {
        int zzc;
        int length = str.length() * 3;
        int zzA = zziaw.zzA(length);
        int i = zzA + length;
        int i2 = this.zzb;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int zzd = zzier.zzd(str, bArr, 0, length);
            zzs(zzd);
            zzw(bArr, 0, zzd);
            return;
        }
        if (i > i2 - this.zzc) {
            zzG();
        }
        int zzA2 = zziaw.zzA(str.length());
        int i3 = this.zzc;
        try {
            if (zzA2 == zzA) {
                int i4 = i3 + zzA2;
                this.zzc = i4;
                int zzd2 = zzier.zzd(str, this.zza, i4, i2 - i4);
                this.zzc = i3;
                zzc = (zzd2 - i3) - zzA2;
                zzd(zzc);
                this.zzc = zzd2;
            } else {
                zzc = zzier.zzc(str);
                zzd(zzc);
                this.zzc = zzier.zzd(str, this.zza, this.zzc, zzc);
            }
            this.zzd += zzc;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zziau(e);
        }
    }

    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }
}
