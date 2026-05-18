package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Da.D;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import cb.P;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfq extends l implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, e eVar) {
        super(2, eVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    public final e create(Object obj, e eVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, eVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        t.b(obj);
        if (i == 0) {
            O o = (O) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !P.g(o)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e) {
                    zzufVar.zzk();
                    Ia.b.d(zzufVar.zzg());
                    D.n0(zzufVar.zzj(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new zzfp(this.zzd), 31, (Object) null);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    if (zzft.zzd(zzftVar, e, zzgdVar2, this) == f) {
                        return f;
                    }
                }
            }
            return I.a;
        }
        return I.a;
    }
}
