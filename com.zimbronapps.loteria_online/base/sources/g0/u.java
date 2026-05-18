package g0;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u implements Iterator, Ra.a {
    public Object[] a = t.e.a().p();
    public int b;
    public int c;

    public final Object a() {
        i0.a.a(g());
        return this.a[this.c];
    }

    public final t b() {
        i0.a.a(h());
        Object obj = this.a[this.c];
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    public final Object[] e() {
        return this.a;
    }

    public final int f() {
        return this.c;
    }

    public final boolean g() {
        return this.c < this.b;
    }

    public final boolean h() {
        i0.a.a(this.c >= this.b);
        return this.c < this.a.length;
    }

    public boolean hasNext() {
        return g();
    }

    public final void j() {
        i0.a.a(g());
        this.c += 2;
    }

    public final void k() {
        i0.a.a(h());
        this.c++;
    }

    public final void m(Object[] objArr, int i) {
        n(objArr, i, 0);
    }

    public final void n(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    public final void o(int i) {
        this.c = i;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
