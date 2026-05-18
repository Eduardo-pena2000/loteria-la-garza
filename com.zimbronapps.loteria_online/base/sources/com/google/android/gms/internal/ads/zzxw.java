package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzxw {
    private final zzaan zza;
    private final zzer zzb = new zzer(32);
    private zzxv zzc;
    private zzxv zzd;
    private zzxv zze;
    private long zzf;

    public zzxw(zzaan zzaanVar) {
        this.zza = zzaanVar;
        zzxv zzxvVar = new zzxv(0L, 65536);
        this.zzc = zzxvVar;
        this.zzd = zzxvVar;
        this.zze = zzxvVar;
    }

    private final int zzi(int i) {
        zzxv zzxvVar = this.zze;
        if (zzxvVar.zzc == null) {
            zzaal zza = this.zza.zza();
            zzxv zzxvVar2 = new zzxv(this.zze.zzb, 65536);
            zzxvVar.zzc = zza;
            zzxvVar.zzd = zzxvVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + i;
        this.zzf = j;
        zzxv zzxvVar = this.zze;
        if (j == zzxvVar.zzb) {
            this.zze = zzxvVar.zzd;
        }
    }

    private static zzxv zzk(zzxv zzxvVar, zzih zzihVar, zzxx zzxxVar, zzer zzerVar) {
        zzxv zzxvVar2;
        int i;
        if (zzihVar.zzk()) {
            long j = zzxxVar.zzb;
            zzerVar.zza(1);
            zzxv zzm = zzm(zzxvVar, j, zzerVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzerVar.zzi()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzxvVar2 = zzm(zzm, j2, zzieVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzerVar.zza(2);
                zzxvVar2 = zzm(zzxvVar2, j3, zzerVar.zzi(), 2);
                j3 += 2;
                i = zzerVar.zzt();
            } else {
                i = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzerVar.zza(i4);
                zzxvVar2 = zzm(zzxvVar2, j3, zzerVar.zzi(), i4);
                j3 += i4;
                zzerVar.zzh(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzerVar.zzt();
                    iArr4[i5] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxxVar.zza - ((int) (j3 - zzxxVar.zzb));
            }
            zzagg zzaggVar = zzxxVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(i, iArr2, iArr4, zzaggVar.zzb, zzieVar.zza, zzaggVar.zza, zzaggVar.zzc, zzaggVar.zzd);
            long j4 = zzxxVar.zzb;
            int i6 = (int) (j3 - j4);
            zzxxVar.zzb = j4 + i6;
            zzxxVar.zza -= i6;
        } else {
            zzxvVar2 = zzxvVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxxVar.zza);
            return zzl(zzxvVar2, zzxxVar.zzb, zzihVar.zzc, zzxxVar.zza);
        }
        zzerVar.zza(4);
        zzxv zzm2 = zzm(zzxvVar2, zzxxVar.zzb, zzerVar.zzi(), 4);
        int zzH = zzerVar.zzH();
        zzxxVar.zzb += 4;
        zzxxVar.zza -= 4;
        zzihVar.zzj(zzH);
        zzxv zzl = zzl(zzm2, zzxxVar.zzb, zzihVar.zzc, zzH);
        zzxxVar.zzb += zzH;
        int i7 = zzxxVar.zza - zzH;
        zzxxVar.zza = i7;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzihVar.zzf = ByteBuffer.allocate(i7);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzl, zzxxVar.zzb, zzihVar.zzf, zzxxVar.zza);
    }

    private static zzxv zzl(zzxv zzxvVar, long j, ByteBuffer byteBuffer, int i) {
        zzxv zzn = zzn(zzxvVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzxv zzm(zzxv zzxvVar, long j, byte[] bArr, int i) {
        zzxv zzn = zzn(zzxvVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j));
            System.arraycopy(zzn.zzc.zza, zzn.zzb(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzxv zzn(zzxv zzxvVar, long j) {
        while (j >= zzxvVar.zzb) {
            zzxvVar = zzxvVar.zzd;
        }
        return zzxvVar;
    }

    public final void zza() {
        zzxv zzxvVar = this.zzc;
        if (zzxvVar.zzc != null) {
            this.zza.zzc(zzxvVar);
            zzxvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxv zzxvVar2 = this.zzc;
        this.zzd = zzxvVar2;
        this.zze = zzxvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzih zzihVar, zzxx zzxxVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxx zzxxVar) {
        zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zze(long j) {
        zzxv zzxvVar;
        if (j != -1) {
            while (true) {
                zzxvVar = this.zzc;
                if (j < zzxvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxvVar.zza) {
                this.zzd = zzxvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzxv zzxvVar = this.zze;
        int zza = zzjVar.zza(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzer zzerVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzxv zzxvVar = this.zze;
            zzerVar.zzm(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
