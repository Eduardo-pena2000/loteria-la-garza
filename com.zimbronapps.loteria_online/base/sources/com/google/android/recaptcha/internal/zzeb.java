package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import cb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzeb extends l implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ x zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, x xVar, long j, e eVar) {
        super(2, eVar);
        this.zzb = zzecVar;
        this.zzc = xVar;
        this.zzd = j;
    }

    public final e create(Object obj, e eVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        try {
            if (this.zza != 0) {
                t.b(obj);
            } else {
                t.b(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == f) {
                    return f;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzbd e) {
            zzec.zzj(this.zzb, zzcm.zza());
            this.zzc.b(e);
        }
        return I.a;
    }
}
