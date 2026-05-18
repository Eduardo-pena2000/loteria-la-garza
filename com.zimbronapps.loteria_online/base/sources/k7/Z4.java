package k7;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z4 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b5 d;

    public z4(b5 b5Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        Objects.requireNonNull(b5Var);
        this.d = b5Var;
    }

    public final void run() {
        this.d.a.J().e0(this.a, null, this.b, this.c);
    }
}
