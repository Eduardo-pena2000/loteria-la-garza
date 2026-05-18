package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzanl {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzf(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    private final void zzg(zzeq zzeqVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int width = rect.width();
        int i4 = i3 * width;
        int height = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (zzeqVar.zzc() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | zzeqVar.zzj(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.zza[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            zzeqVar.zzm();
        }
    }

    public final void zza(String str) {
        int i;
        String trim = str.trim();
        String str2 = zzfj.zza;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] split = str3.substring(9).split(",", -1);
                this.zzd = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = this.zzd;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] split2 = str3.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(split2[0]);
                        this.zzf = Integer.parseInt(split2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e) {
                        zzee.zzd("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public final void zzb(zzer zzerVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzerVar.zzk(zzerVar.zzt() - 2);
        int zzt = zzerVar.zzt();
        while (zzerVar.zzg() < zzt && zzerVar.zzd() > 0) {
            switch (zzerVar.zzs()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (zzerVar.zzd() >= 2) {
                        int zzs = zzerVar.zzs();
                        int zzs2 = zzerVar.zzs();
                        int[] iArr2 = this.zza;
                        iArr2[3] = zze(iArr, zzs >> 4);
                        iArr2[2] = zze(iArr, zzs & 15);
                        iArr2[1] = zze(iArr, zzs2 >> 4);
                        iArr2[0] = zze(iArr, zzs2 & 15);
                        this.zzc = true;
                        break;
                    } else {
                        return;
                    }
                case 4:
                    if (zzerVar.zzd() >= 2 && this.zzc) {
                        int zzs3 = zzerVar.zzs();
                        int zzs4 = zzerVar.zzs();
                        int[] iArr3 = this.zza;
                        iArr3[3] = zzf(iArr3[3], zzs3 >> 4);
                        iArr3[2] = zzf(iArr3[2], zzs3 & 15);
                        iArr3[1] = zzf(iArr3[1], zzs4 >> 4);
                        iArr3[0] = zzf(iArr3[0], zzs4 & 15);
                        break;
                    } else {
                        return;
                    }
                    break;
                case 5:
                    if (zzerVar.zzd() >= 6) {
                        int zzs5 = zzerVar.zzs();
                        int zzs6 = zzerVar.zzs();
                        int i = zzs6 >> 4;
                        int zzs7 = ((zzs6 & 15) << 8) | zzerVar.zzs();
                        int zzs8 = zzerVar.zzs();
                        int zzs9 = zzerVar.zzs();
                        this.zzg = new Rect((zzs5 << 4) | i, (zzs8 << 4) | (zzs9 >> 4), zzs7 + 1, (((zzs9 & 15) << 8) | zzerVar.zzs()) + 1);
                        break;
                    } else {
                        return;
                    }
                case 6:
                    if (zzerVar.zzd() >= 4) {
                        this.zzh = zzerVar.zzt();
                        this.zzi = zzerVar.zzt();
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public final zzcx zzc(zzer zzerVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzeq zzeqVar = new zzeq();
        zzerVar.zzh(this.zzh);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, true, rect2, iArr);
        zzerVar.zzh(this.zzi);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(rect2.left / this.zze);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzf, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zze);
        zzcwVar.zzn(rect2.height() / this.zzf);
        return zzcwVar.zzr();
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
