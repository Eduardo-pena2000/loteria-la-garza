package la;

import Y9.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.c;
import da.j;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o implements FlutterFirebasePlugin, Y9.a, j.c, c.d {
    public da.j a;
    public da.c b;
    public c.b c;

    public class a extends HashMap {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
            put("unsentReports", Boolean.valueOf(z));
        }
    }

    public class b extends HashMap {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z));
        }
    }

    public class c extends HashMap {
        public c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(o.q(o.this, B7.g.o())));
        }
    }

    public class d extends HashMap {
        public final /* synthetic */ B7.g a;

        public d(B7.g gVar) {
            this.a = gVar;
            if (gVar.q().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(o.q(o.this, B7.g.o())));
            }
        }
    }

    public static /* synthetic */ void A() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void B(TaskCompletionSource taskCompletionSource) {
        try {
            N7.h.e().c();
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void D(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void F(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            N7.h.e().h((String) obj);
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void G(j.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.a(task.getResult());
        } else {
            Exception exception = task.getException();
            dVar.b("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    public static /* synthetic */ void J(TaskCompletionSource taskCompletionSource) {
        try {
            N7.h.e().j();
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void L(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            N7.h.e().l((String) obj, (String) obj2);
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void M(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            N7.h.e().m((String) obj);
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static Boolean O(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
        } catch (PackageManager.NameNotFoundException e) {
            O7.g.f().e("Could not read data collection permission from manifest", e);
        }
        return Boolean.TRUE;
    }

    public static /* synthetic */ void a(o oVar, TaskCompletionSource taskCompletionSource, B7.g gVar) {
        oVar.E(taskCompletionSource, gVar);
    }

    public static /* synthetic */ void b(o oVar, TaskCompletionSource taskCompletionSource) {
        oVar.C(taskCompletionSource);
    }

    public static /* synthetic */ void c(j.d dVar, Task task) {
        G(dVar, task);
    }

    public static /* synthetic */ void d(o oVar, Map map, TaskCompletionSource taskCompletionSource) {
        oVar.K(map, taskCompletionSource);
    }

    public static /* synthetic */ void e() {
        A();
    }

    public static /* synthetic */ void f(Map map, TaskCompletionSource taskCompletionSource) {
        F(map, taskCompletionSource);
    }

    public static /* synthetic */ void g(Map map, TaskCompletionSource taskCompletionSource) {
        M(map, taskCompletionSource);
    }

    public static /* synthetic */ void h(o oVar, TaskCompletionSource taskCompletionSource) {
        oVar.z(taskCompletionSource);
    }

    public static /* synthetic */ void j(o oVar, Map map, Handler handler, TaskCompletionSource taskCompletionSource) {
        oVar.I(map, handler, taskCompletionSource);
    }

    public static /* synthetic */ void l(TaskCompletionSource taskCompletionSource) {
        J(taskCompletionSource);
    }

    public static /* synthetic */ void m(Map map, TaskCompletionSource taskCompletionSource) {
        L(map, taskCompletionSource);
    }

    public static /* synthetic */ void n(TaskCompletionSource taskCompletionSource) {
        B(taskCompletionSource);
    }

    public static /* synthetic */ void o(TaskCompletionSource taskCompletionSource) {
        D(taskCompletionSource);
    }

    public static /* synthetic */ void p(o oVar, String str) {
        oVar.H(str);
    }

    public static /* bridge */ /* synthetic */ boolean q(o oVar, B7.g gVar) {
        return oVar.y(gVar);
    }

    public final /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new b(N7.h.e().d()));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void E(TaskCompletionSource taskCompletionSource, B7.g gVar) {
        try {
            taskCompletionSource.setResult(new d(gVar));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void H(String str) {
        this.c.a(str);
    }

    public final /* synthetic */ void I(Map map, Handler handler, TaskCompletionSource taskCompletionSource) {
        FlutterError flutterError;
        try {
            N7.h e = N7.h.e();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("buildId");
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            Object obj5 = map.get("loadingUnits");
            Objects.requireNonNull(obj5);
            List list = (List) obj5;
            if (str4.length() > 0) {
                N7.i.b(str4);
            }
            N7.i.c(list);
            if (str2 != null) {
                String str5 = "thrown " + str2;
                if (this.c != null) {
                    handler.post(new e(this, str5));
                }
                e.l("flutter_error_reason", str5);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            e.l("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj6 = map.get("stackTraceElements");
            Objects.requireNonNull(obj6);
            Iterator it = ((List) obj6).iterator();
            while (it.hasNext()) {
                StackTraceElement v = v((Map) it.next());
                if (v != null) {
                    arrayList.add(v);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                e.h(str3);
            }
            if (booleanValue) {
                N7.i.a(flutterError);
            } else {
                e.i(flutterError);
            }
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public final /* synthetic */ void K(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            N7.h.e().k((Boolean) obj);
            taskCompletionSource.setResult(new c());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final Task N(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new la.c(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task P(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, map, new Handler(Looper.getMainLooper()), taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task Q() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task R(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task S(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new la.b(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task T(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task getPluginConstantsForFirebaseApp(B7.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new la.a(this, taskCompletionSource, gVar));
        return taskCompletionSource.getTask();
    }

    public void i(Object obj) {
        this.c = null;
    }

    public void k(Object obj, c.b bVar) {
        this.c = bVar;
    }

    public void onAttachedToEngine(a.b bVar) {
        x(bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        da.j jVar = this.a;
        if (jVar != null) {
            jVar.e(null);
            this.a = null;
        }
        da.c cVar = this.b;
        if (cVar != null) {
            cVar.d(null);
            this.b = null;
        }
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        Task u;
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                u = u();
                break;
            case "Crashlytics#recordError":
                u = P((Map) iVar.b());
                break;
            case "Crashlytics#checkForUnsentReports":
                u = r();
                break;
            case "Crashlytics#sendUnsentReports":
                u = Q();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                u = R((Map) iVar.b());
                break;
            case "Crashlytics#log":
                u = N((Map) iVar.b());
                break;
            case "Crashlytics#setCustomKey":
                u = S((Map) iVar.b());
                break;
            case "Crashlytics#deleteUnsentReports":
                u = t();
                break;
            case "Crashlytics#setUserIdentifier":
                u = T((Map) iVar.b());
                break;
            case "Crashlytics#crash":
                s();
                return;
            default:
                dVar.c();
                return;
        }
        u.addOnCompleteListener(new g(dVar));
    }

    public final Task r() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final void s() {
        new Handler(Looper.myLooper()).postDelayed(new la.d(), 50L);
    }

    public final Task t() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task u() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new n(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final StackTraceElement v(Map map) {
        try {
            String str = (String) map.get("file");
            String str2 = (String) map.get("line");
            String str3 = (String) map.get("class");
            String str4 = (String) map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    public final SharedPreferences w(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public final void x(da.b bVar) {
        da.j jVar = new da.j(bVar, "plugins.flutter.io/firebase_crashlytics");
        this.a = jVar;
        jVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
        da.c cVar = new da.c(bVar, "plugins.flutter.io/firebase_crashlytics_test_stream");
        this.b = cVar;
        cVar.d(this);
    }

    public final boolean y(B7.g gVar) {
        SharedPreferences w = w(gVar.m());
        if (w.contains("firebase_crashlytics_collection_enabled")) {
            return w.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        Boolean O = O(gVar.m());
        N7.h.e().k(O);
        return O.booleanValue();
    }

    public final /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new a(((Boolean) Tasks.await(N7.h.e().b())).booleanValue()));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }
}
