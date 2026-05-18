package X;

import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class Q implements A.Q {
    public final boolean a;
    public final float b;
    public final t0 c;
    public final long d;

    public static final class a implements t0 {
        public a() {
        }

        public final long a() {
            return Q.c(Q.this);
        }
    }

    public /* synthetic */ Q(boolean z, float f, long j, kotlin.jvm.internal.k kVar) {
        this(z, f, j);
    }

    public static final /* synthetic */ long c(Q q) {
        return q.d;
    }

    public O0.j a(E.k kVar) {
        t0 t0Var = this.c;
        if (t0Var == null) {
            t0Var = new a();
        }
        return new t(kVar, this.a, this.b, t0Var, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q = (Q) obj;
        if (this.a == q.a && n1.h.i(this.b, q.b) && kotlin.jvm.internal.t.c(this.c, q.c)) {
            return v0.r0.s(this.d, q.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.a) * 31) + n1.h.k(this.b)) * 31;
        t0 t0Var = this.c;
        return ((hashCode + (t0Var != null ? t0Var.hashCode() : 0)) * 31) + v0.r0.y(this.d);
    }

    public Q(boolean z, float f, t0 t0Var, long j) {
        this.a = z;
        this.b = f;
        this.c = t0Var;
        this.d = j;
    }

    public Q(boolean z, float f, long j) {
        this(z, f, (t0) null, j);
    }
}
