package com.amazon.a;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements com.amazon.a.a.k.d {
    protected static final String a = "ActivityName";
    protected static final String b = "EventName";
    protected static final String c = "Timestamp";
    private static final com.amazon.a.a.o.c d = new com.amazon.a.a.o.c("AppstoreSDK");
    private static final com.amazon.a.a.g.c e = new com.amazon.a.a.g.a();
    private static a f;

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

    @com.amazon.a.a.k.a
    private com.amazon.a.a.g.c o;

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
                a.k().a("Adding lifecycle PAUSE command to pipeline");
            }
            a.b(bVar);
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
                a.k().a("Adding lifecycle RESUME command to pipeline");
            }
            a.b(bVar);
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
            a.this.i();
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
                a.k().a("Beginning shutdown process for application: " + a.a(a.this).getPackageName());
            }
            a.b((a) null);
        }
    }

    private a(Application application) {
        long currentTimeMillis = System.currentTimeMillis();
        if (com.amazon.a.a.o.c.a) {
            d.a("Starting initialization process for application: " + application.getPackageName());
        }
        b(application);
        if (com.amazon.a.a.o.c.a) {
            long currentTimeMillis2 = System.currentTimeMillis();
            d.a("AppstoreSDK.Constructor Time: " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static /* synthetic */ Application a(a aVar) {
        return aVar.m;
    }

    public static /* synthetic */ a b(a aVar) {
        f = aVar;
        return aVar;
    }

    private static void c(com.amazon.a.a.n.a.a aVar) {
        if (d()) {
            f.j.a(com.amazon.a.a.n.b.d.b, aVar);
        } else {
            d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static boolean d() {
        return f != null;
    }

    public static /* synthetic */ com.amazon.a.a.o.c k() {
        return d;
    }

    private static boolean l() {
        String a2;
        try {
            a2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"debug.amazon.sandboxmode"});
        } catch (Throwable unused) {
            d.b("Unable to retrieve Sandbox property through reflection, using getProp");
            a2 = a("debug.amazon.sandboxmode");
        }
        return "debug".equals(a2);
    }

    private com.amazon.a.a.n.a m() {
        return new e();
    }

    public void e() {
        h();
        j();
        f();
        g();
    }

    public void f() {
        this.i.a(new 1());
    }

    public void g() {
        this.i.a(new 2());
    }

    public void h() {
        this.i.a(new 3());
    }

    public void i() {
        if (com.amazon.a.a.o.c.a) {
            d.a("Enqueuing launch workflow");
        }
        if (a(this.m)) {
            return;
        }
        this.j.a(com.amazon.a.a.n.b.d.b, m());
    }

    public void j() {
        this.i.a(new 4());
    }

    public static void a(Context context) {
        if (d()) {
            return;
        }
        synchronized (a.class) {
            try {
                if (!d()) {
                    Application applicationContext = context.getApplicationContext();
                    f = new a(applicationContext);
                    applicationContext.registerActivityLifecycleCallbacks(com.amazon.a.a.f.a.a());
                }
            } finally {
            }
        }
    }

    public static /* synthetic */ void b(com.amazon.a.a.n.a.a aVar) {
        c(aVar);
    }

    private void b(Application application) {
        Object bVar;
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.c());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.d());
        cVar.a(new com.amazon.a.a.n.a.b());
        if (a(application)) {
            bVar = new com.amazon.a.a.g.d();
        } else {
            bVar = new com.amazon.a.a.g.b();
        }
        cVar.a(bVar);
        cVar.a();
        cVar.b(this);
    }

    public static com.amazon.a.a.g.c c() {
        if (!d()) {
            d.a("Appstore SDK is not initialized. Returning default log handler");
            return e;
        }
        return f.o;
    }

    public static boolean a(Application application) {
        boolean z = (application.getApplicationInfo().flags & 2) != 0;
        boolean l = l();
        if (z && l) {
            d.a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
            return true;
        }
        d.a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
        return false;
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (Exception unused) {
                d.b("Unable to close BufferedReader instance");
            }
            return readLine;
        } catch (IOException e3) {
            e = e3;
            bufferedReader2 = bufferedReader;
            d.a("Can't get system property", e);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    return "";
                } catch (Exception unused2) {
                    d.b("Unable to close BufferedReader instance");
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (Exception unused3) {
                    d.b("Unable to close BufferedReader instance");
                }
            }
            throw th;
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            d.a("WARNING: Use of deprecated method detected.");
        }
        if (d()) {
            c(aVar);
        } else {
            d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!d()) {
            if (context != null && context.getApplicationContext() != null) {
                f = new a(context.getApplicationContext());
            } else {
                d.b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        c(aVar);
    }

    public static com.amazon.a.a.a.a b() {
        if (!d()) {
            d.b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
            return null;
        }
        return f.g;
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.a) {
            d.a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    public static com.amazon.a.a.i.e a() {
        if (!d()) {
            d.b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
            return null;
        }
        return f.k;
    }

    public static boolean a(String str, String str2) {
        if (d()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f.n.a());
            } catch (com.amazon.a.a.o.b.a.a e2) {
                d.a("Unable to validate signature: " + e2.getMessage());
                return false;
            }
        }
        d.a("AppstoreSDK was not yet initialized - cannot do the IAP call");
        return false;
    }

    public static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.a) {
            d.a(str + ": " + context);
        }
        if (d()) {
            return true;
        }
        b(str, context);
        return false;
    }
}
