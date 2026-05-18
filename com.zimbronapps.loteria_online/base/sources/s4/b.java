package S4;

import Q4.k;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements S4.a {
    public final k a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    public class a implements Executor {
        public a() {
        }

        public void execute(Runnable runnable) {
            b.this.c(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new k(executor);
    }

    public Executor a() {
        return this.c;
    }

    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    public void c(Runnable runnable) {
        this.b.post(runnable);
    }

    public k getBackgroundExecutor() {
        return this.a;
    }
}
