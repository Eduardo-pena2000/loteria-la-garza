package com.revenuecat.purchases.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.LogLevel;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Config {
    public static final String frameworkVersion = "9.26.1";
    public static final Config INSTANCE = new Config();
    private static LogLevel logLevel = LogUtilsKt.debugLogsEnabled(LogLevel.Companion, false);

    private Config() {
    }

    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(LogLevel logLevel2) {
        t.g(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }
}
