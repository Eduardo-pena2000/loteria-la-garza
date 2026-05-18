package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class CustomerCenterListenerWrapper implements CustomerCenterListener {
    public abstract void onCustomActionSelectedWrapper(String str, String str2);

    public void onFeedbackSurveyCompleted(String str) {
        t.g(str, "feedbackSurveyOptionId");
        onFeedbackSurveyCompletedWrapper(str);
    }

    public abstract void onFeedbackSurveyCompletedWrapper(String str);

    public void onManagementOptionSelected(CustomerCenterManagementOption customerCenterManagementOption) {
        t.g(customerCenterManagementOption, "action");
        if (customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomUrl) {
            onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.access$getOptionName(customerCenterManagementOption), ((CustomerCenterManagementOption.CustomUrl) customerCenterManagementOption).getUri().toString());
        } else {
            if (!(customerCenterManagementOption instanceof CustomerCenterManagementOption.CustomAction)) {
                onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.access$getOptionName(customerCenterManagementOption), null);
                return;
            }
            CustomerCenterManagementOption.CustomAction customAction = (CustomerCenterManagementOption.CustomAction) customerCenterManagementOption;
            onCustomActionSelectedWrapper(customAction.getActionIdentifier(), customAction.getPurchaseIdentifier());
            onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.access$getOptionName(customerCenterManagementOption), customAction.getActionIdentifier(), customAction.getPurchaseIdentifier());
        }
    }

    public abstract void onManagementOptionSelectedWrapper(String str, String str2);

    @Ca.e
    public abstract void onManagementOptionSelectedWrapper(String str, String str2, String str3);

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        onRestoreCompletedWrapper(CustomerInfoMapperKt.map(customerInfo));
    }

    public abstract void onRestoreCompletedWrapper(Map map);

    public void onRestoreFailed(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        onRestoreFailedWrapper(PurchasesErrorKt.map$default(purchasesError, null, 1, null).getInfo());
    }

    public abstract void onRestoreFailedWrapper(Map map);

    public void onRestoreStarted() {
        onRestoreStartedWrapper();
    }

    public abstract void onRestoreStartedWrapper();

    public void onShowingManageSubscriptions() {
        onShowingManageSubscriptionsWrapper();
    }

    public abstract void onShowingManageSubscriptionsWrapper();
}
