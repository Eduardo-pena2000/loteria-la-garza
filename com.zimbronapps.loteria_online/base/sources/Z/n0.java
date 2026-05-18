package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n0 implements d {
    public final v0 a;
    public final s0 b;
    public Object c;
    public Object d;
    public q e;
    public q f;
    public final q g;
    public long h;
    public q i;

    public n0(v0 v0Var, s0 s0Var, Object obj, Object obj2, q qVar) {
        q e;
        this.a = v0Var;
        this.b = s0Var;
        this.c = obj2;
        this.d = obj;
        this.e = (q) e().a().invoke(obj);
        this.f = (q) e().a().invoke(obj2);
        this.g = (qVar == null || (e = r.e(qVar)) == null) ? r.g((q) e().a().invoke(obj)) : e;
        this.h = -1L;
    }

    public boolean a() {
        return this.a.a();
    }

    public q b(long j) {
        return !c(j) ? this.a.e(j, this.e, this.f, this.g) : h();
    }

    public long d() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    public s0 e() {
        return this.b;
    }

    public Object f(long j) {
        if (c(j)) {
            return g();
        }
        q c = this.a.c(j, this.e, this.f, this.g);
        int b = c.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(c.a(i))) {
                a0.b("AnimationVector cannot contain a NaN. " + c + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return e().b().invoke(c);
    }

    public Object g() {
        return this.c;
    }

    public final q h() {
        q qVar = this.i;
        if (qVar != null) {
            return qVar;
        }
        q g = this.a.g(this.e, this.f, this.g);
        this.i = g;
        return g;
    }

    public final Object i() {
        return this.d;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.g + ", duration: " + f.b(this) + " ms,animationSpec: " + this.a;
    }

    public /* synthetic */ n0(i iVar, s0 s0Var, Object obj, Object obj2, q qVar, int i, kotlin.jvm.internal.k kVar) {
        this(iVar, s0Var, obj, obj2, (i & 16) != 0 ? null : qVar);
    }

    public n0(i iVar, s0 s0Var, Object obj, Object obj2, q qVar) {
        this(iVar.a(s0Var), s0Var, obj, obj2, qVar);
    }
}
