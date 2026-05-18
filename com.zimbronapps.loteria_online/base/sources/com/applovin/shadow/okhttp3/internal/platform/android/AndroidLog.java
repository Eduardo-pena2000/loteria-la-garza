package com.applovin.shadow.okhttp3.internal.platform.android;

import Da.S;
import Za.E;
import Za.G;
import android.util.Log;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.internal.SuppressSignatureCheck;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.t;

@SuppressSignatureCheck
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet configuredLoggers = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        t.f(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        t.f(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        t.f(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("com.applovin.shadow.okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = S.z(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = (String) knownLoggers.get(str);
        return str2 == null ? G.q1(str, 23) : str2;
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int min;
        t.g(str, "loggerName");
        t.g(str2, "message");
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int e0 = E.e0(str2, '\n', i2, false, 4, (Object) null);
                if (e0 == -1) {
                    e0 = length;
                }
                while (true) {
                    min = Math.min(e0, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, loggerTag, substring);
                    if (min >= e0) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry entry : knownLoggers.entrySet()) {
            enableLogging((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
