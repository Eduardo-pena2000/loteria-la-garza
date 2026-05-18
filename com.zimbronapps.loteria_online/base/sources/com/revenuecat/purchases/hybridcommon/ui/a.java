package com.revenuecat.purchases.hybridcommon.ui;

import Qa.l;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ l a;
    public final /* synthetic */ Map b;

    public /* synthetic */ a(l lVar, Map map) {
        this.a = lVar;
        this.b = map;
    }

    public final void run() {
        HybridPurchaseLogicBridge.b(this.a, this.b);
    }
}
