package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzagv implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzagv(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
    }

    public static zzagv zzb(zzer zzerVar) {
        int zzC = zzerVar.zzC();
        zzerVar.zzk(12);
        int zzC2 = zzerVar.zzC();
        int zzC3 = zzerVar.zzC();
        int zzC4 = zzerVar.zzC();
        zzerVar.zzk(4);
        int zzC5 = zzerVar.zzC();
        int zzC6 = zzerVar.zzC();
        zzerVar.zzk(4);
        return new zzagv(zzC, zzC2, zzC3, zzC4, zzC5, zzC6, zzerVar.zzC());
    }

    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i = this.zza;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        zzee.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    public final long zzd() {
        return zzfj.zzt(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
