package x8;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public static final Map d = new HashMap();
    public static final Executor e = new c4.k();
    public final Executor a;
    public final p b;
    public Task c = null;

    public e(Executor executor, p pVar) {
        this.a = executor;
        this.b = pVar;
    }

    public static /* synthetic */ Task a(e eVar, boolean z, com.google.firebase.remoteconfig.internal.b bVar, Void r3) {
        return eVar.j(z, bVar, r3);
    }

    public static /* synthetic */ Void b(e eVar, com.google.firebase.remoteconfig.internal.b bVar) {
        return eVar.i(bVar);
    }

    public static Object c(Task task, long j, TimeUnit timeUnit) {
        b bVar = new b(null);
        Executor executor = e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (!bVar.a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized e h(Executor executor, p pVar) {
        e eVar;
        synchronized (e.class) {
            try {
                String b2 = pVar.b();
                Map map = d;
                if (!map.containsKey(b2)) {
                    map.put(b2, new e(executor, pVar));
                }
                eVar = (e) map.get(b2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public void d() {
        synchronized (this) {
            this.c = Tasks.forResult(null);
        }
        this.b.a();
    }

    public synchronized Task e() {
        try {
            Task task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                Executor executor = this.a;
                p pVar = this.b;
                Objects.requireNonNull(pVar);
                this.c = Tasks.call(executor, new x8.b(pVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public com.google.firebase.remoteconfig.internal.b f() {
        return g(5L);
    }

    public com.google.firebase.remoteconfig.internal.b g(long j) {
        synchronized (this) {
            try {
                Task task = this.c;
                if (task != null && task.isSuccessful()) {
                    return (com.google.firebase.remoteconfig.internal.b) this.c.getResult();
                }
                try {
                    return (com.google.firebase.remoteconfig.internal.b) c(e(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Void i(com.google.firebase.remoteconfig.internal.b bVar) {
        return this.b.e(bVar);
    }

    public final /* synthetic */ Task j(boolean z, com.google.firebase.remoteconfig.internal.b bVar, Void r3) {
        if (z) {
            m(bVar);
        }
        return Tasks.forResult(bVar);
    }

    public Task k(com.google.firebase.remoteconfig.internal.b bVar) {
        return l(bVar, true);
    }

    public Task l(com.google.firebase.remoteconfig.internal.b bVar, boolean z) {
        return Tasks.call(this.a, new c(this, bVar)).onSuccessTask(this.a, new d(this, z, bVar));
    }

    public final synchronized void m(com.google.firebase.remoteconfig.internal.b bVar) {
        this.c = Tasks.forResult(bVar);
    }

    public static class b implements OnSuccessListener, OnFailureListener, OnCanceledListener {
        public final CountDownLatch a;

        public b() {
            this.a = new CountDownLatch(1);
        }

        public boolean a(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        public void onCanceled() {
            this.a.countDown();
        }

        public void onFailure(Exception exc) {
            this.a.countDown();
        }

        public void onSuccess(Object obj) {
            this.a.countDown();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
