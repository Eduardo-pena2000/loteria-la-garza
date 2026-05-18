package k7;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k4 implements Executor {
    public final /* synthetic */ b5 a;

    public k4(b5 b5Var) {
        Objects.requireNonNull(b5Var);
        this.a = b5Var;
    }

    public final void execute(Runnable runnable) {
        this.a.a.b().t(runnable);
    }
}
