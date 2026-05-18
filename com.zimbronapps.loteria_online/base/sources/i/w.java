package I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements v, androidx.compose.ui.layout.l {
    public final p a;
    public final M0.S b;
    public final r c;
    public final HashMap d = new HashMap();

    public w(p pVar, M0.S s) {
        this.a = pVar;
        this.b = s;
        this.c = (r) pVar.d().invoke();
    }

    public float A(int i) {
        return this.b.A(i);
    }

    public long M(float f) {
        return this.b.M(f);
    }

    public long N(long j) {
        return this.b.N(j);
    }

    public float S(long j) {
        return this.b.S(j);
    }

    public long X(float f) {
        return this.b.X(f);
    }

    public List a0(int i, long j) {
        List list = (List) this.d.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object d = this.c.d(i);
        List Y = this.b.Y(d, this.a.b(i, d, this.c.e(i)));
        int size = Y.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((M0.A) Y.get(i2)).C0(j));
        }
        this.d.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    public float a1(float f) {
        return this.b.a1(f);
    }

    public float e1() {
        return this.b.e1();
    }

    public M0.C f0(int i, int i2, Map map, Qa.l lVar) {
        return this.b.f0(i, i2, map, lVar);
    }

    public float getDensity() {
        return this.b.getDensity();
    }

    public n1.t getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    public boolean h0() {
        return this.b.h0();
    }

    public M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2) {
        return this.b.h1(i, i2, map, lVar, lVar2);
    }

    public float j1(float f) {
        return this.b.j1(f);
    }

    public int s0(float f) {
        return this.b.s0(f);
    }

    public long w1(long j) {
        return this.b.w1(j);
    }

    public float y0(long j) {
        return this.b.y0(j);
    }
}
