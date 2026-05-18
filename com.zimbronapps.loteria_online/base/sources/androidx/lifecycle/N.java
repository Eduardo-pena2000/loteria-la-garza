package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public static final n a = new n();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a extends f {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.t.g(activity, "activity");
            H.b.c(activity);
        }
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Application applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        applicationContext.registerActivityLifecycleCallbacks(new a());
    }
}
