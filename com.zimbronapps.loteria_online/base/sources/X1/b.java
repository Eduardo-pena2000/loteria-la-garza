package x1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b extends c {
    public ArrayList f;

    public b(char[] cArr) {
        super(cArr);
        this.f = new ArrayList();
    }

    public String A(int i) {
        c w = w(i);
        if (w instanceof i) {
            return w.b();
        }
        return null;
    }

    public String B(String str) {
        c x = x(str);
        if (x instanceof i) {
            return x.b();
        }
        return null;
    }

    public boolean C(String str) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if ((cVar instanceof d) && ((d) cVar).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList D() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).b());
            }
        }
        return arrayList;
    }

    public void E(String str, c cVar) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.b().equals(str)) {
                dVar.L(cVar);
                return;
            }
        }
        this.f.add((d) d.I(str, cVar));
    }

    public void F(String str, float f) {
        E(str, new e(f));
    }

    public void H(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.k(0L);
        iVar.j(str2.length() - 1);
        E(str, iVar);
    }

    public void clear() {
        this.f.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f.equals(((b) obj).f);
        }
        return false;
    }

    public float getFloat(int i) {
        c n = n(i);
        if (n != null) {
            return n.c();
        }
        throw new h("no float at index " + i, this);
    }

    public int getInt(int i) {
        c n = n(i);
        if (n != null) {
            return n.e();
        }
        throw new h("no int at index " + i, this);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f, Integer.valueOf(super.hashCode())});
    }

    public void l(c cVar) {
        this.f.add(cVar);
        if (g.a) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b clone() {
        b bVar = (b) super.a();
        ArrayList arrayList = new ArrayList(this.f.size());
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            c a = ((c) it.next()).a();
            a.i(bVar);
            arrayList.add(a);
        }
        bVar.f = arrayList;
        return bVar;
    }

    public c n(int i) {
        if (i >= 0 && i < this.f.size()) {
            return (c) this.f.get(i);
        }
        throw new h("no element at index " + i, this);
    }

    public c o(String str) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.b().equals(str)) {
                return dVar.K();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }

    public a p(String str) {
        c o = o(str);
        if (o instanceof a) {
            return (a) o;
        }
        throw new h("no array found for key <" + str + ">, found [" + o.g() + "] : " + o, this);
    }

    public a q(String str) {
        c x = x(str);
        if (x instanceof a) {
            return (a) x;
        }
        return null;
    }

    public float r(String str) {
        c o = o(str);
        if (o != null) {
            return o.c();
        }
        throw new h("no float found for key <" + str + ">, found [" + o.g() + "] : " + o, this);
    }

    public float s(String str) {
        c x = x(str);
        if (x instanceof e) {
            return x.c();
        }
        return Float.NaN;
    }

    public int size() {
        return this.f.size();
    }

    public int t(String str) {
        c o = o(str);
        if (o != null) {
            return o.e();
        }
        throw new h("no int found for key <" + str + ">, found [" + o.g() + "] : " + o, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cVar);
        }
        return super.toString() + " = <" + sb + " >";
    }

    public f u(String str) {
        c o = o(str);
        if (o instanceof f) {
            return (f) o;
        }
        throw new h("no object found for key <" + str + ">, found [" + o.g() + "] : " + o, this);
    }

    public f v(String str) {
        c x = x(str);
        if (x instanceof f) {
            return (f) x;
        }
        return null;
    }

    public c w(int i) {
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return (c) this.f.get(i);
    }

    public c x(String str) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.b().equals(str)) {
                return dVar.K();
            }
        }
        return null;
    }

    public String y(int i) {
        c n = n(i);
        if (n instanceof i) {
            return n.b();
        }
        throw new h("no string at index " + i, this);
    }

    public String z(String str) {
        c o = o(str);
        if (o instanceof i) {
            return o.b();
        }
        throw new h("no string found for key <" + str + ">, found [" + (o != null ? o.g() : null) + "] : " + o, this);
    }
}
