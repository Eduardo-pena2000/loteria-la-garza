package g3;

import g3.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ D.a a;
    public final /* synthetic */ D b;
    public final /* synthetic */ r c;
    public final /* synthetic */ u d;

    public /* synthetic */ x(D.a aVar, D d, r rVar, u uVar) {
        this.a = aVar;
        this.b = d;
        this.c = rVar;
        this.d = uVar;
    }

    public final void run() {
        D.a.c(this.a, this.b, this.c, this.d);
    }
}
