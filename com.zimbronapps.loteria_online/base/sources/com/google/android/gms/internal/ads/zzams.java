package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzams {
    private final zzer zza = new zzer();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzer zzerVar = this.zza;
        if (zzerVar.zze() == 0 || zzerVar.zzg() != zzerVar.zze() || !this.zzc) {
            return null;
        }
        zzerVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int zzs = zzerVar.zzs();
            if (zzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[zzs];
            } else {
                int zzs2 = zzerVar.zzs();
                if (zzs2 != 0) {
                    int i4 = zzs2 & 63;
                    if ((zzs2 & 64) != 0) {
                        i4 = (i4 << 8) | zzerVar.zzs();
                    }
                    i = i4 + i3;
                    Arrays.fill(iArr, i3, i, (zzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzerVar.zzs()]);
                }
            }
            i3 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzer zzerVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzerVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int zzs = zzerVar.zzs();
            int zzs2 = zzerVar.zzs();
            int zzs3 = zzerVar.zzs();
            int zzs4 = zzerVar.zzs();
            double d = zzs2;
            int zzs5 = zzerVar.zzs() << 24;
            String str = zzfj.zza;
            double d2 = zzs3 - 128;
            double d3 = zzs4 - 128;
            iArr[zzs] = (Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)) << 16) | zzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255));
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzer zzerVar, int i) {
        int zzx;
        if (i < 4) {
            return;
        }
        zzerVar.zzk(3);
        int i2 = i - 4;
        if ((zzerVar.zzs() & 128) != 0) {
            if (i2 < 7 || (zzx = zzerVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzerVar.zzt();
            this.zzi = zzerVar.zzt();
            this.zza.zza(zzx - 4);
            i2 = i - 11;
        }
        zzer zzerVar2 = this.zza;
        int zzg = zzerVar2.zzg();
        int zze = zzerVar2.zze();
        if (zzg >= zze || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, zze - zzg);
        zzerVar.zzm(zzerVar2.zzi(), zzg, min);
        zzerVar2.zzh(zzg + min);
    }

    public final /* synthetic */ void zze(zzer zzerVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzerVar.zzt();
        this.zze = zzerVar.zzt();
        zzerVar.zzk(11);
        this.zzf = zzerVar.zzt();
        this.zzg = zzerVar.zzt();
    }
}
