package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzda extends l implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j, e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    public final e create(Object obj, e eVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object zzb;
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i != 0) {
            zzb = ((s) obj).j();
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzb = zzdc.zzb(zzdcVar, recaptchaAction, j, this);
            if (zzb == f) {
                return f;
            }
        }
        t.b(zzb);
        return zzb;
    }
}
