package r9;

import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j.d c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ i e;
    public final /* synthetic */ da.i f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    public /* synthetic */ x(boolean z, String str, j.d dVar, Boolean bool, i iVar, da.i iVar2, boolean z2, int i) {
        this.a = z;
        this.b = str;
        this.c = dVar;
        this.d = bool;
        this.e = iVar;
        this.f = iVar2;
        this.g = z2;
        this.h = i;
    }

    public final void run() {
        B.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
