package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.l;
import Ca.m;
import Ca.x;
import Da.Q;
import Da.u;
import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final l zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i = zzav.zza;
        this.zzb = m.b(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    public final int zza() {
        return 25;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, e eVar) {
        zzen zzb = zzz.zzb(this, str);
        String zza = zzg().zza();
        zzb.zza();
        zztf zzf = zzti.zzf();
        zztg zzf2 = zzth.zzf();
        zzf2.zzw(zza);
        zzf.zze(u.e(zzf2.zzi()));
        return zzz.zza(this, (zzti) zzf.zzi());
    }

    public final Object zzd(zzse zzseVar, e eVar) {
        zzen zzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return I.a;
        }
        zzg().zzb(Q.f(x.a("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzc.zza();
        return I.a;
    }

    public final void zze(zzsr zzsrVar) {
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
