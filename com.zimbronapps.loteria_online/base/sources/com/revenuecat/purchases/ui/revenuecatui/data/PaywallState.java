package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.l;
import Ca.m;
import Da.D;
import Da.Q;
import Da.S;
import Da.Y;
import Da.Z;
import Da.u;
import Da.v;
import Da.w;
import Qa.a;
import Ya.r;
import android.os.LocaleList;
import b0.A0;
import b0.C0;
import b0.J1;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptySet;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import h1.d;
import h1.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l0.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallState {

    public static final class Error implements PaywallState {
        public static final int $stable = 0;
        private final String errorMessage;

        public Error(String errorMessage) {
            t.g(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            Logger.INSTANCE.e("Paywall transitioned to error state: " + errorMessage);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Error copy(String errorMessage) {
            t.g(errorMessage, "errorMessage");
            return new Error(errorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.c(this.errorMessage, ((Error) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ')';
        }
    }

    public static final class Loading implements PaywallState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    public interface Loaded extends PaywallState {
        Offering getOffering();

        public static final class Components implements Loaded {
            public static final int $stable = 0;
            private final C0 actionInProgress$delegate;
            private final l availableStorefrontCountryLocalesByLanguage$delegate;
            private final BackgroundStyles background;
            private final h2 currencyLocale$delegate;
            private final Map customVariables;
            private final a dateProvider;
            private final Map defaultCustomVariables;
            private final String initialSelectedPackageOutsideTabs;
            private final String initialSelectedPackageUniqueId;
            private final h2 locale$delegate;
            private final C0 localeId$delegate;
            private final NonEmptySet locales;
            private final Map mergedCustomVariables;
            private final h2 mostExpensivePricePerMonthMicros$delegate;
            private final Offering offering;
            private final AvailablePackages packages;
            private final Set packagesOutsideTabsUniqueIds;
            private final PurchasesType purchases;
            private final h2 selectedOfferEligibility$delegate;
            private final G selectedPackageByTab;
            private final h2 selectedPackageInfo$delegate;
            private final C0 selectedPackageUniqueId$delegate;
            private final A0 selectedTabIndex$delegate;
            private final SimpleSheetState sheet;
            private final boolean showPricesWithDecimals;
            private final ComponentStyle stack;
            private final ComponentStyle stickyFooter;
            private final String storefrontCountryCode;
            private final Map tabsByUniqueId;
            private final UiConfig.VariableConfig variableConfig;
            private final VariableDataProvider variableDataProvider;

            public Components(ComponentStyle stack, ComponentStyle componentStyle, BackgroundStyles background, boolean z, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, Offering offering, NonEmptySet locales, String str, a dateProvider, AvailablePackages packages, Map customVariables, Map defaultCustomVariables, e initialLocaleList, Integer num, SimpleSheetState initialSheetState, PurchasesType purchases) {
                Object obj;
                AvailablePackages.Info info;
                Object obj2;
                t.g(stack, "stack");
                t.g(background, "background");
                t.g(variableConfig, "variableConfig");
                t.g(variableDataProvider, "variableDataProvider");
                t.g(offering, "offering");
                t.g(locales, "locales");
                t.g(dateProvider, "dateProvider");
                t.g(packages, "packages");
                t.g(customVariables, "customVariables");
                t.g(defaultCustomVariables, "defaultCustomVariables");
                t.g(initialLocaleList, "initialLocaleList");
                t.g(initialSheetState, "initialSheetState");
                t.g(purchases, "purchases");
                this.stack = stack;
                this.stickyFooter = componentStyle;
                this.background = background;
                this.showPricesWithDecimals = z;
                this.variableConfig = variableConfig;
                this.variableDataProvider = variableDataProvider;
                this.offering = offering;
                this.locales = locales;
                this.storefrontCountryCode = str;
                this.dateProvider = dateProvider;
                this.packages = packages;
                this.customVariables = customVariables;
                this.defaultCustomVariables = defaultCustomVariables;
                this.purchases = purchases;
                this.mergedCustomVariables = S.r(defaultCustomVariables, customVariables);
                Iterator it = packages.getPackagesOutsideTabs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((AvailablePackages.Info) obj).isSelectedByDefault()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AvailablePackages.Info info2 = (AvailablePackages.Info) obj;
                this.initialSelectedPackageOutsideTabs = info2 != null ? info2.getUniqueId() : null;
                List packagesOutsideTabs = this.packages.getPackagesOutsideTabs();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = packagesOutsideTabs.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(((AvailablePackages.Info) it2.next()).getUniqueId());
                }
                this.packagesOutsideTabsUniqueIds = linkedHashSet;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : this.packages.getPackagesByTab().entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        String uniqueId = ((AvailablePackages.Info) it3.next()).getUniqueId();
                        linkedHashMap.put(uniqueId, Z.j((Set) linkedHashMap.getOrDefault(uniqueId, Y.b()), Integer.valueOf(intValue)));
                    }
                }
                this.tabsByUniqueId = linkedHashMap;
                this.localeId$delegate = U1.i(LocaleId.box-impl(toLocaleId-8pYHj4M(initialLocaleList)), (T1) null, 2, (Object) null);
                this.availableStorefrontCountryLocalesByLanguage$delegate = m.b(new PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2(this));
                this.locale$delegate = U1.c(new PaywallState$Loaded$Components$locale$2(this));
                this.currencyLocale$delegate = U1.c(new PaywallState$Loaded$Components$currencyLocale$2(this));
                G g = U1.g();
                Map packagesByTab = this.packages.getPackagesByTab();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(packagesByTab.size()));
                for (Map.Entry entry2 : packagesByTab.entrySet()) {
                    Object key = entry2.getKey();
                    Iterator it4 = ((List) entry2.getValue()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (((AvailablePackages.Info) obj2).isSelectedByDefault()) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    AvailablePackages.Info info3 = (AvailablePackages.Info) obj2;
                    linkedHashMap2.put(key, info3 != null ? info3.getUniqueId() : null);
                }
                g.putAll(linkedHashMap2);
                this.selectedPackageByTab = g;
                this.selectedTabIndex$delegate = J1.a(num != null ? num.intValue() : 0);
                String str2 = this.initialSelectedPackageOutsideTabs;
                if (str2 == null && (str2 = (String) g.get(Integer.valueOf(getSelectedTabIndex()))) == null) {
                    List list = (List) this.packages.getPackagesByTab().get(Integer.valueOf(getSelectedTabIndex()));
                    str2 = (list == null || (info = (AvailablePackages.Info) D.h0(list)) == null) ? null : info.getUniqueId();
                }
                this.initialSelectedPackageUniqueId = str2;
                this.selectedPackageUniqueId$delegate = U1.i(str2, (T1) null, 2, (Object) null);
                this.selectedPackageInfo$delegate = U1.c(new PaywallState$Loaded$Components$selectedPackageInfo$2(this));
                this.selectedOfferEligibility$delegate = U1.c(new PaywallState$Loaded$Components$selectedOfferEligibility$2(this));
                this.mostExpensivePricePerMonthMicros$delegate = U1.c(new PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2(this));
                this.actionInProgress$delegate = U1.i(Boolean.FALSE, (T1) null, 2, (Object) null);
                this.sheet = initialSheetState;
            }

            public static final /* synthetic */ AvailablePackages.Info access$findPackageInfoByUniqueId(Components components, String str) {
                return components.findPackageInfoByUniqueId(str);
            }

            public static final /* synthetic */ Map access$getAvailableStorefrontCountryLocalesByLanguage(Components components) {
                return components.getAvailableStorefrontCountryLocalesByLanguage();
            }

            public static final /* synthetic */ String access$getLocaleId-uqtKvyA(Components components) {
                return components.getLocaleId-uqtKvyA();
            }

            public static final /* synthetic */ AvailablePackages access$getPackages$p(Components components) {
                return components.packages;
            }

            public static final /* synthetic */ String access$getSelectedPackageUniqueId(Components components) {
                return components.getSelectedPackageUniqueId();
            }

            public static final /* synthetic */ String access$getStorefrontCountryCode$p(Components components) {
                return components.storefrontCountryCode;
            }

            public static final /* synthetic */ Long access$mostExpensivePricePerMonthMicros(Components components, List list) {
                return components.mostExpensivePricePerMonthMicros(list);
            }

            private final AvailablePackages.Info findPackageInfoByUniqueId(String str) {
                Object obj;
                Object obj2;
                Iterator it = this.packages.getPackagesOutsideTabs().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (t.c(((AvailablePackages.Info) obj2).getUniqueId(), str)) {
                        break;
                    }
                }
                AvailablePackages.Info info = (AvailablePackages.Info) obj2;
                if (info != null) {
                    return info;
                }
                Iterator it2 = w.A(this.packages.getPackagesByTab().values()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (t.c(((AvailablePackages.Info) next).getUniqueId(), str)) {
                        obj = next;
                        break;
                    }
                }
                return (AvailablePackages.Info) obj;
            }

            private final Map getAvailableStorefrontCountryLocalesByLanguage() {
                return (Map) this.availableStorefrontCountryLocalesByLanguage$delegate.getValue();
            }

            private final String getLocaleId-uqtKvyA() {
                return ((LocaleId) this.localeId$delegate.getValue()).unbox-impl();
            }

            private final String getSelectedPackageUniqueId() {
                return (String) this.selectedPackageUniqueId$delegate.getValue();
            }

            private final Long mostExpensivePricePerMonthMicros(List list) {
                Object next;
                Iterator it = r.A(r.z(D.W(list), PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$4.INSTANCE), PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5.INSTANCE).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long amountMicros = ((Price) next).getAmountMicros();
                        do {
                            Object next2 = it.next();
                            long amountMicros2 = ((Price) next2).getAmountMicros();
                            if (amountMicros < amountMicros2) {
                                next = next2;
                                amountMicros = amountMicros2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Price price = (Price) next;
                if (price != null) {
                    return Long.valueOf(price.getAmountMicros());
                }
                return null;
            }

            private final void setActionInProgress(boolean z) {
                this.actionInProgress$delegate.setValue(Boolean.valueOf(z));
            }

            private final void setLocaleId-_KYeFs0(String str) {
                this.localeId$delegate.setValue(LocaleId.box-impl(str));
            }

            private final void setSelectedPackageUniqueId(String str) {
                this.selectedPackageUniqueId$delegate.setValue(str);
            }

            private final void setSelectedTabIndex(int i) {
                this.selectedTabIndex$delegate.j(i);
            }

            private final String toLocaleId-8pYHj4M(e eVar) {
                String str;
                String preferredUILocaleOverride = this.purchases.getPreferredUILocaleOverride();
                ArrayList arrayList = new ArrayList(w.y(eVar, 10));
                Iterator it = eVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(LocaleId.box-impl(LocalizationKt.toLocaleId((d) it.next())));
                }
                Iterable w0 = D.w0(arrayList, this.locales.getHead());
                LocaleId localeId = null;
                if (preferredUILocaleOverride != null) {
                    try {
                        str = LocalizationKt.toLocaleId(LocalizationKt.toComposeLocale(LocaleHelpersKt.createLocaleFromString(preferredUILocaleOverride)));
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (str != null) {
                        w0 = D.v0(u.e(LocaleId.box-impl(str)), w0);
                    }
                }
                Iterator it2 = w0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str2 = LocalizationKt.getBestMatch-64pKzr8(this.locales, ((LocaleId) it2.next()).unbox-impl());
                    LocaleId localeId2 = str2 != null ? LocaleId.box-impl(str2) : null;
                    if (localeId2 != null) {
                        localeId = localeId2;
                        break;
                    }
                }
                if (localeId != null) {
                    return localeId.unbox-impl();
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }

            public static /* synthetic */ void update$default(Components components, LocaleList localeList, Integer num, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    localeList = null;
                }
                if ((i & 2) != 0) {
                    num = null;
                }
                if ((i & 4) != 0) {
                    bool = null;
                }
                components.update(localeList, num, bool);
            }

            public final boolean getActionInProgress() {
                return ((Boolean) this.actionInProgress$delegate.getValue()).booleanValue();
            }

            public final BackgroundStyles getBackground() {
                return this.background;
            }

            public final d getCurrencyLocale() {
                return (d) this.currencyLocale$delegate.getValue();
            }

            public final Date getCurrentDate() {
                return (Date) this.dateProvider.invoke();
            }

            public final Map getCustomVariables() {
                return this.customVariables;
            }

            public final Map getDefaultCustomVariables() {
                return this.defaultCustomVariables;
            }

            public final d getLocale() {
                return (d) this.locale$delegate.getValue();
            }

            public final Map getMergedCustomVariables() {
                return this.mergedCustomVariables;
            }

            public final Long getMostExpensivePricePerMonthMicros() {
                return (Long) this.mostExpensivePricePerMonthMicros$delegate.getValue();
            }

            public Offering getOffering() {
                return this.offering;
            }

            public final OfferEligibility getSelectedOfferEligibility() {
                return (OfferEligibility) this.selectedOfferEligibility$delegate.getValue();
            }

            public final SelectedPackageInfo getSelectedPackageInfo() {
                return (SelectedPackageInfo) this.selectedPackageInfo$delegate.getValue();
            }

            public final int getSelectedTabIndex() {
                return this.selectedTabIndex$delegate.getIntValue();
            }

            public final SimpleSheetState getSheet() {
                return this.sheet;
            }

            public final boolean getShowPricesWithDecimals() {
                return this.showPricesWithDecimals;
            }

            public final ComponentStyle getStack() {
                return this.stack;
            }

            public final ComponentStyle getStickyFooter() {
                return this.stickyFooter;
            }

            public final UiConfig.VariableConfig getVariableConfig() {
                return this.variableConfig;
            }

            public final VariableDataProvider getVariableDataProvider() {
                return this.variableDataProvider;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void resetToDefaultPackage() {
                /*
                    r3 = this;
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages r0 = r3.packages
                    java.util.Map r0 = r0.getPackagesByTab()
                    int r1 = r3.getSelectedTabIndex()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r0 = r0.get(r1)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 == 0) goto L39
                    java.util.Iterator r0 = r0.iterator()
                L1a:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2e
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages$Info r2 = (com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.AvailablePackages.Info) r2
                    boolean r2 = r2.isSelectedByDefault()
                    if (r2 == 0) goto L1a
                    goto L2f
                L2e:
                    r1 = 0
                L2f:
                    com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components$AvailablePackages$Info r1 = (com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.AvailablePackages.Info) r1
                    if (r1 == 0) goto L39
                    java.lang.String r0 = r1.getUniqueId()
                    if (r0 != 0) goto L4d
                L39:
                    java.lang.String r0 = r3.initialSelectedPackageOutsideTabs
                    if (r0 != 0) goto L4d
                    l0.G r0 = r3.selectedPackageByTab
                    int r1 = r3.getSelectedTabIndex()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                L4d:
                    r3.setSelectedPackageUniqueId(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components.resetToDefaultPackage():void");
            }

            public final void update(LocaleList localeList, Integer num, Boolean bool) {
                AvailablePackages.Info info;
                if (localeList != null) {
                    String languageTags = localeList.toLanguageTags();
                    t.f(languageTags, "localeList.toLanguageTags()");
                    setLocaleId-_KYeFs0(toLocaleId-8pYHj4M(new e(languageTags)));
                }
                if (num != null) {
                    setSelectedTabIndex(num.intValue());
                    if (getSelectedPackageUniqueId() != null && D.Y(this.packagesOutsideTabsUniqueIds, getSelectedPackageUniqueId())) {
                        return;
                    }
                    String str = (String) this.selectedPackageByTab.get(num);
                    if (str == null && (str = this.initialSelectedPackageOutsideTabs) == null) {
                        List list = (List) this.packages.getPackagesByTab().get(num);
                        if (list == null || (info = (AvailablePackages.Info) D.h0(list)) == null || (str = info.getUniqueId()) == null) {
                            str = null;
                        } else {
                            Logger.INSTANCE.w("Could not find default package for tab " + num + ". Using first package instead. This could be caused by not having any package marked as selected by default.");
                        }
                    }
                    setSelectedPackageUniqueId(str);
                }
                if (bool != null) {
                    setActionInProgress(bool.booleanValue());
                }
            }

            public static final class SelectedPackageInfo {
                public static final int $stable = 8;
                private final OfferEligibility offerEligibility;
                private final Package rcPackage;
                private final ResolvedOffer resolvedOffer;
                private final String uniqueId;

                public SelectedPackageInfo(Package rcPackage, ResolvedOffer resolvedOffer, String uniqueId, OfferEligibility offerEligibility) {
                    t.g(rcPackage, "rcPackage");
                    t.g(uniqueId, "uniqueId");
                    t.g(offerEligibility, "offerEligibility");
                    this.rcPackage = rcPackage;
                    this.resolvedOffer = resolvedOffer;
                    this.uniqueId = uniqueId;
                    this.offerEligibility = offerEligibility;
                }

                public static /* synthetic */ SelectedPackageInfo copy$default(SelectedPackageInfo selectedPackageInfo, Package r1, ResolvedOffer resolvedOffer, String str, OfferEligibility offerEligibility, int i, Object obj) {
                    if ((i & 1) != 0) {
                        r1 = selectedPackageInfo.rcPackage;
                    }
                    if ((i & 2) != 0) {
                        resolvedOffer = selectedPackageInfo.resolvedOffer;
                    }
                    if ((i & 4) != 0) {
                        str = selectedPackageInfo.uniqueId;
                    }
                    if ((i & 8) != 0) {
                        offerEligibility = selectedPackageInfo.offerEligibility;
                    }
                    return selectedPackageInfo.copy(r1, resolvedOffer, str, offerEligibility);
                }

                public final Package component1() {
                    return this.rcPackage;
                }

                public final ResolvedOffer component2() {
                    return this.resolvedOffer;
                }

                public final String component3() {
                    return this.uniqueId;
                }

                public final OfferEligibility component4() {
                    return this.offerEligibility;
                }

                public final SelectedPackageInfo copy(Package rcPackage, ResolvedOffer resolvedOffer, String uniqueId, OfferEligibility offerEligibility) {
                    t.g(rcPackage, "rcPackage");
                    t.g(uniqueId, "uniqueId");
                    t.g(offerEligibility, "offerEligibility");
                    return new SelectedPackageInfo(rcPackage, resolvedOffer, uniqueId, offerEligibility);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SelectedPackageInfo)) {
                        return false;
                    }
                    SelectedPackageInfo selectedPackageInfo = (SelectedPackageInfo) obj;
                    return t.c(this.rcPackage, selectedPackageInfo.rcPackage) && t.c(this.resolvedOffer, selectedPackageInfo.resolvedOffer) && t.c(this.uniqueId, selectedPackageInfo.uniqueId) && t.c(this.offerEligibility, selectedPackageInfo.offerEligibility);
                }

                public final OfferEligibility getOfferEligibility() {
                    return this.offerEligibility;
                }

                public final Package getRcPackage() {
                    return this.rcPackage;
                }

                public final ResolvedOffer getResolvedOffer() {
                    return this.resolvedOffer;
                }

                public final String getUniqueId() {
                    return this.uniqueId;
                }

                public int hashCode() {
                    int hashCode = this.rcPackage.hashCode() * 31;
                    ResolvedOffer resolvedOffer = this.resolvedOffer;
                    return ((((hashCode + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31) + this.uniqueId.hashCode()) * 31) + this.offerEligibility.hashCode();
                }

                public String toString() {
                    return "SelectedPackageInfo(rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", uniqueId=" + this.uniqueId + ", offerEligibility=" + this.offerEligibility + ')';
                }

                public /* synthetic */ SelectedPackageInfo(Package r1, ResolvedOffer resolvedOffer, String str, OfferEligibility offerEligibility, int i, k kVar) {
                    this(r1, (i & 2) != 0 ? null : resolvedOffer, str, offerEligibility);
                }
            }

            public static final class AvailablePackages {
                public static final int $stable = 8;
                private final Map packagesByTab;
                private final List packagesOutsideTabs;

                public AvailablePackages(List packagesOutsideTabs, Map packagesByTab) {
                    t.g(packagesOutsideTabs, "packagesOutsideTabs");
                    t.g(packagesByTab, "packagesByTab");
                    this.packagesOutsideTabs = packagesOutsideTabs;
                    this.packagesByTab = packagesByTab;
                }

                public static /* synthetic */ AvailablePackages copy$default(AvailablePackages availablePackages, List list, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = availablePackages.packagesOutsideTabs;
                    }
                    if ((i & 2) != 0) {
                        map = availablePackages.packagesByTab;
                    }
                    return availablePackages.copy(list, map);
                }

                public final List component1() {
                    return this.packagesOutsideTabs;
                }

                public final Map component2() {
                    return this.packagesByTab;
                }

                public final AvailablePackages copy(List packagesOutsideTabs, Map packagesByTab) {
                    t.g(packagesOutsideTabs, "packagesOutsideTabs");
                    t.g(packagesByTab, "packagesByTab");
                    return new AvailablePackages(packagesOutsideTabs, packagesByTab);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AvailablePackages)) {
                        return false;
                    }
                    AvailablePackages availablePackages = (AvailablePackages) obj;
                    return t.c(this.packagesOutsideTabs, availablePackages.packagesOutsideTabs) && t.c(this.packagesByTab, availablePackages.packagesByTab);
                }

                public final boolean getHasAnyPackages() {
                    return (this.packagesOutsideTabs.isEmpty() && this.packagesByTab.isEmpty()) ? false : true;
                }

                public final Map getPackagesByTab() {
                    return this.packagesByTab;
                }

                public final List getPackagesOutsideTabs() {
                    return this.packagesOutsideTabs;
                }

                public int hashCode() {
                    return (this.packagesOutsideTabs.hashCode() * 31) + this.packagesByTab.hashCode();
                }

                public final AvailablePackages merge(AvailablePackages availablePackages) {
                    List list = this.packagesOutsideTabs;
                    List list2 = availablePackages != null ? availablePackages.packagesOutsideTabs : null;
                    if (list2 == null) {
                        list2 = v.n();
                    }
                    List v0 = D.v0(list, list2);
                    Map map = this.packagesByTab;
                    if (map.isEmpty()) {
                        Map map2 = availablePackages != null ? availablePackages.packagesByTab : null;
                        map = map2 == null ? S.h() : map2;
                    }
                    return new AvailablePackages(v0, map);
                }

                public String toString() {
                    return "AvailablePackages(packagesOutsideTabs=" + this.packagesOutsideTabs + ", packagesByTab=" + this.packagesByTab + ')';
                }

                public static final class Info {
                    public static final int $stable = 8;
                    private final boolean isSelectedByDefault;
                    private final Package pkg;
                    private final ResolvedOffer resolvedOffer;
                    private final String uniqueId;

                    public Info(Package pkg, boolean z, ResolvedOffer resolvedOffer) {
                        String identifier;
                        SubscriptionOption option;
                        t.g(pkg, "pkg");
                        this.pkg = pkg;
                        this.isSelectedByDefault = z;
                        this.resolvedOffer = resolvedOffer;
                        String str = null;
                        ResolvedOffer.ConfiguredOffer configuredOffer = resolvedOffer instanceof ResolvedOffer.ConfiguredOffer ? (ResolvedOffer.ConfiguredOffer) resolvedOffer : null;
                        if (configuredOffer != null && (option = configuredOffer.getOption()) != null) {
                            str = option.getId();
                        }
                        if (str != null) {
                            identifier = pkg.getIdentifier() + ':' + str;
                        } else {
                            identifier = pkg.getIdentifier();
                        }
                        this.uniqueId = identifier;
                    }

                    public static /* synthetic */ Info copy$default(Info info, Package r1, boolean z, ResolvedOffer resolvedOffer, int i, Object obj) {
                        if ((i & 1) != 0) {
                            r1 = info.pkg;
                        }
                        if ((i & 2) != 0) {
                            z = info.isSelectedByDefault;
                        }
                        if ((i & 4) != 0) {
                            resolvedOffer = info.resolvedOffer;
                        }
                        return info.copy(r1, z, resolvedOffer);
                    }

                    public final Package component1() {
                        return this.pkg;
                    }

                    public final boolean component2() {
                        return this.isSelectedByDefault;
                    }

                    public final ResolvedOffer component3() {
                        return this.resolvedOffer;
                    }

                    public final Info copy(Package pkg, boolean z, ResolvedOffer resolvedOffer) {
                        t.g(pkg, "pkg");
                        return new Info(pkg, z, resolvedOffer);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Info)) {
                            return false;
                        }
                        Info info = (Info) obj;
                        return t.c(this.pkg, info.pkg) && this.isSelectedByDefault == info.isSelectedByDefault && t.c(this.resolvedOffer, info.resolvedOffer);
                    }

                    public final Package getPkg() {
                        return this.pkg;
                    }

                    public final ResolvedOffer getResolvedOffer() {
                        return this.resolvedOffer;
                    }

                    public final String getUniqueId() {
                        return this.uniqueId;
                    }

                    public int hashCode() {
                        int hashCode = ((this.pkg.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31;
                        ResolvedOffer resolvedOffer = this.resolvedOffer;
                        return hashCode + (resolvedOffer == null ? 0 : resolvedOffer.hashCode());
                    }

                    public final boolean isSelectedByDefault() {
                        return this.isSelectedByDefault;
                    }

                    public String toString() {
                        return "Info(pkg=" + this.pkg + ", isSelectedByDefault=" + this.isSelectedByDefault + ", resolvedOffer=" + this.resolvedOffer + ')';
                    }

                    public /* synthetic */ Info(Package r1, boolean z, ResolvedOffer resolvedOffer, int i, k kVar) {
                        this(r1, z, (i & 4) != 0 ? null : resolvedOffer);
                    }
                }
            }

            public final void update(String selectedPackageUniqueId) {
                t.g(selectedPackageUniqueId, "selectedPackageUniqueId");
                setSelectedPackageUniqueId(selectedPackageUniqueId);
                int selectedTabIndex = getSelectedTabIndex();
                Set set = (Set) this.tabsByUniqueId.get(selectedPackageUniqueId);
                if (set == null || !set.contains(Integer.valueOf(selectedTabIndex))) {
                    return;
                }
                this.selectedPackageByTab.put(Integer.valueOf(selectedTabIndex), selectedPackageUniqueId);
            }

            public /* synthetic */ Components(ComponentStyle componentStyle, ComponentStyle componentStyle2, BackgroundStyles backgroundStyles, boolean z, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, Offering offering, NonEmptySet nonEmptySet, String str, a aVar, AvailablePackages availablePackages, Map map, Map map2, e eVar, Integer num, SimpleSheetState simpleSheetState, PurchasesType purchasesType, int i, k kVar) {
                this(componentStyle, componentStyle2, backgroundStyles, z, variableConfig, variableDataProvider, offering, nonEmptySet, str, aVar, availablePackages, (i & 2048) != 0 ? S.h() : map, (i & 4096) != 0 ? S.h() : map2, (i & 8192) != 0 ? e.c.a() : eVar, (i & 16384) != 0 ? null : num, (i & 32768) != 0 ? new SimpleSheetState() : simpleSheetState, purchasesType);
            }
        }

        public static final class Legacy implements Loaded {
            public static final int $stable = 0;
            private final Offering offering;
            private final C0 selectedPackage;
            private final boolean shouldDisplayDismissButton;
            private final TemplateConfiguration templateConfiguration;
            private final PaywallWarning validationWarning;

            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, C0 selectedPackage, boolean z, PaywallWarning paywallWarning) {
                t.g(offering, "offering");
                t.g(templateConfiguration, "templateConfiguration");
                t.g(selectedPackage, "selectedPackage");
                this.offering = offering;
                this.templateConfiguration = templateConfiguration;
                this.selectedPackage = selectedPackage;
                this.shouldDisplayDismissButton = z;
                this.validationWarning = paywallWarning;
            }

            public static /* synthetic */ Legacy copy$default(Legacy legacy, Offering offering, TemplateConfiguration templateConfiguration, C0 c0, boolean z, PaywallWarning paywallWarning, int i, Object obj) {
                if ((i & 1) != 0) {
                    offering = legacy.offering;
                }
                if ((i & 2) != 0) {
                    templateConfiguration = legacy.templateConfiguration;
                }
                TemplateConfiguration templateConfiguration2 = templateConfiguration;
                if ((i & 4) != 0) {
                    c0 = legacy.selectedPackage;
                }
                C0 c02 = c0;
                if ((i & 8) != 0) {
                    z = legacy.shouldDisplayDismissButton;
                }
                boolean z2 = z;
                if ((i & 16) != 0) {
                    paywallWarning = legacy.validationWarning;
                }
                return legacy.copy(offering, templateConfiguration2, c02, z2, paywallWarning);
            }

            public final Offering component1() {
                return this.offering;
            }

            public final TemplateConfiguration component2() {
                return this.templateConfiguration;
            }

            public final C0 component3() {
                return this.selectedPackage;
            }

            public final boolean component4() {
                return this.shouldDisplayDismissButton;
            }

            public final PaywallWarning component5() {
                return this.validationWarning;
            }

            public final Legacy copy(Offering offering, TemplateConfiguration templateConfiguration, C0 selectedPackage, boolean z, PaywallWarning paywallWarning) {
                t.g(offering, "offering");
                t.g(templateConfiguration, "templateConfiguration");
                t.g(selectedPackage, "selectedPackage");
                return new Legacy(offering, templateConfiguration, selectedPackage, z, paywallWarning);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) obj;
                return t.c(this.offering, legacy.offering) && t.c(this.templateConfiguration, legacy.templateConfiguration) && t.c(this.selectedPackage, legacy.selectedPackage) && this.shouldDisplayDismissButton == legacy.shouldDisplayDismissButton && t.c(this.validationWarning, legacy.validationWarning);
            }

            public Offering getOffering() {
                return this.offering;
            }

            public final C0 getSelectedPackage() {
                return this.selectedPackage;
            }

            public final boolean getShouldDisplayDismissButton() {
                return this.shouldDisplayDismissButton;
            }

            public final TemplateConfiguration getTemplateConfiguration() {
                return this.templateConfiguration;
            }

            public final PaywallWarning getValidationWarning() {
                return this.validationWarning;
            }

            public int hashCode() {
                int hashCode = ((((((this.offering.hashCode() * 31) + this.templateConfiguration.hashCode()) * 31) + this.selectedPackage.hashCode()) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31;
                PaywallWarning paywallWarning = this.validationWarning;
                return hashCode + (paywallWarning == null ? 0 : paywallWarning.hashCode());
            }

            public final void selectPackage(TemplateConfiguration.PackageInfo packageInfo) {
                t.g(packageInfo, "packageInfo");
                this.selectedPackage.setValue(packageInfo);
            }

            public String toString() {
                return "Legacy(offering=" + this.offering + ", templateConfiguration=" + this.templateConfiguration + ", selectedPackage=" + this.selectedPackage + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", validationWarning=" + this.validationWarning + ')';
            }

            public /* synthetic */ Legacy(Offering offering, TemplateConfiguration templateConfiguration, C0 c0, boolean z, PaywallWarning paywallWarning, int i, k kVar) {
                this(offering, templateConfiguration, c0, z, (i & 16) != 0 ? null : paywallWarning);
            }

            public /* synthetic */ Legacy(Offering offering, TemplateConfiguration templateConfiguration, TemplateConfiguration.PackageInfo packageInfo, boolean z, PaywallWarning paywallWarning, int i, k kVar) {
                this(offering, templateConfiguration, packageInfo, z, (i & 16) != 0 ? null : paywallWarning);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Legacy(Offering offering, TemplateConfiguration templateConfiguration, TemplateConfiguration.PackageInfo selectedPackage, boolean z, PaywallWarning paywallWarning) {
                this(offering, templateConfiguration, U1.i(selectedPackage, (T1) null, 2, (Object) null), z, paywallWarning);
                t.g(offering, "offering");
                t.g(templateConfiguration, "templateConfiguration");
                t.g(selectedPackage, "selectedPackage");
            }
        }
    }
}
