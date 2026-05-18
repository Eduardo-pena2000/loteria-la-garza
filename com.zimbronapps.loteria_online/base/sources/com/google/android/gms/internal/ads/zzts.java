package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzts implements zzgru {
    private final /* synthetic */ int zza;

    public /* synthetic */ zzts(int i) {
        this.zza = i;
    }

    public final /* synthetic */ Object zza() {
        return new HandlerThread(zztv.zzv(this.zza));
    }
}
