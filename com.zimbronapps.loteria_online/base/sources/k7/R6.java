package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class r6 {
    public q6 a;
    public final /* synthetic */ w6 b;

    public r6(w6 w6Var) {
        Objects.requireNonNull(w6Var);
        this.b = w6Var;
    }

    public final void a() {
        w6 w6Var = this.b;
        w6Var.h();
        q6 q6Var = this.a;
        if (q6Var != null) {
            w6Var.t().removeCallbacks(q6Var);
        }
        q3 q3Var = w6Var.a;
        q3Var.x().t.b(false);
        w6Var.o(false);
        if (q3Var.w().H(null, f2.U0)) {
            q3 q3Var2 = w6Var.a;
            if (q3Var2.B().v0()) {
                q3Var.a().w().a("Retrying trigger URI registration in foreground");
                q3Var2.B().x0();
            }
        }
    }

    public final void b(long j) {
        w6 w6Var = this.b;
        this.a = new q6(this, w6Var.a.e().a(), j);
        w6Var.t().postDelayed(this.a, 2000L);
    }
}
