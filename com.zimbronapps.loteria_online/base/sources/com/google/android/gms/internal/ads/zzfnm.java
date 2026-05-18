package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfnm {
    private static final x7.e zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    public static /* synthetic */ x7.e zzd() {
        return zza;
    }

    public final zzfnl zza(Object obj, x7.e eVar) {
        return new zzfnl(this, obj, null, eVar, Collections.singletonList(eVar), eVar, null);
    }

    public final zzfnd zzb(Object obj, x7.e... eVarArr) {
        return new zzfnd(this, obj, Arrays.asList(eVarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }
}
