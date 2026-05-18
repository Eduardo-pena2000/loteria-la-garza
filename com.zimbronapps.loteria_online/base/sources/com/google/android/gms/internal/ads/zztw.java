package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zztw extends Handler {
    final /* synthetic */ zzty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztw(zzty zztyVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zztyVar);
        this.zza = zztyVar;
    }

    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
