package org.apache.tika.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ConcurrentUtils {
    public static Future execute(ParseContext parseContext, Runnable runnable) {
        ExecutorService executorService = (ExecutorService) parseContext.get(ExecutorService.class);
        if (executorService != null) {
            return executorService.submit(runnable);
        }
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        new Thread(futureTask, "Tika Thread").start();
        return futureTask;
    }
}
