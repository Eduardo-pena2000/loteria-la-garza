package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class r5 implements Runnable {
    public final /* synthetic */ m5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ u5 c;

    public r5(u5 u5Var, m5 m5Var, long j) {
        this.a = m5Var;
        this.b = j;
        Objects.requireNonNull(u5Var);
        this.c = u5Var;
    }

    public final void run() {
        u5 u5Var = this.c;
        u5Var.C(this.a, false, this.b);
        u5Var.e = null;
        u5Var.a.J().u(null);
    }
}
