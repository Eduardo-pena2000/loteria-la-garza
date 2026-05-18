package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.t.g(activity, "activity");
        kotlin.jvm.internal.t.g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.t.g(activity, "activity");
    }
}
