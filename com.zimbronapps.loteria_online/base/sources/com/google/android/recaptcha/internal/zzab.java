package com.google.android.recaptcha.internal;

import Ca.I;
import Da.u;
import Ga.e;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzab implements zzy {
    private final zzek zza;

    public zzab(zzek zzekVar) {
        this.zza = zzekVar;
    }

    public final int zza() {
        return 10;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, e eVar) {
        zzen zzb = zzz.zzb(this, str);
        int i = Build.VERSION.SDK_INT;
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(String.valueOf(i));
        zzf.zze(u.e(zzf2.zzi()));
        return zzz.zza(this, (zzti) zzf.zzi());
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
