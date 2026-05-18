package l0;

import e0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w extends y {
    public w(G g) {
        super(g);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return e((Map.Entry) obj).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return f(collection).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (kotlin.jvm.internal.V.m(obj)) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Collection collection2 = (Iterable) collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void e(Map.Entry entry) {
        H.b();
        throw new Ca.i();
    }

    public Void f(Collection collection) {
        H.b();
        throw new Ca.i();
    }

    public boolean g(Map.Entry entry) {
        return kotlin.jvm.internal.t.c(a().get(entry.getKey()), entry.getValue());
    }

    public boolean h(Map.Entry entry) {
        return a().remove(entry.getKey()) != null;
    }

    public Iterator iterator() {
        return new P(a(), ((e0.d) a().j().i().entrySet()).iterator());
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (kotlin.jvm.internal.V.m(obj)) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (a().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public boolean retainAll(Collection collection) {
        e0.f i;
        int j;
        l c;
        boolean a;
        Iterable<Map.Entry> iterable = (Iterable) collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Wa.n.e(Da.Q.e(Da.w.y(iterable, 10)), 16));
        for (Map.Entry entry : iterable) {
            Ca.q a2 = Ca.x.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a2.c(), a2.d());
        }
        G a3 = a();
        boolean z = false;
        do {
            synchronized (H.a()) {
                W p = a3.p();
                kotlin.jvm.internal.t.e(p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                G.a aVar = (G.a) v.K((G.a) p);
                i = aVar.i();
                j = aVar.j();
                Ca.I i2 = Ca.I.a;
            }
            kotlin.jvm.internal.t.d(i);
            f.a d = i.d();
            for (Map.Entry entry2 : a3.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.t.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    d.remove(entry2.getKey());
                    z = true;
                }
            }
            Ca.I i3 = Ca.I.a;
            e0.f build = d.build();
            if (kotlin.jvm.internal.t.c(build, i)) {
                break;
            }
            W p2 = a3.p();
            kotlin.jvm.internal.t.e(p2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            G.a aVar2 = (G.a) p2;
            synchronized (v.O()) {
                c = l.e.c();
                a = G.a(a3, (G.a) v.p0(aVar2, a3, c), j, build);
            }
            v.X(c, a3);
        } while (!a);
        return z;
    }
}
