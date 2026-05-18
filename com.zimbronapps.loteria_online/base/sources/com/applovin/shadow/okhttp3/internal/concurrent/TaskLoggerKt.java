package com.applovin.shadow.okhttp3.internal.concurrent;

import Qa.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        U u = U.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        t.f(format, "format(format, *args)");
        return format;
    }

    private static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        U u = U.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.f(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final Object logElapsed(Task task, TaskQueue taskQueue, a aVar) {
        long j;
        t.g(task, "task");
        t.g(taskQueue, "queue");
        t.g(aVar, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            access$log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            Object invoke = aVar.invoke();
            r.b(1);
            if (isLoggable) {
                access$log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            r.a(1);
            return invoke;
        } catch (Throwable th) {
            r.b(1);
            if (isLoggable) {
                access$log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            r.a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a aVar) {
        t.g(task, "task");
        t.g(taskQueue, "queue");
        t.g(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            access$log(task, taskQueue, (String) aVar.invoke());
        }
    }
}
