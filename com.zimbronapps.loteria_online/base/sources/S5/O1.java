package S5;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o1 extends C {
    public final /* synthetic */ q1 c;

    public o1(q1 q1Var) {
        Objects.requireNonNull(q1Var);
        this.c = q1Var;
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        q1 q1Var = this.c;
        q1Var.e().b(q1Var.D());
        super.onAdFailedToLoad(nVar);
    }

    public final void onAdLoaded() {
        q1 q1Var = this.c;
        q1Var.e().b(q1Var.D());
        super.onAdLoaded();
    }
}
