package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import v0.Q;
import v0.k1;
import v0.n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements k1 {
    public Paint a;
    public int b;
    public Shader c;
    public d d;

    public b(Paint paint) {
        this.a = paint;
        this.b = c.b.B();
    }

    public void A(float f) {
        Q.v(this.a, f);
    }

    public float B() {
        return Q.i(this.a);
    }

    public float a() {
        return Q.c(this.a);
    }

    public void b(int i) {
        if (c.G(this.b, i)) {
            return;
        }
        this.b = i;
        Q.m(this.a, i);
    }

    public void c(d dVar) {
        this.d = dVar;
        Q.o(this.a, dVar);
    }

    public void d(float f) {
        Q.k(this.a, f);
    }

    public long e() {
        return Q.d(this.a);
    }

    public d g() {
        return this.d;
    }

    public int j() {
        return this.b;
    }

    public void k(boolean z) {
        Q.l(this.a, z);
    }

    public void l(int i) {
        Q.s(this.a, i);
    }

    public void m(int i) {
        Q.p(this.a, i);
    }

    public int n() {
        return Q.f(this.a);
    }

    public void o(int i) {
        Q.t(this.a, i);
    }

    public void p(long j) {
        Q.n(this.a, j);
    }

    public n1 q() {
        return null;
    }

    public int r() {
        return Q.g(this.a);
    }

    public float s() {
        return Q.h(this.a);
    }

    public Paint t() {
        return this.a;
    }

    public void u(Shader shader) {
        this.c = shader;
        Q.r(this.a, shader);
    }

    public Shader v() {
        return this.c;
    }

    public void w(float f) {
        Q.u(this.a, f);
    }

    public int x() {
        return Q.e(this.a);
    }

    public void y(n1 n1Var) {
        Q.q(this.a, n1Var);
    }

    public void z(int i) {
        Q.w(this.a, i);
    }

    public b() {
        this(Q.j());
    }
}
