package M7;

import M7.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ p.b c;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.a = oVar;
        this.b = runnable;
        this.c = bVar;
    }

    public final void run() {
        o.r(this.a, this.b, this.c);
    }
}
