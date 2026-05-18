package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzglu implements zzikg {
    private final zzikp zza;

    private zzglu(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzglu zza(zzikp zzikpVar) {
        return new zzglu(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcopt");
    }
}
