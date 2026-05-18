package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f implements e, com.amazon.a.a.k.d {
    public static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("PromptManagerImpl");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a b;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f c;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b d;

    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b e;
    private b f;
    private Set g = new LinkedHashSet();
    private final AtomicBoolean h = new AtomicBoolean(false);

    public class 1 implements com.amazon.a.a.n.a {
        final /* synthetic */ b a;

        public 1(b bVar) {
            this.a = bVar;
        }

        public void a() {
            f.a(f.this, this.a);
        }

        public String toString() {
            return "Prompt Presentation on Main Thread: " + this.a + ", " + this.a.a();
        }
    }

    public class 2 implements com.amazon.a.a.n.a {
        final /* synthetic */ b a;

        public 2(b bVar) {
            this.a = bVar;
        }

        public void a() {
            f.b(f.this, this.a);
        }

        public String toString() {
            return "PromptManager:removeExpiredPrompt: " + this.a;
        }
    }

    public class 3 implements com.amazon.a.a.c.c {
        public 3() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.MIDDLE;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.b.RESUME;
        }

        public void a(com.amazon.a.a.a.a.a aVar) {
            f.a(f.this, aVar.b());
        }
    }

    public class 4 implements com.amazon.a.a.c.c {
        public 4() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.FIRST;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.d.DESTROY;
        }

        public void a(com.amazon.a.a.a.a.c cVar) {
            f.a(f.this);
        }
    }

    public static /* synthetic */ void b(f fVar, b bVar) {
        fVar.d(bVar);
    }

    private void c(b bVar) {
        if (this.h.get()) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.g.add(bVar);
        if (this.f != null) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Dialog currently showing, not presenting given dialog");
            }
        } else {
            Activity b = this.b.b();
            if (b != null) {
                a(b);
            }
        }
    }

    private void d(b bVar) {
        this.g.remove(bVar);
        if (this.f == bVar) {
            this.f = null;
            Activity b = this.b.b();
            if (b != null) {
                a(b);
            }
        }
    }

    public void e() {
        b();
        c();
    }

    public static /* synthetic */ void a(f fVar) {
        fVar.d();
    }

    private void b(Activity activity) {
        b bVar = this.f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    public static /* synthetic */ void a(f fVar, Activity activity) {
        fVar.b(activity);
    }

    public static /* synthetic */ void a(f fVar, b bVar) {
        fVar.c(bVar);
    }

    public void a(b bVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Scheduling presentation: " + bVar);
        }
        this.e.b(bVar);
        if (this.h.get()) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        this.d.a(com.amazon.a.a.n.b.d.a, new 1(bVar));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(b bVar) {
        this.d.a(com.amazon.a.a.n.b.d.a, new 2(bVar));
    }

    private void d() {
        if (this.h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.a) {
                a.a("PromptManager finishing....");
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                it.remove();
                bVar.c();
            }
            b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.k();
            }
        }
    }

    private void b() {
        this.c.a(new 3());
    }

    private void a(Activity activity) {
        b a2 = a();
        if (a2 == null) {
            return;
        }
        a(a2, activity);
    }

    private void c() {
        this.c.a(new 4());
    }

    private b a() {
        if (this.g.isEmpty()) {
            return null;
        }
        return (b) this.g.iterator().next();
    }

    private void a(b bVar, Activity activity) {
        this.f = bVar;
        bVar.a(activity);
    }

    public Dialog a(Activity activity, int i) {
        if (com.amazon.a.a.o.c.a) {
            a.a("onCreateDialog, id: " + i + ", activity: " + activity);
        }
        b bVar = this.f;
        if (bVar == null) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Showing dialog is null, returning");
            }
            return null;
        }
        if (bVar.j() != i) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Showing dialog id does not match given id: " + i + ", returning");
            }
            return null;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Creating dialog prompt: " + this.f);
        }
        return this.f.c(activity);
    }

    public void a(Activity activity, boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(activity, z);
        }
    }
}
