package xb;

import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p extends M {
    public M f;

    public p(M delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f = delegate;
    }

    public M a() {
        return this.f.a();
    }

    public M b() {
        return this.f.b();
    }

    public long c() {
        return this.f.c();
    }

    public M d(long j) {
        return this.f.d(j);
    }

    public boolean e() {
        return this.f.e();
    }

    public void f() {
        this.f.f();
    }

    public M g(long j, TimeUnit unit) {
        kotlin.jvm.internal.t.g(unit, "unit");
        return this.f.g(j, unit);
    }

    public long h() {
        return this.f.h();
    }

    public final M j() {
        return this.f;
    }

    public final p k(M delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f = delegate;
        return this;
    }
}
