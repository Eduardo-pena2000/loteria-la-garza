package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y implements d {
    public final x0 a;
    public final s0 b;
    public final Object c;
    public final q d;
    public final q e;
    public final q f;
    public final Object g;
    public final long h;
    public final boolean i;

    public y(x0 x0Var, s0 s0Var, Object obj, q qVar) {
        this.a = x0Var;
        this.b = s0Var;
        this.c = obj;
        q qVar2 = (q) e().a().invoke(obj);
        this.d = qVar2;
        this.e = r.e(qVar);
        this.g = e().b().invoke(x0Var.c(qVar2, qVar));
        this.h = x0Var.b(qVar2, qVar);
        q e = r.e(x0Var.e(d(), qVar2, qVar));
        this.f = e;
        int b = e.b();
        for (int i = 0; i < b; i++) {
            q qVar3 = this.f;
            qVar3.e(i, Wa.n.l(qVar3.a(i), -this.a.a(), this.a.a()));
        }
    }

    public boolean a() {
        return this.i;
    }

    public q b(long j) {
        return !c(j) ? this.a.e(j, this.d, this.e) : this.f;
    }

    public long d() {
        return this.h;
    }

    public s0 e() {
        return this.b;
    }

    public Object f(long j) {
        return !c(j) ? e().b().invoke(this.a.d(j, this.d, this.e)) : g();
    }

    public Object g() {
        return this.g;
    }

    public y(z zVar, s0 s0Var, Object obj, q qVar) {
        this(zVar.a(s0Var), s0Var, obj, qVar);
    }
}
