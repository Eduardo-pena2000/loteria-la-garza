package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final Action action;
    private final Size size;
    private final StackComponentStyle stackComponentStyle;
    private final PaywallTransition transition;
    private final boolean visible;

    public ButtonComponentStyle(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition) {
        t.g(stackComponentStyle, "stackComponentStyle");
        t.g(action, "action");
        this.stackComponentStyle = stackComponentStyle;
        this.action = action;
        this.transition = paywallTransition;
        this.visible = stackComponentStyle.getVisible();
        this.size = stackComponentStyle.getSize();
    }

    public static /* synthetic */ ButtonComponentStyle copy$default(ButtonComponentStyle buttonComponentStyle, StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, int i, Object obj) {
        if ((i & 1) != 0) {
            stackComponentStyle = buttonComponentStyle.stackComponentStyle;
        }
        if ((i & 2) != 0) {
            action = buttonComponentStyle.action;
        }
        if ((i & 4) != 0) {
            paywallTransition = buttonComponentStyle.transition;
        }
        return buttonComponentStyle.copy(stackComponentStyle, action, paywallTransition);
    }

    public final StackComponentStyle component1() {
        return this.stackComponentStyle;
    }

    public final Action component2() {
        return this.action;
    }

    public final PaywallTransition component3() {
        return this.transition;
    }

    public final ButtonComponentStyle copy(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition) {
        t.g(stackComponentStyle, "stackComponentStyle");
        t.g(action, "action");
        return new ButtonComponentStyle(stackComponentStyle, action, paywallTransition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponentStyle)) {
            return false;
        }
        ButtonComponentStyle buttonComponentStyle = (ButtonComponentStyle) obj;
        return t.c(this.stackComponentStyle, buttonComponentStyle.stackComponentStyle) && t.c(this.action, buttonComponentStyle.action) && t.c(this.transition, buttonComponentStyle.transition);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public Size getSize() {
        return this.size;
    }

    public final /* synthetic */ StackComponentStyle getStackComponentStyle() {
        return this.stackComponentStyle;
    }

    public final /* synthetic */ PaywallTransition getTransition() {
        return this.transition;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((this.stackComponentStyle.hashCode() * 31) + this.action.hashCode()) * 31;
        PaywallTransition paywallTransition = this.transition;
        return hashCode + (paywallTransition == null ? 0 : paywallTransition.hashCode());
    }

    public String toString() {
        return "ButtonComponentStyle(stackComponentStyle=" + this.stackComponentStyle + ", action=" + this.action + ", transition=" + this.transition + ')';
    }

    public interface Action {

        public static final class CustomWebCheckout implements Action {
            public static final int $stable = 8;
            private final boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;
            private final String packageParam;
            private final Package rcPackage;
            private final NonEmptyMap urls;

            public CustomWebCheckout(NonEmptyMap urls, boolean z, ButtonComponent.UrlMethod openMethod, Package r5, String str) {
                t.g(urls, "urls");
                t.g(openMethod, "openMethod");
                this.urls = urls;
                this.autoDismiss = z;
                this.openMethod = openMethod;
                this.rcPackage = r5;
                this.packageParam = str;
            }

            public static /* synthetic */ CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, NonEmptyMap nonEmptyMap, boolean z, ButtonComponent.UrlMethod urlMethod, Package r7, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    nonEmptyMap = customWebCheckout.urls;
                }
                if ((i & 2) != 0) {
                    z = customWebCheckout.autoDismiss;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                ButtonComponent.UrlMethod urlMethod2 = urlMethod;
                if ((i & 8) != 0) {
                    r7 = customWebCheckout.rcPackage;
                }
                Package r1 = r7;
                if ((i & 16) != 0) {
                    str = customWebCheckout.packageParam;
                }
                return customWebCheckout.copy(nonEmptyMap, z2, urlMethod2, r1, str);
            }

            public final NonEmptyMap component1() {
                return this.urls;
            }

            public final boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final Package component4() {
                return this.rcPackage;
            }

            public final String component5() {
                return this.packageParam;
            }

            public final CustomWebCheckout copy(NonEmptyMap urls, boolean z, ButtonComponent.UrlMethod openMethod, Package r11, String str) {
                t.g(urls, "urls");
                t.g(openMethod, "openMethod");
                return new CustomWebCheckout(urls, z, openMethod, r11, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) obj;
                return t.c(this.urls, customWebCheckout.urls) && this.autoDismiss == customWebCheckout.autoDismiss && this.openMethod == customWebCheckout.openMethod && t.c(this.rcPackage, customWebCheckout.rcPackage) && t.c(this.packageParam, customWebCheckout.packageParam);
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final String getPackageParam() {
                return this.packageParam;
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public final NonEmptyMap getUrls() {
                return this.urls;
            }

            public int hashCode() {
                int hashCode = ((((this.urls.hashCode() * 31) + Boolean.hashCode(this.autoDismiss)) * 31) + this.openMethod.hashCode()) * 31;
                Package r1 = this.rcPackage;
                int hashCode2 = (hashCode + (r1 == null ? 0 : r1.hashCode())) * 31;
                String str = this.packageParam;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "CustomWebCheckout(urls=" + this.urls + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ", rcPackage=" + this.rcPackage + ", packageParam=" + this.packageParam + ')';
            }
        }

        public static final class NavigateBack implements Action {
            public static final int $stable = 0;
            public static final NavigateBack INSTANCE = new NavigateBack();

            private NavigateBack() {
            }
        }

        public static final class NavigateTo implements Action {
            public static final int $stable = 8;
            private final Destination destination;

            public interface Destination {

                public static final class CustomerCenter implements Destination {
                    public static final int $stable = 0;
                    public static final CustomerCenter INSTANCE = new CustomerCenter();

                    private CustomerCenter() {
                    }
                }

                public static final class Sheet implements Destination {
                    public static final int $stable = 0;
                    private final boolean backgroundBlur;
                    private final String id;
                    private final String name;
                    private final Size size;
                    private final ComponentStyle stack;

                    public Sheet(String id, String str, ComponentStyle stack, boolean z, Size size) {
                        t.g(id, "id");
                        t.g(stack, "stack");
                        this.id = id;
                        this.name = str;
                        this.stack = stack;
                        this.backgroundBlur = z;
                        this.size = size;
                    }

                    public static /* synthetic */ Sheet copy$default(Sheet sheet, String str, String str2, ComponentStyle componentStyle, boolean z, Size size, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = sheet.id;
                        }
                        if ((i & 2) != 0) {
                            str2 = sheet.name;
                        }
                        String str3 = str2;
                        if ((i & 4) != 0) {
                            componentStyle = sheet.stack;
                        }
                        ComponentStyle componentStyle2 = componentStyle;
                        if ((i & 8) != 0) {
                            z = sheet.backgroundBlur;
                        }
                        boolean z2 = z;
                        if ((i & 16) != 0) {
                            size = sheet.size;
                        }
                        return sheet.copy(str, str3, componentStyle2, z2, size);
                    }

                    public final String component1() {
                        return this.id;
                    }

                    public final String component2() {
                        return this.name;
                    }

                    public final ComponentStyle component3() {
                        return this.stack;
                    }

                    public final boolean component4() {
                        return this.backgroundBlur;
                    }

                    public final Size component5() {
                        return this.size;
                    }

                    public final Sheet copy(String id, String str, ComponentStyle stack, boolean z, Size size) {
                        t.g(id, "id");
                        t.g(stack, "stack");
                        return new Sheet(id, str, stack, z, size);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Sheet)) {
                            return false;
                        }
                        Sheet sheet = (Sheet) obj;
                        return t.c(this.id, sheet.id) && t.c(this.name, sheet.name) && t.c(this.stack, sheet.stack) && this.backgroundBlur == sheet.backgroundBlur && t.c(this.size, sheet.size);
                    }

                    public final /* synthetic */ boolean getBackgroundBlur() {
                        return this.backgroundBlur;
                    }

                    public final /* synthetic */ String getId() {
                        return this.id;
                    }

                    public final /* synthetic */ String getName() {
                        return this.name;
                    }

                    public final /* synthetic */ Size getSize() {
                        return this.size;
                    }

                    public final /* synthetic */ ComponentStyle getStack() {
                        return this.stack;
                    }

                    public int hashCode() {
                        int hashCode = this.id.hashCode() * 31;
                        String str = this.name;
                        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.stack.hashCode()) * 31) + Boolean.hashCode(this.backgroundBlur)) * 31;
                        Size size = this.size;
                        return hashCode2 + (size != null ? size.hashCode() : 0);
                    }

                    public String toString() {
                        return "Sheet(id=" + this.id + ", name=" + this.name + ", stack=" + this.stack + ", backgroundBlur=" + this.backgroundBlur + ", size=" + this.size + ')';
                    }
                }

                public static final class Url implements Destination {
                    public static final int $stable = 8;
                    private final ButtonComponent.UrlMethod method;
                    private final NonEmptyMap urls;

                    public Url(NonEmptyMap urls, ButtonComponent.UrlMethod method) {
                        t.g(urls, "urls");
                        t.g(method, "method");
                        this.urls = urls;
                        this.method = method;
                    }

                    public static /* synthetic */ Url copy$default(Url url, NonEmptyMap nonEmptyMap, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                        if ((i & 1) != 0) {
                            nonEmptyMap = url.urls;
                        }
                        if ((i & 2) != 0) {
                            urlMethod = url.method;
                        }
                        return url.copy(nonEmptyMap, urlMethod);
                    }

                    public final NonEmptyMap component1() {
                        return this.urls;
                    }

                    public final ButtonComponent.UrlMethod component2() {
                        return this.method;
                    }

                    public final Url copy(NonEmptyMap urls, ButtonComponent.UrlMethod method) {
                        t.g(urls, "urls");
                        t.g(method, "method");
                        return new Url(urls, method);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Url)) {
                            return false;
                        }
                        Url url = (Url) obj;
                        return t.c(this.urls, url.urls) && this.method == url.method;
                    }

                    public final /* synthetic */ ButtonComponent.UrlMethod getMethod() {
                        return this.method;
                    }

                    public final /* synthetic */ NonEmptyMap getUrls() {
                        return this.urls;
                    }

                    public int hashCode() {
                        return (this.urls.hashCode() * 31) + this.method.hashCode();
                    }

                    public String toString() {
                        return "Url(urls=" + this.urls + ", method=" + this.method + ')';
                    }
                }
            }

            public NavigateTo(Destination destination) {
                t.g(destination, "destination");
                this.destination = destination;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && t.c(this.destination, ((NavigateTo) obj).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }
        }

        public static final class RestorePurchases implements Action {
            public static final int $stable = 0;
            public static final RestorePurchases INSTANCE = new RestorePurchases();

            private RestorePurchases() {
            }
        }

        public static final class WebCheckout implements Action {
            public static final int $stable = 8;
            private final boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;
            private final Package rcPackage;

            public WebCheckout(Package r2, boolean z, ButtonComponent.UrlMethod openMethod) {
                t.g(openMethod, "openMethod");
                this.rcPackage = r2;
                this.autoDismiss = z;
                this.openMethod = openMethod;
            }

            public static /* synthetic */ WebCheckout copy$default(WebCheckout webCheckout, Package r1, boolean z, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    r1 = webCheckout.rcPackage;
                }
                if ((i & 2) != 0) {
                    z = webCheckout.autoDismiss;
                }
                if ((i & 4) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(r1, z, urlMethod);
            }

            public final Package component1() {
                return this.rcPackage;
            }

            public final boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final WebCheckout copy(Package r2, boolean z, ButtonComponent.UrlMethod openMethod) {
                t.g(openMethod, "openMethod");
                return new WebCheckout(r2, z, openMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) obj;
                return t.c(this.rcPackage, webCheckout.rcPackage) && this.autoDismiss == webCheckout.autoDismiss && this.openMethod == webCheckout.openMethod;
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public int hashCode() {
                Package r0 = this.rcPackage;
                return ((((r0 == null ? 0 : r0.hashCode()) * 31) + Boolean.hashCode(this.autoDismiss)) * 31) + this.openMethod.hashCode();
            }

            public String toString() {
                return "WebCheckout(rcPackage=" + this.rcPackage + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        public static final class WebProductSelection implements Action {
            public static final int $stable = 0;
            private final boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public WebProductSelection(boolean z, ButtonComponent.UrlMethod openMethod) {
                t.g(openMethod, "openMethod");
                this.autoDismiss = z;
                this.openMethod = openMethod;
            }

            public static /* synthetic */ WebProductSelection copy$default(WebProductSelection webProductSelection, boolean z, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = webProductSelection.autoDismiss;
                }
                if ((i & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(z, urlMethod);
            }

            public final boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebProductSelection copy(boolean z, ButtonComponent.UrlMethod openMethod) {
                t.g(openMethod, "openMethod");
                return new WebProductSelection(z, openMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) obj;
                return this.autoDismiss == webProductSelection.autoDismiss && this.openMethod == webProductSelection.openMethod;
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.autoDismiss) * 31) + this.openMethod.hashCode();
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        public static final class PurchasePackage implements Action {
            public static final int $stable = 8;
            private final Package rcPackage;
            private final ResolvedOffer resolvedOffer;

            public PurchasePackage(Package r1, ResolvedOffer resolvedOffer) {
                this.rcPackage = r1;
                this.resolvedOffer = resolvedOffer;
            }

            public static /* synthetic */ PurchasePackage copy$default(PurchasePackage purchasePackage, Package r1, ResolvedOffer resolvedOffer, int i, Object obj) {
                if ((i & 1) != 0) {
                    r1 = purchasePackage.rcPackage;
                }
                if ((i & 2) != 0) {
                    resolvedOffer = purchasePackage.resolvedOffer;
                }
                return purchasePackage.copy(r1, resolvedOffer);
            }

            public final Package component1() {
                return this.rcPackage;
            }

            public final ResolvedOffer component2() {
                return this.resolvedOffer;
            }

            public final PurchasePackage copy(Package r2, ResolvedOffer resolvedOffer) {
                return new PurchasePackage(r2, resolvedOffer);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PurchasePackage)) {
                    return false;
                }
                PurchasePackage purchasePackage = (PurchasePackage) obj;
                return t.c(this.rcPackage, purchasePackage.rcPackage) && t.c(this.resolvedOffer, purchasePackage.resolvedOffer);
            }

            public final Package getRcPackage() {
                return this.rcPackage;
            }

            public final ResolvedOffer getResolvedOffer() {
                return this.resolvedOffer;
            }

            public int hashCode() {
                Package r0 = this.rcPackage;
                int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
                ResolvedOffer resolvedOffer = this.resolvedOffer;
                return hashCode + (resolvedOffer != null ? resolvedOffer.hashCode() : 0);
            }

            public String toString() {
                return "PurchasePackage(rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ')';
            }

            public /* synthetic */ PurchasePackage(Package r1, ResolvedOffer resolvedOffer, int i, k kVar) {
                this(r1, (i & 2) != 0 ? null : resolvedOffer);
            }
        }
    }

    public /* synthetic */ ButtonComponentStyle(StackComponentStyle stackComponentStyle, Action action, PaywallTransition paywallTransition, int i, k kVar) {
        this(stackComponentStyle, action, (i & 4) != 0 ? null : paywallTransition);
    }
}
