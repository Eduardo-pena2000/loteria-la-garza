package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ s(C.a aVar, String str, long j, long j2) {
        this.a = aVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        C.a.a(this.a, this.b, this.c, this.d);
    }
}
