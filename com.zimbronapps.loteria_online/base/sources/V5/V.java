package V5;

import S5.c1;
import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v extends S5.O0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ y b;

    public v(y yVar, Context context) {
        this.a = context;
        Objects.requireNonNull(yVar);
        this.b = yVar;
    }

    public final void zze(c1 c1Var) {
        if (c1Var == null) {
            return;
        }
        this.b.n(this.a, c1Var.b, true, true);
    }
}
