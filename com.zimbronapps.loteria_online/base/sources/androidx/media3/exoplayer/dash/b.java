package androidx.media3.exoplayer.dash;

import M2.H;
import M2.q;
import P2.K;
import R2.x;
import T2.a1;
import T2.x0;
import U2.x1;
import X2.g;
import Y2.t;
import Y2.u;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import g3.D;
import g3.P;
import g3.Q;
import g3.Y;
import g3.j;
import g3.o;
import g3.v;
import h3.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.e;
import k3.k;
import k3.m;
import t7.r;
import t7.z;
import w7.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements v, Q.a, h.b {
    public static final Pattern y = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int a;
    public final a.a b;
    public final x c;
    public final u d;
    public final k e;
    public final W2.b f;
    public final long g;
    public final m h;
    public final k3.b i;
    public final Y j;
    public final a[] k;
    public final j l;
    public final d m;
    public final D.a o;
    public final t.a p;
    public final x1 q;
    public v.a r;
    public Q u;
    public X2.c v;
    public int w;
    public List x;
    public h[] s = I(0);
    public W2.j[] t = new W2.j[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final r h;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, r rVar) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
            this.h = rVar;
        }

        public static a a(int[] iArr, int i, r rVar) {
            return new a(3, 1, iArr, i, -1, -1, -1, rVar);
        }

        public static a b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1, r.s());
        }

        public static a c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i, r.s());
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1, r.s());
        }
    }

    public b(int i, X2.c cVar, W2.b bVar, int i2, a.a aVar, x xVar, e eVar, u uVar, t.a aVar2, k kVar, D.a aVar3, long j, m mVar, k3.b bVar2, j jVar, d.b bVar3, x1 x1Var) {
        this.a = i;
        this.v = cVar;
        this.f = bVar;
        this.w = i2;
        this.b = aVar;
        this.c = xVar;
        this.d = uVar;
        this.p = aVar2;
        this.e = kVar;
        this.o = aVar3;
        this.g = j;
        this.h = mVar;
        this.i = bVar2;
        this.l = jVar;
        this.q = x1Var;
        this.m = new d(cVar, bVar3, bVar2);
        this.u = jVar.b();
        g d = cVar.d(i2);
        List list = d.d;
        this.x = list;
        Pair w = w(uVar, aVar, d.c, list);
        this.j = (Y) w.first;
        this.k = (a[]) w.second;
    }

    public static q[] A(List list, int[] iArr) {
        for (int i : iArr) {
            X2.a aVar = (X2.a) list.get(i);
            List list2 = ((X2.a) list.get(i)).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                X2.e eVar = (X2.e) list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.a)) {
                    return K(eVar, y, new q.b().o0("application/cea-608").a0(aVar.a + ":cea608").K());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.a)) {
                    return K(eVar, z, new q.b().o0("application/cea-708").a0(aVar.a + ":cea708").K());
                }
            }
        }
        return new q[0];
    }

    public static int[][] B(List list) {
        X2.e x;
        Integer num;
        int size = list.size();
        HashMap e = z.e(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            e.put(Long.valueOf(((X2.a) list.get(i)).a), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            X2.a aVar = (X2.a) list.get(i2);
            X2.e z2 = z(aVar.e);
            if (z2 == null) {
                z2 = z(aVar.f);
            }
            int intValue = (z2 == null || (num = (Integer) e.get(Long.valueOf(Long.parseLong(z2.b)))) == null) ? i2 : num.intValue();
            if (intValue == i2 && (x = x(aVar.f)) != null) {
                for (String str : K.c1(x.b, ",")) {
                    Integer num2 = (Integer) e.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] m = f.m((Collection) arrayList.get(i3));
            iArr[i3] = m;
            Arrays.sort(m);
        }
        return iArr;
    }

    public static boolean E(List list, int[] iArr) {
        for (int i : iArr) {
            List list2 = ((X2.a) list.get(i)).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!((X2.j) list2.get(i2)).e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int F(int i, List list, int[][] iArr, boolean[] zArr, q[][] qVarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (E(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            q[] A = A(list, iArr[i3]);
            qVarArr[i3] = A;
            if (A.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    public static /* synthetic */ List G(h hVar) {
        return r.t(Integer.valueOf(hVar.a));
    }

    public static void H(a.a aVar, q[] qVarArr) {
        for (int i = 0; i < qVarArr.length; i++) {
            qVarArr[i] = aVar.b(qVarArr[i]);
        }
    }

    public static h[] I(int i) {
        return new h[i];
    }

    public static q[] K(X2.e eVar, Pattern pattern, q qVar) {
        String str = eVar.b;
        if (str == null) {
            return new q[]{qVar};
        }
        CharSequence[] c1 = K.c1(str, ";");
        q[] qVarArr = new q[c1.length];
        for (int i = 0; i < c1.length; i++) {
            Matcher matcher = pattern.matcher(c1[i]);
            if (!matcher.matches()) {
                return new q[]{qVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            qVarArr[i] = qVar.a().a0(qVar.a + ":" + parseInt).L(parseInt).e0(matcher.group(2)).K();
        }
        return qVarArr;
    }

    public static /* synthetic */ List o(h hVar) {
        return G(hVar);
    }

    public static void p(List list, H[] hArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            X2.f fVar = (X2.f) list.get(i2);
            hArr[i] = new H(fVar.a() + ":" + i2, new q.b().a0(fVar.a()).o0("application/x-emsg").K());
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    public static int s(u uVar, a.a aVar, List list, int[][] iArr, int i, boolean[] zArr, q[][] qVarArr, H[] hArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(((X2.a) list.get(i6)).c);
            }
            int size = arrayList.size();
            q[] qVarArr2 = new q[size];
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = ((X2.j) arrayList.get(i7)).b;
                qVarArr2[i7] = qVar.a().R(uVar.b(qVar)).K();
            }
            X2.a aVar2 = (X2.a) list.get(iArr2[0]);
            long j = aVar2.a;
            String l = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (qVarArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            H(aVar, qVarArr2);
            hArr[i5] = new H(l, qVarArr2);
            aVarArr[i5] = a.d(aVar2.b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str = l + ":emsg";
                hArr[i8] = new H(str, new q.b().a0(str).o0("application/x-emsg").K());
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                aVarArr[i2] = a.a(iArr2, i5, r.o(qVarArr[i4]));
                H(aVar, qVarArr[i4]);
                hArr[i2] = new H(l + ":cc", qVarArr[i4]);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    public static Pair w(u uVar, a.a aVar, List list, List list2) {
        int[][] B = B(list);
        int length = B.length;
        boolean[] zArr = new boolean[length];
        q[][] qVarArr = new q[length][];
        int F = F(length, list, B, zArr, qVarArr) + length + list2.size();
        H[] hArr = new H[F];
        a[] aVarArr = new a[F];
        p(list2, hArr, aVarArr, s(uVar, aVar, list, B, length, zArr, qVarArr, hArr, aVarArr));
        return Pair.create(new Y(hArr), aVarArr);
    }

    public static X2.e x(List list) {
        return y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static X2.e y(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            X2.e eVar = (X2.e) list.get(i);
            if (str.equals(eVar.a)) {
                return eVar;
            }
        }
        return null;
    }

    public static X2.e z(List list) {
        return y(list, "http://dashif.org/guidelines/trickmode");
    }

    public final int C(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.k[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.k[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final int[] D(j3.x[] xVarArr) {
        int[] iArr = new int[xVarArr.length];
        for (int i = 0; i < xVarArr.length; i++) {
            j3.x xVar = xVarArr[i];
            if (xVar != null) {
                iArr[i] = this.j.d(xVar.k());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void i(h hVar) {
        this.r.i(this);
    }

    public void L() {
        this.m.o();
        for (h hVar : this.s) {
            hVar.O(this);
        }
        this.r = null;
    }

    public final void M(j3.x[] xVarArr, boolean[] zArr, P[] pArr) {
        for (int i = 0; i < xVarArr.length; i++) {
            if (xVarArr[i] == null || !zArr[i]) {
                P p = pArr[i];
                if (p instanceof h) {
                    ((h) p).O(this);
                } else if (p instanceof h.a) {
                    ((h.a) p).c();
                }
                pArr[i] = null;
            }
        }
    }

    public final void N(j3.x[] xVarArr, P[] pArr, int[] iArr) {
        boolean z2;
        for (int i = 0; i < xVarArr.length; i++) {
            P p = pArr[i];
            if ((p instanceof o) || (p instanceof h.a)) {
                int C = C(i, iArr);
                if (C == -1) {
                    z2 = pArr[i] instanceof o;
                } else {
                    P p2 = pArr[i];
                    z2 = (p2 instanceof h.a) && ((h.a) p2).a == pArr[C];
                }
                if (!z2) {
                    P p3 = pArr[i];
                    if (p3 instanceof h.a) {
                        ((h.a) p3).c();
                    }
                    pArr[i] = null;
                }
            }
        }
    }

    public final void O(j3.x[] xVarArr, P[] pArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < xVarArr.length; i++) {
            j3.x xVar = xVarArr[i];
            if (xVar != null) {
                P p = pArr[i];
                if (p == null) {
                    zArr[i] = true;
                    a aVar = this.k[iArr[i]];
                    int i2 = aVar.c;
                    if (i2 == 0) {
                        pArr[i] = v(aVar, xVar, j);
                    } else if (i2 == 2) {
                        pArr[i] = new W2.j((X2.f) this.x.get(aVar.d), xVar.k().a(0), this.v.d);
                    }
                } else if (p instanceof h) {
                    ((androidx.media3.exoplayer.dash.a) ((h) p).D()).e(xVar);
                }
            }
        }
        for (int i3 = 0; i3 < xVarArr.length; i3++) {
            if (pArr[i3] == null && xVarArr[i3] != null) {
                a aVar2 = this.k[iArr[i3]];
                if (aVar2.c == 1) {
                    int C = C(i3, iArr);
                    if (C == -1) {
                        pArr[i3] = new o();
                    } else {
                        pArr[i3] = ((h) pArr[C]).R(j, aVar2.b);
                    }
                }
            }
        }
    }

    public void P(X2.c cVar, int i) {
        this.v = cVar;
        this.w = i;
        this.m.q(cVar);
        h[] hVarArr = this.s;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                ((androidx.media3.exoplayer.dash.a) hVar.D()).f(cVar, i);
            }
            this.r.i(this);
        }
        this.x = cVar.d(i).d;
        for (W2.j jVar : this.t) {
            Iterator it = this.x.iterator();
            while (true) {
                if (it.hasNext()) {
                    X2.f fVar = (X2.f) it.next();
                    if (fVar.a().equals(jVar.b())) {
                        jVar.d(fVar, cVar.d && i == cVar.e() - 1);
                    }
                }
            }
        }
    }

    public synchronized void a(h hVar) {
        d.c cVar = (d.c) this.n.remove(hVar);
        if (cVar != null) {
            cVar.n();
        }
    }

    public long b() {
        return this.u.b();
    }

    public boolean c() {
        return this.u.c();
    }

    public boolean d(x0 x0Var) {
        return this.u.d(x0Var);
    }

    public long f() {
        return this.u.f();
    }

    public long g(long j, a1 a1Var) {
        for (h hVar : this.s) {
            if (hVar.a == 2) {
                return hVar.g(j, a1Var);
            }
        }
        return j;
    }

    public void h(long j) {
        this.u.h(j);
    }

    public long j(j3.x[] xVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j) {
        int[] D = D(xVarArr);
        M(xVarArr, zArr, pArr);
        N(xVarArr, pArr, D);
        O(xVarArr, pArr, zArr2, j, D);
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (P p : pArr) {
            if (p instanceof h) {
                arrayList.add((h) p);
            } else if (p instanceof W2.j) {
                arrayList2.add((W2.j) p);
            }
        }
        h[] I = I(arrayList.size());
        this.s = I;
        arrayList.toArray(I);
        W2.j[] jVarArr = new W2.j[arrayList2.size()];
        this.t = jVarArr;
        arrayList2.toArray(jVarArr);
        this.u = this.l.a(arrayList, t7.x.k(arrayList, new W2.d()));
        return j;
    }

    public long l(long j) {
        for (h hVar : this.s) {
            hVar.Q(j);
        }
        for (W2.j jVar : this.t) {
            jVar.c(j);
        }
        return j;
    }

    public long m() {
        return -9223372036854775807L;
    }

    public void q() {
        this.h.a();
    }

    public void r(v.a aVar, long j) {
        this.r = aVar;
        aVar.n(this);
    }

    public Y t() {
        return this.j;
    }

    public void u(long j, boolean z2) {
        for (h hVar : this.s) {
            hVar.u(j, z2);
        }
    }

    public final h v(a aVar, j3.x xVar, long j) {
        int i;
        H h;
        int i2;
        int i3 = aVar.f;
        boolean z2 = i3 != -1;
        d.c cVar = null;
        if (z2) {
            h = this.j.b(i3);
            i = 1;
        } else {
            i = 0;
            h = null;
        }
        int i4 = aVar.g;
        r s = i4 != -1 ? this.k[i4].h : r.s();
        int size = i + s.size();
        q[] qVarArr = new q[size];
        int[] iArr = new int[size];
        if (z2) {
            qVarArr[0] = h.a(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        List arrayList = new ArrayList();
        for (int i5 = 0; i5 < s.size(); i5++) {
            q qVar = (q) s.get(i5);
            qVarArr[i2] = qVar;
            iArr[i2] = 3;
            arrayList.add(qVar);
            i2++;
        }
        if (this.v.d && z2) {
            cVar = this.m.k();
        }
        d.c cVar2 = cVar;
        h hVar = new h(aVar.b, iArr, qVarArr, this.b.c(this.h, this.v, this.f, this.w, aVar.a, xVar, aVar.b, this.g, z2, arrayList, cVar2, this.c, this.q, null), this, this.i, j, this.d, this.p, this.e, this.o);
        synchronized (this) {
            this.n.put(hVar, cVar2);
        }
        return hVar;
    }
}
