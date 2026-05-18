package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ w6 b;

    public o6(w6 w6Var, long j) {
        this.a = j;
        Objects.requireNonNull(w6Var);
        this.b = w6Var;
    }

    public final void run() {
        this.b.s(this.a);
    }
}
