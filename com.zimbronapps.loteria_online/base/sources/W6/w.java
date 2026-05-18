package W6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ x a;

    public /* synthetic */ w(x xVar, v vVar) {
        this.a = xVar;
    }

    public final void onActivityDestroyed(Activity activity) {
        x.c(this.a, activity);
    }

    public final void onActivityResumed(Activity activity) {
        x.d(this.a, activity);
    }

    public final void onActivityStarted(Activity activity) {
        x.d(this.a, activity);
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
