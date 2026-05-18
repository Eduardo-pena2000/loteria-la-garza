package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccx implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzccx(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzccx zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzccx(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzccw((Context) this.zza.zzb(), ((zzcck) this.zzb).zzb());
    }
}
