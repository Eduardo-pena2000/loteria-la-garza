package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzew implements Handler.Callback {
    private final /* synthetic */ zzfa zza;

    public /* synthetic */ zzew(zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    public final /* synthetic */ boolean handleMessage(Message message) {
        return this.zza.zzb(message);
    }
}
