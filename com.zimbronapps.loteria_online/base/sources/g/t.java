package G;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.q;
import java.util.List;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements l, I.x {
    public final int a;
    public final List b;
    public final boolean c;
    public final e.b d;
    public final e.c e;
    public final n1.t f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final LazyLayoutItemAnimator n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public final int[] z;

    public /* synthetic */ t(int i, List list, boolean z, e.b bVar, e.c cVar, n1.t tVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, kotlin.jvm.internal.k kVar) {
        this(i, list, z, bVar, cVar, tVar, z2, i2, i3, i4, j, obj, obj2, lazyLayoutItemAnimator, j2);
    }

    public int a() {
        return this.p;
    }

    public final void b(int i, boolean z) {
        if (p()) {
            return;
        }
        this.p = a() + i;
        int length = this.z.length;
        for (int i2 = 0; i2 < length; i2++) {
            if ((h() && i2 % 2 == 1) || (!h() && i2 % 2 == 0)) {
                int[] iArr = this.z;
                iArr[i2] = iArr[i2] + i;
            }
        }
        if (z) {
            int c = c();
            for (int i3 = 0; i3 < c; i3++) {
                this.n.d(getKey(), i3);
            }
        }
    }

    public int c() {
        return this.b.size();
    }

    public void d(boolean z) {
        this.v = z;
    }

    public int e() {
        return this.s;
    }

    public long f() {
        return this.o;
    }

    public final int g() {
        return this.u;
    }

    public int getIndex() {
        return this.a;
    }

    public Object getKey() {
        return this.l;
    }

    public int getSize() {
        return this.q;
    }

    public boolean h() {
        return this.c;
    }

    public void i(int i, int i2, int i3, int i4) {
        r(i, i3, i4);
    }

    public int j() {
        return this.t;
    }

    public Object k(int i) {
        return ((androidx.compose.ui.layout.q) this.b.get(i)).j();
    }

    public long l(int i) {
        int[] iArr = this.z;
        int i2 = i * 2;
        return n1.o.a(iArr[i2], iArr[i2 + 1]);
    }

    public int m() {
        return this.r;
    }

    public final int n(long j) {
        return h() ? n1.n.l(j) : n1.n.k(j);
    }

    public final int o(androidx.compose.ui.layout.q qVar) {
        return h() ? qVar.P0() : qVar.W0();
    }

    public boolean p() {
        return this.v;
    }

    public final void q(q.a aVar, boolean z) {
        if (this.w == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int c = c();
        for (int i = 0; i < c; i++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) this.b.get(i);
            o(qVar);
            long l = l(i);
            this.n.d(getKey(), i);
            if (this.g) {
                l = n1.o.a(h() ? n1.n.k(l) : (this.w - n1.n.k(l)) - o(qVar), h() ? (this.w - n1.n.l(l)) - o(qVar) : n1.n.l(l));
            }
            long o = n1.n.o(l, this.k);
            if (h()) {
                q.a.D0(aVar, qVar, o, 0.0f, null, 6, null);
            } else {
                q.a.v0(aVar, qVar, o, 0.0f, null, 6, null);
            }
        }
    }

    public final void r(int i, int i2, int i3) {
        int W0;
        this.p = i;
        this.w = h() ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) list.get(i4);
            int i5 = i4 * 2;
            if (h()) {
                int[] iArr = this.z;
                e.b bVar = this.d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i5] = bVar.a(qVar.W0(), i2, this.f);
                this.z[i5 + 1] = i;
                W0 = qVar.P0();
            } else {
                int[] iArr2 = this.z;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                e.c cVar = this.e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i6] = cVar.a(qVar.P0(), i3);
                W0 = qVar.W0();
            }
            i += W0;
        }
        this.x = -this.h;
        this.y = this.w + this.i;
    }

    public final void s(int i) {
        this.w = i;
        this.y = i + this.i;
    }

    public t(int i, List list, boolean z, e.b bVar, e.c cVar, n1.t tVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = tVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = lazyLayoutItemAnimator;
        this.o = j2;
        this.s = 1;
        this.w = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) list.get(i7);
            i5 += h() ? qVar.P0() : qVar.W0();
            i6 = Math.max(i6, !h() ? qVar.P0() : qVar.W0());
        }
        this.q = i5;
        this.t = Wa.n.e(getSize() + this.j, 0);
        this.u = i6;
        this.z = new int[this.b.size() * 2];
    }
}
