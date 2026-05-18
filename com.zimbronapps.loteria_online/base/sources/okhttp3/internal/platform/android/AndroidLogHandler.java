package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord record) {
        t.g(record, "record");
        AndroidLog androidLog = AndroidLog.a;
        String loggerName = record.getLoggerName();
        t.f(loggerName, "record.loggerName");
        int a2 = AndroidLogKt.a(record);
        String message = record.getMessage();
        t.f(message, "record.message");
        androidLog.a(loggerName, a2, message, record.getThrown());
    }
}
