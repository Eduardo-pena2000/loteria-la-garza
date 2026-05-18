package androidx.media3.exoplayer.dash;

import M2.G;
import M2.u;
import M2.v;
import M2.z;
import P2.K;
import P2.o;
import R2.f;
import R2.x;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import g3.D;
import g3.j;
import g3.r;
import g3.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.k;
import k3.l;
import k3.m;
import k3.n;
import l3.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class DashMediaSource extends g3.a {
    public l A;
    public x B;
    public IOException C;
    public Handler D;
    public u.g E;
    public Uri F;
    public Uri G;
    public X2.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public u P;
    public final boolean h;
    public final f.a i;
    public final a.a j;
    public final j k;
    public final Y2.u l;
    public final k m;
    public final W2.b n;
    public final long o;
    public final long p;
    public final D.a q;
    public final n.a r;
    public final e s;
    public final Object t;
    public final SparseArray u;
    public final Runnable v;
    public final Runnable w;
    public final d.b x;
    public final m y;
    public R2.f z;

    public static final class Factory implements w.a {
        public final a.a a;
        public final f.a b;
        public Y2.w c;
        public j d;
        public k e;
        public long f;
        public long g;
        public n.a h;

        public Factory(f.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(u uVar) {
            P2.a.e(uVar.b);
            n.a aVar = this.h;
            if (aVar == null) {
                aVar = new X2.d();
            }
            List list = uVar.b.d;
            return new DashMediaSource(uVar, null, this.b, !list.isEmpty() ? new e3.b(aVar, list) : aVar, this.a, this.d, null, this.c.a(uVar), this.e, this.f, this.g, null);
        }

        public Factory b(boolean z) {
            this.a.a(z);
            return this;
        }

        public Factory(a.a aVar, f.a aVar2) {
            this.a = (a.a) P2.a.e(aVar);
            this.b = aVar2;
            this.c = new Y2.l();
            this.e = new k3.j();
            this.f = 30000L;
            this.g = 5000000L;
            this.d = new g3.m();
            b(true);
        }
    }

    public class a implements a.b {
        public a() {
        }

        public void a(IOException iOException) {
            DashMediaSource.F(DashMediaSource.this, iOException);
        }

        public void b() {
            DashMediaSource.E(DashMediaSource.this, l3.a.h());
        }
    }

    public static final class b extends G {
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final long i;
        public final long j;
        public final long k;
        public final X2.c l;
        public final u m;
        public final u.g n;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, X2.c cVar, u uVar, u.g gVar) {
            P2.a.f(cVar.d == (gVar != null));
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = i;
            this.i = j4;
            this.j = j5;
            this.k = j6;
            this.l = cVar;
            this.m = uVar;
            this.n = gVar;
        }

        public static boolean t(X2.c cVar) {
            return cVar.d && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L;
        }

        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        public G.b g(int i, G.b bVar, boolean z) {
            P2.a.c(i, 0, i());
            return bVar.s(z ? this.l.d(i).a : null, z ? Integer.valueOf(this.h + i) : null, 0, this.l.g(i), K.K0(this.l.d(i).b - this.l.d(0).b) - this.i);
        }

        public int i() {
            return this.l.e();
        }

        public Object m(int i) {
            P2.a.c(i, 0, i());
            return Integer.valueOf(this.h + i);
        }

        public G.c o(int i, G.c cVar, long j) {
            P2.a.c(i, 0, 1);
            long s = s(j);
            Object obj = G.c.q;
            u uVar = this.m;
            X2.c cVar2 = this.l;
            return cVar.g(obj, uVar, cVar2, this.e, this.f, this.g, true, t(cVar2), this.n, s, this.j, 0, i() - 1, this.i);
        }

        public int p() {
            return 1;
        }

        public final long s(long j) {
            long j2 = this.k;
            if (!t(this.l)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.j) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.i + j2;
            long g = this.l.g(0);
            int i = 0;
            while (i < this.l.e() - 1 && j3 >= g) {
                j3 -= g;
                i++;
                g = this.l.g(i);
            }
            X2.g d = this.l.d(i);
            int a = d.a(2);
            if (a == -1) {
                return j2;
            }
            W2.g l = ((X2.j) ((X2.a) d.c.get(a)).c.get(0)).l();
            return (l == null || l.g(g) == 0) ? j2 : (j2 + l.c(l.f(j3, g))) - j3;
        }
    }

    public final class c implements d.b {
        public c() {
        }

        public void a(long j) {
            DashMediaSource.this.Q(j);
        }

        public void b() {
            DashMediaSource.this.R();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class d implements n.a {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, s7.e.c)).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (!matcher.matches()) {
                    throw z.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw z.c(null, e);
            }
        }
    }

    public final class e implements l.b {
        public e() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void k(n nVar, long j, long j2, boolean z) {
            DashMediaSource.this.S(nVar, j, j2);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(n nVar, long j, long j2) {
            DashMediaSource.this.T(nVar, j, j2);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l.c o(n nVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.U(nVar, j, j2, iOException, i);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public final class f implements m {
        public f() {
        }

        public void a() {
            DashMediaSource.G(DashMediaSource.this).a();
            b();
        }

        public final void b() {
            if (DashMediaSource.H(DashMediaSource.this) != null) {
                throw DashMediaSource.H(DashMediaSource.this);
            }
        }
    }

    public final class g implements l.b {
        public g() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void k(n nVar, long j, long j2, boolean z) {
            DashMediaSource.this.S(nVar, j, j2);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(n nVar, long j, long j2) {
            DashMediaSource.this.V(nVar, j, j2);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l.c o(n nVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.W(nVar, j, j2, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class h implements n.a {
        public h() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(K.R0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        v.a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(u uVar, X2.c cVar, f.a aVar, n.a aVar2, a.a aVar3, j jVar, k3.e eVar, Y2.u uVar2, k kVar, long j, long j2, a aVar4) {
        this(uVar, cVar, aVar, aVar2, aVar3, jVar, eVar, uVar2, kVar, j, j2);
    }

    public static /* synthetic */ void C(DashMediaSource dashMediaSource) {
        dashMediaSource.O();
    }

    public static /* synthetic */ void D(DashMediaSource dashMediaSource) {
        dashMediaSource.f0();
    }

    public static /* synthetic */ void E(DashMediaSource dashMediaSource, long j) {
        dashMediaSource.Y(j);
    }

    public static /* synthetic */ void F(DashMediaSource dashMediaSource, IOException iOException) {
        dashMediaSource.X(iOException);
    }

    public static /* synthetic */ l G(DashMediaSource dashMediaSource) {
        return dashMediaSource.A;
    }

    public static /* synthetic */ IOException H(DashMediaSource dashMediaSource) {
        return dashMediaSource.C;
    }

    public static long I(X2.g gVar, long j, long j2) {
        long K0 = K.K0(gVar.b);
        boolean M = M(gVar);
        long j3 = Long.MAX_VALUE;
        for (int i = 0; i < gVar.c.size(); i++) {
            X2.a aVar = (X2.a) gVar.c.get(i);
            List list = aVar.c;
            int i2 = aVar.b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!M || !z) && !list.isEmpty()) {
                W2.g l = ((X2.j) list.get(0)).l();
                if (l == null) {
                    return K0 + j;
                }
                long j4 = l.j(j, j2);
                if (j4 == 0) {
                    return K0;
                }
                long b2 = (l.b(j, j2) + j4) - 1;
                j3 = Math.min(j3, l.a(b2, j) + l.c(b2) + K0);
            }
        }
        return j3;
    }

    public static long J(X2.g gVar, long j, long j2) {
        long K0 = K.K0(gVar.b);
        boolean M = M(gVar);
        long j3 = K0;
        for (int i = 0; i < gVar.c.size(); i++) {
            X2.a aVar = (X2.a) gVar.c.get(i);
            List list = aVar.c;
            int i2 = aVar.b;
            boolean z = (i2 == 1 || i2 == 2) ? false : true;
            if ((!M || !z) && !list.isEmpty()) {
                W2.g l = ((X2.j) list.get(0)).l();
                if (l == null) {
                    return K0;
                }
                if (l.j(j, j2) == 0) {
                    return K0;
                }
                j3 = Math.max(j3, l.c(l.b(j, j2)) + K0);
            }
        }
        return j3;
    }

    public static long K(X2.c cVar, long j) {
        W2.g l;
        int e2 = cVar.e() - 1;
        X2.g d2 = cVar.d(e2);
        long K0 = K.K0(d2.b);
        long g2 = cVar.g(e2);
        long K02 = K.K0(j);
        long K03 = K.K0(cVar.a);
        long K04 = K.K0(5000L);
        for (int i = 0; i < d2.c.size(); i++) {
            List list = ((X2.a) d2.c.get(i)).c;
            if (!list.isEmpty() && (l = ((X2.j) list.get(0)).l()) != null) {
                long d3 = ((K03 + K0) + l.d(g2, K02)) - K02;
                if (d3 < K04 - 100000 || (d3 > K04 && d3 < K04 + 100000)) {
                    K04 = d3;
                }
            }
        }
        return v7.e.b(K04, 1000L, RoundingMode.CEILING);
    }

    public static boolean M(X2.g gVar) {
        for (int i = 0; i < gVar.c.size(); i++) {
            int i2 = ((X2.a) gVar.c.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(X2.g gVar) {
        for (int i = 0; i < gVar.c.size(); i++) {
            W2.g l = ((X2.j) ((X2.a) gVar.c.get(i)).c.get(0)).l();
            if (l == null || l.h()) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        this.I = false;
        this.z = null;
        l lVar = this.A;
        if (lVar != null) {
            lVar.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        this.n.i();
        this.l.release();
    }

    public final long L() {
        return Math.min((this.M - 1) * 1000, 5000);
    }

    public final /* synthetic */ void O() {
        Z(false);
    }

    public final void P() {
        l3.a.j(this.A, new a());
    }

    public void Q(long j) {
        long j2 = this.N;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.N = j;
        }
    }

    public void R() {
        this.D.removeCallbacks(this.w);
        f0();
    }

    public void S(n nVar, long j, long j2) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        this.m.d(nVar.a);
        this.q.p(rVar, nVar.c);
    }

    public void T(n nVar, long j, long j2) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        this.m.d(nVar.a);
        this.q.s(rVar, nVar.c);
        X2.c cVar = (X2.c) nVar.e();
        X2.c cVar2 = this.H;
        int e2 = cVar2 == null ? 0 : cVar2.e();
        long j3 = cVar.d(0).b;
        int i = 0;
        while (i < e2 && this.H.d(i).b < j3) {
            i++;
        }
        if (cVar.d) {
            if (e2 - i > cVar.e()) {
                o.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.N;
                if (j4 == -9223372036854775807L || cVar.h * 1000 > j4) {
                    this.M = 0;
                } else {
                    o.h("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + this.N);
                }
            }
            int i2 = this.M;
            this.M = i2 + 1;
            if (i2 < this.m.b(nVar.c)) {
                d0(L());
                return;
            } else {
                this.C = new W2.c();
                return;
            }
        }
        this.H = cVar;
        this.I = cVar.d & this.I;
        this.J = j - j2;
        this.K = j;
        this.O += i;
        synchronized (this.t) {
            try {
                if (nVar.b.a == this.F) {
                    Uri uri = this.H.k;
                    if (uri == null) {
                        uri = nVar.f();
                    }
                    this.F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        X2.c cVar3 = this.H;
        if (!cVar3.d || this.L != -9223372036854775807L) {
            Z(true);
            return;
        }
        X2.o oVar = cVar3.i;
        if (oVar != null) {
            a0(oVar);
        } else {
            P();
        }
    }

    public l.c U(n nVar, long j, long j2, IOException iOException, int i) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        long c2 = this.m.c(new k.c(rVar, new g3.u(nVar.c), iOException, i));
        l.c h2 = c2 == -9223372036854775807L ? l.g : l.h(false, c2);
        boolean c3 = h2.c();
        this.q.w(rVar, nVar.c, iOException, !c3);
        if (!c3) {
            this.m.d(nVar.a);
        }
        return h2;
    }

    public void V(n nVar, long j, long j2) {
        r rVar = new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a());
        this.m.d(nVar.a);
        this.q.s(rVar, nVar.c);
        Y(((Long) nVar.e()).longValue() - j);
    }

    public l.c W(n nVar, long j, long j2, IOException iOException) {
        this.q.w(new r(nVar.a, nVar.b, nVar.f(), nVar.d(), j, j2, nVar.a()), nVar.c, iOException, true);
        this.m.d(nVar.a);
        X(iOException);
        return l.f;
    }

    public final void X(IOException iOException) {
        o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Z(true);
    }

    public final void Y(long j) {
        this.L = j;
        Z(true);
    }

    public final void Z(boolean z) {
        X2.g gVar;
        long j;
        long j2;
        for (int i = 0; i < this.u.size(); i++) {
            int keyAt = this.u.keyAt(i);
            if (keyAt >= this.O) {
                ((androidx.media3.exoplayer.dash.b) this.u.valueAt(i)).P(this.H, keyAt - this.O);
            }
        }
        X2.g d2 = this.H.d(0);
        int e2 = this.H.e() - 1;
        X2.g d3 = this.H.d(e2);
        long g2 = this.H.g(e2);
        long K0 = K.K0(K.d0(this.L));
        long J = J(d2, this.H.g(0), K0);
        long I = I(d3, g2, K0);
        boolean z2 = this.H.d && !N(d3);
        if (z2) {
            long j3 = this.H.f;
            if (j3 != -9223372036854775807L) {
                J = Math.max(J, I - K.K0(j3));
            }
        }
        long j4 = I - J;
        X2.c cVar = this.H;
        if (cVar.d) {
            P2.a.f(cVar.a != -9223372036854775807L);
            long K02 = (K0 - K.K0(this.H.a)) - J;
            g0(K02, j4);
            long j1 = this.H.a + K.j1(J);
            long K03 = K02 - K.K0(this.E.a);
            long min = Math.min(this.p, j4 / 2);
            j = j1;
            j2 = K03 < min ? min : K03;
            gVar = d2;
        } else {
            gVar = d2;
            j = -9223372036854775807L;
            j2 = 0;
        }
        long K04 = J - K.K0(gVar.b);
        X2.c cVar2 = this.H;
        A(new b(cVar2.a, j, this.L, this.O, K04, j4, j2, cVar2, f(), this.H.d ? this.E : null));
        if (this.h) {
            return;
        }
        this.D.removeCallbacks(this.w);
        if (z2) {
            this.D.postDelayed(this.w, K(this.H, K.d0(this.L)));
        }
        if (this.I) {
            f0();
            return;
        }
        if (z) {
            X2.c cVar3 = this.H;
            if (cVar3.d) {
                long j5 = cVar3.e;
                if (j5 != -9223372036854775807L) {
                    if (j5 == 0) {
                        j5 = 5000;
                    }
                    d0(Math.max(0L, (this.J + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void a0(X2.o oVar) {
        String str = oVar.a;
        if (K.c(str, "urn:mpeg:dash:utc:direct:2014") || K.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            b0(oVar);
            return;
        }
        if (K.c(str, "urn:mpeg:dash:utc:http-iso:2014") || K.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            c0(oVar, new d());
            return;
        }
        if (K.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || K.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            c0(oVar, new h(null));
        } else if (K.c(str, "urn:mpeg:dash:utc:ntp:2014") || K.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            P();
        } else {
            X(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void b0(X2.o oVar) {
        try {
            Y(K.R0(oVar.b) - this.K);
        } catch (z e2) {
            X(e2);
        }
    }

    public void c(g3.v vVar) {
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) vVar;
        bVar.L();
        this.u.remove(bVar.a);
    }

    public final void c0(X2.o oVar, n.a aVar) {
        e0(new n(this.z, Uri.parse(oVar.b), 5, aVar), new g(this, null), 1);
    }

    public final void d0(long j) {
        this.D.postDelayed(this.v, j);
    }

    public synchronized void e(u uVar) {
        this.P = uVar;
    }

    public final void e0(n nVar, l.b bVar, int i) {
        this.q.y(new r(nVar.a, nVar.b, this.A.n(nVar, bVar, i)), nVar.c);
    }

    public synchronized u f() {
        return this.P;
    }

    public final void f0() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        e0(new n(this.z, uri, 4, this.r), this.s, this.m.b(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.g0(long, long):void");
    }

    public g3.v l(w.b bVar, k3.b bVar2, long j) {
        int intValue = ((Integer) bVar.a).intValue() - this.O;
        D.a u = u(bVar);
        androidx.media3.exoplayer.dash.b bVar3 = new androidx.media3.exoplayer.dash.b(intValue + this.O, this.H, this.n, intValue, this.j, this.B, null, this.l, s(bVar), this.m, u, this.L, this.y, bVar2, this.k, this.x, x());
        this.u.put(bVar3.a, bVar3);
        return bVar3;
    }

    public void n() {
        this.y.a();
    }

    public void z(x xVar) {
        this.B = xVar;
        this.l.a(Looper.myLooper(), x());
        this.l.e();
        if (this.h) {
            Z(false);
            return;
        }
        this.z = this.i.a();
        this.A = new l("DashMediaSource");
        this.D = K.A();
        f0();
    }

    public DashMediaSource(u uVar, X2.c cVar, f.a aVar, n.a aVar2, a.a aVar3, j jVar, k3.e eVar, Y2.u uVar2, k kVar, long j, long j2) {
        this.P = uVar;
        this.E = uVar.d;
        this.F = ((u.h) P2.a.e(uVar.b)).a;
        this.G = uVar.b.a;
        this.H = cVar;
        this.i = aVar;
        this.r = aVar2;
        this.j = aVar3;
        this.l = uVar2;
        this.m = kVar;
        this.o = j;
        this.p = j2;
        this.k = jVar;
        this.n = new W2.b();
        boolean z = cVar != null;
        this.h = z;
        this.q = u(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new c(this, null);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (!z) {
            this.s = new e(this, null);
            this.y = new f();
            this.v = new W2.e(this);
            this.w = new W2.f(this);
            return;
        }
        P2.a.f(true ^ cVar.d);
        this.s = null;
        this.v = null;
        this.w = null;
        this.y = new m.a();
    }
}
