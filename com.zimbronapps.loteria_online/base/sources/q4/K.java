package Q4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class k implements Executor {
    public final Executor b;
    public volatile Runnable d;
    public final ArrayDeque a = new ArrayDeque();
    public final Object c = new Object();

    public static class a implements Runnable {
        public final k a;
        public final Runnable b;

        public a(k kVar, Runnable runnable) {
            this.a = kVar;
            this.b = runnable;
        }

        public void run() {
            try {
                this.b.run();
            } finally {
                this.a.b();
            }
        }
    }

    public k(Executor executor) {
        this.b = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            z = !this.a.isEmpty();
        }
        return z;
    }

    public void b() {
        synchronized (this.c) {
            try {
                Runnable runnable = (Runnable) this.a.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.c) {
            try {
                this.a.add(new a(this, runnable));
                if (this.d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
