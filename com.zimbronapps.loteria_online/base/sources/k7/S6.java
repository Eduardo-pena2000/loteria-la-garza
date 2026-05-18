package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class s6 extends z {
    public final /* synthetic */ u6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(u6 u6Var, V3 v3) {
        super(v3);
        Objects.requireNonNull(u6Var);
        this.e = u6Var;
    }

    public final void a() {
        u6 u6Var = this.e;
        w6 w6Var = u6Var.d;
        w6Var.h();
        q3 q3Var = w6Var.a;
        u6Var.d(false, false, q3Var.e().b());
        w6Var.a.M().k(q3Var.e().b());
    }
}
