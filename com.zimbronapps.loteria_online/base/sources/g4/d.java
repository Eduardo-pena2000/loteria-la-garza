package G4;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public enum d implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        kotlin.jvm.internal.t.g(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
