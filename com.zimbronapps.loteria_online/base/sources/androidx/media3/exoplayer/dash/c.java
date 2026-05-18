package androidx.media3.exoplayer.dash;

import M2.q;
import M2.y;
import P2.G;
import P2.K;
import R2.f;
import R2.s;
import T2.a1;
import U2.x1;
import W2.g;
import W2.h;
import X2.i;
import X2.j;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import h3.f;
import h3.l;
import h3.o;
import j3.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k3.e;
import k3.f;
import k3.k;
import k3.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements androidx.media3.exoplayer.dash.a {
    public final m a;
    public final W2.b b;
    public final int[] c;
    public final int d;
    public final f e;
    public final long f;
    public final int g;
    public final d.c h;
    public final b[] i;
    public x j;
    public X2.c k;
    public int l;
    public IOException m;
    public boolean n;
    public long o = -9223372036854775807L;

    public static final class a implements a.a {
        public final f.a a;
        public final int b;
        public final f.a c;

        public a(f.a aVar) {
            this(aVar, 1);
        }

        public q b(q qVar) {
            return this.c.b(qVar);
        }

        public androidx.media3.exoplayer.dash.a c(m mVar, X2.c cVar, W2.b bVar, int i, int[] iArr, x xVar, int i2, long j, boolean z, List list, d.c cVar2, R2.x xVar2, x1 x1Var, e eVar) {
            R2.f a = this.a.a();
            if (xVar2 != null) {
                a.l(xVar2);
            }
            return new c(this.c, mVar, cVar, bVar, i, iArr, xVar, i2, a, j, this.b, z, list, cVar2, x1Var, eVar);
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.c.a(z);
            return this;
        }

        public a(f.a aVar, int i) {
            this(h3.d.j, aVar, i);
        }

        public a(f.a aVar, f.a aVar2, int i) {
            this.c = aVar;
            this.a = aVar2;
            this.b = i;
        }
    }

    public static final class b {
        public final h3.f a;
        public final j b;
        public final X2.b c;
        public final g d;
        public final long e;
        public final long f;

        public b(long j, j jVar, X2.b bVar, h3.f fVar, long j2, g gVar) {
            this.e = j;
            this.b = jVar;
            this.c = bVar;
            this.f = j2;
            this.a = fVar;
            this.d = gVar;
        }

        public static /* synthetic */ long a(b bVar) {
            return bVar.e;
        }

        public b b(long j, j jVar) {
            long f;
            g l = this.b.l();
            g l2 = jVar.l();
            if (l == null) {
                return new b(j, jVar, this.c, this.a, this.f, l);
            }
            if (!l.h()) {
                return new b(j, jVar, this.c, this.a, this.f, l2);
            }
            long g = l.g(j);
            if (g == 0) {
                return new b(j, jVar, this.c, this.a, this.f, l2);
            }
            P2.a.h(l2);
            long i = l.i();
            long c = l.c(i);
            long j2 = g + i;
            long j3 = j2 - 1;
            long c2 = l.c(j3) + l.a(j3, j);
            long i2 = l2.i();
            long c3 = l2.c(i2);
            long j4 = this.f;
            if (c2 == c3) {
                f = j4 + (j2 - i2);
            } else {
                if (c2 < c3) {
                    throw new g3.b();
                }
                if (c3 < c) {
                    f = j4 - (l2.f(c, j) - i);
                } else {
                    j2 = l.f(c3, j);
                    f = j4 + (j2 - i2);
                }
            }
            return new b(j, jVar, this.c, this.a, f, l2);
        }

        public b c(g gVar) {
            return new b(this.e, this.b, this.c, this.a, this.f, gVar);
        }

        public b d(X2.b bVar) {
            return new b(this.e, this.b, bVar, this.a, this.f, this.d);
        }

        public long e(long j) {
            return ((g) P2.a.h(this.d)).b(this.e, j) + this.f;
        }

        public long f() {
            return ((g) P2.a.h(this.d)).i() + this.f;
        }

        public long g(long j) {
            return (e(j) + ((g) P2.a.h(this.d)).j(this.e, j)) - 1;
        }

        public long h() {
            return ((g) P2.a.h(this.d)).g(this.e);
        }

        public long i(long j) {
            return k(j) + ((g) P2.a.h(this.d)).a(j - this.f, this.e);
        }

        public long j(long j) {
            return ((g) P2.a.h(this.d)).f(j, this.e) + this.f;
        }

        public long k(long j) {
            return ((g) P2.a.h(this.d)).c(j - this.f);
        }

        public i l(long j) {
            return ((g) P2.a.h(this.d)).e(j - this.f);
        }

        public boolean m(long j, long j2) {
            return ((g) P2.a.h(this.d)).h() || j2 == -9223372036854775807L || i(j) <= j2;
        }
    }

    public static final class c extends h3.b {
        public final b e;
        public final long f;

        public c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.e = bVar;
            this.f = j3;
        }

        public long a() {
            c();
            return this.e.k(d());
        }

        public long b() {
            c();
            return this.e.i(d());
        }
    }

    public c(f.a aVar, m mVar, X2.c cVar, W2.b bVar, int i, int[] iArr, x xVar, int i2, R2.f fVar, long j, int i3, boolean z, List list, d.c cVar2, x1 x1Var, e eVar) {
        this.a = mVar;
        this.k = cVar;
        this.b = bVar;
        this.c = iArr;
        this.j = xVar;
        this.d = i2;
        this.e = fVar;
        this.l = i;
        this.f = j;
        this.g = i3;
        this.h = cVar2;
        long g = cVar.g(i);
        ArrayList n = n();
        this.i = new b[xVar.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            j jVar = (j) n.get(xVar.d(i4));
            X2.b j2 = bVar.j(jVar.c);
            int i5 = i4;
            this.i[i5] = new b(g, jVar, j2 == null ? (X2.b) jVar.c.get(0) : j2, aVar.c(i2, jVar.b, z, list, cVar2, x1Var), 0L, jVar.l());
            i4 = i5 + 1;
        }
    }

    public void a() {
        IOException iOException = this.m;
        if (iOException != null) {
            throw iOException;
        }
        this.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(T2.x0 r33, long r34, java.util.List r36, h3.g r37) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.c.b(T2.x0, long, java.util.List, h3.g):void");
    }

    public boolean c(h3.e eVar, boolean z, k.c cVar, k kVar) {
        k.b a2;
        if (!z) {
            return false;
        }
        d.c cVar2 = this.h;
        if (cVar2 != null && cVar2.j(eVar)) {
            return true;
        }
        if (!this.k.d && (eVar instanceof h3.m)) {
            IOException iOException = cVar.c;
            if ((iOException instanceof s) && ((s) iOException).d == 404) {
                b bVar = this.i[this.j.u(eVar.d)];
                long h = bVar.h();
                if (h != -1 && h != 0) {
                    if (((h3.m) eVar).g() > (bVar.f() + h) - 1) {
                        this.n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.i[this.j.u(eVar.d)];
        X2.b j = this.b.j(bVar2.b.c);
        if (j != null && !bVar2.c.equals(j)) {
            return true;
        }
        k.a j2 = j(this.j, bVar2.b.c);
        if ((!j2.a(2) && !j2.a(1)) || (a2 = kVar.a(j2, cVar)) == null || !j2.a(a2.a)) {
            return false;
        }
        int i = a2.a;
        if (i == 2) {
            x xVar = this.j;
            return xVar.e(xVar.u(eVar.d), a2.b);
        }
        if (i != 1) {
            return false;
        }
        this.b.e(bVar2.c, a2.b);
        return true;
    }

    public void d(h3.e eVar) {
        o3.g b2;
        if (eVar instanceof l) {
            int u = this.j.u(((l) eVar).d);
            b bVar = this.i[u];
            if (bVar.d == null && (b2 = ((h3.f) P2.a.h(bVar.a)).b()) != null) {
                this.i[u] = bVar.c(new W2.i(b2, bVar.b.d));
            }
        }
        d.c cVar = this.h;
        if (cVar != null) {
            cVar.i(eVar);
        }
    }

    public void e(x xVar) {
        this.j = xVar;
    }

    public void f(X2.c cVar, int i) {
        try {
            this.k = cVar;
            this.l = i;
            long g = cVar.g(i);
            ArrayList n = n();
            for (int i2 = 0; i2 < this.i.length; i2++) {
                j jVar = (j) n.get(this.j.d(i2));
                b[] bVarArr = this.i;
                bVarArr[i2] = bVarArr[i2].b(g, jVar);
            }
        } catch (g3.b e) {
            this.m = e;
        }
    }

    public long g(long j, a1 a1Var) {
        for (b bVar : this.i) {
            if (bVar.d != null) {
                long h = bVar.h();
                if (h != 0) {
                    long j2 = bVar.j(j);
                    long k = bVar.k(j2);
                    return a1Var.a(j, k, (k >= j || (h != -1 && j2 >= (bVar.f() + h) - 1)) ? k : bVar.k(j2 + 1));
                }
            }
        }
        return j;
    }

    public boolean h(long j, h3.e eVar, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.o(j, eVar, list);
    }

    public int i(long j, List list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.n(j, list);
    }

    public final k.a j(x xVar, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = xVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (xVar.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        int f = W2.b.f(list);
        return new k.a(f, f - this.b.g(list), length, i);
    }

    public final long k(long j, long j2) {
        if (!this.k.d || this.i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j), this.i[0].i(this.i[0].g(j))) - j2);
    }

    public final Pair l(long j, i iVar, b bVar) {
        long j2 = j + 1;
        if (j2 >= bVar.h()) {
            return null;
        }
        i l = bVar.l(j2);
        String a2 = G.a(iVar.b(bVar.c.a), l.b(bVar.c.a));
        String str = l.a + "-";
        if (l.b != -1) {
            str = str + (l.a + l.b);
        }
        return new Pair(a2, str);
    }

    public final long m(long j) {
        X2.c cVar = this.k;
        long j2 = cVar.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - K.K0(j2 + cVar.d(this.l).b);
    }

    public final ArrayList n() {
        List list = this.k.d(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((X2.a) list.get(i)).c);
        }
        return arrayList;
    }

    public final long o(b bVar, h3.m mVar, long j, long j2, long j3) {
        return mVar != null ? mVar.g() : K.q(bVar.j(j), j2, j3);
    }

    public h3.e p(b bVar, R2.f fVar, q qVar, int i, Object obj, i iVar, i iVar2, f.a aVar) {
        i iVar3 = iVar;
        j jVar = bVar.b;
        if (iVar3 != null) {
            i a2 = iVar3.a(iVar2, bVar.c.a);
            if (a2 != null) {
                iVar3 = a2;
            }
        } else {
            iVar3 = (i) P2.a.e(iVar2);
        }
        return new l(fVar, h.a(jVar, bVar.c.a, iVar3, 0, t7.s.o()), qVar, i, obj, bVar.a);
    }

    public h3.e q(b bVar, R2.f fVar, int i, q qVar, int i2, Object obj, long j, int i3, long j2, long j3, f.a aVar) {
        j jVar = bVar.b;
        long k = bVar.k(j);
        i l = bVar.l(j);
        if (bVar.a == null) {
            return new o(fVar, h.a(jVar, bVar.c.a, l, bVar.m(j, j3) ? 0 : 8, t7.s.o()), qVar, i2, obj, k, bVar.i(j), j, i, qVar);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            i a2 = l.a(bVar.l(i4 + j), bVar.c.a);
            if (a2 == null) {
                break;
            }
            i5++;
            i4++;
            l = a2;
        }
        long j4 = (i5 + j) - 1;
        long i6 = bVar.i(j4);
        long a3 = b.a(bVar);
        if (a3 == -9223372036854775807L || a3 > i6) {
            a3 = -9223372036854775807L;
        }
        R2.j a4 = h.a(jVar, bVar.c.a, l, bVar.m(j4, j3) ? 0 : 8, t7.s.o());
        long j5 = -jVar.d;
        if (y.p(qVar.n)) {
            j5 += k;
        }
        return new h3.j(fVar, a4, qVar, i2, obj, k, i6, j2, a3, j, i5, j5, bVar.a);
    }

    public final b r(int i) {
        b bVar = this.i[i];
        X2.b j = this.b.j(bVar.b.c);
        if (j == null || j.equals(bVar.c)) {
            return bVar;
        }
        b d = bVar.d(j);
        this.i[i] = d;
        return d;
    }

    public void release() {
        for (b bVar : this.i) {
            h3.f fVar = bVar.a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }
}
