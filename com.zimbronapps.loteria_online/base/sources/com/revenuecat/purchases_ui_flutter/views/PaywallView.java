package com.revenuecat.purchases_ui_flutter.views;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases_ui_flutter.MapHelper;
import da.i;
import da.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallView extends BasePaywallView implements j.c {
    private final j methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallView nativePaywallView;
    private HybridPurchaseLogicBridge purchaseLogicBridge;

    public static final class 2 extends PaywallListenerWrapper {
        public 2() {
        }

        public void onPurchaseCancelled() {
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onPurchaseCancelled", null);
        }

        public void onPurchaseCompleted(Map customerInfo, Map storeTransaction) {
            t.g(customerInfo, "customerInfo");
            t.g(storeTransaction, "storeTransaction");
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onPurchaseCompleted", S.l(x.a("customerInfo", customerInfo), x.a("storeTransaction", storeTransaction)));
        }

        public void onPurchaseError(Map error) {
            t.g(error, "error");
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onPurchaseError", error);
        }

        public void onPurchaseStarted(Map rcPackage) {
            t.g(rcPackage, "rcPackage");
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onPurchaseStarted", rcPackage);
        }

        public void onRestoreCompleted(Map customerInfo) {
            t.g(customerInfo, "customerInfo");
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onRestoreCompleted", customerInfo);
        }

        public void onRestoreError(Map error) {
            t.g(error, "error");
            PaywallView.access$getMethodChannel$p(PaywallView.this).c("onRestoreError", error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, int i, da.b messenger, Map creationParams) {
        super(context);
        t.g(context, "context");
        t.g(messenger, "messenger");
        t.g(creationParams, "creationParams");
        j jVar = new j(messenger, "com.revenuecat.purchasesui/PaywallView/" + i);
        this.methodChannel = jVar;
        jVar.e(this);
        String str = (String) creationParams.get("offeringIdentifier");
        Object obj = creationParams.get("presentedOfferingContext");
        Map map = obj instanceof Map ? (Map) obj : null;
        PresentedOfferingContext mapPresentedOfferingContext = map != null ? MapHelper.INSTANCE.mapPresentedOfferingContext(map) : null;
        com.revenuecat.purchases.ui.revenuecatui.views.PaywallView paywallView = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallView(context, null, null, null, (Boolean) creationParams.get("displayCloseButton"), null, new c(this), 46, null);
        this.nativePaywallView = paywallView;
        paywallView.setPaywallListener(new 2());
        Object obj2 = creationParams.get("customVariables");
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map2.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                q a = value instanceof String ? x.a(str2, new CustomVariableValue.String((String) value)) : value instanceof Double ? x.a(str2, new CustomVariableValue.Number(((Number) value).doubleValue())) : value instanceof Boolean ? x.a(str2, new CustomVariableValue.Boolean(((Boolean) value).booleanValue())) : null;
                if (a != null) {
                    arrayList.add(a);
                }
            }
            this.nativePaywallView.setCustomVariables(S.x(arrayList));
        }
        this.nativePaywallView.setOfferingId(str, mapPresentedOfferingContext);
        Object obj3 = creationParams.get("hasPurchaseLogic");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (bool != null ? bool.booleanValue() : false) {
            PaywallPurchaseLogic hybridPurchaseLogicBridge = new HybridPurchaseLogicBridge(new d(this), new e(this));
            this.purchaseLogicBridge = hybridPurchaseLogicBridge;
            this.nativePaywallView.setPurchaseLogic(hybridPurchaseLogicBridge);
        }
    }

    private static final I _init_$lambda$1(PaywallView paywallView) {
        paywallView.methodChannel.c("onDismiss", null);
        return I.a;
    }

    private static final I _init_$lambda$3(PaywallView paywallView, Map eventData) {
        t.g(eventData, "eventData");
        paywallView.methodChannel.c("onPerformPurchase", eventData);
        return I.a;
    }

    private static final I _init_$lambda$4(PaywallView paywallView, Map eventData) {
        t.g(eventData, "eventData");
        paywallView.methodChannel.c("onPerformRestore", eventData);
        return I.a;
    }

    public static /* synthetic */ I a(PaywallView paywallView, Map map) {
        return _init_$lambda$3(paywallView, map);
    }

    public static final /* synthetic */ j access$getMethodChannel$p(PaywallView paywallView) {
        return paywallView.methodChannel;
    }

    public static /* synthetic */ I b(PaywallView paywallView) {
        return _init_$lambda$1(paywallView);
    }

    public static /* synthetic */ I c(PaywallView paywallView, Map map) {
        return _init_$lambda$4(paywallView, map);
    }

    public void dispose() {
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogicBridge;
        if (hybridPurchaseLogicBridge != null) {
            hybridPurchaseLogicBridge.cancelPending();
        }
    }

    public View getView() {
        return this.nativePaywallView;
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

    public void onMethodCall(i methodCall, j.d result) {
        t.g(methodCall, "methodCall");
        t.g(result, "result");
        if (!t.c(methodCall.a, "resolvePurchaseLogicResult")) {
            result.c();
            return;
        }
        Object obj = methodCall.b;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("requestId") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map != null ? map.get("result") : null;
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map != null ? map.get("errorMessage") : null;
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str != null && str2 != null) {
            HybridPurchaseLogicBridge.Companion.resolveResult(str, str2, str3);
        }
        result.a(null);
    }
}
