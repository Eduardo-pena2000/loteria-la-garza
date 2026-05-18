package hb;

import java.util.Collection;
import java.util.ServiceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e {
    public static final Collection a = Ya.r.G(Ya.o.e(ServiceLoader.load(cb.L.class, cb.L.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
