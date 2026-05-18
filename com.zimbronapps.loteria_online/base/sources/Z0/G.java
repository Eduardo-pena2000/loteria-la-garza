package Z0;

import Z0.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final e a = new e("", null, 2, null);

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(((e.d) obj).h()), Integer.valueOf(((e.d) obj2).h()));
        }
    }

    public static /* synthetic */ boolean a(e.a aVar) {
        return m(aVar);
    }

    public static final /* synthetic */ List b(List list, List list2) {
        return e(list, list2);
    }

    public static final /* synthetic */ List c(List list, int i, int i2) {
        return g(list, i, i2);
    }

    public static final /* synthetic */ e d(e eVar, int i, int i2) {
        return l(eVar, i, i2);
    }

    public static final List e(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((e.d) list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add((e.d) list2.get(i2));
        }
        return arrayList;
    }

    public static final e f() {
        return a;
    }

    public static final List g(List list, int i, int i2) {
        if (!(i <= i2)) {
            g1.a.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            e.d dVar = (e.d) list.get(i3);
            if (j(i, i2, dVar.h(), dVar.f())) {
                arrayList.add(new e.d(dVar.g(), Math.max(i, dVar.h()) - i, Math.min(i2, dVar.f()) - i, dVar.i()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final List h(e eVar, int i, int i2, Qa.l lVar) {
        List b;
        if (i == i2 || (b = eVar.b()) == null) {
            return null;
        }
        if (i != 0 || i2 < eVar.j().length()) {
            ArrayList arrayList = new ArrayList(b.size());
            int size = b.size();
            for (int i3 = 0; i3 < size; i3++) {
                e.d dVar = (e.d) b.get(i3);
                if ((lVar != null ? ((Boolean) lVar.invoke(dVar.g())).booleanValue() : true) && j(i, i2, dVar.h(), dVar.f())) {
                    arrayList.add(new e.d((e.a) dVar.g(), Wa.n.m(dVar.h(), i, i2) - i, Wa.n.m(dVar.f(), i, i2) - i, dVar.i()));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return b;
        }
        ArrayList arrayList2 = new ArrayList(b.size());
        int size2 = b.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = b.get(i4);
            if (((Boolean) lVar.invoke(((e.d) obj).g())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List i(e eVar, int i, int i2, Qa.l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return h(eVar, i, i2, lVar);
    }

    public static final boolean j(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    public static final List k(e eVar, B b) {
        List n;
        List f = eVar.f();
        if (f == null || (n = Da.D.C0(f, new a())) == null) {
            n = Da.v.n();
        }
        ArrayList arrayList = new ArrayList();
        Da.m mVar = new Da.m();
        int size = n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            e.d dVar = (e.d) n.get(i2);
            e.d e = e.d.e(dVar, b.l((B) dVar.g()), 0, 0, null, 14, null);
            while (i < e.h() && !mVar.isEmpty()) {
                e.d dVar2 = (e.d) mVar.last();
                if (e.h() < dVar2.f()) {
                    arrayList.add(new e.d(dVar2.g(), i, e.h()));
                    i = e.h();
                } else {
                    arrayList.add(new e.d(dVar2.g(), i, dVar2.f()));
                    i = dVar2.f();
                    while (!mVar.isEmpty() && i == ((e.d) mVar.last()).f()) {
                        mVar.removeLast();
                    }
                }
            }
            if (i < e.h()) {
                arrayList.add(new e.d(b, i, e.h()));
                i = e.h();
            }
            e.d dVar3 = (e.d) mVar.k();
            if (dVar3 == null) {
                mVar.add(new e.d(e.g(), e.h(), e.f()));
            } else if (dVar3.h() == e.h() && dVar3.f() == e.f()) {
                mVar.removeLast();
                mVar.add(new e.d(((B) dVar3.g()).l((B) e.g()), e.h(), e.f()));
            } else if (dVar3.h() == dVar3.f()) {
                arrayList.add(new e.d(dVar3.g(), dVar3.h(), dVar3.f()));
                mVar.removeLast();
                mVar.add(new e.d(e.g(), e.h(), e.f()));
            } else {
                if (dVar3.f() < e.f()) {
                    throw new IllegalArgumentException();
                }
                mVar.add(new e.d(((B) dVar3.g()).l((B) e.g()), e.h(), e.f()));
            }
        }
        while (i <= eVar.j().length() && !mVar.isEmpty()) {
            e.d dVar4 = (e.d) mVar.last();
            arrayList.add(new e.d(dVar4.g(), i, dVar4.f()));
            i = dVar4.f();
            while (!mVar.isEmpty() && i == ((e.d) mVar.last()).f()) {
                mVar.removeLast();
            }
        }
        if (i < eVar.j().length()) {
            arrayList.add(new e.d(b, i, eVar.j().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e.d(b, 0, 0));
        }
        return arrayList;
    }

    public static final e l(e eVar, int i, int i2) {
        String str;
        if (i != i2) {
            str = eVar.j().substring(i, i2);
            kotlin.jvm.internal.t.f(str, "substring(...)");
        } else {
            str = "";
        }
        List h = h(eVar, i, i2, new f());
        if (h == null) {
            h = Da.v.n();
        }
        return new e(str, h);
    }

    public static final boolean m(e.a aVar) {
        return !(aVar instanceof B);
    }
}
