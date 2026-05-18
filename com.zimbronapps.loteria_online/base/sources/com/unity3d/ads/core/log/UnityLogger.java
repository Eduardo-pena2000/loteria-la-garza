package com.unity3d.ads.core.log;

import android.util.Log;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private LogLevel logLevel = LogLevel.INFO;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean canLog(int i) {
        return Log.isLoggable("UnityAds", i) && i >= getLogLevel().toAndroidLogLevel();
    }

    public void debug(String message) {
        t.g(message, "message");
        if (canLog(3)) {
            Log.d("UnityAds", message);
        }
    }

    public void error(String message, Throwable th) {
        t.g(message, "message");
        if (canLog(6)) {
            Log.e("UnityAds", message, th);
        }
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public void info(String message) {
        t.g(message, "message");
        if (canLog(4)) {
            Log.i("UnityAds", message);
        }
    }

    public void setLogLevel(LogLevel logLevel) {
        t.g(logLevel, "<set-?>");
        this.logLevel = logLevel;
    }

    public void trace(String message, Throwable th) {
        t.g(message, "message");
        if (canLog(2)) {
            Log.v("UnityAds", message, th);
        }
    }
}
