package ka;

import B7.p;
import Y9.a;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j implements Y9.a, m.d, m.c {
    public static Map c = new HashMap();
    public Context a;
    public boolean b = false;

    public static /* synthetic */ void A(j jVar, TaskCompletionSource taskCompletionSource) {
        jVar.L(taskCompletionSource);
    }

    public static /* synthetic */ void B(j jVar, m.a aVar, String str, TaskCompletionSource taskCompletionSource) {
        jVar.K(aVar, str, taskCompletionSource);
    }

    public static /* synthetic */ void C(j jVar, TaskCompletionSource taskCompletionSource) {
        jVar.O(taskCompletionSource);
    }

    public static /* synthetic */ void D(String str, TaskCompletionSource taskCompletionSource) {
        I(str, taskCompletionSource);
    }

    public static /* synthetic */ void E(j jVar, B7.g gVar, TaskCompletionSource taskCompletionSource) {
        jVar.J(gVar, taskCompletionSource);
    }

    public static /* synthetic */ void F(m.f fVar, Task task) {
        M(fVar, task);
    }

    public static /* synthetic */ void I(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                B7.g.p(str).j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void M(m.f fVar, Task task) {
        if (task.isSuccessful()) {
            fVar.a(task.getResult());
        } else {
            fVar.b(task.getException());
        }
    }

    public static /* synthetic */ void N(m.g gVar, Task task) {
        if (task.isSuccessful()) {
            gVar.a();
        } else {
            gVar.b(task.getException());
        }
    }

    public static /* synthetic */ void P(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            B7.g.p(str).F(bool);
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void Q(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            B7.g.p(str).E(bool.booleanValue());
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void x(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        Q(str, bool, taskCompletionSource);
    }

    public static /* synthetic */ void y(m.g gVar, Task task) {
        N(gVar, task);
    }

    public static /* synthetic */ void z(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        P(str, bool, taskCompletionSource);
    }

    public final Task G(B7.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final m.a H(B7.p pVar) {
        m.a.a aVar = new m.a.a();
        aVar.b(pVar.b());
        aVar.c(pVar.c());
        if (pVar.f() != null) {
            aVar.e(pVar.f());
        }
        if (pVar.g() != null) {
            aVar.f(pVar.g());
        }
        aVar.d(pVar.d());
        aVar.g(pVar.h());
        aVar.h(pVar.e());
        return aVar.a();
    }

    public final /* synthetic */ void J(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            m.b.a aVar = new m.b.a();
            aVar.c(gVar.q());
            aVar.d(H(gVar.r()));
            aVar.b(Boolean.valueOf(gVar.x()));
            aVar.e((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar)));
            taskCompletionSource.setResult(aVar.a());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void K(m.a aVar, String str, TaskCompletionSource taskCompletionSource) {
        try {
            B7.p a = new p.b().b(aVar.b()).c(aVar.c()).d(aVar.e()).f(aVar.f()).g(aVar.g()).h(aVar.h()).e(aVar.i()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (aVar.d() != null) {
                c.put(str, aVar.d());
            }
            taskCompletionSource.setResult((m.b) Tasks.await(G(B7.g.w(this.a, a, str))));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void L(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.b) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.b = true;
            }
            List n = B7.g.n(this.a);
            ArrayList arrayList = new ArrayList(n.size());
            Iterator it = n.iterator();
            while (it.hasNext()) {
                arrayList.add((m.b) Tasks.await(G((B7.g) it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void O(TaskCompletionSource taskCompletionSource) {
        try {
            B7.p a = B7.p.a(this.a);
            if (a == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(H(a));
            }
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final void R(TaskCompletionSource taskCompletionSource, m.f fVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new h(fVar));
    }

    public final void S(TaskCompletionSource taskCompletionSource, m.g gVar) {
        taskCompletionSource.getTask().addOnCompleteListener(new g(gVar));
    }

    public void b(String str, m.a aVar, m.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, aVar, str, taskCompletionSource));
        R(taskCompletionSource, fVar);
    }

    public void e(String str, Boolean bool, m.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(str, bool, taskCompletionSource));
        S(taskCompletionSource, gVar);
    }

    public void i(m.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, taskCompletionSource));
        R(taskCompletionSource, fVar);
    }

    public void n(m.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, taskCompletionSource));
        R(taskCompletionSource, fVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        m.d.f(bVar.b(), this);
        m.c.c(bVar.b(), this);
        this.a = bVar.a();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.a = null;
        m.d.f(bVar.b(), null);
        m.c.c(bVar.b(), null);
    }

    public void q(String str, m.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(str, taskCompletionSource));
        S(taskCompletionSource, gVar);
    }

    public void w(String str, Boolean bool, m.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(str, bool, taskCompletionSource));
        S(taskCompletionSource, gVar);
    }
}
