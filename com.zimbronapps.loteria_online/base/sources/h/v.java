package H;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.q;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v implements k, I.x {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final n1.t f;
    public final int g;
    public final int h;
    public final List i;
    public final long j;
    public final Object k;
    public final LazyLayoutItemAnimator l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public final long u;
    public long v;
    public int w;
    public int x;
    public boolean y;

    public /* synthetic */ v(int i, Object obj, boolean z, int i2, int i3, boolean z2, n1.t tVar, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, kotlin.jvm.internal.k kVar) {
        this(i, obj, z, i2, i3, z2, tVar, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }

    private final int p(long j) {
        return h() ? n1.n.l(j) : n1.n.k(j);
    }

    private final int r(androidx.compose.ui.layout.q qVar) {
        return h() ? qVar.P0() : qVar.W0();
    }

    public long a() {
        return this.u;
    }

    public int b() {
        return this.x;
    }

    public int c() {
        return this.i.size();
    }

    public void d(boolean z) {
        this.y = z;
    }

    public int e() {
        return this.o;
    }

    public long f() {
        return this.m;
    }

    public int g() {
        return this.w;
    }

    public int getIndex() {
        return this.a;
    }

    public Object getKey() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public void i(int i, int i2, int i3, int i4) {
        u(i, i2, i3, i4, -1, -1);
    }

    public int j() {
        return this.q;
    }

    public Object k(int i) {
        return ((androidx.compose.ui.layout.q) this.i.get(i)).j();
    }

    public long l(int i) {
        return n();
    }

    public int m() {
        return this.n;
    }

    public long n() {
        return this.v;
    }

    public final void o(int i) {
        if (s()) {
            return;
        }
        long n = n();
        int k = h() ? n1.n.k(n) : n1.n.k(n) + i;
        boolean h = h();
        int l = n1.n.l(n);
        if (h) {
            l += i;
        }
        this.v = n1.o.a(k, l);
        int c = c();
        for (int i2 = 0; i2 < c; i2++) {
            this.l.d(getKey(), i2);
        }
    }

    public final int q() {
        return this.p;
    }

    public boolean s() {
        return this.y;
    }

    public final void t(q.a aVar) {
        if (this.r == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int c = c();
        for (int i = 0; i < c; i++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) this.i.get(i);
            r(qVar);
            long n = n();
            this.l.d(getKey(), i);
            if (this.e) {
                n = n1.o.a(h() ? n1.n.k(n) : (this.r - n1.n.k(n)) - r(qVar), h() ? (this.r - n1.n.l(n)) - r(qVar) : n1.n.l(n));
            }
            long o = n1.n.o(n, this.j);
            if (h()) {
                q.a.D0(aVar, qVar, o, 0.0f, null, 6, null);
            } else {
                q.a.v0(aVar, qVar, o, 0.0f, null, 6, null);
            }
        }
    }

    public final void u(int i, int i2, int i3, int i4, int i5, int i6) {
        this.r = h() ? i4 : i3;
        if (!h()) {
            i3 = i4;
        }
        if (h() && this.f == n1.t.b) {
            i2 = (i3 - i2) - this.d;
        }
        this.v = h() ? n1.o.a(i2, i) : n1.o.a(i, i2);
        this.w = i5;
        this.x = i6;
        this.s = -this.g;
        this.t = this.r + this.h;
    }

    public final void v(int i) {
        this.r = i;
        this.t = i + this.h;
    }

    public v(int i, Object obj, boolean z, int i2, int i3, boolean z2, n1.t tVar, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = tVar;
        this.g = i4;
        this.h = i5;
        this.i = list;
        this.j = j;
        this.k = obj2;
        this.l = lazyLayoutItemAnimator;
        this.m = j2;
        this.n = i6;
        this.o = i7;
        this.r = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) list.get(i9);
            i8 = Math.max(i8, h() ? qVar.P0() : qVar.W0());
        }
        this.p = i8;
        this.q = Wa.n.e(i8 + i3, 0);
        this.u = h() ? n1.s.a(this.d, i8) : n1.s.a(i8, this.d);
        this.v = n1.n.b.b();
        this.w = -1;
        this.x = -1;
    }
}
