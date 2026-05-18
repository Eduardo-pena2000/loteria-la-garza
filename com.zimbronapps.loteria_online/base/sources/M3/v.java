package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ v(C.a aVar, Object obj, long j) {
        this.a = aVar;
        this.b = obj;
        this.c = j;
    }

    public final void run() {
        C.a.j(this.a, this.b, this.c);
    }
}
