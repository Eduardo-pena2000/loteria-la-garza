package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class y5 implements Runnable {
    public final /* synthetic */ n7 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h7 c;
    public final /* synthetic */ e6 d;

    public y5(e6 e6Var, n7 n7Var, boolean z, h7 h7Var) {
        this.a = n7Var;
        this.b = z;
        this.c = h7Var;
        Objects.requireNonNull(e6Var);
        this.d = e6Var;
    }

    public final void run() {
        e6 e6Var = this.d;
        j2 N = e6Var.N();
        if (N == null) {
            e6Var.a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        n7 n7Var = this.a;
        com.google.android.gms.common.internal.t.l(n7Var);
        e6Var.b0(N, this.b ? null : this.c, n7Var);
        e6Var.J();
    }
}
