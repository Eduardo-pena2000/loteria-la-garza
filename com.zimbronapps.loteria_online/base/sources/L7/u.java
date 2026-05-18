package L7;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class u implements i8.d, i8.c {
    public final Map a = new HashMap();
    public Queue b = new ArrayDeque();
    public final Executor c;

    public u(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void e(Map.Entry entry, i8.a aVar) {
        h(entry, aVar);
    }

    public static /* synthetic */ void h(Map.Entry entry, i8.a aVar) {
        ((i8.b) entry.getKey()).a(aVar);
    }

    public void a(i8.a aVar) {
        D.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (Map.Entry entry : g(aVar)) {
                    ((Executor) entry.getValue()).execute(new t(entry, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b(Class cls, Executor executor, i8.b bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(Class cls, i8.b bVar) {
        b(cls, this.c, bVar);
    }

    public synchronized void d(Class cls, i8.b bVar) {
        D.b(cls);
        D.b(bVar);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    public void f() {
        Collection collection;
        synchronized (this) {
            try {
                collection = this.b;
                if (collection != null) {
                    this.b = null;
                } else {
                    collection = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a((i8.a) it.next());
            }
        }
    }

    public final synchronized Set g(i8.a aVar) {
        Map map;
        try {
            map = (Map) this.a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }
}
