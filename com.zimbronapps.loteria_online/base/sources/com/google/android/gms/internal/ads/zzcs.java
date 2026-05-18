package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcs implements zzcr {
    final /* synthetic */ zzct zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzcs(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new short[zzctVar.zzh()];
        this.zzc = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new short[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int zzg = this.zza.zzg() * i;
                i8 += Math.abs(sArr[zzg + i9] - sArr[(zzg + i2) + i9]);
            }
            int i10 = i8 * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = i8;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = i8 * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = i8;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.zzf = i4 / i6;
        this.zzg = i7 / i5;
        return i6;
    }

    private final short[] zzt(short[] sArr, int i, int i2) {
        zzct zzctVar = this.zza;
        int length = sArr.length / zzctVar.zzg();
        return i + i2 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * zzctVar.zzg());
    }

    public final int zza() {
        return 2;
    }

    public final void zzb(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i2 >= zzctVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int zzg = zzctVar.zzg();
            int zzj = zzctVar.zzj();
            short[] sArr2 = this.zze;
            int zzg2 = (zzctVar.zzg() * i) + i2;
            short s = sArr2[zzg2];
            short s2 = sArr2[zzg2 + zzctVar.zzg()];
            long zzl = (zzctVar.zzl() + 1) * j2;
            long zzl2 = zzl - (zzctVar.zzl() * j2);
            long zzm = zzl - (zzctVar.zzm() * j);
            sArr[(zzj * zzg) + i2] = (short) (((zzm * s) + ((zzl2 - zzm) * s2)) / zzl2);
            i2++;
        }
    }

    public final boolean zzc() {
        int i = this.zzf;
        return i != 0 && this.zza.zzn() != 0 && this.zzg <= i * 3 && i + i > this.zzh * 3;
    }

    public final void zzd(int i, int i2) {
        int zzg;
        short[] sArr = this.zzc;
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzh() / i2) {
                return;
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                zzg = zzctVar.zzg() * i2;
                if (i4 < zzg) {
                    i5 += sArr[(zzctVar.zzg() * i) + (zzg * i3) + i4];
                    i4++;
                }
            }
            this.zzb[i3] = (short) (i5 / zzg);
            i3++;
        }
    }

    public final int zze(int i, int i2, int i3) {
        return zzs(this.zzb, 0, i2, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        return zzs(this.zzc, i, i2, i3);
    }

    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzh(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr2[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final void zzi() {
        this.zzh = this.zzf;
    }

    public final void zzj(int i) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i);
    }

    public final void zzk(int i) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i);
    }

    public final void zzl(int i) {
        this.zze = zzt(this.zze, this.zza.zzk(), i);
    }

    public final void zzm(int i, int i2) {
        for (int i3 = 0; i3 < this.zza.zzg() * i2; i3++) {
            this.zzc[i + i3] = 0;
        }
    }

    public final void zzn(ByteBuffer byteBuffer, int i) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    public final void zzo(ByteBuffer byteBuffer, int i) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzctVar.zzg() * i);
        byteBuffer.position(byteBuffer.position() + ((i + i) * zzctVar.zzg()));
    }

    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
