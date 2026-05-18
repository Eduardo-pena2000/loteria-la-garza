package com.google.android.recaptcha.internal;

import Ca.s;
import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzt extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzv zzvVar, e eVar) {
        super(eVar);
        this.zzb = zzvVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == Ha.c.f() ? zzh : s.a(zzh);
    }
}
