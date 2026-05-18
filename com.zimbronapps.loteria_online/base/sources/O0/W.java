package O0;

import androidx.compose.ui.e;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements List, Ra.a {
    public w.L a = new w.L(16);
    public w.H b = new w.H(16);
    public int c = -1;

    public final class b implements List, Ra.a {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean a(e.c cVar) {
            return indexOf(cVar) != -1;
        }

        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.c get(int i) {
            Object c = w.f(w.this).c(i + this.a);
            kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) c;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof e.c) {
                return a((e.c) obj);
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            Iterator it = ((Iterable) collection).iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.b - this.a;
        }

        public int f(e.c cVar) {
            int i = this.a;
            int i2 = this.b;
            if (i > i2) {
                return -1;
            }
            while (!kotlin.jvm.internal.t.c(w.f(w.this).c(i), cVar)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.a;
        }

        public int g(e.c cVar) {
            int i = this.b;
            int i2 = this.a;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.t.c(w.f(w.this).c(i), cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.a;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof e.c) {
                return f((e.c) obj);
            }
            return -1;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Iterator iterator() {
            w wVar = w.this;
            int i = this.a;
            return wVar.new a(i, i, this.b);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof e.c) {
                return g((e.c) obj);
            }
            return -1;
        }

        public ListIterator listIterator() {
            w wVar = w.this;
            int i = this.a;
            return wVar.new a(i, i, this.b);
        }

        public /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return e();
        }

        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List subList(int i, int i2) {
            w wVar = w.this;
            int i3 = this.a;
            return wVar.new b(i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return kotlin.jvm.internal.j.a(this);
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public ListIterator listIterator(int i) {
            w wVar = w.this;
            int i2 = this.a;
            return wVar.new a(i + i2, i2, this.b);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Object[] toArray(Object[] objArr) {
            return kotlin.jvm.internal.j.b(this, objArr);
        }
    }

    public static final /* synthetic */ w.H b(w wVar) {
        return wVar.b;
    }

    public static final /* synthetic */ int e(w wVar) {
        return wVar.c;
    }

    public static final /* synthetic */ w.L f(w wVar) {
        return wVar.a;
    }

    public static final /* synthetic */ void g(w wVar, int i, int i2) {
        wVar.u(i, i2);
    }

    public static final /* synthetic */ void h(w wVar, int i) {
        wVar.c = i;
    }

    public final void a() {
        this.c = size() - 1;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.c = -1;
        this.a.n();
        this.b.f();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e.c) {
            return j((e.c) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Iterator it = ((Iterable) collection).iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e.c) {
            return q((e.c) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.a.f();
    }

    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean j(e.c cVar) {
        return indexOf(cVar) != -1;
    }

    public final long k() {
        long b2 = x.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.c + 1;
        int p = Da.v.p(this);
        if (i <= p) {
            while (true) {
                long b3 = r.b(this.b.a(i));
                if (r.a(b3, b2) < 0) {
                    b2 = b3;
                }
                if (r.c(b2) < 0.0f && r.e(b2)) {
                    return b2;
                }
                if (i == p) {
                    break;
                }
                i++;
            }
        }
        return b2;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e.c) {
            return s((e.c) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e.c get(int i) {
        Object c = this.a.c(i);
        kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) c;
    }

    public int n() {
        return this.a.d();
    }

    public final boolean o() {
        long k = k();
        return r.c(k) < 0.0f && r.e(k) && !r.d(k);
    }

    public final void p(e.c cVar, boolean z, Qa.a aVar) {
        if (this.c == Da.v.p(this)) {
            int e = e(this);
            g(this, e(this) + 1, size());
            h(this, e(this) + 1);
            f(this).k(cVar);
            b(this).d(x.c(0.0f, z, true));
            aVar.invoke();
            h(this, e);
            return;
        }
        long k = k();
        int i = this.c;
        if (!r.d(k)) {
            if (r.c(k) > 0.0f) {
                int e2 = e(this);
                g(this, e(this) + 1, size());
                h(this, e(this) + 1);
                f(this).k(cVar);
                b(this).d(x.c(0.0f, z, true));
                aVar.invoke();
                h(this, e2);
                return;
            }
            return;
        }
        this.c = Da.v.p(this);
        int e3 = e(this);
        g(this, e(this) + 1, size());
        h(this, e(this) + 1);
        f(this).k(cVar);
        b(this).d(x.c(0.0f, z, true));
        aVar.invoke();
        h(this, e3);
        if (r.c(k()) < 0.0f) {
            u(i + 1, this.c + 1);
        }
        this.c = i;
    }

    public int q(e.c cVar) {
        int p = Da.v.p(this);
        if (p < 0) {
            return -1;
        }
        int i = 0;
        while (!kotlin.jvm.internal.t.c(this.a.c(i), cVar)) {
            if (i == p) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public final boolean r(float f, boolean z) {
        if (this.c == Da.v.p(this)) {
            return true;
        }
        return r.a(k(), x.b(f, z, false, 4, null)) > 0;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s(e.c cVar) {
        for (int p = Da.v.p(this); -1 < p; p--) {
            if (kotlin.jvm.internal.t.c(this.a.c(p), cVar)) {
                return p;
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return n();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new b(i, i2);
    }

    public final void t(int i) {
        this.a.r(i);
        this.b.h(i);
    }

    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    public final void u(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.a.s(i, i2);
        this.b.i(i, i2);
    }

    public final void v(e.c cVar, float f, boolean z, Qa.a aVar) {
        if (this.c == Da.v.p(this)) {
            int e = e(this);
            g(this, e(this) + 1, size());
            h(this, e(this) + 1);
            f(this).k(cVar);
            b(this).d(x.c(f, z, false));
            aVar.invoke();
            h(this, e);
            if (this.c + 1 == Da.v.p(this) || r.d(k())) {
                t(this.c + 1);
                return;
            }
            return;
        }
        long k = k();
        int i = this.c;
        this.c = Da.v.p(this);
        int e2 = e(this);
        g(this, e(this) + 1, size());
        h(this, e(this) + 1);
        f(this).k(cVar);
        b(this).d(x.c(f, z, false));
        aVar.invoke();
        h(this, e2);
        long k2 = k();
        if (this.c + 1 >= Da.v.p(this) || r.a(k, k2) <= 0) {
            u(this.c + 1, size());
        } else {
            u(i + 1, r.d(k2) ? this.c + 2 : this.c + 1);
        }
        this.c = i;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i) {
        return new a(this, i, 0, 0, 6, null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.b(this, objArr);
    }

    public final class a implements ListIterator, Ra.a {
        public int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.c next() {
            w.L f = w.f(w.this);
            int i = this.a;
            this.a = i + 1;
            Object c = f.c(i);
            kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) c;
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.c previous() {
            w.L f = w.f(w.this);
            int i = this.a - 1;
            this.a = i;
            Object c = f.c(i);
            kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) c;
        }

        public boolean hasNext() {
            return this.a < this.c;
        }

        public boolean hasPrevious() {
            return this.a > this.b;
        }

        public int nextIndex() {
            return this.a - this.b;
        }

        public int previousIndex() {
            return (this.a - this.b) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(w wVar, int i, int i2, int i3, int i4, kotlin.jvm.internal.k kVar) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? wVar.size() : i3);
        }
    }
}
