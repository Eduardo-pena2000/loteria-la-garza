package za;

import za.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ c0.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    public /* synthetic */ a0(c0.a aVar, String str, String str2, String str3, String str4, long j) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final void run() {
        c0.a.b(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
