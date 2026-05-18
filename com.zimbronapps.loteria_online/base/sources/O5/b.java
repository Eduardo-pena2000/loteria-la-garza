package o5;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b implements ThreadFactory {
    public final ThreadFactory a;
    public final AtomicInteger b;

    public b(com.android.billingclient.api.a aVar) {
        Objects.requireNonNull(aVar);
        this.a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.b;
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
