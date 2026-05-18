package jb;

import Wa.n;
import hb.E;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j {
    public static final String a = E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = E.h("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int c = E.g("kotlinx.coroutines.scheduler.core.pool.size", n.e(E.a(), 2), 1, 0, 8, null);
    public static final int d = E.g("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
    public static final long e = TimeUnit.SECONDS.toNanos(E.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static g f = e.a;

    public static final /* synthetic */ String a(boolean z) {
        return c(z);
    }

    public static final h b(Runnable runnable, long j, boolean z) {
        return new i(runnable, j, z);
    }

    public static final String c(boolean z) {
        return z ? "Blocking" : "Non-blocking";
    }
}
