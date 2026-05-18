package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzieg {
    private static final zzieg zza = new zzieg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzieg(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzieg zza() {
        return zza;
    }

    public static zzieg zzb() {
        return new zzieg();
    }

    public static zzieg zzc(zzieg zziegVar, zzieg zziegVar2) {
        int i = zziegVar.zzb + zziegVar2.zzb;
        int[] copyOf = Arrays.copyOf(zziegVar.zzc, i);
        System.arraycopy(zziegVar2.zzc, 0, copyOf, zziegVar.zzb, zziegVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zziegVar.zzd, i);
        System.arraycopy(zziegVar2.zzd, 0, copyOf2, zziegVar.zzb, zziegVar2.zzb);
        return new zzieg(i, copyOf, copyOf2, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzieg)) {
            return false;
        }
        zzieg zziegVar = (zzieg) obj;
        int i = this.zzb;
        if (i == zziegVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziegVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziegVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzieu zzieuVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzieuVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzieu zzieuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzieuVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzieuVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzieuVar.zzn(i4, (zzian) obj);
                } else if (i3 == 3) {
                    zzieuVar.zzt(i4);
                    ((zzieg) obj).zzg(zzieuVar);
                    zzieuVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    zzieuVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzian zzianVar = (zzian) this.zzd[i3];
            int zzA = zziaw.zzA(8);
            int zzA2 = zziaw.zzA(16) + zziaw.zzA(i4);
            int zzA3 = zziaw.zzA(24);
            int zzc = zzianVar.zzc();
            i2 += zzA + zzA + zzA2 + zzA3 + zziaw.zzA(zzc) + zzc;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzA;
        int zzB;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zziaw.zzA(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzian zzianVar = (zzian) this.zzd[i4];
                    int zzA2 = zziaw.zzA(i8);
                    int zzc = zzianVar.zzc();
                    i = zzA2 + zziaw.zzA(zzc) + zzc;
                } else if (i7 == 3) {
                    int zzA3 = zziaw.zzA(i6 << 3);
                    zzA = zzA3 + zzA3;
                    zzB = ((zzieg) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zziaw.zzA(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzA = zziaw.zzA(i9);
                zzB = zziaw.zzB(longValue);
            }
            i = zzA + zzB;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzide.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final boolean zzl(int i, zziaq zziaqVar) throws IOException {
        int zza2;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zziaqVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zziaqVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zziaqVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zziaqVar.zzI();
                return false;
            }
            if (i2 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zziaqVar.zzj()));
            return true;
        }
        zzieg zziegVar = new zzieg();
        do {
            zza2 = zziaqVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zziegVar.zzl(zza2, zziaqVar));
        zziaqVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zziegVar);
        return true;
    }

    public final zzieg zzm(zzieg zziegVar) {
        if (zziegVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zziegVar.zzb;
        zzn(i);
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzb, zziegVar.zzb);
        System.arraycopy(zziegVar.zzd, 0, this.zzd, this.zzb, zziegVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzieg() {
        this(0, new int[8], new Object[8], true);
    }
}
