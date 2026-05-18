package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgqa implements IBinder.DeathRecipient {
    private final /* synthetic */ zzgqf zza;

    public /* synthetic */ zzgqa(zzgqf zzgqfVar) {
        this.zza = zzgqfVar;
    }

    public final /* synthetic */ void binderDied() {
        this.zza.zzd();
    }
}
