package com.amazon.a.b;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    private final Map a = new HashMap();

    public class 1 implements c {
        final /* synthetic */ com.amazon.a.a.i.c a;

        public 1(com.amazon.a.a.i.c cVar) {
            this.a = cVar;
        }

        public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
            return this.a;
        }
    }

    public static final class a implements c {
        final Map a;

        public class 1 extends HashMap {
            public 1() {
                put("NO_INTERNET", e.d);
                put("INVALID_CONTENT_ID", e.e);
                put("INTERNAL_SERVICE_ERROR", e.f);
            }
        }

        private a() {
            this.a = new 1();
        }

        public com.amazon.a.a.i.c a(com.amazon.a.a.n.a.a.f fVar) {
            com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.a.get(fVar.b());
            return cVar != null ? cVar : e.e;
        }

        public /* synthetic */ a(1 r1) {
            this();
        }
    }

    public static final class b implements c {
        private b() {
        }

        public /* synthetic */ b(1 r1) {
            this();
        }

        public com.amazon.a.a.i.c a(com.amazon.a.b.a.a aVar) {
            return aVar.d().a(h.a) ? e.d : e.e;
        }
    }

    public interface c {
        com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar);
    }

    public f() {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            a(com.amazon.a.a.n.a.a.c.class, e.b);
        } else {
            a(com.amazon.a.a.n.a.a.c.class, e.a);
        }
        com.amazon.a.a.i.c cVar = e.b;
        a(com.amazon.a.a.n.a.a.b.class, cVar);
        a(com.amazon.a.a.n.a.a.d.class, cVar);
        a(com.amazon.a.a.n.a.a.a.class, e.c);
        a(com.amazon.a.a.n.a.a.f.class, new a(null));
        com.amazon.a.a.i.c cVar2 = e.e;
        a(com.amazon.a.a.n.a.a.g.class, cVar2);
        a(com.amazon.a.a.n.a.a.h.class, cVar2);
        a(com.amazon.a.b.a.a.class, new b(null));
        a(com.amazon.a.a.o.b.a.a.class, e.g);
        a(com.amazon.a.a.o.b.a.b.class, cVar2);
        a(com.amazon.a.a.o.b.a.c.class, cVar2);
    }

    private void a(Class cls, com.amazon.a.a.i.c cVar) {
        a(cls, new 1(cVar));
    }

    private void a(Class cls, c cVar) {
        com.amazon.a.a.o.a.a.b(this.a.containsKey(cls), "mapping exists for type: " + cls);
        this.a.put(cls, cVar);
    }

    public com.amazon.a.a.i.c a(com.amazon.a.a.d.b bVar) {
        c cVar = (c) this.a.get(bVar.getClass());
        if (cVar == null) {
            return null;
        }
        return cVar.a(bVar);
    }
}
