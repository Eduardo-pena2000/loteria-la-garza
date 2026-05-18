package k7;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w5 extends l2 {
    public final /* synthetic */ AtomicReference a;

    public w5(e6 e6Var, AtomicReference atomicReference) {
        this.a = atomicReference;
        Objects.requireNonNull(e6Var);
    }

    public final void zze(List list) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
