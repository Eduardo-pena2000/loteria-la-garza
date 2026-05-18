package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdv extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, e eVar) {
        super(eVar);
        this.zzb = zzecVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzec.zze(this.zzb, null, this);
    }
}
