package androidx.work.impl.workers;

import G4.m;
import H4.i;
import L4.c;
import L4.d;
import P4.p;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import x7.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String f = m.f("ConstraintTrkngWrkr");
    public WorkerParameters a;
    public final Object b;
    public volatile boolean c;
    public R4.c d;
    public ListenableWorker e;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.b) {
                try {
                    if (ConstraintTrackingWorker.this.c) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.d.q(this.a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = new Object();
        this.c = false;
        this.d = R4.c.s();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    public void b(List list) {
        m.c().a(f, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.b) {
            this.c = true;
        }
    }

    public void c() {
        this.d.o(ListenableWorker.a.a());
    }

    public void d() {
        this.d.o(ListenableWorker.a.b());
    }

    public void e() {
        String i = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i)) {
            m.c().b(f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b2 = getWorkerFactory().b(getApplicationContext(), i, this.a);
        this.e = b2;
        if (b2 == null) {
            m.c().a(f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p h = a().B().h(getId().toString());
        if (h == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(h));
        if (!dVar.c(getId().toString())) {
            m.c().a(f, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{i}), new Throwable[0]);
            d();
            return;
        }
        m.c().a(f, String.format("Constraints met for delegate %s", new Object[]{i}), new Throwable[0]);
        try {
            e startWork = this.e.startWork();
            startWork.addListener(new b(startWork), getBackgroundExecutor());
        } catch (Throwable th) {
            m c = m.c();
            String str = f;
            c.a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{i}), th);
            synchronized (this.b) {
                try {
                    if (this.c) {
                        m.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } finally {
                }
            }
        }
    }

    public void f(List list) {
    }

    public S4.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.e.stop();
    }

    public e startWork() {
        getBackgroundExecutor().execute(new a());
        return this.d;
    }
}
