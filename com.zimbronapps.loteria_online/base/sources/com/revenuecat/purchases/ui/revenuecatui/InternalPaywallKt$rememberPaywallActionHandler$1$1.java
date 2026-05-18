package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$rememberPaywallActionHandler$1$1", f = "InternalPaywall.kt", l = {276, 281}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$rememberPaywallActionHandler$1$1 extends l implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ PaywallViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$rememberPaywallActionHandler$1$1(PaywallViewModel paywallViewModel, Activity activity, Context context, e eVar) {
        super(2, eVar);
        this.$viewModel = paywallViewModel;
        this.$activity = activity;
        this.$context = context;
    }

    public final e create(Object obj, e eVar) {
        InternalPaywallKt$rememberPaywallActionHandler$1$1 internalPaywallKt$rememberPaywallActionHandler$1$1 = new InternalPaywallKt$rememberPaywallActionHandler$1$1(this.$viewModel, this.$activity, this.$context, eVar);
        internalPaywallKt$rememberPaywallActionHandler$1$1.L$0 = obj;
        return internalPaywallKt$rememberPaywallActionHandler$1$1;
    }

    public final Object invoke(PaywallAction.External external, e eVar) {
        return ((InternalPaywallKt$rememberPaywallActionHandler$1$1) create(external, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            PaywallAction.External external = (PaywallAction.External) this.L$0;
            if (external instanceof PaywallAction.External.RestorePurchases) {
                PaywallViewModel paywallViewModel = this.$viewModel;
                this.label = 1;
                if (paywallViewModel.handleRestorePurchases(this) == f) {
                    return f;
                }
            } else if (external instanceof PaywallAction.External.PurchasePackage) {
                Activity activity = this.$activity;
                if (activity == null) {
                    Logger.INSTANCE.e("Activity is null, not initiating package purchase");
                } else {
                    PaywallViewModel paywallViewModel2 = this.$viewModel;
                    PaywallAction.External.PurchasePackage purchasePackage = (PaywallAction.External.PurchasePackage) external;
                    Package rcPackage = purchasePackage.getRcPackage();
                    ResolvedOffer resolvedOffer = purchasePackage.getResolvedOffer();
                    this.label = 2;
                    if (paywallViewModel2.handlePackagePurchase(activity, rcPackage, resolvedOffer, this) == f) {
                        return f;
                    }
                }
            } else if (external instanceof PaywallAction.External.LaunchWebCheckout) {
                PaywallAction.External.LaunchWebCheckout launchWebCheckout = (PaywallAction.External.LaunchWebCheckout) external;
                String webCheckoutUrl = this.$viewModel.getWebCheckoutUrl(launchWebCheckout);
                if (webCheckoutUrl == null) {
                    Logger.INSTANCE.e("Web checkout URL cannot be found, not launching web checkout.");
                } else {
                    this.$viewModel.invalidateCustomerInfoCache();
                    InternalPaywallKt.access$handleUrlDestination(this.$context, webCheckoutUrl, launchWebCheckout.getOpenMethod());
                    if (launchWebCheckout.getAutoDismiss()) {
                        Logger.INSTANCE.d("Auto-dismissing paywall after launching web checkout.");
                        PaywallViewModel.DefaultImpls.closePaywall$default(this.$viewModel, null, 1, null);
                    }
                }
            } else if (external instanceof PaywallAction.External.NavigateBack) {
                PaywallViewModel.DefaultImpls.closePaywall$default(this.$viewModel, null, 1, null);
            } else if (external instanceof PaywallAction.External.NavigateTo) {
                PaywallAction.External.NavigateTo.Destination destination = ((PaywallAction.External.NavigateTo) external).getDestination();
                if (destination instanceof PaywallAction.External.NavigateTo.Destination.CustomerCenter) {
                    Logger.INSTANCE.w("Customer Center is not yet implemented on Android.");
                } else if (destination instanceof PaywallAction.External.NavigateTo.Destination.Url) {
                    PaywallAction.External.NavigateTo.Destination.Url url = (PaywallAction.External.NavigateTo.Destination.Url) destination;
                    InternalPaywallKt.access$handleUrlDestination(this.$context, url.getUrl(), url.getMethod());
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
