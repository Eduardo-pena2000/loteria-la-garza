package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b1 {
    private final com.applovin.impl.sdk.o a;
    private final Handler b;
    private final Set c = new HashSet();
    private final AtomicInteger d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public static class c {
        private final String a;
        private final b b;
        private final long c;

        public /* synthetic */ c(String str, long j, b bVar, a aVar) {
            this(str, j, bVar);
        }

        public static /* synthetic */ String a(c cVar) {
            return cVar.c();
        }

        public static /* synthetic */ long b(c cVar) {
            return cVar.b();
        }

        public static /* synthetic */ b c(c cVar) {
            return cVar.a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.a;
            String str2 = ((c) obj).a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.a + "', countdownStepMillis=" + this.c + '}';
        }

        private c(String str, long j, b bVar) {
            this.a = str;
            this.c = j;
            this.b = bVar;
        }

        private b a() {
            return this.b;
        }

        private long b() {
            return this.c;
        }

        private String c() {
            return this.a;
        }
    }

    public b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.b = handler;
        this.a = kVar.O();
    }

    public static /* synthetic */ void a(b1 b1Var, c cVar, int i) {
        b1Var.b(cVar, i);
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.c);
        if (com.applovin.impl.sdk.o.a()) {
            this.a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.o.a()) {
                this.a.a("CountdownManager", "Starting countdown: " + c.a(cVar) + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.a.a("CountdownManager", "Stopping countdowns...");
        }
        this.d.incrementAndGet();
        this.b.removeCallbacksAndMessages((Object) null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.c.clear();
    }

    public void a(String str, long j, b bVar) {
        if (j > 0) {
            if (this.b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.c.add(new c(str, j, bVar, null));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    private /* synthetic */ void b(c cVar, int i) {
        b c2 = c.c(cVar);
        if (c2.b()) {
            if (this.d.get() == i) {
                try {
                    c2.a();
                    a(cVar, i);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.a("CountdownManager", "Encountered error on countdown step for: " + c.a(cVar), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + c.a(cVar));
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.a.a("CountdownManager", "Ending countdown for " + c.a(cVar));
        }
    }

    private void a(c cVar, int i) {
        this.b.postDelayed(new N(this, cVar, i), c.b(cVar));
    }
}
