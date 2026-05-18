package com.revenuecat.purchases.ui.revenuecatui.views;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CompatComposeView$lifecycleObserver$1 implements DefaultLifecycleObserver {
    final /* synthetic */ CompatComposeView this$0;

    public CompatComposeView$lifecycleObserver$1(CompatComposeView compatComposeView) {
        this.this$0 = compatComposeView;
    }

    public /* bridge */ /* synthetic */ void onCreate(r rVar) {
        super.onCreate(rVar);
    }

    public void onDestroy(r owner) {
        t.g(owner, "owner");
        CompatComposeView.access$onDestroy(this.this$0);
    }

    public /* bridge */ /* synthetic */ void onPause(r rVar) {
        super.onPause(rVar);
    }

    public /* bridge */ /* synthetic */ void onResume(r rVar) {
        super.onResume(rVar);
    }

    public /* bridge */ /* synthetic */ void onStart(r rVar) {
        super.onStart(rVar);
    }

    public /* bridge */ /* synthetic */ void onStop(r rVar) {
        super.onStop(rVar);
    }
}
