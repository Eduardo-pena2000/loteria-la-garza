package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzg extends l implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j, e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j;
    }

    public final e create(Object obj, e eVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object zzc;
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i != 0) {
            zzc = ((s) obj).j();
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzc = zzeVar.zzc(str, j, this);
            if (zzc == f) {
                return f;
            }
        }
        return s.a(zzc);
    }
}
