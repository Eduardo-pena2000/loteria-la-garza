package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f implements AppLovinBroadcastManager.Receiver {
    private g7 a;
    private final Object b = new Object();
    private final AtomicBoolean c = new AtomicBoolean();
    private boolean d;
    private final k e;
    private final WeakReference f;
    private long g;

    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f = new WeakReference(aVar);
        this.e = kVar;
    }

    public static /* synthetic */ void a(f fVar) {
        fVar.i();
    }

    private void e() {
        if (((Boolean) this.e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.e.a(r3.D7)).booleanValue()) {
            synchronized (this.b) {
                try {
                    if (this.d) {
                        this.e.O();
                        if (o.a()) {
                            this.e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.e.m0().isApplicationPaused()) {
                        this.e.O();
                        if (o.a()) {
                            this.e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        g7 g7Var = this.a;
                        if (g7Var != null) {
                            g7Var.e();
                        }
                    }
                } finally {
                }
            }
        }
    }

    private /* synthetic */ void i() {
        l();
        a aVar = (a) this.f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.b) {
            try {
                g7 g7Var = this.a;
                if (g7Var != null) {
                    g7Var.d();
                } else {
                    this.e.O();
                    if (o.a()) {
                        this.e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.b) {
            try {
                this.a = null;
                if (!((Boolean) this.e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.b) {
            try {
                g7 g7Var = this.a;
                if (g7Var != null) {
                    g7Var.e();
                } else {
                    this.c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long c;
        synchronized (this.b) {
            try {
                g7 g7Var = this.a;
                c = g7Var != null ? g7Var.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public void c() {
        if (((Boolean) this.e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z;
        a aVar;
        if (((Boolean) this.e.a(r3.C7)).booleanValue()) {
            synchronized (this.b) {
                try {
                    if (this.d) {
                        this.e.O();
                        if (o.a()) {
                            this.e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.e.H().d()) {
                        this.e.O();
                        if (o.a()) {
                            this.e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.a != null) {
                        long b = this.g - b();
                        long longValue = ((Long) this.e.a(r3.B7)).longValue();
                        if (longValue < 0 || b <= longValue) {
                            this.a.e();
                            z = false;
                        } else {
                            a();
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (!z || (aVar = (a) this.f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.a != null;
        }
        return z;
    }

    public void j() {
        synchronized (this.b) {
            k();
            this.d = true;
        }
    }

    public void m() {
        synchronized (this.b) {
            n();
            this.d = false;
        }
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            c();
            return;
        }
        if ("com.applovin.application_resumed".equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            try {
                a();
                this.g = j;
                this.a = g7.a(j, this.e, new G(this));
                if (!((Boolean) this.e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.e.a(r3.D7)).booleanValue() && (this.e.H().d() || this.e.m0().isApplicationPaused())) {
                    this.a.d();
                }
                if (this.c.compareAndSet(true, false) && ((Boolean) this.e.a(r3.F7)).booleanValue()) {
                    this.e.O();
                    if (o.a()) {
                        this.e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.b) {
            try {
                g7 g7Var = this.a;
                if (g7Var != null) {
                    g7Var.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
