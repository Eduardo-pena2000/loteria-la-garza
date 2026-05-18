package com.revenuecat.purchases.ui.revenuecatui.views;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CompatComposeView$ViewLifecycleOwner$1$1 implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Activity $act;
    final /* synthetic */ CompatComposeView.ViewLifecycleOwner this$0;

    public CompatComposeView$ViewLifecycleOwner$1$1(Activity activity, CompatComposeView.ViewLifecycleOwner viewLifecycleOwner) {
        this.$act = activity;
        this.this$0 = viewLifecycleOwner;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
    }

    public void onActivityDestroyed(Activity destroyedActivity) {
        t.g(destroyedActivity, "destroyedActivity");
        if (destroyedActivity == this.$act) {
            this.this$0.destroy();
        }
    }

    public void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        t.g(activity, "activity");
        t.g(outState, "outState");
    }

    public void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        t.g(activity, "activity");
    }
}
