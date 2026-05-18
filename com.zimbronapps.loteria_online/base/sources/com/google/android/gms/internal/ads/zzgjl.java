package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjl implements Callable {
    private final /* synthetic */ zzgjq zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzgjl(zzgjq zzgjqVar, Context context) {
        this.zza = zzgjqVar;
        this.zzb = context;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzk(this.zzb);
    }
}
