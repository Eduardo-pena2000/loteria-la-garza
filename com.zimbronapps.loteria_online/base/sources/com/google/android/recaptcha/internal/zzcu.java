package com.google.android.recaptcha.internal;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcu extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, e eVar) {
        super(eVar);
        this.zzb = zzcvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzcv.zzi(this.zzb, null, 0, null, this);
    }
}
