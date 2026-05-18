package com.revenuecat.purchases.ui.revenuecatui.views;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterView$internalListener$1 implements CustomerCenterListener {
    final /* synthetic */ CustomerCenterView this$0;

    public CustomerCenterView$internalListener$1(CustomerCenterView customerCenterView) {
        this.this$0 = customerCenterView;
    }

    public void onCustomActionSelected(String actionIdentifier, String str) {
        t.g(actionIdentifier, "actionIdentifier");
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onCustomActionSelected(actionIdentifier, str);
        }
    }

    public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
        t.g(feedbackSurveyOptionId, "feedbackSurveyOptionId");
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
        }
    }

    public void onManagementOptionSelected(CustomerCenterManagementOption action) {
        t.g(action, "action");
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onManagementOptionSelected(action);
        }
    }

    public void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onRestoreCompleted(customerInfo);
        }
    }

    public void onRestoreFailed(PurchasesError error) {
        t.g(error, "error");
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onRestoreFailed(error);
        }
    }

    public void onRestoreStarted() {
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onRestoreStarted();
        }
    }

    public void onShowingManageSubscriptions() {
        CustomerCenterListener access$getCustomerCenterListener$p = CustomerCenterView.access$getCustomerCenterListener$p(this.this$0);
        if (access$getCustomerCenterListener$p != null) {
            access$getCustomerCenterListener$p.onShowingManageSubscriptions();
        }
    }
}
