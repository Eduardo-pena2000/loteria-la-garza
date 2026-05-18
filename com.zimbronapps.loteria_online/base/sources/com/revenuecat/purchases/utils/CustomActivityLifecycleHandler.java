package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface CustomActivityLifecycleHandler extends Application.ActivityLifecycleCallbacks {

    public static final class DefaultImpls {
        @Deprecated
        public static void onActivityCreated(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity, Bundle bundle) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityCreated$jd(customActivityLifecycleHandler, activity, bundle);
        }

        @Deprecated
        public static void onActivityDestroyed(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityDestroyed$jd(customActivityLifecycleHandler, activity);
        }

        @Deprecated
        public static void onActivityPaused(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityPaused$jd(customActivityLifecycleHandler, activity);
        }

        @Deprecated
        public static void onActivityResumed(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityResumed$jd(customActivityLifecycleHandler, activity);
        }

        @Deprecated
        public static void onActivitySaveInstanceState(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity, Bundle outState) {
            t.g(activity, "activity");
            t.g(outState, "outState");
            CustomActivityLifecycleHandler.access$onActivitySaveInstanceState$jd(customActivityLifecycleHandler, activity, outState);
        }

        @Deprecated
        public static void onActivityStarted(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityStarted$jd(customActivityLifecycleHandler, activity);
        }

        @Deprecated
        public static void onActivityStopped(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
            t.g(activity, "activity");
            CustomActivityLifecycleHandler.access$onActivityStopped$jd(customActivityLifecycleHandler, activity);
        }
    }

    static /* synthetic */ void access$onActivityCreated$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
    }

    static /* synthetic */ void access$onActivityDestroyed$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
        super.onActivityDestroyed(activity);
    }

    static /* synthetic */ void access$onActivityPaused$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
        super.onActivityPaused(activity);
    }

    static /* synthetic */ void access$onActivityResumed$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
        super.onActivityResumed(activity);
    }

    static /* synthetic */ void access$onActivitySaveInstanceState$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity, Bundle bundle) {
        super.onActivitySaveInstanceState(activity, bundle);
    }

    static /* synthetic */ void access$onActivityStarted$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
        super.onActivityStarted(activity);
    }

    static /* synthetic */ void access$onActivityStopped$jd(CustomActivityLifecycleHandler customActivityLifecycleHandler, Activity activity) {
        super.onActivityStopped(activity);
    }

    default void onActivityCreated(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
    }

    default void onActivityDestroyed(Activity activity) {
        t.g(activity, "activity");
    }

    default void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
    }

    default void onActivityResumed(Activity activity) {
        t.g(activity, "activity");
    }

    default void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        t.g(activity, "activity");
        t.g(outState, "outState");
    }

    default void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
    }

    default void onActivityStopped(Activity activity) {
        t.g(activity, "activity");
    }
}
