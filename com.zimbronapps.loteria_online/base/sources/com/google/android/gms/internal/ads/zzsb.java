package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzsb implements Executor {
    private final /* synthetic */ Handler zza;

    public /* synthetic */ zzsb(Handler handler) {
        this.zza = handler;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
