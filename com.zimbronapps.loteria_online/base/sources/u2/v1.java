package U2;

import M2.C;
import M2.G;
import M2.J;
import M2.u;
import R2.o;
import R2.y;
import U2.b;
import U2.w1;
import V2.y;
import Y2.h;
import Y2.m;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import c3.t;
import g3.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v1 implements U2.b, w1.a {
    public boolean A;
    public final Context a;
    public final w1 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public M2.A n;
    public b o;
    public b p;
    public b q;
    public M2.q r;
    public M2.q s;
    public M2.q t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final G.c e = new G.c();
    public final G.b f = new G.b();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final M2.q a;
        public final int b;
        public final String c;

        public b(M2.q qVar, int i, String str) {
            this.a = qVar;
            this.b = i;
            this.c = str;
        }
    }

    public v1(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        t0 t0Var = new t0();
        this.b = t0Var;
        t0Var.e(this);
    }

    public static M2.m A0(t7.r rVar) {
        M2.m mVar;
        t7.U p = rVar.p();
        while (p.hasNext()) {
            J.a aVar = (J.a) p.next();
            for (int i = 0; i < aVar.a; i++) {
                if (aVar.e(i) && (mVar = aVar.b(i).r) != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public static int B0(M2.m mVar) {
        for (int i = 0; i < mVar.d; i++) {
            UUID uuid = mVar.j(i).b;
            if (uuid.equals(M2.g.d)) {
                return 3;
            }
            if (uuid.equals(M2.g.e)) {
                return 2;
            }
            if (uuid.equals(M2.g.c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a C0(M2.A a2, Context context, boolean z) {
        int i;
        boolean z2;
        if (a2.a == 1001) {
            return new a(20, 0);
        }
        if (a2 instanceof T2.u) {
            T2.u uVar = (T2.u) a2;
            z2 = uVar.j == 1;
            i = uVar.n;
        } else {
            i = 0;
            z2 = false;
        }
        MediaCodec.CryptoException cryptoException = (Throwable) P2.a.e(a2.getCause());
        if (!(cryptoException instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new a(35, 0);
            }
            if (z2 && i == 3) {
                return new a(15, 0);
            }
            if (z2 && i == 2) {
                return new a(23, 0);
            }
            if (cryptoException instanceof t.d) {
                return new a(13, P2.K.X(((t.d) cryptoException).d));
            }
            if (cryptoException instanceof c3.l) {
                return new a(14, ((c3.l) cryptoException).c);
            }
            if (cryptoException instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (cryptoException instanceof y.c) {
                return new a(17, ((y.c) cryptoException).a);
            }
            if (cryptoException instanceof y.f) {
                return new a(18, ((y.f) cryptoException).a);
            }
            if (!(cryptoException instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = cryptoException.getErrorCode();
            return new a(z0(errorCode), errorCode);
        }
        if (cryptoException instanceof R2.s) {
            return new a(5, ((R2.s) cryptoException).d);
        }
        if ((cryptoException instanceof R2.r) || (cryptoException instanceof M2.z)) {
            return new a(z ? 10 : 11, 0);
        }
        boolean z3 = cryptoException instanceof R2.q;
        if (z3 || (cryptoException instanceof y.a)) {
            if (P2.t.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = cryptoException.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z3 && ((R2.q) cryptoException).c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (a2.a == 1002) {
            return new a(21, 0);
        }
        if (!(cryptoException instanceof m.a)) {
            if (!(cryptoException instanceof o.b) || !(cryptoException.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            ErrnoException cause2 = ((Throwable) P2.a.e(cryptoException.getCause())).getCause();
            return (P2.K.a >= 21 && (cause2 instanceof ErrnoException) && cause2.errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        MediaDrm.MediaDrmStateException mediaDrmStateException = (Throwable) P2.a.e(cryptoException.getCause());
        int i2 = P2.K.a;
        if (i2 < 21 || !(mediaDrmStateException instanceof MediaDrm.MediaDrmStateException)) {
            return (i2 < 23 || !(mediaDrmStateException instanceof MediaDrmResetException)) ? mediaDrmStateException instanceof NotProvisionedException ? new a(24, 0) : mediaDrmStateException instanceof DeniedByServerException ? new a(29, 0) : mediaDrmStateException instanceof Y2.N ? new a(23, 0) : mediaDrmStateException instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
        }
        int X = P2.K.X(mediaDrmStateException.getDiagnosticInfo());
        return new a(z0(X), X);
    }

    public static Pair D0(String str) {
        String[] c1 = P2.K.c1(str, "-");
        return Pair.create(c1[0], c1.length >= 2 ? c1[1] : null);
    }

    public static int F0(Context context) {
        switch (P2.t.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int G0(M2.u uVar) {
        u.h hVar = uVar.b;
        if (hVar == null) {
            return 0;
        }
        int u0 = P2.K.u0(hVar.a, hVar.b);
        if (u0 == 0) {
            return 3;
        }
        if (u0 != 1) {
            return u0 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int H0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    public static v1 x0(Context context) {
        MediaMetricsManager a2 = q1.a(context.getSystemService("media_metrics"));
        if (a2 == null) {
            return null;
        }
        return new v1(context, r1.a(a2));
    }

    public static int z0(int i) {
        switch (P2.K.W(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public LogSessionId E0() {
        return l1.a(this.c);
    }

    public void F(b.a aVar, T2.o oVar) {
        this.x += oVar.g;
        this.y += oVar.e;
    }

    public final void I0(b.b bVar) {
        for (int i = 0; i < bVar.d(); i++) {
            int b2 = bVar.b(i);
            b.a c = bVar.c(b2);
            if (b2 == 0) {
                this.b.g(c);
            } else if (b2 == 11) {
                this.b.b(c, this.k);
            } else {
                this.b.f(c);
            }
        }
    }

    public final void J0(long j) {
        int F0 = F0(this.a);
        if (F0 != this.m) {
            this.m = F0;
            M0.a(this.c, L0.a(K0.a(J0.a(F0.a(), F0), j - this.d)));
        }
    }

    public final void K0(long j) {
        M2.A a2 = this.n;
        if (a2 == null) {
            return;
        }
        a C0 = C0(a2, this.a, this.v == 4);
        X0.a(this.c, W0.a(V0.a(U0.a(T0.a(S0.a(b1.a(), j - this.d), C0.a), C0.b), a2)));
        this.A = true;
        this.n = null;
    }

    public void L(b.a aVar, int i, long j, long j2) {
        w.b bVar = aVar.d;
        if (bVar != null) {
            String d = this.b.d(aVar.b, (w.b) P2.a.e(bVar));
            Long l = (Long) this.h.get(d);
            Long l2 = (Long) this.g.get(d);
            this.h.put(d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.g.put(d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final void L0(M2.C c, b.b bVar, long j) {
        if (c.J() != 2) {
            this.u = false;
        }
        if (c.m() == null) {
            this.w = false;
        } else if (bVar.a(10)) {
            this.w = true;
        }
        int T0 = T0(c);
        if (this.l != T0) {
            this.l = T0;
            this.A = true;
            k1.a(this.c, j1.a(i1.a(h1.a(m1.a(), this.l), j - this.d)));
        }
    }

    public final void M0(M2.C c, b.b bVar, long j) {
        if (bVar.a(2)) {
            M2.J p = c.p();
            boolean b2 = p.b(2);
            boolean b3 = p.b(1);
            boolean b4 = p.b(3);
            if (b2 || b3 || b4) {
                if (!b2) {
                    R0(j, null, 0);
                }
                if (!b3) {
                    N0(j, null, 0);
                }
                if (!b4) {
                    P0(j, null, 0);
                }
            }
        }
        if (w0(this.o)) {
            b bVar2 = this.o;
            M2.q qVar = bVar2.a;
            if (qVar.u != -1) {
                R0(j, qVar, bVar2.b);
                this.o = null;
            }
        }
        if (w0(this.p)) {
            b bVar3 = this.p;
            N0(j, bVar3.a, bVar3.b);
            this.p = null;
        }
        if (w0(this.q)) {
            b bVar4 = this.q;
            P0(j, bVar4.a, bVar4.b);
            this.q = null;
        }
    }

    public final void N0(long j, M2.q qVar, int i) {
        if (P2.K.c(this.s, qVar)) {
            return;
        }
        if (this.s == null && i == 0) {
            i = 1;
        }
        this.s = qVar;
        S0(0, j, qVar, i);
    }

    public final void O0(M2.C c, b.b bVar) {
        M2.m A0;
        if (bVar.a(0)) {
            b.a c2 = bVar.c(0);
            if (this.j != null) {
                Q0(c2.b, c2.d);
            }
        }
        if (bVar.a(2) && this.j != null && (A0 = A0(c.p().a())) != null) {
            O0.a(N0.a(P2.K.i(this.j)), B0(A0));
        }
        if (bVar.a(1011)) {
            this.z++;
        }
    }

    public final void P0(long j, M2.q qVar, int i) {
        if (P2.K.c(this.t, qVar)) {
            return;
        }
        if (this.t == null && i == 0) {
            i = 1;
        }
        this.t = qVar;
        S0(2, j, qVar, i);
    }

    public final void Q0(M2.G g, w.b bVar) {
        int b2;
        PlaybackMetrics.Builder builder = this.j;
        if (bVar == null || (b2 = g.b(bVar.a)) == -1) {
            return;
        }
        g.f(b2, this.f);
        g.n(this.f.c, this.e);
        n1.a(builder, G0(this.e.c));
        G.c cVar = this.e;
        if (cVar.m != -9223372036854775807L && !cVar.k && !cVar.i && !cVar.f()) {
            o1.a(builder, this.e.d());
        }
        p1.a(builder, this.e.f() ? 2 : 1);
        this.A = true;
    }

    public final void R0(long j, M2.q qVar, int i) {
        if (P2.K.c(this.r, qVar)) {
            return;
        }
        if (this.r == null && i == 0) {
            i = 1;
        }
        this.r = qVar;
        S0(1, j, qVar, i);
    }

    public final void S0(int i, long j, M2.q qVar, int i2) {
        TrackChangeEvent.Builder a2 = s1.a(u0.a(i), j - this.d);
        if (qVar != null) {
            x0.a(a2, 1);
            A0.a(a2, H0(i2));
            String str = qVar.m;
            if (str != null) {
                B0.a(a2, str);
            }
            String str2 = qVar.n;
            if (str2 != null) {
                C0.a(a2, str2);
            }
            String str3 = qVar.j;
            if (str3 != null) {
                D0.a(a2, str3);
            }
            int i3 = qVar.i;
            if (i3 != -1) {
                E0.a(a2, i3);
            }
            int i4 = qVar.t;
            if (i4 != -1) {
                G0.a(a2, i4);
            }
            int i5 = qVar.u;
            if (i5 != -1) {
                H0.a(a2, i5);
            }
            int i6 = qVar.B;
            if (i6 != -1) {
                I0.a(a2, i6);
            }
            int i7 = qVar.C;
            if (i7 != -1) {
                t1.a(a2, i7);
            }
            String str4 = qVar.d;
            if (str4 != null) {
                Pair D0 = D0(str4);
                u1.a(a2, (String) D0.first);
                Object obj = D0.second;
                if (obj != null) {
                    v0.a(a2, (String) obj);
                }
            }
            float f = qVar.v;
            if (f != -1.0f) {
                w0.a(a2, f);
            }
        } else {
            x0.a(a2, 0);
        }
        this.A = true;
        z0.a(this.c, y0.a(a2));
    }

    public final int T0(M2.C c) {
        int J = c.J();
        if (this.u) {
            return 5;
        }
        if (this.w) {
            return 13;
        }
        if (J == 4) {
            return 11;
        }
        if (J == 2) {
            int i = this.l;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (c.z()) {
                return c.u() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (J == 3) {
            if (c.z()) {
                return c.u() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (J != 1 || this.l == 0) {
            return this.l;
        }
        return 12;
    }

    public void X(b.a aVar, g3.r rVar, g3.u uVar, IOException iOException, boolean z) {
        this.v = uVar.a;
    }

    public void b(b.a aVar, M2.N n) {
        b bVar = this.o;
        if (bVar != null) {
            M2.q qVar = bVar.a;
            if (qVar.u == -1) {
                this.o = new b(qVar.a().v0(n.a).Y(n.b).K(), bVar.b, bVar.c);
            }
        }
    }

    public void c(b.a aVar, String str, boolean z) {
        w.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.i)) {
            y0();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public void d0(b.a aVar, g3.u uVar) {
        if (aVar.d == null) {
            return;
        }
        b bVar = new b((M2.q) P2.a.e(uVar.c), uVar.d, this.b.d(aVar.b, (w.b) P2.a.e(aVar.d)));
        int i = uVar.b;
        if (i != 0) {
            if (i == 1) {
                this.p = bVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.q = bVar;
                return;
            }
        }
        this.o = bVar;
    }

    public void j(b.a aVar, String str) {
        w.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            y0();
            this.i = str;
            this.j = R0.a(P0.a(Q0.a(), "AndroidXMedia3"), "1.4.1");
            Q0(aVar.b, aVar.d);
        }
    }

    public void m0(b.a aVar, C.e eVar, C.e eVar2, int i) {
        if (i == 1) {
            this.u = true;
        }
        this.k = i;
    }

    public void o0(b.a aVar, M2.A a2) {
        this.n = a2;
    }

    public void t(M2.C c, b.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        I0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        O0(c, bVar);
        K0(elapsedRealtime);
        M0(c, bVar, elapsedRealtime);
        J0(elapsedRealtime);
        L0(c, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.b.c(bVar.c(1028));
        }
    }

    public final boolean w0(b bVar) {
        return bVar != null && bVar.c.equals(this.b.a());
    }

    public final void y0() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            Y0.a(builder, this.z);
            Z0.a(this.j, this.x);
            a1.a(this.j, this.y);
            Long l = (Long) this.g.get(this.i);
            c1.a(this.j, l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            d1.a(this.j, l2 == null ? 0L : l2.longValue());
            e1.a(this.j, (l2 == null || l2.longValue() <= 0) ? 0 : 1);
            g1.a(this.c, f1.a(this.j));
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public void e(b.a aVar, String str) {
    }

    public void U(b.a aVar, String str, String str2) {
    }
}
