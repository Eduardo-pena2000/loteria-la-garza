package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzds extends l implements p {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzds(this.zzb, this.zzc, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = zzdt.zzj(zzdtVar, this);
            if (obj == f) {
                return f;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
