package jb;

import Wa.n;
import cb.K;
import cb.r0;
import hb.E;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b extends r0 implements Executor {
    public static final b c = new b();
    public static final K d = K.C(k.b, E.g("kotlinx.coroutines.io.parallelism", n.e(64, E.a()), 0, 0, 12, null), null, 2, null);

    public K B(int i, String str) {
        return k.b.B(i, str);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        x(Ga.j.a, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }

    public void x(Ga.i iVar, Runnable runnable) {
        d.x(iVar, runnable);
    }

    public void y(Ga.i iVar, Runnable runnable) {
        d.y(iVar, runnable);
    }

    public Executor E() {
        return this;
    }
}
