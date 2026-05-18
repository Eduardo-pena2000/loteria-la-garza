package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zztt implements zzgru {
    private final /* synthetic */ int zza;

    public /* synthetic */ zztt(int i) {
        this.zza = i;
    }

    public final /* synthetic */ Object zza() {
        return new HandlerThread(zztv.zzu(this.zza));
    }
}
