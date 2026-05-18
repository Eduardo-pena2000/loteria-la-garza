package Z2;

import M2.H;
import M2.q;
import M2.x;
import M2.y;
import P2.K;
import P2.z;
import T2.a1;
import T2.u0;
import T2.x0;
import Y2.t;
import Z2.f;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import g3.D;
import g3.O;
import g3.P;
import g3.Q;
import g3.Y;
import j3.B;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k3.k;
import k3.l;
import o3.J;
import o3.O;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements l.b, l.f, Q, o3.r, O.d {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public M2.q F;
    public M2.q G;
    public boolean H;
    public Y I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public M2.m W;
    public j X;
    public final String a;
    public final int b;
    public final b c;
    public final f d;
    public final k3.b e;
    public final M2.q f;
    public final Y2.u g;
    public final t.a h;
    public final k3.k i;
    public final D.a k;
    public final int l;
    public final ArrayList n;
    public final List o;
    public final Runnable p;
    public final Runnable q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public h3.e u;
    public d[] v;
    public Set x;
    public SparseIntArray y;
    public o3.O z;
    public final k3.l j = new k3.l("Loader:HlsSampleStreamWrapper");
    public final f.b m = new f.b();
    public int[] w = new int[0];

    public interface b extends Q.a {
        void e();

        void k(Uri uri);
    }

    public static class c implements o3.O {
        public static final M2.q g = new q.b().o0("application/id3").K();
        public static final M2.q h = new q.b().o0("application/x-emsg").K();
        public final z3.b a = new z3.b();
        public final o3.O b;
        public final M2.q c;
        public M2.q d;
        public byte[] e;
        public int f;

        public c(o3.O o, int i) {
            this.b = o;
            if (i == 1) {
                this.c = g;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i);
                }
                this.c = h;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        public void a(long j, int i, int i2, int i3, O.a aVar) {
            P2.a.e(this.d);
            z i4 = i(i2, i3);
            if (!K.c(this.d.n, this.c.n)) {
                if (!"application/x-emsg".equals(this.d.n)) {
                    P2.o.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.d.n);
                    return;
                }
                z3.a c = this.a.c(i4);
                if (!g(c)) {
                    P2.o.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.c.n, c.B()}));
                    return;
                }
                i4 = new z((byte[]) P2.a.e(c.E1()));
            }
            int a = i4.a();
            this.b.f(i4, a);
            this.b.a(j, i, a, 0, aVar);
        }

        public void b(M2.q qVar) {
            this.d = qVar;
            this.b.b(this.c);
        }

        public void d(z zVar, int i, int i2) {
            h(this.f + i);
            zVar.l(this.e, this.f, i);
            this.f += i;
        }

        public int e(M2.i iVar, int i, boolean z, int i2) {
            h(this.f + i);
            int read = iVar.read(this.e, this.f, i);
            if (read != -1) {
                this.f += read;
                return read;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        public final boolean g(z3.a aVar) {
            M2.q B = aVar.B();
            return B != null && K.c(this.c.n, B.n);
        }

        public final void h(int i) {
            byte[] bArr = this.e;
            if (bArr.length < i) {
                this.e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        public final z i(int i, int i2) {
            int i3 = this.f - i2;
            z zVar = new z(Arrays.copyOfRange(this.e, i3 - i, i3));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f = i2;
            return zVar;
        }
    }

    public static final class d extends g3.O {
        public final Map H;
        public M2.m I;

        public /* synthetic */ d(k3.b bVar, Y2.u uVar, t.a aVar, Map map, a aVar2) {
            this(bVar, uVar, aVar, map);
        }

        public void a(long j, int i, int i2, int i3, O.a aVar) {
            super.a(j, i, i2, i3, aVar);
        }

        public final x i0(x xVar) {
            if (xVar == null) {
                return null;
            }
            int j = xVar.j();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= j) {
                    i2 = -1;
                    break;
                }
                x.b i3 = xVar.i(i2);
                if ((i3 instanceof C3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((C3.m) i3).b)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return xVar;
            }
            if (j == 1) {
                return null;
            }
            x.b[] bVarArr = new x.b[j - 1];
            while (i < j) {
                if (i != i2) {
                    bVarArr[i < i2 ? i : i - 1] = xVar.i(i);
                }
                i++;
            }
            return new x(bVarArr);
        }

        public void j0(M2.m mVar) {
            this.I = mVar;
            J();
        }

        public void k0(j jVar) {
            g0(jVar.k);
        }

        public M2.q x(M2.q qVar) {
            M2.m mVar;
            M2.m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = qVar.r;
            }
            if (mVar2 != null && (mVar = (M2.m) this.H.get(mVar2.c)) != null) {
                mVar2 = mVar;
            }
            x i0 = i0(qVar.k);
            if (mVar2 != qVar.r || i0 != qVar.k) {
                qVar = qVar.a().U(mVar2).h0(i0).K();
            }
            return super.x(qVar);
        }

        public d(k3.b bVar, Y2.u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.H = map;
        }
    }

    public s(String str, int i, b bVar, f fVar, Map map, k3.b bVar2, long j, M2.q qVar, Y2.u uVar, t.a aVar, k3.k kVar, D.a aVar2, int i2) {
        this.a = str;
        this.b = i;
        this.c = bVar;
        this.d = fVar;
        this.t = map;
        this.e = bVar2;
        this.f = qVar;
        this.g = uVar;
        this.h = aVar;
        this.i = kVar;
        this.k = aVar2;
        this.l = i2;
        Set set = Y;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new o(this);
        this.q = new p(this);
        this.r = K.A();
        this.P = j;
        this.Q = j;
    }

    public static o3.m D(int i, int i2) {
        P2.o.h("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new o3.m();
    }

    public static M2.q G(M2.q qVar, M2.q qVar2, boolean z) {
        String d2;
        String str;
        if (qVar == null) {
            return qVar2;
        }
        int k = y.k(qVar2.n);
        if (K.P(qVar.j, k) == 1) {
            d2 = K.Q(qVar.j, k);
            str = y.g(d2);
        } else {
            d2 = y.d(qVar.j, qVar2.n);
            str = qVar2.n;
        }
        q.b O = qVar2.a().a0(qVar.a).c0(qVar.b).d0(qVar.c).e0(qVar.d).q0(qVar.e).m0(qVar.f).M(z ? qVar.g : -1).j0(z ? qVar.h : -1).O(d2);
        if (k == 2) {
            O.v0(qVar.t).Y(qVar.u).X(qVar.v);
        }
        if (str != null) {
            O.o0(str);
        }
        int i = qVar.B;
        if (i != -1 && k == 1) {
            O.N(i);
        }
        x xVar = qVar.k;
        if (xVar != null) {
            x xVar2 = qVar2.k;
            if (xVar2 != null) {
                xVar = xVar2.c(xVar);
            }
            O.h0(xVar);
        }
        return O.K();
    }

    public static boolean K(M2.q qVar, M2.q qVar2) {
        String str = qVar.n;
        String str2 = qVar2.n;
        int k = y.k(str);
        if (k != 3) {
            return k == y.k(str2);
        }
        if (K.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || qVar.G == qVar2.G;
        }
        return false;
    }

    public static int N(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean P(h3.e eVar) {
        return eVar instanceof j;
    }

    private boolean Q() {
        return this.Q != -9223372036854775807L;
    }

    public static /* synthetic */ void v(s sVar) {
        sVar.e0();
    }

    public static /* synthetic */ void w(s sVar) {
        sVar.V();
    }

    public static /* synthetic */ void x(s sVar, j jVar) {
        sVar.T(jVar);
    }

    public final void A() {
        M2.q qVar;
        int length = this.v.length;
        int i = -2;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            String str = ((M2.q) P2.a.h(this.v[i3].G())).n;
            int i4 = y.s(str) ? 2 : y.o(str) ? 1 : y.r(str) ? 3 : -2;
            if (N(i4) > N(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        H k = this.d.k();
        int i5 = k.a;
        this.L = -1;
        this.K = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.K[i6] = i6;
        }
        H[] hArr = new H[length];
        int i7 = 0;
        while (i7 < length) {
            M2.q qVar2 = (M2.q) P2.a.h(this.v[i7].G());
            if (i7 == i2) {
                M2.q[] qVarArr = new M2.q[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    M2.q a2 = k.a(i8);
                    if (i == 1 && (qVar = this.f) != null) {
                        a2 = a2.h(qVar);
                    }
                    qVarArr[i8] = i5 == 1 ? qVar2.h(a2) : G(a2, qVar2, true);
                }
                hArr[i7] = new H(this.a, qVarArr);
                this.L = i7;
            } else {
                M2.q qVar3 = (i == 2 && y.o(qVar2.n)) ? this.f : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(":muxed:");
                sb.append(i7 < i2 ? i7 : i7 - 1);
                hArr[i7] = new H(sb.toString(), G(qVar3, qVar2, false));
            }
            i7++;
        }
        this.I = F(hArr);
        P2.a.f(this.J == null);
        this.J = Collections.emptySet();
    }

    public final boolean B(int i) {
        for (int i2 = i; i2 < this.n.size(); i2++) {
            if (((j) this.n.get(i2)).n) {
                return false;
            }
        }
        j jVar = (j) this.n.get(i);
        for (int i3 = 0; i3 < this.v.length; i3++) {
            if (this.v[i3].D() > jVar.m(i3)) {
                return false;
            }
        }
        return true;
    }

    public void C() {
        if (this.D) {
            return;
        }
        d(new x0.b().f(this.P).d());
    }

    public final g3.O E(int i, int i2) {
        int length = this.v.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        d dVar = new d(this.e, this.g, this.h, this.t, null);
        dVar.c0(this.P);
        if (z) {
            dVar.j0(this.W);
        }
        dVar.b0(this.V);
        j jVar = this.X;
        if (jVar != null) {
            dVar.k0(jVar);
        }
        dVar.e0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.w, i3);
        this.w = copyOf;
        copyOf[length] = i;
        this.v = (d[]) K.N0(this.v, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.O, i3);
        this.O = copyOf2;
        copyOf2[length] = z;
        this.M |= z;
        this.x.add(Integer.valueOf(i2));
        this.y.append(i2, length);
        if (N(i2) > N(this.A)) {
            this.B = length;
            this.A = i2;
        }
        this.N = Arrays.copyOf(this.N, i3);
        return dVar;
    }

    public final Y F(H[] hArr) {
        for (int i = 0; i < hArr.length; i++) {
            H h = hArr[i];
            M2.q[] qVarArr = new M2.q[h.a];
            for (int i2 = 0; i2 < h.a; i2++) {
                M2.q a2 = h.a(i2);
                qVarArr[i2] = a2.b(this.g.b(a2));
            }
            hArr[i] = new H(h.b, qVarArr);
        }
        return new Y(hArr);
    }

    public final void H(int i) {
        P2.a.f(!this.j.j());
        while (true) {
            if (i >= this.n.size()) {
                i = -1;
                break;
            } else if (B(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = L().h;
        j I = I(i);
        if (this.n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((j) t7.u.d(this.n)).o();
        }
        this.T = false;
        this.k.C(this.A, I.g, j);
    }

    public final j I(int i) {
        j jVar = (j) this.n.get(i);
        ArrayList arrayList = this.n;
        K.V0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.v.length; i2++) {
            this.v[i2].u(jVar.m(i2));
        }
        return jVar;
    }

    public final boolean J(j jVar) {
        int i = jVar.k;
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.N[i2] && this.v[i2].R() == i) {
                return false;
            }
        }
        return true;
    }

    public final j L() {
        return (j) this.n.get(r0.size() - 1);
    }

    public final o3.O M(int i, int i2) {
        P2.a.a(Y.contains(Integer.valueOf(i2)));
        int i3 = this.y.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.x.add(Integer.valueOf(i2))) {
            this.w[i3] = i;
        }
        return this.w[i3] == i ? this.v[i3] : D(i, i2);
    }

    public final void O(j jVar) {
        this.X = jVar;
        this.F = jVar.d;
        this.Q = -9223372036854775807L;
        this.n.add(jVar);
        r.a j = t7.r.j();
        for (d dVar : this.v) {
            j.h(Integer.valueOf(dVar.H()));
        }
        jVar.n(this, j.k());
        for (d dVar2 : this.v) {
            dVar2.k0(jVar);
            if (jVar.n) {
                dVar2.h0();
            }
        }
    }

    public boolean R(int i) {
        return !Q() && this.v[i].L(this.T);
    }

    public boolean S() {
        return this.A == 2;
    }

    public final /* synthetic */ void T(j jVar) {
        this.c.k(jVar.m);
    }

    public final void U() {
        int i = this.I.a;
        int[] iArr = new int[i];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.v;
                if (i3 >= dVarArr.length) {
                    break;
                }
                if (K((M2.q) P2.a.h(dVarArr[i3].G()), this.I.b(i2).a(0))) {
                    this.K[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    public final void V() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.v) {
                if (dVar.G() == null) {
                    return;
                }
            }
            if (this.I != null) {
                U();
                return;
            }
            A();
            n0();
            this.c.e();
        }
    }

    public void W() {
        this.j.a();
        this.d.p();
    }

    public void X(int i) {
        W();
        this.v[i].O();
    }

    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void k(h3.e eVar, long j, long j2, boolean z) {
        this.u = null;
        g3.r rVar = new g3.r(eVar.a, eVar.b, eVar.f(), eVar.e(), j, j2, eVar.a());
        this.i.d(eVar.a);
        this.k.q(rVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h);
        if (z) {
            return;
        }
        if (Q() || this.E == 0) {
            i0();
        }
        if (this.E > 0) {
            this.c.i(this);
        }
    }

    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void i(h3.e eVar, long j, long j2) {
        this.u = null;
        this.d.r(eVar);
        g3.r rVar = new g3.r(eVar.a, eVar.b, eVar.f(), eVar.e(), j, j2, eVar.a());
        this.i.d(eVar.a);
        this.k.t(rVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h);
        if (this.D) {
            this.c.i(this);
        } else {
            d(new x0.b().f(this.P).d());
        }
    }

    public void a(M2.q qVar) {
        this.r.post(this.p);
    }

    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public l.c o(h3.e eVar, long j, long j2, IOException iOException, int i) {
        l.c h;
        int i2;
        boolean P = P(eVar);
        if (P && !((j) eVar).q() && (iOException instanceof R2.s) && ((i2 = ((R2.s) iOException).d) == 410 || i2 == 404)) {
            return k3.l.d;
        }
        long a2 = eVar.a();
        g3.r rVar = new g3.r(eVar.a, eVar.b, eVar.f(), eVar.e(), j, j2, a2);
        k.c cVar = new k.c(rVar, new g3.u(eVar.c, this.b, eVar.d, eVar.e, eVar.f, K.j1(eVar.g), K.j1(eVar.h)), iOException, i);
        k.b a3 = this.i.a(B.c(this.d.l()), cVar);
        boolean o = (a3 == null || a3.a != 2) ? false : this.d.o(eVar, a3.b);
        if (o) {
            if (P && a2 == 0) {
                ArrayList arrayList = this.n;
                P2.a.f(((j) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (this.n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((j) t7.u.d(this.n)).o();
                }
            }
            h = k3.l.f;
        } else {
            long c2 = this.i.c(cVar);
            h = c2 != -9223372036854775807L ? k3.l.h(false, c2) : k3.l.g;
        }
        l.c cVar2 = h;
        boolean c3 = cVar2.c();
        this.k.v(rVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h, iOException, !c3);
        if (!c3) {
            this.u = null;
            this.i.d(eVar.a);
        }
        if (o) {
            if (this.D) {
                this.c.i(this);
            } else {
                d(new x0.b().f(this.P).d());
            }
        }
        return cVar2;
    }

    public long b() {
        if (Q()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return L().h;
    }

    public void b0() {
        this.x.clear();
    }

    public boolean c() {
        return this.j.j();
    }

    public boolean c0(Uri uri, k.c cVar, boolean z) {
        k.b a2;
        if (!this.d.q(uri)) {
            return true;
        }
        long j = (z || (a2 = this.i.a(B.c(this.d.l()), cVar)) == null || a2.a != 2) ? -9223372036854775807L : a2.b;
        return this.d.s(uri, j) && j != -9223372036854775807L;
    }

    public boolean d(x0 x0Var) {
        List list;
        long max;
        if (this.T || this.j.j() || this.j.i()) {
            return false;
        }
        if (Q()) {
            list = Collections.emptyList();
            max = this.Q;
            for (d dVar : this.v) {
                dVar.c0(this.Q);
            }
        } else {
            list = this.o;
            j L = L();
            max = L.h() ? L.h : Math.max(this.P, L.g);
        }
        List list2 = list;
        long j = max;
        this.m.a();
        this.d.f(x0Var, j, list2, this.D || !list2.isEmpty(), this.m);
        f.b bVar = this.m;
        boolean z = bVar.b;
        h3.e eVar = bVar.a;
        Uri uri = bVar.c;
        if (z) {
            this.Q = -9223372036854775807L;
            this.T = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.c.k(uri);
            }
            return false;
        }
        if (P(eVar)) {
            O((j) eVar);
        }
        this.u = eVar;
        this.k.z(new g3.r(eVar.a, eVar.b, this.j.n(eVar, this, this.i.b(eVar.c))), eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h);
        return true;
    }

    public void d0() {
        if (this.n.isEmpty()) {
            return;
        }
        j jVar = (j) t7.u.d(this.n);
        int d2 = this.d.d(jVar);
        if (d2 == 1) {
            jVar.v();
            return;
        }
        if (d2 == 0) {
            this.r.post(new r(this, jVar));
        } else if (d2 == 2 && !this.T && this.j.j()) {
            this.j.f();
        }
    }

    public o3.O e(int i, int i2) {
        o3.O o;
        if (!Y.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                o3.O[] oArr = this.v;
                if (i3 >= oArr.length) {
                    o = null;
                    break;
                }
                if (this.w[i3] == i) {
                    o = oArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            o = M(i, i2);
        }
        if (o == null) {
            if (this.U) {
                return D(i, i2);
            }
            o = E(i, i2);
        }
        if (i2 != 5) {
            return o;
        }
        if (this.z == null) {
            this.z = new c(o, this.l);
        }
        return this.z;
    }

    public final void e0() {
        this.C = true;
        V();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Attempt to invoke virtual method 'void jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)' on a null object reference
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:90)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:107)
        */
    public long f() {
        /*
            r7 = this;
            boolean r0 = r7.T
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.Q()
            if (r0 == 0) goto L10
            long r0 = r7.Q
            return r0
        L10:
            long r0 = r7.P
            Z2.j r2 = r7.L()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            Z2.j r2 = (Z2.j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.C
            if (r2 == 0) goto L55
            Z2.s$d[] r2 = r7.v
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.A()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.s.f():long");
    }

    public void f0(H[] hArr, int i, int... iArr) {
        this.I = F(hArr);
        this.J = new HashSet();
        for (int i2 : iArr) {
            this.J.add(this.I.b(i2));
        }
        this.L = i;
        Handler handler = this.r;
        b bVar = this.c;
        Objects.requireNonNull(bVar);
        handler.post(new q(bVar));
        n0();
    }

    public long g(long j, a1 a1Var) {
        return this.d.c(j, a1Var);
    }

    public int g0(int i, u0 u0Var, S2.f fVar, int i2) {
        if (Q()) {
            return -3;
        }
        int i3 = 0;
        if (!this.n.isEmpty()) {
            int i4 = 0;
            while (i4 < this.n.size() - 1 && J((j) this.n.get(i4))) {
                i4++;
            }
            K.V0(this.n, 0, i4);
            j jVar = (j) this.n.get(0);
            M2.q qVar = jVar.d;
            if (!qVar.equals(this.G)) {
                this.k.h(this.b, qVar, jVar.e, jVar.f, jVar.g);
            }
            this.G = qVar;
        }
        if (!this.n.isEmpty() && !((j) this.n.get(0)).q()) {
            return -3;
        }
        int T = this.v[i].T(u0Var, fVar, i2, this.T);
        if (T == -5) {
            M2.q qVar2 = (M2.q) P2.a.e(u0Var.b);
            if (i == this.B) {
                int d2 = w7.f.d(this.v[i].R());
                while (i3 < this.n.size() && ((j) this.n.get(i3)).k != d2) {
                    i3++;
                }
                qVar2 = qVar2.h(i3 < this.n.size() ? ((j) this.n.get(i3)).d : (M2.q) P2.a.e(this.F));
            }
            u0Var.b = qVar2;
        }
        return T;
    }

    public void h(long j) {
        if (this.j.i() || Q()) {
            return;
        }
        if (this.j.j()) {
            P2.a.e(this.u);
            if (this.d.x(j, this.u, this.o)) {
                this.j.f();
                return;
            }
            return;
        }
        int size = this.o.size();
        while (size > 0 && this.d.d((j) this.o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.o.size()) {
            H(size);
        }
        int i = this.d.i(j, this.o);
        if (i < this.n.size()) {
            H(i);
        }
    }

    public void h0() {
        if (this.D) {
            for (d dVar : this.v) {
                dVar.S();
            }
        }
        this.d.t();
        this.j.m(this);
        this.r.removeCallbacksAndMessages((Object) null);
        this.H = true;
        this.s.clear();
    }

    public final void i0() {
        for (d dVar : this.v) {
            dVar.X(this.R);
        }
        this.R = false;
    }

    public final boolean j0(long j, j jVar) {
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            d dVar = this.v[i];
            if (!(jVar != null ? dVar.Z(jVar.m(i)) : dVar.a0(j, false)) && (this.O[i] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    public boolean k0(long j, boolean z) {
        j jVar;
        this.P = j;
        if (Q()) {
            this.Q = j;
            return true;
        }
        if (this.d.m()) {
            for (int i = 0; i < this.n.size(); i++) {
                jVar = (j) this.n.get(i);
                if (jVar.g == j) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.C && !z && j0(j, jVar)) {
            return false;
        }
        this.Q = j;
        this.T = false;
        this.n.clear();
        if (this.j.j()) {
            if (this.C) {
                for (d dVar : this.v) {
                    dVar.r();
                }
            }
            this.j.f();
        } else {
            this.j.g();
            i0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l0(j3.x[] r20, boolean[] r21, g3.P[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.s.l0(j3.x[], boolean[], g3.P[], boolean[], long, boolean):boolean");
    }

    public void m0(M2.m mVar) {
        if (K.c(this.W, mVar)) {
            return;
        }
        this.W = mVar;
        int i = 0;
        while (true) {
            d[] dVarArr = this.v;
            if (i >= dVarArr.length) {
                return;
            }
            if (this.O[i]) {
                dVarArr[i].j0(mVar);
            }
            i++;
        }
    }

    public final void n0() {
        this.D = true;
    }

    public void o0(boolean z) {
        this.d.v(z);
    }

    public void p() {
        for (d dVar : this.v) {
            dVar.U();
        }
    }

    public void p0(long j) {
        if (this.V != j) {
            this.V = j;
            for (d dVar : this.v) {
                dVar.b0(j);
            }
        }
    }

    public void q() {
        W();
        if (this.T && !this.D) {
            throw M2.z.a("Loading finished before preparation is complete.", null);
        }
    }

    public int q0(int i, long j) {
        if (Q()) {
            return 0;
        }
        d dVar = this.v[i];
        int F = dVar.F(j, this.T);
        j jVar = (j) t7.u.e(this.n, (Object) null);
        if (jVar != null && !jVar.q()) {
            F = Math.min(F, jVar.m(i) - dVar.D());
        }
        dVar.f0(F);
        return F;
    }

    public void r0(int i) {
        y();
        P2.a.e(this.K);
        int i2 = this.K[i];
        P2.a.f(this.N[i2]);
        this.N[i2] = false;
    }

    public void s() {
        this.U = true;
        this.r.post(this.q);
    }

    public final void s0(P[] pArr) {
        this.s.clear();
        for (P p : pArr) {
            if (p != null) {
                this.s.add((n) p);
            }
        }
    }

    public Y t() {
        y();
        return this.I;
    }

    public void u(long j, boolean z) {
        if (!this.C || Q()) {
            return;
        }
        int length = this.v.length;
        for (int i = 0; i < length; i++) {
            this.v[i].q(j, z, this.N[i]);
        }
    }

    public final void y() {
        P2.a.f(this.D);
        P2.a.e(this.I);
        P2.a.e(this.J);
    }

    public int z(int i) {
        y();
        P2.a.e(this.K);
        int i2 = this.K[i];
        if (i2 == -1) {
            return this.J.contains(this.I.b(i)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public void n(J j) {
    }
}
