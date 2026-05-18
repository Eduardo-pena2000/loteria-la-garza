package okhttp3.internal.concurrent;

import Ca.I;
import java.util.logging.Level;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskRunner$runnable$1 implements Runnable {
    public final /* synthetic */ TaskRunner a;

    public TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.a = taskRunner;
    }

    public void run() {
        Task d;
        long j;
        while (true) {
            TaskRunner taskRunner = this.a;
            synchronized (taskRunner) {
                d = taskRunner.d();
            }
            if (d == null) {
                return;
            }
            TaskQueue d2 = d.d();
            t.d(d2);
            TaskRunner taskRunner2 = this.a;
            boolean isLoggable = TaskRunner.h.a().isLoggable(Level.FINE);
            if (isLoggable) {
                j = d2.h().g().nanoTime();
                TaskLoggerKt.a(d, d2, "starting");
            } else {
                j = -1;
            }
            try {
                try {
                    TaskRunner.b(taskRunner2, d);
                    I i = I.a;
                    if (isLoggable) {
                        TaskLoggerKt.a(d, d2, t.o("finished run in ", TaskLoggerKt.b(d2.h().g().nanoTime() - j)));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    TaskLoggerKt.a(d, d2, t.o("failed a run in ", TaskLoggerKt.b(d2.h().g().nanoTime() - j)));
                }
                throw th;
            }
        }
    }
}
