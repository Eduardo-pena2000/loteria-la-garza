package w;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j0 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public j0() {
        this(0, 1, null);
    }

    public void a(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            h(i, obj);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            k0.a(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e = x.a.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.b, e);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.c = copyOf2;
        }
        this.b[i3] = i;
        this.c[i3] = obj;
        this.d = i3 + 1;
    }

    public void b() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.t.e(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j0 j0Var = (j0) clone;
        j0Var.b = (int[]) this.b.clone();
        j0Var.c = (Object[]) this.c.clone();
        return j0Var;
    }

    public boolean d(int i) {
        return f(i) >= 0;
    }

    public Object e(int i) {
        return k0.c(this, i);
    }

    public int f(int i) {
        if (this.a) {
            k0.a(this);
        }
        return x.a.a(this.b, this.d, i);
    }

    public int g(int i) {
        if (this.a) {
            k0.a(this);
        }
        return this.b[i];
    }

    public void h(int i, Object obj) {
        int a = x.a.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = obj;
            return;
        }
        int i2 = ~a;
        if (i2 < this.d && this.c[i2] == k0.b()) {
            this.b[i2] = i;
            this.c[i2] = obj;
            return;
        }
        if (this.a && this.d >= this.b.length) {
            k0.a(this);
            i2 = ~x.a.a(this.b, this.d, i);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e = x.a.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.b, e);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, e);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.c = copyOf2;
        }
        int i4 = this.d;
        if (i4 - i2 != 0) {
            int[] iArr = this.b;
            int i5 = i2 + 1;
            Da.p.i(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.c;
            Da.p.k(objArr, objArr, i5, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public int i() {
        if (this.a) {
            k0.a(this);
        }
        return this.d;
    }

    public Object j(int i) {
        if (this.a) {
            k0.a(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        f fVar = f.a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            Object j = j(i2);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    public j0(int i) {
        if (i == 0) {
            this.b = x.a.a;
            this.c = x.a.c;
        } else {
            int e = x.a.e(i);
            this.b = new int[e];
            this.c = new Object[e];
        }
    }

    public /* synthetic */ j0(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
