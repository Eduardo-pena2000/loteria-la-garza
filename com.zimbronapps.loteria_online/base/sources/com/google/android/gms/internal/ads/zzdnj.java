package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdnj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdnj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdnj(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjg((Context) this.zza.zzb(), new HashSet(), ((zzcww) this.zzb).zza());
    }
}
