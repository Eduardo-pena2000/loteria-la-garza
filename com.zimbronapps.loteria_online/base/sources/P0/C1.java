package P0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c1 implements O0.q0 {
    public final int a;
    public final List b;
    public Float c;
    public Float d;
    public W0.j e;
    public W0.j f;

    public c1(int i, List list, Float f, Float f2, W0.j jVar, W0.j jVar2) {
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = f2;
        this.e = jVar;
        this.f = jVar2;
    }

    public boolean N0() {
        return this.b.contains(this);
    }

    public final W0.j a() {
        return this.e;
    }

    public final Float b() {
        return this.c;
    }

    public final Float c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final W0.j e() {
        return this.f;
    }

    public final void f(W0.j jVar) {
        this.e = jVar;
    }

    public final void g(Float f) {
        this.c = f;
    }

    public final void h(Float f) {
        this.d = f;
    }

    public final void i(W0.j jVar) {
        this.f = jVar;
    }
}
