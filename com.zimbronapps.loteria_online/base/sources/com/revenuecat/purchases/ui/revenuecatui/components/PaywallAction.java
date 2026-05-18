package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallAction {

    public interface Internal extends PaywallAction {

        public static final class NavigateTo implements Internal {
            public static final int $stable = 8;
            private final Destination destination;

            public interface Destination {

                public static final class Sheet implements Destination {
                    public static final int $stable = 0;
                    private final ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet;

                    public Sheet(ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet) {
                        t.g(sheet, "sheet");
                        this.sheet = sheet;
                    }

                    public static /* synthetic */ Sheet copy$default(Sheet sheet, ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            sheet2 = sheet.sheet;
                        }
                        return sheet.copy(sheet2);
                    }

                    public final ButtonComponentStyle.Action.NavigateTo.Destination.Sheet component1() {
                        return this.sheet;
                    }

                    public final Sheet copy(ButtonComponentStyle.Action.NavigateTo.Destination.Sheet sheet) {
                        t.g(sheet, "sheet");
                        return new Sheet(sheet);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Sheet) && t.c(this.sheet, ((Sheet) obj).sheet);
                    }

                    public final /* synthetic */ ButtonComponentStyle.Action.NavigateTo.Destination.Sheet getSheet() {
                        return this.sheet;
                    }

                    public int hashCode() {
                        return this.sheet.hashCode();
                    }

                    public String toString() {
                        return "Sheet(sheet=" + this.sheet + ')';
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
    }

    public interface External extends PaywallAction {

        public static final class LaunchWebCheckout implements External {
            public static final int $stable = 8;
            private final boolean autoDismiss;
            private final String customUrl;
            private final ButtonComponent.UrlMethod openMethod;
            private final PackageParamBehavior packageParamBehavior;

            public interface PackageParamBehavior {

                public static final class Append implements PackageParamBehavior {
                    public static final int $stable = 8;
                    private final String packageParam;
                    private final Package rcPackage;

                    public Append(Package r1, String str) {
                        this.rcPackage = r1;
                        this.packageParam = str;
                    }

                    public static /* synthetic */ Append copy$default(Append append, Package r1, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            r1 = append.rcPackage;
                        }
                        if ((i & 2) != 0) {
                            str = append.packageParam;
                        }
                        return append.copy(r1, str);
                    }

                    public final Package component1() {
                        return this.rcPackage;
                    }

                    public final String component2() {
                        return this.packageParam;
                    }

                    public final Append copy(Package r2, String str) {
                        return new Append(r2, str);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Append)) {
                            return false;
                        }
                        Append append = (Append) obj;
                        return t.c(this.rcPackage, append.rcPackage) && t.c(this.packageParam, append.packageParam);
                    }

                    public final String getPackageParam() {
                        return this.packageParam;
                    }

                    public final Package getRcPackage() {
                        return this.rcPackage;
                    }

                    public int hashCode() {
                        Package r0 = this.rcPackage;
                        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
                        String str = this.packageParam;
                        return hashCode + (str != null ? str.hashCode() : 0);
                    }

                    public String toString() {
                        return "Append(rcPackage=" + this.rcPackage + ", packageParam=" + this.packageParam + ')';
                    }
                }

                public static final class DoNotAppend implements PackageParamBehavior {
                    public static final int $stable = 0;
                    public static final DoNotAppend INSTANCE = new DoNotAppend();

                    private DoNotAppend() {
                    }
                }
            }

            public LaunchWebCheckout(String str, ButtonComponent.UrlMethod openMethod, boolean z, PackageParamBehavior packageParamBehavior) {
                t.g(openMethod, "openMethod");
                t.g(packageParamBehavior, "packageParamBehavior");
                this.customUrl = str;
                this.openMethod = openMethod;
                this.autoDismiss = z;
                this.packageParamBehavior = packageParamBehavior;
            }

            public static /* synthetic */ LaunchWebCheckout copy$default(LaunchWebCheckout launchWebCheckout, String str, ButtonComponent.UrlMethod urlMethod, boolean z, PackageParamBehavior packageParamBehavior, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = launchWebCheckout.customUrl;
                }
                if ((i & 2) != 0) {
                    urlMethod = launchWebCheckout.openMethod;
                }
                if ((i & 4) != 0) {
                    z = launchWebCheckout.autoDismiss;
                }
                if ((i & 8) != 0) {
                    packageParamBehavior = launchWebCheckout.packageParamBehavior;
                }
                return launchWebCheckout.copy(str, urlMethod, z, packageParamBehavior);
            }

            public final String component1() {
                return this.customUrl;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final boolean component3() {
                return this.autoDismiss;
            }

            public final PackageParamBehavior component4() {
                return this.packageParamBehavior;
            }

            public final LaunchWebCheckout copy(String str, ButtonComponent.UrlMethod openMethod, boolean z, PackageParamBehavior packageParamBehavior) {
                t.g(openMethod, "openMethod");
                t.g(packageParamBehavior, "packageParamBehavior");
                return new LaunchWebCheckout(str, openMethod, z, packageParamBehavior);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchWebCheckout)) {
                    return false;
                }
                LaunchWebCheckout launchWebCheckout = (LaunchWebCheckout) obj;
                return t.c(this.customUrl, launchWebCheckout.customUrl) && this.openMethod == launchWebCheckout.openMethod && this.autoDismiss == launchWebCheckout.autoDismiss && t.c(this.packageParamBehavior, launchWebCheckout.packageParamBehavior);
            }

            public final boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final String getCustomUrl() {
                return this.customUrl;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final PackageParamBehavior getPackageParamBehavior() {
                return this.packageParamBehavior;
            }

            public int hashCode() {
                String str = this.customUrl;
                return ((((((str == null ? 0 : str.hashCode()) * 31) + this.openMethod.hashCode()) * 31) + Boolean.hashCode(this.autoDismiss)) * 31) + this.packageParamBehavior.hashCode();
            }

            public String toString() {
                return "LaunchWebCheckout(customUrl=" + this.customUrl + ", openMethod=" + this.openMethod + ", autoDismiss=" + this.autoDismiss + ", packageParamBehavior=" + this.packageParamBehavior + ')';
            }
        }

        public static final class NavigateBack implements External {
            public static final int $stable = 0;
            public static final NavigateBack INSTANCE = new NavigateBack();

            private NavigateBack() {
            }
        }

        public static final class NavigateTo implements External {
            public static final int $stable = 8;
            private final Destination destination;

            public interface Destination {

                public static final class CustomerCenter implements Destination {
                    public static final int $stable = 0;
                    public static final CustomerCenter INSTANCE = new CustomerCenter();

                    private CustomerCenter() {
                    }
                }

                public static final class Url implements Destination {
                    public static final int $stable = 0;
                    private final ButtonComponent.UrlMethod method;
                    private final String url;

                    public Url(String url, ButtonComponent.UrlMethod method) {
                        t.g(url, "url");
                        t.g(method, "method");
                        this.url = url;
                        this.method = method;
                    }

                    public static /* synthetic */ Url copy$default(Url url, String str, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = url.url;
                        }
                        if ((i & 2) != 0) {
                            urlMethod = url.method;
                        }
                        return url.copy(str, urlMethod);
                    }

                    public final String component1() {
                        return this.url;
                    }

                    public final ButtonComponent.UrlMethod component2() {
                        return this.method;
                    }

                    public final Url copy(String url, ButtonComponent.UrlMethod method) {
                        t.g(url, "url");
                        t.g(method, "method");
                        return new Url(url, method);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Url)) {
                            return false;
                        }
                        Url url = (Url) obj;
                        return t.c(this.url, url.url) && this.method == url.method;
                    }

                    public final /* synthetic */ ButtonComponent.UrlMethod getMethod() {
                        return this.method;
                    }

                    public final /* synthetic */ String getUrl() {
                        return this.url;
                    }

                    public int hashCode() {
                        return (this.url.hashCode() * 31) + this.method.hashCode();
                    }

                    public String toString() {
                        return "Url(url=" + this.url + ", method=" + this.method + ')';
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

        public static final class RestorePurchases implements External {
            public static final int $stable = 0;
            public static final RestorePurchases INSTANCE = new RestorePurchases();

            private RestorePurchases() {
            }
        }

        public static final class PurchasePackage implements External {
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
}
