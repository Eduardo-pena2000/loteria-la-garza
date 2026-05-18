package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvy implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzdvy(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
    }

    public static zzdvy zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzdvy(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcmj) this.zza).zza();
        String zza2 = ((zzedm) this.zzb).zza();
        W5.a zza3 = ((zzcna) this.zzc).zza();
        zzbgj.zza.zza zzaVar = (zzbgj.zza.zza) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzbgd zzbgdVar = new zzbgd(new zzbgi(zza));
        zzbgj.zzar.zza zzs = zzbgj.zzar.zzs();
        zzs.zzc(zza3.b);
        zzs.zzg(zza3.c);
        zzs.zzk(true != zza3.d ? 2 : 0);
        zzbgdVar.zzb(new zzdvx(zzaVar, zza2, (zzbgj.zzar) zzs.zzbm(), str));
        return zzbgdVar;
    }
}
