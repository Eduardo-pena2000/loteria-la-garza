package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h6 implements Runnable {
    public final /* synthetic */ b7 a;
    public final /* synthetic */ Runnable b;

    public h6(m6 m6Var, b7 b7Var, Runnable runnable) {
        this.a = b7Var;
        this.b = runnable;
        Objects.requireNonNull(m6Var);
    }

    public final void run() {
        b7 b7Var = this.a;
        b7Var.E();
        b7Var.D(this.b);
        b7Var.r();
    }
}
