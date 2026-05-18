package eb;

import cb.p0;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class p {
    public static final void a(x xVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = p0.a("Channel was consumed, consumer had failed", th);
            }
        }
        xVar.cancel(r0);
    }
}
