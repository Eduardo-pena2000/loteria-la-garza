package gb;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a extends CancellationException {
    public final transient Object a;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
