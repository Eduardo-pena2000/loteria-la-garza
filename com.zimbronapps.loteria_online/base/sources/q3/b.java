package q3;

import L3.s;
import L3.u;
import M2.q;
import M2.y;
import P2.o;
import P2.z;
import java.util.ArrayList;
import o3.G;
import o3.I;
import o3.J;
import o3.O;
import o3.p;
import o3.q;
import o3.r;
import t7.U;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements p {
    public final z a;
    public final c b;
    public final boolean c;
    public final s.a d;
    public int e;
    public r f;
    public q3.c g;
    public long h;
    public e[] i;
    public long j;
    public e k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public class b implements J {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public J.a f(long j) {
            J.a i = b.c(b.this)[0].i(j);
            for (int i2 = 1; i2 < b.c(b.this).length; i2++) {
                J.a i3 = b.c(b.this)[i2].i(j);
                if (i3.a.b < i.a.b) {
                    i = i3;
                }
            }
            return i;
        }

        public boolean i() {
            return true;
        }

        public long l() {
            return this.a;
        }
    }

    public static class c {
        public int a;
        public int b;
        public int c;

        public c() {
        }

        public void a(z zVar) {
            this.a = zVar.t();
            this.b = zVar.t();
            this.c = 0;
        }

        public void b(z zVar) {
            a(zVar);
            if (this.a == 1414744396) {
                this.c = zVar.t();
                return;
            }
            throw M2.z.a("LIST expected, found: " + this.a, null);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public b(int i, s.a aVar) {
        this.d = aVar;
        this.c = (i & 1) == 0;
        this.a = new z(12);
        this.b = new c(null);
        this.f = new G();
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    public static /* synthetic */ e[] c(b bVar) {
        return bVar.i;
    }

    public static void f(q qVar) {
        if ((qVar.b() & 1) == 1) {
            qVar.m(1);
        }
    }

    public void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            eVar.o(j);
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    public void b(r rVar) {
        this.e = 0;
        if (this.c) {
            rVar = new u(rVar, this.d);
        }
        this.f = rVar;
        this.j = -1L;
    }

    public boolean d(q qVar) {
        qVar.p(this.a.e(), 0, 12);
        this.a.T(0);
        if (this.a.t() != 1179011410) {
            return false;
        }
        this.a.U(4);
        return this.a.t() == 541677121;
    }

    public int e(q qVar, I i) {
        if (o(qVar, i)) {
            return 1;
        }
        switch (this.e) {
            case 0:
                if (!d(qVar)) {
                    throw M2.z.a("AVI Header List not found", null);
                }
                qVar.m(12);
                this.e = 1;
                return 0;
            case 1:
                qVar.readFully(this.a.e(), 0, 12);
                this.a.T(0);
                this.b.b(this.a);
                c cVar = this.b;
                if (cVar.c == 1819436136) {
                    this.l = cVar.b;
                    this.e = 2;
                    return 0;
                }
                throw M2.z.a("hdrl expected, found: " + this.b.c, null);
            case 2:
                int i2 = this.l - 4;
                z zVar = new z(i2);
                qVar.readFully(zVar.e(), 0, i2);
                i(zVar);
                this.e = 3;
                return 0;
            case 3:
                if (this.m != -1) {
                    long b2 = qVar.b();
                    long j = this.m;
                    if (b2 != j) {
                        this.j = j;
                        return 0;
                    }
                }
                qVar.p(this.a.e(), 0, 12);
                qVar.f();
                this.a.T(0);
                this.b.a(this.a);
                int t = this.a.t();
                int i3 = this.b.a;
                if (i3 == 1179011410) {
                    qVar.m(12);
                    return 0;
                }
                if (i3 != 1414744396 || t != 1769369453) {
                    this.j = qVar.b() + this.b.b + 8;
                    return 0;
                }
                long b3 = qVar.b();
                this.m = b3;
                this.n = b3 + this.b.b + 8;
                if (!this.p) {
                    if (((q3.c) P2.a.e(this.g)).a()) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.n(new J.b(this.h));
                    this.p = true;
                }
                this.j = qVar.b() + 12;
                this.e = 6;
                return 0;
            case 4:
                qVar.readFully(this.a.e(), 0, 8);
                this.a.T(0);
                int t2 = this.a.t();
                int t3 = this.a.t();
                if (t2 == 829973609) {
                    this.e = 5;
                    this.o = t3;
                } else {
                    this.j = qVar.b() + t3;
                }
                return 0;
            case 5:
                z zVar2 = new z(this.o);
                qVar.readFully(zVar2.e(), 0, this.o);
                k(zVar2);
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                return n(qVar);
            default:
                throw new AssertionError();
        }
    }

    public final e h(int i) {
        for (e eVar : this.i) {
            if (eVar.j(i)) {
                return eVar;
            }
        }
        return null;
    }

    public final void i(z zVar) {
        f c2 = f.c(1819436136, zVar);
        if (c2.getType() != 1819436136) {
            throw M2.z.a("Unexpected header list type " + c2.getType(), null);
        }
        q3.c cVar = (q3.c) c2.b(q3.c.class);
        if (cVar == null) {
            throw M2.z.a("AviHeader not found", null);
        }
        this.g = cVar;
        this.h = cVar.c * cVar.a;
        ArrayList arrayList = new ArrayList();
        U p = c2.a.p();
        int i = 0;
        while (p.hasNext()) {
            q3.a aVar = (q3.a) p.next();
            if (aVar.getType() == 1819440243) {
                int i2 = i + 1;
                e m = m((f) aVar, i);
                if (m != null) {
                    arrayList.add(m);
                }
                i = i2;
            }
        }
        this.i = (e[]) arrayList.toArray(new e[0]);
        this.f.s();
    }

    public final void k(z zVar) {
        long l = l(zVar);
        while (zVar.a() >= 16) {
            int t = zVar.t();
            int t2 = zVar.t();
            long t3 = zVar.t() + l;
            zVar.t();
            e h = h(t);
            if (h != null) {
                if ((t2 & 16) == 16) {
                    h.b(t3);
                }
                h.k();
            }
        }
        for (e eVar : this.i) {
            eVar.c();
        }
        this.p = true;
        this.f.n(new b(this.h));
    }

    public final long l(z zVar) {
        if (zVar.a() < 16) {
            return 0L;
        }
        int f = zVar.f();
        zVar.U(8);
        long t = zVar.t();
        long j = this.m;
        long j2 = t <= j ? j + 8 : 0L;
        zVar.T(f);
        return j2;
    }

    public final e m(f fVar, int i) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            o.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            o.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long a2 = dVar.a();
        M2.q qVar = gVar.a;
        q.b a3 = qVar.a();
        a3.Z(i);
        int i2 = dVar.f;
        if (i2 != 0) {
            a3.f0(i2);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            a3.c0(hVar.a);
        }
        int k = y.k(qVar.n);
        if (k != 1 && k != 2) {
            return null;
        }
        O e = this.f.e(i, k);
        e.b(a3.K());
        e eVar = new e(i, k, a2, dVar.e, e);
        this.h = a2;
        return eVar;
    }

    public final int n(o3.q qVar) {
        if (qVar.b() >= this.n) {
            return -1;
        }
        e eVar = this.k;
        if (eVar == null) {
            f(qVar);
            qVar.p(this.a.e(), 0, 12);
            this.a.T(0);
            int t = this.a.t();
            if (t == 1414744396) {
                this.a.T(8);
                qVar.m(this.a.t() != 1769369453 ? 8 : 12);
                qVar.f();
                return 0;
            }
            int t2 = this.a.t();
            if (t == 1263424842) {
                this.j = qVar.b() + t2 + 8;
                return 0;
            }
            qVar.m(8);
            qVar.f();
            e h = h(t);
            if (h == null) {
                this.j = qVar.b() + t2;
                return 0;
            }
            h.n(t2);
            this.k = h;
        } else if (eVar.m(qVar)) {
            this.k = null;
        }
        return 0;
    }

    public final boolean o(o3.q qVar, I i) {
        boolean z;
        if (this.j != -1) {
            long b2 = qVar.b();
            long j = this.j;
            if (j < b2 || j > 262144 + b2) {
                i.a = j;
                z = true;
            } else {
                qVar.m((int) (j - b2));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        return z;
    }

    public void release() {
    }
}
