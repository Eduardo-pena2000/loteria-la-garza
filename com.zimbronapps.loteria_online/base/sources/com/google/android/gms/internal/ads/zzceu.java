package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzceu {
    private final zzcen zza;
    private final AtomicInteger zzb;

    public zzceu() {
        zzcen zzcenVar = new zzcen();
        this.zza = zzcenVar;
        this.zzb = new AtomicInteger(0);
        zzgzo.zzr(zzcenVar, new zzces(this), zzcei.zzg);
    }

    @Deprecated
    public final void zze(zzcer zzcerVar, zzcep zzcepVar) {
        zzgzo.zzr(this.zza, new zzcet(this, zzcerVar, zzcepVar), zzcei.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) S5.D.c().zzd(zzbhe.zziK)).booleanValue()) {
            R5.t.l().zzh(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
