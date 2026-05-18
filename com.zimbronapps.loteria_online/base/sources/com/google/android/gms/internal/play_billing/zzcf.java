package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcf extends zzbw {
    static final zzbw zza = new zzcf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzcf(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzcf zzg(int i, Object[] objArr, zzbv zzbvVar) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzcf) zza;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzbo.zza(obj2, obj3);
            return new zzcf(null, objArr2, 1);
        }
        zzbg.zzb(i3, objArr2.length >> 1, "index");
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzbo.zza(obj4, obj5);
            i3 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr2 = new byte[i2];
                Arrays.fill(bArr2, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i7 + i7;
                    int i9 = i6 + i6;
                    Object obj6 = objArr2[i9];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i9 ^ i4];
                    Objects.requireNonNull(obj7);
                    zzbo.zza(obj6, obj7);
                    int zza2 = zzbp.zza(obj6.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr2[i10] & 255;
                        if (i11 == 255) {
                            bArr2[i10] = (byte) i8;
                            if (i7 < i6) {
                                objArr2[i8] = obj6;
                                objArr2[i8 ^ 1] = obj7;
                            }
                            i7++;
                        } else {
                            if (obj6.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                Object obj8 = objArr2[i12];
                                Objects.requireNonNull(obj8);
                                zzbu zzbuVar = new zzbu(obj6, obj7, obj8);
                                objArr2[i12] = obj7;
                                obj = zzbuVar;
                                break;
                            }
                            zza2 = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i7), obj};
                    c2 = 2;
                    c = 1;
                    obj = bArr;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object obj9 = objArr2[i16];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArr2[i16 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzbo.zza(obj9, obj10);
                    int zza3 = zzbp.zza(obj9.hashCode());
                    while (true) {
                        int i17 = zza3 & i5;
                        char c4 = (char) sArr[i17];
                        if (c4 == 65535) {
                            sArr[i17] = (short) i15;
                            if (i13 < i14) {
                                objArr2[i15] = obj9;
                                objArr2[i15 ^ 1] = obj10;
                            }
                            i13++;
                        } else {
                            if (obj9.equals(objArr2[c4])) {
                                int i18 = c4 ^ 1;
                                Object obj11 = objArr2[i18];
                                Objects.requireNonNull(obj11);
                                zzbu zzbuVar2 = new zzbu(obj9, obj10, obj11);
                                objArr2[i18] = obj10;
                                obj = zzbuVar2;
                                break;
                            }
                            zza3 = i17 + 1;
                        }
                    }
                }
                if (i13 != i3) {
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i13), obj};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i19 = 1;
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i20 = 0;
                int i21 = 0;
                while (i20 < i3) {
                    int i22 = i21 + i21;
                    int i23 = i20 + i20;
                    Object obj12 = objArr2[i23];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArr2[i23 ^ i19];
                    Objects.requireNonNull(obj13);
                    zzbo.zza(obj12, obj13);
                    int zza4 = zzbp.zza(obj12.hashCode());
                    while (true) {
                        int i24 = zza4 & i5;
                        ?? r15 = sArr[i24];
                        if (r15 == c3) {
                            sArr[i24] = i22;
                            if (i21 < i20) {
                                objArr2[i22] = obj12;
                                objArr2[i22 ^ 1] = obj13;
                            }
                            i21++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i25 = r15 ^ 1;
                                Object obj14 = objArr2[i25];
                                Objects.requireNonNull(obj14);
                                zzbu zzbuVar3 = new zzbu(obj12, obj13, obj14);
                                objArr2[i25] = obj13;
                                obj = zzbuVar3;
                                break;
                            }
                            zza4 = i24 + 1;
                            c3 = 65535;
                        }
                    }
                    i20++;
                    i19 = 1;
                    c3 = 65535;
                }
                if (i21 != i3) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                }
                bArr = sArr;
            }
            c2 = 2;
            c = 1;
            obj = bArr;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            zzbu zzbuVar4 = (zzbu) objArr3[c2];
            if (zzbvVar == null) {
                throw zzbuVar4.zza();
            }
            zzbvVar.zzc = zzbuVar4;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i3 = intValue;
        }
        return new zzcf(obj15, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0003 A[EDGE_INSN: B:25:0x0003->B:3:0x0003 BREAK  A[LOOP:0: B:18:0x0038->B:22:0x004e], EDGE_INSN: B:36:0x0003->B:3:0x0003 BREAK  A[LOOP:1: B:29:0x0063->B:33:0x007a], EDGE_INSN: B:45:0x0003->B:3:0x0003 BREAK  A[LOOP:2: B:38:0x0089->B:42:0x00a0]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzbp.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzbp.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.zzbp.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzcf.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    public final zzbq zza() {
        return new zzce(this.zzb, 1, this.zzd);
    }

    public final zzbx zzd() {
        return new zzcc(this, this.zzb, 0, this.zzd);
    }

    public final zzbx zze() {
        return new zzcd(this, new zzce(this.zzb, 0, this.zzd));
    }
}
