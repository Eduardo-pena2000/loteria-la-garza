package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ya.h;
import Ya.o;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PurchaseInformationProvider implements m1.a {
    private final h values;

    public PurchaseInformationProvider() {
        CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
        this.values = o.m(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring(), customerCenterConfigTestData.getPurchaseInformationYearlyExpired(), customerCenterConfigTestData.getPurchaseInformationFreeTrial(), customerCenterConfigTestData.getPurchaseInformationPromotional(), customerCenterConfigTestData.getPurchaseInformationLifetime(), PurchaseInformation.copy$default(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), "Monthly long subscription name that overflows", null, null, null, null, false, null, false, false, false, false, 2046, null));
    }

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public h getValues() {
        return this.values;
    }
}
