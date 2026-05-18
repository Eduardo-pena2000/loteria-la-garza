package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgix implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgix(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgix zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgix(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbch zzb = zzfwe.zzb((Context) this.zza.zzb(), (zzfvh) this.zzb.zzb());
        zziko.zzb(zzb);
        return zzb;
    }
}
