package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import android.app.Application;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcp extends l implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(Application application, String str, e eVar) {
        super(2, eVar);
        this.zzb = application;
        this.zzc = str;
    }

    public final e create(Object obj, e eVar) {
        return new zzcp(this.zzb, this.zzc, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzcq.zzd(application, str, this);
            if (obj == f) {
                return f;
            }
        }
        return obj;
    }
}
