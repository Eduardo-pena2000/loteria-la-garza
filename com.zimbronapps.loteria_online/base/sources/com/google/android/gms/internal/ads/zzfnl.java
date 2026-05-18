package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfnl {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final String zzc;
    private final x7.e zzd;
    private final List zze;
    private final x7.e zzf;

    public /* synthetic */ zzfnl(zzfnm zzfnmVar, Object obj, String str, x7.e eVar, List list, x7.e eVar2, byte[] bArr) {
        this(zzfnmVar, obj, null, eVar, list, eVar2);
    }

    public final zzfnl zza(String str) {
        return new zzfnl(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfnl zzb(zzfmu zzfmuVar) {
        return zzc(new zzfnk(zzfmuVar));
    }

    public final zzfnl zzc(zzgyw zzgywVar) {
        return zzd(zzgywVar, this.zza.zze());
    }

    public final zzfnl zzd(zzgyw zzgywVar, Executor executor) {
        return new zzfnl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzj(this.zzf, zzgywVar, executor));
    }

    public final zzfnl zze(x7.e eVar) {
        return zzd(new zzfnh(eVar), zzcei.zzg);
    }

    public final zzfnl zzf(Class cls, zzfmu zzfmuVar) {
        return zzg(cls, new zzfni(zzfmuVar));
    }

    public final zzfnl zzg(Class cls, zzgyw zzgywVar) {
        zzfnm zzfnmVar = this.zza;
        zzgzy zze = zzfnmVar.zze();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzh(this.zzf, cls, zzgywVar, zze));
    }

    public final zzfnl zzh(long j, TimeUnit timeUnit) {
        zzfnm zzfnmVar = this.zza;
        ScheduledExecutorService zzf = zzfnmVar.zzf();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzi(this.zzf, j, timeUnit, zzf));
    }

    public final zzfnb zzi() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzc(obj);
        }
        zzfnb zzfnbVar = new zzfnb(obj, str, this.zzf);
        this.zza.zzg().zza(zzfnbVar);
        x7.e eVar = this.zzd;
        zzfnj zzfnjVar = new zzfnj(this, zzfnbVar);
        zzgzy zzgzyVar = zzcei.zzg;
        eVar.addListener(zzfnjVar, zzgzyVar);
        zzgzo.zzr(zzfnbVar, new zzfng(this, zzfnbVar), zzgzyVar);
        return zzfnbVar;
    }

    public final zzfnl zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfnl(zzfnm zzfnmVar, Object obj, String str, x7.e eVar, List list, x7.e eVar2) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = eVar;
        this.zze = list;
        this.zzf = eVar2;
    }
}
