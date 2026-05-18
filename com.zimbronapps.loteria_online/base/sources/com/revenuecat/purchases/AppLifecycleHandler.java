package com.revenuecat.purchases;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AppLifecycleHandler implements DefaultLifecycleObserver {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate) {
        t.g(lifecycleDelegate, "lifecycleDelegate");
        this.lifecycleDelegate = lifecycleDelegate;
    }

    public void onCreate(r rVar) {
        t.g(rVar, "owner");
    }

    public void onDestroy(r rVar) {
        t.g(rVar, "owner");
    }

    public void onPause(r rVar) {
        t.g(rVar, "owner");
    }

    public void onResume(r rVar) {
        t.g(rVar, "owner");
    }

    public void onStart(r rVar) {
        t.g(rVar, "owner");
        this.lifecycleDelegate.onAppForegrounded();
    }

    public void onStop(r rVar) {
        t.g(rVar, "owner");
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
