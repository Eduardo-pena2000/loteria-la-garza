package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfdn implements zzfax {
    private final zzcdu zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgzy zzd;
    private final int zze;
    private final int zzf;

    public zzfdn(zzcdu zzcduVar, boolean z, zzcdk zzcdkVar, zzgzy zzgzyVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.zza = zzcduVar;
        this.zzb = z;
        this.zzd = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
        this.zzf = i2;
    }

    public final x7.e zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhV)).booleanValue() && this.zzb) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (this.zzf == 2) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (!Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzhX)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgzo.zza(new zzfdo(null));
        }
        x7.e zza = zzgzo.zza(null);
        zzgzy zzgzyVar = this.zzd;
        return zzgzo.zzg(zzgzo.zzi(zzgzo.zzk(zza, zzfdm.zza, zzgzyVar), ((Long) zzbjt.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfdl(this), zzgzyVar);
    }

    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzfdo zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfdo(null);
    }
}
