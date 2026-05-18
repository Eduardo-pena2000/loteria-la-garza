package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int zzt = zzerVar.zzt();
        int zzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(zzt, zzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i) {
        int zzj;
        int zzj2;
        int i2;
        int i3;
        int i4 = 8;
        int zzj3 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzj4 = zzeqVar.zzj(i4);
            int zzj5 = zzeqVar.zzj(i4);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i2 = zzeqVar.zzj(i4);
                i3 = zzeqVar.zzj(i4);
                zzj = zzeqVar.zzj(i4);
                zzj2 = zzeqVar.zzj(i4);
                i5 -= 6;
            } else {
                int zzj6 = zzeqVar.zzj(6) << 2;
                int zzj7 = zzeqVar.zzj(4) << 4;
                i5 -= 4;
                zzj = zzeqVar.zzj(4) << 4;
                zzj2 = zzeqVar.zzj(2) << 6;
                i2 = zzj6;
                i3 = zzj7;
            }
            if (i2 == 0) {
                zzj2 = 255;
            }
            if (i2 == 0) {
                zzj = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            double d = i2;
            String str = zzfj.zza;
            double d2 = i3 - 128;
            double d3 = zzj - 128;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzj3 = zzj3;
            i4 = 8;
        }
        return new zzamj(zzj3, zzd, zze, zzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int zzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int zzj2 = zzeqVar.zzj(2);
        boolean zzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (zzj2 != 1) {
            if (zzj2 == 0) {
                int zzj3 = zzeqVar.zzj(16);
                int zzj4 = zzeqVar.zzj(16);
                if (zzj3 > 0) {
                    bArr2 = new byte[zzj3];
                    zzeqVar.zzn(bArr2, 0, zzj3);
                }
                if (zzj4 > 0) {
                    bArr = new byte[zzj4];
                    zzeqVar.zzn(bArr, 0, zzj4);
                }
            }
            return new zzaml(zzj, zzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaml(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[LOOP:3: B:88:0x0172->B:101:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i, int i2, zzeq zzeqVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzeqVar.zzj(i2);
        }
        return bArr;
    }

    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzalx zzalxVar;
        char c;
        char c2;
        char c3;
        int i3;
        zzamq zzamqVar;
        zzamk zzamkVar;
        int i4;
        int i5;
        List list;
        int i6;
        zzamo zzamoVar;
        int i7;
        int i8;
        zzamo zzamoVar2;
        int i9;
        int zzj;
        int zzj2;
        int i10;
        int i11;
        int i12;
        int i13;
        zzeq zzeqVar = new zzeq(bArr, i + i2);
        zzeqVar.zzf(i);
        while (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
            zzamq zzamqVar2 = this.zzi;
            int zzj3 = zzeqVar.zzj(8);
            int zzj4 = zzeqVar.zzj(16);
            int zzj5 = zzeqVar.zzj(16);
            int zze = zzeqVar.zze() + zzj5;
            if (zzj5 * 8 > zzeqVar.zzc()) {
                zzee.zzc("DvbParser", "Data field length exceeds limit");
                zzeqVar.zzh(zzeqVar.zzc());
            } else {
                switch (zzj3) {
                    case 16:
                        if (zzj4 == zzamqVar2.zza) {
                            zzamm zzammVar = zzamqVar2.zzi;
                            int zzj6 = zzeqVar.zzj(8);
                            int zzj7 = zzeqVar.zzj(4);
                            int zzj8 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            SparseArray sparseArray = new SparseArray();
                            for (int i14 = zzj5 - 2; i14 > 0; i14 -= 6) {
                                int zzj9 = zzeqVar.zzj(8);
                                zzeqVar.zzh(8);
                                sparseArray.put(zzj9, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                            }
                            zzamm zzammVar2 = new zzamm(zzj6, zzj7, zzj8, sparseArray);
                            if (zzammVar2.zzb != 0) {
                                zzamqVar2.zzi = zzammVar2;
                                zzamqVar2.zzc.clear();
                                zzamqVar2.zzd.clear();
                                zzamqVar2.zze.clear();
                                break;
                            } else if (zzammVar != null) {
                                if (zzammVar.zza != zzammVar2.zza) {
                                    zzamqVar2.zzi = zzammVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzamm zzammVar3 = zzamqVar2.zzi;
                        if (zzj4 == zzamqVar2.zza && zzammVar3 != null) {
                            int zzj10 = zzeqVar.zzj(8);
                            zzeqVar.zzh(4);
                            boolean zzi = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int zzj11 = zzeqVar.zzj(16);
                            int zzj12 = zzeqVar.zzj(16);
                            int zzj13 = zzeqVar.zzj(3);
                            int zzj14 = zzeqVar.zzj(3);
                            zzeqVar.zzh(2);
                            int zzj15 = zzeqVar.zzj(8);
                            int zzj16 = zzeqVar.zzj(8);
                            int zzj17 = zzeqVar.zzj(4);
                            int zzj18 = zzeqVar.zzj(2);
                            zzeqVar.zzh(2);
                            int i15 = zzj5 - 10;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i15 > 0) {
                                int zzj19 = zzeqVar.zzj(16);
                                int zzj20 = zzeqVar.zzj(2);
                                int zzj21 = zzeqVar.zzj(2);
                                int zzj22 = zzeqVar.zzj(12);
                                zzeqVar.zzh(4);
                                int zzj23 = zzeqVar.zzj(12);
                                int i16 = i15 - 6;
                                if (zzj20 == 1) {
                                    i15 -= 8;
                                    i9 = zzj20;
                                    zzj = zzeqVar.zzj(8);
                                    zzj2 = zzeqVar.zzj(8);
                                } else if (zzj20 == 2) {
                                    zzj20 = 2;
                                    i15 -= 8;
                                    i9 = zzj20;
                                    zzj = zzeqVar.zzj(8);
                                    zzj2 = zzeqVar.zzj(8);
                                } else {
                                    i9 = zzj20;
                                    i15 = i16;
                                    zzj = 0;
                                    zzj2 = 0;
                                }
                                sparseArray2.put(zzj19, new zzamp(i9, zzj21, zzj22, zzj23, zzj, zzj2));
                            }
                            zzamo zzamoVar3 = new zzamo(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                            if (zzammVar3.zzb == 0 && (zzamoVar2 = (zzamo) zzamqVar2.zzc.get(zzamoVar3.zza)) != null) {
                                int i17 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = zzamoVar2.zzj;
                                    if (i17 < sparseArray3.size()) {
                                        zzamoVar3.zzj.put(sparseArray3.keyAt(i17), (zzamp) sparseArray3.valueAt(i17));
                                        i17++;
                                    }
                                }
                            }
                            zzamqVar2.zzc.put(zzamoVar3.zza, zzamoVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (zzj4 == zzamqVar2.zza) {
                            zzamj zzb2 = zzb(zzeqVar, zzj5);
                            zzamqVar2.zzd.put(zzb2.zza, zzb2);
                            break;
                        } else if (zzj4 == zzamqVar2.zzb) {
                            zzamj zzb3 = zzb(zzeqVar, zzj5);
                            zzamqVar2.zzf.put(zzb3.zza, zzb3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzj4 == zzamqVar2.zza) {
                            zzaml zzc2 = zzc(zzeqVar);
                            zzamqVar2.zze.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzj4 == zzamqVar2.zzb) {
                            zzaml zzc3 = zzc(zzeqVar);
                            zzamqVar2.zzg.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 20:
                        if (zzj4 == zzamqVar2.zza) {
                            zzeqVar.zzh(4);
                            boolean zzi2 = zzeqVar.zzi();
                            zzeqVar.zzh(3);
                            int zzj24 = zzeqVar.zzj(16);
                            int zzj25 = zzeqVar.zzj(16);
                            if (zzi2) {
                                int zzj26 = zzeqVar.zzj(16);
                                i10 = zzeqVar.zzj(16);
                                i13 = zzeqVar.zzj(16);
                                i11 = zzeqVar.zzj(16);
                                i12 = zzj26;
                            } else {
                                i10 = zzj24;
                                i11 = zzj25;
                                i12 = 0;
                                i13 = 0;
                            }
                            zzamqVar2.zzh = new zzamk(zzj24, zzj25, i12, i10, i13, i11);
                            break;
                        }
                        break;
                }
                zzeqVar.zzo(zze - zzeqVar.zze());
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar2 = zzamqVar3.zzh;
            if (zzamkVar2 == null) {
                zzamkVar2 = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar2.zza + 1 != bitmap.getWidth() || zzamkVar2.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzamkVar2.zza + 1, zzamkVar2.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            List arrayList = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i18 = 0;
            while (i18 < sparseArray4.size()) {
                Canvas canvas = this.zzf;
                canvas.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i18);
                zzamo zzamoVar4 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i18));
                int i19 = zzamnVar.zza + zzamkVar2.zzc;
                int i20 = zzamnVar.zzb + zzamkVar2.zze;
                int i21 = zzamoVar4.zzc;
                int i22 = i19 + i21;
                int min = Math.min(i22, zzamkVar2.zzd);
                int i23 = zzamoVar4.zzd;
                int i24 = i20 + i23;
                canvas.clipRect(i19, i20, min, Math.min(i24, zzamkVar2.zzf));
                int i25 = zzamoVar4.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i25);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i25)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar4.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i26 = i22;
                int i27 = 0;
                while (i27 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i27);
                    SparseArray sparseArray7 = sparseArray5;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i27);
                    int i28 = i21;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(keyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(keyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        int i29 = zzamoVar4.zze;
                        zzamqVar = zzamqVar3;
                        int i30 = zzampVar.zza + i19;
                        int i31 = zzampVar.zzb + i20;
                        int i32 = i19;
                        int[] iArr = i29 == 3 ? zzamjVar.zzd : i29 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i5 = i18;
                        i7 = i26;
                        list = arrayList;
                        zzamkVar = zzamkVar2;
                        i8 = i28;
                        i6 = i32;
                        i4 = i23;
                        zzamoVar = zzamoVar4;
                        zzh(zzamlVar.zzc, iArr, i29, i30, i31, paint, canvas);
                        zzh(zzamlVar.zzd, iArr, i29, i30, i31 + 1, paint, canvas);
                    } else {
                        zzamqVar = zzamqVar3;
                        zzamkVar = zzamkVar2;
                        i4 = i23;
                        i5 = i18;
                        list = arrayList;
                        i6 = i19;
                        zzamoVar = zzamoVar4;
                        i7 = i26;
                        i8 = i28;
                    }
                    i27++;
                    i19 = i6;
                    zzamoVar4 = zzamoVar;
                    i26 = i7;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                    i18 = i5;
                    arrayList = list;
                    zzamkVar2 = zzamkVar;
                    i23 = i4;
                    i21 = i8;
                }
                zzamq zzamqVar4 = zzamqVar3;
                zzamk zzamkVar3 = zzamkVar2;
                int i33 = i23;
                int i34 = i18;
                List list2 = arrayList;
                int i35 = i21;
                int i36 = i19;
                zzamo zzamoVar5 = zzamoVar4;
                int i37 = i26;
                float f = i20;
                float f2 = i36;
                if (zzamoVar5.zzb) {
                    int i38 = zzamoVar5.zze;
                    if (i38 == 3) {
                        i3 = zzamjVar.zzd[zzamoVar5.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i38 == 2 ? zzamjVar.zzc[zzamoVar5.zzh] : zzamjVar.zzb[zzamoVar5.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i24;
                    float f4 = i37;
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(f2, f, f4, f3, paint2);
                } else {
                    c = 2;
                    c2 = 3;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i36, i20, i35, i33));
                zzamkVar2 = zzamkVar3;
                float f5 = zzamkVar2.zza;
                zzcwVar.zzi(f2 / f5);
                zzcwVar.zzj(0);
                float f6 = zzamkVar2.zzb;
                zzcwVar.zzf(f / f6, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i35 / f5);
                zzcwVar.zzn(i33 / f6);
                list2.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                sparseArray4 = sparseArray6;
                arrayList = list2;
                i18 = i34 + 1;
                zzamqVar3 = zzamqVar4;
            }
            zzalxVar = new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
