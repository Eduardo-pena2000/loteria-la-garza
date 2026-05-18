package k3;

import k3.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ d.a.a.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ c(d.a.a.a aVar, int i, long j, long j2) {
        this.a = aVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        d.a.a.a(this.a, this.b, this.c, this.d);
    }
}
