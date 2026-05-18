package Pb;

import Pb.c;
import Pb.i;
import Pb.j;
import Pb.k;
import Pb.l;
import Pb.q;
import Pb.u;
import Sb.B;
import Sb.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h implements Ub.h {
    public static final Set r = new LinkedHashSet(Arrays.asList(new Class[]{Sb.b.class, Sb.j.class, Sb.h.class, Sb.k.class, B.class, Sb.q.class, Sb.n.class}));
    public static final Map s;
    public Tb.f a;
    public boolean e;
    public boolean i;
    public final List j;
    public final Tb.d k;
    public final List l;
    public final Tb.a m;
    public final g n;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final p o = new p();
    public final List p = new ArrayList();
    public final List q = new ArrayList();

    public static class a implements Ub.g {
        public final Ub.d a;

        public a(Ub.d dVar) {
            this.a = dVar;
        }

        public Ub.d a() {
            return this.a;
        }

        public Tb.g b() {
            Ub.d dVar = this.a;
            return dVar instanceof s ? ((s) dVar).k() : Tb.g.b();
        }
    }

    public static class b {
        public final Ub.d a;
        public int b;

        public b(Ub.d dVar, int i) {
            this.a = dVar;
            this.b = i;
        }

        public static /* synthetic */ Ub.d a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ int b(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ int c(b bVar, int i) {
            bVar.b = i;
            return i;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Sb.b.class, new c.a());
        hashMap.put(Sb.j.class, new j.a());
        hashMap.put(Sb.h.class, new i.a());
        hashMap.put(Sb.k.class, new k.b());
        hashMap.put(B.class, new u.a());
        hashMap.put(Sb.q.class, new q.a());
        hashMap.put(Sb.n.class, new l.a());
        s = Collections.unmodifiableMap(hashMap);
    }

    public h(List list, Tb.d dVar, List list2, Tb.a aVar) {
        this.j = list;
        this.k = dVar;
        this.l = list2;
        this.m = aVar;
        g gVar = new g();
        this.n = gVar;
        g(new b(gVar, 0));
    }

    public static List m(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(s.get((Class) it.next()));
        }
        return arrayList;
    }

    public static Set t() {
        return r;
    }

    public final void A(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.c = i2;
            this.d = this.g;
        }
        int length = this.a.a().length();
        while (true) {
            int i3 = this.c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                l();
            }
        }
        this.e = false;
    }

    public boolean a() {
        return this.i;
    }

    public int b() {
        return this.d;
    }

    public Tb.f c() {
        return this.a;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.f;
    }

    public Ub.d f() {
        return b.a((b) this.p.get(r0.size() - 1));
    }

    public final void g(b bVar) {
        this.p.add(bVar);
    }

    public int getIndex() {
        return this.c;
    }

    public final void h(b bVar) {
        while (!f().a(b.a(bVar).f())) {
            n(1);
        }
        f().f().b(b.a(bVar).f());
        g(bVar);
    }

    public final void i(s sVar) {
        for (Sb.p pVar : sVar.j()) {
            sVar.f().i(pVar);
            this.o.a(pVar);
        }
    }

    public final void j() {
        String a2;
        if (this.e) {
            CharSequence subSequence = this.a.a().subSequence(this.c + 1, this.a.a().length());
            int a3 = Rb.f.a(this.d);
            StringBuilder sb = new StringBuilder(subSequence.length() + a3);
            for (int i = 0; i < a3; i++) {
                sb.append(' ');
            }
            sb.append(subSequence);
            a2 = sb.toString();
        } else {
            a2 = this.c == 0 ? this.a.a() : this.a.a().subSequence(this.c, this.a.a().length());
        }
        f().h(Tb.f.c(a2, this.m == Tb.a.c ? x.d(this.b, this.c, a2.length()) : null));
        k();
    }

    public final void k() {
        if (this.m != Tb.a.a) {
            for (int i = 1; i < this.p.size(); i++) {
                b bVar = (b) this.p.get(i);
                int b2 = b.b(bVar);
                int length = this.a.a().length() - b2;
                if (length != 0) {
                    b.a(bVar).d(x.d(this.b, b2, length));
                }
            }
        }
    }

    public final void l() {
        char charAt = this.a.a().charAt(this.c);
        this.c++;
        if (charAt != '\t') {
            this.d++;
        } else {
            int i = this.d;
            this.d = i + Rb.f.a(i);
        }
    }

    public final void n(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Ub.d a2 = b.a(o());
            p(a2);
            this.q.add(a2);
        }
    }

    public final b o() {
        return (b) this.p.remove(r0.size() - 1);
    }

    public final void p(Ub.d dVar) {
        if (dVar instanceof s) {
            i((s) dVar);
        }
        dVar.g();
    }

    public final Sb.f q() {
        n(this.p.size());
        x();
        return this.n.f();
    }

    public final d r(Ub.d dVar) {
        a aVar = new a(dVar);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            Ub.f a2 = ((Ub.e) it.next()).a(this, aVar);
            if (a2 instanceof d) {
                return (d) a2;
            }
        }
        return null;
    }

    public final void s() {
        int i = this.c;
        int i2 = this.d;
        this.i = true;
        int length = this.a.a().length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.a().charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.g = i2;
        this.h = i2 - this.d;
    }

    public Sb.f u(String str) {
        int i = 0;
        while (true) {
            int c = Rb.f.c(str, i);
            if (c == -1) {
                break;
            }
            v(str.substring(i, c));
            i = c + 1;
            if (i < str.length() && str.charAt(c) == '\r' && str.charAt(i) == '\n') {
                i = c + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            v(str.substring(i));
        }
        return q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        A(r11.f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Pb.h.v(java.lang.CharSequence):void");
    }

    public final Sb.a w() {
        Ub.d a2 = b.a(o());
        if (a2 instanceof s) {
            i((s) a2);
        }
        a2.g();
        a2.f().m();
        return a2.f();
    }

    public final void x() {
        Tb.b a2 = this.k.a(new m(this.l, this.o));
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((Ub.d) it.next()).i(a2);
        }
    }

    public final void y(CharSequence charSequence) {
        this.b++;
        this.c = 0;
        this.d = 0;
        this.e = false;
        CharSequence l = Rb.f.l(charSequence);
        this.a = Tb.f.c(l, this.m != Tb.a.a ? x.d(this.b, 0, l.length()) : null);
    }

    public final void z(int i) {
        int i2;
        int i3 = this.g;
        if (i >= i3) {
            this.c = this.f;
            this.d = i3;
        }
        int length = this.a.a().length();
        while (true) {
            i2 = this.d;
            if (i2 >= i || this.c == length) {
                break;
            } else {
                l();
            }
        }
        if (i2 <= i) {
            this.e = false;
            return;
        }
        this.c--;
        this.d = i;
        this.e = true;
    }
}
