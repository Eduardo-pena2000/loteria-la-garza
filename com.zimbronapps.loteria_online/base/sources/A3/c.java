package a3;

import M2.z;
import P2.K;
import R2.s;
import a3.f;
import a3.g;
import a3.i;
import a3.k;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import g3.D;
import g3.r;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k3.k;
import k3.l;
import k3.n;
import t7.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements k, l.b {
    public static final k.a p = new a3.b();
    public final Z2.g a;
    public final j b;
    public final k3.k c;
    public final HashMap d;
    public final CopyOnWriteArrayList e;
    public final double f;
    public D.a g;
    public l h;
    public Handler i;
    public k.e j;
    public g k;
    public Uri l;
    public f m;
    public boolean n;
    public long o;

    public class b implements k.b {
        public b() {
        }

        public void a() {
            c.z(c.this).remove(this);
        }

        public boolean e(Uri uri, k.c cVar, boolean z) {
            c cVar2;
            if (c.A(c.this) == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((g) K.i(c.s(c.this))).e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    c cVar3 = (c) c.B(c.this).get(((g.b) list.get(i2)).a);
                    if (cVar3 != null && elapsedRealtime < c.d(cVar3)) {
                        i++;
                    }
                }
                k.b a = c.E(c.this).a(new k.a(1, 0, c.s(c.this).e.size(), i), cVar);
                if (a != null && a.a == 2 && (cVar2 = (c) c.B(c.this).get(uri)) != null) {
                    c.b(cVar2, a.b);
                }
            }
            return false;
        }

        public /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public final class c implements l.b {
        public final Uri a;
        public final l b = new l("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final R2.f c;
        public f d;
        public long e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public IOException j;
        public boolean k;

        public c(Uri uri) {
            this.a = uri;
            this.c = c.C(c.this).a(4);
        }

        public static /* synthetic */ void a(c cVar, Uri uri) {
            cVar.p(uri);
        }

        public static /* synthetic */ boolean b(c cVar, long j) {
            return cVar.h(j);
        }

        public static /* synthetic */ void c(c cVar, f fVar, r rVar) {
            cVar.x(fVar, rVar);
        }

        public static /* synthetic */ long d(c cVar) {
            return cVar.h;
        }

        public static /* synthetic */ Uri e(c cVar) {
            return cVar.a;
        }

        public static /* synthetic */ void f(c cVar, Uri uri) {
            cVar.s(uri);
        }

        public static /* synthetic */ f g(c cVar) {
            return cVar.d;
        }

        public final boolean h(long j) {
            this.h = SystemClock.elapsedRealtime() + j;
            return this.a.equals(c.x(c.this)) && !c.y(c.this);
        }

        public final Uri j() {
            f fVar = this.d;
            if (fVar != null) {
                f.f fVar2 = fVar.v;
                if (fVar2.a != -9223372036854775807L || fVar2.e) {
                    Uri.Builder buildUpon = this.a.buildUpon();
                    f fVar3 = this.d;
                    if (fVar3.v.e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar3.k + fVar3.r.size()));
                        f fVar4 = this.d;
                        if (fVar4.n != -9223372036854775807L) {
                            List list = fVar4.s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.b) u.d(list)).m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.f fVar5 = this.d.v;
                    if (fVar5.a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar5.b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.a;
        }

        public f l() {
            return this.d;
        }

        public boolean m() {
            return this.k;
        }

        public boolean n() {
            int i;
            if (this.d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, K.j1(this.d.u));
            f fVar = this.d;
            return fVar.o || (i = fVar.d) == 2 || i == 1 || this.e + max > elapsedRealtime;
        }

        public final /* synthetic */ void p(Uri uri) {
            this.i = false;
            r(uri);
        }

        public void q(boolean z) {
            s(z ? j() : this.a);
        }

        public final void r(Uri uri) {
            n nVar = new n(this.c, uri, 4, c.t(c.this).a(c.s(c.this), this.d));
            c.D(c.this).y(new r(nVar.a, nVar.b, this.b.n(nVar, this, c.E(c.this).b(nVar.c))), nVar.c);
        }

        public final void s(Uri uri) {
            this.h = 0L;
            if (this.i || this.b.j() || this.b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.g) {
                r(uri);
            } else {
                this.i = true;
                c.r(c.this).postDelayed(new d(this, uri), this.g - elapsedRealtime);
            }
        }

        public void t() {
            this.b.a();
            IOException iOException = this.j;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void k(n nVar, long j, long j2, boolean z) {
            r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
            c.E(c.this).d(nVar.a);
            c.D(c.this).p(rVar, 4);
        }

        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void i(n nVar, long j, long j2) {
            h hVar = (h) nVar.e();
            r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
            if (hVar instanceof f) {
                x((f) hVar, rVar);
                c.D(c.this).s(rVar, 4);
            } else {
                this.j = z.c("Loaded playlist has unexpected type.", null);
                c.D(c.this).w(rVar, 4, this.j, true);
            }
            c.E(c.this).d(nVar.a);
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public l.c o(n nVar, long j, long j2, IOException iOException, int i) {
            l.c cVar;
            r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
            boolean z = iOException instanceof i.a;
            if ((nVar.f().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof s ? ((s) iOException).d : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.g = SystemClock.elapsedRealtime();
                    q(false);
                    ((D.a) K.i(c.D(c.this))).w(rVar, nVar.c, iOException, true);
                    return l.f;
                }
            }
            k.c cVar2 = new k.c(rVar, new g3.u(nVar.c), iOException, i);
            if (c.q(c.this, this.a, cVar2, false)) {
                long c = c.E(c.this).c(cVar2);
                cVar = c != -9223372036854775807L ? l.h(false, c) : l.g;
            } else {
                cVar = l.f;
            }
            boolean c2 = cVar.c();
            c.D(c.this).w(rVar, nVar.c, iOException, !c2);
            if (!c2) {
                c.E(c.this).d(nVar.a);
            }
            return cVar;
        }

        public final void x(f fVar, r rVar) {
            boolean z;
            f fVar2 = this.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.e = elapsedRealtime;
            f u = c.u(c.this, fVar2, fVar);
            this.d = u;
            IOException iOException = null;
            if (u != fVar2) {
                this.j = null;
                this.f = elapsedRealtime;
                c.v(c.this, this.a, u);
            } else if (!u.o) {
                if (fVar.k + fVar.r.size() < this.d.k) {
                    iOException = new k.c(this.a);
                    z = true;
                } else {
                    z = false;
                    if (elapsedRealtime - this.f > K.j1(r13.m) * c.w(c.this)) {
                        iOException = new k.d(this.a);
                    }
                }
                if (iOException != null) {
                    this.j = iOException;
                    c.q(c.this, this.a, new k.c(rVar, new g3.u(4), iOException, 1), z);
                }
            }
            f fVar3 = this.d;
            this.g = (elapsedRealtime + K.j1(!fVar3.v.e ? fVar3 != fVar2 ? fVar3.m : fVar3.m / 2 : 0L)) - rVar.f;
            if (this.d.o) {
                return;
            }
            if (this.a.equals(c.x(c.this)) || this.k) {
                s(j());
            }
        }

        public void y() {
            this.b.l();
        }

        public void z(boolean z) {
            this.k = z;
        }
    }

    public c(Z2.g gVar, k3.k kVar, j jVar) {
        this(gVar, kVar, jVar, 3.5d);
    }

    public static /* synthetic */ f A(c cVar) {
        return cVar.m;
    }

    public static /* synthetic */ HashMap B(c cVar) {
        return cVar.d;
    }

    public static /* synthetic */ Z2.g C(c cVar) {
        return cVar.a;
    }

    public static /* synthetic */ D.a D(c cVar) {
        return cVar.g;
    }

    public static /* synthetic */ k3.k E(c cVar) {
        return cVar.c;
    }

    public static f.d G(f fVar, f fVar2) {
        int i = (int) (fVar2.k - fVar.k);
        List list = fVar.r;
        if (i < list.size()) {
            return (f.d) list.get(i);
        }
        return null;
    }

    public static /* synthetic */ boolean q(c cVar, Uri uri, k.c cVar2, boolean z) {
        return cVar.P(uri, cVar2, z);
    }

    public static /* synthetic */ Handler r(c cVar) {
        return cVar.i;
    }

    public static /* synthetic */ g s(c cVar) {
        return cVar.k;
    }

    public static /* synthetic */ j t(c cVar) {
        return cVar.b;
    }

    public static /* synthetic */ f u(c cVar, f fVar, f fVar2) {
        return cVar.H(fVar, fVar2);
    }

    public static /* synthetic */ void v(c cVar, Uri uri, f fVar) {
        cVar.T(uri, fVar);
    }

    public static /* synthetic */ double w(c cVar) {
        return cVar.f;
    }

    public static /* synthetic */ Uri x(c cVar) {
        return cVar.l;
    }

    public static /* synthetic */ boolean y(c cVar) {
        return cVar.N();
    }

    public static /* synthetic */ CopyOnWriteArrayList z(c cVar) {
        return cVar.e;
    }

    public final void F(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.d.put(uri, new c(uri));
        }
    }

    public final f H(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.o ? fVar.d() : fVar : fVar2.c(J(fVar, fVar2), I(fVar, fVar2));
    }

    public final int I(f fVar, f fVar2) {
        if (fVar2.i) {
            return fVar2.j;
        }
        f fVar3 = this.m;
        int i = fVar3 != null ? fVar3.j : 0;
        if (fVar == null) {
            return i;
        }
        f.d G = G(fVar, fVar2);
        return G != null ? (fVar.j + G.d) - ((f.d) fVar2.r.get(0)).d : i;
    }

    public final long J(f fVar, f fVar2) {
        if (fVar2.p) {
            return fVar2.h;
        }
        f fVar3 = this.m;
        long j = fVar3 != null ? fVar3.h : 0L;
        if (fVar == null) {
            return j;
        }
        int size = fVar.r.size();
        f.d G = G(fVar, fVar2);
        return G != null ? fVar.h + G.e : ((long) size) == fVar2.k - fVar.k ? fVar.e() : j;
    }

    public final Uri K(Uri uri) {
        f.c cVar;
        f fVar = this.m;
        if (fVar == null || !fVar.v.e || (cVar = (f.c) fVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.b));
        int i = cVar.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean L(Uri uri) {
        List list = this.k.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((g.b) list.get(i)).a)) {
                return true;
            }
        }
        return false;
    }

    public final void M(Uri uri) {
        c cVar = (c) this.d.get(uri);
        f l = cVar.l();
        if (cVar.m()) {
            return;
        }
        cVar.z(true);
        if (l == null || l.o) {
            return;
        }
        cVar.q(true);
    }

    public final boolean N() {
        List list = this.k.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            c cVar = (c) P2.a.e((c) this.d.get(((g.b) list.get(i)).a));
            if (elapsedRealtime > c.d(cVar)) {
                Uri e = c.e(cVar);
                this.l = e;
                c.f(cVar, K(e));
                return true;
            }
        }
        return false;
    }

    public final void O(Uri uri) {
        if (uri.equals(this.l) || !L(uri)) {
            return;
        }
        f fVar = this.m;
        if (fVar == null || !fVar.o) {
            this.l = uri;
            c cVar = (c) this.d.get(uri);
            f g = c.g(cVar);
            if (g == null || !g.o) {
                c.f(cVar, K(uri));
            } else {
                this.m = g;
                this.j.q(g);
            }
        }
    }

    public final boolean P(Uri uri, k.c cVar, boolean z) {
        Iterator it = this.e.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((k.b) it.next()).e(uri, cVar, z);
        }
        return z2;
    }

    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void k(n nVar, long j, long j2, boolean z) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        this.c.d(nVar.a);
        this.g.p(rVar, 4);
    }

    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void i(n nVar, long j, long j2) {
        h hVar = (h) nVar.e();
        boolean z = hVar instanceof f;
        g e = z ? g.e(hVar.a) : (g) hVar;
        this.k = e;
        this.l = ((g.b) e.e.get(0)).a;
        this.e.add(new b(this, null));
        F(e.d);
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        c cVar = (c) this.d.get(this.l);
        if (z) {
            c.c(cVar, (f) hVar, rVar);
        } else {
            cVar.q(false);
        }
        this.c.d(nVar.a);
        this.g.s(rVar, 4);
    }

    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public l.c o(n nVar, long j, long j2, IOException iOException, int i) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        long c2 = this.c.c(new k.c(rVar, new g3.u(nVar.c), iOException, i));
        boolean z = c2 == -9223372036854775807L;
        this.g.w(rVar, nVar.c, iOException, z);
        if (z) {
            this.c.d(nVar.a);
        }
        return z ? l.g : l.h(false, c2);
    }

    public final void T(Uri uri, f fVar) {
        if (uri.equals(this.l)) {
            if (this.m == null) {
                this.n = !fVar.o;
                this.o = fVar.h;
            }
            this.m = fVar;
            this.j.q(fVar);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).a();
        }
    }

    public void a(k.b bVar) {
        this.e.remove(bVar);
    }

    public void b(Uri uri) {
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            cVar.z(false);
        }
    }

    public void c(Uri uri) {
        ((c) this.d.get(uri)).t();
    }

    public void d(Uri uri, D.a aVar, k.e eVar) {
        this.i = K.A();
        this.g = aVar;
        this.j = eVar;
        n nVar = new n(this.a.a(4), uri, 4, this.b.b());
        P2.a.f(this.h == null);
        l lVar = new l("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.h = lVar;
        aVar.y(new r(nVar.a, nVar.b, lVar.n(nVar, this, this.c.b(nVar.c))), nVar.c);
    }

    public long e() {
        return this.o;
    }

    public g f() {
        return this.k;
    }

    public void g(Uri uri) {
        ((c) this.d.get(uri)).q(true);
    }

    public boolean h(Uri uri) {
        return ((c) this.d.get(uri)).n();
    }

    public boolean j() {
        return this.n;
    }

    public boolean l(Uri uri, long j) {
        if (((c) this.d.get(uri)) != null) {
            return !c.b(r2, j);
        }
        return false;
    }

    public void m() {
        l lVar = this.h;
        if (lVar != null) {
            lVar.a();
        }
        Uri uri = this.l;
        if (uri != null) {
            c(uri);
        }
    }

    public f n(Uri uri, boolean z) {
        f l = ((c) this.d.get(uri)).l();
        if (l != null && z) {
            O(uri);
            M(uri);
        }
        return l;
    }

    public void p(k.b bVar) {
        P2.a.e(bVar);
        this.e.add(bVar);
    }

    public void stop() {
        this.l = null;
        this.m = null;
        this.k = null;
        this.o = -9223372036854775807L;
        this.h.l();
        this.h = null;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).y();
        }
        this.i.removeCallbacksAndMessages((Object) null);
        this.i = null;
        this.d.clear();
    }

    public c(Z2.g gVar, k3.k kVar, j jVar, double d) {
        this.a = gVar;
        this.b = jVar;
        this.c = kVar;
        this.f = d;
        this.e = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.o = -9223372036854775807L;
    }
}
