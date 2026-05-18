package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler e = new AppLovinExceptionHandler();
    private final Set a = new HashSet(2);
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    private String a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return e;
    }

    public void addSdk(k kVar) {
        if (this.a.contains(kVar)) {
            return;
        }
        this.a.add(kVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long j = 500;
        for (k kVar : this.a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap hashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) kVar.a(x4.I6);
            if (num.intValue() > 0) {
                hashMap.put("details", a(th, num.intValue()));
            }
            kVar.D().d(d2.P0, (Map) hashMap);
            kVar.F().trackEventSynchronously("paused");
            j = ((Long) kVar.a(x4.n3)).longValue();
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
