package com.google.firebase.messaging;

import B7.g;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.f;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m8.h;
import s8.A;
import s8.B;
import s8.C;
import s8.F;
import s8.J;
import s8.O;
import s8.Q;
import s8.Y;
import s8.c0;
import s8.m;
import s8.n;
import s8.p;
import s8.q;
import s8.r;
import s8.s;
import s8.u;
import s8.v;
import s8.w;
import s8.x;
import s8.y;
import s8.z;
import w5.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseMessaging {
    public static f m;
    public static ScheduledExecutorService o;
    public final g a;
    public final Context b;
    public final F c;
    public final e d;
    public final a e;
    public final Executor f;
    public final Executor g;
    public final Task h;
    public final J i;
    public boolean j;
    public final Application.ActivityLifecycleCallbacks k;
    public static final long l = TimeUnit.HOURS.toSeconds(8);
    public static l8.b n = new q();

    public class a {
        public final i8.d a;
        public boolean b;
        public i8.b c;
        public Boolean d;

        public a(i8.d dVar) {
            this.a = dVar;
        }

        public static /* synthetic */ void a(a aVar, i8.a aVar2) {
            aVar.d(aVar2);
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean e = e();
                this.d = e;
                if (e == null) {
                    C c = new C(this);
                    this.c = c;
                    this.a.c(B7.b.class, c);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.l(FirebaseMessaging.this).x();
        }

        public final /* synthetic */ void d(i8.a aVar) {
            if (c()) {
                FirebaseMessaging.m(FirebaseMessaging.this);
            }
        }

        public final Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m = FirebaseMessaging.l(FirebaseMessaging.this).m();
            SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void f(boolean z) {
            try {
                b();
                i8.b bVar = this.c;
                if (bVar != null) {
                    this.a.d(B7.b.class, bVar);
                    this.c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.l(FirebaseMessaging.this).m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.m(FirebaseMessaging.this);
                }
                this.d = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(g gVar, k8.a aVar, l8.b bVar, l8.b bVar2, h hVar, l8.b bVar3, i8.d dVar) {
        this(gVar, aVar, bVar, bVar2, hVar, bVar3, dVar, new J(gVar.m()));
    }

    public static /* synthetic */ j K() {
        return null;
    }

    public static /* synthetic */ Task L(String str, c0 c0Var) {
        return c0Var.r(str);
    }

    public static /* synthetic */ Task M(String str, c0 c0Var) {
        return c0Var.u(str);
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, f.a aVar, String str2) {
        return firebaseMessaging.C(str, aVar, str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.H();
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.F(taskCompletionSource);
    }

    public static /* synthetic */ Task d(String str, c0 c0Var) {
        return M(str, c0Var);
    }

    public static /* synthetic */ j e() {
        return K();
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.J();
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, u6.a aVar) {
        firebaseMessaging.G(aVar);
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.k(FirebaseMessaging.class);
            t.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static /* synthetic */ Task h(FirebaseMessaging firebaseMessaging, String str, f.a aVar) {
        return firebaseMessaging.D(str, aVar);
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, c0 c0Var) {
        firebaseMessaging.I(c0Var);
    }

    public static /* synthetic */ Task j(String str, c0 c0Var) {
        return L(str, c0Var);
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.E(taskCompletionSource);
    }

    public static /* synthetic */ g l(FirebaseMessaging firebaseMessaging) {
        return firebaseMessaging.a;
    }

    public static /* synthetic */ void m(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.T();
    }

    public static synchronized FirebaseMessaging r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(g.o());
        }
        return firebaseMessaging;
    }

    public static synchronized f s(Context context) {
        f fVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new f(context);
                }
                fVar = m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static j w() {
        return (j) n.get();
    }

    public boolean A() {
        return this.e.c();
    }

    public boolean B() {
        return this.i.g();
    }

    public final /* synthetic */ Task C(String str, f.a aVar, String str2) {
        s(this.b).g(t(), str, str2, this.i.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            z(str2);
        }
        return Tasks.forResult(str2);
    }

    public final /* synthetic */ Task D(String str, f.a aVar) {
        return this.c.g().onSuccessTask(this.g, new A(this, str, aVar));
    }

    public final /* synthetic */ void E(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.c.c());
            s(this.b).d(t(), J.c(this.a));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void F(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(n());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final /* synthetic */ void G(u6.a aVar) {
        if (aVar != null) {
            b.y(aVar.M1());
            x();
        }
    }

    public final /* synthetic */ void H() {
        if (A()) {
            T();
        }
    }

    public final /* synthetic */ void I(c0 c0Var) {
        if (A()) {
            c0Var.q();
        }
    }

    public void N(d dVar) {
        if (TextUtils.isEmpty(dVar.V1())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.b, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        dVar.X1(intent);
        this.b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void O(boolean z) {
        this.e.f(z);
    }

    public void P(boolean z) {
        b.B(z);
        Q.g(this.b, this.c, R());
    }

    public synchronized void Q(boolean z) {
        this.j = z;
    }

    public final boolean R() {
        O.c(this.b);
        if (!O.d(this.b)) {
            return false;
        }
        if (this.a.k(F7.a.class) != null) {
            return true;
        }
        return b.a() && n != null;
    }

    public final synchronized void S() {
        if (!this.j) {
            V(0L);
        }
    }

    public final void T() {
        if (W(v())) {
            S();
        }
    }

    public Task U(String str) {
        return this.h.onSuccessTask(new z(str));
    }

    public synchronized void V(long j) {
        p(new Y(this, Math.min(Math.max(30L, 2 * j), l)), j);
        this.j = true;
    }

    public boolean W(f.a aVar) {
        return aVar == null || aVar.b(this.i.a());
    }

    public Task X(String str) {
        return this.h.onSuccessTask(new r(str));
    }

    public String n() {
        f.a v = v();
        if (!W(v)) {
            return v.a;
        }
        String c = J.c(this.a);
        try {
            return (String) Tasks.await(this.d.b(c, new y(this, c, v)));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public Task o() {
        if (v() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.e().execute(new s(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void p(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new ScheduledThreadPoolExecutor(1, new F6.b("TAG"));
                }
                o.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context q() {
        return this.b;
    }

    public final String t() {
        return "[DEFAULT]".equals(this.a.q()) ? "" : this.a.s();
    }

    public Task u() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f.execute(new B(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public f.a v() {
        return s(this.b).e(t(), J.c(this.a));
    }

    public final void x() {
        this.c.f().addOnSuccessListener(this.f, new x(this));
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void J() {
        O.c(this.b);
        Q.g(this.b, this.c, R());
        if (R()) {
            x();
        }
    }

    public final void z(String str) {
        if ("[DEFAULT]".equals(this.a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.b).k(intent);
        }
    }

    public FirebaseMessaging(g gVar, k8.a aVar, l8.b bVar, l8.b bVar2, h hVar, l8.b bVar3, i8.d dVar, J j) {
        this(gVar, aVar, bVar3, dVar, j, new F(gVar, j, bVar, bVar2, hVar), n.f(), n.c(), n.b());
    }

    public FirebaseMessaging(g gVar, k8.a aVar, l8.b bVar, i8.d dVar, J j, F f, Executor executor, Executor executor2, Executor executor3) {
        this.j = false;
        n = bVar;
        this.a = gVar;
        this.e = new a(dVar);
        Context m2 = gVar.m();
        this.b = m2;
        p pVar = new p();
        this.k = pVar;
        this.i = j;
        this.c = f;
        this.d = new e(executor);
        this.f = executor2;
        this.g = executor3;
        Application m3 = gVar.m();
        if (m3 instanceof Application) {
            m3.registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + m3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new s8.t(this));
        }
        executor2.execute(new u(this));
        Task f2 = c0.f(this, j, f, m2, n.g());
        this.h = f2;
        f2.addOnSuccessListener(executor2, new v(this));
        executor2.execute(new w(this));
    }
}
