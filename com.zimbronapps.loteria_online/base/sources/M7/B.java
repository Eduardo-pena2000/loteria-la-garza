package M7;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public b(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        bVar.b(runnable);
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.c);
        StrictMode.ThreadPolicy threadPolicy = this.d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.b, Long.valueOf(this.a.getAndIncrement())}));
        return newThread;
    }
}
