package b0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y0 {
    public final Object a;
    public final Q b;
    public final E1 c;
    public final b d;
    public List e;
    public final U0 f;
    public final List g;

    public y0(w0 w0Var, Object obj, Q q, E1 e1, b bVar, List list, U0 u0, List list2) {
        this.a = obj;
        this.b = q;
        this.c = e1;
        this.d = bVar;
        this.e = list;
        this.f = u0;
        this.g = list2;
    }

    public final b a() {
        return this.d;
    }

    public final Q b() {
        return this.b;
    }

    public final w0 c() {
        return null;
    }

    public final List d() {
        return this.e;
    }

    public final U0 e() {
        return this.f;
    }

    public final Object f() {
        return this.a;
    }

    public final E1 g() {
        return this.c;
    }

    public final void h() {
        List list = this.e;
        Q q = this.b;
        kotlin.jvm.internal.t.e(q, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.e = Da.D.v0(list, ((B) q).N(this.d));
    }
}
