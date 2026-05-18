package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzem implements Runnable {
    private final /* synthetic */ zzep zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzem(zzep zzepVar, Context context) {
        this.zza = zzepVar;
        this.zzb = context;
    }

    public final /* synthetic */ void run() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.zzb.registerReceiver(new zzeo(this.zza, null), intentFilter);
    }
}
