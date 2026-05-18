package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdti implements Callable {
    private final R5.a zza;
    private final Context zzb;
    private final zzdxz zzc;
    private final zzeiu zzd;
    private final Executor zze;
    private final zzazh zzf;
    private final W5.a zzg;
    private final zzfqk zzh;
    private final zzejf zzi;
    private final zzfjo zzj;

    public zzdti(Context context, Executor executor, zzazh zzazhVar, W5.a aVar, R5.a aVar2, zzckb zzckbVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzejf zzejfVar, zzfjo zzfjoVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzazhVar;
        this.zzg = aVar;
        this.zza = aVar2;
        this.zzd = zzeiuVar;
        this.zzh = zzfqkVar;
        this.zzc = zzdxzVar;
        this.zzi = zzejfVar;
        this.zzj = zzfjoVar;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdtk zzdtkVar = new zzdtk(this);
        zzdtkVar.zza();
        return zzdtkVar;
    }

    public final /* synthetic */ R5.a zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdxz zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzeiu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzazh zzf() {
        return this.zzf;
    }

    public final /* synthetic */ W5.a zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfqk zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzejf zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfjo zzj() {
        return this.zzj;
    }
}
