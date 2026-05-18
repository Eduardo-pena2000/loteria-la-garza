package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzedd implements Callable {
    private final /* synthetic */ zzazh zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzedd(zzazh zzazhVar, Context context) {
        this.zza = zzazhVar;
        this.zzb = context;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzb().zzk(this.zzb);
    }
}
