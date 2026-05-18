package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzg extends Handler {
    private final Looper zza;

    public zzg() {
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
