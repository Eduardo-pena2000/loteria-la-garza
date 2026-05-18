package y8;

import A8.f;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import w8.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public x8.e a;
    public a b;
    public Executor c;
    public Set d = Collections.newSetFromMap(new ConcurrentHashMap());

    public e(x8.e eVar, a aVar, Executor executor) {
        this.a = eVar;
        this.b = aVar;
        this.c = executor;
    }

    public static /* synthetic */ void a(e eVar, Task task, f fVar, com.google.firebase.remoteconfig.internal.b bVar) {
        eVar.f(task, fVar, bVar);
    }

    public static /* synthetic */ void b(f fVar, A8.e eVar) {
        e(fVar, eVar);
    }

    public static /* synthetic */ void c(f fVar, A8.e eVar) {
        d(fVar, eVar);
    }

    public static /* synthetic */ void d(f fVar, A8.e eVar) {
        fVar.a(eVar);
    }

    public static /* synthetic */ void e(f fVar, A8.e eVar) {
        fVar.a(eVar);
    }

    public final /* synthetic */ void f(Task task, f fVar, com.google.firebase.remoteconfig.internal.b bVar) {
        try {
            com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) task.getResult();
            if (bVar2 != null) {
                this.c.execute(new c(fVar, this.b.b(bVar2)));
            }
        } catch (q e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void g(com.google.firebase.remoteconfig.internal.b bVar) {
        try {
            A8.e b = this.b.b(bVar);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                this.c.execute(new d((f) it.next(), b));
            }
        } catch (q e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }

    public void h(f fVar) {
        this.d.add(fVar);
        Task e = this.a.e();
        e.addOnSuccessListener(this.c, new b(this, e, fVar));
    }
}
