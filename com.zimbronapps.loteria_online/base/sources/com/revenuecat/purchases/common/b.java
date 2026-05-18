package com.revenuecat.purchases.common;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Throwable a;

    public /* synthetic */ b(Throwable th) {
        this.a = th;
    }

    public final void run() {
        Dispatcher.b(this.a);
    }
}
