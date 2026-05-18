package qb;

import Ca.x;
import Da.D;
import Da.J;
import Da.S;
import Da.r;
import Da.w;
import Wa.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import qb.e;
import sb.e0;
import sb.l0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class h implements e, sb.l {
    public final String a;
    public final l b;
    public final int c;
    public final List d;
    public final Set e;
    public final String[] f;
    public final e[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final e[] k;
    public final Ca.l l;

    public h(String serialName, l kind, int i, List typeParameters, a builder) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        t.g(typeParameters, "typeParameters");
        t.g(builder, "builder");
        this.a = serialName;
        this.b = kind;
        this.c = i;
        this.d = builder.c();
        this.e = D.J0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f = strArr;
        this.g = e0.b(builder.e());
        this.h = (List[]) builder.d().toArray(new List[0]);
        this.i = D.F0(builder.g());
        Iterable<J> c1 = r.c1(strArr);
        ArrayList arrayList = new ArrayList(w.y(c1, 10));
        for (J j : c1) {
            arrayList.add(x.a(j.b(), Integer.valueOf(j.a())));
        }
        this.j = S.x(arrayList);
        this.k = e0.b(typeParameters);
        this.l = Ca.m.b(new f(this));
    }

    public static /* synthetic */ int j(h hVar) {
        return l(hVar);
    }

    public static /* synthetic */ CharSequence k(h hVar, int i) {
        return n(hVar, i);
    }

    public static final int l(h hVar) {
        return l0.a(hVar, hVar.k);
    }

    public static final CharSequence n(h hVar, int i) {
        return hVar.e(i) + ": " + hVar.g(i).h();
    }

    public Set a() {
        return this.e;
    }

    public boolean b() {
        return e.a.c(this);
    }

    public int c(String name) {
        t.g(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public int d() {
        return this.c;
    }

    public String e(int i) {
        return this.f[i];
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            e eVar = (e) obj;
            if (t.c(h(), eVar.h()) && Arrays.equals(this.k, ((h) obj).k) && d() == eVar.d()) {
                int d = d();
                for (0; i < d; i + 1) {
                    i = (t.c(g(i).h(), eVar.g(i).h()) && t.c(g(i).getKind(), eVar.g(i).getKind())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    public List f(int i) {
        return this.h[i];
    }

    public e g(int i) {
        return this.g[i];
    }

    public List getAnnotations() {
        return this.d;
    }

    public l getKind() {
        return this.b;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        return m();
    }

    public boolean i(int i) {
        return this.i[i];
    }

    public boolean isInline() {
        return e.a.b(this);
    }

    public final int m() {
        return ((Number) this.l.getValue()).intValue();
    }

    public String toString() {
        return D.n0(n.w(0, d()), ", ", h() + '(', ")", 0, null, new g(this), 24, null);
    }
}
