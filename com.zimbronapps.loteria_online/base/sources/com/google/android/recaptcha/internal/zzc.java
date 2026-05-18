package com.google.android.recaptcha.internal;

import Ca.s;
import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzc extends Ia.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, e eVar) {
        super(eVar);
        this.zzc = zzeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == Ha.c.f() ? zze : s.a(zze);
    }
}
