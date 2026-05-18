package M7;

import M7.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ p.b b;

    public /* synthetic */ d(Runnable runnable, p.b bVar) {
        this.a = runnable;
        this.b = bVar;
    }

    public final void run() {
        o.h(this.a, this.b);
    }
}
