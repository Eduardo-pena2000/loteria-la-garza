package V2;

import V2.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ x.a a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ o(x.a aVar, Exception exc) {
        this.a = aVar;
        this.b = exc;
    }

    public final void run() {
        x.a.g(this.a, this.b);
    }
}
