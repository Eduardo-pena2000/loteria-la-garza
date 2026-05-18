package db;

import cb.g0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements g0 {
    public final /* synthetic */ e a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ c(e eVar, Runnable runnable) {
        this.a = eVar;
        this.b = runnable;
    }

    public final void dispose() {
        e.L(this.a, this.b);
    }
}
