package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzglm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzglm(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzglm zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzglm(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        return ((zzgdc) this.zzb.zzb()).zza(file, zzgdu.zzg(), new zzglf((zzgoe) this.zzc.zzb()));
    }
}
