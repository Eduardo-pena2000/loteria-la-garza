package z;

import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final s0 a;
    public final Object b;
    public final long c;
    public final Qa.a d;
    public final b0.C0 e;
    public q f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final b0.C0 i;

    public h(Object obj, s0 s0Var, q qVar, long j, Object obj2, long j2, boolean z, Qa.a aVar) {
        this.a = s0Var;
        this.b = obj2;
        this.c = j2;
        this.d = aVar;
        this.e = U1.i(obj, null, 2, null);
        this.f = r.e(qVar);
        this.g = j;
        this.i = U1.i(Boolean.valueOf(z), null, 2, null);
    }

    public final void a() {
        k(false);
        this.d.invoke();
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.c;
    }

    public final Object e() {
        return this.e.getValue();
    }

    public final Object f() {
        return this.a.b().invoke(this.f);
    }

    public final q g() {
        return this.f;
    }

    public final boolean h() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final void i(long j) {
        this.h = j;
    }

    public final void j(long j) {
        this.g = j;
    }

    public final void k(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void l(Object obj) {
        this.e.setValue(obj);
    }

    public final void m(q qVar) {
        this.f = qVar;
    }
}
