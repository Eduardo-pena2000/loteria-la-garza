package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcyo implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcyo(zzcyn zzcynVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcyo zza(zzcyn zzcynVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyo(zzcynVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new R5.b((Context) this.zza.zzb(), (zzcce) this.zzb.zzb(), null);
    }
}
