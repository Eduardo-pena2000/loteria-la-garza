package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbdc extends BroadcastReceiver {
    final /* synthetic */ zzbdg zza;

    public zzbdc(zzbdg zzbdgVar) {
        Objects.requireNonNull(zzbdgVar);
        this.zza = zzbdgVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }
}
