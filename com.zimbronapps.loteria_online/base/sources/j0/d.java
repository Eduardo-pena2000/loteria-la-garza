package J0;

import J0.c;
import n1.y;
import n1.z;
import u0.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final c.a a;
    public final c b;
    public final c c;
    public long d;
    public long e;

    public d() {
        c.a aVar = e.i() ? c.a.b : c.a.a;
        this.a = aVar;
        this.b = new c(false, aVar, 1, null);
        this.c = new c(false, aVar, 1, null);
        this.d = f.b.c();
    }

    public final void a(long j, long j2) {
        this.b.a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.c.a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final long b(long j) {
        if (!(y.h(j) > 0.0f && y.i(j) > 0.0f)) {
            L0.a.b("maximumVelocity should be a positive value. You specified=" + y.n(j));
        }
        return z.a(this.b.d(y.h(j)), this.c.d(y.i(j)));
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final void e() {
        this.b.e();
        this.c.e();
        this.e = 0L;
    }

    public final void f(long j) {
        this.d = j;
    }

    public final void g(long j) {
        this.e = j;
    }
}
