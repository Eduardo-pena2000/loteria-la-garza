package com.revenuecat.purchases_flutter;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements UpdatedCustomerInfoListener {
    public final /* synthetic */ PurchasesFlutterPlugin a;

    public /* synthetic */ d(PurchasesFlutterPlugin purchasesFlutterPlugin) {
        this.a = purchasesFlutterPlugin;
    }

    public final void onReceived(CustomerInfo customerInfo) {
        PurchasesFlutterPlugin.d(this.a, customerInfo);
    }
}
