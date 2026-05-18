package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ x(C.a aVar, Exception exc) {
        this.a = aVar;
        this.b = exc;
    }

    public final void run() {
        C.a.b(this.a, this.b);
    }
}
