package s8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class f0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static p7.a c;

    public static /* synthetic */ void a(Intent intent, Task task) {
        e(intent, task);
    }

    public static void b(Context context) {
        if (c == null) {
            p7.a aVar = new p7.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = aVar;
            aVar.d(true);
        }
    }

    public static void c(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && d(intent)) {
                    g(intent, false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static /* synthetic */ void e(Intent intent, Task task) {
        c(intent);
    }

    public static void f(Context context, k0 k0Var, Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d = d(intent);
                g(intent, true);
                if (!d) {
                    c.a(a);
                }
                k0Var.d(intent).addOnCompleteListener(new e0(intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName h(Context context, Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d) {
                    c.a(a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
