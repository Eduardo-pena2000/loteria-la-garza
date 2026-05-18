package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgmp implements zzikg {
    private final zzikp zza;

    private zzgmp(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgmp zza(zzikp zzikpVar) {
        return new zzgmp(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
