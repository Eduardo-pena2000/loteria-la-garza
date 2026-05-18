package pa;

import M5.a;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import pa.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j extends m {
    public final Map j;
    public final Map k;
    public final String l;

    public static class b extends m.a {
        public Map j;
        public Map k;
        public String l;

        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public j a() {
            List e = e();
            String c = c();
            Map map = this.j;
            Map map2 = this.k;
            Boolean j = j();
            List i = i();
            Integer d = d();
            String str = this.l;
            String g = g();
            h();
            return new j(e, c, map, map2, j, i, d, str, g, null, b(), k(), f(), null);
        }

        public b w(Map map) {
            this.j = map;
            return this;
        }

        public b x(Map map) {
            this.k = map;
            return this;
        }

        public b y(String str) {
            this.l = str;
            return this;
        }
    }

    public /* synthetic */ j(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, K k, Map map3, String str4, List list3, a aVar) {
        this(list, str, map, map2, bool, list2, num, str2, str3, k, map3, str4, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(obj) && Objects.equals(this.j, jVar.j) && Objects.equals(this.k, jVar.k);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.j, this.k});
    }

    public M5.a l(String str) {
        a.a aVar = new a.a();
        k(aVar, str);
        Map map = this.j;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                aVar.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map map2 = this.k;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                aVar.b((String) entry2.getKey(), (List) entry2.getValue());
            }
        }
        String str2 = this.l;
        if (str2 != null) {
            aVar.q(str2);
        }
        return aVar.p();
    }

    public Map m() {
        return this.j;
    }

    public Map n() {
        return this.k;
    }

    public String o() {
        return this.l;
    }

    public j(List list, String str, Map map, Map map2, Boolean bool, List list2, Integer num, String str2, String str3, K k, Map map3, String str4, List list3) {
        super(list, str, bool, list2, num, str3, k, map3, str4, list3);
        this.j = map;
        this.k = map2;
        this.l = str2;
    }
}
