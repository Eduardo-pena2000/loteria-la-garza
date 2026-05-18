package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import com.applovin.adview.AppLovinFullscreenActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d {

    public class a extends com.applovin.impl.b {
        private WeakReference a = new WeakReference((Object) null);
        final /* synthetic */ Class b;
        final /* synthetic */ b c;
        final /* synthetic */ c d;

        public a(Class cls, b bVar, c cVar) {
            this.b = cls;
            this.c = bVar;
            this.d = cVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.b.isInstance(activity) && this.a.get() == null) {
                this.a = new WeakReference(activity);
                this.c.a(activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.b.isInstance(activity) && !activity.isChangingConfigurations() && this.a.get() == activity) {
                this.d.b(this);
            }
        }
    }

    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    public static void b(Activity activity) {
        WindowInsetsController a2;
        if (!o0.b() || (a2 = T1.c1.a(activity.getWindow())) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            V.a(a2, 2);
            T1.U.a(a2, T1.U0.a());
        }
    }

    public static void c(Activity activity) {
        if (!o0.b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        WindowInsetsController a2 = T1.c1.a(activity.getWindow());
        if (a2 == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            V.a(a2, 2);
            T1.U.a(a2, W.a());
        }
    }

    public static boolean d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static String b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Activity activity) {
        WindowInsetsController a2;
        if (o0.b() && (a2 = T1.c1.a(activity.getWindow())) != null) {
            V.a(a2, 2);
            T1.U.a(a2, T1.V0.a());
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(4866);
        }
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName a2;
        if (!o0.i()) {
            return null;
        }
        try {
            List appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService("activity")).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
                    ComponentName a3 = X.a(taskInfo);
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (a3 != null && a3.getClassName().equals(name) && (a2 = Y.a(taskInfo)) != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(a2, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
