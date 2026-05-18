package k7;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n5 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ m5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ u5 e;

    public n5(u5 u5Var, Bundle bundle, m5 m5Var, m5 m5Var2, long j) {
        this.a = bundle;
        this.b = m5Var;
        this.c = m5Var2;
        this.d = j;
        Objects.requireNonNull(u5Var);
        this.e = u5Var;
    }

    public final void run() {
        this.e.A(this.a, this.b, this.c, this.d);
    }
}
