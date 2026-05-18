package com.revenuecat.purchases.common.diagnostics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Qa.a a;

    public /* synthetic */ a(Qa.a aVar) {
        this.a = aVar;
    }

    public final void run() {
        DiagnosticsSynchronizer.a(this.a);
    }
}
