package f0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends a {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        k(i - r5, 1);
    }

    public final Object j() {
        int e = e() & 31;
        Object obj = this.d[this.c - 1];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[e];
    }

    public final void k(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[n.a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void m(int i) {
        int i2 = 0;
        while (n.a(e(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            k(e(), ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void n(Object[] objArr, int i, int i2, int i3) {
        g(i);
        h(i2);
        this.c = i3;
        if (this.d.length < i3) {
            this.d = new Object[i3];
        }
        this.d[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.e = r0;
        k(i - r0, 1);
    }

    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object j = j();
        g(e() + 1);
        if (e() == f()) {
            this.e = true;
            return j;
        }
        m(0);
        return j;
    }

    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        g(e() - 1);
        if (this.e) {
            this.e = false;
            return j();
        }
        m(31);
        return j();
    }
}
