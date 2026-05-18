package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c implements Application.ActivityLifecycleCallbacks {
    private final List a = Collections.synchronizedList(new ArrayList());
    private WeakReference b;
    private WeakReference c;

    public c(Context context) {
        this.b = new WeakReference((Object) null);
        this.c = new WeakReference((Object) null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.c = this.b;
            }
        }
        context.getApplicationContext().registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.c.get();
    }

    public Activity b() {
        return (Activity) this.b.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.c = new WeakReference((Object) null);
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.b = weakReference;
        this.c = weakReference;
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public void b(b bVar) {
        this.a.remove(bVar);
    }
}
