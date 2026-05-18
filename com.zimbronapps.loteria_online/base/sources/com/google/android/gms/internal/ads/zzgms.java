package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgms implements zzikg {
    private final zzikp zza;

    private zzgms(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgms zza(zzikp zzikpVar) {
        return new zzgms(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pcam.jar");
    }
}
