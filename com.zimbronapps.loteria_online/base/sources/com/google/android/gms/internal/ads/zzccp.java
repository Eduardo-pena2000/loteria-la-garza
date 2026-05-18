package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzccp implements Callable {
    private final /* synthetic */ zzccq zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzccp(zzccq zzccqVar, Context context) {
        this.zza = zzccqVar;
        this.zzb = context;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzp(this.zzb);
    }
}
