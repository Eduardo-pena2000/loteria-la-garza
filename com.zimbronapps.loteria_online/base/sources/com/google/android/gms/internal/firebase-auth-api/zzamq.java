package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzamq implements zzanb {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu zzp;
    private final zzakw zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i, int i2, zzamm zzammVar, boolean z, int[] iArr2, int i3, int i4, zzamu zzamuVar, zzalw zzalwVar, zzanu zzanuVar, zzakw zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static double zza(Object obj, long j) {
        return ((Double) zzanz.zze(obj, j)).doubleValue();
    }

    private static float zzb(Object obj, long j) {
        return ((Float) zzanz.zze(obj, j)).floatValue();
    }

    private static int zzc(Object obj, long j) {
        return ((Integer) zzanz.zze(obj, j)).intValue();
    }

    private static long zzd(Object obj, long j) {
        return ((Long) zzanz.zze(obj, j)).longValue();
    }

    private final zzanb zze(int i) {
        int i2 = (i / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i2];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb zza2 = zzamx.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i, int i2, zzaog zzaogVar, Class cls, zzaju zzajuVar) throws IOException {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int zzd = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return zzd;
            case 2:
                return zzajr.zza(bArr, i, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i));
                return i + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return zzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza(cls), bArr, i, i2, zzajuVar);
            case 15:
                int zzc2 = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return zzd3;
            case 17:
                return zzajr.zzb(bArr, i, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private final zzalj zzd(int i) {
        return (zzalj) this.zzd[((i / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    public final int zzb(Object obj) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzalh.zza(Double.doubleToLongBits(zzanz.zza(obj, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzanz.zzb(obj, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzh(obj, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzanz.zze(obj, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zzanz.zze(obj, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzanz.zze(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzanz.zzc(obj, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(obj, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zzanz.zze(obj, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzanz.zze(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzanz.zze(obj, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(Double.doubleToLongBits(zza(obj, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zzd(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zzd(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zzd(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zze(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzanz.zze(obj, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzanz.zze(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzanz.zze(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zzd(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(obj, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzalh.zza(zzd(obj, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc(obj, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzanz.zze(obj, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzp.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(obj).hashCode() : hashCode;
    }

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzd = zzanx.zzd();
        zzalfVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.firebase-auth-api.zzalf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzu()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzamf r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.firebase-auth-api.zzalw r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.firebase-auth-api.zzanu r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.firebase-auth-api.zzakw r0 = r7.zzq
            r0.zzc(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zze(java.lang.Object):boolean");
    }

    private final boolean zzc(Object obj, Object obj2, int i) {
        return zzc(obj, i) == zzc(obj2, i);
    }

    private final boolean zzc(Object obj, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzanz.zzc(obj, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(obj, j2)) != 0;
            case 2:
                return zzanz.zzd(obj, j2) != 0;
            case 3:
                return zzanz.zzd(obj, j2) != 0;
            case 4:
                return zzanz.zzc(obj, j2) != 0;
            case 5:
                return zzanz.zzd(obj, j2) != 0;
            case 6:
                return zzanz.zzc(obj, j2) != 0;
            case 7:
                return zzanz.zzh(obj, j2);
            case 8:
                Object zze = zzanz.zze(obj, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzajv) {
                    return !zzajv.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(obj, j2) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(obj, j2));
            case 11:
                return zzanz.zzc(obj, j2) != 0;
            case 12:
                return zzanz.zzc(obj, j2) != 0;
            case 13:
                return zzanz.zzc(obj, j2) != 0;
            case 14:
                return zzanz.zzd(obj, j2) != 0;
            case 15:
                return zzanz.zzc(obj, j2) != 0;
            case 16:
                return zzanz.zzd(obj, j2) != 0;
            case 17:
                return zzanz.zze(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zza2;
        int zza3;
        int zzd;
        boolean z;
        int zzc;
        int zzd2;
        int zzh;
        int zzi;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzc.length) {
            int zzc2 = zzc(i7);
            int i9 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(obj, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzc2 & i4;
            if (i9 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            switch (i9) {
                case 0:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zza(i10, 0.0d);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zza(i10, 0.0f);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zzb(i10, unsafe.getLong(obj, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zze(i10, unsafe.getLong(obj, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zzc(i10, unsafe.getInt(obj, j));
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zza(i10, 0L);
                        i8 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza2 = zzakn.zzb(i10, 0);
                        i8 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zza(i10, true);
                        i8 += zza3;
                    }
                    break;
                case 8:
                    if (zza(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzajv) {
                            zza3 = zzakn.zza(i10, (zzajv) object);
                        } else {
                            zza3 = zzakn.zza(i10, (String) object);
                        }
                        i8 += zza3;
                    }
                    break;
                case 9:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzand.zza(i10, unsafe.getObject(obj, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case 10:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zza(i10, (zzajv) unsafe.getObject(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 11:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zzf(i10, unsafe.getInt(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 12:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zza(i10, unsafe.getInt(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 13:
                    if (zza(obj, i7, i, i2, i3)) {
                        zzd = zzakn.zzd(i10, 0);
                        i8 += zzd;
                    }
                    break;
                case 14:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zzc(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case 15:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zze(i10, unsafe.getInt(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 16:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzakn.zzd(i10, unsafe.getLong(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 17:
                    if (zza(obj, i7, i, i2, i3)) {
                        zza3 = zzand.zza(i10, (zzamm) unsafe.getObject(obj, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case 18:
                    zza3 = zzand.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zza3;
                    break;
                case 19:
                    z = false;
                    zzc = zzand.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 20:
                    z = false;
                    zzc = zzand.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 21:
                    z = false;
                    zzc = zzand.zzj(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 22:
                    z = false;
                    zzc = zzand.zze(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 23:
                    z = false;
                    zzc = zzand.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 24:
                    z = false;
                    zzc = zzand.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 25:
                    z = false;
                    zzc = zzand.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 26:
                    zza3 = zzand.zzb(i10, (List) unsafe.getObject(obj, j));
                    i8 += zza3;
                    break;
                case 27:
                    zza3 = zzand.zzb(i10, (List) unsafe.getObject(obj, j), zze(i7));
                    i8 += zza3;
                    break;
                case 28:
                    zza3 = zzand.zza(i10, (List) unsafe.getObject(obj, j));
                    i8 += zza3;
                    break;
                case 29:
                    zza3 = zzand.zzi(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zza3;
                    break;
                case 30:
                    z = false;
                    zzc = zzand.zzb(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 31:
                    z = false;
                    zzc = zzand.zzc(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 32:
                    z = false;
                    zzc = zzand.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 33:
                    z = false;
                    zzc = zzand.zzg(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 34:
                    z = false;
                    zzc = zzand.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzc;
                    break;
                case 35:
                    zzd2 = zzand.zzd((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 36:
                    zzd2 = zzand.zzc((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 37:
                    zzd2 = zzand.zzf((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 38:
                    zzd2 = zzand.zzj((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 39:
                    zzd2 = zzand.zze((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 40:
                    zzd2 = zzand.zzd((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 41:
                    zzd2 = zzand.zzc((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 42:
                    zzd2 = zzand.zza((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 43:
                    zzd2 = zzand.zzi((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 44:
                    zzd2 = zzand.zzb((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 45:
                    zzd2 = zzand.zzc((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 46:
                    zzd2 = zzand.zzd((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 47:
                    zzd2 = zzand.zzg((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 48:
                    zzd2 = zzand.zzh((List) unsafe.getObject(obj, j));
                    if (zzd2 > 0) {
                        zzh = zzakn.zzh(i10);
                        zzi = zzakn.zzi(zzd2);
                        zzd = zzh + zzi + zzd2;
                        i8 += zzd;
                    }
                    break;
                case 49:
                    zza3 = zzand.zza(i10, (List) unsafe.getObject(obj, j), zze(i7));
                    i8 += zza3;
                    break;
                case 50:
                    zza3 = this.zzr.zza(i10, unsafe.getObject(obj, j), zzf(i7));
                    i8 += zza3;
                    break;
                case 51:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, 0.0d);
                        i8 += zza3;
                    }
                    break;
                case 52:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, 0.0f);
                        i8 += zza3;
                    }
                    break;
                case 53:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zzb(i10, zzd(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 54:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zze(i10, zzd(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 55:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zzc(i10, zzc(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 56:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case 57:
                    if (zzc(obj, i10, i7)) {
                        zzd = zzakn.zzb(i10, 0);
                        i8 += zzd;
                    }
                    break;
                case 58:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, true);
                        i8 += zza3;
                    }
                    break;
                case 59:
                    if (zzc(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzajv) {
                            zza3 = zzakn.zza(i10, (zzajv) object2);
                        } else {
                            zza3 = zzakn.zza(i10, (String) object2);
                        }
                        i8 += zza3;
                    }
                    break;
                case 60:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzand.zza(i10, unsafe.getObject(obj, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
                case 61:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, (zzajv) unsafe.getObject(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 62:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zzf(i10, zzc(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 63:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zza(i10, zzc(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 64:
                    if (zzc(obj, i10, i7)) {
                        zzd = zzakn.zzd(i10, 0);
                        i8 += zzd;
                    }
                    break;
                case 65:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zzc(i10, 0L);
                        i8 += zza3;
                    }
                    break;
                case 66:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zze(i10, zzc(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 67:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzakn.zzd(i10, zzd(obj, j));
                        i8 += zza3;
                    }
                    break;
                case 68:
                    if (zzc(obj, i10, i7)) {
                        zza3 = zzand.zza(i10, (zzamm) unsafe.getObject(obj, j), zze(i7));
                        i8 += zza3;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int i13 = 0;
        zzanu zzanuVar = this.zzp;
        int zza4 = i8 + zzanuVar.zza(zzanuVar.zzd(obj));
        if (!this.zzh) {
            return zza4;
        }
        zzakx zza5 = this.zzq.zza(obj);
        int zzb2 = zza5.zza.zzb();
        for (int i14 = 0; i14 < zzb2; i14++) {
            Map.Entry zza6 = zza5.zza.zza(i14);
            i13 += zzakx.zza((zzakz) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry entry : zza5.zza.zzc()) {
            i13 += zzakx.zza((zzakz) entry.getKey(), entry.getValue());
        }
        return zza4 + i13;
    }

    private static boolean zze(Object obj, long j) {
        return ((Boolean) zzanz.zze(obj, j)).booleanValue();
    }

    private final boolean zzc(Object obj, int i, int i2) {
        return zzanz.zzc(obj, (long) (zzb(i2) & 1048575)) == i;
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final void zzb(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzc(obj2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzc);
            if (object != null) {
                zzanb zze = zze(i);
                if (!zzc(obj, i2, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(obj, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(obj, zzc, zza2);
                    }
                    zzb(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(obj, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(obj2));
        }
    }

    private final void zzb(Object obj, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzanz.zza(obj, j, (1 << (zzb2 >>> 20)) | zzanz.zzc(obj, j));
    }

    private final void zzb(Object obj, int i, int i2) {
        zzanz.zza(obj, zzb(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d79, code lost:
    
        if (r13 == r8) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d7b, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d81, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d88, code lost:
    
        if (r6 >= r11.zzm) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d8a, code lost:
    
        r3 = (com.google.android.gms.internal.firebase-auth-api.zzanx) zza(r33, r11.zzk[r6], r3, r11.zzp, r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0da0, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0da2, code lost:
    
        r11.zzp.zzb(r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0da7, code lost:
    
        if (r9 != 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dab, code lost:
    
        if (r7 != r36) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db2, code lost:
    
        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0db9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0db5, code lost:
    
        if (r7 > r36) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0db7, code lost:
    
        if (r10 != r9) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dbe, code lost:
    
        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.firebase-auth-api.zzaju r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.firebase-auth-api.zzamq zza(java.lang.Class r32, com.google.android.gms.internal.firebase-auth-api.zzamk r33, com.google.android.gms.internal.firebase-auth-api.zzamu r34, com.google.android.gms.internal.firebase-auth-api.zzalw r35, com.google.android.gms.internal.firebase-auth-api.zzanu r36, com.google.android.gms.internal.firebase-auth-api.zzakw r37, com.google.android.gms.internal.firebase-auth-api.zzamf r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzamk, com.google.android.gms.internal.firebase-auth-api.zzamu, com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzanu, com.google.android.gms.internal.firebase-auth-api.zzakw, com.google.android.gms.internal.firebase-auth-api.zzamf):com.google.android.gms.internal.firebase-auth-api.zzamq");
    }

    private final Object zza(Object obj, int i, Object obj2, zzanu zzanuVar, Object obj3) {
        zzalj zzd;
        int i2 = this.zzc[i];
        Object zze = zzanz.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? obj2 : zza(i, i2, this.zzr.zze(zze), zzd, obj2, zzanuVar, obj3);
    }

    private final Object zza(int i, int i2, Map map, zzalj zzaljVar, Object obj, zzanu zzanuVar, Object obj2) {
        zzamd zza2 = this.zzr.zza(zzf(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzaljVar.zza(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = zzanuVar.zzc(obj2);
                }
                zzake zzc = zzajv.zzc(zzame.zza(zza2, entry.getKey(), entry.getValue()));
                try {
                    zzame.zza(zzc.zzb(), zza2, entry.getKey(), entry.getValue());
                    zzanuVar.zza(obj, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private final Object zza(Object obj, int i) {
        zzanb zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc(obj, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(obj, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    private final Object zza(Object obj, int i, int i2) {
        zzanb zze = zze(i2);
        if (!zzc(obj, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(obj, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    public final Object zza() {
        return this.zzn.zza(this.zzg);
    }

    private static Field zza(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    public final void zza(Object obj, Object obj2) {
        zzf(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zza(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzb(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc(obj2, i)) {
                        zzanz.zzc(obj, j, zzanz.zzh(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zze(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(obj, obj2, i);
                    break;
                case 10:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zze(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzc(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc(obj2, i)) {
                        zzanz.zza(obj, j, zzanz.zzd(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(obj, obj2, j);
                    break;
                case 50:
                    zzand.zza(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc(obj2, i2, i)) {
                        zzanz.zza(obj, j, zzanz.zze(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc(obj2, i2, i)) {
                        zzanz.zza(obj, j, zzanz.zze(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(obj, obj2, i);
                    break;
            }
        }
        zzand.zza(this.zzp, obj, obj2);
        if (this.zzh) {
            zzand.zza(this.zzq, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0630 A[Catch: all -> 0x00cb, TryCatch #6 {all -> 0x00cb, blocks: (B:51:0x00c5, B:14:0x00d3, B:33:0x062b, B:35:0x0630, B:36:0x0635, B:88:0x00ff, B:91:0x0114, B:93:0x0125, B:95:0x0136, B:97:0x0147, B:99:0x0158, B:101:0x0162, B:104:0x0169, B:105:0x016e, B:107:0x017b, B:109:0x018c, B:111:0x019a, B:113:0x01ac, B:115:0x01b4, B:117:0x01c6, B:119:0x01d8, B:121:0x01ea, B:123:0x01fc, B:125:0x020e, B:127:0x0220, B:129:0x0232, B:131:0x0244, B:133:0x0254, B:134:0x0275, B:135:0x025e, B:137:0x0266, B:139:0x0286, B:141:0x0298, B:143:0x02a6, B:145:0x02b4, B:147:0x02c2), top: B:50:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x063b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0665 A[LOOP:3: B:56:0x0661->B:58:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0679  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Object r18, com.google.android.gms.internal.firebase-auth-api.zzanc r19, com.google.android.gms.internal.firebase-auth-api.zzaku r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    public final void zza(Object obj, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        zza(obj, bArr, i, i2, 0, zzajuVar);
    }

    private final void zza(Object obj, Object obj2, int i) {
        if (zzc(obj2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzc);
            if (object != null) {
                zzanb zze = zze(i);
                if (!zzc(obj, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(obj, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(obj, zzc, zza2);
                    }
                    zzb(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(obj, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(obj2));
        }
    }

    private final void zza(Object obj, int i, zzanc zzancVar) throws IOException {
        if (zzg(i)) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzc(i) & 1048575, obj2);
        zzb(obj, i);
    }

    private final void zza(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzc(i2) & 1048575, obj2);
        zzb(obj, i, i2);
    }

    private final void zza(zzaol zzaolVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaolVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) throws IOException {
        if (obj instanceof String) {
            zzaolVar.zza(i, (String) obj);
        } else {
            zzaolVar.zza(i, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x054a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Object r24, com.google.android.gms.internal.firebase-auth-api.zzaol r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaol):void");
    }

    private static void zza(zzanu zzanuVar, Object obj, zzaol zzaolVar) throws IOException {
        zzanuVar.zzb(zzanuVar.zzd(obj), zzaolVar);
    }

    private final boolean zza(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zza(Object obj, int i, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i & 1048575));
    }
}
