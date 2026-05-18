package Pb;

import Sb.A;
import Sb.w;
import Sb.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class n implements Tb.b, Qb.i {
    public final BitSet a;
    public final Map b;
    public final Tb.c c;
    public final Map d;
    public Qb.m e;
    public boolean f;
    public int g;
    public f h;
    public e i;

    public static class a {
        public final List a;
        public final boolean b;
        public final boolean c;

        public a(List list, boolean z, boolean z2) {
            this.a = list;
            this.c = z;
            this.b = z2;
        }
    }

    public n(Tb.c cVar) {
        Map f = f(cVar.b());
        this.b = f;
        this.c = cVar;
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put('\\', Collections.singletonList(new Qb.c()));
        hashMap.put('`', Collections.singletonList(new Qb.d()));
        hashMap.put('&', Collections.singletonList(new Qb.f()));
        hashMap.put('<', Arrays.asList(new Qb.h[]{new Qb.b(), new Qb.g()}));
        this.a = g(f.keySet(), hashMap.keySet());
    }

    public static void d(char c, Vb.a aVar, Map map) {
        if (((Vb.a) map.put(Character.valueOf(c), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void e(Iterable iterable, Map map) {
        t tVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Vb.a aVar = (Vb.a) it.next();
            char c = aVar.c();
            char a2 = aVar.a();
            if (c == a2) {
                Vb.a aVar2 = (Vb.a) map.get(Character.valueOf(c));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    d(c, aVar, map);
                } else {
                    if (aVar2 instanceof t) {
                        tVar = (t) aVar2;
                    } else {
                        t tVar2 = new t(c);
                        tVar2.e(aVar2);
                        tVar = tVar2;
                    }
                    tVar.e(aVar);
                    map.put(Character.valueOf(c), tVar);
                }
            } else {
                d(c, aVar, map);
                d(a2, aVar, map);
            }
        }
    }

    public static Map f(List list) {
        HashMap hashMap = new HashMap();
        e(Arrays.asList(new Vb.a[]{new Qb.a(), new Qb.n()}), hashMap);
        e(list, hashMap);
        return hashMap;
    }

    public static BitSet g(Set set, Set set2) {
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        return bitSet;
    }

    public void A(Tb.g gVar) {
        this.e = Qb.m.k(gVar);
        this.f = !gVar.e().isEmpty();
        this.g = 0;
        this.h = null;
        this.i = null;
    }

    public final a B(Vb.a aVar, char c) {
        boolean z;
        int n = this.e.n();
        Qb.l o = this.e.o();
        if (this.e.g(c) < aVar.b()) {
            this.e.q(o);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.e.q(o);
        while (this.e.i(c)) {
            Qb.m mVar = this.e;
            arrayList.add(C(mVar.d(o, mVar.o())));
            o = this.e.o();
        }
        int m = this.e.m();
        boolean z2 = n == 0 || Rb.f.i(n);
        boolean z3 = n == 0 || Rb.f.k(n);
        boolean z4 = m == 0 || Rb.f.i(m);
        boolean z5 = m == 0 || Rb.f.k(m);
        boolean z6 = !z5 && (!z4 || z3 || z2);
        boolean z7 = !z3 && (!z2 || z5 || z4);
        if (c == '_') {
            z = z6 && (!z7 || z2);
            if (!z7 || (z6 && !z4)) {
                r3 = false;
            }
        } else {
            boolean z8 = z6 && c == aVar.c();
            r3 = z7 && c == aVar.a();
            z = z8;
        }
        return new a(arrayList, z, r3);
    }

    public final A C(Tb.g gVar) {
        A a2 = new A(gVar.c());
        a2.k(gVar.e());
        return a2;
    }

    public void a(Tb.g gVar, Sb.s sVar) {
        A(gVar);
        while (true) {
            List n = n();
            if (n == null) {
                u(null);
                h(sVar);
                return;
            } else {
                Iterator it = n.iterator();
                while (it.hasNext()) {
                    sVar.b((Sb.s) it.next());
                }
            }
        }
    }

    public Qb.m b() {
        return this.e;
    }

    public final void c(e eVar) {
        e eVar2 = this.i;
        if (eVar2 != null) {
            eVar2.h = true;
        }
        this.i = eVar;
    }

    public final void h(Sb.s sVar) {
        if (sVar.c() == null) {
            return;
        }
        j(sVar.c(), sVar.d());
    }

    public final void i(A a2, A a3, int i) {
        y yVar;
        if (a2 == null || a3 == null || a2 == a3) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(a2.n());
        if (this.f) {
            yVar = new y();
            yVar.a(a2.g());
        } else {
            yVar = null;
        }
        Sb.s e = a2.e();
        Sb.s e2 = a3.e();
        while (e != e2) {
            sb.append(((A) e).n());
            if (yVar != null) {
                yVar.a(e.g());
            }
            Sb.s e3 = e.e();
            e.m();
            e = e3;
        }
        a2.o(sb.toString());
        if (yVar != null) {
            a2.k(yVar.d());
        }
    }

    public final void j(Sb.s sVar, Sb.s sVar2) {
        A a2 = null;
        A a3 = null;
        int i = 0;
        while (sVar != null) {
            if (sVar instanceof A) {
                a3 = (A) sVar;
                if (a2 == null) {
                    a2 = a3;
                }
                i += a3.n().length();
            } else {
                i(a2, a3, i);
                h(sVar);
                a2 = null;
                a3 = null;
                i = 0;
            }
            if (sVar == sVar2) {
                break;
            } else {
                sVar = sVar.e();
            }
        }
        i(a2, a3, i);
    }

    public final Sb.s k() {
        Qb.l o = this.e.o();
        this.e.h();
        if (!this.e.i('[')) {
            Qb.m mVar = this.e;
            return C(mVar.d(o, mVar.o()));
        }
        Qb.l o2 = this.e.o();
        A C = C(this.e.d(o, o2));
        c(e.a(C, o, o2, this.i, this.h));
        return C;
    }

    public final Sb.s l() {
        String str;
        Sb.p a2;
        Qb.l o = this.e.o();
        this.e.h();
        Qb.l o2 = this.e.o();
        e eVar = this.i;
        if (eVar == null) {
            return C(this.e.d(o, o2));
        }
        if (!eVar.g) {
            z();
            return C(this.e.d(o, o2));
        }
        String str2 = null;
        if (this.e.i('(')) {
            this.e.r();
            String p = p(this.e);
            if (p == null) {
                this.e.q(o2);
                str = null;
            } else {
                if (this.e.r() >= 1) {
                    str = r(this.e);
                    this.e.r();
                } else {
                    str = null;
                }
                if (!this.e.i(')')) {
                    this.e.q(o2);
                    str = null;
                }
            }
            str2 = p;
        } else {
            str = null;
        }
        if (str2 == null) {
            String q = q(this.e);
            if (q == null) {
                this.e.q(o2);
            }
            if ((q == null || q.isEmpty()) && !eVar.h) {
                q = this.e.d(eVar.c, o).c();
            }
            if (q != null && (a2 = this.c.a(q)) != null) {
                str2 = a2.n();
                str = a2.p();
            }
        }
        if (str2 == null) {
            z();
            this.e.q(o2);
            return C(this.e.d(o, o2));
        }
        Sb.s mVar = eVar.d ? new Sb.m(str2, str) : new Sb.o(str2, str);
        Sb.s e = eVar.a.e();
        while (e != null) {
            Sb.s e2 = e.e();
            mVar.b(e);
            e = e2;
        }
        if (this.f) {
            Qb.m mVar2 = this.e;
            mVar.k(mVar2.d(eVar.b, mVar2.o()).e());
        }
        u(eVar.f);
        h(mVar);
        eVar.a.m();
        z();
        if (!eVar.d) {
            for (e eVar2 = this.i; eVar2 != null; eVar2 = eVar2.e) {
                if (!eVar2.d) {
                    eVar2.g = false;
                }
            }
        }
        return mVar;
    }

    public final List m(Vb.a aVar, char c) {
        a B = B(aVar, c);
        if (B == null) {
            return null;
        }
        List list = B.a;
        f fVar = new f(list, c, B.c, B.b, this.h);
        this.h = fVar;
        f fVar2 = fVar.f;
        if (fVar2 != null) {
            fVar2.g = fVar;
        }
        return list;
    }

    public final List n() {
        List m;
        char l = this.e.l();
        if (l == 0) {
            return null;
        }
        if (l == '\n') {
            return Collections.singletonList(o());
        }
        if (l == '!') {
            return Collections.singletonList(k());
        }
        if (l == '[') {
            return Collections.singletonList(s());
        }
        if (l == ']') {
            return Collections.singletonList(l());
        }
        if (!this.a.get(l)) {
            return Collections.singletonList(t());
        }
        List list = (List) this.d.get(Character.valueOf(l));
        if (list != null) {
            Qb.l o = this.e.o();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Qb.j a2 = ((Qb.h) it.next()).a(this);
                if (a2 instanceof Qb.k) {
                    Qb.k kVar = (Qb.k) a2;
                    Sb.s c = kVar.c();
                    this.e.q(kVar.d());
                    if (this.f && c.g().isEmpty()) {
                        Qb.m mVar = this.e;
                        c.k(mVar.d(o, mVar.o()).e());
                    }
                    return Collections.singletonList(c);
                }
                this.e.q(o);
            }
        }
        Vb.a aVar = (Vb.a) this.b.get(Character.valueOf(l));
        return (aVar == null || (m = m(aVar, l)) == null) ? Collections.singletonList(t()) : m;
    }

    public final Sb.s o() {
        this.e.h();
        return this.g >= 2 ? new Sb.i() : new w();
    }

    public final String p(Qb.m mVar) {
        String c;
        char l = mVar.l();
        Qb.l o = mVar.o();
        if (!Rb.e.a(mVar)) {
            return null;
        }
        if (l == '<') {
            String c2 = mVar.d(o, mVar.o()).c();
            c = c2.substring(1, c2.length() - 1);
        } else {
            c = mVar.d(o, mVar.o()).c();
        }
        return Rb.c.d(c);
    }

    public String q(Qb.m mVar) {
        if (!mVar.i('[')) {
            return null;
        }
        Qb.l o = mVar.o();
        if (!Rb.e.c(mVar)) {
            return null;
        }
        Qb.l o2 = mVar.o();
        if (!mVar.i(']')) {
            return null;
        }
        String c = mVar.d(o, o2).c();
        if (c.length() > 999) {
            return null;
        }
        return c;
    }

    public final String r(Qb.m mVar) {
        Qb.l o = mVar.o();
        if (!Rb.e.d(mVar)) {
            return null;
        }
        String c = mVar.d(o, mVar.o()).c();
        return Rb.c.d(c.substring(1, c.length() - 1));
    }

    public final Sb.s s() {
        Qb.l o = this.e.o();
        this.e.h();
        Qb.l o2 = this.e.o();
        A C = C(this.e.d(o, o2));
        c(e.b(C, o, o2, this.i, this.h));
        return C;
    }

    public final Sb.s t() {
        char l;
        Qb.l o = this.e.o();
        this.e.h();
        while (true) {
            l = this.e.l();
            if (l == 0 || this.a.get(l)) {
                break;
            }
            this.e.h();
        }
        Qb.m mVar = this.e;
        Tb.g d = mVar.d(o, mVar.o());
        String c = d.c();
        if (l == '\n') {
            int n = Rb.f.n(' ', c, c.length() - 1, 0) + 1;
            this.g = c.length() - n;
            c = c.substring(0, n);
        } else if (l == 0) {
            c = c.substring(0, Rb.f.p(c, c.length() - 1, 0) + 1);
        }
        A a2 = new A(c);
        a2.k(d.e());
        return a2;
    }

    public final void u(f fVar) {
        boolean z;
        HashMap hashMap = new HashMap();
        f fVar2 = this.h;
        while (fVar2 != null) {
            f fVar3 = fVar2.f;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c = fVar2.b;
            Vb.a aVar = (Vb.a) this.b.get(Character.valueOf(c));
            if (!fVar2.c() || aVar == null) {
                fVar2 = fVar2.g;
            } else {
                char c2 = aVar.c();
                f fVar4 = fVar2.f;
                int i = 0;
                boolean z2 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c))) {
                    if (fVar4.g() && fVar4.b == c2) {
                        i = aVar.d(fVar4, fVar2);
                        if (i > 0) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    fVar4 = fVar4.f;
                }
                z = false;
                if (z) {
                    for (int i2 = 0; i2 < i; i2++) {
                        List list = fVar4.a;
                        ((A) list.remove(list.size() - 1)).m();
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        ((A) fVar2.a.remove(0)).m();
                    }
                    y(fVar4, fVar2);
                    if (fVar4.length() == 0) {
                        w(fVar4);
                    }
                    if (fVar2.length() == 0) {
                        f fVar5 = fVar2.g;
                        w(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z2) {
                        hashMap.put(Character.valueOf(c), fVar2.f);
                        if (!fVar2.g()) {
                            x(fVar2);
                        }
                    }
                    fVar2 = fVar2.g;
                }
            }
        }
        while (true) {
            f fVar6 = this.h;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                x(fVar6);
            }
        }
    }

    public final void v(f fVar) {
        f fVar2 = fVar.f;
        if (fVar2 != null) {
            fVar2.g = fVar.g;
        }
        f fVar3 = fVar.g;
        if (fVar3 == null) {
            this.h = fVar2;
        } else {
            fVar3.f = fVar2;
        }
    }

    public final void w(f fVar) {
        v(fVar);
    }

    public final void x(f fVar) {
        v(fVar);
    }

    public final void y(f fVar, f fVar2) {
        f fVar3 = fVar2.f;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.f;
            x(fVar3);
            fVar3 = fVar4;
        }
    }

    public final void z() {
        this.i = this.i.e;
    }
}
