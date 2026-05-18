package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n4 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b5 b;

    public n4(b5 b5Var, boolean z) {
        this.a = z;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void run() {
        b5 b5Var = this.b;
        q3 q3Var = b5Var.a;
        boolean g = q3Var.g();
        boolean f = q3Var.f();
        boolean z = this.a;
        q3Var.P(z);
        if (f == z) {
            q3Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z));
        }
        if (q3Var.g() == g || q3Var.g() != q3Var.f()) {
            q3Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z), Boolean.valueOf(g));
        }
        b5Var.Y();
    }
}
