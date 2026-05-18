package H2;

import cb.E0;
import cb.O;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements AutoCloseable, O {
    public final Ga.i a;

    public b(Ga.i iVar) {
        t.g(iVar, "coroutineContext");
        this.a = iVar;
    }

    public void close() {
        E0.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public Ga.i getCoroutineContext() {
        return this.a;
    }
}
