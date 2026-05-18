package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaj extends l implements p {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, e eVar) {
        super(2, eVar);
        this.zzb = zzanVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzaj(this.zzb, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            zzan.zzh(this.zzb, zzao.zza);
            zzan zzanVar = this.zzb;
            this.zza = 1;
            if (zzanVar.zze(this) == f) {
                return f;
            }
        }
        return I.a;
    }
}
