package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Da.D;
import Ga.e;
import Ia.l;
import Qa.p;
import android.content.ContentValues;
import cb.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzer extends l implements p {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    public final e create(Object obj, e eVar) {
        return new zzer(this.zza, this.zzb, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        t.b(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                if (zzes.zzb(zzesVar) != null) {
                    byte[] zzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzei zzb = zzes.zzb(zzesVar);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzb.getWritableDatabase().insert("ce", (String) null, contentValues);
                    int zzb2 = zzes.zzb(zzesVar).zzb() - 500;
                    if (zzb2 > 0) {
                        zzes.zzb(zzesVar).zza(D.D0(zzes.zzb(zzesVar).zzd(), zzb2));
                    }
                    if (zzes.zzb(zzesVar).zzb() >= 20) {
                        zzes.zze(zzesVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return I.a;
    }
}
