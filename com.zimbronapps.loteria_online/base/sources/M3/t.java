package m3;

import M2.N;
import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ N b;

    public /* synthetic */ t(C.a aVar, N n) {
        this.a = aVar;
        this.b = n;
    }

    public final void run() {
        C.a.f(this.a, this.b);
    }
}
