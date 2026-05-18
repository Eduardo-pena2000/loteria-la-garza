package com.google.android.gms.internal.ads;

import S5.c1;
import S5.l2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcxj {
    private final zzeeg zza;
    private final zzfjk zzb;
    private final zzfnu zzc;
    private final zzcqj zzd;
    private final zzeny zze;
    private final zzdgu zzf;
    private zzfjc zzg;
    private final zzefr zzh;
    private final zzdaj zzi;
    private final Executor zzj;
    private final zzefc zzk;
    private final zzekl zzl;

    public zzcxj(zzeeg zzeegVar, zzfjk zzfjkVar, zzfnu zzfnuVar, zzcqj zzcqjVar, zzeny zzenyVar, zzdgu zzdguVar, zzfjc zzfjcVar, zzefr zzefrVar, zzdaj zzdajVar, Executor executor, zzefc zzefcVar, zzekl zzeklVar) {
        this.zza = zzeegVar;
        this.zzb = zzfjkVar;
        this.zzc = zzfnuVar;
        this.zzd = zzcqjVar;
        this.zze = zzenyVar;
        this.zzf = zzdguVar;
        this.zzg = zzfjcVar;
        this.zzh = zzefrVar;
        this.zzi = zzdajVar;
        this.zzj = executor;
        this.zzk = zzefcVar;
        this.zzl = zzeklVar;
    }

    public final x7.e zza(x7.e eVar) {
        if (this.zzg != null) {
            zzfnu zzfnuVar = this.zzc;
            zzfno zzfnoVar = zzfno.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfnuVar);
            return zzfnf.zza(zzgzo.zza(this.zzg), zzfnoVar, zzfnuVar).zzi();
        }
        R5.t.n().zzb();
        zzfnl zza = this.zzc.zza(zzfno.SERVER_TRANSACTION, eVar);
        zzefc zzefcVar = this.zzk;
        Objects.requireNonNull(zzefcVar);
        return zza.zzc(new zzcxi(zzefcVar)).zzi();
    }

    public final x7.e zzb() {
        zzfjk zzfjkVar = this.zzb;
        if (!zzfjkVar.zzv) {
            l2 l2Var = zzfjkVar.zzd;
            if (l2Var.x != null || l2Var.s != null) {
                zzfnu zzfnuVar = this.zzc;
                zzfno zzfnoVar = zzfno.PRELOADED_LOADER;
                Objects.requireNonNull(zzfnuVar);
                return zzfnf.zza(this.zza.zza(), zzfnoVar, zzfnuVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final x7.e zzc(x7.e eVar) {
        zzfnl zzc = this.zzc.zza(zzfno.RENDERER, eVar).zzb(new zzcxh(this)).zzc(this.zze);
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgB)).booleanValue()) {
            zzc = zzc.zzh(((Integer) S5.D.c().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final zzdgu zzd() {
        return this.zzf;
    }

    public final x7.e zze(zzflg zzflgVar) {
        zzfnb zzi = this.zzc.zza(zzfno.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzcxg(this, zzflgVar)).zzi();
        zzgzo.zzr(zzi, new zzcxe(this), this.zzj);
        return zzi;
    }

    public final x7.e zzf(zzbzu zzbzuVar) {
        zzfnb zzi = this.zzc.zza(zzfno.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbzuVar)).zzi();
        zzgzo.zzr(zzi, new zzcxf(this), this.zzj);
        return zzi;
    }

    public final c1 zzg(Throwable th) {
        return zzfkm.zzb(th, this.zzl);
    }

    public final void zzh(zzfjc zzfjcVar) {
        this.zzg = zzfjcVar;
    }

    public final /* synthetic */ zzfjc zzi(zzfjc zzfjcVar) {
        this.zzd.zza(zzfjcVar);
        return zzfjcVar;
    }

    public final /* synthetic */ x7.e zzj(zzflg zzflgVar, zzbzu zzbzuVar) {
        zzbzuVar.zzi = zzflgVar;
        return this.zzh.zza(zzbzuVar);
    }

    public final /* synthetic */ zzdgu zzk() {
        return this.zzf;
    }
}
