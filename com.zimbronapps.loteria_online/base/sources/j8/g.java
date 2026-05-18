package J8;

import G8.p;
import G8.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g implements q {
    public final I8.c a;
    public final boolean b;

    public final class a extends p {
        public final p a;
        public final p b;
        public final I8.h c;

        public a(G8.d dVar, Type type, p pVar, Type type2, p pVar2, I8.h hVar) {
            this.a = new l(dVar, pVar, type);
            this.b = new l(dVar, pVar2, type2);
            this.c = hVar;
        }

        public final String d(G8.f fVar) {
            if (!fVar.h()) {
                if (fVar.f()) {
                    return "null";
                }
                throw new AssertionError();
            }
            G8.k c = fVar.c();
            if (c.n()) {
                return String.valueOf(c.j());
            }
            if (c.l()) {
                return Boolean.toString(c.i());
            }
            if (c.o()) {
                return c.k();
            }
            throw new AssertionError();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(O8.a aVar, Map map) {
            if (map == null) {
                aVar.u();
                return;
            }
            if (!g.this.b) {
                aVar.d();
                for (Map.Entry entry : map.entrySet()) {
                    aVar.s(String.valueOf(entry.getKey()));
                    this.b.c(aVar, entry.getValue());
                }
                aVar.h();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry entry2 : map.entrySet()) {
                G8.f b = this.a.b(entry2.getKey());
                arrayList.add(b);
                arrayList2.add(entry2.getValue());
                z |= b.e() || b.g();
            }
            if (!z) {
                aVar.d();
                int size = arrayList.size();
                while (i < size) {
                    aVar.s(d((G8.f) arrayList.get(i)));
                    this.b.c(aVar, arrayList2.get(i));
                    i++;
                }
                aVar.h();
                return;
            }
            aVar.c();
            int size2 = arrayList.size();
            while (i < size2) {
                aVar.c();
                I8.l.a((G8.f) arrayList.get(i), aVar);
                this.b.c(aVar, arrayList2.get(i));
                aVar.g();
                i++;
            }
            aVar.g();
        }
    }

    public g(I8.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    public p a(G8.d dVar, N8.a aVar) {
        Type d = aVar.d();
        Class c = aVar.c();
        if (!Map.class.isAssignableFrom(c)) {
            return null;
        }
        Type[] j = I8.b.j(d, c);
        return new a(dVar, j[0], b(dVar, j[0]), j[1], dVar.f(N8.a.b(j[1])), this.a.b(aVar));
    }

    public final p b(G8.d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? m.f : dVar.f(N8.a.b(type));
    }
}
