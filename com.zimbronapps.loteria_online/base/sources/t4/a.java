package T4;

import Ca.q;
import Ca.x;
import Da.D;
import Da.v;
import V4.i;
import Y4.i;
import e5.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public /* synthetic */ a(List list, List list2, List list3, List list4, List list5, k kVar) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.e;
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.c;
    }

    public final List e() {
        return this.b;
    }

    public final String f(Object obj, m mVar) {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) list.get(i);
            a5.b bVar = (a5.b) qVar.a();
            if (((Class) qVar.b()).isAssignableFrom(obj.getClass())) {
                t.e(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a2 = bVar.a(obj, mVar);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) list.get(i);
            b5.d dVar = (b5.d) qVar.a();
            if (((Class) qVar.b()).isAssignableFrom(obj.getClass())) {
                t.e(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a2 = dVar.a(obj, mVar);
                if (a2 != null) {
                    obj = a2;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final q i(Y4.m mVar, m mVar2, d dVar, int i) {
        int size = this.e.size();
        while (i < size) {
            i a2 = ((i.a) this.e.get(i)).a(mVar, mVar2, dVar);
            if (a2 != null) {
                return x.a(a2, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    public final q j(Object obj, m mVar, d dVar, int i) {
        int size = this.d.size();
        while (i < size) {
            q qVar = (q) this.d.get(i);
            i.a aVar = (i.a) qVar.a();
            if (((Class) qVar.b()).isAssignableFrom(obj.getClass())) {
                t.e(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                Y4.i a2 = aVar.a(obj, mVar, dVar);
                if (a2 != null) {
                    return x.a(a2, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    public a(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public static final class a {
        public final List a;
        public final List b;
        public final List c;
        public final List d;
        public final List e;

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final a a(i.a aVar) {
            this.e.add(aVar);
            return this;
        }

        public final a b(i.a aVar, Class cls) {
            this.d.add(x.a(aVar, cls));
            return this;
        }

        public final a c(Z4.b bVar) {
            this.a.add(bVar);
            return this;
        }

        public final a d(a5.b bVar, Class cls) {
            this.c.add(x.a(bVar, cls));
            return this;
        }

        public final a e(b5.d dVar, Class cls) {
            this.b.add(x.a(dVar, cls));
            return this;
        }

        public final a f() {
            return new a(j5.c.a(this.a), j5.c.a(this.b), j5.c.a(this.c), j5.c.a(this.d), j5.c.a(this.e), null);
        }

        public final List g() {
            return this.e;
        }

        public final List h() {
            return this.d;
        }

        public a(a aVar) {
            this.a = D.O0(aVar.c());
            this.b = D.O0(aVar.e());
            this.c = D.O0(aVar.d());
            this.d = D.O0(aVar.b());
            this.e = D.O0(aVar.a());
        }
    }

    public a() {
        this(v.n(), v.n(), v.n(), v.n(), v.n());
    }
}
