package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdw extends Ia.d {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, e eVar) {
        super(eVar);
        this.zzc = zzecVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return zzec.zzf(this.zzc, 0L, this);
    }
}
