package W6;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import com.google.android.gms.tasks.TaskExecutors;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x {
    public static final AtomicReference g = new AtomicReference();
    public final Application a;
    public WeakReference e;
    public final Application.ActivityLifecycleCallbacks b = new w(this, null);
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new WeakHashMap());
    public boolean f = false;

    public x(Application application) {
        this.a = application;
    }

    public static x b(Application application) {
        com.google.android.gms.common.internal.t.l(application);
        AtomicReference atomicReference = g;
        x xVar = (x) atomicReference.get();
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(application);
        while (!Y.a(atomicReference, (Object) null, xVar2) && atomicReference.get() == null) {
        }
        return (x) g.get();
    }

    public static /* bridge */ /* synthetic */ void c(x xVar, Activity activity) {
        synchronized (xVar.c) {
            try {
                WeakReference weakReference = xVar.e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    xVar.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void d(x xVar, Activity activity) {
        com.google.android.gms.common.internal.t.l(activity);
        synchronized (xVar.c) {
            try {
                if (xVar.a() == activity) {
                    return;
                }
                xVar.e = new WeakReference(activity);
                Iterator it = xVar.d.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).a(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity a() {
        Activity activity;
        synchronized (this.c) {
            WeakReference weakReference = this.e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    public final void e(u uVar) {
        com.google.android.gms.common.internal.t.l(uVar);
        synchronized (this.c) {
            this.d.add(uVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f(uVar);
        } else {
            TaskExecutors.MAIN_THREAD.execute(new t(this, uVar));
        }
    }

    public final void g() {
        synchronized (this.c) {
            try {
                if (!this.f) {
                    this.a.registerActivityLifecycleCallbacks(this.b);
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void f(u uVar) {
        Activity a = a();
        if (a == null) {
            return;
        }
        uVar.a(a);
    }
}
