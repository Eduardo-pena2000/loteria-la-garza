package s8;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class m {
    public static final Object c = new Object();
    public static k0 d;
    public final Context a;
    public final Executor b = new c4.k();

    public m(Context context) {
        this.a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z, Task task) {
        return j(context, intent, z, task);
    }

    public static /* synthetic */ Integer b(Context context, Intent intent) {
        return h(context, intent);
    }

    public static /* synthetic */ Integer c(Task task) {
        return g(task);
    }

    public static /* synthetic */ Integer d(Task task) {
        return i(task);
    }

    public static Task e(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        k0 f = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return f.d(intent).continueWith(new c4.k(), new l());
        }
        if (V.b().e(context)) {
            f0.f(context, f, intent);
        } else {
            f.d(intent);
        }
        return Tasks.forResult(-1);
    }

    public static k0 f(Context context, String str) {
        k0 k0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new k0(context, str);
                }
                k0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k0Var;
    }

    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(V.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    public static /* synthetic */ Task j(Context context, Intent intent, boolean z, Task task) {
        return (E6.q.g() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z).continueWith(new c4.k(), new k()) : task;
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.a, intent);
    }

    public Task l(Context context, Intent intent) {
        boolean z = E6.q.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(this.b, new i(context, intent)).continueWithTask(this.b, new j(context, intent, z2)) : e(context, intent, z2);
    }
}
