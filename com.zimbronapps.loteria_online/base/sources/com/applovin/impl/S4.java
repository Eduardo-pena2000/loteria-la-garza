package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s4 {
    public static final Executor i = new O4();
    public static final Executor j = new c4.k();
    private final String b;
    private volatile Object g;
    private volatile Object h;
    private final Object a = new Object();
    private final List c = new ArrayList();
    private volatile boolean d = false;
    private volatile boolean e = false;
    private volatile boolean f = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z, Object obj, Object obj2);
    }

    public s4(String str) {
        this.b = str;
    }

    public static s4 a(String str, Object obj) {
        return new s4(str).b(obj);
    }

    public static /* synthetic */ void b(a aVar, boolean z, Object obj, Object obj2) {
        a(aVar, z, obj, obj2);
    }

    public static /* synthetic */ void c(Runnable runnable, boolean z, Object obj, Object obj2) {
        a(runnable, z, obj, obj2);
    }

    public static /* synthetic */ void d(s4 s4Var, b bVar) {
        s4Var.a(bVar);
    }

    public static /* synthetic */ void e(s4 s4Var, Executor executor, b bVar) {
        s4Var.b(executor, bVar);
    }

    public String toString() {
        String str;
        if (!this.d) {
            str = "Waiting";
        } else if (this.e) {
            str = "Success -> " + this.g;
        } else {
            str = "Failed -> " + this.h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public s4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public s4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public s4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.d && !this.e;
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new N4(runnable));
    }

    public Object b() {
        l1.a(e());
        return this.h;
    }

    public String c() {
        String str = this.b;
        return str != null ? str : super.toString();
    }

    private static /* synthetic */ void a(Runnable runnable, boolean z, Object obj, Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    private Runnable c(Executor executor, b bVar) {
        return new M4(this, executor, bVar);
    }

    private /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new L4(this, bVar));
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new K4(aVar));
    }

    private static /* synthetic */ void a(a aVar, boolean z, Object obj, Object obj2) {
        if (z) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable c = c(executor, bVar);
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.add(c);
                } else {
                    c.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        return this.d && this.f;
    }

    private void a(boolean z, Object obj, Object obj2, boolean z2) {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                this.g = obj;
                this.h = obj2;
                this.e = z;
                this.f = z2;
                this.d = true;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.e, this.g, this.h);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        l1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + c(), th);
        }
    }
}
