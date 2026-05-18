package com.google.android.recaptcha.internal;

import Ca.I;
import Da.r;
import Da.v;
import Ga.e;
import Qa.l;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzn implements zzy {
    private final zzek zza;

    public zzn(zzek zzekVar) {
        this.zza = zzekVar;
    }

    private static final zzth zzg(String str) {
        zztg zzf = zzth.zzf();
        zzf.zzw(str);
        return (zzth) zzf.zzk();
    }

    public final int zza() {
        return 11;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, e eVar) {
        zzen zzb = zzz.zzb(this, str);
        zztf zzf = zzti.zzf();
        zzth zzg = zzg(Build.MANUFACTURER);
        zzth zzg2 = zzg(Build.MODEL);
        zzth zzg3 = zzg(Build.DEVICE);
        zzth zzg4 = zzg(Build.HARDWARE);
        zzth zzg5 = zzg(Build.FINGERPRINT);
        zzth zzg6 = zzg(Build.PRODUCT);
        zzth zzg7 = zzg(Build.BOARD);
        zzth zzg8 = zzg(Build.BRAND);
        zzth zzg9 = zzg(r.B0(Build.SUPPORTED_ABIS, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null));
        long j = Build.TIME;
        zztg zzf2 = zzth.zzf();
        zzf2.zzv(j);
        zzf.zze(v.q(new zzth[]{zzg, zzg2, zzg3, zzg4, zzg5, zzg6, zzg7, zzg8, zzg9, (zzth) zzf2.zzk(), zzg(Build.ID), zzg(Build.BOOTLOADER), zzg(Build.DISPLAY), zzg(Build.TYPE), zzg(Build.TAGS)}));
        zzb.zza();
        return zzz.zza(this, (zzti) zzf.zzk());
    }

    public final Object zzd(zzse zzseVar, e eVar) {
        zzz.zzc(this).zza();
        return I.a;
    }

    public final void zze(zzsr zzsrVar) {
    }

    public final boolean zzf() {
        return true;
    }
}
