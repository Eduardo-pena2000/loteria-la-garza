package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsa {
    private final Executor zza;
    private final zzctc zzb;
    private final zzdjg zzc;
    private final zzcrv zzd;
    private final zzczz zze;

    public zzdsa(Executor executor, zzctc zzctcVar, zzdjg zzdjgVar, zzcrv zzcrvVar, zzczz zzczzVar) {
        this.zza = executor;
        this.zzc = zzdjgVar;
        this.zzb = zzctcVar;
        this.zzd = zzcrvVar;
        this.zze = zzczzVar;
    }

    public final void zza(zzcjl zzcjlVar) {
        if (zzcjlVar == null) {
            return;
        }
        zzdjg zzdjgVar = this.zzc;
        zzdjgVar.zza(zzcjlVar.zzE());
        zzdrz zzdrzVar = new zzdrz(zzcjlVar);
        Executor executor = this.zza;
        zzdjgVar.zzq(zzdrzVar, executor);
        zzdjgVar.zzq(new zzdrw(zzcjlVar), executor);
        zzctc zzctcVar = this.zzb;
        zzdjgVar.zzq(zzctcVar, executor);
        zzctcVar.zza(zzcjlVar);
        zzclj zzP = zzcjlVar.zzP();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlD)).booleanValue() && zzP != null) {
            zzcrv zzcrvVar = this.zzd;
            zzP.zzc(zzcrvVar);
            zzP.zze(zzcrvVar, null, null);
        }
        zzcjlVar.zzab("/trackActiveViewUnit", new zzdrx(this));
        zzcjlVar.zzab("/untrackActiveViewUnit", new zzdry(this));
        zzcjlVar.zzP().zzJ(this.zze);
    }

    public final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzd();
    }

    public final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzb.zzb();
    }
}
