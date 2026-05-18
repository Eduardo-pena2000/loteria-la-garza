package com.amazon.a.a.n.b;

import com.amazon.a.a.c.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements com.amazon.a.a.k.d, c {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("ForegroundTaskPipeline");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a b;

    @com.amazon.a.a.k.a
    private f c;
    private c e;
    private List f = new ArrayList();
    private c d = b.b("KIWI_UI");

    public class 1 implements com.amazon.a.a.c.c {
        public 1() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.MIDDLE;
        }

        public String toString() {
            return "ForegroundTaskPipeline:onResume listener";
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.b.RESUME;
        }

        public void a(com.amazon.a.a.a.a.a aVar) {
            a.a(a.this);
        }
    }

    public class 2 implements com.amazon.a.a.n.a {
        final /* synthetic */ com.amazon.a.a.n.a a;

        public 2(com.amazon.a.a.n.a aVar) {
            this.a = aVar;
        }

        public void a() {
            a.a(a.this, this.a, true);
        }

        public String toString() {
            return "Future:PostToUITask: " + this.a.toString();
        }
    }

    public a(c cVar) {
        this.e = cVar;
    }

    public static /* synthetic */ void a(a aVar) {
        aVar.b();
    }

    private com.amazon.a.a.n.a c(com.amazon.a.a.n.a aVar) {
        return new 2(aVar);
    }

    public void b(com.amazon.a.a.n.a aVar) {
        a(aVar, true);
    }

    public void e() {
        this.c.a(new 1());
    }

    public static /* synthetic */ void a(a aVar, com.amazon.a.a.n.a aVar2, boolean z) {
        aVar.a(aVar2, z);
    }

    private void b() {
        if (com.amazon.a.a.o.c.a) {
            a.a("Activity resumed, scheduling tasks on UI thread");
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            b((com.amazon.a.a.n.a) it.next());
        }
        this.f.clear();
    }

    public void a(com.amazon.a.a.n.a aVar) {
        a(aVar, false);
    }

    private void a(com.amazon.a.a.n.a aVar, boolean z) {
        if (this.b.c()) {
            if (z) {
                this.d.b(aVar);
                return;
            } else {
                this.d.a(aVar);
                return;
            }
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("No UI visible to execute task: " + aVar + ", placing into pending queue until task is visible");
        }
        this.f.add(aVar);
    }

    public void a(com.amazon.a.a.n.a aVar, Date date) {
        this.e.a(c(aVar), date);
    }

    public void a(com.amazon.a.a.n.a aVar, long j) {
        this.e.a(c(aVar), j);
    }

    public void a() {
        this.d.a();
        this.e.a();
        this.f.clear();
    }
}
