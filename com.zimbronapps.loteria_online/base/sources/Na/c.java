package na;

import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ W9.f b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ S9.f d;
    public final /* synthetic */ long e;

    public /* synthetic */ c(e eVar, W9.f fVar, Handler handler, S9.f fVar2, long j) {
        this.a = eVar;
        this.b = fVar;
        this.c = handler;
        this.d = fVar2;
        this.e = j;
    }

    public final void run() {
        e.a(this.a, this.b, this.c, this.d, this.e);
    }
}
