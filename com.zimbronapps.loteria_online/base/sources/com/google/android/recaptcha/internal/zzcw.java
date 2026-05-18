package com.google.android.recaptcha.internal;

import Ca.s;
import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcw extends Ia.d {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object obj2 = this.zzb.execute-0E7RQCE(null, 0L, this);
        return obj2 == Ha.c.f() ? obj2 : s.a(obj2);
    }
}
