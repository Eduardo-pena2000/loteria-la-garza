package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterListenerWrapperKt {
    public static final /* synthetic */ String access$getOptionName(CustomerCenterManagementOption customerCenterManagementOption) {
        return getOptionName(customerCenterManagementOption);
    }

    private static final String getOptionName(CustomerCenterManagementOption customerCenterManagementOption) {
        return customerCenterManagementOption instanceof CustomerCenterManagementOption.Cancel ? "cancel" : customerCenterManagementOption instanceof CustomerCenterManagementOption.MissingPurchase ? "missing_purchase" : customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomUrl ? "custom_url" : customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomAction ? "custom_action" : "unknown";
    }
}
