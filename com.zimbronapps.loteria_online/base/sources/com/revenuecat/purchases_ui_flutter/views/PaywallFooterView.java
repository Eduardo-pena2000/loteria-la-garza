package com.revenuecat.purchases_ui_flutter.views;

import Ca.I;
import Ca.x;
import Da.S;
import T1.e0;
import Wa.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases_ui_flutter.MapHelper;
import da.j;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallFooterView extends BasePaywallView {
    private final j methodChannel;
    private final com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView nativePaywallFooterView;

    public static final class 1 extends com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView {
        final /* synthetic */ PaywallFooterView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context, PaywallFooterView paywallFooterView, Qa.a aVar) {
            super(context, null, null, null, false, aVar, 30, null);
            this.this$0 = paywallFooterView;
        }

        public void onMeasure(int i, int i2) {
            super/*android.view.View*/.onMeasure(i, i2);
            int i3 = 0;
            int i4 = 0;
            for (View view : e0.a(this)) {
                view.measure(i, 0);
                i3 = n.e(i3, view.getMeasuredWidth());
                i4 = n.e(i4, view.getMeasuredHeight());
            }
            int e = n.e(i3, getSuggestedMinimumWidth());
            int e2 = n.e(i4, getSuggestedMinimumHeight());
            setMeasuredDimension(e, e2);
            PaywallFooterView.access$updateHeight(this.this$0, e2);
        }
    }

    public static final class 3 extends PaywallListenerWrapper {
        public 3() {
        }

        public void onPurchaseCancelled() {
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onPurchaseCancelled", null);
        }

        public void onPurchaseCompleted(Map customerInfo, Map storeTransaction) {
            t.g(customerInfo, "customerInfo");
            t.g(storeTransaction, "storeTransaction");
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onPurchaseCompleted", S.l(x.a("customerInfo", customerInfo), x.a("storeTransaction", storeTransaction)));
        }

        public void onPurchaseError(Map error) {
            t.g(error, "error");
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onPurchaseError", error);
        }

        public void onPurchaseStarted(Map rcPackage) {
            t.g(rcPackage, "rcPackage");
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onPurchaseStarted", rcPackage);
        }

        public void onRestoreCompleted(Map customerInfo) {
            t.g(customerInfo, "customerInfo");
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onRestoreCompleted", customerInfo);
        }

        public void onRestoreError(Map error) {
            t.g(error, "error");
            PaywallFooterView.access$getMethodChannel$p(PaywallFooterView.this).c("onRestoreError", error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, int i, da.b messenger, Map creationParams) {
        PresentedOfferingContext mapPresentedOfferingContext;
        super(context);
        t.g(context, "context");
        t.g(messenger, "messenger");
        t.g(creationParams, "creationParams");
        this.methodChannel = new j(messenger, "com.revenuecat.purchasesui/PaywallFooterView/" + i);
        String str = (String) creationParams.get("offeringIdentifier");
        Object obj = creationParams.get("presentedOfferingContext");
        PresentedOfferingContext presentedOfferingContext = null;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && (mapPresentedOfferingContext = MapHelper.INSTANCE.mapPresentedOfferingContext(map)) != null) {
            presentedOfferingContext = mapPresentedOfferingContext;
        } else if (str != null) {
            presentedOfferingContext = new PresentedOfferingContext(str);
        }
        1 r7 = new 1(context, this, new b(this));
        this.nativePaywallFooterView = r7;
        r7.setPaywallListener(new 3());
        r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 80));
        if (str == null || presentedOfferingContext == null) {
            return;
        }
        r7.setOfferingIdAndPresentedOfferingContext(str, presentedOfferingContext);
    }

    private static final I _init_$lambda$2(PaywallFooterView paywallFooterView) {
        paywallFooterView.methodChannel.c("onDismiss", null);
        return I.a;
    }

    public static /* synthetic */ I a(PaywallFooterView paywallFooterView) {
        return _init_$lambda$2(paywallFooterView);
    }

    public static final /* synthetic */ j access$getMethodChannel$p(PaywallFooterView paywallFooterView) {
        return paywallFooterView.methodChannel;
    }

    public static final /* synthetic */ void access$updateHeight(PaywallFooterView paywallFooterView, double d) {
        paywallFooterView.updateHeight(d);
    }

    private final void updateHeight(double d) {
        this.methodChannel.c("onHeightChanged", Double.valueOf(d));
    }

    public void dispose() {
    }

    public View getView() {
        return this.nativePaywallFooterView;
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
}
