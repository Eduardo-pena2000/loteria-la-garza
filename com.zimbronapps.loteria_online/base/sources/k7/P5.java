package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p5 implements Runnable {
    public final /* synthetic */ u5 a;

    public p5(u5 u5Var) {
        Objects.requireNonNull(u5Var);
        this.a = u5Var;
    }

    public final void run() {
        u5 u5Var = this.a;
        u5Var.e = u5Var.D();
    }
}
