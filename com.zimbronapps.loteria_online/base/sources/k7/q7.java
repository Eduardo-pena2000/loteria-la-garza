package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ q3 a;

    public /* synthetic */ q7(q3 q3Var) {
        this.a = q3Var;
    }

    public final /* synthetic */ void run() {
        q3 q3Var = this.a;
        if (!q3Var.C().G()) {
            q3Var.a().r().a("registerTrigger called but app not eligible");
            return;
        }
        q3Var.B().t0();
        b5 B = q3Var.B();
        Objects.requireNonNull(B);
        new Thread(new r7(B)).start();
    }
}
