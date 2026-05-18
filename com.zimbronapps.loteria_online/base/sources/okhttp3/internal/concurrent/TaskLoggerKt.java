package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void a(Task task, TaskQueue taskQueue, String str) {
        c(task, taskQueue, str);
    }

    public static final String b(long j) {
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

    public static final void c(Task task, TaskQueue taskQueue, String str) {
        Logger a = TaskRunner.h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.f());
        sb.append(' ');
        U u = U.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.f(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.b());
        a.fine(sb.toString());
    }
}
