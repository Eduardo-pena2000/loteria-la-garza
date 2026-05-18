package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdac implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdac(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdac zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzdac(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdab((Context) this.zza.zzb(), ((zzcww) this.zzb).zza(), new zzbxx());
    }
}
