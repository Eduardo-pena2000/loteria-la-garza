package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface CustomerCenterListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onCustomActionSelected(CustomerCenterListener customerCenterListener, String str, String str2) {
            t.g(str, "actionIdentifier");
            CustomerCenterListener.access$onCustomActionSelected$jd(customerCenterListener, str, str2);
        }

        @Deprecated
        public static void onFeedbackSurveyCompleted(CustomerCenterListener customerCenterListener, String str) {
            t.g(str, "feedbackSurveyOptionId");
            CustomerCenterListener.access$onFeedbackSurveyCompleted$jd(customerCenterListener, str);
        }

        @Deprecated
        public static void onManagementOptionSelected(CustomerCenterListener customerCenterListener, CustomerCenterManagementOption customerCenterManagementOption) {
            t.g(customerCenterManagementOption, "action");
            CustomerCenterListener.access$onManagementOptionSelected$jd(customerCenterListener, customerCenterManagementOption);
        }

        @Deprecated
        public static void onRestoreCompleted(CustomerCenterListener customerCenterListener, CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerCenterListener.access$onRestoreCompleted$jd(customerCenterListener, customerInfo);
        }

        @Deprecated
        public static void onRestoreFailed(CustomerCenterListener customerCenterListener, PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            CustomerCenterListener.access$onRestoreFailed$jd(customerCenterListener, purchasesError);
        }

        @Deprecated
        public static void onRestoreStarted(CustomerCenterListener customerCenterListener) {
            CustomerCenterListener.access$onRestoreStarted$jd(customerCenterListener);
        }

        @Deprecated
        public static void onShowingManageSubscriptions(CustomerCenterListener customerCenterListener) {
            CustomerCenterListener.access$onShowingManageSubscriptions$jd(customerCenterListener);
        }
    }

    static /* synthetic */ void access$onCustomActionSelected$jd(CustomerCenterListener customerCenterListener, String str, String str2) {
        super.onCustomActionSelected(str, str2);
    }

    static /* synthetic */ void access$onFeedbackSurveyCompleted$jd(CustomerCenterListener customerCenterListener, String str) {
        super.onFeedbackSurveyCompleted(str);
    }

    static /* synthetic */ void access$onManagementOptionSelected$jd(CustomerCenterListener customerCenterListener, CustomerCenterManagementOption customerCenterManagementOption) {
        super.onManagementOptionSelected(customerCenterManagementOption);
    }

    static /* synthetic */ void access$onRestoreCompleted$jd(CustomerCenterListener customerCenterListener, CustomerInfo customerInfo) {
        super.onRestoreCompleted(customerInfo);
    }

    static /* synthetic */ void access$onRestoreFailed$jd(CustomerCenterListener customerCenterListener, PurchasesError purchasesError) {
        super.onRestoreFailed(purchasesError);
    }

    static /* synthetic */ void access$onRestoreStarted$jd(CustomerCenterListener customerCenterListener) {
        super.onRestoreStarted();
    }

    static /* synthetic */ void access$onShowingManageSubscriptions$jd(CustomerCenterListener customerCenterListener) {
        super.onShowingManageSubscriptions();
    }

    default void onCustomActionSelected(String str, String str2) {
        t.g(str, "actionIdentifier");
    }

    default void onFeedbackSurveyCompleted(String str) {
        t.g(str, "feedbackSurveyOptionId");
    }

    default void onManagementOptionSelected(CustomerCenterManagementOption customerCenterManagementOption) {
        t.g(customerCenterManagementOption, "action");
    }

    default void onRestoreCompleted(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
    }

    default void onRestoreFailed(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
    }

    default void onRestoreStarted() {
    }

    default void onShowingManageSubscriptions() {
    }
}
