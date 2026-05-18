package s8;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s8.h0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class h extends Service {
    public Binder b;
    public int d;
    public final ExecutorService a = n.d();
    public final Object c = new Object();
    public int e = 0;

    public class a implements h0.a {
        public a() {
        }

        public Task a(Intent intent) {
            return h.c(h.this, intent);
        }
    }

    public static /* synthetic */ void a(h hVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        hVar.i(intent, taskCompletionSource);
    }

    public static /* synthetic */ void b(h hVar, Intent intent, Task task) {
        hVar.h(intent, task);
    }

    public static /* synthetic */ Task c(h hVar, Intent intent) {
        return hVar.j(intent);
    }

    public final void d(Intent intent) {
        if (intent != null) {
            f0.c(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    k(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    public final /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    public final /* synthetic */ void i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    public final Task j(Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.execute(new g(this, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean k(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.b == null) {
                this.b = new h0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent e = e(intent);
        if (e == null) {
            d(intent);
            return 2;
        }
        Task j = j(e);
        if (j.isComplete()) {
            d(intent);
            return 2;
        }
        j.addOnCompleteListener((Executor) new c4.k(), (OnCompleteListener) new f(this, intent));
        return 3;
    }
}
