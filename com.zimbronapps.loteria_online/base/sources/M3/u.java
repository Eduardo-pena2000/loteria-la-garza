package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ u(C.a aVar, int i, long j) {
        this.a = aVar;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        C.a.c(this.a, this.b, this.c);
    }
}
