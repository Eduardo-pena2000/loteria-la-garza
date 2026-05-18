package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcz extends l implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction, String str, e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    public final e create(Object obj, e eVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zzek) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j = this.zzc;
            zzcn zza = zzdc.zza(zzdcVar);
            this.zza = 1;
            obj = zza.zza(str, recaptchaAction, j, this);
            if (obj == f) {
                return f;
            }
        }
        return s.a(s.b((String) obj));
    }
}
