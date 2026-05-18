package com.revenuecat.purchases.common;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Dispatcher b;

    public /* synthetic */ a(Runnable runnable, Dispatcher dispatcher) {
        this.a = runnable;
        this.b = dispatcher;
    }

    public final void run() {
        Dispatcher.a(this.a, this.b);
    }
}
