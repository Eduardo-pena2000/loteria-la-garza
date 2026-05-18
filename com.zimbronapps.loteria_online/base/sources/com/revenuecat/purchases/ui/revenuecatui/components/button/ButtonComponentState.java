package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Ca.o;
import Qa.a;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentState {
    public static final int $stable = 0;
    private final h2 action$delegate;
    private final a localeProvider;
    private final ButtonComponentStyle style;

    public ButtonComponentState(ButtonComponentStyle style, a localeProvider) {
        t.g(style, "style");
        t.g(localeProvider, "localeProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.action$delegate = U1.c(new ButtonComponentState$action$2(this));
    }

    public static final /* synthetic */ a access$getLocaleProvider$p(ButtonComponentState buttonComponentState) {
        return buttonComponentState.localeProvider;
    }

    public static final /* synthetic */ ButtonComponentStyle access$getStyle$p(ButtonComponentState buttonComponentState) {
        return buttonComponentState.style;
    }

    public static final /* synthetic */ PaywallAction access$toPaywallAction-64pKzr8(ButtonComponentState buttonComponentState, ButtonComponentStyle.Action action, String str) {
        return buttonComponentState.toPaywallAction-64pKzr8(action, str);
    }

    private final PaywallAction toPaywallAction-64pKzr8(ButtonComponentStyle.Action action, String str) {
        PaywallAction launchWebCheckout;
        if (action instanceof ButtonComponentStyle.Action.NavigateBack) {
            return PaywallAction.External.NavigateBack.INSTANCE;
        }
        if (action instanceof ButtonComponentStyle.Action.NavigateTo) {
            ButtonComponentStyle.Action.NavigateTo navigateTo = (ButtonComponentStyle.Action.NavigateTo) action;
            ButtonComponentStyle.Action.NavigateTo.Destination destination = navigateTo.getDestination();
            if (destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.CustomerCenter) {
                return new PaywallAction.External.NavigateTo(PaywallAction.External.NavigateTo.Destination.CustomerCenter.INSTANCE);
            }
            if (destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.Url) {
                NonEmptyMap urls = ((ButtonComponentStyle.Action.NavigateTo.Destination.Url) navigateTo.getDestination()).getUrls();
                return new PaywallAction.External.NavigateTo(new PaywallAction.External.NavigateTo.Destination.Url((String) urls.getOrDefault(LocaleId.box-impl(str), urls.getEntry().getValue()), ((ButtonComponentStyle.Action.NavigateTo.Destination.Url) navigateTo.getDestination()).getMethod()));
            }
            if (!(destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.Sheet)) {
                throw new o();
            }
            launchWebCheckout = new PaywallAction.Internal.NavigateTo(new PaywallAction.Internal.NavigateTo.Destination.Sheet((ButtonComponentStyle.Action.NavigateTo.Destination.Sheet) navigateTo.getDestination()));
        } else if (action instanceof ButtonComponentStyle.Action.PurchasePackage) {
            ButtonComponentStyle.Action.PurchasePackage purchasePackage = (ButtonComponentStyle.Action.PurchasePackage) action;
            launchWebCheckout = new PaywallAction.External.PurchasePackage(purchasePackage.getRcPackage(), purchasePackage.getResolvedOffer());
        } else {
            if (action instanceof ButtonComponentStyle.Action.RestorePurchases) {
                return PaywallAction.External.RestorePurchases.INSTANCE;
            }
            if (action instanceof ButtonComponentStyle.Action.WebCheckout) {
                ButtonComponentStyle.Action.WebCheckout webCheckout = (ButtonComponentStyle.Action.WebCheckout) action;
                launchWebCheckout = new PaywallAction.External.LaunchWebCheckout(null, webCheckout.getOpenMethod(), webCheckout.getAutoDismiss(), new PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append(webCheckout.getRcPackage(), null));
            } else {
                if (!(action instanceof ButtonComponentStyle.Action.WebProductSelection)) {
                    if (!(action instanceof ButtonComponentStyle.Action.CustomWebCheckout)) {
                        throw new o();
                    }
                    ButtonComponentStyle.Action.CustomWebCheckout customWebCheckout = (ButtonComponentStyle.Action.CustomWebCheckout) action;
                    NonEmptyMap urls2 = customWebCheckout.getUrls();
                    return new PaywallAction.External.LaunchWebCheckout((String) urls2.getOrDefault(LocaleId.box-impl(str), urls2.getEntry().getValue()), customWebCheckout.getOpenMethod(), customWebCheckout.getAutoDismiss(), new PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append(customWebCheckout.getRcPackage(), customWebCheckout.getPackageParam()));
                }
                ButtonComponentStyle.Action.WebProductSelection webProductSelection = (ButtonComponentStyle.Action.WebProductSelection) action;
                launchWebCheckout = new PaywallAction.External.LaunchWebCheckout(null, webProductSelection.getOpenMethod(), webProductSelection.getAutoDismiss(), PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.DoNotAppend.INSTANCE);
            }
        }
        return launchWebCheckout;
    }

    public final /* synthetic */ PaywallAction getAction() {
        return (PaywallAction) this.action$delegate.getValue();
    }
}
