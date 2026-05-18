package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeo extends BroadcastReceiver {
    final /* synthetic */ zzep zza;

    public /* synthetic */ zzeo(zzep zzepVar, byte[] bArr) {
        Objects.requireNonNull(zzepVar);
        this.zza = zzepVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf().execute(new zzen(this, context));
    }
}
