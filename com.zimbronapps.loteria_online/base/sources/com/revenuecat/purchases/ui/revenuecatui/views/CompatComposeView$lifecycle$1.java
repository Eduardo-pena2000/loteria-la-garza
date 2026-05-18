package com.revenuecat.purchases.ui.revenuecatui.views;

import androidx.lifecycle.k;
import androidx.lifecycle.q;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CompatComposeView$lifecycle$1 extends k {
    public void addObserver(q observer) {
        t.g(observer, "observer");
        Logger.INSTANCE.e("CompatComposeView: Attempted to add a LifecycleObserver when no LifecycleOwner is set.");
    }

    public k.b getCurrentState() {
        return k.b.b;
    }

    public void removeObserver(q observer) {
        t.g(observer, "observer");
        Logger.INSTANCE.e("CompatComposeView: Attempted to remove LifecycleObserver when no LifecycleOwner is set.");
    }
}
