package ja;

import J7.N;
import Y9.a;
import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import da.c;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import ja.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class v implements FlutterFirebasePlugin, Y9.a, Z9.a, c0.c {
    public static final HashMap i = new HashMap();
    public da.b a;
    public da.j b;
    public Activity c;
    public final Map d = new HashMap();
    public final S e = new S();
    public final Y f = new Y();
    public final a0 g = new a0();
    public final b0 h = new b0();

    public static /* synthetic */ void A0(c0.F f, Task task) {
        d1(f, task);
    }

    public static /* synthetic */ void B0(c0.G g, Task task) {
        Y0(g, task);
    }

    public static /* synthetic */ void C0(c0.F f, Task task) {
        f1(f, task);
    }

    public static /* synthetic */ void D0(c0.G g, Task task) {
        Z0(g, task);
    }

    public static /* synthetic */ void E0(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        W0(gVar, taskCompletionSource);
    }

    public static /* synthetic */ void F0(c0.F f, Task task) {
        R0(f, task);
    }

    public static /* synthetic */ void G0(c0.F f, Task task) {
        b1(f, task);
    }

    public static /* synthetic */ void H0(c0.G g, Task task) {
        X0(g, task);
    }

    public static /* synthetic */ void I0(c0.G g, Task task) {
        S0(g, task);
    }

    public static /* synthetic */ void J0(v vVar, TaskCompletionSource taskCompletionSource) {
        vVar.U0(taskCompletionSource);
    }

    public static /* synthetic */ void K0(c0.F f, Task task) {
        T0(f, task);
    }

    public static /* synthetic */ void L0(c0.F f, Task task) {
        g1(f, task);
    }

    public static /* synthetic */ void M0(c0.G g, Task task) {
        a1(g, task);
    }

    private Activity N0() {
        return this.c;
    }

    public static FirebaseAuth O0(c0.b bVar) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(B7.g.p(bVar.b()));
        if (bVar.d() != null) {
            firebaseAuth.x(bVar.d());
        }
        String str = (String) ka.j.c.get(bVar.b());
        if (str != null) {
            firebaseAuth.v(str);
        }
        if (bVar.c() != null) {
            firebaseAuth.v(bVar.c());
        }
        return firebaseAuth;
    }

    private void P0(da.b bVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        this.b = new da.j(bVar, "plugins.flutter.io/firebase_auth");
        c0.c.o(bVar, this);
        c0.e.c(bVar, this.e);
        c0.m.e(bVar, this.f);
        c0.h.r(bVar, this.f);
        c0.j.b(bVar, this.g);
        c0.l.c(bVar, this.h);
        this.a = bVar;
    }

    public static /* synthetic */ void Q0(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void R0(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.f((J7.d) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void S0(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void T0(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void V0(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(((J7.V) task.getResult()).a());
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void W0(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVar);
            J7.A j = firebaseAuth.j();
            String m = firebaseAuth.m();
            c0.B j2 = j == null ? null : c1.j(j);
            if (m != null) {
                hashMap.put("APP_LANGUAGE_CODE", m);
            }
            if (j2 != null) {
                hashMap.put("APP_CURRENT_USER", c1.c(j2));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void X0(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void Y0(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void Z0(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void a1(c0.G g, Task task) {
        if (task.isSuccessful()) {
            g.a();
        } else {
            g.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void b1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void c1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void d1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void e1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void f1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void g1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a(c1.i((J7.i) task.getResult()));
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void h1(c0.F f, Task task) {
        if (task.isSuccessful()) {
            f.a((String) task.getResult());
        } else {
            f.b(w.e(task.getException()));
        }
    }

    public static /* synthetic */ void i1(J7.O o) {
        i.put(Integer.valueOf(o.hashCode()), o);
    }

    private void j1() {
        for (da.c cVar : this.d.keySet()) {
            c.d dVar = (c.d) this.d.get(cVar);
            if (dVar != null) {
                dVar.i(null);
            }
            cVar.d(null);
        }
        this.d.clear();
    }

    public static /* synthetic */ void u0(c0.F f, Task task) {
        e1(f, task);
    }

    public static /* synthetic */ void v0(c0.F f, Task task) {
        V0(f, task);
    }

    public static /* synthetic */ void w0(c0.F f, Task task) {
        c1(f, task);
    }

    public static /* synthetic */ void x0(c0.G g, Task task) {
        Q0(g, task);
    }

    public static /* synthetic */ void y0(c0.F f, Task task) {
        h1(f, task);
    }

    public static /* synthetic */ void z0(J7.O o) {
        i1(o);
    }

    public void E(c0.b bVar, String str, String str2, c0.F f) {
        O0(bVar).B(str, str2).addOnCompleteListener(new e(f));
    }

    public void I(c0.b bVar, String str, c0.q qVar, c0.G g) {
        FirebaseAuth O0 = O0(bVar);
        if (qVar == null) {
            O0.s(str).addOnCompleteListener(new h(g));
        } else {
            O0.t(str, c1.a(qVar)).addOnCompleteListener(new i(g));
        }
    }

    public void J(c0.b bVar, String str, c0.G g) {
        g.a();
    }

    public void N(c0.b bVar, String str, c0.F f) {
        O0(bVar).H(str).addOnCompleteListener(new g(f));
    }

    public final /* synthetic */ void U0(TaskCompletionSource taskCompletionSource) {
        try {
            j1();
            i.clear();
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public void W(c0.b bVar, String str, c0.G g) {
        O0(bVar).c(str).addOnCompleteListener(new f(g));
    }

    public void d(c0.b bVar, String str, c0.F f) {
        O0(bVar).d(str).addOnCompleteListener(new k(f));
    }

    public void d0(c0.b bVar, String str, Long l, c0.G g) {
        try {
            O0(bVar).G(str, l.intValue());
            g.a();
        } catch (Exception e) {
            g.b(e);
        }
    }

    public Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void f0(c0.b bVar, String str, String str2, c0.F f) {
        O0(bVar).f(str, str2).addOnCompleteListener(new u(f));
    }

    public void g(c0.b bVar, c0.G g) {
        Map map;
        try {
            FirebaseAuth O0 = O0(bVar);
            if (O0.j() != null && (map = (Map) Y.a.get(bVar.b())) != null) {
                map.remove(O0.j().b());
            }
            O0.D();
            g.a();
        } catch (Exception e) {
            g.b(e);
        }
    }

    public void g0(c0.b bVar, c0.E e, c0.F f) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            da.c cVar = new da.c(this.a, str);
            J7.S s = null;
            J7.L l = e.e() != null ? (J7.L) Y.b.get(e.e()) : null;
            String d = e.d();
            if (d != null) {
                Iterator it = Y.c.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((J7.K) Y.c.get((String) it.next())).N1().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            J7.J j = (J7.J) it2.next();
                            if (j.b().equals(d) && (j instanceof J7.S)) {
                                s = (J7.S) j;
                                break;
                            }
                        }
                    }
                }
            }
            b1 b1Var = new b1(N0(), bVar, e, l, s, new t());
            cVar.d(b1Var);
            this.d.put(cVar, b1Var);
            f.a(str);
        } catch (Exception e2) {
            f.b(e2);
        }
    }

    public Task getPluginConstantsForFirebaseApp(B7.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void h(c0.b bVar, String str, String str2, c0.F f) {
        O0(bVar).C(str, str2).addOnCompleteListener(new d(f));
    }

    public void h0(c0.b bVar, c0.F f) {
        try {
            FirebaseAuth O0 = O0(bVar);
            b bVar2 = new b(O0);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + O0.i().q();
            da.c cVar = new da.c(this.a, str);
            cVar.d(bVar2);
            this.d.put(cVar, bVar2);
            f.a(str);
        } catch (Exception e) {
            f.b(e);
        }
    }

    public void i(c0.b bVar, c0.F f) {
        O0(bVar).y().addOnCompleteListener(new q(f));
    }

    public void j0(c0.b bVar, Map map, c0.F f) {
        FirebaseAuth O0 = O0(bVar);
        J7.h b = c1.b(map);
        if (b == null) {
            throw w.b();
        }
        O0.z(b).addOnCompleteListener(new l(f));
    }

    public void l0(c0.b bVar, c0.G g) {
        O0(bVar).p().addOnCompleteListener(new s(g));
    }

    public void m(c0.b bVar, c0.y yVar, c0.F f) {
        FirebaseAuth O0 = O0(bVar);
        N.a e = J7.N.e(yVar.c(), O0);
        if (yVar.d() != null) {
            e.c(yVar.d());
        }
        if (yVar.b() != null) {
            e.a(yVar.b());
        }
        O0.E(N0(), e.b()).addOnCompleteListener(new n(f));
    }

    public void n0(c0.b bVar, String str, c0.F f) {
        O0(bVar).A(str).addOnCompleteListener(new j(f));
    }

    public void o0(c0.b bVar, String str, c0.q qVar, c0.G g) {
        O0(bVar).u(str, c1.a(qVar)).addOnCompleteListener(new p(g));
    }

    public void onAttachedToActivity(Z9.c cVar) {
        Activity activity = cVar.getActivity();
        this.c = activity;
        this.e.I0(activity);
    }

    public void onAttachedToEngine(a.b bVar) {
        P0(bVar.b());
    }

    public void onDetachedFromActivity() {
        this.c = null;
        this.e.I0(null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.c = null;
        this.e.I0(null);
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.b.e(null);
        c0.c.o(this.a, null);
        c0.e.c(this.a, null);
        c0.m.e(this.a, null);
        c0.h.r(this.a, null);
        c0.j.b(this.a, null);
        c0.l.c(this.a, null);
        this.b = null;
        this.a = null;
        j1();
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        Activity activity = cVar.getActivity();
        this.c = activity;
        this.e.I0(activity);
    }

    public void p(c0.b bVar, String str, c0.F f) {
        try {
            FirebaseAuth O0 = O0(bVar);
            if (str == null) {
                O0.F();
            } else {
                O0.w(str);
            }
            f.a(O0.m());
        } catch (Exception e) {
            f.b(e);
        }
    }

    public void q(c0.b bVar, c0.F f) {
        try {
            FirebaseAuth O0 = O0(bVar);
            a1 a1Var = new a1(O0);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + O0.i().q();
            da.c cVar = new da.c(this.a, str);
            cVar.d(a1Var);
            this.d.put(cVar, a1Var);
            f.a(str);
        } catch (Exception e) {
            f.b(e);
        }
    }

    public void s0(c0.b bVar, String str, String str2, c0.G g) {
        O0(bVar).e(str, str2).addOnCompleteListener(new o(g));
    }

    public void t(c0.b bVar, String str, c0.F f) {
        O0(bVar).g(str).addOnCompleteListener(new r(f));
    }

    public void w(c0.b bVar, c0.t tVar, c0.G g) {
        try {
            FirebaseAuth O0 = O0(bVar);
            O0.l().b(tVar.b().booleanValue());
            if (tVar.c() != null) {
                O0.l().a(tVar.c().booleanValue());
            }
            if (tVar.d() != null && tVar.e() != null) {
                O0.l().c(tVar.d(), tVar.e());
            }
            g.a();
        } catch (Exception e) {
            g.b(e);
        }
    }
}
