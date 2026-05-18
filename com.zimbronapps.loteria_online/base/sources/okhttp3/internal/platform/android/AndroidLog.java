package okhttp3.internal.platform.android;

import Da.S;
import Za.E;
import Za.G;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.t;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLog {
    public static final AndroidLog a = new AndroidLog();
    public static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public static final Map c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 == null ? null : r2.getName();
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
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = S.z(linkedHashMap);
    }

    private AndroidLog() {
    }

    public final void a(String loggerName, int i, String message, Throwable th) {
        int min;
        t.g(loggerName, "loggerName");
        t.g(message, "message");
        String d = d(loggerName);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int e0 = E.e0(message, '\n', i2, false, 4, null);
                if (e0 == -1) {
                    e0 = length;
                }
                while (true) {
                    min = Math.min(e0, i2 + 4000);
                    String substring = message.substring(i2, min);
                    t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
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

    public final void b() {
        for (Map.Entry entry : c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.a);
        }
    }

    public final String d(String str) {
        String str2 = (String) c.get(str);
        return str2 == null ? G.q1(str, 23) : str2;
    }
}
