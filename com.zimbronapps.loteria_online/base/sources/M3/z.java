package m3;

import m3.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ C.a a;
    public final /* synthetic */ M2.q b;
    public final /* synthetic */ T2.p c;

    public /* synthetic */ z(C.a aVar, M2.q qVar, T2.p pVar) {
        this.a = aVar;
        this.b = qVar;
        this.c = pVar;
    }

    public final void run() {
        C.a.h(this.a, this.b, this.c);
    }
}
