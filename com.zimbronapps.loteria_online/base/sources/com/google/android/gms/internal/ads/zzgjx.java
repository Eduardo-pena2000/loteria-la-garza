package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgjx implements Runnable {
    private final /* synthetic */ zzgkc zza;
    private final /* synthetic */ Map zzb;
    private final /* synthetic */ Context zzc;

    public /* synthetic */ zzgjx(zzgkc zzgkcVar, Map map, Context context) {
        this.zza = zzgkcVar;
        this.zzb = map;
        this.zzc = context;
    }

    public final /* synthetic */ void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
