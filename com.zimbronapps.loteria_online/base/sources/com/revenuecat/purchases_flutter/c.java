package com.revenuecat.purchases_flutter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ PurchasesFlutterPlugin a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(PurchasesFlutterPlugin purchasesFlutterPlugin, String str, Object obj) {
        this.a = purchasesFlutterPlugin;
        this.b = str;
        this.c = obj;
    }

    public final void run() {
        PurchasesFlutterPlugin.b(this.a, this.b, this.c);
    }
}
