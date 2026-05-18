package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjt implements Callable {
    private final /* synthetic */ zzgkc zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzgjt(zzgkc zzgkcVar, Context context) {
        this.zza = zzgkcVar;
        this.zzb = context;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzj(this.zzb);
    }
}
