package com.amazon.a.a.n;

import com.amazon.a.a.c.f;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements com.amazon.a.a.k.d, b {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("TaskManagerImpl");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b b;

    @com.amazon.a.a.k.a
    private f c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Map e;

    public class 1 implements a {
        public 1() {
        }

        public void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar) {
            cVar.a(aVar);
        }
    }

    public class 2 implements a {
        public 2() {
        }

        public void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar) {
            cVar.b(aVar);
        }
    }

    public class 3 implements a {
        final /* synthetic */ Date a;

        public 3(Date date) {
            this.a = date;
        }

        public void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar) {
            cVar.a(aVar, this.a);
        }
    }

    public class 4 implements a {
        final /* synthetic */ long a;

        public 4(long j) {
            this.a = j;
        }

        public void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar) {
            cVar.a(aVar, this.a);
        }
    }

    public class 5 implements com.amazon.a.a.c.c {
        public 5() {
        }

        public com.amazon.a.a.c.d b() {
            return com.amazon.a.a.c.d.MIDDLE;
        }

        public com.amazon.a.a.c.b a() {
            return com.amazon.a.a.a.a.d.DESTROY;
        }

        public void a(com.amazon.a.a.a.a.c cVar) {
            d.this.a();
        }
    }

    public interface a {
        void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar);
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        com.amazon.a.a.n.b.d dVar = com.amazon.a.a.n.b.d.COMMAND;
        com.amazon.a.a.n.b.b a2 = com.amazon.a.a.n.b.b.a(dVar.name());
        com.amazon.a.a.n.b.d dVar2 = com.amazon.a.a.n.b.d.BACKGROUND;
        com.amazon.a.a.n.b.b a3 = com.amazon.a.a.n.b.b.a(dVar2.name());
        com.amazon.a.a.n.b.a aVar = new com.amazon.a.a.n.b.a(a3);
        hashMap.put(dVar, a2);
        hashMap.put(dVar2, a3);
        hashMap.put(com.amazon.a.a.n.b.d.FOREGROUND, aVar);
    }

    private void c() {
        this.c.a(new 5());
    }

    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Enqueue task on pipeline id: " + dVar);
        }
        a(dVar, aVar, new 1());
    }

    public void b(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        a(dVar, aVar, new 2());
    }

    public void e() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            this.b.b((com.amazon.a.a.n.b.c) it.next());
        }
        c();
    }

    private boolean b() {
        return this.d.get();
    }

    private void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, a aVar2) {
        if (b()) {
            if (com.amazon.a.a.o.c.b) {
                a.b("Task enqueued after TaskManager has been finished! Task: " + aVar);
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.a) {
            a.a("Populating Task: " + aVar);
        }
        this.b.b(aVar);
        aVar2.a(aVar, a(dVar));
    }

    private com.amazon.a.a.n.b.c a(com.amazon.a.a.n.b.d dVar) {
        com.amazon.a.a.n.b.c cVar = (com.amazon.a.a.n.b.c) this.e.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No pipeline registered with id: " + dVar);
    }

    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, Date date) {
        a(dVar, aVar, new 3(date));
    }

    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, long j) {
        a(dVar, aVar, new 4(j));
    }

    public void a() {
        if (this.d.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.a) {
                a.a("TaskManager finishing....");
            }
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                ((com.amazon.a.a.n.b.c) it.next()).a();
            }
        }
    }
}
