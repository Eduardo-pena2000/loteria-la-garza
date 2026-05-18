package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.util.Log;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Logger {
    public static final int $stable = 0;
    public static final Logger INSTANCE = new Logger();
    private static final String TAG = "[Purchases]";

    private Logger() {
    }

    public final void d(String message) {
        t.g(message, "message");
        Log.d("[Purchases]", message);
    }

    public final void e(String message) {
        t.g(message, "message");
        Log.e("[Purchases]", message);
    }

    public final void i(String message) {
        t.g(message, "message");
        Log.i("[Purchases]", message);
    }

    public final void w(String message) {
        t.g(message, "message");
        Log.w("[Purchases]", message);
    }

    public final void e(String message, Throwable throwable) {
        t.g(message, "message");
        t.g(throwable, "throwable");
        Log.e("[Purchases]", message, throwable);
    }
}
