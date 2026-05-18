package Q1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {

    public static class a implements ThreadFactory {
        public String a;
        public int b;

        public static class a extends Thread {
            public final int a;

            public a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.a = i;
            }

            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.a, this.b);
        }
    }

    public static class b implements Executor {
        public final Handler a;

        public b(Handler handler) {
            this.a = (Handler) S1.g.h(handler);
        }

        public void execute(Runnable runnable) {
            if (this.a.post((Runnable) S1.g.h(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.a + " is shutting down");
        }
    }

    public static class c implements Runnable {
        public Callable a;
        public S1.b b;
        public Handler c;

        public class a implements Runnable {
            public final /* synthetic */ S1.b a;
            public final /* synthetic */ Object b;

            public a(S1.b bVar, Object obj) {
                this.a = bVar;
                this.b = obj;
            }

            public void run() {
                this.a.accept(this.b);
            }
        }

        public c(Handler handler, Callable callable, S1.b bVar) {
            this.a = callable;
            this.b = bVar;
            this.c = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.c.post(new a(this.b, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static void c(Executor executor, Callable callable, S1.b bVar) {
        executor.execute(new c(Q1.b.a(), callable, bVar));
    }

    public static Object d(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        } catch (InterruptedException e2) {
            throw e2;
        }
    }
}
