package com.google.android.recaptcha.internal;

import Ca.s;
import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzip extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzip(zzja zzjaVar, e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf(null, this);
        return zzf == Ha.c.f() ? zzf : s.a(zzf);
    }
}
