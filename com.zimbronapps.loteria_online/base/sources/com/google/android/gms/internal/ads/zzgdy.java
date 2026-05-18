package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgdy implements Callable {
    private final /* synthetic */ zzgec zza;
    private final /* synthetic */ int zzb;

    public /* synthetic */ zzgdy(zzgec zzgecVar, int i) {
        this.zza = zzgecVar;
        this.zzb = i;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzc(this.zzb);
    }
}
