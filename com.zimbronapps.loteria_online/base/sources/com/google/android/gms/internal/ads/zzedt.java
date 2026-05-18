package com.google.android.gms.internal.ads;

import V5.F0;
import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedt {
    private final ScheduledExecutorService zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzees zzd;
    private final zzika zze;

    public zzedt(ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzees zzeesVar, zzika zzikaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzeesVar;
        this.zze = zzikaVar;
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        x7.e submit;
        String str = zzbzuVar.zzd;
        R5.t.g();
        if (F0.h(str)) {
            submit = zzgzo.zzc(new zzeff(1));
        } else {
            submit = (((Boolean) S5.D.c().zzd(zzbhe.zziv)).booleanValue() || ((Boolean) zzbjp.zza.zze()).booleanValue()) ? this.zzc.submit(new zzedq(this, zzbzuVar)) : this.zzd.zza(zzbzuVar);
        }
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(submit), ((Integer) S5.D.c().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzeds(this, zzbzuVar, Binder.getCallingUid()), this.zzb);
    }

    public final /* synthetic */ x7.e zzb(zzbzu zzbzuVar, int i, Throwable th) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zze.zzb()).zzk(zzbzuVar, i), new zzedr(zzbzuVar), this.zzb);
    }

    public final /* synthetic */ zzefg zzc(zzbzu zzbzuVar) {
        return (zzefg) this.zzd.zza(zzbzuVar).get(((Integer) S5.D.c().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }
}
