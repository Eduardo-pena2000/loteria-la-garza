package Wa;

import Da.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g implements Iterable, Ra.a {
    public static final a d = new a(null);
    public final int a;
    public final int b;
    public final int c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a(int i, int i2, int i3) {
            return new g(i, i2, i3);
        }

        public a() {
        }
    }

    public g(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i;
        this.b = Ka.c.c(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.a != gVar.a || this.b != gVar.b || this.c != gVar.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        if (this.c > 0) {
            if (this.a <= this.b) {
                return false;
            }
        } else if (this.a >= this.b) {
            return false;
        }
        return true;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public M iterator() {
        return new h(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.c;
        }
        sb.append(i);
        return sb.toString();
    }
}
