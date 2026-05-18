package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdj extends Ia.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, e eVar) {
        super(eVar);
        this.zzc = zzdtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return zzdt.zzk(this.zzc, null, 0L, this);
    }
}
