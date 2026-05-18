package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfb extends l implements p {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, e eVar) {
        super(2, eVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        try {
            if (zzff.zzb(this.zza).zzb(this.zzb)) {
                return zzff.zza(this.zza).zza(this.zzb, this.zzc);
            }
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e2.getMessage());
        }
    }
}
