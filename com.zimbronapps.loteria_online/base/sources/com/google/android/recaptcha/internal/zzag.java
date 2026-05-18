package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzag extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzan zzanVar, e eVar) {
        super(eVar);
        this.zzb = zzanVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzan.zza(this.zzb, this);
    }
}
