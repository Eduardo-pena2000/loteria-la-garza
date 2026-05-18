package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzglx implements zzikg {
    private final zzikp zza;

    private zzglx(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzglx zza(zzikp zzikpVar) {
        return new zzglx(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcam.jar.tmp");
    }
}
