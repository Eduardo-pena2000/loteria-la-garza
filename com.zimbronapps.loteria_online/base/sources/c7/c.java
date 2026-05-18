package C7;

import F7.a;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c {
    public final l8.b a;
    public final String b;
    public Integer c = null;

    public c(Context context, l8.b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.b((Map) it.next()));
        }
        return arrayList;
    }

    public final void a(a.c cVar) {
        ((F7.a) this.a.get()).e(cVar);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            while (arrayDeque.size() >= i) {
                k(((a.c) arrayDeque.pollFirst()).b);
            }
            a.c f = bVar.f(this.b);
            a(f);
            arrayDeque.offer(f);
        }
    }

    public final boolean d(List list, b bVar) {
        String c = bVar.c();
        String e = bVar.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.c().equals(c) && bVar2.e().equals(e)) {
                return true;
            }
        }
        return false;
    }

    public List e() {
        o();
        List f = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((a.c) it.next()));
        }
        return arrayList;
    }

    public final List f() {
        return ((F7.a) this.a.get()).g(this.b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar.f(this.b));
            }
        }
        return arrayList;
    }

    public final int i() {
        if (this.c == null) {
            this.c = Integer.valueOf(((F7.a) this.a.get()).f(this.b));
        }
        return this.c.intValue();
    }

    public void j() {
        o();
        l(f());
    }

    public final void k(String str) {
        ((F7.a) this.a.get()).clearConditionalUserProperty(str, null, null);
    }

    public final void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((a.c) it.next()).b);
        }
    }

    public void m(List list) {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    public final void n(List list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List e = e();
        l(h(e, list));
        b(g(list, e));
    }

    public final void o() {
        if (this.a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
