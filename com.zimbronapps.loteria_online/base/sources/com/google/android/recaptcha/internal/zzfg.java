package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfg extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfj zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfg(zzfj zzfjVar, e eVar) {
        super(eVar);
        this.zzb = zzfjVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzfj.zzc(this.zzb, null, null, this);
    }
}
