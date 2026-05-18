package k7;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ n7 c;
    public final /* synthetic */ I6 d;

    public /* synthetic */ b6(e6 e6Var, AtomicReference atomicReference, n7 n7Var, I6 i6) {
        this.a = e6Var;
        this.b = atomicReference;
        this.c = n7Var;
        this.d = i6;
    }

    public final /* synthetic */ void run() {
        this.a.H(this.b, this.c, this.d);
    }
}
