package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import java.util.Timer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzeq extends l implements p {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzeq(this.zza, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzb = zzes.zzb(zzesVar);
                if (zzb != null && zzb.zzb() == 0) {
                    Timer zzc = zzes.zzc();
                    if (zzc != null) {
                        zzc.cancel();
                    }
                    zzes.zzf(null);
                }
                zzes.zze(zzesVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return I.a;
    }
}
