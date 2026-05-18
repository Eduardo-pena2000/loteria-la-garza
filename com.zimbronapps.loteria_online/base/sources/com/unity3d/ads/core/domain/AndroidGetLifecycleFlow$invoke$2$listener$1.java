package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import cb.i;
import eb.v;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetLifecycleFlow$invoke$2$listener$1 implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ v $$this$channelFlow;

    public AndroidGetLifecycleFlow$invoke$2$listener$1(v vVar) {
        this.$$this$channelFlow = vVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(vVar, activity, bundle, null), 3, null);
    }

    public void onActivityDestroyed(Activity activity) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(vVar, activity, null), 3, null);
    }

    public void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(vVar, activity, null), 3, null);
    }

    public void onActivityResumed(Activity activity) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(vVar, activity, null), 3, null);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
        t.g(bundle, "bundle");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(vVar, activity, bundle, null), 3, null);
    }

    public void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(vVar, activity, null), 3, null);
    }

    public void onActivityStopped(Activity activity) {
        t.g(activity, "activity");
        v vVar = this.$$this$channelFlow;
        i.d(vVar, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(vVar, activity, null), 3, null);
    }
}
