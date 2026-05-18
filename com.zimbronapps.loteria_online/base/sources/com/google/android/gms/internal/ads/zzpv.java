package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzpv extends BroadcastReceiver {
    final /* synthetic */ zzpx zza;

    public /* synthetic */ zzpv(zzpx zzpxVar, byte[] bArr) {
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zzb(context, intent, zzpxVar.zzj(), zzpxVar.zzh()));
    }
}
