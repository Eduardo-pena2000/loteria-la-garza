package g3;

import g3.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ D.a a;
    public final /* synthetic */ D b;
    public final /* synthetic */ u c;

    public /* synthetic */ y(D.a aVar, D d, u uVar) {
        this.a = aVar;
        this.b = d;
        this.c = uVar;
    }

    public final void run() {
        D.a.e(this.a, this.b, this.c);
    }
}
