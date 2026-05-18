package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import com.amazon.a.a.a.a.d;
import com.amazon.a.a.c.f;
import com.amazon.a.a.o.g;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements a {
    public static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("ContextManagerImplV3");

    @com.amazon.a.a.k.a
    private Application e;

    @com.amazon.a.a.k.a
    private f f;
    private final AtomicReference b = new AtomicReference();
    private final g c = new g();
    private final LinkedHashSet d = new LinkedHashSet();
    private boolean g = false;

    private boolean e() {
        return !this.g && this.d.size() == 1;
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Checking if application is destroyed");
        }
        if (!this.d.isEmpty()) {
            return false;
        }
        a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    public void a(Service service) {
    }

    public void b(Service service) {
    }

    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        this.c.a(activity);
        this.d.add(activity);
        Activity i = i(activity);
        this.b.set(i);
        cVar.a("Setting visible to: " + i);
        if (com.amazon.a.a.o.c.a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    public boolean d() {
        return false;
    }

    public void f() {
    }

    public void g() {
    }

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        Object[] array = this.d.toArray();
        Activity activity = null;
        for (int length = array.length - 1; length >= 0; length--) {
            activity = (Activity) array[length];
            if (g(activity)) {
                a.a("root activity" + activity);
                return activity;
            }
        }
        if (activity != null || array.length <= 0) {
            return activity;
        }
        a.a("root not fount returning" + activity);
        return (Activity) array[array.length - 1];
    }

    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.d.remove(activity);
        if (com.amazon.a.a.o.c.a) {
            a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.d.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            a.a("AppLifeCycle application has been destroyed");
            this.g = false;
            a(d.DESTROY);
        }
    }

    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.a) {
            a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        this.d.add(activity);
        if (b() == activity) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Setting visible activity to null");
            }
            this.b.set((Object) null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        a.a("Activity stopped: " + activity);
        this.d.add(activity);
        this.c.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.c.a()) {
            a(d.STOP);
        }
    }

    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        a.a("Activity started: " + activity);
        this.d.add(activity);
        this.c.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (e()) {
            this.g = true;
            a(d.CREATE);
        }
        if (this.c.b() == 1) {
            a(d.START);
        }
    }

    public boolean h() {
        com.amazon.a.a.o.a.a.a();
        return (!c() && this.d.isEmpty() && this.c.a()) ? false : true;
    }

    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.d.add(activity);
        if (com.amazon.a.a.o.c.a) {
            a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.d.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (e()) {
            this.g = true;
            a(d.CREATE);
        }
    }

    public boolean c() {
        return this.b.get() != null;
    }

    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return (Activity) this.b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(d dVar) {
        this.f.a(new com.amazon.a.a.a.a.c(dVar, this.e));
    }
}
