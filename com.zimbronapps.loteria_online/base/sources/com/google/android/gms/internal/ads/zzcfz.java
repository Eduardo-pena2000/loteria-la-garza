package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfz implements Runnable {
    public zzcfz(zzcgb zzcgbVar) {
        Objects.requireNonNull(zzcgbVar);
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
