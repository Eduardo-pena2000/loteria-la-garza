package i1;

import Z0.I0;
import Z0.Y0;
import Z0.e;
import Z0.y;
import a1.O;
import android.graphics.Typeface;
import b0.h2;
import d1.H;
import d1.I;
import d1.L;
import d1.t0;
import d1.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements y {
    public final String a;
    public final Y0 b;
    public final List c;
    public final List d;
    public final u.b e;
    public final n1.d f;
    public final i g;
    public final CharSequence h;
    public final O i;
    public v j;
    public final boolean k;
    public final int l;

    public e(String str, Y0 y0, List list, List list2, u.b bVar, n1.d dVar) {
        Object obj;
        List list3;
        this.a = str;
        this.b = y0;
        this.c = list;
        this.d = list2;
        this.e = bVar;
        this.f = dVar;
        i iVar = new i(1, dVar.getDensity());
        this.g = iVar;
        this.k = !f.b(y0) ? false : ((Boolean) q.a.a().getValue()).booleanValue();
        this.l = f.d(y0.D(), y0.w());
        d dVar2 = new d(this);
        j1.e.e(iVar, y0.G());
        I0 O = y0.O();
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((e.d) obj).g() instanceof I0) {
                break;
            } else {
                i++;
            }
        }
        I0 a = j1.e.a(iVar, O, dVar2, dVar, obj != null);
        if (a != null) {
            int size2 = this.c.size() + 1;
            List arrayList = new ArrayList(size2);
            int i2 = 0;
            while (i2 < size2) {
                arrayList.add(i2 == 0 ? new e.d(a, 0, this.a.length()) : (e.d) this.c.get(i2 - 1));
                i2++;
            }
            list3 = arrayList;
        } else {
            list3 = this.c;
        }
        CharSequence a2 = c.a(this.a, this.g.getTextSize(), this.b, list3, this.d, this.f, dVar2, this.k);
        this.h = a2;
        this.i = new O(a2, this.g, this.l);
    }

    public static /* synthetic */ Typeface d(e eVar, d1.u uVar, L l, H h, I i) {
        return e(eVar, uVar, l, h, i);
    }

    public static final Typeface e(e eVar, d1.u uVar, L l, H h, I i) {
        h2 b = eVar.e.b(uVar, l, h.i(), i.m());
        if (b instanceof t0.b) {
            Object value = ((t0.b) b).getValue();
            kotlin.jvm.internal.t.e(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        v vVar = new v(b, eVar.j);
        eVar.j = vVar;
        return vVar.a();
    }

    public float a() {
        return this.i.i();
    }

    public float b() {
        return this.i.j();
    }

    public boolean c() {
        v vVar = this.j;
        return (vVar != null ? vVar.b() : false) || (!this.k && f.b(this.b) && ((Boolean) q.a.a().getValue()).booleanValue());
    }

    public final CharSequence f() {
        return this.h;
    }

    public final O g() {
        return this.i;
    }

    public final Y0 h() {
        return this.b;
    }

    public final int i() {
        return this.l;
    }

    public final i j() {
        return this.g;
    }
}
