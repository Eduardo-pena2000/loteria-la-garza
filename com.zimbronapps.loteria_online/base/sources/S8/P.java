package s8;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class p implements Application.ActivityLifecycleCallbacks {
    public final Queue a = new ArrayDeque(10);

    public static /* synthetic */ void a(p pVar, Intent intent) {
        pVar.b(intent);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String h = com.google.firebase.messaging.b.h(extras);
                if (!TextUtils.isEmpty(h)) {
                    if (this.a.contains(h)) {
                        return;
                    } else {
                        this.a.add(h);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (com.google.firebase.messaging.b.F(bundle)) {
            com.google.firebase.messaging.b.x(bundle);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new o(this, intent));
        } else {
            b(intent);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
