package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgnp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgnp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgnp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgnp(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgno((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
