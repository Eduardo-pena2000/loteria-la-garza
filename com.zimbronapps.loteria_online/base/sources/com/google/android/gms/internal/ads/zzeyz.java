package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzeyz(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzeyz zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeyz(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyx(zzfmk.zzc(), ((zzdaw) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzcmd) this.zzc).zza());
    }
}
