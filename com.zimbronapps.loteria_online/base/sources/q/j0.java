package Q;

import P0.r1;
import Z0.N0;
import Z0.R0;
import Z0.T0;
import Z0.W0;
import Z0.X0;
import android.graphics.PointF;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j0 {

    public static final class a implements f1.i {
        public final /* synthetic */ f1.i[] a;

        public a(f1.i[] iVarArr) {
            this.a = iVarArr;
        }

        public void a(f1.m mVar) {
            for (f1.i iVar : this.a) {
                iVar.a(mVar);
            }
        }
    }

    public static final boolean A(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    public static final boolean B(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean C(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean D(int i) {
        return C(i) && !A(i);
    }

    public static final long E(CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0) {
            int c = f.c(charSequence, i2);
            if (!C(c)) {
                break;
            }
            i2 -= Character.charCount(c);
        }
        while (i < charSequence.length()) {
            int b = f.b(charSequence, i);
            if (!C(b)) {
                break;
            }
            i += f.a(b);
        }
        return X0.b(i2, i);
    }

    public static final long F(PointF pointF) {
        return u0.g.a(pointF.x, pointF.y);
    }

    public static final /* synthetic */ long a(long j, CharSequence charSequence) {
        return m(j, charSequence);
    }

    public static final /* synthetic */ f1.i b(f1.i... iVarArr) {
        return n(iVarArr);
    }

    public static final /* synthetic */ int c(N.y yVar, long j, r1 r1Var) {
        return q(yVar, j, r1Var);
    }

    public static final /* synthetic */ int d(w0 w0Var, long j, r1 r1Var) {
        return r(w0Var, j, r1Var);
    }

    public static final /* synthetic */ long e(T0 t0, long j, long j2, M0.p pVar, r1 r1Var) {
        return t(t0, j, j2, pVar, r1Var);
    }

    public static final /* synthetic */ long f(N.y yVar, u0.h hVar, int i, R0 r0) {
        return v(yVar, hVar, i, r0);
    }

    public static final /* synthetic */ long g(w0 w0Var, u0.h hVar, int i, R0 r0) {
        return w(w0Var, hVar, i, r0);
    }

    public static final /* synthetic */ long h(N.y yVar, u0.h hVar, u0.h hVar2, int i, R0 r0) {
        return x(yVar, hVar, hVar2, i, r0);
    }

    public static final /* synthetic */ long i(w0 w0Var, u0.h hVar, u0.h hVar2, int i, R0 r0) {
        return y(w0Var, hVar, hVar2, i, r0);
    }

    public static final /* synthetic */ boolean j(T0 t0, int i) {
        return z(t0, i);
    }

    public static final /* synthetic */ long k(CharSequence charSequence, int i) {
        return E(charSequence, i);
    }

    public static final /* synthetic */ long l(PointF pointF) {
        return F(pointF);
    }

    public static final long m(long j, CharSequence charSequence) {
        int n = W0.n(j);
        int i = W0.i(j);
        int codePointBefore = n > 0 ? Character.codePointBefore(charSequence, n) : 10;
        int codePointAt = i < charSequence.length() ? Character.codePointAt(charSequence, i) : 10;
        if (D(codePointBefore) && (C(codePointAt) || B(codePointAt))) {
            do {
                n -= Character.charCount(codePointBefore);
                if (n == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, n);
            } while (D(codePointBefore));
            return X0.b(n, i);
        }
        if (!D(codePointAt)) {
            return j;
        }
        if (!C(codePointBefore) && !B(codePointBefore)) {
            return j;
        }
        do {
            i += Character.charCount(codePointAt);
            if (i == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i);
        } while (D(codePointAt));
        return X0.b(n, i);
    }

    public static final f1.i n(f1.i... iVarArr) {
        return new a(iVarArr);
    }

    public static final long o(long j, long j2) {
        return X0.b(Math.min(W0.n(j), W0.n(j)), Math.max(W0.i(j2), W0.i(j2)));
    }

    public static final int p(Z0.n nVar, long j, r1 r1Var) {
        float h = r1Var != null ? r1Var.h() : 0.0f;
        int s = nVar.s(u0.f.n(j));
        if (u0.f.n(j) < nVar.w(s) - h || u0.f.n(j) > nVar.o(s) + h || u0.f.m(j) < (-h) || u0.f.m(j) > nVar.E() + h) {
            return -1;
        }
        return s;
    }

    public static final int q(N.y yVar, long j, r1 r1Var) {
        T0 f;
        Z0.n w;
        N.Z j2 = yVar.j();
        if (j2 == null || (f = j2.f()) == null || (w = f.w()) == null) {
            return -1;
        }
        return s(w, j, yVar.i(), r1Var);
    }

    public static final int r(w0 w0Var, long j, r1 r1Var) {
        throw null;
    }

    public static final int s(Z0.n nVar, long j, M0.p pVar, r1 r1Var) {
        long q;
        int p;
        if (pVar == null || (p = p(nVar, (q = pVar.q(j)), r1Var)) == -1) {
            return -1;
        }
        return nVar.x(u0.f.g(q, 0.0f, (nVar.w(p) + nVar.o(p)) / 2.0f, 1, null));
    }

    public static final long t(T0 t0, long j, long j2, M0.p pVar, r1 r1Var) {
        if (t0 == null || pVar == null) {
            return W0.b.a();
        }
        long q = pVar.q(j);
        long q2 = pVar.q(j2);
        int p = p(t0.w(), q, r1Var);
        int p2 = p(t0.w(), q2, r1Var);
        if (p != -1) {
            if (p2 != -1) {
                p = Math.min(p, p2);
            }
            p2 = p;
        } else if (p2 == -1) {
            return W0.b.a();
        }
        float v = (t0.v(p2) + t0.m(p2)) / 2;
        return t0.w().D(new u0.h(Math.min(u0.f.m(q), u0.f.m(q2)), v - 0.1f, Math.max(u0.f.m(q), u0.f.m(q2)), v + 0.1f), N0.a.a(), R0.a.g());
    }

    public static final long u(Z0.n nVar, u0.h hVar, M0.p pVar, int i, R0 r0) {
        return (nVar == null || pVar == null) ? W0.b.a() : nVar.D(hVar.t(pVar.q(u0.f.b.c())), i, r0);
    }

    public static final long v(N.y yVar, u0.h hVar, int i, R0 r0) {
        T0 f;
        N.Z j = yVar.j();
        return u((j == null || (f = j.f()) == null) ? null : f.w(), hVar, yVar.i(), i, r0);
    }

    public static final long w(w0 w0Var, u0.h hVar, int i, R0 r0) {
        throw null;
    }

    public static final long x(N.y yVar, u0.h hVar, u0.h hVar2, int i, R0 r0) {
        long v = v(yVar, hVar, i, r0);
        if (W0.h(v)) {
            return W0.b.a();
        }
        long v2 = v(yVar, hVar2, i, r0);
        return W0.h(v2) ? W0.b.a() : o(v, v2);
    }

    public static final long y(w0 w0Var, u0.h hVar, u0.h hVar2, int i, R0 r0) {
        long w = w(w0Var, hVar, i, r0);
        if (W0.h(w)) {
            return W0.b.a();
        }
        long w2 = w(w0Var, hVar2, i, r0);
        return W0.h(w2) ? W0.b.a() : o(w, w2);
    }

    public static final boolean z(T0 t0, int i) {
        int q = t0.q(i);
        return (i == t0.u(q) || i == T0.p(t0, q, false, 2, null)) ? t0.y(i) != t0.c(i) : t0.c(i) != t0.c(i - 1);
    }
}
