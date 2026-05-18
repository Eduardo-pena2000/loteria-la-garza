package V2;

import V2.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ x.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ r(x.a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        x.a.k(this.a, this.b, this.c, this.d);
    }
}
