package V2;

import V2.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ x.a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ v(x.a aVar, int i, long j, long j2) {
        this.a = aVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        x.a.b(this.a, this.b, this.c, this.d);
    }
}
