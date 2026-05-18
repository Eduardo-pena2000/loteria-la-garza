package androidx.work;

import R4.c;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import x7.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class Worker extends ListenableWorker {
    public c a;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Worker.this.a.o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.a.p(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    public final e startWork() {
        this.a = c.s();
        getBackgroundExecutor().execute(new a());
        return this.a;
    }
}
