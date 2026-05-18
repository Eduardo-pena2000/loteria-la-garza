package pa;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m {
    public final List a;
    public final String b;
    public final Boolean c;
    public final List d;
    public final Integer e;
    public final String f;
    public final Map g;
    public final String h;
    public final List i;

    public m(List list, String str, Boolean bool, List list2, Integer num, String str2, K k, Map map, String str3, List list3) {
        this.a = list;
        this.b = str;
        this.c = bool;
        this.d = list2;
        this.e = num;
        this.f = str2;
        this.g = map;
        this.h = str3;
        this.i = list3;
    }

    public final void a(L5.a aVar, String str) {
        HashMap hashMap = new HashMap();
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        Map map = this.g;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.g.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            hashMap.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            aVar.d((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    public AdRequest b(String str) {
        return k(new AdRequest.Builder(), str).o();
    }

    public Map c() {
        return this.g;
    }

    public String d() {
        return this.b;
    }

    public Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.a, mVar.a) && Objects.equals(this.b, mVar.b) && Objects.equals(this.c, mVar.c) && Objects.equals(this.d, mVar.d) && Objects.equals(this.e, mVar.e) && Objects.equals(this.f, mVar.f) && Objects.equals(this.g, mVar.g) && Objects.equals(this.i, mVar.i);
    }

    public List f() {
        return this.a;
    }

    public List g() {
        return this.i;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, null, this.i});
    }

    public List i() {
        return this.d;
    }

    public Boolean j() {
        return this.c;
    }

    public L5.a k(L5.a aVar, String str) {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aVar.c((String) it.next());
            }
        }
        String str2 = this.b;
        if (str2 != null) {
            aVar.g(str2);
        }
        a(aVar, str);
        List list2 = this.d;
        if (list2 != null) {
            aVar.i(list2);
        }
        Integer num = this.e;
        if (num != null) {
            aVar.h(num.intValue());
        }
        aVar.j(this.h);
        return aVar;
    }

    public static class a {
        public List a;
        public String b;
        public Boolean c;
        public List d;
        public Integer e;
        public String f;
        public Map g;
        public String h;
        public List i;

        public m a() {
            return new m(this.a, this.b, this.c, this.d, this.e, this.f, null, this.g, this.h, this.i);
        }

        public Map b() {
            return this.g;
        }

        public String c() {
            return this.b;
        }

        public Integer d() {
            return this.e;
        }

        public List e() {
            return this.a;
        }

        public List f() {
            return this.i;
        }

        public String g() {
            return this.f;
        }

        public K h() {
            return null;
        }

        public List i() {
            return this.d;
        }

        public Boolean j() {
            return this.c;
        }

        public String k() {
            return this.h;
        }

        public a l(Map map) {
            this.g = map;
            return this;
        }

        public a m(String str) {
            this.b = str;
            return this;
        }

        public a n(Integer num) {
            this.e = num;
            return this;
        }

        public a o(List list) {
            this.a = list;
            return this;
        }

        public a p(List list) {
            this.i = list;
            return this;
        }

        public a q(String str) {
            this.f = str;
            return this;
        }

        public a s(List list) {
            this.d = list;
            return this;
        }

        public a t(Boolean bool) {
            this.c = bool;
            return this;
        }

        public a u(String str) {
            this.h = str;
            return this;
        }

        public a r(K k) {
            return this;
        }
    }
}
