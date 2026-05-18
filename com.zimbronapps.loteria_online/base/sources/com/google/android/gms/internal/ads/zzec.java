package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzec implements Handler.Callback {
    private final /* synthetic */ zzed zza;

    public /* synthetic */ zzec(zzed zzedVar) {
        this.zza = zzedVar;
    }

    public final /* synthetic */ boolean handleMessage(Message message) {
        this.zza.zzh(message);
        return true;
    }
}
