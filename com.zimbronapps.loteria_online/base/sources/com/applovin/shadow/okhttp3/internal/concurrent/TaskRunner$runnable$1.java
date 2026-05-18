package com.applovin.shadow.okhttp3.internal.concurrent;

import Ca.I;
import java.util.logging.Level;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class TaskRunner$runnable$1 implements Runnable {
    final /* synthetic */ TaskRunner this$0;

    public TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.this$0 = taskRunner;
    }

    public void run() {
        Task awaitTaskToRun;
        long j;
        while (true) {
            TaskRunner taskRunner = this.this$0;
            synchronized (taskRunner) {
                awaitTaskToRun = taskRunner.awaitTaskToRun();
            }
            if (awaitTaskToRun == null) {
                return;
            }
            TaskQueue queue$okhttp = awaitTaskToRun.getQueue$okhttp();
            t.d(queue$okhttp);
            TaskRunner taskRunner2 = this.this$0;
            boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
            if (isLoggable) {
                j = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "starting");
            } else {
                j = -1;
            }
            try {
                try {
                    TaskRunner.access$runTask(taskRunner2, awaitTaskToRun);
                    I i = I.a;
                    if (isLoggable) {
                        TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "failed a run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j));
                }
                throw th;
            }
        }
    }
}
