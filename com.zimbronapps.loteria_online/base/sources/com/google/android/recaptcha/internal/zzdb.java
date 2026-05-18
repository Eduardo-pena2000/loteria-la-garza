package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdb extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzdc.zzc(this.zzb, null, null, this);
    }
}
