package k7;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class x5 extends o2 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ e6 b;

    public x5(e6 e6Var, AtomicReference atomicReference) {
        this.a = atomicReference;
        Objects.requireNonNull(e6Var);
        this.b = e6Var;
    }

    public final void p1(K6 k6) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            this.b.a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(k6.a.size()));
            atomicReference.set(k6);
            atomicReference.notifyAll();
        }
    }
}
