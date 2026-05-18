package com.amazon.a;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements com.amazon.a.a.k.d {
    protected static final String a = "ActivityName";
    protected static final String b = "EventName";
    protected static final String c = "Timestamp";
    private static final com.amazon.a.a.o.c d = new com.amazon.a.a.o.c("Kiwi");
    private static g e;
    private final boolean f;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a g;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b h;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f i;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b j;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e k;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c l;

    @com.amazon.a.a.k.a
    private Application m;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b n;

    public class 1 implements com.amazon.a.a.c.c {
        public 1() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.b;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.b.d;
        }

        public void a(com.amazon.a.a.a.a.a aVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("EventName", com.amazon.a.a.a.a.b.d.name());
            hashMap.put("ActivityName", aVar.b().getClass().getName());
            hashMap.put("Timestamp", Long.valueOf(System.currentTimeMillis()));
            com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
            if (com.amazon.a.a.o.c.a) {
                g.b().a("Adding lifecycle PAUSE command to pipeline");
            }
            g.b(bVar);
        }
    }

    public class 2 implements com.amazon.a.a.c.c {
        public 2() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.b;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.b.c;
        }

        public void a(com.amazon.a.a.a.a.a aVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("EventName", com.amazon.a.a.a.a.b.c.name());
            hashMap.put("ActivityName", aVar.b().getClass().getName());
            hashMap.put("Timestamp", Long.valueOf(System.currentTimeMillis()));
            com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(hashMap);
            if (com.amazon.a.a.o.c.a) {
                g.b().a("Adding lifecycle RESUME command to pipeline");
            }
            g.b(bVar);
        }
    }

    public class 3 implements com.amazon.a.a.c.c {
        public 3() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.c;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.d.a;
        }

        public void a(com.amazon.a.a.a.a.c cVar) {
            g.a(g.this);
        }
    }

    public class 4 implements com.amazon.a.a.c.c {
        public 4() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.c;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.d.b;
        }

        public void a(com.amazon.a.a.a.a.c cVar) {
            if (com.amazon.a.a.o.c.a) {
                g.b().a("Beginning shutdown process for application: " + g.b(g.this).getPackageName());
            }
            g.c((g) null);
        }
    }

    private g(Application application, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f = z;
        if (com.amazon.a.a.o.c.a) {
            com.amazon.a.a.o.c cVar = d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
            cVar.a("DRM enabled: " + z);
        }
        a(application);
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static /* synthetic */ void a(g gVar) {
        gVar.h();
    }

    public static /* synthetic */ Application b(g gVar) {
        return gVar.m;
    }

    public static /* synthetic */ g c(g gVar) {
        e = gVar;
        return gVar;
    }

    public static void d(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStart", (Context) activity)) {
            e.g.e(activity);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnStart Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void e(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onStop", (Context) activity)) {
            e.g.f(activity);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnStop Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void f() {
        this.i.a(new 2());
    }

    private void g() {
        this.i.a(new 3());
    }

    private void h() {
        if (com.amazon.a.a.o.c.a) {
            d.a("Enqueuing launch workflow");
        }
        this.j.a(com.amazon.a.a.n.b.d.b, i());
    }

    private com.amazon.a.a.n.a i() {
        return this.f ? new f() : new e();
    }

    private void j() {
        this.i.a(new 4());
    }

    private void a(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.b());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.c());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a();
        cVar.b(this);
    }

    public static /* synthetic */ com.amazon.a.a.o.c b() {
        return d;
    }

    private static void c(com.amazon.a.a.n.a.a aVar) {
        e.j.a(com.amazon.a.a.n.b.d.b, aVar);
    }

    public static /* synthetic */ void b(com.amazon.a.a.n.a.a aVar) {
        c(aVar);
    }

    private static boolean c() {
        return e != null;
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.a) {
            d.a(str + " called on context: " + context + " when Kiwi is dead, ignoring...");
        }
    }

    public static void c(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", (Context) activity)) {
            try {
                e.g.b(activity);
            } catch (Exception e2) {
                d.b("Kiwi.ActivityOnDestroy Error: ", e2);
            }
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void b(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onPause", (Context) activity)) {
            e.g.d(activity);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnPause Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    private void d() {
        this.i.a(new 1());
    }

    public void e() {
        g();
        j();
        d();
        f();
    }

    public static void b(Activity activity, boolean z) {
        if (a("onWindowFocusChanged", (Context) activity)) {
            e.k.a(activity, z);
        }
    }

    public static void a(Activity activity, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!c()) {
            e = new g(activity.getApplication(), z);
        }
        if (a("onCreate", (Context) activity)) {
            e.g.a(activity);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            d.a("WARNING: Use of deprecated method detected.");
        }
        if (c()) {
            c(aVar);
        } else {
            d.b("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!c()) {
            if (context != null && context.getApplicationContext() != null) {
                e = new g(context.getApplicationContext(), false);
            } else {
                d.b("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        c(aVar);
    }

    public static com.amazon.a.a.i.e a() {
        return e.k;
    }

    public static boolean a(String str, String str2) {
        if (c()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, e.n.a());
            } catch (com.amazon.a.a.o.b.a.a e2) {
                d.a("Unable to validate signature: " + e2.getMessage());
                return false;
            }
        }
        d.a("Kiwi was not yet initialized - cannot do the IAP call");
        return false;
    }

    private static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.a) {
            d.a(str + ": " + context);
        }
        if (c()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static void a(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onResume", (Context) activity)) {
            e.g.c(activity);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ActivityOnResume Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static Dialog a(Activity activity, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreateDialog", (Context) activity)) {
            return e.k.a(activity, i);
        }
        if (!com.amazon.a.a.o.c.a) {
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        d.a("Kiwi.ActivityOnCreateDialog Time: " + (currentTimeMillis2 - currentTimeMillis));
        return null;
    }

    public static boolean a(Activity activity, int i, int i2, Intent intent) {
        if (!a("onActivityResult", (Context) activity)) {
            return false;
        }
        return e.h.a(new com.amazon.a.a.l.a(activity, i, i2, intent));
    }

    public static void a(Service service, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onCreate", (Context) service)) {
            e.g.a(service);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ServiceOnCreate Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static void a(Service service) {
        long currentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", (Context) service)) {
            e.g.b(service);
        }
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("Kiwi.ServiceOnDestroy Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }
}
