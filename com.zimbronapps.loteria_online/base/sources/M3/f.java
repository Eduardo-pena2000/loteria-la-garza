package m3;

import M2.N;
import m3.D;
import m3.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ d.h a;
    public final /* synthetic */ D.a b;
    public final /* synthetic */ N c;

    public /* synthetic */ f(d.h hVar, D.a aVar, N n) {
        this.a = hVar;
        this.b = aVar;
        this.c = n;
    }

    public final void run() {
        d.h.z(this.a, this.b, this.c);
    }
}
