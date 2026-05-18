package P2;

import P2.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ t a;
    public final /* synthetic */ t.c b;

    public /* synthetic */ s(t tVar, t.c cVar) {
        this.a = tVar;
        this.b = cVar;
    }

    public final void run() {
        t.a(this.a, this.b);
    }
}
