package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzftq extends BroadcastReceiver {
    final /* synthetic */ zzftr zza;

    public zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzftr zzftrVar = this.zza;
            zzftrVar.zzd(true, zzftrVar.zzf());
            zzftrVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzftr zzftrVar2 = this.zza;
            zzftrVar2.zzd(false, zzftrVar2.zzf());
            zzftrVar2.zze(false);
        }
    }
}
