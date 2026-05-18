package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmy {
    private static final zzmy zzvr = new zzmy(0, new int[0], new Object[0], false);
    private int count;
    private boolean zznh;
    private int zzrr;
    private Object[] zzue;
    private int[] zzvs;

    private zzmy() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmy zza(zzmy zzmyVar, zzmy zzmyVar2) {
        int i = zzmyVar.count + zzmyVar2.count;
        int[] copyOf = Arrays.copyOf(zzmyVar.zzvs, i);
        System.arraycopy(zzmyVar2.zzvs, 0, copyOf, zzmyVar.count, zzmyVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzmyVar.zzue, i);
        System.arraycopy(zzmyVar2.zzue, 0, copyOf2, zzmyVar.count, zzmyVar2.count);
        return new zzmy(i, copyOf, copyOf2, true);
    }

    public static zzmy zzfa() {
        return zzvr;
    }

    public static zzmy zzfb() {
        return new zzmy();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmy)) {
            return false;
        }
        zzmy zzmyVar = (zzmy) obj;
        int i = this.count;
        if (i == zzmyVar.count) {
            int[] iArr = this.zzvs;
            int[] iArr2 = zzmyVar.zzvs;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzue;
                    Object[] objArr2 = zzmyVar.zzue;
                    int i3 = this.count;
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
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzvs;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzue;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb(zzns zznsVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zznsVar.zzcd() == zzkk.zze.zzsi) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzvs[i], this.zzue[i], zznsVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzvs[i2], this.zzue[i2], zznsVar);
        }
    }

    public final void zzbp() {
        this.zznh = false;
    }

    public final int zzcx() {
        int zze;
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzvs[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzjr.zze(i5, ((Long) this.zzue[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzjr.zzg(i5, ((Long) this.zzue[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzjr.zzc(i5, (zzjc) this.zzue[i3]);
            } else if (i6 == 3) {
                zze = (zzjr.zzab(i5) << 1) + ((zzmy) this.zzue[i3]).zzcx();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(zzkq.zzdl());
                }
                zze = zzjr.zzj(i5, ((Integer) this.zzue[i3]).intValue());
            }
            i2 += zze;
        }
        this.zzrr = i2;
        return i2;
    }

    public final int zzfc() {
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzjr.zzd(this.zzvs[i3] >>> 3, (zzjc) this.zzue[i3]);
        }
        this.zzrr = i2;
        return i2;
    }

    private zzmy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzrr = -1;
        this.count = i;
        this.zzvs = iArr;
        this.zzue = objArr;
        this.zznh = z;
    }

    private static void zzb(int i, Object obj, zzns zznsVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zznsVar.zzi(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zznsVar.zzc(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zznsVar.zza(i2, (zzjc) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zznsVar.zzf(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzkq.zzdl());
        }
        if (zznsVar.zzcd() == zzkk.zze.zzsi) {
            zznsVar.zzak(i2);
            ((zzmy) obj).zzb(zznsVar);
            zznsVar.zzal(i2);
        } else {
            zznsVar.zzal(i2);
            ((zzmy) obj).zzb(zznsVar);
            zznsVar.zzak(i2);
        }
    }

    public final void zza(zzns zznsVar) throws IOException {
        if (zznsVar.zzcd() == zzkk.zze.zzsj) {
            for (int i = this.count - 1; i >= 0; i--) {
                zznsVar.zza(this.zzvs[i] >>> 3, this.zzue[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zznsVar.zza(this.zzvs[i2] >>> 3, this.zzue[i2]);
        }
    }

    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzlt.zza(sb, i, String.valueOf(this.zzvs[i2] >>> 3), this.zzue[i2]);
        }
    }

    public final void zzb(int i, Object obj) {
        if (this.zznh) {
            int i2 = this.count;
            int[] iArr = this.zzvs;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.zzvs = Arrays.copyOf(iArr, i3);
                this.zzue = Arrays.copyOf(this.zzue, i3);
            }
            int[] iArr2 = this.zzvs;
            int i4 = this.count;
            iArr2[i4] = i;
            this.zzue[i4] = obj;
            this.count = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
