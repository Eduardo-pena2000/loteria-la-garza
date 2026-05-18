package J2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static Handler e;
    public volatile e b = e.PENDING;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final FutureTask a = new b(new a());

    public class a implements Callable {
        public a() {
        }

        public Object call() {
            c.this.d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = c.this.b();
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    public class b extends FutureTask {
        public b(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public void run() {
            c.this.d(this.a);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (e == null) {
                    e = new Handler(Looper.getMainLooper());
                }
                handler = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z) {
        this.c.set(true);
        return this.a.cancel(z);
    }

    public abstract Object b();

    public final void c(Executor executor) {
        if (this.b == e.PENDING) {
            this.b = e.RUNNING;
            executor.execute(this.a);
            return;
        }
        int i = d.a[this.b.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.b = e.FINISHED;
    }

    public final boolean f() {
        return this.c.get();
    }

    public abstract void g(Object obj);

    public abstract void h(Object obj);

    public void i(Object obj) {
        e().post(new c(obj));
    }

    public void j(Object obj) {
        if (this.d.get()) {
            return;
        }
        i(obj);
    }
}
