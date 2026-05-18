package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeit implements Callable {
    private final /* synthetic */ zzeiu zza;

    public /* synthetic */ zzeit(zzeiu zzeiuVar) {
        this.zza = zzeiuVar;
    }

    public final /* synthetic */ Object call() {
        return this.zza.getWritableDatabase();
    }
}
