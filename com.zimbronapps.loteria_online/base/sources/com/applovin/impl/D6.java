package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d6 {
    private static final ExecutorService r = Executors.newFixedThreadPool(4);
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final ScheduledThreadPoolExecutor c;
    private final ScheduledThreadPoolExecutor d;
    private final ScheduledThreadPoolExecutor e;
    private final ScheduledThreadPoolExecutor f;
    private final ScheduledThreadPoolExecutor g;
    private final ScheduledThreadPoolExecutor h;
    private final ScheduledThreadPoolExecutor i;
    private ExecutorService k;
    private ExecutorService l;
    private boolean o;
    private boolean p;
    private final boolean q;
    private final Map j = new HashMap();
    private final List m = new ArrayList(5);
    private final Object n = new Object();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public static class c extends e {
        private final long f;

        public c(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar, long j) {
            super(kVar, i5Var, bVar);
            this.f = j;
        }

        public static /* synthetic */ long a(c cVar) {
            return cVar.f;
        }
    }

    public class d implements ThreadFactory {
        private final String a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                d6.b(d6.this);
                if (com.applovin.impl.sdk.o.a()) {
                    d6.b(d6.this).a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public d(String str) {
            this.a = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) d6.a(d6.this).a(x4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class e implements Runnable {
        private final com.applovin.impl.sdk.k a;
        private final String b;
        private final com.applovin.impl.sdk.o c;
        protected final i5 d;
        protected final b e;

        public e(com.applovin.impl.sdk.k kVar, i5 i5Var, b bVar) {
            this.a = kVar;
            this.c = kVar.O();
            this.b = i5Var.c();
            this.d = i5Var;
            this.e = bVar;
        }

        public void run() {
            try {
                o0.a();
                if (!this.a.E0() || this.d.d()) {
                    ScheduledFuture b = this.d.b(Thread.currentThread(), ((Long) this.a.a(x4.v)).longValue());
                    this.d.run();
                    if (b != null) {
                        b.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.d(this.b, "Task re-scheduled...");
                    }
                    this.a.q0().a(this.d, this.e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Task failed execution", th);
                    }
                    this.d.a(th);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.d(this.b, this.e + " queue finished task " + this.d.c());
                    }
                }
            }
        }
    }

    public d6(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.p = ((Boolean) kVar.a(x4.T)).booleanValue();
        this.q = ((Boolean) kVar.a(x4.S6)).booleanValue();
        this.c = b("auxiliary_operations", ((Integer) kVar.a(x4.O)).intValue());
        this.d = b("shared_thread_pool", ((Integer) kVar.a(x4.N)).intValue());
        this.e = b("core", ((Integer) kVar.a(x4.U)).intValue());
        this.g = b("caching", ((Integer) kVar.a(x4.V)).intValue());
        this.h = b("mediation", ((Integer) kVar.a(x4.W)).intValue());
        this.f = b("timeout", ((Integer) kVar.a(x4.X)).intValue());
        this.i = b("other", ((Integer) kVar.a(x4.Y)).intValue());
        if (((Boolean) kVar.a(x4.I0)).booleanValue() && ((Boolean) kVar.a(x4.J0)).booleanValue()) {
            this.k = Executors.newFixedThreadPool(((Integer) kVar.a(x4.K0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.l = Executors.newFixedThreadPool(((Integer) kVar.a(x4.L0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public static /* synthetic */ void a(d6 d6Var, String str, Runnable runnable) {
        d6Var.a(str, runnable);
    }

    public static /* synthetic */ void b(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, e eVar) {
        a(scheduledThreadPoolExecutor, eVar);
    }

    public Executor c() {
        return this.p ? this.e : this.d;
    }

    public ExecutorService d() {
        return this.l;
    }

    public boolean e() {
        return (a() == null || d() == null) ? false : true;
    }

    public boolean f() {
        return this.o;
    }

    public void g() {
        synchronized (this.n) {
            try {
                this.o = true;
                for (e eVar : this.m) {
                    if (this.q) {
                        c cVar = (c) eVar;
                        a(cVar.d, cVar.e, c.a(cVar));
                    } else {
                        a(eVar.d, eVar.e);
                    }
                }
                this.m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.n) {
            this.o = false;
        }
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(d6 d6Var) {
        return d6Var.a;
    }

    public static /* synthetic */ com.applovin.impl.sdk.o b(d6 d6Var) {
        return d6Var.b;
    }

    public ExecutorService a() {
        return this.k;
    }

    public ScheduledFuture b(i5 i5Var, b bVar, long j) {
        if (this.p) {
            return a(new e(this.a, i5Var, bVar)).schedule(i5Var, j, TimeUnit.MILLISECONDS);
        }
        return this.c.schedule(i5Var, j, TimeUnit.MILLISECONDS);
    }

    public void a(i5 i5Var, b bVar) {
        a(i5Var, bVar, 0L);
    }

    public void a(i5 i5Var, b bVar, long j) {
        a(i5Var, bVar, j, false);
    }

    public void a(i5 i5Var, b bVar, long j, boolean z) {
        e eVar;
        if (i5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            if (this.q) {
                eVar = new c(this.a, i5Var, bVar, j);
            } else {
                eVar = new e(this.a, i5Var, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j, z);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.d(i5Var.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
    }

    public ExecutorService b() {
        return this.p ? this.g : r;
    }

    private boolean b(e eVar) {
        if (eVar.d.d()) {
            return false;
        }
        synchronized (this.n) {
            try {
                if (this.o) {
                    return false;
                }
                this.m.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.p) {
            com.applovin.impl.sdk.k kVar = this.a;
            e eVar = new e(kVar, new r6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new d(str));
    }

    public Executor a(String str) {
        return new B0(this, str);
    }

    private /* synthetic */ void a(String str, Runnable runnable) {
        a(new r6(this.a, str, runnable));
    }

    public void a(i5 i5Var) {
        if (i5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.p ? this.e : this.d;
            try {
                if (n7.i()) {
                    scheduledThreadPoolExecutor.submit(new e(this.a, i5Var, b.CORE));
                    return;
                }
                ScheduledFuture b2 = i5Var.b(Thread.currentThread(), ((Long) this.a.a(x4.v)).longValue());
                i5Var.run();
                if (b2 != null) {
                    b2.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.a(i5Var.c(), "Task failed execution", th);
                }
                i5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(i5 i5Var, k3 k3Var) {
        String b2 = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.j.get(b2);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b2, 1);
            this.j.put(b2, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new e(this.a, i5Var, b.MEDIATION));
    }

    private void a(e eVar, long j, boolean z) {
        ScheduledThreadPoolExecutor a2 = this.p ? a(eVar) : this.d;
        if (j <= 0) {
            a2.submit(eVar);
        } else if (z) {
            g0.a(j, this.a, new A0(a2, eVar));
        } else {
            a2.schedule(eVar, j, TimeUnit.MILLISECONDS);
        }
    }

    private static /* synthetic */ void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, e eVar) {
        scheduledThreadPoolExecutor.execute(eVar);
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i = a.a[eVar.e.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f;
    }

    public ExecutorService a(String str, int i) {
        return Executors.newFixedThreadPool(i, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
