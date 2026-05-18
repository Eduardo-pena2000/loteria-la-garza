package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcwu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final x7.e zzc;
    private volatile boolean zzd = true;

    public zzcwu(Executor executor, ScheduledExecutorService scheduledExecutorService, x7.e eVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = eVar;
    }

    public final void zza(zzgzl zzgzlVar) {
        zzgzo.zzr(this.zzc, new zzcwo(this, zzgzlVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ x7.e zzc(zzgzl zzgzlVar, x7.e eVar, zzcwf zzcwfVar) {
        if (zzcwfVar != null) {
            zzgzlVar.zzb(zzcwfVar);
        }
        return zzgzo.zzi(eVar, ((Long) zzbjs.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, zzgzl zzgzlVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new zzcwt(zzgzlVar));
            return;
        }
        x7.e zza = zzgzo.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x7.e eVar = (x7.e) it.next();
            zzcwq zzcwqVar = new zzcwq(zzgzlVar);
            Executor executor = this.zza;
            zza = zzgzo.zzj(zzgzo.zzh(zza, Throwable.class, zzcwqVar, executor), new zzcwr(this, zzgzlVar, eVar), executor);
        }
        zzgzo.zzr(zza, new zzcwp(this, zzgzlVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcei.zzf.execute(new zzcws(this));
    }
}
