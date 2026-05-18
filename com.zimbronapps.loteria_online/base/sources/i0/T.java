package I0;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t extends CancellationException {
    public t(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(W.a());
        return this;
    }
}
