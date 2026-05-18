package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzj extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j, zzsc zzscVar, e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = j;
        this.zzd = zzscVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object zze;
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i != 0) {
            zze = ((s) obj).j();
        } else {
            zze zzeVar = this.zzb;
            long j = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            zze = zzeVar.zze(j, zzscVar, this);
            if (zze == f) {
                return f;
            }
        }
        return s.a(zze);
    }
}
