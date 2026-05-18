package i2;

import i2.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ a a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ g(a aVar, Exception exc) {
        this.a = aVar;
        this.b = exc;
    }

    public final void run() {
        a.h.a(this.a, this.b);
    }
}
