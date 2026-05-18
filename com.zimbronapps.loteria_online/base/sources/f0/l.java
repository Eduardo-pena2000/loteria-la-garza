package f0;

import Da.p;
import Da.r;
import e0.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends c implements e0.c {
    public static final a b = new a(null);
    public static final int c = 8;
    public static final l d = new l(new Object[0]);
    public final Object[] a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final l a() {
            return l.g();
        }

        public a() {
        }
    }

    public l(Object[] objArr) {
        this.a = objArr;
        i0.a.a(objArr.length <= 32);
    }

    public static final /* synthetic */ l g() {
        return d;
    }

    public e0.e G(int i) {
        i0.d.a(i, size());
        if (size() == 1) {
            return d;
        }
        Object[] copyOf = Arrays.copyOf(this.a, size() - 1);
        t.f(copyOf, "copyOf(...)");
        p.k(this.a, copyOf, i, i + 1, size());
        return new l(copyOf);
    }

    public e0.e add(Object obj) {
        if (size() >= 32) {
            return new f(this.a, n.c(obj), size() + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(this.a, size() + 1);
        t.f(copyOf, "copyOf(...)");
        copyOf[size()] = obj;
        return new l(copyOf);
    }

    public e0.e addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            e.a d2 = d();
            d2.addAll(collection);
            return d2.build();
        }
        Object[] copyOf = Arrays.copyOf(this.a, size() + collection.size());
        t.f(copyOf, "copyOf(...)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[size] = it.next();
            size++;
        }
        return new l(copyOf);
    }

    public e0.e b1(Qa.l lVar) {
        Object[] objArr = this.a;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.a[i];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.a;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    t.f(objArr, "copyOf(...)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? d : new l(p.r(objArr, 0, size));
    }

    public e.a d() {
        return new h(this, null, this.a, 0);
    }

    public Object get(int i) {
        i0.d.a(i, size());
        return this.a[i];
    }

    public int getSize() {
        return this.a.length;
    }

    public final Object[] h(int i) {
        return new Object[i];
    }

    public int indexOf(Object obj) {
        return r.g0(this.a, obj);
    }

    public int lastIndexOf(Object obj) {
        return r.E0(this.a, obj);
    }

    public ListIterator listIterator(int i) {
        i0.d.b(i, size());
        return new d(this.a, i, size());
    }

    public e0.e set(int i, Object obj) {
        i0.d.a(i, size());
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        t.f(copyOf, "copyOf(...)");
        copyOf[i] = obj;
        return new l(copyOf);
    }

    public e0.e add(int i, Object obj) {
        i0.d.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] h = h(size() + 1);
            p.p(this.a, h, 0, 0, i, 6, (Object) null);
            p.k(this.a, h, i + 1, i, size());
            h[i] = obj;
            return new l(h);
        }
        Object[] objArr = this.a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        t.f(copyOf, "copyOf(...)");
        p.k(this.a, copyOf, i + 1, i, size() - 1);
        copyOf[i] = obj;
        return new f(copyOf, n.c(this.a[31]), size() + 1, 0);
    }
}
