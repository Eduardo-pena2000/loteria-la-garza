package G1;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ d a;
        public final /* synthetic */ Object b;

        public a(d dVar, Object obj) {
            this.a = dVar;
            this.b = obj;
        }

        public void run() {
            this.a.a = this.b;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Application a;
        public final /* synthetic */ d b;

        public b(Application application, d dVar) {
            this.a = application;
            this.b = dVar;
        }

        public void run() {
            this.a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        public void run() {
            try {
                Method method = d.d;
                if (method != null) {
                    method.invoke(this.a, new Object[]{this.b, Boolean.FALSE, "AppCompat recreation"});
                } else {
                    d.e.invoke(this.a, new Object[]{this.b, Boolean.FALSE});
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class a2 = a();
        a = a2;
        b = b();
        c = f();
        d = d(a2);
        e = c(a2);
        f = e(a2);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object a;
        public Activity b;
        public final int c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;

        public d(Activity activity) {
            this.b = activity;
            this.c = activity.hashCode();
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (!this.e || this.f || this.d || !d.h(this.a, this.c, activity)) {
                return;
            }
            this.f = true;
            this.a = null;
        }

        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.d = true;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
