package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcjx implements zzgru {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ zzclv zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzazh zzf;
    private final /* synthetic */ zzbil zzg;
    private final /* synthetic */ W5.a zzh;
    private final /* synthetic */ R5.n zzi;
    private final /* synthetic */ R5.a zzj;
    private final /* synthetic */ zzbgd zzk;
    private final /* synthetic */ zzfir zzl;
    private final /* synthetic */ zzfiu zzm;
    private final /* synthetic */ zzfjo zzn;
    private final /* synthetic */ zzdxz zzo;
    private final /* synthetic */ zzejf zzp;

    public /* synthetic */ zzcjx(Context context, zzclv zzclvVar, String str, boolean z, boolean z2, zzazh zzazhVar, zzbil zzbilVar, W5.a aVar, zzbht zzbhtVar, R5.n nVar, R5.a aVar2, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar, zzdxz zzdxzVar, zzejf zzejfVar) {
        this.zza = context;
        this.zzb = zzclvVar;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzazhVar;
        this.zzg = zzbilVar;
        this.zzh = aVar;
        this.zzi = nVar;
        this.zzj = aVar2;
        this.zzk = zzbgdVar;
        this.zzl = zzfirVar;
        this.zzm = zzfiuVar;
        this.zzn = zzfjoVar;
        this.zzo = zzdxzVar;
        this.zzp = zzejfVar;
    }

    public final /* synthetic */ Object zza() {
        zzclv zzclvVar = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        boolean z2 = this.zze;
        zzejf zzejfVar = this.zzp;
        zzdxz zzdxzVar = this.zzo;
        R5.n nVar = this.zzi;
        R5.a aVar = this.zzj;
        zzbgd zzbgdVar = this.zzk;
        zzfir zzfirVar = this.zzl;
        zzfiu zzfiuVar = this.zzm;
        zzfjo zzfjoVar = this.zzn;
        zzazh zzazhVar = this.zzf;
        zzbil zzbilVar = this.zzg;
        W5.a aVar2 = this.zzh;
        Context context = this.zza;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcko.zza;
            zzckh zzckhVar = new zzckh(new zzcko(new zzcln(context), zzclvVar, str, z, z2, zzazhVar, zzbilVar, aVar2, null, nVar, aVar, zzbgdVar, zzfirVar, zzfiuVar, zzfjoVar), zzdxzVar);
            zzckhVar.setWebViewClient(R5.t.j().b(zzckhVar, zzbgdVar, z2, zzejfVar));
            zzckhVar.setWebChromeClient(new zzcjk(zzckhVar));
            return zzckhVar;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
