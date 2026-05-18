package G4;

import Ca.s;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ cb.n a;
    public final /* synthetic */ x7.e b;

    public l(cb.n nVar, x7.e eVar) {
        this.a = nVar;
        this.b = eVar;
    }

    public final void run() {
        try {
            this.a.resumeWith(Ca.s.b(this.b.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.a.cancel(cause);
                return;
            }
            cb.n nVar = this.a;
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(Ca.t.a(cause)));
        }
    }
}
