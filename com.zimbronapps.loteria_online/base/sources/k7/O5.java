package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o5 implements Runnable {
    public final /* synthetic */ m5 a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ u5 e;

    public o5(u5 u5Var, m5 m5Var, m5 m5Var2, long j, boolean z) {
        this.a = m5Var;
        this.b = m5Var2;
        this.c = j;
        this.d = z;
        Objects.requireNonNull(u5Var);
        this.e = u5Var;
    }

    public final void run() {
        this.e.B(this.a, this.b, this.c, this.d, null);
    }
}
