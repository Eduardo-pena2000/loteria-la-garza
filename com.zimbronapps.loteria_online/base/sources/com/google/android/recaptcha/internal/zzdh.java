package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import android.os.Build;
import cb.O;
import v6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdh extends l implements p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzdh(this.zzb, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            int zza = new zzbs(h.f()).zza(zzdt.zza(this.zzb));
            zzdt zzdtVar = this.zzb;
            String zzp = zzdt.zzp(zzdtVar);
            String packageName = zzdt.zza(zzdtVar).getPackageName();
            String zzd = zzdt.zze(this.zzb).zzd();
            zzbf zzc = zzdt.zzc(this.zzb);
            int i2 = Build.VERSION.SDK_INT;
            String zza2 = zzc.zza();
            zztn zzf = zzto.zzf();
            zzf.zzt(zzp);
            zzf.zzq(packageName);
            zzf.zzu(zza);
            zzf.zzr("18.6.1");
            zzf.zzs(zzd);
            zzf.zzf(String.valueOf(i2));
            zzf.zze(zza2);
            zzto zztoVar = (zzto) zzf.zzi();
            zzdt zzdtVar2 = this.zzb;
            zzff zzg = zzdt.zzg(zzdtVar2);
            String zzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzg.zzc(zzb, zztoVar, this);
            if (obj == f) {
                return f;
            }
        }
        return obj;
    }
}
