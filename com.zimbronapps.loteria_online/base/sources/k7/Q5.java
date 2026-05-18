package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q5 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ u5 b;

    public q5(u5 u5Var, long j) {
        this.a = j;
        Objects.requireNonNull(u5Var);
        this.b = u5Var;
    }

    public final void run() {
        u5 u5Var = this.b;
        u5Var.a.M().k(this.a);
        u5Var.e = null;
    }
}
