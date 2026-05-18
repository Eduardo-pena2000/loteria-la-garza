package com.revenuecat.purchases_ui_flutter.views;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper;
import da.j;
import io.flutter.plugin.platform.i;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterView implements i, j.c {
    private final j methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView nativeCustomerCenterView;

    public static final class 1 extends CustomerCenterListenerWrapper {
        public 1() {
        }

        public void onCustomActionSelectedWrapper(String actionId, String str) {
            t.g(actionId, "actionId");
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onCustomActionSelected", S.l(x.a("actionId", actionId), x.a("purchaseIdentifier", str)));
        }

        public void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId) {
            t.g(feedbackSurveyOptionId, "feedbackSurveyOptionId");
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onFeedbackSurveyCompleted", Q.f(x.a("optionId", feedbackSurveyOptionId)));
        }

        public void onManagementOptionSelectedWrapper(String action, String str, String str2) {
            t.g(action, "action");
        }

        public void onRestoreCompletedWrapper(Map customerInfo) {
            t.g(customerInfo, "customerInfo");
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onRestoreCompleted", customerInfo);
        }

        public void onRestoreFailedWrapper(Map error) {
            t.g(error, "error");
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onRestoreFailed", error);
        }

        public void onRestoreStartedWrapper() {
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onRestoreStarted", null);
        }

        public void onShowingManageSubscriptionsWrapper() {
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onShowingManageSubscriptions", null);
        }

        public void onManagementOptionSelectedWrapper(String action, String str) {
            t.g(action, "action");
            CustomerCenterView.access$getMethodChannel$p(CustomerCenterView.this).c("onManagementOptionSelected", S.l(x.a("optionId", action), x.a("url", str)));
        }
    }

    public CustomerCenterView(Context context, int i, da.b messenger, Map creationParams) {
        t.g(context, "context");
        t.g(messenger, "messenger");
        t.g(creationParams, "creationParams");
        j jVar = new j(messenger, "com.revenuecat.purchasesui/CustomerCenterView/" + i);
        this.methodChannel = jVar;
        jVar.e(this);
        com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView customerCenterView = new com.revenuecat.purchases.ui.revenuecatui.views.CustomerCenterView(context, new a(this));
        this.nativeCustomerCenterView = customerCenterView;
        customerCenterView.setCustomerCenterListener(createCustomerCenterListener());
    }

    private static final I _init_$lambda$0(CustomerCenterView customerCenterView) {
        customerCenterView.methodChannel.c("onDismiss", null);
        return I.a;
    }

    public static /* synthetic */ I a(CustomerCenterView customerCenterView) {
        return _init_$lambda$0(customerCenterView);
    }

    public static final /* synthetic */ j access$getMethodChannel$p(CustomerCenterView customerCenterView) {
        return customerCenterView.methodChannel;
    }

    private final CustomerCenterListenerWrapper createCustomerCenterListener() {
        return new 1();
    }

    public void dispose() {
        this.methodChannel.e(null);
    }

    public View getView() {
        return this.nativeCustomerCenterView;
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
        super.onFlutterViewAttached(view);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        super.onInputConnectionLocked();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        super.onInputConnectionUnlocked();
    }

    public void onMethodCall(da.i methodCall, j.d result) {
        t.g(methodCall, "methodCall");
        t.g(result, "result");
        result.c();
    }
}
