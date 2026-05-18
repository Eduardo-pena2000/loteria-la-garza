package j0;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o extends CancellationException {
    public o(String str) {
        super(str);
    }

    public Throwable fillInStackTrace() {
        setStackTrace(p.a());
        return this;
    }
}
