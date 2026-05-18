package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzim extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzja zzjaVar, e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzja.zzt(this.zzb, null, this);
    }
}
