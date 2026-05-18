package U3;

import M2.q;
import U3.K;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements D {
    public M2.q a;
    public P2.E b;
    public O c;

    public x(String str) {
        this.a = new q.b().o0(str).K();
    }

    public final void a() {
        P2.a.h(this.b);
        P2.K.i(this.c);
    }

    public void b(P2.E e, o3.r rVar, K.d dVar) {
        this.b = e;
        dVar.a();
        O e2 = rVar.e(dVar.c(), 5);
        this.c = e2;
        e2.b(this.a);
    }

    public void c(P2.z zVar) {
        a();
        long e = this.b.e();
        long f = this.b.f();
        if (e == -9223372036854775807L || f == -9223372036854775807L) {
            return;
        }
        M2.q qVar = this.a;
        if (f != qVar.s) {
            M2.q K = qVar.a().s0(f).K();
            this.a = K;
            this.c.b(K);
        }
        int a = zVar.a();
        this.c.f(zVar, a);
        this.c.a(e, 1, a, 0, null);
    }
}
