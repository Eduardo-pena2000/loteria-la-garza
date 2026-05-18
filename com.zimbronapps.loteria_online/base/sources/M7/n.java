package M7;

import M7.p;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ p.b b;

    public /* synthetic */ n(Callable callable, p.b bVar) {
        this.a = callable;
        this.b = bVar;
    }

    public final void run() {
        o.f(this.a, this.b);
    }
}
