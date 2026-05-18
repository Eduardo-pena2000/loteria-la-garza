package U3;

import M2.h;
import M2.q;
import Q2.d;
import U3.K;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p implements m {
    public final F a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public O j;
    public b k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final w d = new w(7, 128);
    public final w e = new w(8, 128);
    public final w f = new w(6, 128);
    public long m = -9223372036854775807L;
    public final P2.z o = new P2.z();

    public static final class b {
        public final O a;
        public final boolean b;
        public final boolean c;
        public final Q2.e f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public a m = new a(null);
        public a n = new a(null);

        public static final class a {
            public boolean a;
            public boolean b;
            public d.c c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public static /* synthetic */ boolean a(a aVar, a aVar2) {
                return aVar.c(aVar2);
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public final boolean c(a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.a) {
                    return false;
                }
                if (!aVar.a) {
                    return true;
                }
                d.c cVar = (d.c) P2.a.h(this.c);
                d.c cVar2 = (d.c) P2.a.h(aVar.c);
                return (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && (!this.i || !aVar.i || this.j == aVar.j) && (((i = this.d) == (i2 = aVar.d) || (i != 0 && i2 != 0)) && (((i3 = cVar.n) != 0 || cVar2.n != 0 || (this.m == aVar.m && this.n == aVar.n)) && ((i3 != 1 || cVar2.n != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == aVar.k && (!z || this.l == aVar.l))))) ? false : true;
            }

            public boolean d() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            public void e(d.c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = cVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        public b(O o, boolean z, boolean z2) {
            this.a = o;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new Q2.e(bArr, 0, 0);
            h();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: U3.p.b.a(byte[], int, int):void");
        }

        public void b(long j) {
            i();
            this.j = j;
            e(0);
            this.o = false;
        }

        public boolean c(long j, int i, boolean z) {
            if (this.i == 9 || (this.c && a.a(this.n, this.m))) {
                if (z && this.o) {
                    e(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            i();
            return this.r;
        }

        public boolean d() {
            return this.c;
        }

        public final void e(int i) {
            long j = this.q;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.r;
            this.a.a(j, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void f(d.b bVar) {
            this.e.append(bVar.a, bVar);
        }

        public void g(d.c cVar) {
            this.d.append(cVar.d, cVar);
        }

        public void h() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public final void i() {
            boolean d = this.b ? this.n.d() : this.s;
            boolean z = this.r;
            int i = this.i;
            boolean z2 = true;
            if (i != 5 && (!d || i != 1)) {
                z2 = false;
            }
            this.r = z | z2;
        }

        public void j(long j, int i, long j2, boolean z) {
            this.i = i;
            this.l = j2;
            this.j = j;
            this.s = z;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public p(F f, boolean z, boolean z2) {
        this.a = f;
        this.b = z;
        this.c = z2;
    }

    private void b() {
        P2.a.h(this.j);
        P2.K.i(this.k);
    }

    public void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        Q2.d.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b bVar = this.k;
        if (bVar != null) {
            bVar.h();
        }
    }

    public void c(P2.z zVar) {
        b();
        int f = zVar.f();
        int g = zVar.g();
        byte[] e = zVar.e();
        this.g += zVar.a();
        this.j.f(zVar, zVar.a());
        while (true) {
            int c = Q2.d.c(e, f, g, this.h);
            if (c == g) {
                h(e, f, g);
                return;
            }
            int f2 = Q2.d.f(e, c);
            int i = c - f;
            if (i > 0) {
                h(e, f, c);
            }
            int i2 = g - c;
            long j = this.g - i2;
            g(j, i2, i < 0 ? -i : 0, this.m);
            i(j, f2, this.m);
            f = c + 3;
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.i = dVar.b();
        O e = rVar.e(dVar.c(), 2);
        this.j = e;
        this.k = new b(e, this.b, this.c);
        this.a.b(rVar, dVar);
    }

    public void e(boolean z) {
        b();
        if (z) {
            this.k.b(this.g);
        }
    }

    public void f(long j, int i) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    public final void g(long j, int i, int i2, long j2) {
        if (!this.l || this.k.d()) {
            this.d.b(i2);
            this.e.b(i2);
            if (this.l) {
                if (this.d.c()) {
                    w wVar = this.d;
                    this.k.g(Q2.d.l(wVar.d, 3, wVar.e));
                    this.d.d();
                } else if (this.e.c()) {
                    w wVar2 = this.e;
                    this.k.f(Q2.d.j(wVar2.d, 3, wVar2.e));
                    this.e.d();
                }
            } else if (this.d.c() && this.e.c()) {
                List arrayList = new ArrayList();
                w wVar3 = this.d;
                arrayList.add(Arrays.copyOf(wVar3.d, wVar3.e));
                w wVar4 = this.e;
                arrayList.add(Arrays.copyOf(wVar4.d, wVar4.e));
                w wVar5 = this.d;
                d.c l = Q2.d.l(wVar5.d, 3, wVar5.e);
                w wVar6 = this.e;
                d.b j3 = Q2.d.j(wVar6.d, 3, wVar6.e);
                this.j.b(new q.b().a0(this.i).o0("video/avc").O(P2.d.a(l.a, l.b, l.c)).v0(l.f).Y(l.g).P(new h.b().d(l.q).c(l.r).e(l.s).g(l.i + 8).b(l.j + 8).a()).k0(l.h).b0(arrayList).g0(l.t).K());
                this.l = true;
                this.k.g(l);
                this.k.f(j3);
                this.d.d();
                this.e.d();
            }
        }
        if (this.f.b(i2)) {
            w wVar7 = this.f;
            this.o.R(this.f.d, Q2.d.r(wVar7.d, wVar7.e));
            this.o.T(4);
            this.a.a(j2, this.o);
        }
        if (this.k.c(j, i, this.l)) {
            this.n = false;
        }
    }

    public final void h(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.d()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.d()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.k.j(j, i, j2, this.n);
    }
}
