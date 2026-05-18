package A;

import v0.b1;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public b1 a;
    public v0.j0 b;
    public x0.a c;
    public m1 d;

    public f(b1 b1Var, v0.j0 j0Var, x0.a aVar, m1 m1Var) {
        this.a = b1Var;
        this.b = j0Var;
        this.c = aVar;
        this.d = m1Var;
    }

    public static final /* synthetic */ v0.j0 a(f fVar) {
        return fVar.b;
    }

    public static final /* synthetic */ x0.a b(f fVar) {
        return fVar.c;
    }

    public static final /* synthetic */ b1 c(f fVar) {
        return fVar.a;
    }

    public static final /* synthetic */ void d(f fVar, v0.j0 j0Var) {
        fVar.b = j0Var;
    }

    public static final /* synthetic */ void e(f fVar, x0.a aVar) {
        fVar.c = aVar;
    }

    public static final /* synthetic */ void f(f fVar, b1 b1Var) {
        fVar.a = b1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.t.c(this.a, fVar.a) && kotlin.jvm.internal.t.c(this.b, fVar.b) && kotlin.jvm.internal.t.c(this.c, fVar.c) && kotlin.jvm.internal.t.c(this.d, fVar.d);
    }

    public final m1 g() {
        m1 m1Var = this.d;
        if (m1Var != null) {
            return m1Var;
        }
        m1 a = v0.V.a();
        this.d = a;
        return a;
    }

    public int hashCode() {
        b1 b1Var = this.a;
        int hashCode = (b1Var == null ? 0 : b1Var.hashCode()) * 31;
        v0.j0 j0Var = this.b;
        int hashCode2 = (hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        x0.a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m1 m1Var = this.d;
        return hashCode3 + (m1Var != null ? m1Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ f(b1 b1Var, v0.j0 j0Var, x0.a aVar, m1 m1Var, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? null : b1Var, (i & 2) != 0 ? null : j0Var, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : m1Var);
    }
}
