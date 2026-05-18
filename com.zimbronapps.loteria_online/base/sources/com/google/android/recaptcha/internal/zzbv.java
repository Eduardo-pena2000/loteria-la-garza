package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbv implements Executor {
    public static final zzbv zza = new zzbv();

    private zzbv() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
