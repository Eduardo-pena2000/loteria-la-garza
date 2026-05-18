package l0;

import e0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l0.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z extends y {
    public z(G g) {
        super(g);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return e(obj).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return f(collection).booleanValue();
    }

    public boolean contains(Object obj) {
        return a().containsValue(obj);
    }

    public boolean containsAll(Collection collection) {
        Collection collection2 = (Iterable) collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!a().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void e(Object obj) {
        H.b();
        throw new Ca.i();
    }

    public Void f(Collection collection) {
        H.b();
        throw new Ca.i();
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public T iterator() {
        return new T(a(), ((e0.d) a().j().i().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return a().n(obj);
    }

    public boolean removeAll(Collection collection) {
        e0.f i;
        int j;
        l c;
        boolean a;
        Set Q0 = Da.D.Q0((Iterable) collection);
        G a2 = a();
        boolean z = false;
        do {
            synchronized (H.a()) {
                W p = a2.p();
                kotlin.jvm.internal.t.e(p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                G.a aVar = (G.a) v.K((G.a) p);
                i = aVar.i();
                j = aVar.j();
                Ca.I i2 = Ca.I.a;
            }
            kotlin.jvm.internal.t.d(i);
            f.a d = i.d();
            for (Map.Entry entry : a2.entrySet()) {
                if (Q0.contains(entry.getValue())) {
                    d.remove(entry.getKey());
                    z = true;
                }
            }
            Ca.I i3 = Ca.I.a;
            e0.f build = d.build();
            if (kotlin.jvm.internal.t.c(build, i)) {
                break;
            }
            W p2 = a2.p();
            kotlin.jvm.internal.t.e(p2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            G.a aVar2 = (G.a) p2;
            synchronized (v.O()) {
                c = l.e.c();
                a = G.a(a2, (G.a) v.p0(aVar2, a2, c), j, build);
            }
            v.X(c, a2);
        } while (!a);
        return z;
    }

    public boolean retainAll(Collection collection) {
        e0.f i;
        int j;
        l c;
        boolean a;
        Set Q0 = Da.D.Q0((Iterable) collection);
        G a2 = a();
        boolean z = false;
        do {
            synchronized (H.a()) {
                W p = a2.p();
                kotlin.jvm.internal.t.e(p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                G.a aVar = (G.a) v.K((G.a) p);
                i = aVar.i();
                j = aVar.j();
                Ca.I i2 = Ca.I.a;
            }
            kotlin.jvm.internal.t.d(i);
            f.a d = i.d();
            for (Map.Entry entry : a2.entrySet()) {
                if (!Q0.contains(entry.getValue())) {
                    d.remove(entry.getKey());
                    z = true;
                }
            }
            Ca.I i3 = Ca.I.a;
            e0.f build = d.build();
            if (kotlin.jvm.internal.t.c(build, i)) {
                break;
            }
            W p2 = a2.p();
            kotlin.jvm.internal.t.e(p2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            G.a aVar2 = (G.a) p2;
            synchronized (v.O()) {
                c = l.e.c();
                a = G.a(a2, (G.a) v.p0(aVar2, a2, c), j, build);
            }
            v.X(c, a2);
        } while (!a);
        return z;
    }
}
