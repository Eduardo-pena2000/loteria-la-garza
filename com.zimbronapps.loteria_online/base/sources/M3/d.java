package m3;

import M2.D;
import M2.K;
import M2.L;
import M2.M;
import M2.N;
import M2.q;
import M2.r;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import m3.D;
import m3.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements E, M {
    public static final Executor n = new m3.b();
    public final Context a;
    public final h b;
    public final o c;
    public final r d;
    public final D.a e;
    public final P2.c f;
    public final CopyOnWriteArraySet g;
    public M2.q h;
    public n i;
    public P2.k j;
    public Pair k;
    public int l;
    public int m;

    public static final class b {
        public final Context a;
        public final o b;
        public L.a c;
        public D.a d;
        public P2.c e = P2.c.a;
        public boolean f;

        public b(Context context, o oVar) {
            this.a = context.getApplicationContext();
            this.b = oVar;
        }

        public static /* synthetic */ Context a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ P2.c b(b bVar) {
            return bVar.e;
        }

        public static /* synthetic */ o c(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ D.a d(b bVar) {
            return bVar.d;
        }

        public d e() {
            P2.a.f(!this.f);
            if (this.d == null) {
                if (this.c == null) {
                    this.c = new e(null);
                }
                this.d = new f(this.c);
            }
            d dVar = new d(this, null);
            this.f = true;
            return dVar;
        }

        public b f(P2.c cVar) {
            this.e = cVar;
            return this;
        }
    }

    public final class c implements r.a {
        public c() {
        }

        public void a() {
            Iterator it = d.m(d.this).iterator();
            while (it.hasNext()) {
                ((d) it.next()).o(d.this);
            }
            d.q(d.this);
            android.support.v4.media.session.b.a(P2.a.h(null));
            throw null;
        }

        public void b(long j, long j2, long j3, boolean z) {
            if (z && d.n(d.this) != null) {
                Iterator it = d.m(d.this).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(d.this);
                }
            }
            if (d.o(d.this) != null) {
                d.o(d.this).a(j2, d.p(d.this).nanoTime(), d.k(d.this) == null ? new q.b().K() : d.k(d.this), null);
            }
            d.q(d.this);
            android.support.v4.media.session.b.a(P2.a.h(null));
            throw null;
        }

        public void c(N n) {
            d.l(d.this, new q.b().v0(n.a).Y(n.b).o0("video/raw").K());
            Iterator it = d.m(d.this).iterator();
            while (it.hasNext()) {
                ((d) it.next()).u(d.this, n);
            }
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this();
        }
    }

    public interface d {
        void c(d dVar);

        void o(d dVar);

        void u(d dVar, N n);
    }

    public static final class e implements L.a {
        public static final s7.s a = s7.t.a(new m3.e());

        public e() {
        }

        public static /* synthetic */ L.a a() {
            return b();
        }

        public static /* synthetic */ L.a b() {
            try {
                Class cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (L.a) P2.a.e(cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static final class f implements D.a {
        public final L.a a;

        public f(L.a aVar) {
            this.a = aVar;
        }

        public M2.D a(Context context, M2.h hVar, M2.k kVar, M m, Executor executor, List list, long j) {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                ((D.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[]{L.a.class}).newInstance(new Object[]{this.a})).a(context, hVar, kVar, m, executor, list, j);
                return null;
            } catch (Exception e2) {
                e = e2;
                throw K.a(e);
            }
        }
    }

    public static final class g {
        public static Constructor a;
        public static Method b;
        public static Method c;

        public static M2.n a(float f) {
            try {
                b();
                Object newInstance = a.newInstance((Object[]) null);
                b.invoke(newInstance, new Object[]{Float.valueOf(f)});
                android.support.v4.media.session.b.a(P2.a.e(c.invoke(newInstance, (Object[]) null)));
                return null;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        public static void b() {
            if (a == null || b == null || c == null) {
                Class cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                a = cls.getConstructor((Class[]) null);
                b = cls.getMethod("setRotationDegrees", new Class[]{Float.TYPE});
                c = cls.getMethod("build", (Class[]) null);
            }
        }
    }

    public final class h implements D, d {
        public final Context a;
        public final int b;
        public M2.q d;
        public int e;
        public long f;
        public long g;
        public boolean h;
        public boolean k;
        public long l;
        public final ArrayList c = new ArrayList();
        public long i = -9223372036854775807L;
        public long j = -9223372036854775807L;
        public D.a m = D.a.a;
        public Executor n = d.r();

        public h(Context context) {
            this.a = context;
            this.b = P2.K.b0(context);
        }

        public static /* synthetic */ void x(h hVar, D.a aVar) {
            hVar.B(aVar);
        }

        public static /* synthetic */ void y(h hVar, D.a aVar) {
            hVar.A(aVar);
        }

        public static /* synthetic */ void z(h hVar, D.a aVar, N n) {
            hVar.C(aVar, n);
        }

        public final /* synthetic */ void A(D.a aVar) {
            aVar.b(this);
        }

        public final /* synthetic */ void B(D.a aVar) {
            aVar.c((D) P2.a.h(this));
        }

        public final /* synthetic */ void C(D.a aVar, N n) {
            aVar.a(this, n);
        }

        public final void D() {
            if (this.d == null) {
                return;
            }
            new ArrayList().addAll(this.c);
            M2.q qVar = (M2.q) P2.a.e(this.d);
            android.support.v4.media.session.b.a(P2.a.h(null));
            new r.b(d.j(qVar.A), qVar.t, qVar.u).b(qVar.x).a();
            throw null;
        }

        public void E(List list) {
            this.c.clear();
            this.c.addAll(list);
        }

        public long a(long j, boolean z) {
            P2.a.f(isInitialized());
            P2.a.f(this.b != -1);
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                if (!d.g(d.this, j2)) {
                    return -9223372036854775807L;
                }
                D();
                this.l = -9223372036854775807L;
            }
            android.support.v4.media.session.b.a(P2.a.h(null));
            throw null;
        }

        public boolean b() {
            if (isInitialized()) {
                long j = this.i;
                if (j != -9223372036854775807L && d.g(d.this, j)) {
                    return true;
                }
            }
            return false;
        }

        public void c(d dVar) {
            this.n.execute(new m3.h(this, this.m));
        }

        public void d() {
            d.s(d.this).l();
        }

        public void e() {
            d.s(d.this).a();
        }

        public void f(List list) {
            if (this.c.equals(list)) {
                return;
            }
            E(list);
            D();
        }

        public void g(long j, long j2) {
            this.h |= (this.f == j && this.g == j2) ? false : true;
            this.f = j;
            this.g = j2;
        }

        public void h(long j, long j2) {
            try {
                d.this.G(j, j2);
            } catch (T2.u e) {
                M2.q qVar = this.d;
                if (qVar == null) {
                    qVar = new q.b().K();
                }
                throw new D.b(e, qVar);
            }
        }

        public boolean i() {
            return P2.K.B0(this.a);
        }

        public boolean isInitialized() {
            return false;
        }

        public boolean isReady() {
            return isInitialized() && d.f(d.this);
        }

        public void j(Surface surface, P2.A a) {
            d.this.H(surface, a);
        }

        public void k(n nVar) {
            d.h(d.this, nVar);
        }

        public void l(boolean z) {
            d.s(d.this).h(z);
        }

        public Surface m() {
            P2.a.f(isInitialized());
            android.support.v4.media.session.b.a(P2.a.h(null));
            throw null;
        }

        public void n() {
            d.s(d.this).k();
        }

        public void o(d dVar) {
            this.n.execute(new m3.g(this, this.m));
        }

        public void p() {
            d.s(d.this).g();
        }

        public void q(float f) {
            d.i(d.this, f);
        }

        public void r() {
            d.this.v();
        }

        public void release() {
            d.this.F();
        }

        public void s(int i, M2.q qVar) {
            int i2;
            P2.a.f(isInitialized());
            if (i != 1 && i != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i);
            }
            d.s(d.this).p(qVar.v);
            if (i == 1 && P2.K.a < 21 && (i2 = qVar.w) != -1 && i2 != 0) {
                g.a(i2);
            }
            this.e = i;
            this.d = qVar;
            if (this.k) {
                P2.a.f(this.j != -9223372036854775807L);
                this.l = this.j;
            } else {
                D();
                this.k = true;
                this.l = -9223372036854775807L;
            }
        }

        public void t(M2.q qVar) {
            P2.a.f(!isInitialized());
            d.t(d.this, qVar);
        }

        public void u(d dVar, N n) {
            this.n.execute(new m3.f(this, this.m, n));
        }

        public void v(boolean z) {
            if (isInitialized()) {
                throw null;
            }
            this.k = false;
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
            d.e(d.this);
            if (z) {
                d.s(d.this).m();
            }
        }

        public void w(D.a aVar, Executor executor) {
            this.m = aVar;
            this.n = executor;
        }
    }

    public /* synthetic */ d(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.x();
    }

    public static /* synthetic */ void d(Runnable runnable) {
        D(runnable);
    }

    public static /* synthetic */ void e(d dVar) {
        dVar.w();
    }

    public static /* synthetic */ boolean f(d dVar) {
        return dVar.C();
    }

    public static /* synthetic */ boolean g(d dVar, long j) {
        return dVar.z(j);
    }

    public static /* synthetic */ void h(d dVar, n nVar) {
        dVar.J(nVar);
    }

    public static /* synthetic */ void i(d dVar, float f2) {
        dVar.I(f2);
    }

    public static /* synthetic */ M2.h j(M2.h hVar) {
        return y(hVar);
    }

    public static /* synthetic */ M2.q k(d dVar) {
        return dVar.h;
    }

    public static /* synthetic */ M2.q l(d dVar, M2.q qVar) {
        dVar.h = qVar;
        return qVar;
    }

    public static /* synthetic */ CopyOnWriteArraySet m(d dVar) {
        return dVar.g;
    }

    public static /* synthetic */ Pair n(d dVar) {
        return dVar.k;
    }

    public static /* synthetic */ n o(d dVar) {
        return dVar.i;
    }

    public static /* synthetic */ P2.c p(d dVar) {
        return dVar.f;
    }

    public static /* synthetic */ M2.D q(d dVar) {
        dVar.getClass();
        return null;
    }

    public static /* synthetic */ Executor r() {
        return n;
    }

    public static /* synthetic */ o s(d dVar) {
        return dVar.c;
    }

    public static /* synthetic */ L t(d dVar, M2.q qVar) {
        dVar.A(qVar);
        return null;
    }

    public static M2.h y(M2.h hVar) {
        return (hVar == null || !hVar.g()) ? M2.h.h : hVar;
    }

    public final L A(M2.q qVar) {
        P2.a.f(this.m == 0);
        M2.h y = y(qVar.A);
        if (y.c == 7 && P2.K.a < 34) {
            y = y.a().e(6).a();
        }
        M2.h hVar = y;
        P2.k d2 = this.f.d((Looper) P2.a.h(Looper.myLooper()), null);
        this.j = d2;
        try {
            D.a aVar = this.e;
            Context context = this.a;
            M2.k kVar = M2.k.a;
            Objects.requireNonNull(d2);
            aVar.a(context, hVar, kVar, this, new m3.a(d2), t7.r.s(), 0L);
            Pair pair = this.k;
            if (pair == null) {
                throw null;
            }
            Surface surface = (Surface) pair.first;
            P2.A a2 = (P2.A) pair.second;
            E(surface, a2.b(), a2.a());
            throw null;
        } catch (K e2) {
            throw new D.b(e2, qVar);
        }
    }

    public final boolean B() {
        return this.m == 1;
    }

    public final boolean C() {
        return this.l == 0 && this.d.e();
    }

    public void F() {
        if (this.m == 2) {
            return;
        }
        P2.k kVar = this.j;
        if (kVar != null) {
            kVar.f(null);
        }
        this.k = null;
        this.m = 2;
    }

    public void G(long j, long j2) {
        if (this.l == 0) {
            this.d.h(j, j2);
        }
    }

    public void H(Surface surface, P2.A a2) {
        Pair pair = this.k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((P2.A) this.k.second).equals(a2)) {
            return;
        }
        this.k = Pair.create(surface, a2);
        E(surface, a2.b(), a2.a());
    }

    public final void I(float f2) {
        this.d.j(f2);
    }

    public final void J(n nVar) {
        this.i = nVar;
    }

    public o a() {
        return this.c;
    }

    public D b() {
        return this.b;
    }

    public void u(d dVar) {
        this.g.add(dVar);
    }

    public void v() {
        P2.A a2 = P2.A.c;
        E(null, a2.b(), a2.a());
        this.k = null;
    }

    public final void w() {
        if (B()) {
            this.l++;
            this.d.b();
            ((P2.k) P2.a.h(this.j)).i(new m3.c(this));
        }
    }

    public final void x() {
        int i = this.l - 1;
        this.l = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.l));
        }
        this.d.b();
    }

    public final boolean z(long j) {
        return this.l == 0 && this.d.d(j);
    }

    public d(b bVar) {
        Context a2 = b.a(bVar);
        this.a = a2;
        h hVar = new h(a2);
        this.b = hVar;
        P2.c b2 = b.b(bVar);
        this.f = b2;
        o c2 = b.c(bVar);
        this.c = c2;
        c2.o(b2);
        this.d = new r(new c(this, null), c2);
        this.e = (D.a) P2.a.h(b.d(bVar));
        this.g = new CopyOnWriteArraySet();
        this.m = 0;
        u(hVar);
    }

    public static /* synthetic */ void D(Runnable runnable) {
    }

    public final void E(Surface surface, int i, int i2) {
    }
}
