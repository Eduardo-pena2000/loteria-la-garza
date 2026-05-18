package androidx.window.layout.adapter.sidecar;

import Ca.I;
import Da.v;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements B4.a {
    public static volatile b d;
    public androidx.window.layout.adapter.sidecar.a a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static final a c = new a(null);
    public static final ReentrantLock e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final b a(Context context) {
            t.g(context, "context");
            if (b.c() == null) {
                ReentrantLock d = b.d();
                d.lock();
                try {
                    if (b.c() == null) {
                        b.e(new b(b.c.b(context)));
                    }
                    I i = I.a;
                    d.unlock();
                } catch (Throwable th) {
                    d.unlock();
                    throw th;
                }
            }
            b c = b.c();
            t.d(c);
            return c;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            t.g(context, "context");
            try {
                if (!c(SidecarCompat.f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.n()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(w4.k kVar) {
            return kVar != null && kVar.compareTo(w4.k.f.a()) >= 0;
        }

        public a() {
        }
    }

    public final class b implements a.a {
        public b() {
        }

        public void a(Activity activity, A4.k kVar) {
            t.g(activity, "activity");
            t.g(kVar, "newLayout");
            Iterator it = b.this.g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (t.c(cVar.d(), activity)) {
                    cVar.b(kVar);
                }
            }
        }
    }

    public static final class c {
        public final Activity a;
        public final Executor b;
        public final S1.b c;
        public A4.k d;

        public c(Activity activity, Executor executor, S1.b bVar) {
            t.g(activity, "activity");
            t.g(executor, "executor");
            t.g(bVar, "callback");
            this.a = activity;
            this.b = executor;
            this.c = bVar;
        }

        public static /* synthetic */ void a(c cVar, A4.k kVar) {
            c(cVar, kVar);
        }

        public static final void c(c cVar, A4.k kVar) {
            t.g(cVar, "this$0");
            t.g(kVar, "$newLayoutInfo");
            cVar.c.accept(kVar);
        }

        public final void b(A4.k kVar) {
            t.g(kVar, "newLayoutInfo");
            this.d = kVar;
            this.b.execute(new D4.c(this, kVar));
        }

        public final Activity d() {
            return this.a;
        }

        public final S1.b e() {
            return this.c;
        }

        public final A4.k f() {
            return this.d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.a(new b());
        }
    }

    public static final /* synthetic */ b c() {
        return d;
    }

    public static final /* synthetic */ ReentrantLock d() {
        return e;
    }

    public static final /* synthetic */ void e(b bVar) {
        d = bVar;
    }

    public void a(Context context, Executor executor, S1.b bVar) {
        Object obj;
        t.g(context, "context");
        t.g(executor, "executor");
        t.g(bVar, "callback");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar = this.a;
                if (aVar == null) {
                    bVar.accept(new A4.k(v.n()));
                    return;
                }
                boolean h = h(activity);
                c cVar = new c(activity, executor, bVar);
                this.b.add(cVar);
                if (h) {
                    Iterator it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (t.c(activity, ((c) obj).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) obj;
                    r1 = cVar2 != null ? cVar2.f() : null;
                    if (r1 != null) {
                        cVar.b(r1);
                    }
                } else {
                    aVar.b(activity);
                }
                I i = I.a;
                reentrantLock.unlock();
                r1 = I.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (r1 == null) {
            bVar.accept(new A4.k(v.n()));
        }
    }

    public void b(S1.b bVar) {
        t.g(bVar, "callback");
        synchronized (e) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e() == bVar) {
                        t.f(cVar, "callbackWrapper");
                        arrayList.add(cVar);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).d());
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (t.c(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (t.c(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
