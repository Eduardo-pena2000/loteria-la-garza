package H;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public final int a;
    public final v[] b;
    public final E c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public x(int i, v[] vVarArr, E e, List list, boolean z, int i2) {
        this.a = i;
        this.b = vVarArr;
        this.c = e;
        this.d = list;
        this.e = z;
        this.f = i2;
        int i3 = 0;
        for (v vVar : vVarArr) {
            i3 = Math.max(i3, vVar.q());
        }
        this.g = i3;
        this.h = Wa.n.e(i3 + this.f, 0);
    }

    public final int a() {
        return this.a;
    }

    public final v[] b() {
        return this.b;
    }

    public final int c() {
        return this.g;
    }

    public final int d() {
        return this.h;
    }

    public final boolean e() {
        return this.b.length == 0;
    }

    public final v[] f(int i, int i2, int i3) {
        v[] vVarArr = this.b;
        int length = vVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            v vVar = vVarArr[i4];
            int i7 = i5 + 1;
            int d = c.d(((c) this.d.get(i5)).g());
            int i8 = this.c.a()[i6];
            boolean z = this.e;
            vVar.u(i, i8, i2, i3, z ? this.a : i6, z ? i6 : this.a);
            Ca.I i9 = Ca.I.a;
            i6 += d;
            i4++;
            i5 = i7;
        }
        return this.b;
    }
}
