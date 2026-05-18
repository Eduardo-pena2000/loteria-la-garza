package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {
    private static final Set c = new HashSet();
    private final g7 a;
    private final com.applovin.impl.sdk.k b;

    private g0(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.a = g7.a(j, z, kVar, new E1(this, z, runnable));
        this.b = kVar;
        c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public static /* synthetic */ void a(g0 g0Var, boolean z, Runnable runnable) {
        g0Var.a(z, runnable);
    }

    public long b() {
        return this.a.c();
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.a.d();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.a.e();
        }
    }

    public static g0 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public static g0 a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j, z, kVar, runnable);
    }

    private /* synthetic */ void a(boolean z, Runnable runnable) {
        if (!z) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        c.remove(this);
    }
}
