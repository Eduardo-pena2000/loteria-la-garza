package za;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import za.f5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d {
    public static final a l = new a(null);
    public final c a;
    public final WeakHashMap b;
    public final HashMap c;
    public final HashMap d;
    public final ReferenceQueue e;
    public final HashMap f;
    public final Handler g;
    public final Runnable h;
    public long i;
    public boolean j;
    public long k;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final d a(c finalizationListener) {
            kotlin.jvm.internal.t.g(finalizationListener, "finalizationListener");
            return new d(finalizationListener);
        }

        public a() {
        }
    }

    public static final class b extends WeakReference {
        public final int a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(Object instance) {
            this(instance, null);
            kotlin.jvm.internal.t.g(instance, "instance");
        }

        public boolean equals(Object obj) {
            Object obj2 = get();
            return obj2 != null ? (obj instanceof b) && ((b) obj).get() == obj2 : obj == this;
        }

        public int hashCode() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object instance, ReferenceQueue referenceQueue) {
            super(instance, referenceQueue);
            kotlin.jvm.internal.t.g(instance, "instance");
            this.a = System.identityHashCode(instance);
        }
    }

    public interface c {
        void a(long j);
    }

    public d(c finalizationListener) {
        kotlin.jvm.internal.t.g(finalizationListener, "finalizationListener");
        this.a = finalizationListener;
        this.b = new WeakHashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ReferenceQueue();
        this.f = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.g = handler;
        za.c cVar = new za.c(this);
        this.h = cVar;
        this.i = 65536L;
        this.k = 3000L;
        handler.postDelayed(cVar, 3000L);
    }

    public static /* synthetic */ void a(d dVar) {
        l(dVar);
    }

    public static final void l(d dVar) {
        dVar.k();
    }

    public final void b(Object instance, long j) {
        kotlin.jvm.internal.t.g(instance, "instance");
        j();
        d(instance, j);
    }

    public final long c(Object instance) {
        kotlin.jvm.internal.t.g(instance, "instance");
        j();
        if (!f(instance)) {
            long j = this.i;
            this.i = 1 + j;
            d(instance, j);
            return j;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void d(Object obj, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j).toString());
        }
        if (this.c.containsKey(Long.valueOf(j))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j).toString());
        }
        b bVar = new b(obj, this.e);
        this.b.put(bVar, Long.valueOf(j));
        this.c.put(Long.valueOf(j), bVar);
        this.f.put(bVar, Long.valueOf(j));
        this.d.put(Long.valueOf(j), obj);
    }

    public final void e() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.f.clear();
    }

    public final boolean f(Object obj) {
        j();
        return obj != null && this.b.containsKey(new b(obj));
    }

    public final Long g(Object obj) {
        j();
        if (obj == null) {
            return null;
        }
        Long l2 = (Long) this.b.get(new b(obj));
        if (l2 != null) {
            this.d.put(l2, obj);
        }
        return l2;
    }

    public final Object h(long j) {
        j();
        b bVar = (b) this.c.get(Long.valueOf(j));
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    public final boolean i() {
        return this.j;
    }

    public final void j() {
        if (i()) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }

    public final void k() {
        if (i()) {
            return;
        }
        while (true) {
            b poll = this.e.poll();
            if (poll == null) {
                this.g.postDelayed(this.h, this.k);
                return;
            }
            Long l2 = (Long) kotlin.jvm.internal.V.d(this.f).remove(poll);
            if (l2 != null) {
                this.c.remove(l2);
                this.d.remove(l2);
                this.a.a(l2.longValue());
            }
        }
    }

    public final Object m(long j) {
        j();
        Object h = h(j);
        if (h instanceof f5.a) {
            ((f5.a) h).destroy();
        }
        return this.d.remove(Long.valueOf(j));
    }

    public final void n() {
        this.g.removeCallbacks(this.h);
        this.j = true;
    }
}
