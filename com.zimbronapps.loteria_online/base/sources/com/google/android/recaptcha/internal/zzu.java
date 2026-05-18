package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzu extends l implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, e eVar) {
        super(2, eVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzu(this.zzd, this.zze, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        Iterator it;
        Object f = Ha.c.f();
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            t.b(obj);
        } else {
            t.b(obj);
            if (!this.zzd.zzS()) {
                s.a aVar = s.b;
                return s.a(s.b(t.a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                s.a aVar2 = s.b;
                return s.a(s.b(t.a(new zzbd(zzbb.zzb, zzba.zzab, null))));
            }
            zzv.zzp(this.zze, zzj.zzi());
            it = zzv.zzn(this.zze).iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == f) {
                return f;
            }
        }
        s.a aVar3 = s.b;
        return s.a(s.b(I.a));
    }
}
