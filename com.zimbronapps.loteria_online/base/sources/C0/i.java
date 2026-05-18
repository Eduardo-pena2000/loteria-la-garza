package c0;

import Da.p;
import Wa.n;
import b0.H1;
import b0.u1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends j {
    public int b;
    public int d;
    public int f;
    public int g;
    public d[] a = new d[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final class a implements e {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public Object a(int i) {
            return i.this.e[this.c + i];
        }

        public final d b() {
            return i.this.a[this.a];
        }

        public final boolean c() {
            if (this.a >= i.this.b) {
                return false;
            }
            d b = b();
            this.b += b.d();
            this.c += b.f();
            int i = this.a + 1;
            this.a = i;
            return i < i.this.b;
        }

        public int getInt(int i) {
            return i.this.c[this.b + i];
        }
    }

    public final void a() {
        this.b = 0;
        this.d = 0;
        p.u(this.e, (Object) null, 0, this.f);
        this.f = 0;
    }

    public final int b(int i, int i2) {
        return n.e(i + n.i(i, 1024), i2);
    }

    public final void c(d dVar) {
        int i = this.g;
        int d = dVar.d();
        if (i == ((d == 0 ? 0 : -1) >>> (32 - d))) {
            dVar.f();
        }
    }

    public final void d(b0.d dVar, H1 h1, u1 u1Var, f fVar) {
        if (g()) {
            a aVar = new a();
            do {
                aVar.b().b(aVar, dVar, h1, u1Var, fVar);
            } while (aVar.c());
        }
        a();
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        return e() == 0;
    }

    public final boolean g() {
        return e() != 0;
    }

    public final void h(i iVar) {
        d[] dVarArr = this.a;
        int i = this.b - 1;
        this.b = i;
        d dVar = dVarArr[i];
        dVarArr[i] = null;
        iVar.j(dVar);
        Object[] objArr = this.e;
        Object[] objArr2 = iVar.e;
        int f = iVar.f - dVar.f();
        int f2 = this.f - dVar.f();
        System.arraycopy(objArr, f2, objArr2, f, this.f - f2);
        p.u(this.e, (Object) null, this.f - dVar.f(), this.f);
        p.i(this.c, iVar.c, iVar.d - dVar.d(), this.d - dVar.d(), this.d);
        this.f -= dVar.f();
        this.d -= dVar.d();
    }

    public final void i(d dVar) {
        j(dVar);
    }

    public final void j(d dVar) {
        if (this.b == this.a.length) {
            m();
        }
        int d = this.d + dVar.d();
        int length = this.c.length;
        if (d > length) {
            k(length, d);
        }
        int f = this.f + dVar.f();
        int length2 = this.e.length;
        if (f > length2) {
            l(length2, f);
        }
        d[] dVarArr = this.a;
        int i = this.b;
        this.b = i + 1;
        dVarArr[i] = dVar;
        this.d += dVar.d();
        this.f += dVar.f();
    }

    public final void k(int i, int i2) {
        int[] iArr = new int[b(i, i2)];
        p.i(this.c, iArr, 0, 0, i);
        this.c = iArr;
    }

    public final void l(int i, int i2) {
        Object[] objArr = new Object[b(i, i2)];
        System.arraycopy(this.e, 0, objArr, 0, i);
        this.e = objArr;
    }

    public final void m() {
        int i = n.i(this.b, 1024);
        int i2 = this.b;
        d[] dVarArr = new d[i + i2];
        System.arraycopy(this.a, 0, dVarArr, 0, i2);
        this.a = dVarArr;
    }

    public String toString() {
        return super.toString();
    }

    public static final class b {
        public static final void b(i iVar, int i, Object obj) {
            iVar.e[(iVar.f - iVar.a[iVar.b - 1].f()) + i] = obj;
        }

        public static final void c(i iVar, int i, Object obj, int i2, Object obj2) {
            int f = iVar.f - iVar.a[iVar.b - 1].f();
            Object[] objArr = iVar.e;
            objArr[i + f] = obj;
            objArr[f + i2] = obj2;
        }

        public static final void d(i iVar, int i, Object obj, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4) {
            int f = iVar.f - iVar.a[iVar.b - 1].f();
            Object[] objArr = iVar.e;
            objArr[i + f] = obj;
            objArr[i2 + f] = obj2;
            objArr[i3 + f] = obj3;
            objArr[f + i4] = obj4;
        }

        public static final void e(i iVar, int i, Object obj, int i2, Object obj2, int i3, Object obj3) {
            int f = iVar.f - iVar.a[iVar.b - 1].f();
            Object[] objArr = iVar.e;
            objArr[i + f] = obj;
            objArr[i2 + f] = obj2;
            objArr[f + i3] = obj3;
        }

        public static i a(i iVar) {
            return iVar;
        }
    }
}
