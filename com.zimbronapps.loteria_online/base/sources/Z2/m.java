package Z2;

import M2.H;
import M2.q;
import M2.y;
import P2.K;
import R2.x;
import T2.a1;
import T2.x0;
import U2.x1;
import Y2.t;
import Z2.s;
import a3.g;
import a3.k;
import android.net.Uri;
import android.text.TextUtils;
import g3.D;
import g3.Q;
import g3.Y;
import g3.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k3.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements g3.v, k.b {
    public final h a;
    public final a3.k b;
    public final g c;
    public final x d;
    public final Y2.u e;
    public final t.a f;
    public final k3.k g;
    public final D.a h;
    public final k3.b i;
    public final g3.j l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final x1 p;
    public final long r;
    public v.a s;
    public int t;
    public Y u;
    public int y;
    public Q z;
    public final s.b q = new b(this, null);
    public final IdentityHashMap j = new IdentityHashMap();
    public final v k = new v();
    public s[] v = new s[0];
    public s[] w = new s[0];
    public int[][] x = new int[0][];

    public class b implements s.b {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(s sVar) {
            m.p(m.this).i(m.this);
        }

        public void e() {
            if (m.k(m.this) > 0) {
                return;
            }
            int i = 0;
            for (s sVar : m.n(m.this)) {
                i += sVar.t().a;
            }
            H[] hArr = new H[i];
            int i2 = 0;
            for (s sVar2 : m.n(m.this)) {
                int i3 = sVar2.t().a;
                int i4 = 0;
                while (i4 < i3) {
                    hArr[i2] = sVar2.t().b(i4);
                    i4++;
                    i2++;
                }
            }
            m.o(m.this, new Y(hArr));
            m.p(m.this).n(m.this);
        }

        public void k(Uri uri) {
            m.s(m.this).g(uri);
        }

        public /* synthetic */ b(m mVar, a aVar) {
            this();
        }
    }

    public m(h hVar, a3.k kVar, g gVar, x xVar, k3.e eVar, Y2.u uVar, t.a aVar, k3.k kVar2, D.a aVar2, k3.b bVar, g3.j jVar, boolean z, int i, boolean z2, x1 x1Var, long j) {
        this.a = hVar;
        this.b = kVar;
        this.c = gVar;
        this.d = xVar;
        this.e = uVar;
        this.f = aVar;
        this.g = kVar2;
        this.h = aVar2;
        this.i = bVar;
        this.l = jVar;
        this.m = z;
        this.n = i;
        this.o = z2;
        this.p = x1Var;
        this.r = j;
        this.z = jVar.b();
    }

    public static Map A(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            M2.m mVar = (M2.m) list.get(i);
            String str = mVar.c;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                M2.m mVar2 = (M2.m) arrayList.get(i2);
                if (TextUtils.equals(mVar2.c, str)) {
                    mVar = mVar.l(mVar2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    public static M2.q B(M2.q qVar) {
        String Q = K.Q(qVar.j, 2);
        return new q.b().a0(qVar.a).c0(qVar.b).d0(qVar.c).Q(qVar.m).o0(y.g(Q)).O(Q).h0(qVar.k).M(qVar.g).j0(qVar.h).v0(qVar.t).Y(qVar.u).X(qVar.v).q0(qVar.e).m0(qVar.f).K();
    }

    public static /* synthetic */ List C(s sVar) {
        return sVar.t().c();
    }

    public static /* synthetic */ List i(s sVar) {
        return C(sVar);
    }

    public static /* synthetic */ int k(m mVar) {
        int i = mVar.t - 1;
        mVar.t = i;
        return i;
    }

    public static /* synthetic */ s[] n(m mVar) {
        return mVar.v;
    }

    public static /* synthetic */ Y o(m mVar, Y y) {
        mVar.u = y;
        return y;
    }

    public static /* synthetic */ v.a p(m mVar) {
        return mVar.s;
    }

    public static /* synthetic */ a3.k s(m mVar) {
        return mVar.b;
    }

    public static M2.q z(M2.q qVar, M2.q qVar2, boolean z) {
        M2.x xVar;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        List list;
        List s = t7.r.s();
        if (qVar2 != null) {
            str3 = qVar2.j;
            xVar = qVar2.k;
            i2 = qVar2.B;
            i = qVar2.e;
            i3 = qVar2.f;
            str = qVar2.d;
            str2 = qVar2.b;
            list = qVar2.c;
        } else {
            String Q = K.Q(qVar.j, 1);
            xVar = qVar.k;
            if (z) {
                i2 = qVar.B;
                i = qVar.e;
                i3 = qVar.f;
                str = qVar.d;
                str2 = qVar.b;
                s = qVar.c;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            List list2 = s;
            str3 = Q;
            list = list2;
        }
        return new q.b().a0(qVar.a).c0(str2).d0(list).Q(qVar.m).o0(y.g(str3)).O(str3).h0(xVar).M(z ? qVar.g : -1).j0(z ? qVar.h : -1).N(i2).q0(i).m0(i3).e0(str).K();
    }

    public void D() {
        this.b.a(this);
        for (s sVar : this.v) {
            sVar.h0();
        }
        this.s = null;
    }

    public void a() {
        for (s sVar : this.v) {
            sVar.d0();
        }
        this.s.i(this);
    }

    public long b() {
        return this.z.b();
    }

    public boolean c() {
        return this.z.c();
    }

    public boolean d(x0 x0Var) {
        if (this.u != null) {
            return this.z.d(x0Var);
        }
        for (s sVar : this.v) {
            sVar.C();
        }
        return false;
    }

    public boolean e(Uri uri, k.c cVar, boolean z) {
        boolean z2 = true;
        for (s sVar : this.v) {
            z2 &= sVar.c0(uri, cVar, z);
        }
        this.s.i(this);
        return z2;
    }

    public long f() {
        return this.z.f();
    }

    public long g(long j, a1 a1Var) {
        for (s sVar : this.w) {
            if (sVar.S()) {
                return sVar.g(j, a1Var);
            }
        }
        return j;
    }

    public void h(long j) {
        this.z.h(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(j3.x[] r22, boolean[] r23, g3.P[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.m.j(j3.x[], boolean[], g3.P[], boolean[], long):long");
    }

    public long l(long j) {
        s[] sVarArr = this.w;
        if (sVarArr.length > 0) {
            boolean k0 = sVarArr[0].k0(j, false);
            int i = 1;
            while (true) {
                s[] sVarArr2 = this.w;
                if (i >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i].k0(j, k0);
                i++;
            }
            if (k0) {
                this.k.b();
            }
        }
        return j;
    }

    public long m() {
        return -9223372036854775807L;
    }

    public void q() {
        for (s sVar : this.v) {
            sVar.q();
        }
    }

    public void r(v.a aVar, long j) {
        this.s = aVar;
        this.b.p(this);
        x(j);
    }

    public Y t() {
        return (Y) P2.a.e(this.u);
    }

    public void u(long j, boolean z) {
        for (s sVar : this.w) {
            sVar.u(j, z);
        }
    }

    public final void v(long j, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = ((g.a) list.get(i)).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (K.c(str, ((g.a) list.get(i2)).d)) {
                        g.a aVar = (g.a) list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                        z &= K.P(aVar.b.j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s y = y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) K.j(new Uri[0])), (M2.q[]) arrayList2.toArray(new M2.q[0]), null, Collections.emptyList(), map, j);
                list3.add(w7.f.m(arrayList3));
                list2.add(y);
                if (this.m && z) {
                    y.f0(new H[]{new H(str2, (M2.q[]) arrayList2.toArray(new M2.q[0]))}, 0, new int[0]);
                }
            }
        }
    }

    public final void w(a3.g gVar, long j, List list, List list2, Map map) {
        int i;
        boolean z;
        boolean z2;
        int size = gVar.e.size();
        int[] iArr = new int[size];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < gVar.e.size(); i4++) {
            M2.q qVar = ((g.b) gVar.e.get(i4)).b;
            if (qVar.u > 0 || K.Q(qVar.j, 2) != null) {
                iArr[i4] = 2;
                i2++;
            } else if (K.Q(qVar.j, 1) != null) {
                iArr[i4] = 1;
                i3++;
            } else {
                iArr[i4] = -1;
            }
        }
        if (i2 > 0) {
            i = i2;
            z2 = false;
            z = true;
        } else if (i3 < size) {
            i = size - i3;
            z = false;
            z2 = true;
        } else {
            i = size;
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[i];
        M2.q[] qVarArr = new M2.q[i];
        int[] iArr2 = new int[i];
        int i5 = 0;
        for (int i6 = 0; i6 < gVar.e.size(); i6++) {
            if ((!z || iArr[i6] == 2) && (!z2 || iArr[i6] != 1)) {
                g.b bVar = (g.b) gVar.e.get(i6);
                uriArr[i5] = bVar.a;
                qVarArr[i5] = bVar.b;
                iArr2[i5] = i6;
                i5++;
            }
        }
        String str = qVarArr[0].j;
        int P = K.P(str, 2);
        int P2 = K.P(str, 1);
        boolean z3 = (P2 == 1 || (P2 == 0 && gVar.g.isEmpty())) && P <= 1 && P2 + P > 0;
        s y = y("main", (z || P2 <= 0) ? 0 : 1, uriArr, qVarArr, gVar.j, gVar.k, map, j);
        list.add(y);
        list2.add(iArr2);
        if (this.m && z3) {
            ArrayList arrayList = new ArrayList();
            if (P > 0) {
                M2.q[] qVarArr2 = new M2.q[i];
                for (int i7 = 0; i7 < i; i7++) {
                    qVarArr2[i7] = B(qVarArr[i7]);
                }
                arrayList.add(new H("main", qVarArr2));
                if (P2 > 0 && (gVar.j != null || gVar.g.isEmpty())) {
                    arrayList.add(new H("main:audio", z(qVarArr[0], gVar.j, false)));
                }
                List list3 = gVar.k;
                if (list3 != null) {
                    for (int i8 = 0; i8 < list3.size(); i8++) {
                        arrayList.add(new H("main:cc:" + i8, this.a.b((M2.q) list3.get(i8))));
                    }
                }
            } else {
                M2.q[] qVarArr3 = new M2.q[i];
                for (int i9 = 0; i9 < i; i9++) {
                    qVarArr3[i9] = z(qVarArr[i9], gVar.j, true);
                }
                arrayList.add(new H("main", qVarArr3));
            }
            H h = new H("main:id3", new q.b().a0("ID3").o0("application/id3").K());
            arrayList.add(h);
            y.f0((H[]) arrayList.toArray(new H[0]), 0, arrayList.indexOf(h));
        }
    }

    public final void x(long j) {
        a3.g gVar = (a3.g) P2.a.e(this.b.f());
        Map A = this.o ? A(gVar.m) : Collections.emptyMap();
        boolean isEmpty = gVar.e.isEmpty();
        List list = gVar.g;
        List list2 = gVar.h;
        int i = 0;
        this.t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            w(gVar, j, arrayList, arrayList2, A);
        }
        v(j, list, arrayList, arrayList2, A);
        this.y = arrayList.size();
        int i2 = 0;
        while (i2 < list2.size()) {
            g.a aVar = (g.a) list2.get(i2);
            String str = "subtitle:" + i2 + ":" + aVar.d;
            M2.q qVar = aVar.b;
            int i3 = i2;
            s y = y(str, 3, new Uri[]{aVar.a}, new M2.q[]{qVar}, null, Collections.emptyList(), A, j);
            arrayList2.add(new int[]{i3});
            arrayList.add(y);
            y.f0(new H[]{new H(str, this.a.b(qVar))}, 0, new int[0]);
            i2 = i3 + 1;
            i = 0;
            A = A;
        }
        int i4 = i;
        this.v = (s[]) arrayList.toArray(new s[i4]);
        this.x = (int[][]) arrayList2.toArray(new int[i4][]);
        this.t = this.v.length;
        for (int i5 = i4; i5 < this.y; i5++) {
            this.v[i5].o0(true);
        }
        s[] sVarArr = this.v;
        int length = sVarArr.length;
        for (int i6 = i4; i6 < length; i6++) {
            sVarArr[i6].C();
        }
        this.w = this.v;
    }

    public final s y(String str, int i, Uri[] uriArr, M2.q[] qVarArr, M2.q qVar, List list, Map map, long j) {
        return new s(str, i, this.q, new f(this.a, this.b, uriArr, qVarArr, this.c, this.d, this.k, this.r, list, this.p, null), map, this.i, j, qVar, this.e, this.f, this.g, this.h, this.n);
    }
}
