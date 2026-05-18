package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h8 {
    private static final Set f = new HashSet();
    private final boolean a;
    private final com.applovin.impl.sdk.k b;
    private Runnable c;
    private final Object d = new Object();
    private final Timer e;

    public class a extends TimerTask {

        public class a implements AppLovinBroadcastManager.Receiver {
            public a() {
            }

            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.c(h8.this);
            }
        }

        public a() {
        }

        public void run() {
            if (!h8.a(h8.this).m0().isApplicationPaused() || h8.b(h8.this)) {
                h8.c(h8.this);
            } else {
                AppLovinBroadcastManager.registerReceiver(new a(), new IntentFilter("com.applovin.application_resumed"));
            }
        }
    }

    private h8(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.e = timer;
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.a = z;
        this.b = kVar;
        this.c = runnable;
        f.add(this);
        timer.schedule(b(), j);
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(h8 h8Var) {
        return h8Var.b;
    }

    public static /* synthetic */ boolean b(h8 h8Var) {
        return h8Var.a;
    }

    public static /* synthetic */ void c(h8 h8Var) {
        h8Var.c();
    }

    public static h8 a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j, z, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    private void c() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.d) {
            this.e.cancel();
            this.c = null;
            f.remove(this);
        }
    }
}
