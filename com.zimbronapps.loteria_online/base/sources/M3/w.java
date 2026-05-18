package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ w(C.a aVar, long j, int i) {
        this.a = aVar;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        C.a.g(this.a, this.b, this.c);
    }
}
