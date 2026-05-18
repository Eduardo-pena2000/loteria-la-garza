package h2;

import h2.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ Y1.g a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ m(Y1.g gVar, Exception exc) {
        this.a = gVar;
        this.b = exc;
    }

    public final void run() {
        l.a.b.a(this.a, this.b);
    }
}
