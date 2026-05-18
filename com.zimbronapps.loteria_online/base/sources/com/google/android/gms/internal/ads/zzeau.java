package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeau implements zzikg {
    private final zzikp zza;

    private zzeau(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzeau zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeau(zzikpVar, zzikpVar2);
    }

    public static zzdje zzc(zzeat zzeatVar, Executor executor) {
        return new zzdje(zzeatVar, executor);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzeat) this.zza.zzb(), zzfmk.zzc());
    }
}
