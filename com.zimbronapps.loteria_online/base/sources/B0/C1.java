package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c1 {
    public static final int i = 8;
    public final D a;
    public final boolean b;
    public final T1 c;
    public final C0 d;
    public final Qa.l e;
    public final boolean f;
    public final Object g;
    public boolean h = true;

    public c1(D d, Object obj, boolean z, T1 t1, C0 c0, Qa.l lVar, boolean z2) {
        this.a = d;
        this.b = z;
        this.c = t1;
        this.d = c0;
        this.e = lVar;
        this.f = z2;
        this.g = obj;
    }

    public final boolean a() {
        return this.h;
    }

    public final D b() {
        return this.a;
    }

    public final Qa.l c() {
        return this.e;
    }

    public final Object d() {
        if (this.b) {
            return null;
        }
        C0 c0 = this.d;
        if (c0 != null) {
            return c0.getValue();
        }
        Object obj = this.g;
        if (obj != null) {
            return obj;
        }
        w.u("Unexpected form of a provided value");
        throw new Ca.i();
    }

    public final T1 e() {
        return this.c;
    }

    public final C0 f() {
        return this.d;
    }

    public final Object g() {
        return this.g;
    }

    public final c1 h() {
        this.h = false;
        return this;
    }

    public final boolean i() {
        return this.f;
    }

    public final boolean j() {
        return (this.b || g() != null) && !this.f;
    }
}
