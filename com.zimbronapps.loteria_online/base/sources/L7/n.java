package L7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class n implements d, d8.a {
    public static final l8.b i = new j();
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public Set e;
    public final u f;
    public final AtomicReference g;
    public final i h;

    public /* synthetic */ n(Executor executor, Iterable iterable, Collection collection, i iVar, a aVar) {
        this(executor, iterable, collection, iVar);
    }

    public static /* synthetic */ Object j(n nVar, c cVar) {
        return nVar.r(cVar);
    }

    public static /* synthetic */ void k(C c, l8.b bVar) {
        s(c, bVar);
    }

    public static /* synthetic */ void l(x xVar, l8.b bVar) {
        t(xVar, bVar);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static /* synthetic */ void s(C c, l8.b bVar) {
        c.j(bVar);
    }

    public static /* synthetic */ void t(x xVar, l8.b bVar) {
        xVar.a(bVar);
    }

    public synchronized l8.b b(E e) {
        D.c(e, "Null interface requested.");
        return (l8.b) this.b.get(e);
    }

    public synchronized l8.b g(E e) {
        x xVar = (x) this.c.get(e);
        if (xVar != null) {
            return xVar;
        }
        return i;
    }

    public l8.a h(E e) {
        l8.b b2 = b(e);
        return b2 == null ? C.e() : b2 instanceof C ? (C) b2 : C.i(b2);
    }

    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((l8.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).j().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.e.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                c cVar = (c) it3.next();
                this.a.put(cVar, new w(new k(this, cVar)));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    public final void o(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            l8.b bVar = (l8.b) entry.getValue();
            if (cVar.n() || (cVar.o() && z)) {
                bVar.get();
            }
        }
        this.f.f();
    }

    public void p(boolean z) {
        HashMap hashMap;
        if (Y.a(this.g, (Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            o(hashMap, z);
        }
    }

    public final /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new F(cVar, this));
    }

    public final void u() {
        Boolean bool = (Boolean) this.g.get();
        if (bool != null) {
            o(this.a, bool.booleanValue());
        }
    }

    public final void v() {
        for (c cVar : this.a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.c.containsKey(qVar.c())) {
                    this.c.put(qVar.c(), x.b(Collections.emptySet()));
                } else if (this.b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", new Object[]{cVar, qVar.c()}));
                    }
                    if (!qVar.g()) {
                        this.b.put(qVar.c(), C.e());
                    }
                }
            }
        }
    }

    public final List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                l8.b bVar = (l8.b) this.a.get(cVar);
                for (E e : cVar.j()) {
                    if (this.b.containsKey(e)) {
                        arrayList.add(new l((C) ((l8.b) this.b.get(e)), bVar));
                    } else {
                        this.b.put(e, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                l8.b bVar = (l8.b) entry.getValue();
                for (E e : cVar.j()) {
                    if (!hashMap.containsKey(e)) {
                        hashMap.put(e, new HashSet());
                    }
                    ((Set) hashMap.get(e)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                x xVar = (x) this.c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new m(xVar, (l8.b) it.next()));
                }
            } else {
                this.c.put((E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        u uVar = new u(executor);
        this.f = uVar;
        this.h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(uVar, u.class, i8.d.class, i8.c.class));
        arrayList.add(c.s(this, d8.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.d = q(iterable);
        n(arrayList);
    }

    public static final class b {
        public final Executor a;
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public i d = i.a;

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return f(componentRegistrar);
        }

        public b b(c cVar) {
            this.c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.b.add(new o(componentRegistrar));
            return this;
        }

        public b d(Collection collection) {
            this.b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.a, this.b, this.c, this.d, null);
        }

        public b g(i iVar) {
            this.d = iVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
