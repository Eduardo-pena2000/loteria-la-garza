package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import cb.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdy extends l implements Qa.l {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, e eVar) {
        super(1, eVar);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    public final e create(e eVar) {
        return new zzdy(this.zzb, this.zzc, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((e) obj).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (c1.c(j, zzdxVar, this) == f) {
                return f;
            }
        }
        return I.a;
    }
}
