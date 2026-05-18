package pa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public final int a;

    public static abstract class d extends f {
        public d(int i) {
            super(i);
        }

        public abstract void c(boolean z);

        public abstract void d();
    }

    public f(int i) {
        this.a = i;
    }

    public abstract void a();

    public io.flutter.plugin.platform.i b() {
        return null;
    }

    public static class a {
        public final int a;
        public final String b;
        public final String c;

        public a(L5.b bVar) {
            this.a = bVar.a();
            this.b = bVar.b();
            this.c = bVar.c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b)) {
                return this.c.equals(aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b, this.c});
        }

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public static class c {
        public final int a;
        public final String b;
        public final String c;
        public e d;

        public c(L5.n nVar) {
            this.a = nVar.a();
            this.b = nVar.b();
            this.c = nVar.c();
            if (nVar.f() != null) {
                this.d = new e(nVar.f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b.equals(cVar.b) && Objects.equals(this.d, cVar.d)) {
                return this.c.equals(cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
        }

        public c(int i, String str, String str2, e eVar) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = eVar;
        }
    }

    public static class b {
        public final String a;
        public final long b;
        public final String c;
        public final Map d;
        public a e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public b(L5.k kVar) {
            this.a = kVar.f();
            this.b = kVar.h();
            this.c = kVar.toString();
            if (kVar.g() != null) {
                this.d = new HashMap();
                for (String str : kVar.g().keySet()) {
                    this.d.put(str, kVar.g().getString(str));
                }
            } else {
                this.d = new HashMap();
            }
            if (kVar.a() != null) {
                this.e = new a(kVar.a());
            }
            this.f = kVar.e();
            this.g = kVar.b();
            this.h = kVar.d();
            this.i = kVar.c();
        }

        public String a() {
            return this.g;
        }

        public String b() {
            return this.i;
        }

        public String c() {
            return this.h;
        }

        public String d() {
            return this.f;
        }

        public Map e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.e, bVar.e) && Objects.equals(this.d, bVar.d) && Objects.equals(this.f, bVar.f) && Objects.equals(this.g, bVar.g) && Objects.equals(this.h, bVar.h) && Objects.equals(this.i, bVar.i);
        }

        public String f() {
            return this.a;
        }

        public String g() {
            return this.c;
        }

        public a h() {
            return this.e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, Long.valueOf(this.b), this.c, this.e, this.f, this.g, this.h, this.i});
        }

        public long i() {
            return this.b;
        }

        public b(String str, long j, String str2, Map map, a aVar, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = map;
            this.e = aVar;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
        }
    }

    public static class e {
        public final String a;
        public final String b;
        public final List c;
        public final b d;
        public final Map e;

        public e(L5.z zVar) {
            this.a = zVar.e();
            this.b = zVar.c();
            ArrayList arrayList = new ArrayList();
            Iterator it = zVar.a().iterator();
            while (it.hasNext()) {
                arrayList.add(new b((L5.k) it.next()));
            }
            this.c = arrayList;
            if (zVar.b() != null) {
                this.d = new b(zVar.b());
            } else {
                this.d = null;
            }
            HashMap hashMap = new HashMap();
            if (zVar.d() != null) {
                for (String str : zVar.d().keySet()) {
                    hashMap.put(str, zVar.d().getString(str));
                }
            }
            this.e = hashMap;
        }

        public List a() {
            return this.c;
        }

        public b b() {
            return this.d;
        }

        public String c() {
            return this.b;
        }

        public Map d() {
            return this.e;
        }

        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Objects.equals(this.a, eVar.a) && Objects.equals(this.b, eVar.b) && Objects.equals(this.c, eVar.c) && Objects.equals(this.d, eVar.d);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
        }

        public e(String str, String str2, List list, b bVar, Map map) {
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = bVar;
            this.e = map;
        }
    }
}
