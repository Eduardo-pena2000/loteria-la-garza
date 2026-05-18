package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdmr implements zzikg {
    private final zzikp zza;

    private zzdmr(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdmr zza(zzikp zzikpVar) {
        return new zzdmr(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdmo) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.emptySet();
        zziko.zzb(singleton);
        return singleton;
    }
}
