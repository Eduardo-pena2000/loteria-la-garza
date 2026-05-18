package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k3 implements Runnable {
    public final /* synthetic */ h4 a;
    public final /* synthetic */ q3 b;

    public k3(q3 q3Var, h4 h4Var) {
        this.a = h4Var;
        Objects.requireNonNull(q3Var);
        this.b = q3Var;
    }

    public final void run() {
        q3 q3Var = this.b;
        h4 h4Var = this.a;
        q3Var.p(h4Var);
        q3Var.v(h4Var.d);
    }
}
