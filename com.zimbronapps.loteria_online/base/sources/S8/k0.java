package s8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class k0 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final Queue d;
    public h0 e;
    public boolean f;

    public static class a {
        public final Intent a;
        public final TaskCompletionSource b = new TaskCompletionSource();

        public a(Intent intent) {
            this.a = intent;
        }

        public static /* synthetic */ void a(ScheduledFuture scheduledFuture, Task task) {
            g(scheduledFuture, task);
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.f();
        }

        public static /* synthetic */ void g(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            e().addOnCompleteListener((Executor) scheduledExecutorService, (OnCompleteListener) new j0(scheduledExecutorService.schedule(new i0(this), 20L, TimeUnit.SECONDS)));
        }

        public void d() {
            this.b.trySetResult(null);
        }

        public Task e() {
            return this.b.getTask();
        }

        public final /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " finishing.");
            d();
        }
    }

    public k0(Context context, String str) {
        this(context, str, a());
    }

    public static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new F6.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final void b() {
        while (!this.d.isEmpty()) {
            ((a) this.d.poll()).d();
        }
    }

    public final synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                h0 h0Var = this.e;
                if (h0Var == null || !h0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.c((a) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Task d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.c);
            this.d.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    public final void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (D6.a.b().a(this.a, this.b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f = false;
        b();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof h0) {
                this.e = (h0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    public k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledExecutorService;
    }
}
