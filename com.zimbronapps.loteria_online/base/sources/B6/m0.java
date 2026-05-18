package b6;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m0 {
    public final e6.a a;
    public final String b;
    public final long c;
    public final int d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public m0(e6.a aVar, String str, long j, int i) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final e6.a a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c <= R5.t.o().a();
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e.get();
    }

    public final void f() {
        this.e.set(true);
    }
}
