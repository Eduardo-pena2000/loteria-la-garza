package na;

import Y9.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import da.j;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class x implements FlutterFirebasePlugin, j.c, da.m, Y9.a, Z9.a {
    public da.j b;
    public Activity c;
    public androidx.lifecycle.B e;
    public androidx.lifecycle.B g;
    public com.google.firebase.messaging.d h;
    public Map i;
    public A j;
    public final HashMap a = new HashMap();
    public final androidx.lifecycle.y d = B.o();
    public final androidx.lifecycle.y f = C.o();

    public class a extends HashMap {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
            put("token", str);
        }
    }

    public class b extends HashMap {
        public final /* synthetic */ FirebaseMessaging a;

        public b(FirebaseMessaging firebaseMessaging) {
            this.a = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.A()));
        }
    }

    public static /* synthetic */ void A(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult((Object) null);
    }

    public static /* synthetic */ void D(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (gVar.q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.r().A()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void I(Map map, TaskCompletionSource taskCompletionSource, int i) {
        map.put("authorizationStatus", Integer.valueOf(i));
        taskCompletionSource.setResult(map);
    }

    public static /* synthetic */ void J(TaskCompletionSource taskCompletionSource, String str) {
        taskCompletionSource.setException(new Exception(str));
    }

    public static /* synthetic */ void L(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            z.a(map).N(z.b(map));
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void N(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a2 = z.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a2.P(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void O(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a2 = z.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(a2.U((String) obj));
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void P(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a2 = z.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(a2.X((String) obj));
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void a(Map map, TaskCompletionSource taskCompletionSource) {
        L(map, taskCompletionSource);
    }

    public static /* synthetic */ void b(x xVar, TaskCompletionSource taskCompletionSource) {
        xVar.E(taskCompletionSource);
    }

    public static /* synthetic */ void d(Map map, TaskCompletionSource taskCompletionSource) {
        O(map, taskCompletionSource);
    }

    public static /* synthetic */ void e(x xVar, TaskCompletionSource taskCompletionSource) {
        xVar.K(taskCompletionSource);
    }

    public static /* synthetic */ void f(Map map, TaskCompletionSource taskCompletionSource) {
        P(map, taskCompletionSource);
    }

    public static /* synthetic */ void g(x xVar, com.google.firebase.messaging.d dVar) {
        xVar.F(dVar);
    }

    public static /* synthetic */ void h(x xVar, String str) {
        xVar.G(str);
    }

    public static /* synthetic */ void i(TaskCompletionSource taskCompletionSource) {
        z(taskCompletionSource);
    }

    public static /* synthetic */ void j(x xVar, TaskCompletionSource taskCompletionSource) {
        xVar.B(taskCompletionSource);
    }

    public static /* synthetic */ void k(x xVar, TaskCompletionSource taskCompletionSource) {
        xVar.C(taskCompletionSource);
    }

    public static /* synthetic */ void l(B7.g gVar, TaskCompletionSource taskCompletionSource) {
        D(gVar, taskCompletionSource);
    }

    public static /* synthetic */ void m(TaskCompletionSource taskCompletionSource, String str) {
        J(taskCompletionSource, str);
    }

    public static /* synthetic */ void n(Map map, TaskCompletionSource taskCompletionSource) {
        N(map, taskCompletionSource);
    }

    public static /* synthetic */ void o(TaskCompletionSource taskCompletionSource) {
        A(taskCompletionSource);
    }

    public static /* synthetic */ void p(Map map, TaskCompletionSource taskCompletionSource, int i) {
        I(map, taskCompletionSource, i);
    }

    public static /* synthetic */ void q(x xVar, Map map, TaskCompletionSource taskCompletionSource) {
        xVar.M(map, taskCompletionSource);
    }

    public static /* synthetic */ void r(x xVar, j.d dVar, Task task) {
        xVar.H(dVar, task);
    }

    private void y(da.b bVar) {
        da.j jVar = new da.j(bVar, "plugins.flutter.io/firebase_messaging");
        this.b = jVar;
        jVar.e(this);
        this.j = new A();
        this.e = new o(this);
        this.g = new p(this);
        this.d.i(this.e);
        this.f.i(this.g);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.r().o());
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c A[PHI: r0
      0x007c: PHI (r0v11 com.google.firebase.messaging.d) = (r0v8 com.google.firebase.messaging.d), (r0v13 com.google.firebase.messaging.d) binds: [B:30:0x0067, B:32:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void B(com.google.android.gms.tasks.TaskCompletionSource r7) {
        /*
            r6 = this;
            com.google.firebase.messaging.d r0 = r6.h     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "notification"
            r2 = 0
            if (r0 == 0) goto L1e
            java.util.Map r0 = na.z.f(r0)     // Catch: java.lang.Exception -> L13
            java.util.Map r3 = r6.i     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L16
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L13
            goto L16
        L13:
            r0 = move-exception
            goto Lae
        L16:
            r7.setResult(r0)     // Catch: java.lang.Exception -> L13
            r6.h = r2     // Catch: java.lang.Exception -> L13
            r6.i = r2     // Catch: java.lang.Exception -> L13
            return
        L1e:
            android.app.Activity r0 = r6.c     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto L26
            r7.setResult(r2)     // Catch: java.lang.Exception -> L13
            return
        L26:
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto Laa
            android.os.Bundle r3 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L34
            goto Laa
        L34:
            android.os.Bundle r3 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = "google.message_id"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4a
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = "message_id"
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Exception -> L13
        L4a:
            if (r3 == 0) goto La6
            java.util.HashMap r0 = r6.a     // Catch: java.lang.Exception -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L55
            goto La6
        L55:
            java.util.HashMap r0 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver.a     // Catch: java.lang.Exception -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L13
            com.google.firebase.messaging.d r0 = (com.google.firebase.messaging.d) r0     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto L85
            na.y r4 = na.y.b()     // Catch: java.lang.Exception -> L13
            java.util.Map r4 = r4.a(r3)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L7c
            com.google.firebase.messaging.d r0 = na.z.b(r4)     // Catch: java.lang.Exception -> L13
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L7c
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Exception -> L13
            java.util.Map r4 = r6.V(r4)     // Catch: java.lang.Exception -> L13
            goto L7d
        L7c:
            r4 = r2
        L7d:
            na.y r5 = na.y.b()     // Catch: java.lang.Exception -> L13
            r5.g(r3)     // Catch: java.lang.Exception -> L13
            goto L86
        L85:
            r4 = r2
        L86:
            if (r0 != 0) goto L8c
            r7.setResult(r2)     // Catch: java.lang.Exception -> L13
            return
        L8c:
            java.util.HashMap r2 = r6.a     // Catch: java.lang.Exception -> L13
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L13
            r2.put(r3, r5)     // Catch: java.lang.Exception -> L13
            java.util.Map r2 = na.z.f(r0)     // Catch: java.lang.Exception -> L13
            com.google.firebase.messaging.d$c r0 = r0.S1()     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto La2
            if (r4 == 0) goto La2
            r2.put(r1, r4)     // Catch: java.lang.Exception -> L13
        La2:
            r7.setResult(r2)     // Catch: java.lang.Exception -> L13
            goto Lb1
        La6:
            r7.setResult(r2)     // Catch: java.lang.Exception -> L13
            return
        Laa:
            r7.setResult(r2)     // Catch: java.lang.Exception -> L13
            return
        Lae:
            r7.setException(r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: na.x.B(com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? s().booleanValue() : G1.p.b(this.c).a()));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new a((String) Tasks.await(FirebaseMessaging.r().u())));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void F(com.google.firebase.messaging.d dVar) {
        this.b.c("Messaging#onMessage", z.f(dVar));
    }

    public final /* synthetic */ void G(String str) {
        this.b.c("Messaging#onTokenRefresh", str);
    }

    public final /* synthetic */ void H(j.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.a(task.getResult());
        } else {
            Exception exception = task.getException();
            dVar.b("firebase_messaging", exception != null ? exception.getMessage() : null, u(exception));
        }
    }

    public final /* synthetic */ void K(TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        try {
            if (s().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                taskCompletionSource.setResult(hashMap);
            } else {
                this.j.a(this.c, new m(hashMap, taskCompletionSource), new n(taskCompletionSource));
            }
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void M(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging a2 = z.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a2.O(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new b(a2));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final Task Q() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task R(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new t(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task S(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task T(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task U(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Map V(Object obj) {
        return (Map) obj;
    }

    public final Task W(Map map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public boolean c(Intent intent) {
        Map map;
        Map map2;
        Map a2;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        com.google.firebase.messaging.d dVar = (com.google.firebase.messaging.d) FlutterFirebaseMessagingReceiver.a.get(string);
        if (dVar != null || (a2 = y.b().a(string)) == null) {
            map = null;
        } else {
            dVar = z.b(a2);
            map = z.c(a2);
        }
        if (dVar == null) {
            return false;
        }
        this.h = dVar;
        this.i = map;
        FlutterFirebaseMessagingReceiver.a.remove(string);
        Map f = z.f(dVar);
        if (dVar.S1() == null && (map2 = this.i) != null) {
            f.put("notification", map2);
        }
        this.b.c("Messaging#onMessageOpenedApp", f);
        this.c.setIntent(intent);
        return true;
    }

    public Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task getPluginConstantsForFirebaseApp(B7.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToActivity(Z9.c cVar) {
        cVar.a(this);
        cVar.c(this.j);
        Activity activity = cVar.getActivity();
        this.c = activity;
        if (activity.getIntent() == null || this.c.getIntent().getExtras() == null || (this.c.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        c(this.c.getIntent());
    }

    public void onAttachedToEngine(a.b bVar) {
        na.a.b(bVar.a());
        y(bVar.b());
    }

    public void onDetachedFromActivity() {
        this.c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.c = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f.m(this.g);
        this.d.m(this.e);
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        Task v;
        long intValue;
        long intValue2;
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "Messaging#getInitialMessage":
                v = v();
                break;
            case "Messaging#setAutoInitEnabled":
                v = S((Map) iVar.b());
                break;
            case "Messaging#deleteToken":
                v = t();
                break;
            case "Messaging#unsubscribeFromTopic":
                v = W((Map) iVar.b());
                break;
            case "Messaging#subscribeToTopic":
                v = U((Map) iVar.b());
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                v = T((Map) iVar.b());
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) iVar.b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    intValue = ((Long) obj).longValue();
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    intValue = ((Integer) obj).intValue();
                }
                if (obj2 instanceof Long) {
                    intValue2 = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    intValue2 = ((Integer) obj2).intValue();
                }
                Activity activity = this.c;
                S9.f a2 = activity != null ? S9.f.a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.n(intValue);
                FlutterFirebaseMessagingBackgroundService.o(intValue2);
                FlutterFirebaseMessagingBackgroundService.p(intValue, a2);
                v = Tasks.forResult((Object) null);
                break;
            case "Messaging#sendMessage":
                v = R((Map) iVar.b());
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    v = w();
                    break;
                } else {
                    v = Q();
                    break;
                }
            case "Messaging#getNotificationSettings":
                v = w();
                break;
            case "Messaging#getToken":
                v = x();
                break;
            default:
                dVar.c();
                return;
        }
        v.addOnCompleteListener(new r(this, dVar));
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        cVar.a(this);
        this.c = cVar.getActivity();
    }

    public final Boolean s() {
        return Boolean.valueOf(na.a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    public final Task t() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new v(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Map u(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        if (exc != null) {
            hashMap.put("message", exc.getMessage());
        } else {
            hashMap.put("message", "An unknown error has occurred.");
        }
        return hashMap;
    }

    public final Task v() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task w() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new w(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task x() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
