package y1;

import B1.d;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h {
    public static float v = Float.NaN;
    public B1.e a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final HashMap s;
    public String t;
    public w1.b u;

    public h(B1.e eVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = eVar;
    }

    public static void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public String c() {
        B1.e eVar = this.a;
        return eVar == null ? "unknown" : eVar.o;
    }

    public boolean d() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    public StringBuilder e(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, "left", this.b);
        b(sb, "top", this.c);
        b(sb, "right", this.d);
        b(sb, "bottom", this.e);
        a(sb, "pivotX", this.f);
        a(sb, "pivotY", this.g);
        a(sb, "rotationX", this.h);
        a(sb, "rotationY", this.i);
        a(sb, "rotationZ", this.j);
        a(sb, "translationX", this.k);
        a(sb, "translationY", this.l);
        a(sb, "translationZ", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.o);
        a(sb, "alpha", this.p);
        b(sb, "visibility", this.r);
        a(sb, "interpolatedPos", this.q);
        if (this.a != null) {
            for (d.a aVar : d.a.values()) {
                f(sb, aVar);
            }
        }
        if (z) {
            a(sb, "phone_orientation", v);
        }
        if (z) {
            a(sb, "phone_orientation", v);
        }
        if (this.s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.s.keySet()) {
                v1.a aVar2 = (v1.a) this.s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (aVar2.h()) {
                    case 900:
                        sb.append(aVar2.e());
                        sb.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb.append(aVar2.d());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(v1.a.a(aVar2.e()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(aVar2.g());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(aVar2.c());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public final void f(StringBuilder sb, d.a aVar) {
        B1.d o = this.a.o(aVar);
        if (o == null || o.f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(aVar.name());
        sb.append(": ['");
        String str = o.f.h().o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(o.f.k().name());
        sb.append("', '");
        sb.append(o.g);
        sb.append("'],\n");
    }

    public void g(String str, int i, float f) {
        if (this.s.containsKey(str)) {
            ((v1.a) this.s.get(str)).i(f);
        } else {
            this.s.put(str, new v1.a(str, i, f));
        }
    }

    public void h(String str, int i, int i2) {
        if (this.s.containsKey(str)) {
            ((v1.a) this.s.get(str)).j(i2);
        } else {
            this.s.put(str, new v1.a(str, i, i2));
        }
    }

    public void i(w1.b bVar) {
        this.u = bVar;
    }

    public h j() {
        B1.e eVar = this.a;
        if (eVar != null) {
            this.b = eVar.E();
            this.c = this.a.S();
            this.d = this.a.N();
            this.e = this.a.r();
            k(this.a.n);
        }
        return this;
    }

    public void k(h hVar) {
        if (hVar == null) {
            return;
        }
        this.f = hVar.f;
        this.g = hVar.g;
        this.h = hVar.h;
        this.i = hVar.i;
        this.j = hVar.j;
        this.k = hVar.k;
        this.l = hVar.l;
        this.m = hVar.m;
        this.n = hVar.n;
        this.o = hVar.o;
        this.p = hVar.p;
        this.r = hVar.r;
        i(hVar.u);
        this.s.clear();
        for (v1.a aVar : hVar.s.values()) {
            this.s.put(aVar.f(), aVar.b());
        }
    }

    public h(h hVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = hVar.a;
        this.b = hVar.b;
        this.c = hVar.c;
        this.d = hVar.d;
        this.e = hVar.e;
        k(hVar);
    }
}
