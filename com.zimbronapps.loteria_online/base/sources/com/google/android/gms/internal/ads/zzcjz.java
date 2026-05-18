package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcjz implements zzgyv {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ zzazh zzb;
    private final /* synthetic */ W5.a zzc;
    private final /* synthetic */ R5.a zzd;
    private final /* synthetic */ zzejf zze;
    private final /* synthetic */ zzfjo zzf;
    private final /* synthetic */ zzdxz zzg;
    private final /* synthetic */ String zzh;

    public /* synthetic */ zzcjz(Context context, zzazh zzazhVar, W5.a aVar, R5.a aVar2, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar, String str) {
        this.zza = context;
        this.zzb = zzazhVar;
        this.zzc = aVar;
        this.zzd = aVar2;
        this.zze = zzejfVar;
        this.zzf = zzfjoVar;
        this.zzg = zzdxzVar;
        this.zzh = str;
    }

    public final /* synthetic */ x7.e zza() {
        R5.t.h();
        Context context = this.zza;
        zzclv zzb = zzclv.zzb();
        R5.a aVar = this.zzd;
        zzbgd zza = zzbgd.zza();
        zzejf zzejfVar = this.zze;
        zzfjo zzfjoVar = this.zzf;
        zzdxz zzdxzVar = this.zzg;
        zzcjl zza2 = zzckb.zza(context, zzb, "", false, false, this.zzb, null, this.zzc, null, null, aVar, zza, null, null, zzejfVar, zzfjoVar, zzdxzVar);
        zzcem zza3 = zzcem.zza(zza2);
        zza2.zzP().zzG(new zzcjy(zza3));
        zza2.loadUrl(this.zzh);
        return zza3;
    }
}
