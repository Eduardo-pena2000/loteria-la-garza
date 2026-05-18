package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";
    final k a;
    private final String b = UUID.randomUUID().toString();
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicLong f = new AtomicLong();
    private final AtomicLong g = new AtomicLong();
    private final AtomicLong h = new AtomicLong();
    private Date i;
    private Date j;

    public class a extends com.applovin.impl.b {
        public a() {
        }

        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.a(SessionTracker.this);
        }
    }

    public class b implements ComponentCallbacks2 {
        public b() {
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            SessionTracker.b(SessionTracker.this).set(i);
            if (i == 20) {
                SessionTracker.c(SessionTracker.this);
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.a(SessionTracker.this);
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.c(SessionTracker.this);
            }
        }
    }

    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");

        private final String a;

        e(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public SessionTracker(k kVar) {
        this.a = kVar;
        Application o = k.o();
        o.registerActivityLifecycleCallbacks(new a());
        o.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        o.registerReceiver(new c(), intentFilter);
    }

    public static /* synthetic */ void a(SessionTracker sessionTracker) {
        sessionTracker.b();
    }

    public static /* synthetic */ AtomicInteger b(SessionTracker sessionTracker) {
        return sessionTracker.e;
    }

    public static /* synthetic */ void c(SessionTracker sessionTracker) {
        sessionTracker.a();
    }

    private void d() {
        this.a.O();
        if (o.a()) {
            this.a.O().a("SessionTracker", "Application Resumed");
        }
        this.g.set(System.currentTimeMillis());
        this.h.addAndGet(this.g.get() - this.f.get());
        boolean booleanValue = ((Boolean) this.a.a(x4.u3)).booleanValue();
        long longValue = ((Long) this.a.a(x4.v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent("com.applovin.application_resumed"), null);
        if (this.c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.j == null || System.currentTimeMillis() - this.j.getTime() >= millis) {
            this.a.F().trackEvent("resumed");
            if (booleanValue) {
                this.j = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.g.get();
    }

    public e getCurrentApplicationState() {
        return this.d.get() ? e.PAUSED : this.f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long n;
        long currentTimeMillis = System.currentTimeMillis();
        int i = d.a[getCurrentApplicationState().ordinal()];
        if (i == 1) {
            n = k.n();
        } else if (i == 2) {
            n = this.f.get();
        } else {
            if (i != 3) {
                return -1L;
            }
            n = this.g.get();
        }
        return currentTimeMillis - n;
    }

    public int getLastTrimMemoryLevel() {
        return this.e.get();
    }

    public String getSessionId() {
        return this.b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == e.PAUSED ? this.h.get() + getCurrentApplicationStateDurationMillis() : this.h.get();
    }

    public boolean isApplicationPaused() {
        return this.d.get();
    }

    public void pauseForClick() {
        this.c.set(true);
    }

    public void resumeForClick() {
        this.c.set(false);
    }

    private void a() {
        if (this.d.compareAndSet(false, true)) {
            c();
        }
    }

    private void b() {
        if (this.d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.a.O();
        if (o.a()) {
            this.a.O().a("SessionTracker", "Application Paused");
        }
        this.f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent("com.applovin.application_paused"), null);
        if (this.c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.a.a(x4.u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(x4.w3)).longValue());
        if (this.i == null || System.currentTimeMillis() - this.i.getTime() >= millis) {
            this.a.F().trackEvent("paused");
            if (booleanValue) {
                this.i = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.i = new Date();
    }
}
