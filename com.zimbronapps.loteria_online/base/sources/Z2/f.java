package Z2;

import M2.H;
import P2.G;
import P2.K;
import R2.j;
import T2.a1;
import T2.x0;
import U2.x1;
import a3.f;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import j3.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k3.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    public final h a;
    public final R2.f b;
    public final R2.f c;
    public final v d;
    public final Uri[] e;
    public final M2.q[] f;
    public final a3.k g;
    public final H h;
    public final List i;
    public final x1 k;
    public final long l;
    public boolean m;
    public IOException o;
    public Uri p;
    public boolean q;
    public x r;
    public boolean t;
    public long u = -9223372036854775807L;
    public final Z2.e j = new Z2.e(4);
    public byte[] n = K.f;
    public long s = -9223372036854775807L;

    public static final class a extends h3.k {
        public byte[] l;

        public a(R2.f fVar, R2.j jVar, M2.q qVar, int i, Object obj, byte[] bArr) {
            super(fVar, jVar, 3, qVar, i, obj, bArr);
        }

        public void g(byte[] bArr, int i) {
            this.l = Arrays.copyOf(bArr, i);
        }

        public byte[] j() {
            return this.l;
        }
    }

    public static final class b {
        public h3.e a;
        public boolean b;
        public Uri c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    public static final class c extends h3.b {
        public final List e;
        public final long f;
        public final String g;

        public c(String str, long j, List list) {
            super(0L, list.size() - 1);
            this.g = str;
            this.f = j;
            this.e = list;
        }

        public long a() {
            c();
            return this.f + ((f.e) this.e.get((int) d())).e;
        }

        public long b() {
            c();
            f.e eVar = (f.e) this.e.get((int) d());
            return this.f + eVar.e + eVar.c;
        }
    }

    public static final class d extends j3.c {
        public int h;

        public d(H h, int[] iArr) {
            super(h, iArr);
            this.h = u(h.a(iArr[0]));
        }

        public int b() {
            return this.h;
        }

        public Object h() {
            return null;
        }

        public void p(long j, long j2, long j3, List list, h3.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.h, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!a(i, elapsedRealtime)) {
                        this.h = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int s() {
            return 0;
        }
    }

    public static final class e {
        public final f.e a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(f.e eVar, long j, int i) {
            this.a = eVar;
            this.b = j;
            this.c = i;
            this.d = (eVar instanceof f.b) && ((f.b) eVar).m;
        }
    }

    public f(h hVar, a3.k kVar, Uri[] uriArr, M2.q[] qVarArr, g gVar, R2.x xVar, v vVar, long j, List list, x1 x1Var, k3.e eVar) {
        this.a = hVar;
        this.g = kVar;
        this.e = uriArr;
        this.f = qVarArr;
        this.d = vVar;
        this.l = j;
        this.i = list;
        this.k = x1Var;
        R2.f a2 = gVar.a(1);
        this.b = a2;
        if (xVar != null) {
            a2.l(xVar);
        }
        this.c = gVar.a(3);
        this.h = new H(qVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((qVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.r = new d(this.h, w7.f.m(arrayList));
    }

    public static Uri e(a3.f fVar, f.e eVar) {
        String str;
        if (eVar == null || (str = eVar.g) == null) {
            return null;
        }
        return G.f(fVar.a, str);
    }

    public static e h(a3.f fVar, long j, int i) {
        int i2 = (int) (j - fVar.k);
        if (i2 == fVar.r.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < fVar.s.size()) {
                return new e((f.e) fVar.s.get(i), j, i);
            }
            return null;
        }
        f.d dVar = (f.d) fVar.r.get(i2);
        if (i == -1) {
            return new e(dVar, j, -1);
        }
        if (i < dVar.m.size()) {
            return new e((f.e) dVar.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < fVar.r.size()) {
            return new e((f.e) fVar.r.get(i3), j + 1, -1);
        }
        if (fVar.s.isEmpty()) {
            return null;
        }
        return new e((f.e) fVar.s.get(0), j + 1, 0);
    }

    public static List j(a3.f fVar, long j, int i) {
        int i2 = (int) (j - fVar.k);
        if (i2 < 0 || fVar.r.size() < i2) {
            return t7.r.s();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < fVar.r.size()) {
            if (i != -1) {
                f.d dVar = (f.d) fVar.r.get(i2);
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i < dVar.m.size()) {
                    List list = dVar.m;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            List list2 = fVar.r;
            arrayList.addAll(list2.subList(i2, list2.size()));
            i = 0;
        }
        if (fVar.n != -9223372036854775807L) {
            int i3 = i != -1 ? i : 0;
            if (i3 < fVar.s.size()) {
                List list3 = fVar.s;
                arrayList.addAll(list3.subList(i3, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public h3.n[] a(j jVar, long j) {
        int i;
        int b2 = jVar == null ? -1 : this.h.b(jVar.d);
        int length = this.r.length();
        h3.n[] nVarArr = new h3.n[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int d2 = this.r.d(i2);
            Uri uri = this.e[d2];
            if (this.g.h(uri)) {
                a3.f n = this.g.n(uri, z);
                P2.a.e(n);
                long e2 = n.h - this.g.e();
                i = i2;
                Pair g = g(jVar, d2 != b2 ? true : z, n, e2, j);
                nVarArr[i] = new c(n.a, e2, j(n, ((Long) g.first).longValue(), ((Integer) g.second).intValue()));
            } else {
                nVarArr[i2] = h3.n.a;
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        return nVarArr;
    }

    public final void b() {
        this.g.b(this.e[this.r.q()]);
    }

    public long c(long j, a1 a1Var) {
        int b2 = this.r.b();
        Uri[] uriArr = this.e;
        a3.f n = (b2 >= uriArr.length || b2 == -1) ? null : this.g.n(uriArr[this.r.q()], true);
        if (n == null || n.r.isEmpty() || !n.c) {
            return j;
        }
        long e2 = n.h - this.g.e();
        long j2 = j - e2;
        int f = K.f(n.r, Long.valueOf(j2), true, true);
        long j3 = ((f.d) n.r.get(f)).e;
        return a1Var.a(j2, j3, f != n.r.size() - 1 ? ((f.d) n.r.get(f + 1)).e : j3) + e2;
    }

    public int d(j jVar) {
        if (jVar.o == -1) {
            return 1;
        }
        a3.f fVar = (a3.f) P2.a.e(this.g.n(this.e[this.h.b(jVar.d)], false));
        int i = (int) (jVar.j - fVar.k);
        if (i < 0) {
            return 1;
        }
        List list = i < fVar.r.size() ? ((f.d) fVar.r.get(i)).m : fVar.s;
        if (jVar.o >= list.size()) {
            return 2;
        }
        f.b bVar = (f.b) list.get(jVar.o);
        if (bVar.m) {
            return 0;
        }
        return K.c(Uri.parse(G.e(fVar.a, bVar.a)), jVar.b.a) ? 1 : 2;
    }

    public void f(x0 x0Var, long j, List list, boolean z, b bVar) {
        int b2;
        x0 x0Var2;
        a3.f fVar;
        long j2;
        j jVar = list.isEmpty() ? null : (j) t7.u.d(list);
        if (jVar == null) {
            x0Var2 = x0Var;
            b2 = -1;
        } else {
            b2 = this.h.b(jVar.d);
            x0Var2 = x0Var;
        }
        long j3 = x0Var2.a;
        long j4 = j - j3;
        long u = u(j3);
        if (jVar != null && !this.q) {
            long d2 = jVar.d();
            j4 = Math.max(0L, j4 - d2);
            if (u != -9223372036854775807L) {
                u = Math.max(0L, u - d2);
            }
        }
        this.r.p(j3, j4, u, list, a(jVar, j));
        int q = this.r.q();
        boolean z2 = b2 != q;
        Uri uri = this.e[q];
        if (!this.g.h(uri)) {
            bVar.c = uri;
            this.t &= uri.equals(this.p);
            this.p = uri;
            return;
        }
        a3.f n = this.g.n(uri, true);
        P2.a.e(n);
        this.q = n.c;
        y(n);
        long e2 = n.h - this.g.e();
        Uri uri2 = uri;
        Pair g = g(jVar, z2, n, e2, j);
        long longValue = ((Long) g.first).longValue();
        int intValue = ((Integer) g.second).intValue();
        if (longValue >= n.k || jVar == null || !z2) {
            fVar = n;
            j2 = e2;
        } else {
            uri2 = this.e[b2];
            a3.f n2 = this.g.n(uri2, true);
            P2.a.e(n2);
            j2 = n2.h - this.g.e();
            Pair g2 = g(jVar, false, n2, j2, j);
            longValue = ((Long) g2.first).longValue();
            intValue = ((Integer) g2.second).intValue();
            fVar = n2;
            q = b2;
        }
        if (q != b2 && b2 != -1) {
            this.g.b(this.e[b2]);
        }
        if (longValue < fVar.k) {
            this.o = new g3.b();
            return;
        }
        e h = h(fVar, longValue, intValue);
        if (h == null) {
            if (!fVar.o) {
                bVar.c = uri2;
                this.t &= uri2.equals(this.p);
                this.p = uri2;
                return;
            } else {
                if (z || fVar.r.isEmpty()) {
                    bVar.b = true;
                    return;
                }
                h = new e((f.e) t7.u.d(fVar.r), (fVar.k + fVar.r.size()) - 1, -1);
            }
        }
        this.t = false;
        this.p = null;
        this.u = SystemClock.elapsedRealtime();
        Uri e3 = e(fVar, h.a.b);
        h3.e n3 = n(e3, q, true, null);
        bVar.a = n3;
        if (n3 != null) {
            return;
        }
        Uri e4 = e(fVar, h.a);
        h3.e n4 = n(e4, q, false, null);
        bVar.a = n4;
        if (n4 != null) {
            return;
        }
        boolean w = j.w(jVar, uri2, fVar, h, j2);
        if (w && h.d) {
            return;
        }
        bVar.a = j.j(this.a, this.b, this.f[q], j2, fVar, h, uri2, this.i, this.r.s(), this.r.h(), this.m, this.d, this.l, jVar, this.j.a(e4), this.j.a(e3), w, this.k, null);
    }

    public final Pair g(j jVar, boolean z, a3.f fVar, long j, long j2) {
        if (jVar != null && !z) {
            if (!jVar.h()) {
                return new Pair(Long.valueOf(jVar.j), Integer.valueOf(jVar.o));
            }
            Long valueOf = Long.valueOf(jVar.o == -1 ? jVar.g() : jVar.j);
            int i = jVar.o;
            return new Pair(valueOf, Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = fVar.u + j;
        if (jVar != null && !this.q) {
            j2 = jVar.g;
        }
        if (!fVar.o && j2 >= j3) {
            return new Pair(Long.valueOf(fVar.k + fVar.r.size()), -1);
        }
        long j4 = j2 - j;
        int i2 = 0;
        int f = K.f(fVar.r, Long.valueOf(j4), true, !this.g.j() || jVar == null);
        long j5 = f + fVar.k;
        if (f >= 0) {
            f.d dVar = (f.d) fVar.r.get(f);
            List list = j4 < dVar.e + dVar.c ? dVar.m : fVar.s;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                f.b bVar = (f.b) list.get(i2);
                if (j4 >= bVar.e + bVar.c) {
                    i2++;
                } else if (bVar.l) {
                    j5 += list == fVar.s ? 1L : 0L;
                    r1 = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j5), Integer.valueOf(r1));
    }

    public int i(long j, List list) {
        return (this.o != null || this.r.length() < 2) ? list.size() : this.r.n(j, list);
    }

    public H k() {
        return this.h;
    }

    public x l() {
        return this.r;
    }

    public boolean m() {
        return this.q;
    }

    public final h3.e n(Uri uri, int i, boolean z, f.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] c2 = this.j.c(uri);
        if (c2 != null) {
            this.j.b(uri, c2);
            return null;
        }
        return new a(this.c, new j.b().i(uri).b(1).a(), this.f[i], this.r.s(), this.r.h(), this.n);
    }

    public boolean o(h3.e eVar, long j) {
        x xVar = this.r;
        return xVar.e(xVar.j(this.h.b(eVar.d)), j);
    }

    public void p() {
        IOException iOException = this.o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.p;
        if (uri == null || !this.t) {
            return;
        }
        this.g.c(uri);
    }

    public boolean q(Uri uri) {
        return K.s(this.e, uri);
    }

    public void r(h3.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.n = aVar.h();
            this.j.b(aVar.b.a, (byte[]) P2.a.e(aVar.j()));
        }
    }

    public boolean s(Uri uri, long j) {
        int j2;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (j2 = this.r.j(i)) == -1) {
            return true;
        }
        this.t |= uri.equals(this.p);
        return j == -9223372036854775807L || (this.r.e(j2, j) && this.g.l(uri, j));
    }

    public void t() {
        b();
        this.o = null;
    }

    public final long u(long j) {
        long j2 = this.s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    public void v(boolean z) {
        this.m = z;
    }

    public void w(x xVar) {
        b();
        this.r = xVar;
    }

    public boolean x(long j, h3.e eVar, List list) {
        if (this.o != null) {
            return false;
        }
        return this.r.o(j, eVar, list);
    }

    public final void y(a3.f fVar) {
        this.s = fVar.o ? -9223372036854775807L : fVar.e() - this.g.e();
    }
}
