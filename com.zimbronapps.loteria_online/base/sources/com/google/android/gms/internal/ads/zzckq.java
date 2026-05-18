package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzckq implements Runnable {
    private final /* synthetic */ zzckr zza;
    private final /* synthetic */ Map zzb;

    public /* synthetic */ zzckq(zzckr zzckrVar, Map map) {
        this.zza = zzckrVar;
        this.zzb = map;
    }

    public final /* synthetic */ void run() {
        this.zza.zzt(this.zzb);
    }
}
