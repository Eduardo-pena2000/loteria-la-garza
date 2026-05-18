package com.google.android.recaptcha.internal;

import Ca.I;
import Da.u;
import Ga.e;
import android.content.ContentResolver;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzm implements zzy {
    private final zzek zza;
    private final ContentResolver zzb;

    public zzm(zzek zzekVar, ContentResolver contentResolver) {
        this.zza = zzekVar;
        this.zzb = contentResolver;
    }

    public final int zza() {
        return 17;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, e eVar) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzap.zza(this.zzb);
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
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
