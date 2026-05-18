package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbaq extends BroadcastReceiver {
    final /* synthetic */ zzbar zza;

    public zzbaq(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
