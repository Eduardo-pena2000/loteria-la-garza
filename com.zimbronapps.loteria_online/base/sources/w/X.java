package w;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class x implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public x() {
        this(0, 1, null);
    }

    public void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.t.e(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        x xVar = (x) clone;
        xVar.b = (long[]) this.b.clone();
        xVar.c = (Object[]) this.c.clone();
        return xVar;
    }

    public boolean c(long j) {
        return e(j) >= 0;
    }

    public Object d(long j) {
        int b = x.a.b(this.b, this.d, j);
        if (b < 0 || this.c[b] == y.a()) {
            return null;
        }
        return this.c[b];
    }

    public int e(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != y.a()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return x.a.b(this.b, this.d, j);
    }

    public boolean f() {
        return k() == 0;
    }

    public long g(int i) {
        if (!(i >= 0 && i < this.d)) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != y.a()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public void h(long j, Object obj) {
        int b = x.a.b(this.b, this.d, j);
        if (b >= 0) {
            this.c[b] = obj;
            return;
        }
        int i = ~b;
        if (i < this.d && this.c[i] == y.a()) {
            this.b[i] = j;
            this.c[i] = obj;
            return;
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr[i4];
                    if (obj2 != y.a()) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj2;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~x.a.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int f = x.a.f(i5 + 1);
            long[] copyOf = Arrays.copyOf(this.b, f);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, f);
            kotlin.jvm.internal.t.f(copyOf2, "copyOf(...)");
            this.c = copyOf2;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr2 = this.b;
            int i7 = i + 1;
            Da.p.j(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.c;
            Da.p.k(objArr2, objArr2, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public void i(long j) {
        int b = x.a.b(this.b, this.d, j);
        if (b < 0 || this.c[b] == y.a()) {
            return;
        }
        this.c[b] = y.a();
        this.a = true;
    }

    public void j(int i) {
        if (this.c[i] != y.a()) {
            this.c[i] = y.a();
            this.a = true;
        }
    }

    public int k() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != y.a()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public Object l(int i) {
        if (!(i >= 0 && i < this.d)) {
            x.d.a("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != y.a()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public String toString() {
        if (k() <= 0) {
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
            Object l = l(i2);
            if (l != sb) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    public x(int i) {
        if (i == 0) {
            this.b = x.a.b;
            this.c = x.a.c;
        } else {
            int f = x.a.f(i);
            this.b = new long[f];
            this.c = new Object[f];
        }
    }

    public /* synthetic */ x(int i, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
