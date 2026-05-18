package L7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final g f;
    public final Set g;

    public static class b {
        public String a;
        public final Set b;
        public final Set c;
        public int d;
        public int e;
        public g f;
        public final Set g;

        public /* synthetic */ b(E e, E[] eArr, a aVar) {
            this(e, eArr);
        }

        public static /* synthetic */ b a(b bVar) {
            return bVar.g();
        }

        public b b(q qVar) {
            D.c(qVar, "Null dependency");
            j(qVar.c());
            this.c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public c d() {
            D.d(this.f != null, "Missing required property: factory.");
            return new c(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g, null);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f = (g) D.c(gVar, "Null factory");
            return this;
        }

        public final b g() {
            this.e = 1;
            return this;
        }

        public b h(String str) {
            this.a = str;
            return this;
        }

        public final b i(int i) {
            D.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        public final void j(E e) {
            D.a(!this.b.contains(e), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this(cls, clsArr);
        }

        public b(Class cls, Class... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class cls2 : clsArr) {
                D.c(cls2, "Null interface");
                this.b.add(E.b(cls2));
            }
        }

        public b(E e, E... eArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            D.c(e, "Null interface");
            hashSet.add(e);
            for (E e2 : eArr) {
                D.c(e2, "Null interface");
            }
            Collections.addAll(this.b, eArr);
        }
    }

    public /* synthetic */ c(String str, Set set, Set set2, int i, int i2, g gVar, Set set3, a aVar) {
        this(str, set, set2, i, i2, gVar, set3);
    }

    public static /* synthetic */ Object a(Object obj, d dVar) {
        return r(obj, dVar);
    }

    public static /* synthetic */ Object b(Object obj, d dVar) {
        return q(obj, dVar);
    }

    public static b c(E e) {
        return new b(e, new E[0], (a) null);
    }

    public static b d(E e, E... eArr) {
        return new b(e, eArr, (a) null);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0], (a) null);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr, (a) null);
    }

    public static c l(Object obj, Class cls) {
        return m(cls).f(new L7.a(obj)).d();
    }

    public static b m(Class cls) {
        return b.a(e(cls));
    }

    public static c s(Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new L7.b(obj)).d();
    }

    public Set g() {
        return this.c;
    }

    public g h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set j() {
        return this.b;
    }

    public Set k() {
        return this.g;
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    public c t(g gVar) {
        return new c(this.a, this.b, this.c, this.d, this.e, gVar, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public c(String str, Set set, Set set2, int i, int i2, g gVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = gVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }
}
