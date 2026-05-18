package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import android.app.Application;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzco extends l implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzco(Application application, String str, long j, e eVar) {
        super(2, eVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    public final e create(Object obj, e eVar) {
        return new zzco(this.zzb, this.zzc, this.zzd, eVar);
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
            long j = this.zzd;
            this.zza = 1;
            obj = zzcq.zzb(application, str, j, this);
            if (obj == f) {
                return f;
            }
        }
        return obj;
    }
}
