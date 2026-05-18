package com.applovin.shadow.okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        t.g(logRecord, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        t.f(loggerName, "record.loggerName");
        int access$getAndroidLevel = AndroidLogKt.access$getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        t.f(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel, message, logRecord.getThrown());
    }
}
