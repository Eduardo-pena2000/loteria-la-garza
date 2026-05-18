package k7;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ n7 c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ a6(e6 e6Var, AtomicReference atomicReference, n7 n7Var, Bundle bundle) {
        this.a = e6Var;
        this.b = atomicReference;
        this.c = n7Var;
        this.d = bundle;
    }

    public final /* synthetic */ void run() {
        this.a.G(this.b, this.c, this.d);
    }
}
