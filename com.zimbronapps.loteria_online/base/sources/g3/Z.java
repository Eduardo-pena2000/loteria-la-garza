package g3;

import g3.D;
import g3.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ D.a a;
    public final /* synthetic */ D b;
    public final /* synthetic */ w.b c;
    public final /* synthetic */ u d;

    public /* synthetic */ z(D.a aVar, D d, w.b bVar, u uVar) {
        this.a = aVar;
        this.b = d;
        this.c = bVar;
        this.d = uVar;
    }

    public final void run() {
        D.a.b(this.a, this.b, this.c, this.d);
    }
}
