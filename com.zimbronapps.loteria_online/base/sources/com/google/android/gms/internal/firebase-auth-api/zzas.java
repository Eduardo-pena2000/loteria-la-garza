package com.google.android.gms.internal.firebase-auth-api;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzas extends zzal {
    private static final zzal zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0009 A[EDGE_INSN: B:24:0x0009->B:3:0x0009 BREAK  A[LOOP:0: B:17:0x0037->B:21:0x004d], EDGE_INSN: B:35:0x0009->B:3:0x0009 BREAK  A[LOOP:1: B:28:0x0062->B:32:0x0079], EDGE_INSN: B:44:0x0009->B:3:0x0009 BREAK  A[LOOP:2: B:37:0x0088->B:41:0x00a0]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzas.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    public final zzag zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    public final zzaq zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    public final zzaq zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzas zza(int i, Object[] objArr, zzao zzaoVar) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzas) zza;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzae.zza(obj2, obj3);
            return new zzas(null, objArr2, 1);
        }
        zzu.zzb(i3, objArr2.length >> 1);
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1) << 1;
            while (i2 * 0.7d < max) {
                i2 <<= 1;
            }
        } else {
            i2 = 1073741824;
            zzu.zza(max < 1073741824, "collection too large");
        }
        if (i3 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzae.zza(obj4, obj5);
            c = 1;
            c2 = 2;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i6 * 2;
                    int i9 = i7 * 2;
                    Object obj6 = objArr2[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i8 ^ i4];
                    Objects.requireNonNull(obj7);
                    zzae.zza(obj6, obj7);
                    int zza2 = zzad.zza(obj6.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i9;
                            if (i7 < i6) {
                                objArr2[i9] = obj6;
                                objArr2[i9 ^ 1] = obj7;
                            }
                            i7++;
                        } else {
                            if (obj6.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                Object obj8 = objArr2[i12];
                                Objects.requireNonNull(obj8);
                                obj = new zzan(obj6, obj7, obj8);
                                objArr2[i12] = obj7;
                                break;
                            }
                            zza2 = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    obj = bArr;
                    c2 = 2;
                    c = 1;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i7), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (i2 <= 32768) {
                    sArr = new short[i2];
                    Arrays.fill(sArr, (short) -1);
                    int i13 = 0;
                    for (int i14 = 0; i14 < i3; i14++) {
                        int i15 = i14 * 2;
                        int i16 = i13 * 2;
                        Object obj9 = objArr2[i15];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i15 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzae.zza(obj9, obj10);
                        int zza3 = zzad.zza(obj9.hashCode());
                        while (true) {
                            int i17 = zza3 & i5;
                            int i18 = sArr[i17] & 65535;
                            if (i18 == 65535) {
                                sArr[i17] = (short) i16;
                                if (i13 < i14) {
                                    objArr2[i16] = obj9;
                                    objArr2[i16 ^ 1] = obj10;
                                }
                                i13++;
                            } else {
                                if (obj9.equals(objArr2[i18])) {
                                    int i19 = i18 ^ 1;
                                    Object obj11 = objArr2[i19];
                                    Objects.requireNonNull(obj11);
                                    obj = new zzan(obj9, obj10, obj11);
                                    objArr2[i19] = obj10;
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
                } else {
                    sArr = new int[i2];
                    Arrays.fill((int[]) sArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i3) {
                        int i22 = i20 * 2;
                        int i23 = i21 * 2;
                        Object obj12 = objArr2[i22];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i22 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzae.zza(obj12, obj13);
                        int zza4 = zzad.zza(obj12.hashCode());
                        while (true) {
                            int i24 = zza4 & i5;
                            ?? r15 = sArr[i24];
                            if (r15 == c3) {
                                sArr[i24] = i23;
                                if (i21 < i20) {
                                    objArr2[i23] = obj12;
                                    objArr2[i23 ^ 1] = obj13;
                                }
                                i21++;
                            } else {
                                if (obj12.equals(objArr2[r15])) {
                                    int i25 = r15 ^ 1;
                                    Object obj14 = objArr2[i25];
                                    Objects.requireNonNull(obj14);
                                    obj = new zzan(obj12, obj13, obj14);
                                    objArr2[i25] = obj13;
                                    break;
                                }
                                zza4 = i24 + 1;
                                c3 = 65535;
                            }
                        }
                        i20++;
                        c3 = 65535;
                    }
                    if (i21 != i3) {
                        c = 1;
                        c2 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                    }
                }
                obj = sArr;
                c2 = 2;
                c = 1;
            }
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            zzan zzanVar = (zzan) objArr3[c2];
            if (zzaoVar == null) {
                throw zzanVar.zza();
            }
            zzaoVar.zza = zzanVar;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue << 1);
            obj15 = obj16;
            i3 = intValue;
        }
        return new zzas(obj15, objArr2, i3);
    }
}
