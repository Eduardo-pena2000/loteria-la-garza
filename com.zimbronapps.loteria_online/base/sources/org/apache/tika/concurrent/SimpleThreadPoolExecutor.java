package org.apache.tika.concurrent;

import Fb.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class SimpleThreadPoolExecutor extends ThreadPoolExecutor implements ConfigurableThreadPoolExecutor {
    public SimpleThreadPoolExecutor() {
        super(1, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        return lambda$new$0(runnable);
    }

    private static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "Tika Executor Thread");
    }
}
