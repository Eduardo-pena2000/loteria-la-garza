package H;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w implements I.y {
    public final l a;
    public final I.v b;
    public final int c;

    public w(l lVar, I.v vVar, int i) {
        this.a = lVar;
        this.b = vVar;
        this.c = i;
    }

    public abstract v b(int i, Object obj, Object obj2, int i2, int i3, List list, long j, int i4, int i5);

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(int i, int i2, int i3, long j) {
        return d(i, j, i2, i3, this.c);
    }

    public final v d(int i, long j, int i2, int i3, int i4) {
        int m;
        Object d = this.a.d(i);
        Object e = this.a.e(i);
        List a0 = this.b.a0(i, j);
        if (n1.b.j(j)) {
            m = n1.b.n(j);
        } else {
            if (!n1.b.i(j)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            m = n1.b.m(j);
        }
        return b(i, d, e, m, i4, a0, j, i2, i3);
    }

    public final androidx.compose.foundation.lazy.layout.b e() {
        return this.a.a();
    }
}
