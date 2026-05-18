package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final AtomicReference b;
    private final Handler c;
    private final Handler d;
    private final AtomicLong e = new AtomicLong(0);
    private long f;
    private long g;
    private long h;

    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    public class c implements Runnable {
        private c() {
        }

        public void run() {
            String str;
            if (h.a(h.this).get() != b.MONITORING) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - h.b(h.this).get();
            if (currentTimeMillis >= 0 && currentTimeMillis <= h.e(h.this)) {
                h.h(h.this).postDelayed(this, h.g(h.this));
                return;
            }
            h.a(h.this).set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            Map hashMap = new HashMap(3);
            hashMap.put("top_main_method", str);
            hashMap.put("source", h.f(h.this).z0() ? "non_first_session" : "first_session");
            hashMap.put("details", "seconds_since_app_launch=" + seconds);
            h.f(h.this).D().d(d2.F0, hashMap);
        }

        public /* synthetic */ c(h hVar, a aVar) {
            this();
        }
    }

    public class d implements Runnable {
        private d() {
        }

        public void run() {
            if (h.a(h.this).get() != b.MONITORING) {
                return;
            }
            h.b(h.this).set(System.currentTimeMillis());
            h.d(h.this).postDelayed(this, h.c(h.this));
        }

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }
    }

    public h(k kVar) {
        this.a = kVar;
        this.b = new AtomicReference(!n7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ AtomicReference a(h hVar) {
        return hVar.b;
    }

    public static /* synthetic */ AtomicLong b(h hVar) {
        return hVar.e;
    }

    public static /* synthetic */ long c(h hVar) {
        return hVar.g;
    }

    public static /* synthetic */ Handler d(h hVar) {
        return hVar.c;
    }

    public static /* synthetic */ long e(h hVar) {
        return hVar.f;
    }

    public static /* synthetic */ k f(h hVar) {
        return hVar.a;
    }

    public static /* synthetic */ long g(h hVar) {
        return hVar.h;
    }

    public static /* synthetic */ Handler h(h hVar) {
        return hVar.d;
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            c();
        }
    }

    private void b() {
        if (z.Y.a(this.b, b.MONITORING, b.IDLE)) {
            this.c.removeCallbacksAndMessages((Object) null);
            this.d.removeCallbacksAndMessages((Object) null);
        }
    }

    private void c() {
        if (!(((Boolean) this.a.a(x4.f6)).booleanValue() && this.a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && z.Y.a(this.b, b.IDLE, b.MONITORING)) {
            this.c.post(new d(this, null));
            this.d.postDelayed(new c(this, null), this.h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f = ((Long) this.a.a(x4.c6)).longValue();
        this.g = ((Long) this.a.a(x4.d6)).longValue();
        this.h = ((Long) this.a.a(x4.e6)).longValue();
        if (((Boolean) this.a.a(x4.f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
        }
    }

    public void a() {
        if (this.b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.a.a(x4.b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
