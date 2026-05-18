package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcq implements zzcr {
    final /* synthetic */ zzct zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    public zzcq(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new float[zzctVar.zzh()];
        this.zzc = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new float[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(float[] fArr, int i, int i2, int i3) {
        int i4 = 255;
        int i5 = 0;
        double d = 0.0d;
        double d2 = 1.0d;
        int i6 = i2;
        while (true) {
            double d3 = i4;
            double d4 = i5;
            if (i6 > i3) {
                this.zzf = d2 / d4;
                this.zzg = d / d3;
                return i5;
            }
            int i7 = 0;
            double d5 = 0.0d;
            while (i7 < i6) {
                int zzg = this.zza.zzg() * i;
                d5 += Math.abs(fArr[zzg + i7] - fArr[(zzg + i6) + i7]);
                i7++;
                i4 = i4;
            }
            int i8 = i4;
            double d6 = d4 * d5;
            double d7 = i6;
            double d8 = d2 * d7;
            if (d6 < d8) {
                d2 = d5;
            }
            if (d6 < d8) {
                i5 = i6;
            }
            double d9 = d3 * d5;
            double d10 = d7 * d;
            if (d9 > d10) {
                d = d5;
            }
            i4 = d9 > d10 ? i6 : i8;
            i6++;
        }
    }

    private final float[] zzt(float[] fArr, int i, int i2) {
        zzct zzctVar = this.zza;
        int length = fArr.length / zzctVar.zzg();
        return i + i2 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i2) * zzctVar.zzg());
    }

    public final int zza() {
        return 4;
    }

    public final void zzb(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i2 >= zzctVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int zzg = zzctVar.zzg();
            int zzj = zzctVar.zzj();
            float[] fArr2 = this.zze;
            int zzg2 = (zzctVar.zzg() * i) + i2;
            long zzl = (zzctVar.zzl() + 1) * j2;
            long zzm = zzl - (zzctVar.zzm() * j);
            long zzl2 = zzl - (zzctVar.zzl() * j2);
            fArr[(zzj * zzg) + i2] = ((zzm * fArr2[zzg2]) + ((zzl2 - zzm) * fArr2[zzg2 + zzctVar.zzg()])) / zzl2;
            i2++;
        }
    }

    public final boolean zzc() {
        double d = this.zzf;
        return d != 0.0d && this.zza.zzn() != 0 && this.zzg <= d * 3.0d && d + d > this.zzh * 3.0d;
    }

    public final void zzd(int i, int i2) {
        int zzg;
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzh() / i2) {
                return;
            }
            double d = 0.0d;
            int i4 = 0;
            while (true) {
                zzg = zzctVar.zzg() * i2;
                if (i4 < zzg) {
                    d += this.zzc[(zzctVar.zzg() * i) + (zzg * i3) + i4];
                    i4++;
                }
            }
            this.zzb[i3] = (float) (d / zzg);
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
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    public final void zzh(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i9] = ((fArr2[i7] * (i - i10)) + (fArr2[i8] * i10)) / i;
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
            this.zzc[i + i3] = 0.0f;
        }
    }

    public final void zzn(ByteBuffer byteBuffer, int i) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    public final void zzo(ByteBuffer byteBuffer, int i) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzctVar.zzg() * i);
        byteBuffer.position(byteBuffer.position() + (i * 4 * zzctVar.zzg()));
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
