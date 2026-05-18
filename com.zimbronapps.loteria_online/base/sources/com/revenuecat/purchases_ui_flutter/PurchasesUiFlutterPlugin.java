package com.revenuecat.purchases_ui_flutter;

import Ca.I;
import Ca.e;
import Ca.s;
import Ca.x;
import Da.Q;
import Da.S;
import Y9.a;
import Z9.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.hybridcommon.ui.CustomerCenterListenerWrapper;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.hybridcommon.ui.PaywallHelpersKt;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.hybridcommon.ui.PaywallResultListener;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.hybridcommon.ui.PresentPaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.ShowCustomerCenter;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases_ui_flutter.views.CustomerCenterViewFactory;
import com.revenuecat.purchases_ui_flutter.views.PaywallFooterViewFactory;
import com.revenuecat.purchases_ui_flutter.views.PaywallViewFactory;
import da.b;
import da.i;
import da.j;
import da.l;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchasesUiFlutterPlugin implements a, j.c, Z9.a, l {
    public static final Companion Companion = new Companion(null);
    private static final int REQUEST_CODE_CUSTOMER_CENTER = 1001;
    private final String TAG = "PurchasesUIFlutter";
    private Activity activity;
    private j channel;
    private CustomerCenterListenerWrapper customerCenterListener;
    private j.d pendingResult;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class 1 extends CustomerCenterListenerWrapper {
        public 1() {
        }

        public void onCustomActionSelectedWrapper(String actionId, String str) {
            t.g(actionId, "actionId");
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onCustomActionSelected", S.l(x.a("actionId", actionId), x.a("purchaseIdentifier", str)));
        }

        public void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId) {
            t.g(feedbackSurveyOptionId, "feedbackSurveyOptionId");
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onFeedbackSurveyCompleted", Q.f(x.a("optionId", feedbackSurveyOptionId)));
        }

        public void onManagementOptionSelectedWrapper(String action, String str, String str2) {
            t.g(action, "action");
        }

        public void onRestoreCompletedWrapper(Map customerInfo) {
            t.g(customerInfo, "customerInfo");
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onRestoreCompleted", customerInfo);
        }

        public void onRestoreFailedWrapper(Map error) {
            t.g(error, "error");
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onRestoreFailed", error);
        }

        public void onRestoreStartedWrapper() {
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onRestoreStarted", null);
        }

        public void onShowingManageSubscriptionsWrapper() {
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onShowingManageSubscriptions", null);
        }

        public void onManagementOptionSelectedWrapper(String action, String str) {
            t.g(action, "action");
            j access$getChannel$p = PurchasesUiFlutterPlugin.access$getChannel$p(PurchasesUiFlutterPlugin.this);
            if (access$getChannel$p == null) {
                t.v("channel");
                access$getChannel$p = null;
            }
            access$getChannel$p.c("onManagementOptionSelected", S.l(x.a("optionId", action), x.a("url", str)));
        }
    }

    public static final class 1 implements PaywallResultListener {
        final /* synthetic */ j.d $result;

        public 1(j.d dVar) {
            this.$result = dVar;
        }

        @e
        public void onPaywallResult(PaywallResult paywallResult) {
            PaywallResultListener.DefaultImpls.onPaywallResult(this, paywallResult);
        }

        public void onPaywallResult(String paywallResult) {
            t.g(paywallResult, "paywallResult");
            this.$result.a(paywallResult);
        }
    }

    public static final /* synthetic */ j access$getChannel$p(PurchasesUiFlutterPlugin purchasesUiFlutterPlugin) {
        return purchasesUiFlutterPlugin.channel;
    }

    private final void clearCustomerCenterListener() {
        this.customerCenterListener = null;
        try {
            s.a aVar = s.b;
            Purchases.Companion.getSharedInstance().setCustomerCenterListener((CustomerCenterListener) null);
            s.b(I.a);
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            s.b(Ca.t.a(th));
        }
    }

    private final CustomerCenterListenerWrapper createCustomerCenterListener() {
        return new 1();
    }

    private final void ensureCustomerCenterListenerRegistered() {
        CustomerCenterListenerWrapper customerCenterListenerWrapper = this.customerCenterListener;
        if (customerCenterListenerWrapper == null) {
            customerCenterListenerWrapper = createCustomerCenterListener();
            this.customerCenterListener = customerCenterListenerWrapper;
        }
        Purchases.Companion.getSharedInstance().setCustomerCenterListener(customerCenterListenerWrapper);
    }

    private final R9.k getActivityFragment() {
        R9.k kVar = this.activity;
        if (kVar instanceof R9.k) {
            return kVar;
        }
        Log.e(this.TAG, "Paywalls require your activity to subclass FlutterFragmentActivity");
        return null;
    }

    private final PaywallSource getPaywallSource(String str, Map map) {
        if (str == null) {
            return PaywallSource.DefaultOffering.INSTANCE;
        }
        PresentedOfferingContext mapPresentedOfferingContext = MapHelper.INSTANCE.mapPresentedOfferingContext(map);
        if (mapPresentedOfferingContext == null) {
            mapPresentedOfferingContext = new PresentedOfferingContext(str);
        }
        return new PaywallSource.OfferingIdentifierWithPresentedOfferingContext(str, mapPresentedOfferingContext);
    }

    private final void presentCustomerCenter(j.d dVar) {
        Activity activity = this.activity;
        if (activity == null) {
            dVar.b("CUSTOMER_CENTER_MISSING_ACTIVITY", "Could not present Customer Center. There's no activity", null);
        } else {
            this.pendingResult = dVar;
            presentCustomerCenterFromActivity(activity);
        }
    }

    private final void presentCustomerCenterFromActivity(Activity activity) {
        ensureCustomerCenterListenerRegistered();
        activity.startActivityForResult(new ShowCustomerCenter().createIntent((Context) activity, I.a), 1001);
    }

    private final void presentPaywall(j.d dVar, String str, String str2, Map map, Boolean bool, Map map2) {
        R9.k activityFragment = getActivityFragment();
        if (activityFragment == null) {
            dVar.b("PAYWALLS_MISSING_WRONG_ACTIVITY", "Make sure your MainActivity inherits from FlutterFragmentActivity", null);
        } else {
            PaywallHelpersKt.presentPaywallFromFragment(activityFragment, new PresentPaywallOptions(new 1(dVar), getPaywallSource(str2, map), str, bool, (PaywallFontFamily) null, map2, (PaywallListenerWrapper) null, (HybridPurchaseLogicBridge) null, 208, (k) null));
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            return false;
        }
        if (i2 == -1) {
            Log.d(this.TAG, "Customer Center closed successfully");
            j jVar = this.channel;
            if (jVar == null) {
                t.v("channel");
                jVar = null;
            }
            jVar.c("onDismiss", null);
            j.d dVar = this.pendingResult;
            if (dVar != null) {
                dVar.a("Customer Center closed successfully");
            }
        } else {
            Log.d(this.TAG, "Customer Center closed with result code: " + i2);
            j.d dVar2 = this.pendingResult;
            if (dVar2 != null) {
                dVar2.b("CUSTOMER_CENTER_ERROR", "Customer Center closed with result code: " + i2, null);
            }
        }
        this.pendingResult = null;
        clearCustomerCenterListener();
        return true;
    }

    public void onAttachedToActivity(c binding) {
        t.g(binding, "binding");
        this.activity = binding.getActivity();
        binding.f(this);
    }

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        t.g(flutterPluginBinding, "flutterPluginBinding");
        io.flutter.plugin.platform.k e = flutterPluginBinding.e();
        b b = flutterPluginBinding.b();
        t.f(b, "getBinaryMessenger(...)");
        e.a("com.revenuecat.purchasesui/PaywallView", new PaywallViewFactory(b));
        io.flutter.plugin.platform.k e2 = flutterPluginBinding.e();
        b b2 = flutterPluginBinding.b();
        t.f(b2, "getBinaryMessenger(...)");
        e2.a("com.revenuecat.purchasesui/PaywallFooterView", new PaywallFooterViewFactory(b2));
        io.flutter.plugin.platform.k e3 = flutterPluginBinding.e();
        b b3 = flutterPluginBinding.b();
        t.f(b3, "getBinaryMessenger(...)");
        e3.a("com.revenuecat.purchasesui/CustomerCenterView", new CustomerCenterViewFactory(b3));
        j jVar = new j(flutterPluginBinding.b(), "purchases_ui_flutter");
        this.channel = jVar;
        jVar.e(this);
    }

    public void onDetachedFromActivity() {
        this.activity = null;
        clearCustomerCenterListener();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        j jVar = this.channel;
        if (jVar == null) {
            t.v("channel");
            jVar = null;
        }
        jVar.e(null);
        clearCustomerCenterListener();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
     */
    public void onMethodCall(i call, j.d result) {
        t.g(call, "call");
        t.g(result, "result");
        String str = call.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1398260882:
                    if (str.equals("presentCustomerCenter")) {
                        presentCustomerCenter(result);
                        return;
                    }
                    break;
                case -418412151:
                    if (str.equals("presentPaywallIfNeeded")) {
                        presentPaywall(result, (String) call.a("requiredEntitlementIdentifier"), (String) call.a("offeringIdentifier"), (Map) call.a("presentedOfferingContext"), (Boolean) call.a("displayCloseButton"), (Map) call.a("customVariables"));
                        return;
                    }
                    break;
                case 794909049:
                    if (str.equals("setCustomerCenterCallbacks")) {
                        ensureCustomerCenterListenerRegistered();
                        result.a(null);
                        return;
                    }
                    break;
                case 1341560119:
                    if (str.equals("presentPaywall")) {
                        presentPaywall(result, null, (String) call.a("offeringIdentifier"), (Map) call.a("presentedOfferingContext"), (Boolean) call.a("displayCloseButton"), (Map) call.a("customVariables"));
                        return;
                    }
                    break;
                case 1539532590:
                    if (str.equals("clearCustomerCenterCallbacks")) {
                        clearCustomerCenterListener();
                        result.a(null);
                        return;
                    }
                    break;
            }
        }
        result.c();
    }

    public void onReattachedToActivityForConfigChanges(c binding) {
        t.g(binding, "binding");
        onAttachedToActivity(binding);
    }
}
