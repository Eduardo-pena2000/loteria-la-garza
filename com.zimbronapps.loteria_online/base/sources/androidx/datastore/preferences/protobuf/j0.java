package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j0 extends h0 {
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public i0 g(Object obj) {
        return ((t) obj).unknownFields;
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(i0 i0Var) {
        return i0Var.d();
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(i0 i0Var) {
        return i0Var.e();
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public i0 k(i0 i0Var, i0 i0Var2) {
        return i0.c().equals(i0Var2) ? i0Var : i0.c().equals(i0Var) ? i0.j(i0Var, i0Var2) : i0Var.i(i0Var2);
    }

    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public i0 n() {
        return i0.k();
    }

    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, i0 i0Var) {
        p(obj, i0Var);
    }

    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, i0 i0Var) {
        ((t) obj).unknownFields = i0Var;
    }

    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public i0 r(i0 i0Var) {
        i0Var.h();
        return i0Var;
    }

    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(i0 i0Var, n0 n0Var) {
        i0Var.p(n0Var);
    }

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(i0 i0Var, n0 n0Var) {
        i0Var.r(n0Var);
    }

    public void j(Object obj) {
        g(obj).h();
    }

    public boolean q(Z z) {
        return false;
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(i0 i0Var, int i, int i2) {
        i0Var.n(m0.c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(i0 i0Var, int i, long j) {
        i0Var.n(m0.c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(i0 i0Var, int i, i0 i0Var2) {
        i0Var.n(m0.c(i, 3), i0Var2);
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(i0 i0Var, int i, f fVar) {
        i0Var.n(m0.c(i, 2), fVar);
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(i0 i0Var, int i, long j) {
        i0Var.n(m0.c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public i0 f(Object obj) {
        i0 g = g(obj);
        if (g != i0.c()) {
            return g;
        }
        i0 k = i0.k();
        p(obj, k);
        return k;
    }
}
