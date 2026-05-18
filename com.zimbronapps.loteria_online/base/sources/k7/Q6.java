package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q6 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ r6 c;

    public q6(r6 r6Var, long j, long j2) {
        Objects.requireNonNull(r6Var);
        this.c = r6Var;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        this.c.b.a.b().t(new p6(this));
    }
}
