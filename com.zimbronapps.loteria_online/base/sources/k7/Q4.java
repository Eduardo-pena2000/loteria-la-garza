package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q4 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ b5 b;

    public q4(b5 b5Var, long j) {
        this.a = j;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void run() {
        q3 q3Var = this.b.a;
        N2 n2 = q3Var.x().l;
        long j = this.a;
        n2.b(j);
        q3Var.a().v().b("Session timeout duration set", Long.valueOf(j));
    }
}
