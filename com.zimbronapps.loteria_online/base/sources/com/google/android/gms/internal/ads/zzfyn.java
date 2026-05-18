package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzfyn extends Handler {
    public zzfyn() {
        Looper.getMainLooper();
    }

    public final void dispatchMessage(Message message) {
        zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfyn(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
