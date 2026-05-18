package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements d, b {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");
    private static final Random b = new Random();
    private static final int c = 65535;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b d;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a e;

    @com.amazon.a.a.k.a
    private f f;
    private AtomicReference g = new AtomicReference();
    private BlockingQueue h = new LinkedBlockingQueue();

    public class 1 implements com.amazon.a.a.c.c {
        public 1() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.MIDDLE;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.b.RESUME;
        }

        public void a(com.amazon.a.a.a.a.a aVar) {
            a aVar2 = (a) c.a(c.this).get();
            if (aVar2 != null) {
                aVar2.b(aVar.b());
            }
        }
    }

    public class 2 implements com.amazon.a.a.n.a {
        final /* synthetic */ a a;

        public 2(a aVar) {
            this.a = aVar;
        }

        public void a() {
            Activity b = c.b(c.this).b();
            if (b == null) {
                c.a().a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
            } else {
                this.a.a(b);
            }
        }
    }

    public static /* synthetic */ com.amazon.a.a.o.c a() {
        return a;
    }

    public static /* synthetic */ com.amazon.a.a.a.a b(c cVar) {
        return cVar.e;
    }

    public void e() {
        this.f.a(new 1());
    }

    public static /* synthetic */ AtomicReference a(c cVar) {
        return cVar.g;
    }

    private int b() {
        return b.nextInt(65535) + 1;
    }

    public static final class a {
        private final Intent a;
        private final int b;
        private Activity c;

        public a(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public void a(Activity activity) {
            c.a().a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.a, this.b);
            this.c = activity;
        }

        public void b(Activity activity) {
            c.a().b("Context changed while awaiting result!");
            if (this.c != null) {
                c.a().b("Finishing activity from old context: " + this.c);
                this.c.finishActivity(this.b);
            }
            a(activity);
        }

        public int a() {
            return this.b;
        }
    }

    public com.amazon.a.a.l.a a(Intent intent) {
        a aVar = new a(intent, b());
        if (!Y.a(this.g, null, aVar)) {
            a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        com.amazon.a.a.o.c cVar = a;
        cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
        this.d.b(com.amazon.a.a.n.b.d.a, new 2(aVar));
        try {
            try {
                cVar.a("Blocking for request: " + aVar.a());
                com.amazon.a.a.l.a aVar2 = (com.amazon.a.a.l.a) this.h.take();
                cVar.a("Received Response: " + aVar.a());
                this.g.set((Object) null);
                return aVar2;
            } catch (InterruptedException unused) {
                com.amazon.a.a.o.c cVar2 = a;
                cVar2.a("Interrupted while awaiting for request, returning null");
                cVar2.a("Received Response: " + aVar.a());
                this.g.set((Object) null);
                return null;
            }
        } catch (Throwable th) {
            a.a("Received Response: " + aVar.a());
            this.g.set((Object) null);
            throw th;
        }
    }

    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = (a) this.g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.a) {
                a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.a) {
                a.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.h.add(aVar);
        return true;
    }
}
