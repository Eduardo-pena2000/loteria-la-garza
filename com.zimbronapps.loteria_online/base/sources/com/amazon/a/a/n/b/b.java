package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements c {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("SimpleTaskPipeline");
    private final Handler b;
    private final Set c;
    private final String d;

    public class 1 implements Runnable {
        final /* synthetic */ com.amazon.a.a.n.a a;

        public 1(com.amazon.a.a.n.a aVar) {
            this.a = aVar;
        }

        public void run() {
            com.amazon.a.a.o.c b;
            StringBuilder sb;
            b.a(b.this).remove(this);
            try {
                if (com.amazon.a.a.o.c.a) {
                    b.b().a(b.b(b.this) + ": Executing Task: " + this.a + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                }
                this.a.a();
            } catch (Throwable th) {
                try {
                    if (com.amazon.a.a.o.c.b) {
                        b.b().b("Task Failed with unhandled exception: " + th, th);
                    }
                    if (!com.amazon.a.a.o.c.a) {
                        return;
                    }
                    b = b.b();
                    sb = new StringBuilder();
                } catch (Throwable th2) {
                    if (com.amazon.a.a.o.c.a) {
                        b.b().a(b.b(b.this) + ": Task finished executing: " + this.a);
                    }
                    throw th2;
                }
            }
            if (com.amazon.a.a.o.c.a) {
                b = b.b();
                sb = new StringBuilder();
                sb.append(b.b(b.this));
                sb.append(": Task finished executing: ");
                sb.append(this.a);
                b.a(sb.toString());
            }
        }

        public String toString() {
            return this.a.toString();
        }
    }

    private b(HandlerThread handlerThread) {
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = handlerThread.getName();
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ Set a(b bVar) {
        return bVar.c;
    }

    public static /* synthetic */ com.amazon.a.a.o.c b() {
        return a;
    }

    private Runnable c(com.amazon.a.a.n.a aVar) {
        1 r0 = new 1(aVar);
        this.c.add(r0);
        return r0;
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static /* synthetic */ String b(b bVar) {
        return bVar.d;
    }

    public static b b(String str) {
        return new b(str);
    }

    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Scheduling task: " + aVar);
        }
        this.b.post(c(aVar));
    }

    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a(this.d + ": Scheduling task immediately: " + aVar);
        }
        this.b.postAtFrontOfQueue(c(aVar));
    }

    private b(String str) {
        this.c = Collections.synchronizedSet(new HashSet());
        this.d = str;
        this.b = new Handler();
    }

    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long a2 = a(date);
        if (com.amazon.a.a.o.c.a) {
            a.a(this.d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + a2);
        }
        this.b.postAtTime(c(aVar), a2);
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    public void a(com.amazon.a.a.n.a aVar, long j) {
        if (com.amazon.a.a.o.c.a) {
            a.a(this.d + ": Scheduling task: " + aVar + ", with delay: " + j);
        }
        this.b.postDelayed(c(aVar), j);
    }

    public void a() {
        for (Runnable runnable : this.c) {
            if (com.amazon.a.a.o.c.a) {
                a.a(this.d + ": Removing callback: " + runnable);
            }
            this.b.removeCallbacks(runnable);
        }
        this.c.clear();
        if (this.b.getLooper() == Looper.getMainLooper() || !this.b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = a;
        cVar.a("Interrupting looper thread!");
        this.b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.b.getLooper().getThread() + ", " + this.b.getLooper().getThread().isAlive());
        this.b.getLooper().quit();
    }
}
